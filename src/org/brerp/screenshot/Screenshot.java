/**********************************************************************
* This file is part of iDempiere ERP Bazaar                           *
* http://www.adempiere.org                                            *
*                                                                     *
* Copyright (C) Redhuan D. Oon                         				  *
* Copyright (C) Contributors                                          *
*                                                                     *
* This program is free software, you can redistribute it and/or       *
* modify it under the terms of the GNU General Public License         *
* as published by the Free Software Foundation, either version 2      *
* of the License, or (at your option) any later version.              *
*                                                                     *
* This program is distributed in the hope that it will be useful,     *
* but WITHOUT ANY WARRANTY, without even the implied warranty of      *
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
* GNU General Public License for more details.                        *
*                                                                     *
* You should have received a copy of the GNU General Public License   *
* along with this program, if not, write to the Free Software         *
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
* MA 02110-1301, USA.                                                 *
*                                                                     *
**********************************************************************/

package org.brerp.screenshot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MForm;
import org.compiere.model.MInfoWindow;
import org.compiere.model.MMenu;
import org.compiere.model.MProcess;
import org.compiere.model.MTask;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.wf.MWorkflow;
import org.json.JSONException;

/**
 * @author Redhuan D. Oon
 * @sponsor Zeeshan, SYSNOVA, Bangladesh Based on ModelGenerator of the
 *          Compiere, ADempiere and iDempiere projects
 */
public class Screenshot {

	private static final CLogger log = CLogger.getCLogger(Screenshot.class);

	private static Selenium prtScr = new Selenium();

	private static void takeScreenshot(String searchName, String type) {
		takeScreenshot(searchName, type, false);
	}

	private static final List<RetryItem> retryList = new ArrayList<>();

	private static void takeScreenshot(String searchName, String type, boolean system) {
		log.setLevel(Level.ALL);

		String fileName = getFileName(searchName, type);
		prtScr.closeButton();

		try {
			prtScr.openWindow(searchName);
		} catch (Exception e) {
			if (!system) {
				log.severe("Agendanda nova tentativa de screenshot na System para a janela: '" + searchName
						+ "' devido falha ao abrir janela.");
				retryList.add(new RetryItem(searchName, type, fileName));
			}
			return;
		}

		File imagem = prtScr.printScreen(fileName);

		if (imagem == null || !imagem.exists()) {
			log.warning("Screenshot não capturada ou não salva: '" + searchName + "'.");

			if (!system) {
				log.severe("Agendanda nova tentativa de screenshot na System para a janela: '" + searchName
						+ "' devido falha ao salvar imagem.");
				retryList.add(new RetryItem(searchName, type, fileName));
			}
			return;
		}

		try {
			File outputDir = new File(Selenium.outputDir);
			if (!outputDir.exists()) {
				outputDir.mkdirs();
			}

			File destino = new File(fileName);

			log.info("Screenshot salva: " + destino.getAbsolutePath());
		} catch (Exception e) {
			log.severe("Falha ao salvar screenshot para '" + searchName + "': " + e.getMessage());
		}
	}

	/**
	 * Executa todas as tentativas pendentes na `retryList` com `system=true`
	 */
	public static void processRetryQueue() {
		if (retryList.isEmpty())
			return;

		try {
			prtScr.quit();
			prtScr.setUp();
			prtScr.login(true);
			synchronized (prtScr) {
				prtScr.wait(500);
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "Erro ao reiniciar WebDriver para tirar as screenshots na System: ", e);
		}

		for (RetryItem item : retryList) {
			try {
				System.out.println("Tentando abrir a janela: '" + item.searchName + "' novamente.");
				takeScreenshot(item.searchName, item.type, true);
			} catch (Exception e) {
				log.severe("Falha final ao abrir novamente a janela: '" + item.searchName + "'.");
			}
		}

		logRetryListToFile();
		retryList.clear();
	}

	private static class RetryItem {
		String searchName;
		String type;
		String fileName;

		RetryItem(String searchName, String type, String fileName) {
			this.searchName = searchName;
			this.type = type;
			this.fileName = fileName;
		}
	}

	/**
	 * @param winItem
	 * @throws JSONException
	 */
	public static void generateScreenshots(int menuLimit) throws JSONException {

		try {
			prtScr.setUp();
			prtScr.login(false);
			Thread.sleep(5000);
		} catch (Exception e) {
			log.log(Level.SEVERE, "Erro ao gerar screenshots ", e);
		}

		Language tmp = Selenium.language;
		Language language = new Language(tmp.getName(), tmp.getAD_Language(), tmp.getLocale(), tmp.isDecimalPoint(),
				tmp.getDateFormat().toPattern(), tmp.getMediaSize());
		Env.verifyLanguage(Env.getCtx(), language);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		Env.setContext(Env.getCtx(), "#Locale", language.getLocale().toString());

		List<MMenu> menu = new Query(Env.getCtx(), MMenu.Table_Name, null, null).setOnlyActiveRecords(true)
				.setOrderBy(MMenu.COLUMNNAME_Action + "," + MMenu.COLUMNNAME_Name).list();

		// limita itens do menu que serão executados
		List<MMenu> menuToProcess = (menuLimit > 0 && menuLimit < menu.size()) ? menu.subList(0, menuLimit) : menu;

		for (MMenu item : menuToProcess) {
			if (item.getAction() == null)
				continue;

			switch (item.getAction()) {
			case MMenu.ACTION_WorkFlow:
				MWorkflow wf = new Query(Env.getCtx(), MWorkflow.Table_Name,
						MWorkflow.COLUMNNAME_AD_Workflow_ID + "= ?", null).setParameters(item.getAD_Workflow_ID())
						.first();
				takeScreenshot(wf.get_Translation(MWorkflow.COLUMNNAME_Name), "Workflow");
				break;
			case MMenu.ACTION_Process:
			case MMenu.ACTION_Report:
				MProcess process = new Query(Env.getCtx(), MProcess.Table_Name,
						MProcess.COLUMNNAME_AD_Process_ID + "=?", null).setParameters(item.getAD_Process_ID()).first();
				takeScreenshot(process.get_Translation(MProcess.COLUMNNAME_Name),
						item.getAction().equals(MMenu.ACTION_Process) ? "Process" : "Report");
				break;
			case MMenu.ACTION_Window:
				MWindow win = new Query(Env.getCtx(), MWindow.Table_Name, MWindow.COLUMNNAME_AD_Window_ID + " = ?",
						null).setParameters(item.getAD_Window_ID()).first();
				takeScreenshot(win.get_Translation(MWindow.COLUMNNAME_Name), "Window");
				break;
			case MMenu.ACTION_Form:
				MForm form = new Query(Env.getCtx(), MForm.Table_Name, MForm.COLUMNNAME_AD_Form_ID + "=?", null)
						.setParameters(item.getAD_Form_ID()).first();
				takeScreenshot(form.get_Translation(MForm.COLUMNNAME_Name), "Form");
				break;
			case MMenu.ACTION_Task:
				MTask task = new Query(Env.getCtx(), MTask.Table_Name, MTask.COLUMNNAME_AD_Task_ID + "=?", null)
						.setParameters(item.getAD_Task_ID()).first();
				takeScreenshot(task.get_Translation(MTask.COLUMNNAME_Name), "Task");
				break;
			}
		}

		// get all Info Windows independently
		List<MInfoWindow> infos = new Query(Env.getCtx(), MInfoWindow.Table_Name, "", null).list();
		List<MInfoWindow> infosLimit = (menuLimit > 0 && menuLimit < infos.size()) ? infos.subList(0, menuLimit)
				: infos;

		for (MInfoWindow info : infosLimit) {
			takeScreenshot(info.get_Translation(MInfoWindow.COLUMNNAME_Name), "Info");
		}

		processRetryQueue();

		prtScr.quit();
	}

	public static void logRetryListToFile() {

		String timestamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String logFileName = timestamp + "_retryList.log";
		String logFilePath = Selenium.outputDir + logFileName;

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath))) {
			if (retryList.isEmpty()) {
				writer.write("Sem itens na lista de retry.");
				writer.newLine();
				System.out.println("Finalizado sem nenhum item na lista de retry.");
				return;
			}

			for (RetryItem item : retryList) {
				writer.write("Nome: " + item.searchName + " | Tipo: " + item.type + " | Arquivo: " + item.fileName);
				writer.newLine();
			}

			System.out.println("Itens da lista de retry foram armazenados no arquivo: " + logFilePath);
		} catch (IOException e) {
			System.err.println("Erro ao gerar o arquivo de log: " + e.getMessage());
		}
	}

	private static String getFileName(String searchName, String type) {
		String windowName = RemoverAcentos.remover(searchName);
		return Selenium.outputDir + windowName + "-" + type + Selenium.systemName + Selenium.version + ".png";
	}

}
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

	private static final List<FailedItem> retryList = new ArrayList<>();
	private static final List<FailedItem> stillFailedList = new ArrayList<>();

	private static void takeScreenshot(String searchName, String type, boolean system) {
		log.setLevel(Level.ALL);

		String fileName = getFileName(searchName, type);
		prtScr.closeButton();

		try {
			prtScr.openWindow(searchName);
		} catch (Exception e) {
			handleFailedScreenshot(searchName, type, fileName, system);
			return;
		}

		File imagem = prtScr.printScreen(fileName);

		if (imagem == null || !imagem.exists()) {
			handleFailedScreenshot(searchName, type, fileName, system);
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
			handleFailedScreenshot(searchName, type, fileName, system);
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
			Thread.sleep(15000);
			synchronized (prtScr) {
				prtScr.wait(500);
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "Erro ao reiniciar WebDriver para tirar as screenshots na System: ", e);
		}

		for (FailedItem item : retryList) {
			try {
				System.out.println("Tentando abrir a janela: '" + item.searchName + "' novamente.");
				takeScreenshot(item.searchName, item.type, true);
			} catch (Exception e) {
				handleFailedScreenshot(item.searchName, item.type, item.fileName, true);
			}
		}

		logRetryListToFile();
		retryList.clear();
		stillFailedList.clear();
		try {
			prtScr.quit();
		} catch (Exception e) {
			log.log(Level.SEVERE, "Erro ao fechar WebDriver: ", e);
		}
	}

	private static boolean handleFailedScreenshot(String searchName, String type, String fileName, boolean system) {

		if (!system) {
			log.severe("Screenshot falhou ao ser capturada e/ou salva: '" + searchName
					+ "'. Agendanda nova tentativa na System.");
			retryList.add(new FailedItem(searchName, type, fileName));
		} else {
			log.severe("Falha final ao abrir novamente a janela: '" + searchName + "'.");
			stillFailedList.add(new FailedItem(searchName, type, fileName));
		}

		return false;

	}

	private static class FailedItem {
		String searchName;
		String type;
		String fileName;

		FailedItem(String searchName, String type, String fileName) {
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
			Thread.sleep(15000);
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
		
		// Se for diferente de 0, não salvará screenshots de InfoWindow.
		if (menuLimit != 0) {
			// get all Info Windows independently
			List<MInfoWindow> infos = new Query(Env.getCtx(), MInfoWindow.Table_Name, "", null).list();
			
			for (MInfoWindow info : infos) {
				takeScreenshot(info.get_Translation(MInfoWindow.COLUMNNAME_Name), "Info");
			}
		}

		try {
			processRetryQueue();
		} catch (Exception e) {
			log.log(Level.SEVERE, "Erro ao processar a fila de retry: ", e);
		} finally {
			prtScr.quit();
		}

	}

	public static void logRetryListToFile() {

		String timestamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String logFileName = timestamp + "_retryList.md";
		String logFilePath = Selenium.outputDir + logFileName;

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath))) {
			if (stillFailedList.isEmpty()) {
				writer.write("Finalizado sem nenhum item com falha na screenshot.");
				writer.newLine();
				System.out.println("Finalizado sem nenhum item com falha na screenshot.");
				return;
			}

			writer.write("| **Nome da Janela** | **Tipo** | **Caminho do Arquivo** |");
			writer.newLine();
			writer.write("|:---|:---|:---|");
			writer.newLine();
			for (FailedItem item : stillFailedList) {
				writer.write("| " + item.searchName + " | " + item.type + " | " + item.fileName + " |");
				writer.newLine();
			}

			System.out.println(stillFailedList.size() + " itens da lista de retry foram armazenados no arquivo: "
					+ logFilePath + " com sucesso.");
		} catch (IOException e) {
			System.err.println("Erro ao gerar o arquivo com relação de falhas nas screenshots: " + e.getMessage());
		}
	}

	private static String getFileName(String searchName, String type) {
		String windowName = RemoverAcentos.remover(searchName);
		return Selenium.outputDir + windowName + "-" + type + Selenium.systemName + Selenium.version + ".png";
	}

}
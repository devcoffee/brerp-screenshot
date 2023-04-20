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

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.compiere.model.MForm;
import org.compiere.model.MInfoWindow;
import org.compiere.model.MMenu;
import org.compiere.model.MProcess;
import org.compiere.model.MTask;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.wf.MWorkflow;
import org.json.JSONException;
import org.openqa.selenium.io.FileHandler;

/**
 * @author Redhuan D. Oon
 * @sponsor Zeeshan, SYSNOVA, Bangladesh Based on ModelGenerator of the
 *          Compiere, ADempiere and iDempiere projects
 */
public class Screenshot {

	private static Selenium prtScr = new Selenium();

	private static void takeScreenshot(String searchName, String type) {
		takeScreenshot(searchName, type, false);
	}

	private static void takeScreenshot(String searchName, String type, boolean system) {
		String windowName = RemoverAcentos.remover(searchName);
		windowName = windowName.replace(" ", "");

		prtScr.closeHellButton();

		try {
			prtScr.openWindow(searchName);
		} catch (Exception e) {
			prtScr.quit();
			try {
				prtScr.setUp();
				prtScr.login(system);
				Thread.sleep(500);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			prtScr.openWindow(searchName);
		}

		File imagem = prtScr.printarTela();

		if (imagem != null) {
			try {
				FileHandler.copy(imagem, new File(
						Selenium.outputDir + windowName + "-" + type + "_BrERP_v" + Selenium.version + ".png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else {
			takeScreenshot(searchName, type, !system);
		}
	}

	/**
	 * @param sourceFolder
	 * @param winItem
	 * @param tabItem
	 * @param tableLike
	 * @throws JSONException
	 */
	public static void generateSource(String sourceFolder, String winItem, String tabItem, boolean $isPrtScr)
			throws JSONException {

		try {
			prtScr.setUp();
			prtScr.login(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Language tmp = Language.getLanguage("pt_BR");
		Language language = new Language(tmp.getName(), tmp.getAD_Language(), tmp.getLocale(), tmp.isDecimalPoint(),
				tmp.getDateFormat().toPattern(), tmp.getMediaSize());
		Env.verifyLanguage(Env.getCtx(), language);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		Env.setContext(Env.getCtx(), "#Locale", language.getLocale().toString());

		List<MMenu> menu = new Query(Env.getCtx(), MMenu.Table_Name, "", null).setOnlyActiveRecords(true)
				.setOrderBy(MMenu.COLUMNNAME_Action + "," + MMenu.COLUMNNAME_Name).list();
		for (MMenu item : menu) {
			if (item.getAction() == null)
				continue;
			if (item.getAction().equals(MMenu.ACTION_WorkFlow)) { // Workflow
				MWorkflow wf = new Query(Env.getCtx(), MWorkflow.Table_Name,
						MWorkflow.COLUMNNAME_AD_Workflow_ID + "= ?", null).setParameters(item.getAD_Workflow_ID())
						.first();
				takeScreenshot(wf.get_Translation(MWorkflow.COLUMNNAME_Name), "Workflow");
			} else if (item.getAction().equals(MMenu.ACTION_Process)) {
				// Process or Report
				MProcess process = new Query(Env.getCtx(), MProcess.Table_Name,
						MProcess.COLUMNNAME_AD_Process_ID + "=?", null).setParameters(item.getAD_Process_ID()).first();
				takeScreenshot(process.get_Translation(MProcess.COLUMNNAME_Name), "Process");
			} else if (item.getAction().equals(MMenu.ACTION_Report)) {
				// Process or Report
				MProcess process = new Query(Env.getCtx(), MProcess.Table_Name,
						MProcess.COLUMNNAME_AD_Process_ID + "=?", null).setParameters(item.getAD_Process_ID()).first();
				takeScreenshot(process.get_Translation(MProcess.COLUMNNAME_Name), "Report");
			} else if (item.getAction().equals(MMenu.ACTION_Window)) {
				// Window
				MWindow win = new Query(Env.getCtx(), MWindow.Table_Name, MWindow.COLUMNNAME_AD_Window_ID + " = ?",
						null).setParameters(item.getAD_Window_ID()).first();
				takeScreenshot(win.get_Translation(MWindow.COLUMNNAME_Name), "Window");
			} else if (item.getAction().equals(MMenu.ACTION_Form)) {
				MForm form = new Query(Env.getCtx(), MForm.Table_Name, MForm.COLUMNNAME_AD_Form_ID + "=?", null)
						.setParameters(item.getAD_Form_ID()).first();
				takeScreenshot(form.get_Translation(MForm.COLUMNNAME_Name), "Form");
			} else if (item.getAction().equals(MMenu.ACTION_Task)) {
				MTask task = new Query(Env.getCtx(), MTask.Table_Name, MTask.COLUMNNAME_AD_Task_ID + "=?", null)
						.setParameters(item.getAD_Task_ID()).first();
				takeScreenshot(task.get_Translation(MTask.COLUMNNAME_Name), "Task");
			}
		}

		// get all Info Windows independently
		List<MInfoWindow> infos = new Query(Env.getCtx(), MInfoWindow.Table_Name, "", null).list();
		for (MInfoWindow info : infos) {
			takeScreenshot(info.get_Translation(MInfoWindow.COLUMNNAME_Name), "Info");
		}

		prtScr.quit();

	}

}
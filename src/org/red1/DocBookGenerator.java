/**********************************************************************
* This file is part of iDempiere ERP Bazaar                           *
* http://www.adempiere.org                                            *
*                                                                     *
* Copyright (C) Redhuan D. Oon                          *
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

package org.red1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.I_AD_ReportView;
import org.compiere.model.MColumn;
import org.compiere.model.MField;
import org.compiere.model.MForm;
import org.compiere.model.MInfoColumn;
import org.compiere.model.MInfoWindow;
import org.compiere.model.MMenu;
import org.compiere.model.MProcess;
import org.compiere.model.MProcessPara;
import org.compiere.model.MRefList;
import org.compiere.model.MTab;
import org.compiere.model.MTable;
import org.compiere.model.MValRule;
import org.compiere.model.MWindow;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.wf.MWFNextCondition;
import org.compiere.wf.MWFNode;
import org.compiere.wf.MWFNodeNext;
import org.compiere.wf.MWorkflow;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Redhuan D. Oon
 *  @sponsor Zeeshan, SYSNOVA, Bangladesh
 *	Based on ModelGenerator of the Compiere, ADempiere and iDempiere projects
 */

public class DocBookGenerator {
	public static final String NL = "\n";

	/** File Header			*/
	public static final String XMLBegin =
		 "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+NL
			+"<!DOCTYPE article PUBLIC \"-//OASIS//DTD DocBook XML V4.5//EN\" \"../docbook-xml-4.5/docbookx.dtd\">"+NL;

	/** Logger */
	private static CLogger log = CLogger.getCLogger(DocBookGenerator.class);

	private static JSONObject docJSON = new JSONObject();
	private static JSONObject menuJanelasJSON = new JSONObject();
	private static JSONObject menuRelatoriosJSON = new JSONObject();
	private static JSONObject menuProcessosJSON = new JSONObject();
	private static JSONObject menuWorkflowJSON = new JSONObject();
	private static JSONObject menuFormularioJSON = new JSONObject();
	private static JSONObject menuInfoPanelJSON = new JSONObject();
	private static JSONArray menuJanelasArray = new JSONArray();
	private static JSONArray menuRelatoriosArray = new JSONArray();
	private static JSONArray menuProcessosArray = new JSONArray();
	private static JSONArray menuWorkflowArray = new JSONArray();
	private static JSONArray menuFormularioArray = new JSONArray();
	private static JSONArray menuInfoPanelArray = new JSONArray();


	private static StringBuilder menuHTML = new StringBuilder("<ul> \n");
	private static StringBuilder menuJanelas = new StringBuilder("<ul> \n");
	private static StringBuilder menuProcessos = new StringBuilder("<ul> \n");
	private static StringBuilder menuRelatorios = new StringBuilder("<ul> \n");
	private static StringBuilder menuWorkFlow = new StringBuilder("<ul> \n");
	private static StringBuilder menuFormulario = new StringBuilder("<ul> \n");
	private static StringBuilder menuInfoPane = new StringBuilder("<ul> \n");




	private static int started = 0;

	private static StringBuilder folder;

	private String windowName;
	private String tabName;

	public DocBookGenerator(int AD_Tab_ID, String directory, String winName) {
 		MWindow window = new Query(Env.getCtx(), MWindow.Table_Name,MWindow.COLUMNNAME_Name+"=?",null)
		.setParameters(winName)
		.first();

		// create column access methods
		StringBuilder sb = createColumns(AD_Tab_ID, window.getAD_Window_ID());
		// Header
		String nomeHTML = stripBadChars(window.get_Translation(MInfoWindow.COLUMNNAME_Name));
		tabName = createDocBook(AD_Tab_ID, sb, window.get_Translation(MWindow.COLUMNNAME_Name));// take out spaces, combine with tab name i.e. SalesOrder_Order
		// Save
		if (!(directory.endsWith("/") || directory.endsWith("\\")))	{
			directory = directory + File.separator;
		}

		tabName = RemoverAcentos.remover(tabName);

		writeToFile(sb, directory + "/brerp-saas.docbook/docbook/input/" + tabName + ".xml");


		menuJanelasArray.put("manual/" + tabName);



		menuHTML.append("<li><a href=\"" + tabName + "\"> Janela: " + nomeHTML + "</a> </li> \n");
		menuJanelas.append("<li><a href=\"" + tabName + "\"> Janela: " + nomeHTML + "</a> </li> \n");
		//
	}



	/*
	 * For Process item
	 */

	public DocBookGenerator(String directory, MProcess process) {
		// create column access methods
		StringBuilder sb = createColumnsProcess(process);

		// Header
		String nomeHTML = stripBadChars(process.get_Translation(MInfoWindow.COLUMNNAME_Name));
		tabName = createDocBook(0, sb, process.isReport()? process.get_Translation(MProcess.COLUMNNAME_Name) + "Rpt" : process.get_Translation(MProcess.COLUMNNAME_Name) + "Prc");

		// Save
		if (!(directory.endsWith("/") || directory.endsWith("\\"))) {
			directory = directory + File.separator;
		}

		tabName = RemoverAcentos.remover(tabName);

		writeToFile(sb, directory + "/brerp-saas.docbook/docbook/input/" + tabName + ".xml");

//		menuJSON.append("\"Relatório - "+ tabName + "\": [ \n \"" + tabName+ "\" \n ], \n");

		menuHTML .append("<li><a href=\""+tabName+"\">" + (process.isReport()? "Relatório: " : "Processo: ")+ nomeHTML +"</a> </li> \n");

		if (!process.isReport()) {
			menuProcessos.append("<li><a href=\"" + tabName + "\">Processo: " + nomeHTML + "</a> </li> \n");
			menuProcessosArray.put("manual/" + tabName);
		} else {
			menuRelatorios.append("<li><a href=\"" + tabName + "\">Relatório: " + nomeHTML + "</a> </li> \n");
			menuRelatoriosArray.put("manual/" + tabName);
		}
	}

	public DocBookGenerator(String directory, MWorkflow wf) {
		StringBuilder sb = createColumnsWorkflow(wf);

		// Header
		String nomeHTML = stripBadChars(wf.get_Translation(MInfoWindow.COLUMNNAME_Name));
		 tabName = createDocBook(0, sb, wf.get_Translation(MWorkflow.COLUMNNAME_Name));

		// Save
		if (!(directory.endsWith("/") || directory.endsWith("\\"))) {
			directory = directory + File.separator;
		}

		tabName = RemoverAcentos.remover(tabName);

		writeToFile(sb, directory + "/brerp-saas.docbook/docbook/input/" + tabName + ".xml");
//		menuJSON.append("\"Workflow - "+ tabName + "\": [ \n \"" + tabName+ "\" \n ], \n");
		menuWorkflowArray.put("manual/" + tabName);
		menuHTML .append("<li><a href=\"" + tabName + "\">Workflow: " + nomeHTML + "</a> </li> \n");
		menuWorkFlow.append("<li><a href=\"" + tabName + "\">Workflow: " + nomeHTML + "</a> </li> \n");
	}

	public DocBookGenerator(String directory, MForm form) {
		StringBuilder sb = createColumnsForm(form);

		// Header
		String nomeHTML = stripBadChars(form.get_Translation(MInfoWindow.COLUMNNAME_Name));
		 tabName = createDocBook(0, sb, form.get_Translation(MForm.COLUMNNAME_Name));//


		// Save
		if (!(directory.endsWith("/") || directory.endsWith("\\")))	{
			directory = directory + File.separator;
		}

		tabName = RemoverAcentos.remover(tabName);

		writeToFile(sb, directory + "/brerp-saas.docbook/docbook/input/"+tabName + ".xml");
//		menuJSON.append("\"Formulário - "+ tabName + "\": [ \n \"" + tabName+ "\" \n ], \n");
		menuFormularioArray.put("manual/" + tabName);
		menuHTML .append("<li><a href=\"" + tabName + "\">Formulário:  " + nomeHTML + "</a> </li> \n");
		menuFormulario.append("<li><a href=\"" + tabName + "\">Formulário: " + nomeHTML + "</a> </li> \n");
		}

	public DocBookGenerator(String directory, MInfoWindow info) {
		StringBuilder sb = createColumnsInfo(info);

		// Header
		String nomeHTML = stripBadChars(info.get_Translation(MInfoWindow.COLUMNNAME_Name));
		 tabName = createDocBook(0, sb, info.get_Translation(MInfoWindow.COLUMNNAME_Name))+"I";//

		// Save
		if (!(directory.endsWith("/") || directory.endsWith("\\"))) {
			directory = directory + File.separator;
		}

		tabName = RemoverAcentos.remover(tabName);

		writeToFile(sb, directory + "/brerp-saas.docbook/docbook/input/" + tabName + ".xml");
//		menuJSON.append("\"InfoPanel - "+ tabName + "\": [ \n \"" + tabName+ "\" \n ], \n");
		menuInfoPanelArray.put("manual/" + tabName);
		menuHTML .append("<li><a href=\"" + tabName + "\">InfoPanel: " + nomeHTML + "</a> </li> \n");
		menuInfoPane.append("<li><a href=\"" + tabName + "\">InfoPanel: " + nomeHTML + "</a> </li> \n");
		}

	private StringBuilder createColumnsInfo(MInfoWindow info) {
		StringBuilder sb = new StringBuilder();
		String buffer = stripBadChars(info.get_Translation(MInfoWindow.COLUMNNAME_Name));
		sb.append("<chapter><para><emphasis> Criado: </emphasis>" + info.getCreated() + "</para><para> <emphasis> Atualizado: </emphasis>" + info.getUpdated() + "</para>" + NL);
		sb.append("<title>InfoPanel: " + buffer + "</title> \n ");
	    buffer = stripBadChars(info.get_Translation(MInfoWindow.COLUMNNAME_Description));
	    if (buffer != null)
	    	sb.append("<para><emphasis> Descrição: </emphasis>" + buffer + "</para> \n");
		buffer = stripBadChars(info.get_Translation(MInfoWindow.COLUMNNAME_Help));
	    if (buffer != null)
	    	sb.append("<para><emphasis> Comentário/Ajuda: </emphasis>" + buffer + "</para>" + NL);
		buffer = stripBadChars(info.get_TableName());
		sb.append("<para><emphasis> Tabela: </emphasis>" + buffer + "</para>" + NL);
		buffer = stripBadChars(info.getFromClause());
		sb.append("<para><emphasis> From (SQL): </emphasis>" + buffer + "</para>" + NL);
		buffer = stripBadChars(info.getOrderByClause());
		sb.append("<para><emphasis> Order By :</emphasis>" + buffer);
		if (info.isDistinct())
			sb.append("<emphasis> SELECT Distinct </emphasis>");
		if (info.isDefault())
			sb.append("<emphasis> Valor Padrão </emphasis>");
		sb.append("</para>"+NL);

		sb.append("<table> \n <title> InfoPanel Columns </title> \n <tgroup cols='6' align='center' colsep='1' rowsep='1'>");
		sb.append("<colspec colname='c1'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c2'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c3'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c4'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c5'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c6'  colwidth=\"3*\"/> \n");
		sb.append("<thead>");
		sb.append("<row>");
		sb.append("<entry>Nome</entry>");
        sb.append("<entry>Referência</entry>");
		sb.append("<entry>Sql SELECT</entry>");
        sb.append("<entry>QueryCriteria</entry>");
		sb.append("<entry>Descrição</entry>");
		sb.append("<entry>Comentário/Ajuda</entry>");
        sb.append("</row>\n");
        sb.append("</thead><tbody>\n");

        List<MInfoColumn> columns = new Query(Env.getCtx(), MInfoColumn.Table_Name, MInfoColumn.COLUMNNAME_AD_InfoWindow_ID + "=?", null)
        	.setParameters(info.getAD_InfoWindow_ID())
        	.list();

        StringBuilder infoColumnString = new StringBuilder(); //use for retrieve data after this

        for (MInfoColumn column:columns) {
        	infoColumnString.append(column.getSelectClause() + ",");
			buffer = stripBadChars(column.get_Translation(MInfoWindow.COLUMNNAME_Name));
			sb.append("<row> <entry>" + buffer + "</entry>");
			//sb.append("<entry>" + column.getAD_Reference().getName() + "</entry>");


			sb.append("<entry>" + this.getTrlCampo(column.getAD_Reference_ID()) + "</entry>");

			buffer = stripBadChars(column.getSelectClause());
			sb.append("<entry>" + buffer + "</entry>");
			if (column.isQueryCriteria()){
				buffer = "<emphasis>Operador:</emphasis>" + stripBadChars(column.getQueryOperator()) + " <emphasis>Função:</emphasis>" + stripBadChars(column.getQueryFunction());
				sb.append("<entry>" + buffer + "</entry>");
			} else {
				sb.append("<entry> </entry>");
			}

			buffer = stripBadChars(column.get_Translation(MInfoWindow.COLUMNNAME_Description));
			sb.append("<entry>" + buffer + "</entry>");
			buffer = stripBadChars(column.get_Translation(MInfoWindow.COLUMNNAME_Help));
			sb.append("<entry>" + buffer + "</entry>");
			sb.append("</row> \n");
		}
		sb.append("</tbody>  </tgroup> ");
		sb.append("</table> \n");

		//	RETRIEVE DATA CONTENT! can only do after obtaining the above.

		String infodatalink = retrieveInfo(info);
		sb.append(infodatalink.isEmpty() ? ("<para>[DADOS INVÁLIDOS]</para>\n") : ("<para><ulink url=\"data/" + infodatalink + ".html\">[BANCO DE DADOS]</ulink>,</para>\n"));
		//	sb.append("\n<ulink url=\"data/"+datalink+".html\"> .. [DATABASE]</ulink> \n");
		return sb;
	}

	private String retrieveInfo(MInfoWindow info){
		MInfoColumn[] cols = info.getInfoColumns(true, true);
		String datalink = "";
		//boolean hascontent = false;
		StringBuilder infocontent = new StringBuilder(XMLBegin);
		int fullcols=cols.length;

		infocontent.append("<table>\n<title>" + stripBadChars(info.get_Translation(MInfoWindow.COLUMNNAME_Name)) + "</title>\n<tgroup cols='" + fullcols + "'");
		infocontent.append(" align='center' colsep='1' rowsep='1'> \n\n <tbody><row>");
		for (MInfoColumn col:cols){
			infocontent.append("<entry>" + stripBadChars(col.get_Translation(MInfoWindow.COLUMNNAME_Name)) + "</entry>");
		}
		infocontent.append("</row>");

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = info.getSql();
		if (sql.contains("@"))
		{
			return "";
		}

		try	{
			String countSql = Msg.parseTranslation(Env.getCtx(), sql.toString());	//	Variables

			pstmt = DB.prepareStatement(countSql, null);
			//	pstmt.setString(1, p_tableName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
			//	hascontent = true;
				infocontent.append("\n<row>");
				for (int cnt=0; cnt<cols.length; cnt++){
					String rowcol = "";
					rowcol = rs.getString(cnt+1);
					infocontent.append("<entry>" + stripBadChars(rowcol) + "</entry>");
				}
				infocontent.append("\n</row>");
			}

			datalink = info.getName()+"_infodata";
			datalink = datalink.replace(" ", "");
			infocontent.append("</tbody>\n</tgroup>\n</table>");

			datalink = RemoverAcentos.remover(datalink);

			writeToFile(infocontent, folder + "/brerp-saas.docbook/docbook/simpleXML/" + datalink + ".xml");

		} catch (SQLException e) {
			//ADialog.error(WindowNo, c, AD_Message)
			//Env.getUi().showError(0, null, sql.toString() + "<br> " + e.getMessage());
			log.log(Level.SEVERE, sql, e);
			// String error = e.toString();
			// show error to user and return: TODO
		} finally {
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}

		return datalink;
	}

	private StringBuilder createColumnsForm(MForm form) {
		StringBuilder sb = new StringBuilder();
		String buffer = stripBadChars(form.get_Translation(MForm.COLUMNNAME_Name));

		sb.append("<chapter><para><emphasis> Criado:</emphasis>" + form.getCreated() + "</para><para> <emphasis>Atualizado:</emphasis>" + form.getUpdated() + "</para>" + NL);
		sb.append("<title>Formulário: " + buffer + "</title> \n ");
		if (form.getDescription() != null) {
		    buffer = stripBadChars(form.get_Translation(MForm.COLUMNNAME_Description));
			sb.append("<para><emphasis> Descrição: </emphasis>" + buffer + "</para>");
		}
		if (form.getHelp() != null){
			buffer = stripBadChars(form.get_Translation(MForm.COLUMNNAME_Help));
			sb.append("<para><emphasis>Comentário/Ajuda:</emphasis>" + buffer + "</para>" + NL);
		}
		//String classname = form.getClassname().replace(".", "/");
		//sb.append("<para><emphasis> Classe: </emphasis><ulink url=\"../javadoc/" + classname + ".html\">" + form.getClassname() + "</ulink></para> \n");
		return sb;
	}

	private StringBuilder createColumnsWorkflow(MWorkflow wf) {
		StringBuilder sb = new StringBuilder();
		String action, description, transitionValue, conditionValue = "";
		String buffer = stripBadChars(wf.get_Translation(MWorkflow.COLUMNNAME_Name));

		sb.append("<chapter><para><emphasis> Criado:</emphasis>" + wf.getCreated() + "</para><para> <emphasis>Atualizado:</emphasis>" + wf.getUpdated() + "</para>"+ NL);
		sb.append("<title>Workflow: " + buffer + "</title> \n ");
		if (wf.getDescription() != null){
		    buffer = stripBadChars(wf.get_Translation(MWorkflow.COLUMNNAME_Description));
			sb.append("<para><emphasis> Descrição: </emphasis>  " + buffer + "</para>");
		}
		if (wf.getHelp() != null){
			buffer = stripBadChars(wf.get_Translation(MWorkflow.COLUMNNAME_Help));
			sb.append("<para><emphasis> Comentário/Ajuda: </emphasis>" + buffer + "</para>" + NL);
		}
		buffer = stripBadChars(wf.getFirstNode().get_Translation(MWorkflow.COLUMNNAME_Name));
		windowName = wf.get_Translation(MWorkflow.COLUMNNAME_Name).replace(" ", "_");

		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://dev14.devcoffee.com.br/erp");
		driver.quit();*/

		//sb.append("\n <para> <ulink url=\"http://wiki.idempiere.org/en/File:" + windowName + "_-_Workflow_%28iDempiere_1.0.0%29.png\">[IMAGEM]</ulink></para> \n");
		sb.append("<para><emphasis> Nó inicial: </emphasis>" + buffer + "</para>"+NL);
		sb.append("<para><emphasis> WorkFlowType: </emphasis>" + wf.getWorkflowType() + "</para> \n");

		sb.append("<table> \n <title>" + wf.get_Translation(MWorkflow.COLUMNNAME_Name) + " Workflow Transitions</title> \n <tgroup cols='5' align='center' colsep='1' rowsep='1'>");
		sb.append("<colspec colname='c1'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c2'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c3'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c4'  colwidth=\"1*\"/>");
		sb.append("<colspec colname='c5'  colwidth=\"1*\"/> \n");
		sb.append("<thead>");
		sb.append("<row>");
		sb.append("<entry>Nó</entry>");
		sb.append("<entry>Descrição</entry>");
		sb.append("<entry>Ação</entry>");
		sb.append("<entry>Próximo nó</entry>");
        sb.append("<entry>Condição</entry>");
        sb.append("</row>\n");
        sb.append("</thead><tbody>\n");

		MWFNode[] nodes = wf.getNodes(true, wf.getAD_Client_ID());
		for (MWFNode node:nodes){
			action = node.getAction();		//Column (relative to Action)
			String labelColumn = "";

			if (MWFNode.ACTION_AppsProcess.equals(action)) {
				labelColumn = "Process";
			} else if (MWFNode.ACTION_DocumentAction.equals(action)) {
				labelColumn = "DocAction";
			} else if (MWFNode.ACTION_AppsReport.equals(action)) {
				labelColumn = "Report";
			} else if (MWFNode.ACTION_AppsTask.equals(action)) {
				labelColumn = "AppsTask";
			} else if (MWFNode.ACTION_SetVariable.equals(action)) {
				labelColumn = "SetVariable";
			} else if (MWFNode.ACTION_SubWorkflow.equals(action)) {
				labelColumn = "SubWorkflow";
			} else if (MWFNode.ACTION_UserChoice.equals(action)) {
				labelColumn = "UserChoice";
			} else if (MWFNode.ACTION_UserForm.equals(action)) {
				labelColumn = "UserForm";
			} else if (MWFNode.ACTION_UserWindow.equals(action)) {
				labelColumn = "UserWindow";
			} else if (MWFNode.ACTION_WaitSleep.equals(action)) {
				labelColumn = "Sleep";
			} else if ("S".equals(action)) {
				labelColumn = "Schedule";
			}

			description = node.get_Translation(MWorkflow.COLUMNNAME_Description);
			MWFNodeNext[] transitions = node.getTransitions(wf.getAD_Client_ID());

			transitionValue = transitions.length == 0 ? "" : transitions[0].getAD_WF_Next().getName();
			if (!transitionValue.isEmpty()) {
				MWFNextCondition[] conditions = transitions[0].getConditions(true);
				conditionValue = conditions.length == 0 ? "" : (conditions[0].getAndOr().equals("A") ? "And " : "Or ") + conditions[0].getAD_Column().getName() + conditions[0].getOperation()+conditions[0].getValue();
			}

			buffer = stripBadChars(node.get_Translation(MWorkflow.COLUMNNAME_Name));
			sb.append("<row> <entry>" + buffer + "</entry>");
			buffer = stripBadChars(description);
			sb.append("<entry>" + buffer + "</entry>");
			buffer = stripBadChars(labelColumn);
			sb.append("<entry>" + buffer + "</entry>");
			buffer = stripBadChars(transitionValue);
			sb.append("<entry>" + buffer + "</entry>");
			buffer = stripBadChars(conditionValue);
			sb.append("<entry>" + buffer + "</entry>");
			sb.append("</row> \n");
		}
		sb.append("</tbody>  </tgroup> ");
		sb.append("</table> \n");

		return sb;
	}

	private StringBuilder createColumnsProcess(MProcess process) {
		StringBuilder sb = new StringBuilder();
		String buffer = stripBadChars(process.get_Translation(MProcess.COLUMNNAME_Name));

		sb.append("<chapter><para><emphasis> Criado:</emphasis>" + process.getCreated() + "</para><para> <emphasis>Atualizado:</emphasis>" + process.getUpdated() + "</para>" + NL);
		sb.append(" \n <title>" + (process.isReport() ? "Relatório:  " : "Processo:  ") + buffer + "</title> \n ");
		if (process.getDescription() != null) {
		    buffer = stripBadChars(process.get_Translation(MProcess.COLUMNNAME_Description));
			sb.append("<para><emphasis> Descrição: </emphasis>" + buffer + "</para>");
		}
		if (process.getHelp() != null){
			buffer = stripBadChars(process.get_Translation(MProcess.COLUMNNAME_Help));
			sb.append("<para><emphasis> Comentário/Ajuda: </emphasis>" + buffer + "</para>" + NL);
		}

		sb.append((process.isReport() ? "<para><emphasis> ReportView: </emphasis>" + process.getAD_ReportView().getName() + "</para>" : ""));
		/*if (process.getClassname() != null){
			String classname = process.getClassname().replace(".", "/");
			sb.append("<para><emphasis> Classe: </emphasis> <ulink url=\"../javadoc/" + classname + ".html\">" + process.getClassname() + "</ulink></para> \n");
		}*/

		windowName = process.getName();
		if (windowName.contains("&")){
			int a = windowName.lastIndexOf("&");
			String first = windowName.substring(0, a);
			String end = windowName.substring(a + 1);
			windowName = first + "%26" + end;
		}

		windowName = windowName.replace(" ", "_");
		//sb.append("\n <para> <ulink url=\"http://wiki.idempiere.org/en/File:" + windowName + "_-_" + (process.isReport() ? "Report" : "Process") + "_%28iDempiere_1.0.0%29.png\">[IMAGEM]</ulink></para> \n");

		//get Parameters
		List<MProcessPara> paras = new Query(Env.getCtx(), MProcessPara.Table_Name, MProcessPara.COLUMNNAME_AD_Process_ID + "=?", null)
			.setParameters(process.getAD_Process_ID())
			.list();

		if (paras != null) {
			if (paras.size() > 0){
				sb.append("<table> \n <title>" + windowName + " Parâmetros </title> \n <tgroup cols='6' align='center' colsep='1' rowsep='1'>");
				sb.append("<colspec colname='c1'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c2'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c3'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c4'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c5'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c6'  colwidth=\"2*\"/>");
				sb.append("<thead> \n");
				sb.append("<row> \n");
				sb.append("<entry>Nome</entry>");
				sb.append("<entry>Nome da coluna</entry>");
		        sb.append("<entry>Referência</entry>");
				sb.append("<entry>Valores(Padrão)</entry>");
				sb.append("<entry>Descrição</entry>");
				sb.append("<entry>Comentário/Ajuda</entry>");
		        sb.append("</row> \n");
		        sb.append("</thead><tbody>");

				for (MProcessPara para:paras){
					buffer = stripBadChars(para.get_Translation(MProcessPara.COLUMNNAME_Name));
					sb.append("<row> \n <entry>" + buffer + "</entry>");
					sb.append("<entry> " + para.getColumnName() + "</entry> \n");


					sb.append("<entry>" + (para.getAD_Reference() != null ? this.getTrlCampo(para.getAD_Reference_ID()) : para.getAD_Reference_Value().getName())
							+ "</entry> \n ");


					if (para.getAD_Reference().getName().equals("List")) {
						StringBuilder names = new StringBuilder();
						List<MRefList> list = new Query(Env.getCtx(), MRefList.Table_Name, MRefList.COLUMNNAME_AD_Reference_ID+"=?", null)
							.setParameters(para.getAD_Reference_Value().getAD_Reference_ID())
							.list();

						for (MRefList ref:list){
							buffer = stripBadChars(ref.get_Translation(MRefList.COLUMNNAME_Name));
							names.append(buffer + NL);
						}
						buffer = names.toString();

					} else {
						buffer = (para.getAD_Reference_Value().getName() == null ? "" : para.getAD_Reference_Value().getName());
						buffer = stripBadChars(buffer);
					}

					buffer = buffer + (para.getDefaultValue() == null ? "" : "(" + para.getDefaultValue() + ")");
					sb.append("<entry>" + buffer + "</entry> \n");
					buffer = stripBadChars(para.get_Translation(MProcessPara.COLUMNNAME_Description));
					sb.append("<entry>" + buffer + "</entry> \n");
					buffer = stripBadChars(para.get_Translation(MProcessPara.COLUMNNAME_Help));
					sb.append("<entry>" + buffer + "</entry> \n");
					sb.append("</row> \n");
				}

				sb.append("</tbody> \n </tgroup> \n");
				sb.append("</table> \n");
			} else {
				sb.append("<para> SEM PARÂMETROS </para>\n");
			}
		}

		if (process.isReport()) {
			I_AD_ReportView view = process.getAD_ReportView();
			MTable viewTable = (MTable) view.getAD_Table();
			MColumn[] columns = viewTable.getColumns(true);

			if (columns.length > 0) {
				buffer = stripBadChars(view.getName());
				sb.append("<table> \n <title>" + buffer + " - Colunas</title> \n <tgroup cols='7' align='center' colsep='1' rowsep='1'>");
				sb.append("<colspec colname='c1'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c2'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c3'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c4'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c5'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c6'  colwidth=\"1*\"/>");
				sb.append("<colspec colname='c7'  colwidth=\"2*\"/>");
				sb.append("<thead> \n");
				sb.append("<row> \n");
				sb.append("<entry>Nome da coluna</entry>");
				sb.append("<entry>Referência</entry>");
				sb.append("<entry>Valores padrão</entry>");
		        sb.append("<entry>Valor de restrição</entry>");
				sb.append("<entry>Regra de validação</entry>");
				sb.append("<entry>Descrição</entry>");
				sb.append("<entry>Comentário/Ajuda</entry>");
		        sb.append("</row>");
		        sb.append("</thead><tbody>");

				for (MColumn column:columns) {
					buffer = stripBadChars(column.get_Translation(MColumn.COLUMNNAME_Name));
					sb.append("<row> \n <entry>" + buffer + "</entry>");
					//buffer = stripBadChars(column.getAD_Reference().getName());

					buffer = this.getTrlCampo(column.getAD_Reference_ID());

					sb.append("<entry>" + buffer + "</entry> \n");
					StringBuilder names = new StringBuilder();

					if (column.getAD_Reference().getName().equals("List")) {
						List<MRefList> list = new Query(Env.getCtx(), MRefList.Table_Name, MRefList.COLUMNNAME_AD_Reference_ID + "=?", null)
							.setParameters(column.getAD_Reference_Value().getAD_Reference_ID())
							.list();

						for (MRefList ref:list) {
							buffer = stripBadChars(ref.get_Translation(MRefList.COLUMNNAME_Name));
							names.append(buffer + NL);
						}
						buffer = names.toString();
					} else {
						buffer = (column.getAD_Reference_Value().getName() == null ? "" : column.getAD_Reference_Value().getName());
						buffer = stripBadChars(buffer);
					}
					buffer = buffer + (column.getDefaultValue() == null ? "" : "("+column.getDefaultValue()+")");
					sb.append("<entry>" + buffer + "</entry> \n");
					buffer = (column.getFKConstraintName() == null ? "" : column.getFKConstraintName());
					buffer = stripBadChars(buffer);
					sb.append("<entry>" + buffer + "</entry> \n");

					if (column.getAD_Val_Rule().getName() != null) {
						MValRule rule = new Query(Env.getCtx(),MValRule.Table_Name, MValRule.COLUMNNAME_AD_Val_Rule_ID+"=?",null)
							.setParameters(column.getAD_Val_Rule_ID())
							.first();
						buffer = stripBadChars(rule.getCode());
					} else {
						buffer = "";
					}

					sb.append("<entry>"+buffer+" </entry> \n");
					if (column.getDescription() != null){
						String description = column.get_Translation(MWindow.COLUMNNAME_Description);

						if (started > 3 && (column.getName().equals("Search Key")
								|| column.getName().equals("Active")
								|| column.getName().equals("Client")
								|| column.getName().equals("Organization"))) {
							description = "(ver acima)";
						}

						description = stripBadChars(description);
						sb.append("<entry>"+description+"</entry> \n");
					} else {
						sb.append("<entry> </entry> \n");
					}

					if (column.getHelp() != null) {
						buffer = column.get_Translation(MWindow.COLUMNNAME_Help);
						if (column.getName().equals("Active") || column.getName().equals("Client") || column.getName().equals("Organization")) {
							if (started > 3) {
								buffer = "(ver acima)";
							} else {
								started++;
							}
						}
						buffer = stripBadChars(buffer);
						sb.append("<entry>"+buffer+"</entry> \n");
					} else {
						sb.append("<entry> </entry> \n");
					}

					sb.append("</row> \n");
				}
				sb.append("</tbody> \n </tgroup> \n");
				sb.append("</table> \n");
			}
		}

		return sb;
	}

	/**
	 * Add Header info to buffer
	 *
	 * @param AD_Tab_ID	table
	 * @param sb			buffer
	 * @param mandatory		init call for mandatory columns
	 * @param windowName	package name
	 * @return class name
	 */
	private String createDocBook(int AD_Tab_ID, StringBuilder sb, String menuName) {
		MTab tab = null;
		tabName = "";

		if (AD_Tab_ID == 0) {
			tabName = "";
		} else {
			tab = new Query (Env.getCtx(), MTab.Table_Name, "AD_Tab_ID=?", null)
				.setParameters(AD_Tab_ID)
				.first();
			tabName = tab.get_Translation(MTab.COLUMNNAME_Name);
		}

		menuName.trim();
		StringBuilder linkName = new StringBuilder();
		menuName = menuName.replace(" ", "");
		menuName = menuName.replace("/", "");
		linkName.append(menuName + tabName);

		StringBuilder start = new StringBuilder()
			.append (XMLBegin);

		String end = " </chapter>\n";

		sb.insert(0, start);
		sb.append(end);

		return linkName.toString();
	}

	/**
	 * Create Column access methods
	 *
	 * @param AD_Tab_ID table
	 * @param mandatory   init call for mandatory columns
	 * @return set/get method
	 */
	private StringBuilder createColumns(int AD_Tab_ID, int winID) {
		StringBuilder sb = new StringBuilder();
		MWindow window = new Query(Env.getCtx(), MWindow.Table_Name,MWindow.COLUMNNAME_AD_Window_ID+"=?",null)
			.setParameters(winID)
			.first();

		if (AD_Tab_ID > 0) {
			preLoop(window.getAD_Window_ID(), sb);
			theLoop(AD_Tab_ID, sb);
		} else {
			List<MTab> tabs = new Query(Env.getCtx(),MTab.Table_Name, MTab.COLUMNNAME_AD_Window_ID+"=?", null)
				.setParameters(window.getAD_Window_ID())
				.setOrderBy(MTab.COLUMNNAME_SeqNo)
				.list();
			preLoop(window.getAD_Window_ID(),sb);

			for (MTab tab:tabs){
				theLoop(tab.getAD_Tab_ID(), sb);
			}
		}

		return sb;
	}

	private void preLoop(int AD_Window_ID, StringBuilder sb) {
		MWindow win = new Query (Env.getCtx(), MWindow.Table_Name, "AD_Window_ID=?", null)
			.setParameters(AD_Window_ID)
			.first();
		windowName = win.get_Translation(MWindow.COLUMNNAME_Name).replace(" ", "_");
		String buffer = stripBadChars(win.get_Translation(MWindow.COLUMNNAME_Name));

		sb.append("<chapter> \n <title>Janela:  "  + buffer + "</title> \n ");
	    buffer = stripBadChars(win.get_Translation(MWindow.COLUMNNAME_Description));
		sb.append("<para> <emphasis>Descrição: </emphasis>  " + buffer + "</para>");
		buffer = stripBadChars(win.get_Translation(MWindow.COLUMNNAME_Help));
		sb.append("<para> <emphasis>Comentário/Ajuda: </emphasis>" + buffer + "</para>");
		sb.append("<para><emphasis> Criado em: </emphasis>" + win.getCreated() + NL
				+ "</para><para><emphasis>Atualizado em: </emphasis>" + win.getUpdated() + "</para>" + NL);
	}

	private void theLoop(int AD_Tab_ID, StringBuilder sb) {
		MTab tab = new Query (Env.getCtx(), MTab.Table_Name, "AD_Tab_ID=?", null)
			.setParameters(AD_Tab_ID)
			.first();

		tabName = tab.get_Translation(MTab.COLUMNNAME_Name).replace(" ", "_");
		String buffer = "";
		buffer = stripBadChars(tab.get_Translation(MTab.COLUMNNAME_Name));
		sb.append("<section> \n <title>Tabela: " +buffer+" - "+tab.getAD_Table().getTableName()+"</title> \n ");

		if (windowName.contains("&")) {
			int a = windowName.lastIndexOf("&");
			String first = windowName.substring(0, a);
			String end = windowName.substring(a+1);
			windowName = first+"%26"+end;
		}

		tabName = stripBadChars(tabName);
		//sb.append("\n <para> <ulink url=\"http://wiki.idempiere.org/en/File:"+windowName+"_-_"
		//		+ tabName + "_-_Window_%28iDempiere_1.0.0%29.png\">[IMAGEM]</ulink> \n");

		if (!tabName.contains("/")
				&& !tabName.equals("Print_Table_Format")
				&& !tabName.equals("Print_Color")) {
			String datalink = getContent(tab);
			if (!datalink.isEmpty()) {
				sb.append("\n<ulink url=\"data/"+datalink+"\">[DADOS DE EXEMPLO]</ulink> \n");
			}
		}

		//sb.append("</para>");

		if (tab.getDescription() != null) {
			buffer = stripBadChars(tab.get_Translation(MTab.COLUMNNAME_Description));
			sb.append("<para><emphasis>Descrição:</emphasis> " + buffer + "</para> \n");
		}

		buffer = stripBadChars(tab.get_Translation(MTab.COLUMNNAME_Help));
		if (buffer != null) {
			sb.append("<para><emphasis>Comentário/Ajuda: </emphasis> " + buffer + "</para> \n");
		}

		if (tab.getAD_Column().getName() != null) {
			buffer = stripBadChars(tab.getAD_Column().getName());
			sb.append("<para><emphasis>Coluna linkada: </emphasis> " + buffer + "</para> \n");
		}
		if (tab.getParent_Column().getName() != null){
			buffer = stripBadChars(tab.getParent_Column().getName());
			sb.append("<para><emphasis>Coluna mãe: </emphasis> " + buffer + "</para> \n");
		}
		if (tab.getAD_Process().getName() != null){
			sb.append("<para><emphasis> Relatório: </emphasis>" + tab.getAD_Process().getName() + " - " + tab.getAD_Process().getValue() + " </para> \n");
			/*MProcess process = new Query(Env.getCtx(),MProcess.Table_Name, MProcess.COLUMNNAME_AD_Process_ID + "=?", null)
				.setParameters(tab.getAD_Process_ID())
				.first();

			if (process.getClassname() != null) {
				String classname = process.getClassname().replace(".", "/");
				sb.append("<emphasis> - Classe: </emphasis> <ulink url=\"../javadoc/"
						+ classname + ".html\">" + process.getClassname() + "</ulink></para> \n");
			} else {
				sb.append("</para> \n");
			}*/
		}

		if (tab.getReadOnlyLogic() != null) {
			buffer = stripBadChars(tab.getReadOnlyLogic());
			sb.append("<para><emphasis>Lógica de somente leitura:</emphasis> " + buffer + "</para> \n");
		}

		if (tab.getDisplayLogic() != null) {
			buffer = stripBadChars(tab.getDisplayLogic());
			sb.append("<para><emphasis>Lógica de visualização:</emphasis> " + buffer + "</para> \n");
		}

		if (tab.getAD_CtxHelp().getName() != null) {
			buffer = stripBadChars(tab.getAD_CtxHelp().getName());
			sb.append("<para><emphasis>Contexto de ajuda:</emphasis> " + buffer + "</para> \n");
		}

		if (tab.getWhereClause() != null) {
			buffer = stripBadChars(tab.getWhereClause());
			sb.append("<para><emphasis>Claúsula Where:</emphasis> " + buffer + "</para> \n");
		}

		if (tab.getAD_Image_ID() > 0) {
			sb.append("<para><emphasis>Imagem:</emphasis> " + tab.getAD_Image().getName() + "</para>");
		}

		sb.append("<para><emphasis>Nível da tabela: </emphasis>" + tab.getTabLevel() + "</para> \n </section> \n ");

		// Fetch associated Column, first fetch Table-Column of Tab
		// done in direct field.getColumn
		// get Fields of the Tab
		MField[] fields = tab.getFields(true, null);
		if (fields.length > 0){
			buffer = stripBadChars(tab.getName());
			sb.append("<table> \n <title>"+buffer+" Fields</title> \n <tgroup cols='7' align='center' colsep='1' rowsep='1'>");
			sb.append("<colspec colname='c1'  colwidth=\"1*\"/>");
			sb.append("<colspec colname='c2'  colwidth=\"1*\"/>");
			sb.append("<colspec colname='c3'  colwidth=\"2*\"/>");
			sb.append("<colspec colname='c4'  colwidth=\"2*\"/>");
			sb.append("<colspec colname='c5'  colwidth=\"2*\"/>");
			sb.append("<colspec colname='c6'  colwidth=\"2*\"/>");
			sb.append("<colspec colname='c7'  colwidth=\"3*\"/>");
			sb.append("<thead> \n");
			sb.append("<row> \n");
			sb.append("<entry>Nome do campo</entry>");
			sb.append("<entry>Referência</entry>");
			sb.append("<entry>Valores (Padrão)</entry>");
	        sb.append("<entry>Chave restritiva</entry>");
			sb.append("<entry>Regra de validação</entry>");
			sb.append("<entry>Descrição</entry>");
			sb.append("<entry>Comentário/Ajuda</entry>");
	        sb.append("</row>");
	        sb.append("</thead><tbody>");

			for (MField field:fields){
				int column_id = field.getAD_Column_ID();
				MColumn column = new Query(Env.getCtx(), MColumn.Table_Name, MColumn.COLUMNNAME_AD_Column_ID + "=?", null)
					.setParameters(column_id)
					.first();


				buffer = stripBadChars(field.get_Translation(MField.COLUMNNAME_Name));
				sb.append("<row> \n <entry>"+buffer+"</entry>");
				//buffer = stripBadChars(column.getAD_Reference().getName());

				buffer = this.getTrlCampo(column.getAD_Reference_ID());

				sb.append("<entry>"+buffer+"</entry> \n");
				StringBuilder names = new StringBuilder();
					if (column.getAD_Reference().getName().equals("List")) {
						List<MRefList> list = new Query(Env.getCtx(),MRefList.Table_Name,MRefList.COLUMNNAME_AD_Reference_ID + "=?", null)
							.setParameters(column.getAD_Reference_Value().getAD_Reference_ID())
							.list();

						for (MRefList ref:list){
							buffer = stripBadChars(ref.get_Translation(MRefList.COLUMNNAME_Name));
							names.append(buffer + NL);
						}
						buffer = names.toString();
				} else {
					buffer = (column.getAD_Reference_Value().getName() == null ? "" : column.getAD_Reference_Value().getName());
					buffer = stripBadChars(buffer);
				}

				buffer = buffer + (column.getDefaultValue() == null? "" : "(" + column.getDefaultValue() + ")");

				buffer = RemoverAcentos.removerMaiorMenor(buffer);

				sb.append("<entry>" + buffer + "</entry> \n");
				buffer = (column.getFKConstraintName() == null ? "" : column.getFKConstraintName());
				buffer = stripBadChars(buffer);

				sb.append("<entry valign=\"middle\">" + buffer + "</entry> \n");
				buffer = "";
				if (column.getAD_Val_Rule().getName() != null) {
					MValRule rule = new Query(Env.getCtx(), MValRule.Table_Name, MValRule.COLUMNNAME_AD_Val_Rule_ID + "=?", null)
						.setParameters(column.getAD_Val_Rule_ID())
						.first();
					buffer = stripBadChars(rule.getCode());
				}
				/*if (column.getCallout()!=null) {
					String classname = column.getCallout().replace(".", "/");
					int last = classname.lastIndexOf("/");

					if (last > 0) {
						String calloutname = stripBadChars(classname.substring(0, last));
						buffer = buffer + "<emphasis>Callout: </emphasis><ulink url=\"../javadoc/" + calloutname + ".html\">" + column.getCallout() + "</ulink> \n";
					}
				}*/
				buffer = buffer + (column.getReadOnlyLogic() == null ? "": "\n <emphasis>ReadOnly Logic</emphasis>: " + stripBadChars(column.getReadOnlyLogic()));
				sb.append("<entry>" + buffer + " </entry> \n");
				if (column.getDescription() != null) {
					String description = column.get_Translation(MField.COLUMNNAME_Description);
					if (started > 3 && (column.getName().equals("Search Key")
									|| column.getName().equals("Active")
									|| column.getName().equals("Client")
									|| column.getName().equals("Organization"))) {
						description = "(semelhante ao primeiro relatório)";
					}

					description = stripBadChars(description);
					sb.append("<entry valign=\"middle\">" + description + "</entry> \n");
				} else {
					sb.append("<entry> </entry> \n");
				}

				if (column.getHelp() != null) {
					buffer = column.get_Translation(MField.COLUMNNAME_Help);
					if (column.getName().equals("Search Key") || column.getName().equals("Active") || column.getName().equals("Client") || column.getName().equals("Organization")) {
						if (started>3) {
							buffer = "(ver o mesmo acima)";
						} else {
							started++;
						}
					}

					buffer = stripBadChars(buffer);
					sb.append("<entry>"+buffer+"</entry> \n");
				} else {
					sb.append("<entry> </entry> \n");
				}

				sb.append("</row> \n");
			}
			sb.append("</tbody> \n </tgroup> \n");
			sb.append("</table> \n");
		}

	}

	/**
	 * Get underlying table content for link back
	 * @param tab
	 */

	private String getContent(MTab tab) {
		//link to window/tab - table data
		MTable table = new Query(Env.getCtx(), MTable.Table_Name, MTable.COLUMNNAME_AD_Table_ID + "=?", null)
			.setParameters(tab.getAD_Table_ID())
			.first();

		if (table.isView()) {
			return "";
		}

		List<PO> data = new Query(Env.getCtx(), table.getTableName(),"",null).list();

		if (data.isEmpty()) {
			return "";
		}

		//table has content
		MColumn[] columns = table.getColumns(false);
		StringBuilder content = new StringBuilder(XMLBegin);

		//iterate each column and data as rows.
		int fullcols = columns.length;
		int nocols = fullcols - 8;
		int colcnt = nocols;

		content.append("<table>\n<title>" + stripBadChars(table.get_Translation(MTable.COLUMNNAME_Name)) + "</title>\n<tgroup cols='" + nocols + "'");
		content.append(" align='center' colsep='1' rowsep='1'>\n\n<tbody><row>");
		for (MColumn col:columns){
			if (redundant(col) || colcnt < 0) continue;
			// if (colcnt < 0) continue;
			content.append("<entry>" + stripBadChars(col.get_Translation(MColumn.COLUMNNAME_Name)) + "</entry>");
			colcnt--;
		}

		content.append("</row>");
		colcnt = nocols;

		int rowcnt = 0;
		for (PO row:data){
			rowcnt++;
			if (rowcnt > 100) break;

			content.append("\n<row>");
			for (int cnt = 0;cnt < fullcols; cnt++) {
				if (redundant(columns[cnt])) continue;

				String rowcol = "";
				if (row.get_Value(columns[cnt].getColumnName()) != null) {
					rowcol = row.get_Value(columns[cnt].getColumnName()).toString();
				}
				content.append("<entry>" + stripBadChars(rowcol) + "</entry>");
			}
			content.append("</row>");
		}

		String datalink = table.getTableName() + "_data";
		content.append("</tbody>\n</tgroup>\n</table>");
		writeToFile(content, folder +"/brerp-saas.docbook/docbook/simpleXML/" + datalink + ".xml");
		return datalink;
	}

	private boolean redundant(MColumn col) {
		int lt = col.getName().length();
		String end = col.getName().substring(lt - 2, lt);

		if (col.getName().equals("Active")
				|| col.getName().equals("Client")
				|| col.getName().equals("Organization")
				|| col.getName().equals("Created")
				|| col.getName().equals("Created By")
				|| col.getName().equals("Updated")
				|| col.getName().equals("Updated By")
				|| end.equals("UU")) {
			return true;
		}

		return false;
	}

	private String stripBadChars(String buffer) {
		if (buffer == null){
			return buffer;
		}

		buffer = buffer.replace("<br>","");
		buffer = buffer.replace("&", "%26");
		buffer = buffer.replace("<", "&lt;");
		buffer = buffer.replace(">", "&gt;");

		if (buffer.equals("")) {
				return " ";
		}

		return buffer;
	}

	/*
	 * Write to file
	 *
	 * @param sb string buffer
	 * @param fileName file name
	 */
	private static void writeToFile(StringBuilder sb, String fileName) {
		try {
			String path = fileName.substring(0, fileName.lastIndexOf("/"));
			File dir = new File(path);
			if (!dir.exists()) {
				dir.mkdirs();
			}

			File out = new File(fileName);

			Writer fw = new OutputStreamWriter(new FileOutputStream(out, false), "UTF-8");
			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);
				// after
				if (c == ';' || c == '}') {
					fw.write(c);
					if (sb.substring(i + 1).startsWith("//")) {
						fw.write('\t');
					} else {
						fw.write(NL);
					}
				} else if (c == '{') {
					// before & after
					fw.write(NL);
					fw.write(c);
					fw.write(NL);
				} else {
					fw.write(c);
				}
			}
			fw.flush();
			fw.close();

		} catch (Exception ex) {
			log.log(Level.SEVERE, fileName, ex);
			throw new RuntimeException(ex);
		}
	}

	/**
	 * @param sourceFolder
	 * @param winItem
	 * @param tabItem
	 * @param tableLike
	 * @throws JSONException
	 */
	public static void generateSource(String sourceFolder, String winItem, String tabItem) throws JSONException {
		MTab tab = null;
		if (sourceFolder == null || sourceFolder.trim().length() == 0) {
			throw new IllegalArgumentException("Must specify source folder");
		}

		File file = new File(sourceFolder);
		if (!file.exists()) {
			throw new IllegalArgumentException("Source folder doesn't exists. sourceFolder=" + sourceFolder);
		}

		Language tmp = Language.getLanguage("pt_BR");
		Language language = new Language(tmp.getName(), tmp.getAD_Language(), tmp.getLocale(), tmp.isDecimalPoint(),
		tmp.getDateFormat().toPattern(), tmp.getMediaSize());
		Env.verifyLanguage(Env.getCtx(), language);
		Env.setContext(Env.getCtx(), Env.LANGUAGE, language.getAD_Language());
		Env.setContext(Env.getCtx(), "#Locale", language.getLocale().toString());

		StringBuilder directory = new StringBuilder().append(sourceFolder.trim());
	//	String packagePath = winItem.replace(".", File.separator);
		folder = directory;

		if (!(directory.toString().endsWith("/") || directory.toString().endsWith("\\"))) {
			directory.append(File.separator);
		}

		if (File.separator.equals("/")) {
			directory = new StringBuilder(directory.toString().replaceAll("[\\\\]", File.separator));
		} else {
			directory = new StringBuilder(directory.toString().replaceAll("[/]", File.separator));
		}
		file = new File(directory.toString());
		if (!file.exists()){
			file.mkdirs();
		}

		if (winItem == null || winItem.trim().length() == 0) {
			throw new IllegalArgumentException("Must specify Window name");
		}

//		StringBuilder tabsFilter = new StringBuilder();
		if (tabItem != null && tabItem.trim().length() > 0) {
			if (winItem.equals("ALL") && tabItem.equals("ALL")) {
				List<MMenu> menu = new Query(Env.getCtx(),MMenu.Table_Name,"", null)
					.setOnlyActiveRecords(true)
					.setOrderBy(MMenu.COLUMNNAME_Action+","+MMenu.COLUMNNAME_Name)
					.list();
				for (MMenu item:menu) {
					if (item.getAction() == null) continue;
					if (item.getAction().equals("F")){ //Workflow
						MWorkflow wf = new Query(Env.getCtx(), MWorkflow.Table_Name, MWorkflow.COLUMNNAME_AD_Workflow_ID + "= ?", null)
							.setParameters(item.getAD_Workflow_ID())
							.first();
						new DocBookGenerator(directory.toString(), wf);
					} else if (item.getAction().equals("P")||item.getAction().equals("R")) {
							//Process or Report
							MProcess process = new Query(Env.getCtx(),MProcess.Table_Name,MProcess.COLUMNNAME_AD_Process_ID+"=?",null)
								.setParameters(item.getAD_Process_ID())
								.first();
							new DocBookGenerator(directory.toString(), process);
						} else if (item.getAction().equals("W")) {
							//Window
							MWindow win = new Query(Env.getCtx(), MWindow.Table_Name, MWindow.COLUMNNAME_AD_Window_ID+" = ?", null)
								.setParameters(item.getAD_Window_ID())
								.first();
							new DocBookGenerator(0, directory.toString(), win.getName());
					} else if (item.getAction().equals("X")) {
						MForm form = new Query(Env.getCtx(),MForm.Table_Name,MForm.COLUMNNAME_AD_Form_ID+"=?", null)
							.setParameters(item.getAD_Form_ID())
							.first();
						new DocBookGenerator(directory.toString(), form);
					}
				}

				//get all Info Windows independently
				List<MInfoWindow>infos = new Query(Env.getCtx(),MInfoWindow.Table_Name, "", null)
					.list();
				for (MInfoWindow info:infos) {
					new DocBookGenerator(directory.toString(), info);
				}

			} else if (winItem.equals("Process")) {
				MProcess process = new Query(Env.getCtx(),MProcess.Table_Name,MProcess.COLUMNNAME_Name + "=?", null)
					.setParameters(tabItem)
					.first();
				new DocBookGenerator(directory.toString(), process);
			} else if (winItem.equals("Workflow")) {
				MWorkflow workflow = new Query(Env.getCtx(),MWorkflow.Table_Name,MWorkflow.COLUMNNAME_Name + "=?", null)
					.setParameters(tabItem)
					.first();
				new DocBookGenerator(directory.toString(), workflow);
			} else if (winItem.equals("InfoWindow")) {
				MInfoWindow info = new Query(Env.getCtx(),MInfoWindow.Table_Name,MInfoWindow.COLUMNNAME_Name+"=?",null)
					.setParameters(tabItem)
					.first();
				new DocBookGenerator(directory.toString(), info);
			} else {
				MWindow win = new Query(Env.getCtx(), MWindow.Table_Name, "Name = ?", null)
					.setParameters(winItem)
					.first();
				int tabID = 0;
				if (!tabItem.equals("ALL")) {
					tab = new Query(Env.getCtx(), MTab.Table_Name, MTab.COLUMNNAME_AD_Window_ID+" = ? AND Name = ?", null)
						.setParameters(win.getAD_Window_ID(), tabItem)
						.first();
					tabID = tab.getAD_Tab_ID();
				}

				new DocBookGenerator(tabID, directory.toString(), winItem);
			}
		}


		menuJanelasJSON.put("Janelas", menuJanelasArray);
		menuRelatoriosJSON.put("Relatorios", menuRelatoriosArray);
		menuWorkflowJSON.put("Workflows", menuWorkflowArray);
		menuProcessosJSON.put("Processos", menuProcessosArray);
		menuFormularioJSON.put("Formularios", menuFormularioArray);
		menuInfoPanelJSON.put("Info", menuInfoPanelArray);

		docJSON.put("manual_janela", menuJanelasJSON);
		docJSON.put("manual_workflow", menuWorkflowJSON);
		docJSON.put("manual_formulario", menuFormularioJSON);
		docJSON.put("manual_processos", menuProcessosJSON);
		docJSON.put("manual_relatorios", menuRelatoriosJSON);
		docJSON.put("manual_info", menuInfoPanelJSON);

		menuHTML.append("</ul>");
		menuJanelas.append("</ul>");
		menuProcessos.append("</ul>");
		menuRelatorios.append("</ul>");
		menuWorkFlow.append("</ul>");
		menuInfoPane.append("</ul>");
		menuFormulario.append("</ul>");

		writeToFile(new StringBuilder(docJSON.toString()), directory + "/brerp-saas.docbook/docbook/Docusaurus/website/sidebars.json");
		writeToFile(menuHTML, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceGeral.html");
		writeToFile(menuJanelas, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceJanelas.html");
		writeToFile(menuProcessos, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceProcessos.html");
		writeToFile(menuRelatorios, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceRelatorios.html");
		writeToFile(menuWorkFlow, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceWorkFlow.html");
		writeToFile(menuInfoPane, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceInfoPane.html");
		writeToFile(menuFormulario, directory + "/brerp-saas.docbook/docbook/Docusaurus/website/IndiceFormulario.html");

		String menuManual = "<ul> <li><h1><a href=\"IndiceWorkFlow\">WorkFlow do Sistema</a> </h1>  </li><br>"
							+ "<li><h1><a href=\"IndiceProcessos\">Processos do Sistema</a> </h1>  </li><br>"
							+ "<li><h1><a href=\"IndiceRelatorios\">Relatórios do Sistema</a> </h1>  </li><br>"
							+ "<li><h1><a href=\"IndiceJanelas\">Janelas do Sistema</a> </h1> </li><br>"
							+ "<li><h1><a href=\"IndiceFormulario\">Formulários do Sistema</a> </h1> </li><br>"
							+ "<li><h1><a href=\"IndiceInfoPane\">Informações do Sistema</a> </h1></li><br>"
							+ "<li><h1><a href=\"IndiceInfoPane\">Indice Geral</a> </h1></li></ul>";

		writeToFile(new StringBuilder(menuManual), directory + "/brerp-saas.docbook/docbook/Docusaurus/website/menuManual.html");

	}

	private String getTrlCampo (int $idCampo) {

		String sql = "select name from ad_reference_trl where ad_language='pt_BR' and ad_reference_id=" + $idCampo, result = null;

		PreparedStatement stmt = DB.prepareStatement(sql, null);
		ResultSet rs = null;

		try {
			rs = stmt.executeQuery();
			while (rs.next()) {
				result = rs.getString("name");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			DB.close(rs, stmt);
		}
		return result;
	}

	public static String forHTML(String aText){
	     final StringBuilder result = new StringBuilder();
	     final StringCharacterIterator iterator = new StringCharacterIterator(aText);
	     char character =  iterator.current();
	     while (character != CharacterIterator.DONE ){
	       if (character == '<') {
	         result.append("&lt;");
	       }
	       else if (character == 'á') {
		         result.append("&aacute;");
		   }
	       else if (character == 'õ') {
		         result.append("&otilde;");
		   }
	       else if (character == 'ó') {
		         result.append("&oacute;");
		   }
	       else if (character == 'ç') {
		         result.append("&ccedil;");
		   }
	       else if (character == 'ã') {
		         result.append("&atilde;");
		   }
	       else if (character == 'ê') {
		         result.append("&ecirc;");
		   }
	       else if (character == '>') {
	         result.append("&gt;");
	       }
	       else if (character == '&') {
	         result.append("&amp;");
	       }
	       else if (character == '\"') {
	         result.append("&quot;");
	       }
	       else if (character == '\t') {
	         addCharEntity(9, result);
	       }
	       else if (character == '!') {
	         addCharEntity(33, result);
	       }
	       else if (character == '#') {
	         addCharEntity(35, result);
	       }
	       else if (character == '$') {
	         addCharEntity(36, result);
	       }
	       else if (character == '%') {
	         addCharEntity(37, result);
	       }
	       else if (character == '\'') {
	         addCharEntity(39, result);
	       }
	       else if (character == '(') {
	         addCharEntity(40, result);
	       }
	       else if (character == ')') {
	         addCharEntity(41, result);
	       }
	       else if (character == '*') {
	         addCharEntity(42, result);
	       }
	       else if (character == '+') {
	         addCharEntity(43, result);
	       }
	       else if (character == ',') {
	         addCharEntity(44, result);
	       }
	       else if (character == '-') {
	         addCharEntity(45, result);
	       }
	       else if (character == '.') {
	         addCharEntity(46, result);
	       }
	       else if (character == '/') {
	         addCharEntity(47, result);
	       }
	       else if (character == ':') {
	         addCharEntity(58, result);
	       }
	       else if (character == ';') {
	         addCharEntity(59, result);
	       }
	       else if (character == '=') {
	         addCharEntity(61, result);
	       }
	       else if (character == '?') {
	         addCharEntity(63, result);
	       }
	       else if (character == '@') {
	         addCharEntity(64, result);
	       }
	       else if (character == '[') {
	         addCharEntity(91, result);
	       }
	       else if (character == '\\') {
	         addCharEntity(92, result);
	       }
	       else if (character == ']') {
	         addCharEntity(93, result);
	       }
	       else if (character == '^') {
	         addCharEntity(94, result);
	       }
	       else if (character == '_') {
	         addCharEntity(95, result);
	       }
	       else if (character == '`') {
	         addCharEntity(96, result);
	       }
	       else if (character == '{') {
	         addCharEntity(123, result);
	       }
	       else if (character == '|') {
	         addCharEntity(124, result);
	       }
	       else if (character == '}') {
	         addCharEntity(125, result);
	       }
	       else if (character == '~') {
	         addCharEntity(126, result);
	       }
	       else {
	         //the char is not a special one
	         //add it to the result as is
	         result.append(character);
	       }
	       character = iterator.next();
	     }
	     return result.toString();
	  }

	 private static void addCharEntity(Integer aIdx, StringBuilder aBuilder){
		    String padding = "";
		    if( aIdx <= 9 ){
		       padding = "00";
		    }
		    else if( aIdx <= 99 ){
		      padding = "0";
		    }
		    else {
		      //no prefix
		    }
		    String number = padding + aIdx.toString();
		    aBuilder.append("&#" + number + ";");
	}
}
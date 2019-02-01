/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2010 Heng Sin Low                							  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.brerp.docbook;

import java.io.File;
import java.util.Map;

import org.compiere.Adempiere;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * @author hengsin
 * @author tbayen - command line start
 *
 */
public class DocBookGeneratorApplication implements IApplication {

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	@Override
	public Object start(IApplicationContext context) throws Exception {
		new ResourcesPlugin();
		String path = new File(".").getAbsolutePath();
		//String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		Adempiere.startup(false);
		Map<?, ?> args = context.getArguments();
		// IDEMPIERE-1686 - GenerateModel does not take commandline arguments
		String commandlineArgs[] = (String[]) args.get("application.args");
		if (commandlineArgs.length == 3) {
			String folder = commandlineArgs[0];
			String menuItem = commandlineArgs[1];
			String tabItem = commandlineArgs[2];
			System.out.print(folder);
			System.out.print(menuItem);
			System.out.print(tabItem);
			DocBookGenerator.generateSource(folder, menuItem, tabItem);
		} else if (commandlineArgs.length != 0) {
			System.out.println("usage:DocGenerator folder menuItem tabItem");
		} else {
			DocBookGenerator.generateSource(path, "ALL", "ALL");
		}
		return IApplication.EXIT_OK;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	@Override
	public void stop() {
	}

}
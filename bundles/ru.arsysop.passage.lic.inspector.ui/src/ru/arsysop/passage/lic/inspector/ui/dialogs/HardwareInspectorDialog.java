/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.inspector.ui.dialogs;

import java.io.ByteArrayOutputStream;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import ru.arsysop.passage.lic.inspector.HardwareInspector;

public class HardwareInspectorDialog extends TrayDialog {
	
	private final HardwareInspector hardwareInspector;

	public HardwareInspectorDialog(HardwareInspector inspector, Shell shell) {
		super(shell);
		this.hardwareInspector = inspector;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Hardware Inspector");
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Text text = new Text(area, SWT.MULTI);
		text.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		StringBuilder infoBuilder = new StringBuilder();
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()){
			hardwareInspector.dumpHardwareInfo(baos);
			infoBuilder.append(new String(baos.toByteArray()));
		} catch (Exception e) {
			infoBuilder.append(e.getMessage());
		}
		text.setText(infoBuilder.toString());
		return area;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

}

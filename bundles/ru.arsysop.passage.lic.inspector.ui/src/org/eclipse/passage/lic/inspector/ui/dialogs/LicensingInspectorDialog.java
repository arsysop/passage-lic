/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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
package org.eclipse.passage.lic.inspector.ui.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.passage.lic.inspector.HardwareInspector;
import org.eclipse.passage.lic.inspector.ui.LicInspectorUi;
import org.eclipse.passage.lic.jface.LicensingImages;
import org.eclipse.passage.lic.jface.RestrictionVerdictLabels;
import org.eclipse.passage.lic.runtime.ConfigurationRequirement;
import org.eclipse.passage.lic.runtime.RestrictionVerdict;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class LicensingInspectorDialog extends TitleAreaDialog {

	public static final int HARDWARE_INSPECTOR_ID = IDialogConstants.CLIENT_ID + 1;

	private final LicensingImages licensingImages;
	private HardwareInspector hardwareInspector;

	private String contactText = ""; //$NON-NLS-1$

	private final List<ConfigurationRequirement> requirements = new ArrayList<>();
	private final List<RestrictionVerdict> restrictions = new ArrayList<>();
	private final Map<String, List<RestrictionVerdict>> map = new HashMap<>();

	private TableViewer tableViewer;

	public LicensingInspectorDialog(Shell shell, LicensingImages images, String contacts) {
		super(shell);
		this.licensingImages = images;
		if (contacts != null) {
			contactText = contacts;
		}
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Licensing");
		newShell.setImage(licensingImages.getImage(LicensingImages.IMG_DEFAULT));
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Licensing status");
		RestrictionVerdict last = RestrictionVerdictLabels.resolveLastVerdict(restrictions);
		if (last == null) {
			setMessage(RestrictionVerdictLabels.resolveSummary(last));
		} else {
			setErrorMessage(RestrictionVerdictLabels.resolveSummary(last));
		}
		Composite area = (Composite) super.createDialogArea(parent);
		createAreaContent(area);
		Dialog.applyDialogFont(area);
		return area;
	}

	private void createAreaContent(Composite area) {
		Composite contents = new Composite(area, SWT.NONE);
		contents.setLayout(new GridLayout(1, false));
		contents.setLayoutData(new GridData(GridData.FILL_BOTH));
		Table tableDetails = new Table(contents, SWT.BORDER);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		tableDetails.setLayoutData(layoutData);
		tableDetails.setHeaderVisible(true);
		tableDetails.setLinesVisible(true);

		tableViewer = new TableViewer(tableDetails);
		tableViewer.setContentProvider(new ArrayContentProvider());

		TableViewerColumn columnStatusImage = createColumnViewer(tableViewer, "", 20);
		columnStatusImage.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof ConfigurationRequirement) {
					ConfigurationRequirement req = (ConfigurationRequirement) element;
					List<RestrictionVerdict> verdicts = map.get(req.getFeatureIdentifier());
					String imageKey = RestrictionVerdictLabels.resolveImageKey(verdicts);
					return licensingImages.getImage(imageKey);
				}
				return super.getImage(element);
			}

		});
		TableViewerColumn columnFeatureId = createColumnViewer(tableViewer, "Feature Id", 200);
		columnFeatureId.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigurationRequirement) {
					ConfigurationRequirement requirement = (ConfigurationRequirement) element;
					return requirement.getFeatureIdentifier();
				}
				return super.getText(element);
			}
		});
		TableViewerColumn columnFeatureName = createColumnViewer(tableViewer, "Feature Name", 200);
		columnFeatureName.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigurationRequirement) {
					ConfigurationRequirement requirement = (ConfigurationRequirement) element;
					return requirement.getFeatureName();
				}
				return super.getText(element);
			}
		});
		TableViewerColumn columnFeatureVersion = createColumnViewer(tableViewer, "Version",
				100);
		columnFeatureVersion.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigurationRequirement) {
					ConfigurationRequirement requirement = (ConfigurationRequirement) element;
					return requirement.getFeatureVersion();
				}
				return super.getText(element);
			}
		});

		TableViewerColumn columnLicenseStatus = createColumnViewer(tableViewer, "Status",
				200);
		columnLicenseStatus.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof ConfigurationRequirement) {
					ConfigurationRequirement req = (ConfigurationRequirement) element;
					List<RestrictionVerdict> verdicts = map.get(req.getFeatureIdentifier());
					return RestrictionVerdictLabels.resolveLabel(verdicts);
				}
				return super.getText(element);
			}

		});

		tableViewer.setInput(requirements);

		Group contactsGroup = new Group(area, SWT.NONE);
		contactsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		contactsGroup.setText("Please contact your Licensing Operator for details");
		contactsGroup.setFont(JFaceResources.getDialogFont());
		contactsGroup.setLayout(new GridLayout());
		StyledText contactsText = new StyledText(contactsGroup, SWT.READ_ONLY | SWT.MULTI);
		contactsText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		contactsText.setText(contactText);
		contactsText.setFont(JFaceResources.getDialogFont());
	}

	private TableViewerColumn createColumnViewer(TableViewer tableViewDetails, String columnName, int width) {
		TableViewerColumn columnViewer = new TableViewerColumn(tableViewDetails, SWT.NONE);
		TableColumn column = columnViewer.getColumn();
		column.setText(columnName);
		column.setWidth(width);
		column.setResizable(true);
		return columnViewer;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.CLOSE_ID, IDialogConstants.CLOSE_LABEL, true);
		createButton(parent, HARDWARE_INSPECTOR_ID, "Inspect", false);
		Button inspector = getButton(HARDWARE_INSPECTOR_ID);
		inspector.setImage(licensingImages.getImage(LicInspectorUi.IMG_INSPECTOR));
		inspector.setEnabled(hardwareInspector != null);
	}

	public void setHardwareInspector(HardwareInspector hardwareInspector) {
		this.hardwareInspector = hardwareInspector;
	}
	
	public void updateLicensingStatus(Iterable<ConfigurationRequirement> required, Iterable<RestrictionVerdict> verdicts) {
		requirements.clear();
		restrictions.clear();
		required.forEach(requirements::add);
		for (RestrictionVerdict verdict : verdicts) {
			ConfigurationRequirement requirement = verdict.getConfigurationRequirement();
			
			String featureId = requirement.getFeatureIdentifier();
			List<RestrictionVerdict> list = map.computeIfAbsent(featureId, key -> new ArrayList<>());
			list.add(verdict);
			restrictions.add(verdict);
		}
		if (tableViewer != null && !tableViewer.getControl().isDisposed()) {
			tableViewer.setInput(requirements);
		}
	}

	@Override
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case HARDWARE_INSPECTOR_ID:
			hardwareInspectorPressed();
			break;
		default:
			okPressed();
			break;
		}
	}

	protected void hardwareInspectorPressed() {
		HardwareInspectorDialog dialog = new HardwareInspectorDialog(licensingImages, hardwareInspector, getShell());
		dialog.open();
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

}

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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ru.arsysop.passage.lic.base.ui.LicensingImages;
import ru.arsysop.passage.lic.inspector.HardwareInspector;
import ru.arsysop.passage.lic.inspector.ui.LicInspectorUi;
import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class LicensingInspectorDialog extends TitleAreaDialog {

	private static final String LICENSING_MSG_ERROR = "The following features are not licensed.";
	private static final String LICENSING_MSG_OK = "The product is licensed properly.";
	private static final String DETAIL_MSG = "Please contact your Licensing Operator for details.";
	private static final String DIALOG_TITLE = "Licensing";
	private static final String HEAD_MSG = "Licensing status";
	private static final String COLUMN_FEATURE_ID = "Feature id";
	private static final String COLUMN_FEATURE_NAME = "Feature name";
	private static final String COLUMN_FEATURE_VERSION = "Feature version";
	private static final String COLUMN_LISENCING_STATUS = "Licensing status";

	public static final int HARDWARE_INSPECTOR_ID = IDialogConstants.CLIENT_ID + 1;

	private final LicensingImages licensingImages;
	private HardwareInspector hardwareInspector;

	private final List<RestrictionVerdict> restrictions = new ArrayList<>();

	public LicensingInspectorDialog(Shell shell, LicensingImages images, Iterable<RestrictionVerdict> verdicts) {
		super(shell);
		this.licensingImages = images;
		for (RestrictionVerdict restrictionVerdict : verdicts) {
			restrictions.add(restrictionVerdict);
		}
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(DIALOG_TITLE);
		newShell.setImage(licensingImages.getImage(LicensingImages.IMG_DEFAULT));
		;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle(HEAD_MSG);
		if (restrictions.size() == 0) {
			setMessage(LICENSING_MSG_OK);
		} else {
			setErrorMessage(LICENSING_MSG_ERROR);
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

		TableViewer tableViewDetails = new TableViewer(tableDetails);
		tableViewDetails.setContentProvider(new ArrayContentProvider());

		TableViewerColumn columnFeatureIdViewer = createColumnViewer(tableViewDetails, COLUMN_FEATURE_ID, 200);
		columnFeatureIdViewer.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof RestrictionVerdict) {
					RestrictionVerdict verdict = (RestrictionVerdict) element;
					ConfigurationRequirement configurationRequirement = verdict.getConfigurationRequirement();
					if (configurationRequirement != null) {
						return configurationRequirement.getFeatureIdentifier();
					}
				}
				return "";
			}
		});
		TableViewerColumn columnFeatureNameViewer = createColumnViewer(tableViewDetails, COLUMN_FEATURE_NAME, 200);
		columnFeatureNameViewer.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof RestrictionVerdict) {
					RestrictionVerdict verdict = (RestrictionVerdict) element;
					ConfigurationRequirement configurationRequirement = verdict.getConfigurationRequirement();
					if (configurationRequirement != null) {
						return configurationRequirement.getFeatureName();
					}
				}
				return "";
			}
		});
		TableViewerColumn columnFeatureVersionViewer = createColumnViewer(tableViewDetails, COLUMN_FEATURE_VERSION,
				100);
		columnFeatureVersionViewer.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof RestrictionVerdict) {
					RestrictionVerdict verdict = (RestrictionVerdict) element;
					ConfigurationRequirement configurationRequirement = verdict.getConfigurationRequirement();
					if (configurationRequirement != null) {
						return configurationRequirement.getFeatureVersion();
					}
				}
				return "";
			}
		});

		TableViewerColumn columnLicenseStatusViewer = createColumnViewer(tableViewDetails, COLUMN_LISENCING_STATUS,
				200);
		columnLicenseStatusViewer.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof RestrictionVerdict) {
					RestrictionVerdict verdict = (RestrictionVerdict) element;
					ConfigurationRequirement configurationRequirement = verdict.getConfigurationRequirement();
					if (configurationRequirement != null) {
						return configurationRequirement.getRestrictionLevel();
					}
				}
				return "";
			}

			@Override
			public Image getImage(Object element) {
				if (element instanceof RestrictionVerdict) {
					RestrictionVerdict verdict = (RestrictionVerdict) element;
					ConfigurationRequirement configurationRequirement = verdict.getConfigurationRequirement();
					if (configurationRequirement != null) {
						getImageByResctrictionLevel(configurationRequirement.getRestrictionLevel());
					}
				}
				return null;
			}

		});

		tableViewDetails.setInput(restrictions);

		GridData layoutDataOperatorText = new GridData(SWT.FILL, SWT.FILL, true, false);
		Label contacts = new Label(area, SWT.NONE);
		contacts.setLayoutData(layoutDataOperatorText);
		contacts.setText(DETAIL_MSG);
		contacts.setFont(JFaceResources.getDialogFont());
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

	private Image getImageByResctrictionLevel(String restrictionLevel) {
		Image levelImg = null;
		if (licensingImages == null) {
			return levelImg;
		}
		switch (restrictionLevel) {
		case "warn":
			levelImg = licensingImages.getImage(LicensingImages.IMG_LEVEL_WARN);
			break;

		case "error":
			levelImg = licensingImages.getImage(LicensingImages.IMG_LEVEL_ERROR);
			break;

		default:
			levelImg = licensingImages.getImage(LicensingImages.IMG_LEVEL_OK);
			break;
		}

		return levelImg;
	}

}

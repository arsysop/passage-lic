/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.jface;

import org.eclipse.swt.graphics.Color;

public interface LicensingColors {

	String COLOR_VALIDATION_OK = "COLOR_VALIDATION_OK"; //$NON-NLS-1$
	String COLOR_VALIDATION_ERROR = "COLOR_VALIDATION_ERROR"; //$NON-NLS-1$

	Color getColor(String identifier);

}

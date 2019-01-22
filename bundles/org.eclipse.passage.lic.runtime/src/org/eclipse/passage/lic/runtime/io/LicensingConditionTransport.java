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
package org.eclipse.passage.lic.runtime.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.passage.lic.runtime.LicensingCondition;

/**
 * Transport interface for {@link LicensingCondition}(s)
 */
public interface LicensingConditionTransport {

	/**
	 * Reads {@link LicensingCondition}(s) from the given {@link InputStream}. 
	 *
	 */
	Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException;

	/**
	 * Writes {@link LicensingCondition}(s) from the given {@link OutputStream}. 
	 *
	 */
	void writeConditionDescriptors(Iterable<LicensingCondition> conditions, OutputStream output) throws IOException;

}

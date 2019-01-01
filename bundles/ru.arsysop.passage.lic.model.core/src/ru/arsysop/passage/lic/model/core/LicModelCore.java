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
package ru.arsysop.passage.lic.model.core;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;

public class LicModelCore {
	
	public static final String BUNDLE_SYMBOLIC_NAME = "ru.arsysop.passage.lic.model.core"; //$NON-NLS-1$

	public static final String FILE_EXTENSION_FEATURES = "lic_features";  //$NON-NLS-1$
	public static final String FILE_EXTENSION_PRODUCTS = "lic_products";  //$NON-NLS-1$
	
	public static final String FILE_EXTENSION_CONDITIONS = "lic_conditions";  //$NON-NLS-1$
	public static final String FILE_EXTENSION_USERS = "lic_users";  //$NON-NLS-1$

	public static IStatus save(Resource resource) {
		try {
			//FIXME: define parameters
			resource.save(null);
			return Status.OK_STATUS;
		} catch (IOException e) {
			return new Status(IStatus.ERROR, BUNDLE_SYMBOLIC_NAME, "Error saving resource", e);
		}
	}

}

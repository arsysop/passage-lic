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
package ru.arsysop.passage.lic.base;

public final class LicensingNamespaces {

	public static final String CAPABILITY_LICENSING_MANAGEMENT = "licensing.management"; //$NON-NLS-1$
	
	public static final String CAPABILITY_LICENSING_CONFIGURATION = "licensing.configuration"; //$NON-NLS-1$
	public static final String CAPABILITY_LICENSING_FEATURE = "licensing.feature"; //$NON-NLS-1$

	public static final String ATTRIBUTE_VERSION = "version"; //$NON-NLS-1$
	public static final String ATTRIBUTE_NAME = "name"; //$NON-NLS-1$

	public static final String ATTRIBUTE_LEVEL = "level"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_FATAL = "fatal"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_ERROR = "error"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_WARN = "warn"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_DEFAULT = ATTRIBUTE_LEVEL_WARN;

	private LicensingNamespaces() {
		// block
	}

	public static String toLevelAttribute(Object object) {
		if (object instanceof String) {
			String level = (String) object;
			if (ATTRIBUTE_LEVEL_WARN.equalsIgnoreCase(level)) {
				return ATTRIBUTE_LEVEL_WARN;
			}
			if (ATTRIBUTE_LEVEL_ERROR.equalsIgnoreCase(level)) {
				return ATTRIBUTE_LEVEL_ERROR;
			}
			if (ATTRIBUTE_LEVEL_FATAL.equalsIgnoreCase(level)) {
				return ATTRIBUTE_LEVEL_FATAL;
			}
		}
		return ATTRIBUTE_LEVEL_DEFAULT;
	}

}

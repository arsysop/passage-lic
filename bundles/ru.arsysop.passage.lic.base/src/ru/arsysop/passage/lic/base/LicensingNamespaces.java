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
package ru.arsysop.passage.lic.base;

public final class LicensingNamespaces {

	public static final String CAPABILITY_LICENSING_MANAGEMENT = "licensing.management"; //$NON-NLS-1$
	
	public static final String CAPABILITY_LICENSING_CONFIGURATION = "licensing.configuration"; //$NON-NLS-1$
	public static final String CAPABILITY_LICENSING_FEATURE = "licensing.feature"; //$NON-NLS-1$

	public static final String ATTRIBUTE_VERSION = "version"; //$NON-NLS-1$
	public static final String ATTRIBUTE_VERSION_DEFAULT = "0.0.0"; //$NON-NLS-1$

	public static final String ATTRIBUTE_RULE = "rule"; //$NON-NLS-1$
	public static final String ATTRIBUTE_RULE_PERFECT = "perfect"; //$NON-NLS-1$
	public static final String ATTRIBUTE_RULE_EQUIVALENT = "equivalent"; //$NON-NLS-1$
	public static final String ATTRIBUTE_RULE_COMPATIBLE = "compatible"; //$NON-NLS-1$
	public static final String ATTRIBUTE_RULE_GREATER_OR_EQUAL = "greaterOrEqual"; //$NON-NLS-1$
	public static final String ATTRIBUTE_RULE_DEFAULT = ATTRIBUTE_RULE_COMPATIBLE;

	public static final String ATTRIBUTE_LEVEL = "level"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_FATAL = "fatal"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_ERROR = "error"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_WARN = "warn"; //$NON-NLS-1$
	public static final String ATTRIBUTE_LEVEL_DEFAULT = ATTRIBUTE_LEVEL_WARN;

	public static final String ATTRIBUTE_KEYPATH = "keypath"; //$NON-NLS-1$

	private LicensingNamespaces() {
		// block
	}

	public static String toVersionAttribute(Object object) {
		if (object instanceof String) {
			String version = (String) object;
			version = version.trim();
			if (version.length() == 0) {
				return ATTRIBUTE_VERSION_DEFAULT;
			}
			String[] split = version.split("\\."); //$NON-NLS-1$
			if (split.length > 4) {
				return ATTRIBUTE_VERSION_DEFAULT;
			}
			return version;
		}
		return ATTRIBUTE_VERSION_DEFAULT;
	}

	public static String toRuleAttribute(Object object) {
		if (object instanceof String) {
			String rule = (String) object;
			if (ATTRIBUTE_RULE_GREATER_OR_EQUAL.equalsIgnoreCase(rule)) {
				return ATTRIBUTE_RULE_GREATER_OR_EQUAL;
			}
			if (ATTRIBUTE_RULE_COMPATIBLE.equalsIgnoreCase(rule)) {
				return ATTRIBUTE_RULE_COMPATIBLE;
			}
			if (ATTRIBUTE_RULE_EQUIVALENT.equalsIgnoreCase(rule)) {
				return ATTRIBUTE_RULE_EQUIVALENT;
			}
			if (ATTRIBUTE_RULE_PERFECT.equalsIgnoreCase(rule)) {
				return ATTRIBUTE_RULE_PERFECT;
			}
		}
		return ATTRIBUTE_RULE_DEFAULT;
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

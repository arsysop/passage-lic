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

public final class LicensingProperties {

	public static final String LICENSING_PRODUCT_IDENTIFIER = "licensing.product.identifier"; //$NON-NLS-1$
	public static final String LICENSING_PRODUCT_VERSION = "licensing.product.version"; //$NON-NLS-1$

	public static final String LICENSING_FEATURE_IDENTIFIER = "licensing.feature.identifier"; //$NON-NLS-1$
	public static final String LICENSING_FEATURE_VERSION = "licensing.feature.version"; //$NON-NLS-1$
	public static final String LICENSING_FEATURE_NAME = "licensing.feature.name"; //$NON-NLS-1$
	
	public static final String LICENSING_RESTRICTION_LEVEL = "licensing.restriction.level"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_FATAL = "fatal"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_ERROR = "error"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_WARN = "warn"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_DEFAULT = LICENSING_RESTRICTION_LEVEL_WARN;
	
	public static final String LICENSING_LEASE_TIME = "licensing.lease.time"; //$NON-NLS-1$
	public static final String LICENSING_EXPIRE_TIME = "licensing.expire.time"; //$NON-NLS-1$

	public static final String LICENSING_CONDITION_TYPE = "licensing.condition.type"; //$NON-NLS-1$
	public static final String LICENSING_CONDITION_AREA = "licensing.condition.area"; //$NON-NLS-1$

	public static final String LICENSING_CONTENT_TYPE = "licensing.content.type"; //$NON-NLS-1$
	public static final String LICENSING_CONTENT_TYPE_JSON = "application/json"; //$NON-NLS-1$
	public static final String LICENSING_CONTENT_TYPE_XML = "application/xml"; //$NON-NLS-1$

	public static final String LICENSING_SECURITY_KEY_ALGO = "licensing.security.key.algo"; //$NON-NLS-1$
	public static final String LICENSING_SECURITY_KEY_ALGO_RSA = "RSA"; //$NON-NLS-1$
	public static final String LICENSING_SECURITY_KEY_SIZE = "licensing.security.key.size"; //$NON-NLS-1$
	public static final int LICENSING_SECURITY_KEY_SIZE_1024 = 1024;
	public static final String LICENSING_SECURITY_HASH_ALGO = "licensing.security.hash.algo"; //$NON-NLS-1$

	private LicensingProperties() {
		// block
	}
	
	public static String toRestrictionLevelProperty(Object object) {
		if (object instanceof String) {
			String level = (String) object;
			if (LICENSING_RESTRICTION_LEVEL_WARN.equalsIgnoreCase(level)) {
				return LICENSING_RESTRICTION_LEVEL_WARN;
			}
			if (LICENSING_RESTRICTION_LEVEL_ERROR.equalsIgnoreCase(level)) {
				return LICENSING_RESTRICTION_LEVEL_ERROR;
			}
			if (LICENSING_RESTRICTION_LEVEL_FATAL.equalsIgnoreCase(level)) {
				return LICENSING_RESTRICTION_LEVEL_FATAL;
			}
		}
		return LICENSING_RESTRICTION_LEVEL_DEFAULT;
	}

}

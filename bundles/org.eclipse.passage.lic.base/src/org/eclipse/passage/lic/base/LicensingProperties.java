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
package org.eclipse.passage.lic.base;

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

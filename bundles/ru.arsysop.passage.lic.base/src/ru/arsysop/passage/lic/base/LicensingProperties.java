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

public final class LicensingProperties {

	public static final String LICENSING_FEATURE_IDENTIFIER = "licensing.feature.identifier"; //$NON-NLS-1$
	
	public static final String LICENSING_MATCH_VERSION = "licensing.match.version"; //$NON-NLS-1$
	public static final String LICENSING_MATCH_VERSION_DEFAULT = "0.0.0"; //$NON-NLS-1$
	
	public static final String LICENSING_MATCH_RULE = "licensing.match.rule"; //$NON-NLS-1$
	public static final String LICENSING_MATCH_RULE_COMPATIBLE = "compatible"; //$NON-NLS-1$
	public static final String LICENSING_MATCH_RULE_EXACT = "exact"; //$NON-NLS-1$
	public static final String LICENSING_MATCH_RULE_DEFAULT = LICENSING_MATCH_RULE_COMPATIBLE;
	
	public static final String LICENSING_RESTRICTION_LEVEL = "licensing.restriction.level"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_FATAL = "fatal"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_ERROR = "error"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_WARN = "warn"; //$NON-NLS-1$
	public static final String LICENSING_RESTRICTION_LEVEL_DEFAULT = LICENSING_RESTRICTION_LEVEL_WARN;
	
	public static final String LICENSING_LEASE_TIME = "licensing.lease.time"; //$NON-NLS-1$
	public static final String LICENSING_EXPIRE_TIME = "licensing.expire.time"; //$NON-NLS-1$

	public static final String LICENSING_CONDITION_TYPE = "licensing.condition.type"; //$NON-NLS-1$

	public static final String LICENSING_CONTENT_TYPE = "licensing.content.type"; //$NON-NLS-1$
	public static final String LICENSING_CONTENT_TYPE_JSON = "application/json"; //$NON-NLS-1$
	public static final String LICENSING_CONTENT_TYPE_XML = "application/xml"; //$NON-NLS-1$

	private LicensingProperties() {
		// block
	}

}

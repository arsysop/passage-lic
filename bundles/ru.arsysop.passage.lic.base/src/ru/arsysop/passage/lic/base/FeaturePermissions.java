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

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;

public class FeaturePermissions {

	private FeaturePermissions() {
		// block
	}

	public static BaseFeaturePermission createDefault(String featureId) {
		String version = LICENSING_MATCH_VERSION_DEFAULT;
		String rule = LICENSING_MATCH_RULE_DEFAULT;
		long leaseTime = System.currentTimeMillis();
		long expireTime = leaseTime + 60*60*1000;
		return new BaseFeaturePermission(featureId, version, rule, leaseTime, expireTime);
	}

	public static BaseFeaturePermission createDefault(ConditionDescriptor condition) {
		long leaseTime = System.currentTimeMillis();
		long expireTime = leaseTime + 60*60*1000;
		String featureId = condition.getAllowedFeatureId();
		String matchVersion = condition.getAllowedFeatureMatchVersion();
		String matchRule = condition.getAllowedFeatureMatchRule();
		return new BaseFeaturePermission(featureId, matchVersion, matchRule, leaseTime, expireTime);
	}

}

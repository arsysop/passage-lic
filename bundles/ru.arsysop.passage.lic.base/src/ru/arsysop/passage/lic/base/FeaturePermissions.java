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

import java.util.Date;

import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class FeaturePermissions {

	private FeaturePermissions() {
		// block
	}

	public static BaseFeaturePermission createDefault(LicensingCondition condition, LicensingConfiguration configuration) {
		Date leaseTime = new Date();
		Date expireTime = condition.getValidUntil();
		return new BaseFeaturePermission(condition, configuration, leaseTime, expireTime);
	}

	public static BaseFeaturePermission create(LicensingCondition condition, LicensingConfiguration configuration, Date lease, Date expire) {
		return new BaseFeaturePermission(condition, configuration, lease, expire);
	}

}

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

import java.util.Map;

import ru.arsysop.passage.lic.runtime.LicensingConfiguration;

public class LicensingConfigurations {

	public static LicensingConfiguration create(String product, String version) {
		return new BaseLicensingConfiguration(product, version);
	}

	public static LicensingConfiguration create(Map<String, Object> properties) {
		String product = String.valueOf(properties.get(LicensingProperties.LICENSING_PRODUCT_IDENTIFIER));
		String version = String.valueOf(properties.get(LicensingProperties.LICENSING_PRODUCT_VERSION));
		return new BaseLicensingConfiguration(product, version);
	}

	public static String findProductIdentifier(String[] args) {
		if (args == null) {
			return null;
		}
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if ("-product".equals(arg)) {
				int index = i + 1;
				if (index < args.length) {
					return args[index];
				}
	
			}
		}
		return null;
	}

}

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

import java.util.HashMap;
import java.util.Map;

public class LicensingConfigurations {

	public static Map<String, String> createProductConfiguration(String product, String version) {
		Map<String, String> map = new HashMap<>();
		map.put(LicensingProperties.LICENSING_PRODUCT_IDENTIFIER, product);
		map.put(LicensingProperties.LICENSING_PRODUCT_VERSION, version);
		return map;
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

	public static String resolveProductIdentifier(Object configuration) {
		if (Map.class.isInstance(configuration)) {
			Map<?,?> map = (Map<?,?>) configuration;
			Object value = map.get(LicensingProperties.LICENSING_PRODUCT_IDENTIFIER);
			if (value instanceof String) {
				return (String) value;
			}
		}
		if (configuration instanceof String) {
			return (String) configuration;
		}
		if (configuration instanceof String[]) {
			String[] strings = (String[]) configuration;
			return findProductIdentifier(strings);
		}
		return null;
	}

	public static String resolveProductVersion(Object configuration) {
		if (configuration instanceof Map<?,?>) {
			Map<?,?> map = (Map<?,?>) configuration;
			Object value = map.get(LicensingProperties.LICENSING_PRODUCT_VERSION);
			if (value instanceof String) {
				return (String) value;
			}
		}
		if (configuration instanceof String) {
			return (String) configuration;
		}
		return null;
	}

}

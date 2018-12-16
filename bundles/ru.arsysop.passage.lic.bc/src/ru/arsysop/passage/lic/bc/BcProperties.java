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
package ru.arsysop.passage.lic.bc;

import java.util.Map;

import ru.arsysop.passage.lic.base.LicensingProperties;

public class BcProperties {
	
	public static final String KEY_ALGO_DEFAULT = LicensingProperties.LICENSING_SECURITY_KEY_ALGO_RSA;
	public static final int KEY_SIZE_DEFAULT = LicensingProperties.LICENSING_SECURITY_KEY_SIZE_1024;

	private BcProperties() {
		//block
	}
	
	public static String extractKeyAlgo(Map<String, Object> properties) {
		if (properties == null) {
			return KEY_ALGO_DEFAULT;
		}
		Object object = properties.get(LicensingProperties.LICENSING_SECURITY_KEY_ALGO);
		if (object instanceof String) {
			String algo = (String) object;
			return algo;
		}
		return KEY_ALGO_DEFAULT;
	}

	public static int extractKeySize(Map<String, Object> properties) {
		if (properties == null) {
			return KEY_SIZE_DEFAULT;
		}
		Object object = properties.get(LicensingProperties.LICENSING_SECURITY_KEY_SIZE);
		if (object instanceof Integer) {
			Integer size = (Integer) object;
			return size.intValue();
		}
		return KEY_SIZE_DEFAULT;
	}

}

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
package org.eclipse.passage.lic.base;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LicensingConditions {
	
	private static final String SEGMENT_SEPARATOR = ";"; //$NON-NLS-1$
	private static final String VALUE_SEPARATOR = "="; //$NON-NLS-1$

	private LicensingConditions() {
		// block
	}

	public static Map<String, String> parseExpression(String expression) {
		Map<String, String> map = new HashMap<>();
		if (expression == null) {
			//FIXME: report error;
			return map;
		}
		String[] segments = expression.split(SEGMENT_SEPARATOR);
		for (String segment : segments) {
			String[] split = segment.split(VALUE_SEPARATOR);
			if (split.length != 2) {
				//FIXME: report error;
				continue;
			}
			map.put(split[0], split[1]);
		}
		return map;
	}
	
	public static boolean evaluateSegmentValue(String expected, String actual) {
		if (actual == null ) {
			return false;
		}
		String regexp = expected.replaceAll("\\*", ".*"); //$NON-NLS-1$ //$NON-NLS-2$
		return actual.matches(regexp);
	}

	public static BaseLicensingCondition create(String identifier, String version, String rule, Date from, Date until, String type, String expression) {
		return new BaseLicensingCondition(identifier, version, rule, from, until, type, expression);
	}

}

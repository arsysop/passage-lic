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

import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_RESTRICTION_LEVEL_ERROR;
import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_RESTRICTION_LEVEL_FATAL;
import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_RESTRICTION_LEVEL_WARN;

import java.util.Comparator;

import org.eclipse.passage.lic.runtime.RestrictionVerdict;

public class RestrictionVerdictComparator implements Comparator<RestrictionVerdict> {
	
	private static final Integer VALUE_WARN = Integer.valueOf(2);
	private static final Integer VALUE_ERROR = Integer.valueOf(4);
	private static final Integer VALUE_FATAL = Integer.valueOf(8);
	private static final Integer VALUE_DEFAULT = VALUE_WARN;

	@Override
	public int compare(RestrictionVerdict o1, RestrictionVerdict o2) {
		if (o1 == null) {
			if (o2 == null) {
				return 0;
			}
			return -1;
		}
		if (o2 == null) {
			return 1;
		}
		String level1 = o1.getRestrictionLevel();
		String level2 = o2.getRestrictionLevel();
		return compareLevels(level1, level2);
	}

	public static int compareLevels(String level1, String level2) {
		Integer resolved1 = resolveLevel(level1);
		Integer resolved2 = resolveLevel(level2);
		return resolved1.compareTo(resolved2);
	}

	private static Integer resolveLevel(String level) {
		if (level == null) {
			return VALUE_DEFAULT;
		}
		switch (level) {
		case LICENSING_RESTRICTION_LEVEL_WARN:
			return VALUE_WARN;
		case LICENSING_RESTRICTION_LEVEL_ERROR:
			return VALUE_ERROR;
		case LICENSING_RESTRICTION_LEVEL_FATAL:
			return VALUE_FATAL;
		default:
			return VALUE_DEFAULT;
		}
	}
}
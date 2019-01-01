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
package ru.arsysop.passage.lic.base.ui;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;
import static ru.arsysop.passage.lic.base.ui.LicensingImages.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ru.arsysop.passage.lic.base.RestrictionVerdictComparator;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class RestrictionVerdictLabels {
	
	public static String resolveImageKey(Iterable<RestrictionVerdict> verdicts) {
		RestrictionVerdict last = resolveLastVerdict(verdicts);
		return resolveImageKey(last);
	}

	public static String resolveImageKey(RestrictionVerdict verdict) {
		if (verdict == null) {
			return IMG_LEVEL_OK;
		}
		return resolveImageKey(verdict.getRestrictionLevel());
	}

	public static String resolveImageKey(String level) {
		String restriction = level;
		if (restriction == null) {
			restriction = LICENSING_RESTRICTION_LEVEL_DEFAULT;
		}
		switch (restriction) {
		case LICENSING_RESTRICTION_LEVEL_WARN:
			return IMG_LEVEL_WARN;
		case LICENSING_RESTRICTION_LEVEL_ERROR:
			return IMG_LEVEL_ERROR;
		case LICENSING_RESTRICTION_LEVEL_FATAL:
			return IMG_LEVEL_FATAL;
		default:
			return IMG_LEVEL_WARN;
		}
	}

	public static String resolveLabel(Iterable<RestrictionVerdict> verdicts) {
		RestrictionVerdict last = resolveLastVerdict(verdicts);
		return resolveLabel(last);
	}

	public static String resolveLabel(RestrictionVerdict verdict) {
		if (verdict == null) {
			return "OK";
		}
		return resolveLabel(verdict.getRestrictionLevel());
	}

	public static String resolveLabel(String level) {
		String restriction = level;
		if (restriction == null) {
			restriction = LICENSING_RESTRICTION_LEVEL_DEFAULT;
		}
		switch (restriction) {
		case LICENSING_RESTRICTION_LEVEL_WARN:
			return "Warning";
		case LICENSING_RESTRICTION_LEVEL_ERROR:
			return "Error";
		case LICENSING_RESTRICTION_LEVEL_FATAL:
			return "Fatal";
		default:
			return "Warning";
		}
	}

	public static String resolveSummary(RestrictionVerdict verdict) {
		if (verdict == null) {
			return "The product in licensed properly";
		}
		return "There are issues with licensing";
	}

	public static RestrictionVerdict resolveLastVerdict(Iterable<RestrictionVerdict> verdicts) {
		if (verdicts == null) {
			return null;
		}
		List<RestrictionVerdict> list = new ArrayList<>();
		verdicts.forEach(list::add);
		if (list.isEmpty()) {
			return null;
		}
		Collections.sort(list, new RestrictionVerdictComparator());
		RestrictionVerdict last = list.get(list.size()-1);
		return last;
	}

}

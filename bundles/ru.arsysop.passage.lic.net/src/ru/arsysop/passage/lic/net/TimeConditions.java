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
package ru.arsysop.passage.lic.net;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConditions {

	public static final String LICENSING_CONDITION_TYPE_TIME = "time"; //$NON-NLS-1$
	public static final String LICENSING_CONDITION_KEY_LOCALTIMESTAMP = "localtimestamp"; //$NON-NLS-1$

	public static final String LOCALTIMESTAMP_PATTERN_DEFAULT = "yyyy-MM-dd HH:mm"; //$NON-NLS-1$

	public static boolean isFutureLocalDateTime(String value) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TimeConditions.LOCALTIMESTAMP_PATTERN_DEFAULT);
		LocalDateTime dateTime = LocalDateTime.parse(value, formatter);
		LocalDateTime now = LocalDateTime.now();
		Duration duration = Duration.between(now, dateTime);
		return (!duration.isNegative() && !duration.isZero());
	}

}

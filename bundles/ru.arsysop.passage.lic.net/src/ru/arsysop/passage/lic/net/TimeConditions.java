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

public class TimeConditions {

	public static final String LC_TYPE_TIME = "time"; //$NON-NLS-1$
	public static final String LC_KEY_LOCALTIMESTAMP = "localtimestamp"; //$NON-NLS-1$

	private TimeConditions() {
		//block
	}

	public static boolean isFutureLocalDateTime(String value) {
		try {
			LocalDateTime dateTime = LocalDateTime.parse(value);
			LocalDateTime now = LocalDateTime.now();
			Duration duration = Duration.between(now, dateTime);
			return (!duration.isNegative());
		} catch (Exception e) {
			//FIXME: logger.debug(e);
			return false;
		}
	}

}

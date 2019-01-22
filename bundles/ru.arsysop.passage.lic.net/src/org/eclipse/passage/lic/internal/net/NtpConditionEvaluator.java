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
package org.eclipse.passage.lic.internal.net;

import org.eclipse.passage.lic.base.BaseConditionEvaluator;
import org.eclipse.passage.lic.net.TimeConditions;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;

public class NtpConditionEvaluator extends BaseConditionEvaluator {

	private LogService logService;

	@Override
	protected boolean evaluateSegment(String key, String value) {
		switch (key) {
		case TimeConditions.PROPERTY_LOCALTIMESTAMP:
			return TimeConditions.isFutureLocalDateTime(value);
		default:
			return false;
		}
	}

	@Reference
	public void bindLogService(LogService logService) {
		this.logService = logService;
	}
	
	public void unbindLogService(LogService logService) {
		this.logService = logService;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void logError(String message, Throwable e) {
		//FIXME: rework after removing Eclipse Mars support
		logService.log(LogService.LOG_ERROR, message, e);
	}

}

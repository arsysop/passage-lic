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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionEvaluator;
import ru.arsysop.passage.lic.runtime.FeaturePermission;

public abstract class BaseConditionEvaluator implements ConditionEvaluator {

	@Override
	public Iterable<FeaturePermission> evaluateConditions(Iterable<ConditionDescriptor> conditions) {
		List<FeaturePermission> result = new ArrayList<>();
		if (conditions == null) {
			//FIXME: log error;
			return result;
		}
		for (ConditionDescriptor condition : conditions) {
			String expression = condition.getConditionExpression();
			Map<String,String> checks = ConditionDescriptors.parseExpression(expression);
			if (checks.isEmpty()) {
				//FIXME: log error;
				continue;
			}
			Set<String> keySet = checks.keySet();
			
			boolean passed = true;
			for (String key : keySet) {
				String value = checks.get(key);
				try {
					passed = evaluateSegment(key, value);
				} catch (Exception e) {
					passed = false;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (!passed) {
					//FIXME: report check failure;
					break;
				}
			}
			if (passed) {
				FeaturePermission permission = FeaturePermissions.createDefault(condition);
				result.add(permission);
			}
		}
		
		return result;
	}

	protected abstract boolean evaluateSegment(String key, String value);

}

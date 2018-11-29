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
package ru.arsysop.passage.lic.transport;

import java.util.ArrayList;
import java.util.List;

public class TransferObjectDescriptor {

	List<FloatingConditionDescriptor> serverConditions = new ArrayList<>();
	List<FloatingFeaturePermission> serverPermissions = new ArrayList<>();

	public TransferObjectDescriptor() {
	}

	public List<FloatingConditionDescriptor> getDescriptors() {
		return serverConditions;
	}

	public void addDescriptor(FloatingConditionDescriptor d) {
		serverConditions.add(d);
	}

	public void addPermission(FloatingFeaturePermission p) {
		serverPermissions.add(p);
	}

	public List<FloatingFeaturePermission> getPermissions() {
		return serverPermissions;
	}

}

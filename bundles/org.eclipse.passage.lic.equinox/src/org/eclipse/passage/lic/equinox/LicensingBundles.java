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
package org.eclipse.passage.lic.equinox;

import java.util.Collections;

import org.eclipse.passage.lic.base.LicensingNamespaces;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleCapability;
import org.osgi.framework.wiring.BundleRequirement;
import org.osgi.framework.wiring.BundleWiring;

public class LicensingBundles {

	public static Iterable<BundleRequirement> extractLicensingManagementRequirements(Bundle bundle) {
		BundleWiring wiring = bundle.adapt(BundleWiring.class);
		if (wiring != null) {
			return wiring.getRequirements(LicensingNamespaces.CAPABILITY_LICENSING_MANAGEMENT);
		}
		return Collections.emptyList();
	}

	public static Iterable<BundleCapability> extractLicensingFeatures(Bundle bundle) {
		BundleWiring wiring = bundle.adapt(BundleWiring.class);
		if (wiring != null) {
			return wiring.getCapabilities(LicensingNamespaces.CAPABILITY_LICENSING_FEATURE);
		}
		return Collections.emptyList();
	}
	
}

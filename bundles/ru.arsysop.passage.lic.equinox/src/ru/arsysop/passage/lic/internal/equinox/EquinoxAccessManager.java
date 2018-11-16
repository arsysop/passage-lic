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
package ru.arsysop.passage.lic.internal.equinox;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

import ru.arsysop.passage.lic.base.BaseAccessManager;
import ru.arsysop.passage.lic.equinox.LicensingRuntimeWiring;
import ru.arsysop.passage.lic.runtime.AccessManager;

public class EquinoxAccessManager extends BaseAccessManager implements AccessManager, BundleListener {
	
	public void activate(BundleContext bundleContext) {
		bundleContext.addBundleListener(this);
		Bundle[] bundles = bundleContext.getBundles();
		for (Bundle bundle : bundles) {
			LicensingRuntimeWiring.extractLicensingRequirements(bundle);
		}
	}

	public void deactivate(BundleContext bundleContext) {
		bundleContext.removeBundleListener(this);
	}

	@Override
	public void bundleChanged(BundleEvent event) {
		//FIXME: consider event kind
		Bundle bundle = event.getBundle();
		LicensingRuntimeWiring.extractLicensingRequirements(bundle);
	}

}

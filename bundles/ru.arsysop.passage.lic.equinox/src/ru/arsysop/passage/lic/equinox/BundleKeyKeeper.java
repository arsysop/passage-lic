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
package ru.arsysop.passage.lic.equinox;

import static ru.arsysop.passage.lic.base.LicensingPaths.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.osgi.framework.Bundle;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;

import ru.arsysop.passage.lic.runtime.LicensingConfiguration;
import ru.arsysop.passage.lic.runtime.io.KeyKeeper;

public class BundleKeyKeeper implements KeyKeeper {

	private static final String PATH_DEFAULT = "OSGI-INF/"; //$NON-NLS-1$
	
	private ComponentContext componentContext;
	
	@Activate
	public void activate(ComponentContext componentContext) {
		this.componentContext = componentContext;
	}

	@Override
	public InputStream openKeyStream(LicensingConfiguration configuration) throws IOException {
		String fileName = composeFileName(configuration, EXTENSION_PRODUCT_PUBLIC);
		String keypath = PATH_DEFAULT + fileName;
		Bundle bundle = componentContext.getUsingBundle();
		if (bundle == null) {
			throw new FileNotFoundException(keypath);
		}
		URL resource = bundle.getResource(keypath);
		if (resource == null) {
			throw new FileNotFoundException(keypath);
		}
		return resource.openStream();
	}

}

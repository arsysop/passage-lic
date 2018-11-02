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
package ru.arsysop.passage.licensing.runtime.internal.equinox;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.osgi.service.environment.EnvironmentInfo;

import ru.arsysop.passage.licensing.runtime.io.KeyKeeper;

public class OsgiInstallAreaKeyKeeper implements KeyKeeper {

	private EnvironmentInfo environmentInfo;

	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	@Override
	public InputStream openKeyStream(Object configuration) throws IOException {
		//FIXME: add ability to use env properties to resolve keyring
		String areaValue = environmentInfo.getProperty("osgi.install.area");
		Path areaPath = Paths.get(URI.create(areaValue));
		Path passagePath = areaPath.resolve(".passage");
		String productId = String.valueOf(configuration);
		Path configurationPath = passagePath.resolve(productId);
		if (!configurationPath.toFile().isDirectory()) {
			throw new FileNotFoundException(configurationPath.toString());
		}
		Path keyRingPath = configurationPath.resolve(productId);
		return Files.newInputStream(keyRingPath);
	}

}

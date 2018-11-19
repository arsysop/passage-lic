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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.io.ConditionCodec;
import ru.arsysop.passage.lic.runtime.io.ConditionExtractor;
import ru.arsysop.passage.lic.runtime.io.KeyKeeper;

@Component
public class OsgiInstallAreaConditionMiner implements ConditionMiner {

	private EnvironmentInfo environmentInfo;
	private ConditionCodec conditionCodec;
	private KeyKeeper keyKeeper;
	private ConditionExtractor conditionExtractor;

	@Reference
	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	@Reference
	public void bindKeyKeeper(KeyKeeper keyKeeper) {
		this.keyKeeper = keyKeeper;
	}

	public void unbindKeyKeeper(KeyKeeper keyKeeper) {
		this.keyKeeper = null;
	}

	@Reference
	public void bindConditionCodec(ConditionCodec conditionCodec) {
		this.conditionCodec = conditionCodec;
	}

	public void unbindConditionCodec(ConditionCodec conditionCodec) {
		this.conditionCodec = null;
	}

	@Reference
	public void bindConditionExtractor(ConditionExtractor conditionExtractor) {
		this.conditionExtractor = conditionExtractor;
	}

	public void unbindConditionExtractor(ConditionExtractor conditionExtractor) {
		this.conditionExtractor = null;
	}

	@Override
	public Iterable<ConditionDescriptor> extractConditionDescriptors(Object configuration) {
		List<ConditionDescriptor> mined = new ArrayList<>();
		if (environmentInfo == null) {
			return mined;
		}
		String areaValue = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path configurationPath = LicensingPaths.resolveConfigurationPath(areaValue, configuration);
		if (!Files.isDirectory(configurationPath)) {
			return mined;
		}
		List<Path> licenseFiles = new ArrayList<>();
		try {
			Files.walkFileTree(configurationPath, new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (file.toString().toLowerCase().endsWith(LicensingPaths.EXTENSION_LICENSE_ENCRYPTED)) {
						licenseFiles.add(file);
					}
					return FileVisitResult.CONTINUE;
				}

			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Path path : licenseFiles) {
			try (FileInputStream encoded = new FileInputStream(path.toFile()); ByteArrayOutputStream decoded = new ByteArrayOutputStream(); InputStream keyRing = keyKeeper.openKeyStream(configuration)){
				conditionCodec.decodeStream(encoded, decoded, keyRing, null);
				byte[] byteArray = decoded.toByteArray();
				try (ByteArrayInputStream input = new ByteArrayInputStream(byteArray)) {
					Iterable<ConditionDescriptor> extracted = conditionExtractor.extractConditions(input);
					for (ConditionDescriptor condition : extracted) {
						mined.add(condition);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return mined;
	}

}

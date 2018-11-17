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
import java.net.URI;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.osgi.service.environment.EnvironmentInfo;

import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.io.ConditionCodec;
import ru.arsysop.passage.lic.runtime.io.KeyKeeper;

public class OsgiInstallAreaConditionMiner implements ConditionMiner {

	private EnvironmentInfo environmentInfo;
	private ConditionCodec conditionCodec;
	private KeyKeeper keyKeeper;

	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	public void bindKeyKeeper(KeyKeeper keyKeeper) {
		this.keyKeeper = keyKeeper;
	}

	public void unbindKeyKeeper(KeyKeeper keyKeeper) {
		this.keyKeeper = null;
	}

	public void bindConditionCodec(ConditionCodec conditionCodec) {
		this.conditionCodec = conditionCodec;
	}

	public void unbindConditionCodec(ConditionCodec conditionCodec) {
		this.conditionCodec = null;
	}

	@Override
	public Iterable<ConditionDescriptor> extractConditionDescriptors(Object configuration) {
		List<ConditionDescriptor> conditionDescriptors = new ArrayList<>();
		if (environmentInfo == null) {
			return conditionDescriptors;
		}
		String areaValue = environmentInfo.getProperty("osgi.install.area");
		Path areaPath = Paths.get(URI.create(areaValue));
		Path passagePath = areaPath.resolve(".passage");
		Path configurationPath = passagePath.resolve(String.valueOf(configuration));
		if (!Files.isDirectory(configurationPath)) {
			return conditionDescriptors;
		}
		List<Path> licenseFiles = new ArrayList<>();
		try {
			Files.walkFileTree(configurationPath, new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (file.toString().toLowerCase().endsWith(".cr")) {
						licenseFiles.add(file);
					}
					String licenseFileExtension = ".elcd"; //Encrypted License Condition Description
					if (file.toString().toLowerCase().endsWith(licenseFileExtension)) {
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
			System.out.println("OsgiInstallAreaMiner found: " + path);
			try (FileInputStream encoded = new FileInputStream(path.toFile()); ByteArrayOutputStream decoded = new ByteArrayOutputStream(); InputStream keyRing = keyKeeper.openKeyStream(configuration)){
				
				conditionCodec.decodeStream(encoded, decoded, keyRing, null);
				final Properties properties = new Properties();
				byte[] byteArray = decoded.toByteArray();
				try (ByteArrayInputStream propInput = new ByteArrayInputStream(byteArray)) {
					properties.load(propInput);
				}
				System.out.println("OsgiInstallAreaMiner decoded: ");
				System.out.println(new String(byteArray));
				ConditionDescriptor conditionDescriptor = new ConditionDescriptor() {
					
					@Override
					public String getConditionType() {
						// TODO Auto-generated method stub
						return "user";
					}
					
					@Override
					public String getConditionExpression() {
						// TODO Auto-generated method stub
						return properties.getProperty("email");
					}
					
					@Override
					public String getAllowedFeatureMatchVersion() {
						// TODO Auto-generated method stub
						return properties.getProperty("componentVersion");
					}
					
					@Override
					public String getAllowedFeatureMatchRule() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public String getAllowedFeatureId() {
						// TODO Auto-generated method stub
						return properties.getProperty("component");
					}
					
					@Override
					public String toString() {
						StringBuilder sb = new StringBuilder();
						sb.append("email").append('=').append(getConditionExpression()).append(';');
						sb.append("component").append('=').append(getAllowedFeatureId()).append(';');
						sb.append("componentVersion").append('=').append(getAllowedFeatureMatchVersion()).append(';');
						return sb.toString();
					}
				};
				conditionDescriptors.add(conditionDescriptor);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return conditionDescriptors;
	}

}

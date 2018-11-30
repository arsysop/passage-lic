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
package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.eclipse.osgi.service.environment.EnvironmentInfo;

import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.net.RequestProducer;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionMiner;

public class NetConditionMiner implements ConditionMiner {
	private static final String HOST_PORT = "%s:%s";
	private static final String PORT_VALUE_NOT_SPECIFIED_ERROR = "Port value not specified for miner";
	private static final String HOST_VALUE_NOT_SPECIFIED_ERROR = "Host value not specified for miner";
	private static final String SETTINGS_EXTENSION = ".settings";
	private final String MODE = "client";
	public static String HOST_KEY = "passage.server.host";
	public static String PORT_KEY = "passage.server.port";

	private EnvironmentInfo environmentInfo;
	Map<String, String> settingsMap = new HashMap<>();

	Logger logger = Logger.getLogger(NetConditionMiner.class.getName());

	public void bindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = environmentInfo;
	}

	public void unbindEnvironmentInfo(EnvironmentInfo environmentInfo) {
		this.environmentInfo = null;
	}

	@Override
	public Iterable<ConditionDescriptor> extractConditionDescriptors(Object configuration) {

		List<ConditionDescriptor> conditions = new ArrayList<>();

		if (environmentInfo == null) {
			return conditions;
		}
		String areaValue = environmentInfo.getProperty(LicensingPaths.PROPERTY_OSGI_INSTALL_AREA);
		Path configurationPath = LicensingPaths.resolveConfigurationPath(areaValue, configuration);
		if (!Files.isDirectory(configurationPath)) {
			return conditions;
		}
		List<Path> settinsFiles = new ArrayList<>();
		try {
			Files.walkFileTree(configurationPath, new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					if (file.toString().toLowerCase().endsWith(SETTINGS_EXTENSION)) {
						settinsFiles.add(file);
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			logger.log(Level.FINEST, e.getMessage(), e);
		}

		for (Path path : settinsFiles) {
			try {
				settingsMap = loadIstallationAreaSettings(Files.readAllLines(path));
			} catch (Exception e) {
				logger.log(Level.FINEST, e.getMessage(), e);
			}
		}

		try {
			RequestProducer requestProducer = new RequestProducer();
			CloseableHttpClient httpClient = HttpClients.createDefault();
			String hostValue = settingsMap.get(HOST_KEY);
			if (hostValue == null || hostValue.isEmpty()) {
				logger.log(Level.FINEST, HOST_VALUE_NOT_SPECIFIED_ERROR);
				return conditions;
			}
			String portValue = settingsMap.get(PORT_KEY);
			if (portValue == null || portValue.isEmpty()) {
				logger.log(Level.FINEST, PORT_VALUE_NOT_SPECIFIED_ERROR);
				return conditions;
			}

			Map<String, String> requestAttributes = requestProducer.initRequestParams(hostValue, portValue, MODE);
			HttpHost host = HttpHost.create(String.format(HOST_PORT, hostValue, portValue));
			Iterable<? extends ConditionDescriptor> descriptors = requestProducer.extractConditionsRequest(httpClient,
					host, requestAttributes);
			conditions = StreamSupport.stream(descriptors.spliterator(), false).collect(Collectors.toList());
		} catch (Exception e) {
			Logger logger = Logger.getLogger(NetConditionMiner.class.getName());
			logger.log(Level.FINER, e.getMessage());
		}
		return conditions;
	}

	private Map<String, String> loadIstallationAreaSettings(List<String> readAllLines) {
		Map<String, String> settings = new HashMap<>();
		for (String iter : readAllLines) {
			String[] setting = iter.split("=");
			if (setting.length == 2) {
				settings.put(setting[0], setting[1]);
			}
		}
		return settings;
	}

}

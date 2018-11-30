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

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.eclipse.osgi.service.environment.EnvironmentInfo;

import ru.arsysop.passage.lic.base.LicensingPaths;
import ru.arsysop.passage.lic.net.RequestProducer;
import ru.arsysop.passage.lic.runtime.ConditionDescriptor;
import ru.arsysop.passage.lic.runtime.ConditionMiner;
import ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport;

public class NetConditionMiner implements ConditionMiner {
	private static final String LICENSING_CONTENT_TYPE = "licensing.content.type";
	private static final String HOST_PORT = "%s:%s";
	private static final String PORT_VALUE_NOT_SPECIFIED_ERROR = "Port value not specified for miner";
	private static final String HOST_VALUE_NOT_SPECIFIED_ERROR = "Host value not specified for miner";
	private static final String SETTINGS_EXTENSION = ".settings";
	private final String MODE = "client";
	private EnvironmentInfo environmentInfo;

	private static String HOST_KEY = "passage.server.host";
	private static String PORT_KEY = "passage.server.port";

	Map<String, ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport> contentType2ConditionDescriptorTransport;

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
			URIBuilder requestBulder = requestProducer.createRequestURI(httpClient, host, requestAttributes);
			if (requestBulder == null) {
				logger.log(Level.FINEST, "Could not create URI for request");
			}
			HttpPost httpPost = new HttpPost(requestBulder.build());

			ResponseHandler<Iterable<ConditionDescriptor>> responseHandler = new ResponseHandler<Iterable<ConditionDescriptor>>() {

				@Override
				public Iterable<ConditionDescriptor> handleResponse(HttpResponse response)
						throws ClientProtocolException, IOException {
					String contentType = response.getEntity().getContentType().getValue();
					HttpEntity entity = response.getEntity();
					if (entity != null && entity.getContent() != null) {
						ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport transport = getConditionDescriptorTransport(
								contentType);
						Iterable<ConditionDescriptor> conditionDescriptors = transport
								.readConditionDescriptors(entity.getContent());
						return conditionDescriptors;
					} else {
						logger.log(Level.FINE, "Could not recieve a inputStream from request");
					}
					return null;
				}
			};
			httpClient.execute(host, httpPost, responseHandler);

		} catch (Exception e) {
			logger.log(Level.FINER, e.getMessage());
		}
		return conditions;
	}

	private ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport getConditionDescriptorTransport(
			String typeOfContent) {
		return contentType2ConditionDescriptorTransport.get(typeOfContent);
	}

	public void bindConditionDescriptorTransport(ConditionDescriptorTransport transport, Map<String, String> context) {
		String contentType = context.get(LICENSING_CONTENT_TYPE);
		if (contentType != null) {
			if (!contentType2ConditionDescriptorTransport.containsKey(contentType)) {
				contentType2ConditionDescriptorTransport.put(contentType, transport);
			}
		}
	}

	public void unbindConditionDescriptorTransport(ConditionDescriptorTransport transport,
			Map<String, String> context) {
		String contentType = context.get(LICENSING_CONTENT_TYPE);
		if (contentType != null) {
			if (contentType2ConditionDescriptorTransport.containsKey(contentType)) {
				contentType2ConditionDescriptorTransport.remove(contentType, transport);
			}
		}
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

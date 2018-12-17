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

package ru.arsysop.passage.lic.net;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.apache.http.HttpHost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;

import ru.arsysop.passage.lic.base.LicensingProperties;

public class LicensingRequests {

	
	public static final String PRODUCT = "product"; //$NON-NLS-1$
	public static final String VERSION = "version"; //$NON-NLS-1$
	public static final String USER = "user"; //$NON-NLS-1$
	
	public static final String ACTION = "action";
	public static final String MODE = "mode";
	public static final String HANDLER = "handler";
	
	public static final String PROTOCOL_TYPE_ID = "http";
	public static final String HOST = "host";
	public static final String PORT = "port";
	public static final String CONTENT_TYPE = "content.type";

	private static Logger logger = Logger.getLogger(LicensingRequests.class.getName());

	public static Map<String, String> initRequestParams(String host, String port, String modeId, String productId,
			String productVersion) {
		Map<String, String> requestAttributes = new HashMap<>();
		requestAttributes.put(HOST, host);
		requestAttributes.put(PORT, port);
	
		requestAttributes.put(USER, "12345678");
		requestAttributes.put(MODE, modeId);
		requestAttributes.put(PRODUCT, productId);
		requestAttributes.put(VERSION, productVersion);
		return requestAttributes;
	}

	public static URIBuilder createRequestUriBuilder(Map<String, String> attributes) {
		String host = "";
		String port = "";
		Object hostAttr = attributes.get(HOST);
		Object portAttr = attributes.get(PORT);
		if (hostAttr instanceof String) {
			host = (String) hostAttr;
		} else {
			logger.info("Host value undefined.");
			return null;
		}
	
		if (portAttr instanceof String) {
			port = (String) portAttr;
		} else {
			logger.info("Port value undefined.");
			return null;
		}
	
		String requestHead = String.format("%s://%s:%s", PROTOCOL_TYPE_ID, host, port);
		URIBuilder builder;
		try {
			builder = new URIBuilder(requestHead);
			for (Entry<String, String> entry : attributes.entrySet()) {
				if (entry.getKey().equals(HOST) || entry.getKey().equals(PORT)) {
					continue;
				}
				builder.setParameter(entry.getKey(), entry.getValue());
			}
			return builder;
	
		} catch (URISyntaxException e) {
			logger.info(e.getMessage());
		}
		return null;
	}

	public static URIBuilder createRequestURI(CloseableHttpClient httpClient, HttpHost host,
			Map<String, String> attributes, String action) {
		attributes.put(ACTION, action);
		attributes.put(CONTENT_TYPE, LicensingProperties.LICENSING_CONTENT_TYPE_XML);
		return createRequestUriBuilder(attributes);
	}
	
}

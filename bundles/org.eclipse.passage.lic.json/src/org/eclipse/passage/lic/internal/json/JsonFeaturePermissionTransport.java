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
package org.eclipse.passage.lic.internal.json;

import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_CONTENT_TYPE;
import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_CONTENT_TYPE_JSON;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.passage.lic.base.BaseFeaturePermission;
import org.eclipse.passage.lic.runtime.FeaturePermission;
import org.eclipse.passage.lic.runtime.io.FeaturePermissionTransport;
import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component(property = { LICENSING_CONTENT_TYPE + '=' + LICENSING_CONTENT_TYPE_JSON })
public class JsonFeaturePermissionTransport implements FeaturePermissionTransport {

	@Override
	public Iterable<FeaturePermission> readFeaturePermissions(InputStream input) throws IOException {
		Collection<FeaturePermission> descriptors = new ArrayList<>();
		if (input != null) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			FeaturePermissionAggregator transferAgregatorObject = mapper.readValue(input,
					FeaturePermissionAggregator.class);
			descriptors.addAll(transferAgregatorObject.getFeaturePermissions());
		}
		return descriptors;
	}

	@Override
	public void writeFeaturePermissions(Iterable<FeaturePermission> permissions, OutputStream output)
			throws IOException {
		if (permissions == null) {
			return;
		}
		FeaturePermissionAggregator aggregator = new FeaturePermissionAggregator();
		for (FeaturePermission permission : permissions) {
			if (permission instanceof BaseFeaturePermission) {
				BaseFeaturePermission base = (BaseFeaturePermission) permission;
				aggregator.addFeaturePermission(base);
			}
		}

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseFeaturePermission.class, FeaturePermissionMixln.class);
		output.write(mapper.writeValueAsBytes(aggregator));

	}

}

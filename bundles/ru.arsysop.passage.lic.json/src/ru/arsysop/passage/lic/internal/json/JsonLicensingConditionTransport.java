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
package ru.arsysop.passage.lic.internal.json;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.io.LicensingConditionTransport;

@Component(property = {LICENSING_CONTENT_TYPE + '=' + LICENSING_CONTENT_TYPE_JSON})
public class JsonLicensingConditionTransport implements LicensingConditionTransport {

	@Override
	public Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException {
		Collection<LicensingCondition> descriptors = new ArrayList<>();
		if (input != null) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
			mapper.addMixIn(BaseLicensingCondition.class, LicensingConditionMixIn.class);
			ConditionDescriptorAggregator transferAgregatorObject = mapper.readValue(input,
					ConditionDescriptorAggregator.class);
			descriptors.addAll(transferAgregatorObject.getLicensingConditions());
		}
		return descriptors;
	}

	@Override
	public void writeConditionDescriptors(Iterable<LicensingCondition> conditions, OutputStream output)
			throws IOException {
		if (conditions == null) {
			return;
		}
		ConditionDescriptorAggregator aggregator = new ConditionDescriptorAggregator();
		for (LicensingCondition c : conditions) {
			if (c instanceof BaseLicensingCondition) {
				BaseLicensingCondition base = (BaseLicensingCondition) c;
				aggregator.addLicensingCondition(base);
			}
		}

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseLicensingCondition.class, LicensingConditionMixIn.class);
		byte[] byteValues = mapper.writeValueAsBytes(aggregator);
		output.write(byteValues);
	}

}

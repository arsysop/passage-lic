package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.io.LicensingConditionTransport;

public class NetConditionDescriptorTransport implements LicensingConditionTransport {
	Collection<LicensingCondition> descriptors = new ArrayList<>();

	@Override
	public Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException {

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
		ConditionDescriptorAggregator aggregator = createConditionAggregator(conditions);
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseLicensingCondition.class, LicensingConditionMixIn.class);
		byte[] byteValues = mapper.writeValueAsBytes(aggregator);
		output.write(byteValues);
	}

	private ConditionDescriptorAggregator createConditionAggregator(Iterable<LicensingCondition> conditions) {
		ConditionDescriptorAggregator aggregator = new ConditionDescriptorAggregator();
		for (LicensingCondition c : conditions) {
			if (c instanceof BaseLicensingCondition) {
				aggregator.addLicensingCondition((BaseLicensingCondition) c);
			}
		}
		return aggregator;
	}

}

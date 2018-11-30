package ru.arsysop.passage.lic.internal.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport;

public class NetConditionDescriptorTransport implements ConditionDescriptorTransport {
	Collection<LicensingCondition> descriptors = new ArrayList<>();

	@Override
	public Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException {

		if (input != null) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			ConditionDescriptorAggregator transferAgregatorObject = mapper.readValue(input,
					ConditionDescriptorAggregator.class);
			descriptors.addAll(transferAgregatorObject.getConditionDescriptors());
		}

		return descriptors;
	}

	@Override
	public void writeConditionDescriptors(Iterable<LicensingCondition> conditions, OutputStream output)
			throws IOException {
		// TODO Auto-generated method stub

	}

}

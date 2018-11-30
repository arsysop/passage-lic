package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ru.arsysop.passage.lic.internal.net.ConditionDescriptorAggregator;
import ru.arsysop.passage.lic.internal.net.FloatingConditionDescriptor;
import ru.arsysop.passage.lic.internal.net.NetConditionDescriptorTransport;
import ru.arsysop.passage.lic.runtime.LicensingCondition;

public class NetConditionDescriptorTransportTest {

	@SuppressWarnings("restriction")
	@Test
	public void netConditionDescriptorTransportTest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		ConditionDescriptorAggregator conditionAggregator = createConditionDescriptorAggregator();
		try {
			byte[] byteValues = mapper.writeValueAsBytes(conditionAggregator);
			ByteArrayInputStream bis = new ByteArrayInputStream(byteValues);
			NetConditionDescriptorTransport transport = new NetConditionDescriptorTransport();
			Iterable<LicensingCondition> conditions = transport.readConditionDescriptors(bis);
			assertNotNull(conditions);

		} catch (JsonProcessingException e) {
			assumeNoException(e);
		} catch (IOException e) {
			assumeNoException(e);
		}
	}

	@SuppressWarnings("restriction")
	private ConditionDescriptorAggregator createConditionDescriptorAggregator() {
		ConditionDescriptorAggregator conditionAggregator = new ConditionDescriptorAggregator();
		FloatingConditionDescriptor descriptor = new FloatingConditionDescriptor("test.id", "test.version.1", "",
				"test.content.type", "");
		conditionAggregator.addConditionDescriptor(descriptor);
		return conditionAggregator;
	}
}

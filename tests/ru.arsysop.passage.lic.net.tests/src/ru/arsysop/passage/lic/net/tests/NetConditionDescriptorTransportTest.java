package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.internal.net.ConditionDescriptorAggregator;
import ru.arsysop.passage.lic.internal.net.LicensingConditionMixIn;
import ru.arsysop.passage.lic.internal.net.NetConditionDescriptorTransport;
import ru.arsysop.passage.lic.runtime.LicensingCondition;

@SuppressWarnings("restriction")
public class NetConditionDescriptorTransportTest {

	@Test
	public void netConditionDescriptorTransportTest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseLicensingCondition.class, LicensingConditionMixIn.class);

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

	private ConditionDescriptorAggregator createConditionDescriptorAggregator() {
		ConditionDescriptorAggregator conditionAggregator = new ConditionDescriptorAggregator();
		BaseLicensingCondition descriptor = LicensingConditions.create("test.id", "test.version.1", "",
				"test.content.type", "");
		conditionAggregator.addLicensingCondition(descriptor);
		return conditionAggregator;
	}
}

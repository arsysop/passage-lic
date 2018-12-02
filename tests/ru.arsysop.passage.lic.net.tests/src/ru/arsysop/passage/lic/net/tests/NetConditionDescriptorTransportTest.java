package ru.arsysop.passage.lic.net.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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

	private static final String FEATURE_TEST_CONDITION_TYPE = "test.content.type";
	private static final String FEATURE_TEST_RULE = "test.rule";
	private static final String FEATURE_TEST_VERSION = "test.version.1";
	private static final String FEATURE_TEST_ID = "test.id";
	private static final String FEATURE_TEST_EXPRESSION = "test.expression";

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
			for (LicensingCondition condition : conditions) {
				assertTrue(condition.getFeatureIdentifier().equals(FEATURE_TEST_ID));
				assertTrue(condition.getConditionExpression().equals(FEATURE_TEST_EXPRESSION));
				assertTrue(condition.getConditionType().equals(FEATURE_TEST_CONDITION_TYPE));
				assertTrue(condition.getMatchRule().equals(FEATURE_TEST_RULE));
				assertTrue(condition.getMatchVersion().equals(FEATURE_TEST_VERSION));
			}

		} catch (JsonProcessingException e) {
			assumeNoException(e);
		} catch (IOException e) {
			assumeNoException(e);
		}
	}

	private ConditionDescriptorAggregator createConditionDescriptorAggregator() {
		ConditionDescriptorAggregator conditionAggregator = new ConditionDescriptorAggregator();
		BaseLicensingCondition descriptor = LicensingConditions.create(FEATURE_TEST_ID, FEATURE_TEST_VERSION,
				FEATURE_TEST_RULE, FEATURE_TEST_CONDITION_TYPE, FEATURE_TEST_EXPRESSION);
		conditionAggregator.addLicensingCondition(descriptor);
		return conditionAggregator;
	}
}

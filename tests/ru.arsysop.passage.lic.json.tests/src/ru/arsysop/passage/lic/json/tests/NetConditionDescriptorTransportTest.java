package ru.arsysop.passage.lic.json.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ru.arsysop.passage.lic.base.BaseLicensingCondition;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.internal.json.ConditionDescriptorAggregator;
import ru.arsysop.passage.lic.internal.json.JsonLicensingConditionTransport;
import ru.arsysop.passage.lic.internal.json.LicensingConditionMixIn;
import ru.arsysop.passage.lic.runtime.LicensingCondition;

@SuppressWarnings("restriction")
public class NetConditionDescriptorTransportTest {

	private static final String FEATURE_TEST_CONDITION_TYPE = "test.content.type"; //$NON-NLS-1$
	private static final String FEATURE_TEST_RULE = "test.rule"; //$NON-NLS-1$
	private static final String FEATURE_TEST_VERSION = "test.version.1"; //$NON-NLS-1$
	private static final String FEATURE_TEST_ID = "test.id"; //$NON-NLS-1$
	private static final String FEATURE_TEST_EXPRESSION = "test.expression"; //$NON-NLS-1$

	@Test
	public void netConditionDescriptorTransportTest() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
		mapper.addMixIn(BaseLicensingCondition.class, LicensingConditionMixIn.class);

		ConditionDescriptorAggregator conditionAggregator = createConditionDescriptorAggregator();
		try {
			byte[] byteValues = mapper.writeValueAsBytes(conditionAggregator);
			ByteArrayInputStream bis = new ByteArrayInputStream(byteValues);
			JsonLicensingConditionTransport transport = new JsonLicensingConditionTransport();
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
		String id = FEATURE_TEST_ID;
		String version = FEATURE_TEST_VERSION;
		String rule = FEATURE_TEST_RULE;
		Date from = null;
		Date until = null;
		String type = FEATURE_TEST_CONDITION_TYPE;
		String expression = FEATURE_TEST_EXPRESSION;
		BaseLicensingCondition descriptor = LicensingConditions.create(id, version, rule, from, until, type, expression);
		conditionAggregator.addLicensingCondition(descriptor);
		return conditionAggregator;
	}
}

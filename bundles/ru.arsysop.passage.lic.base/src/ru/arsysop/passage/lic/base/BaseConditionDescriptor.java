package ru.arsysop.passage.lic.base;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import ru.arsysop.passage.lic.runtime.LicensingCondition;

public class BaseConditionDescriptor implements LicensingCondition {

	private final String allowedFeatureId;
	private final String allowedMatchVersion;
	private final String allowedMatchRule;
	private final String conditionType;
	private final String conditionExpression;

	protected BaseConditionDescriptor(String featureId, String version, String rule, String type, String expression) {
		this.allowedFeatureId = featureId;
		this.allowedMatchVersion = version;
		this.allowedMatchRule = rule;
		this.conditionType = type;
		this.conditionExpression = expression;
	}

	@Override
	public String getAllowedFeatureId() {
		return allowedFeatureId;
	}

	@Override
	public String getAllowedMatchVersion() {
		return allowedMatchVersion;
	}

	@Override
	public String getAllowedMatchRule() {
		return allowedMatchRule;
	}

	@Override
	public String getConditionType() {
		return conditionType;
	}

	@Override
	public String getConditionExpression() {
		return conditionExpression;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(LICENSING_FEATURE_IDENTIFIER).append('=').append(allowedFeatureId).append(';');
		sb.append(LICENSING_MATCH_VERSION).append('=').append(allowedMatchVersion).append(';');
		sb.append(LICENSING_MATCH_RULE).append('=').append(allowedMatchRule).append(';');
		sb.append(LICENSING_CONDITION_TYPE).append('=').append(conditionType).append(';');
		sb.append("expression").append('=').append(conditionExpression); //$NON-NLS-1$
		return sb.toString();
	}

}

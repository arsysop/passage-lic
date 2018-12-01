package ru.arsysop.passage.lic.base;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import ru.arsysop.passage.lic.runtime.LicensingCondition;

public class BaseLicensingCondition implements LicensingCondition {

	private final String featureIdentifier;
	private final String matchVersion;
	private final String matchRule;
	private final String conditionType;
	private final String conditionExpression;

	BaseLicensingCondition(String featureIdentifier, String matchVersion, String matchRule, String conditionType,
			String conditionExpression) {
		this.featureIdentifier = featureIdentifier;
		this.matchVersion = matchVersion;
		this.matchRule = matchRule;
		this.conditionType = conditionType;
		this.conditionExpression = conditionExpression;
	}

	@Override
	public String getFeatureIdentifier() {
		return featureIdentifier;
	}

	@Override
	public String getMatchVersion() {
		return matchVersion;
	}

	@Override
	public String getMatchRule() {
		return matchRule;
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
		sb.append(LICENSING_FEATURE_IDENTIFIER).append('=').append(featureIdentifier).append(';');
		sb.append(LICENSING_MATCH_VERSION).append('=').append(matchVersion).append(';');
		sb.append(LICENSING_MATCH_RULE).append('=').append(matchRule).append(';');
		sb.append(LICENSING_CONDITION_TYPE).append('=').append(conditionType).append(';');
		sb.append("expression").append('=').append(conditionExpression); //$NON-NLS-1$
		return sb.toString();
	}

}

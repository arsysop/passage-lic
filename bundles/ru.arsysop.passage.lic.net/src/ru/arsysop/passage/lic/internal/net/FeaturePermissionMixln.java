package ru.arsysop.passage.lic.internal.net;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeaturePermissionMixln {

	public FeaturePermissionMixln(@JsonProperty("featureIdentifier") String featureIdentifier,
			@JsonProperty("matchVersion") String matchVersion, @JsonProperty("matchRule") String matchRule,
			@JsonProperty("leaseTime") String leaseTime, @JsonProperty("expireTime") String expireTime) {
	}
}

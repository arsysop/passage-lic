package ru.arsysop.passage.lic.integration.tests;

import org.osgi.service.component.annotations.Component;

import ru.arsysop.passage.lic.runtime.RestrictionExecutor;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

@Component
public class SystemPropertyExecutor implements RestrictionExecutor {

	@Override
	public void execute(Iterable<RestrictionVerdict> actions) {
		for (RestrictionVerdict verdict : actions) {
			String featureIdentifier = verdict.getConfigurationRequirement().getFeatureIdentifier();
			String restrictionLevel = verdict.getRestrictionLevel();
			System.setProperty(featureIdentifier, restrictionLevel);
		}
	}

}

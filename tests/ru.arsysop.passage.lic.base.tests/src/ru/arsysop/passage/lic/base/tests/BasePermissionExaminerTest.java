/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.base.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

import ru.arsysop.passage.lic.base.BaseConfigurationRequirement;
import ru.arsysop.passage.lic.base.BaseFeaturePermission;
import ru.arsysop.passage.lic.base.BasePermissionExaminer;
import ru.arsysop.passage.lic.base.ConfigurationRequirements;
import ru.arsysop.passage.lic.base.FeaturePermissions;
import ru.arsysop.passage.lic.base.LicensingConditions;
import ru.arsysop.passage.lic.base.LicensingProperties;
import ru.arsysop.passage.lic.base.LicensingVersions;
import ru.arsysop.passage.lic.runtime.ConfigurationRequirement;
import ru.arsysop.passage.lic.runtime.FeaturePermission;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.RestrictionVerdict;

public class BasePermissionExaminerTest {

	private static final String FOO_FEATURE_ID = "foo"; //$NON-NLS-1$
	private static final String FOO_FEATURE_VERSION = "0.4.1"; //$NON-NLS-1$
	private static final String BAR_FEATURE_ID = "bar"; //$NON-NLS-1$
	private static final String BAR_FEATURE_VERSION = "1.2.9"; //$NON-NLS-1$
	private static final String BAZ_FEATURE_ID = "baz"; //$NON-NLS-1$

	@Test
	public void testExamine() {
		BasePermissionExaminer examiner = new BasePermissionExaminer() {

			@Override
			protected void postEvent(String topic, Object data) {
				// do nothing
			}

			@Override
			protected void sendEvent(String topic, Object data) {
				// do nothing
			}
		};
		Object source = new Object();
		Object configuration = new Object();

		BaseConfigurationRequirement fooRequirement = ConfigurationRequirements.createDefault(FOO_FEATURE_ID,
				FOO_FEATURE_VERSION, FOO_FEATURE_ID, source);
		BaseConfigurationRequirement barRequirement = ConfigurationRequirements.createDefault(BAR_FEATURE_ID,
				BAR_FEATURE_VERSION, BAR_FEATURE_ID, source);
		Iterable<ConfigurationRequirement> requirements = Arrays.asList(fooRequirement, barRequirement);

		Date fooFrom = null;
		Date foorUntil = null;
		Date bazFrom = null;
		Date bazUntil = null;
		LicensingCondition fooCondition = LicensingConditions.create(FOO_FEATURE_ID, "0.4.0", //$NON-NLS-1$
				LicensingVersions.RULE_GREATER_OR_EQUAL, fooFrom, foorUntil, null, null);
		LicensingCondition bazCondition = LicensingConditions.create(BAZ_FEATURE_ID, "1.0.0", //$NON-NLS-1$
				LicensingVersions.RULE_GREATER_OR_EQUAL, bazFrom, bazUntil, null, null);
		BaseFeaturePermission fooPermission = FeaturePermissions.createDefault(fooCondition);
		BaseFeaturePermission bazPermission = FeaturePermissions.create(bazCondition, new Date(0), new Date(0));
		Iterable<FeaturePermission> permissions = Arrays.asList(fooPermission, bazPermission);

		Iterable<RestrictionVerdict> verdicts = examiner.examine(requirements, permissions, configuration);
		Iterator<RestrictionVerdict> iterator = verdicts.iterator();
		RestrictionVerdict next = iterator.next();
		assertNotNull(next);
		assertEquals(barRequirement, next.getConfigurationRequirement());
		assertEquals(LicensingProperties.LICENSING_RESTRICTION_LEVEL_DEFAULT, next.getRestrictionLevel());
		assertFalse(iterator.hasNext());
	}

}

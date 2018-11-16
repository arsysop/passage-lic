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
package ru.arsysop.passage.licensing.runtime.base.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import ru.arsysop.passage.licensing.runtime.ConfigurationRequirement;
import ru.arsysop.passage.licensing.runtime.FeaturePermission;
import ru.arsysop.passage.licensing.runtime.RestrictionVerdict;
import ru.arsysop.passage.licensing.runtime.base.BaseConfigurationRequirement;
import ru.arsysop.passage.licensing.runtime.base.BaseFeaturePermission;
import ru.arsysop.passage.licensing.runtime.base.BasePermissionExaminer;
import ru.arsysop.passage.licensing.runtime.base.ConfigurationRequirements;
import ru.arsysop.passage.licensing.runtime.base.FeaturePermissions;
import ru.arsysop.passage.licensing.runtime.base.LicensingProperties;

public class BasePermissionExaminerTest {
	
	private static final String FOO_FEATURE_ID = "foo"; //$NON-NLS-1$
	private static final String BAR_FEATURE_ID = "bar"; //$NON-NLS-1$
	private static final String BAZ_FEATURE_ID = "baz"; //$NON-NLS-1$

	@Test
	public void testExamine() {
		BasePermissionExaminer examiner = new BasePermissionExaminer();
		Object source = new Object();
		Object configuration = new Object();

		BaseConfigurationRequirement fooRequirement = ConfigurationRequirements.createDefault(FOO_FEATURE_ID, source);
		BaseConfigurationRequirement barRequirement = ConfigurationRequirements.createDefault(BAR_FEATURE_ID, source);
		Iterable<ConfigurationRequirement> requirements = Arrays.asList(fooRequirement, barRequirement);

		BaseFeaturePermission fooPermission = FeaturePermissions.createDefault(FOO_FEATURE_ID);
		BaseFeaturePermission bazPermission = FeaturePermissions.createDefault(BAZ_FEATURE_ID);
		Iterable<FeaturePermission> permissions = Arrays.asList(fooPermission, bazPermission);

		Iterable<RestrictionVerdict> verdicts = examiner.examine(requirements , permissions, configuration);
		Iterator<RestrictionVerdict> iterator = verdicts.iterator();
		RestrictionVerdict next = iterator.next();
		assertNotNull(next);
		assertEquals(barRequirement, next.getConfigurationRequirement());
		assertEquals(LicensingProperties.LICENSING_RESTRICTION_LEVEL_DEFAULT, next.getRestrictionLevel());
		assertFalse(iterator.hasNext());
	}

}

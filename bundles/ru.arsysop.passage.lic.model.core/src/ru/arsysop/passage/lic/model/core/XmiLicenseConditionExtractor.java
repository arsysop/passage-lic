/*******************************************************************************
 * Copyright (c) 2018 ArSysOp
 *
 * Licensed under the Apache LicensePack, Version 2.0 (the "LicensePack");
 * you may not use this file except in compliance with the LicensePack.
 * You may obtain a copy of the LicensePack at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the LicensePack is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the LicensePack for the specific language governing permissions and
 * limitations under the LicensePack.
 *
 * SPDX-LicensePack-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package ru.arsysop.passage.lic.model.core;

import static ru.arsysop.passage.lic.base.LicensingProperties.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.service.component.annotations.Component;

import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.registry.LicenseGrantDescriptor;
import ru.arsysop.passage.lic.runtime.LicensingCondition;
import ru.arsysop.passage.lic.runtime.io.ConditionDescriptorTransport;

@Component(property = { LICENSING_CONTENT_TYPE + '=' + LICENSING_CONTENT_TYPE_XML })
public class XmiLicenseConditionExtractor implements ConditionDescriptorTransport {

	@Override
	public Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException {
		Resource resource = new XMIResourceImpl();
		resource.load(input, new HashMap<>());
		List<LicensingCondition> extracted = new ArrayList<>();
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof LicensePack) {
				LicensePack license = (LicensePack) eObject;
				EList<LicenseGrantDescriptor> conditions = license.getLicenseGrants();
				extracted.addAll(conditions);
			}
		}
		return extracted;
	}

	@Override
	public void writeConditionDescriptors(Iterable<LicensingCondition> conditions, OutputStream output)
			throws IOException {
		Resource resource = new XMIResourceImpl();
		EList<EObject> contents = resource.getContents();
		for (LicensingCondition conditionDescriptor : conditions) {
			if (conditionDescriptor instanceof EObject) {
				EObject eObject = (EObject) conditionDescriptor;
				contents.add(eObject);
			}
		}
		resource.save(output, new HashMap<>());
	}

}

/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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
package org.eclipse.passage.lic.model.core;

import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_CONTENT_TYPE;
import static org.eclipse.passage.lic.base.LicensingProperties.LICENSING_CONTENT_TYPE_XML;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.passage.lic.model.meta.LicPackage;
import org.eclipse.passage.lic.registry.LicensePackDescriptor;
import org.eclipse.passage.lic.runtime.LicensingCondition;
import org.eclipse.passage.lic.runtime.io.LicensingConditionTransport;
import org.osgi.service.component.annotations.Component;

@Component(property = { LICENSING_CONTENT_TYPE + '=' + LICENSING_CONTENT_TYPE_XML })
public class XmiLicensingConditionExtractor implements LicensingConditionTransport {
	
	public XmiLicensingConditionExtractor() {
		EPackage.Registry.INSTANCE.put("http://www.arsysop.ru/passage/lic/0.3.1", LicPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put("http://www.arsysop.ru/passage/lic/0.3.2", LicPackage.eINSTANCE);
	}

	@Override
	public Iterable<LicensingCondition> readConditionDescriptors(InputStream input) throws IOException {
		Resource resource = new XMIResourceImpl();
		resource.load(input, new HashMap<>());
		List<LicensingCondition> extracted = new ArrayList<>();
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof LicensePackDescriptor) {
				LicensePackDescriptor license = (LicensePackDescriptor) eObject;
				Iterable<? extends LicensingCondition> conditions = license.getLicenseGrants();
				conditions.forEach(extracted::add);
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

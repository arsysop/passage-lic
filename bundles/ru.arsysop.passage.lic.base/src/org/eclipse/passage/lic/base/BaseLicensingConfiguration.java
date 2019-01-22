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
package org.eclipse.passage.lic.base;

import static org.eclipse.passage.lic.base.LicensingProperties.*;

import java.util.Objects;

import org.eclipse.passage.lic.runtime.LicensingConfiguration;

public class BaseLicensingConfiguration implements LicensingConfiguration {

	private final String productIdentifier;
	private final String productVersion;

	BaseLicensingConfiguration(String product, String version) {
		super();
		this.productIdentifier = product;
		this.productVersion = version;
	}

	@Override
	public String getProductIdentifier() {
		return productIdentifier;
	}

	@Override
	public String getProductVersion() {
		return productVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productIdentifier == null) ? 0 : productIdentifier.hashCode());
		result = prime * result + ((productVersion == null) ? 0 : productVersion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BaseLicensingConfiguration other = (BaseLicensingConfiguration) obj;
		if (!Objects.equals(productIdentifier, other.productIdentifier)) {
			return false;
		}
		if (!Objects.equals(productVersion, other.productVersion)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(LICENSING_PRODUCT_IDENTIFIER).append('=').append(productIdentifier).append(';');
		sb.append(LICENSING_PRODUCT_VERSION).append('=').append(productVersion);
		return sb.toString();
	}
	
	

}

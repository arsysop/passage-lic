/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.base;

import static org.eclipse.passage.lic.base.LicensingProperties.*;

import java.util.Date;

import org.eclipse.passage.lic.runtime.FeaturePermission;
import org.eclipse.passage.lic.runtime.LicensingCondition;
import org.eclipse.passage.lic.runtime.LicensingConfiguration;

public class BaseFeaturePermission implements FeaturePermission {

	private final LicensingCondition licensingCondition;
	private final LicensingConfiguration licensingConfiguration;
	private final Date leaseDate;
	private final Date expireDate;

	BaseFeaturePermission(LicensingCondition condition, LicensingConfiguration configuration, Date lease, Date expire) {
		this.licensingCondition = condition;
		this.licensingConfiguration = configuration;
		this.leaseDate = lease;
		this.expireDate = expire;
	}

	@Override
	public LicensingCondition getLicensingCondition() {
		return licensingCondition;
	}
	
	public LicensingConfiguration getLicensingConfiguration() {
		return licensingConfiguration;
	}

	@Override
	public Date getLeaseDate() {
		return leaseDate;
	}

	@Override
	public Date getExpireDate() {
		return expireDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(licensingCondition).append(';');
		sb.append(LICENSING_LEASE_TIME).append('=').append(leaseDate).append(';');
		sb.append(LICENSING_EXPIRE_TIME).append('=').append(expireDate);
		return sb.toString();
	}

}

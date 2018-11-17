/**
 * 	Copyright (c) 2018 ArSysOp
 * 
 * 	Licensed under the Apache License, Version 2.0 (the "License");
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 * 
 * 	SPDX-License-Identifier: Apache-2.0
 * 
 * 	Contributors:
 * 		ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.passage.lic.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.arsysop.passage.lic.model.api.LicenseCondition;

import ru.arsysop.passage.lic.model.meta.LicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl#getAllowedFeatureId <em>Allowed Feature Id</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl#getAllowedFeatureMatchVersion <em>Allowed Feature Match Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl#getAllowedFeatureMatchRule <em>Allowed Feature Match Rule</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseConditionImpl extends MinimalEObjectImpl.Container implements LicenseCondition {
	/**
	 * The default value of the '{@link #getAllowedFeatureId() <em>Allowed Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedFeatureId() <em>Allowed Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String allowedFeatureId = ALLOWED_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedFeatureMatchVersion() <em>Allowed Feature Match Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureMatchVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_FEATURE_MATCH_VERSION_EDEFAULT = "0.0.0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAllowedFeatureMatchVersion() <em>Allowed Feature Match Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureMatchVersion()
	 * @generated
	 * @ordered
	 */
	protected String allowedFeatureMatchVersion = ALLOWED_FEATURE_MATCH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedFeatureMatchRule() <em>Allowed Feature Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureMatchRule()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_FEATURE_MATCH_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedFeatureMatchRule() <em>Allowed Feature Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFeatureMatchRule()
	 * @generated
	 * @ordered
	 */
	protected String allowedFeatureMatchRule = ALLOWED_FEATURE_MATCH_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected String conditionType = CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionExpression() <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String conditionExpression = CONDITION_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LicPackage.Literals.LICENSE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedFeatureId() {
		return allowedFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedFeatureId(String newAllowedFeatureId) {
		String oldAllowedFeatureId = allowedFeatureId;
		allowedFeatureId = newAllowedFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID, oldAllowedFeatureId, allowedFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedFeatureMatchVersion() {
		return allowedFeatureMatchVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedFeatureMatchVersion(String newAllowedFeatureMatchVersion) {
		String oldAllowedFeatureMatchVersion = allowedFeatureMatchVersion;
		allowedFeatureMatchVersion = newAllowedFeatureMatchVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION, oldAllowedFeatureMatchVersion, allowedFeatureMatchVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedFeatureMatchRule() {
		return allowedFeatureMatchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedFeatureMatchRule(String newAllowedFeatureMatchRule) {
		String oldAllowedFeatureMatchRule = allowedFeatureMatchRule;
		allowedFeatureMatchRule = newAllowedFeatureMatchRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE, oldAllowedFeatureMatchRule, allowedFeatureMatchRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionType() {
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionType(String newConditionType) {
		String oldConditionType = conditionType;
		conditionType = newConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_CONDITION__CONDITION_TYPE, oldConditionType, conditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionExpression() {
		return conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(String newConditionExpression) {
		String oldConditionExpression = conditionExpression;
		conditionExpression = newConditionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION, oldConditionExpression, conditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID:
				return getAllowedFeatureId();
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION:
				return getAllowedFeatureMatchVersion();
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE:
				return getAllowedFeatureMatchRule();
			case LicPackage.LICENSE_CONDITION__CONDITION_TYPE:
				return getConditionType();
			case LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION:
				return getConditionExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID:
				setAllowedFeatureId((String)newValue);
				return;
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION:
				setAllowedFeatureMatchVersion((String)newValue);
				return;
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE:
				setAllowedFeatureMatchRule((String)newValue);
				return;
			case LicPackage.LICENSE_CONDITION__CONDITION_TYPE:
				setConditionType((String)newValue);
				return;
			case LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION:
				setConditionExpression((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID:
				setAllowedFeatureId(ALLOWED_FEATURE_ID_EDEFAULT);
				return;
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION:
				setAllowedFeatureMatchVersion(ALLOWED_FEATURE_MATCH_VERSION_EDEFAULT);
				return;
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE:
				setAllowedFeatureMatchRule(ALLOWED_FEATURE_MATCH_RULE_EDEFAULT);
				return;
			case LicPackage.LICENSE_CONDITION__CONDITION_TYPE:
				setConditionType(CONDITION_TYPE_EDEFAULT);
				return;
			case LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION:
				setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID:
				return ALLOWED_FEATURE_ID_EDEFAULT == null ? allowedFeatureId != null : !ALLOWED_FEATURE_ID_EDEFAULT.equals(allowedFeatureId);
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION:
				return ALLOWED_FEATURE_MATCH_VERSION_EDEFAULT == null ? allowedFeatureMatchVersion != null : !ALLOWED_FEATURE_MATCH_VERSION_EDEFAULT.equals(allowedFeatureMatchVersion);
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE:
				return ALLOWED_FEATURE_MATCH_RULE_EDEFAULT == null ? allowedFeatureMatchRule != null : !ALLOWED_FEATURE_MATCH_RULE_EDEFAULT.equals(allowedFeatureMatchRule);
			case LicPackage.LICENSE_CONDITION__CONDITION_TYPE:
				return CONDITION_TYPE_EDEFAULT == null ? conditionType != null : !CONDITION_TYPE_EDEFAULT.equals(conditionType);
			case LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION:
				return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null : !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (allowedFeatureId: "); //$NON-NLS-1$
		result.append(allowedFeatureId);
		result.append(", allowedFeatureMatchVersion: "); //$NON-NLS-1$
		result.append(allowedFeatureMatchVersion);
		result.append(", allowedFeatureMatchRule: "); //$NON-NLS-1$
		result.append(allowedFeatureMatchRule);
		result.append(", conditionType: "); //$NON-NLS-1$
		result.append(conditionType);
		result.append(", conditionExpression: "); //$NON-NLS-1$
		result.append(conditionExpression);
		result.append(')');
		return result.toString();
	}

} //LicenseConditionImpl

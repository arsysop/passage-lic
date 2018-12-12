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

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import ru.arsysop.passage.lic.model.api.LicenseGrant;

import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.meta.LicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LicensePack Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getFeatureIdentifier <em>Feature Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getMatchVersion <em>Match Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseGrantImpl#getLicensePack <em>License Pack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseGrantImpl extends MinimalEObjectImpl.Container implements LicenseGrant {
	/**
	 * The default value of the '{@link #getFeatureIdentifier() <em>Feature Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureIdentifier() <em>Feature Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String featureIdentifier = FEATURE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchVersion() <em>Match Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_VERSION_EDEFAULT = "0.0.0"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMatchVersion() <em>Match Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchVersion()
	 * @generated
	 * @ordered
	 */
	protected String matchVersion = MATCH_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected String matchRule = MATCH_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Date validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidUntil() <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidUntil()
	 * @generated
	 * @ordered
	 */
	protected Date validUntil = VALID_UNTIL_EDEFAULT;

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
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseGrantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LicPackage.Literals.LICENSE_GRANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureIdentifier() {
		return featureIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureIdentifier(String newFeatureIdentifier) {
		String oldFeatureIdentifier = featureIdentifier;
		featureIdentifier = newFeatureIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__FEATURE_IDENTIFIER, oldFeatureIdentifier, featureIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchVersion() {
		return matchVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchVersion(String newMatchVersion) {
		String oldMatchVersion = matchVersion;
		matchVersion = newMatchVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__MATCH_VERSION, oldMatchVersion, matchVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchRule() {
		return matchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchRule(String newMatchRule) {
		String oldMatchRule = matchRule;
		matchRule = newMatchRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__MATCH_RULE, oldMatchRule, matchRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Date newValidFrom) {
		Date oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidUntil(Date newValidUntil) {
		Date oldValidUntil = validUntil;
		validUntil = newValidUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__VALID_UNTIL, oldValidUntil, validUntil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__CONDITION_TYPE, oldConditionType, conditionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__CONDITION_EXPRESSION, oldConditionExpression, conditionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicensePack getLicensePack() {
		if (eContainerFeatureID() != LicPackage.LICENSE_GRANT__LICENSE_PACK) return null;
		return (LicensePack)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicensePack(LicensePack newLicensePack, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLicensePack, LicPackage.LICENSE_GRANT__LICENSE_PACK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensePack(LicensePack newLicensePack) {
		if (newLicensePack != eInternalContainer() || (eContainerFeatureID() != LicPackage.LICENSE_GRANT__LICENSE_PACK && newLicensePack != null)) {
			if (EcoreUtil.isAncestor(this, newLicensePack))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLicensePack != null)
				msgs = ((InternalEObject)newLicensePack).eInverseAdd(this, LicPackage.LICENSE_PACK__LICENSE_GRANTS, LicensePack.class, msgs);
			msgs = basicSetLicensePack(newLicensePack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE_GRANT__LICENSE_PACK, newLicensePack, newLicensePack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLicensePack((LicensePack)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				return basicSetLicensePack(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				return eInternalContainer().eInverseRemove(this, LicPackage.LICENSE_PACK__LICENSE_GRANTS, LicensePack.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LicPackage.LICENSE_GRANT__FEATURE_IDENTIFIER:
				return getFeatureIdentifier();
			case LicPackage.LICENSE_GRANT__MATCH_VERSION:
				return getMatchVersion();
			case LicPackage.LICENSE_GRANT__MATCH_RULE:
				return getMatchRule();
			case LicPackage.LICENSE_GRANT__VALID_FROM:
				return getValidFrom();
			case LicPackage.LICENSE_GRANT__VALID_UNTIL:
				return getValidUntil();
			case LicPackage.LICENSE_GRANT__CONDITION_TYPE:
				return getConditionType();
			case LicPackage.LICENSE_GRANT__CONDITION_EXPRESSION:
				return getConditionExpression();
			case LicPackage.LICENSE_GRANT__CAPACITY:
				return getCapacity();
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				return getLicensePack();
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
			case LicPackage.LICENSE_GRANT__FEATURE_IDENTIFIER:
				setFeatureIdentifier((String)newValue);
				return;
			case LicPackage.LICENSE_GRANT__MATCH_VERSION:
				setMatchVersion((String)newValue);
				return;
			case LicPackage.LICENSE_GRANT__MATCH_RULE:
				setMatchRule((String)newValue);
				return;
			case LicPackage.LICENSE_GRANT__VALID_FROM:
				setValidFrom((Date)newValue);
				return;
			case LicPackage.LICENSE_GRANT__VALID_UNTIL:
				setValidUntil((Date)newValue);
				return;
			case LicPackage.LICENSE_GRANT__CONDITION_TYPE:
				setConditionType((String)newValue);
				return;
			case LicPackage.LICENSE_GRANT__CONDITION_EXPRESSION:
				setConditionExpression((String)newValue);
				return;
			case LicPackage.LICENSE_GRANT__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				setLicensePack((LicensePack)newValue);
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
			case LicPackage.LICENSE_GRANT__FEATURE_IDENTIFIER:
				setFeatureIdentifier(FEATURE_IDENTIFIER_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__MATCH_VERSION:
				setMatchVersion(MATCH_VERSION_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__MATCH_RULE:
				setMatchRule(MATCH_RULE_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__VALID_UNTIL:
				setValidUntil(VALID_UNTIL_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__CONDITION_TYPE:
				setConditionType(CONDITION_TYPE_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__CONDITION_EXPRESSION:
				setConditionExpression(CONDITION_EXPRESSION_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				setLicensePack((LicensePack)null);
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
			case LicPackage.LICENSE_GRANT__FEATURE_IDENTIFIER:
				return FEATURE_IDENTIFIER_EDEFAULT == null ? featureIdentifier != null : !FEATURE_IDENTIFIER_EDEFAULT.equals(featureIdentifier);
			case LicPackage.LICENSE_GRANT__MATCH_VERSION:
				return MATCH_VERSION_EDEFAULT == null ? matchVersion != null : !MATCH_VERSION_EDEFAULT.equals(matchVersion);
			case LicPackage.LICENSE_GRANT__MATCH_RULE:
				return MATCH_RULE_EDEFAULT == null ? matchRule != null : !MATCH_RULE_EDEFAULT.equals(matchRule);
			case LicPackage.LICENSE_GRANT__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
			case LicPackage.LICENSE_GRANT__VALID_UNTIL:
				return VALID_UNTIL_EDEFAULT == null ? validUntil != null : !VALID_UNTIL_EDEFAULT.equals(validUntil);
			case LicPackage.LICENSE_GRANT__CONDITION_TYPE:
				return CONDITION_TYPE_EDEFAULT == null ? conditionType != null : !CONDITION_TYPE_EDEFAULT.equals(conditionType);
			case LicPackage.LICENSE_GRANT__CONDITION_EXPRESSION:
				return CONDITION_EXPRESSION_EDEFAULT == null ? conditionExpression != null : !CONDITION_EXPRESSION_EDEFAULT.equals(conditionExpression);
			case LicPackage.LICENSE_GRANT__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case LicPackage.LICENSE_GRANT__LICENSE_PACK:
				return getLicensePack() != null;
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
		result.append(" (featureIdentifier: "); //$NON-NLS-1$
		result.append(featureIdentifier);
		result.append(", matchVersion: "); //$NON-NLS-1$
		result.append(matchVersion);
		result.append(", matchRule: "); //$NON-NLS-1$
		result.append(matchRule);
		result.append(", validFrom: "); //$NON-NLS-1$
		result.append(validFrom);
		result.append(", validUntil: "); //$NON-NLS-1$
		result.append(validUntil);
		result.append(", conditionType: "); //$NON-NLS-1$
		result.append(conditionType);
		result.append(", conditionExpression: "); //$NON-NLS-1$
		result.append(conditionExpression);
		result.append(", capacity: "); //$NON-NLS-1$
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //LicenseGrantImpl

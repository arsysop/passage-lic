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

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.arsysop.passage.lic.model.api.License;
import ru.arsysop.passage.lic.model.api.LicenseCondition;

import ru.arsysop.passage.lic.model.meta.LicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getProductIdentifier <em>Product Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getUserIdentifier <em>User Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ru.arsysop.passage.lic.model.impl.LicenseImpl#getLicenseConditions <em>License Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseImpl extends MinimalEObjectImpl.Container implements License {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected Date issueDate = ISSUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected Date expireDate = EXPIRE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductIdentifier() <em>Product Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdentifier() <em>Product Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String productIdentifier = PRODUCT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserIdentifier() <em>User Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserIdentifier() <em>User Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String userIdentifier = USER_IDENTIFIER_EDEFAULT;

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
	 * The cached value of the '{@link #getLicenseConditions() <em>License Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<LicenseCondition> licenseConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LicPackage.Literals.LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(Date newIssueDate) {
		Date oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpireDate(Date newExpireDate) {
		Date oldExpireDate = expireDate;
		expireDate = newExpireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__EXPIRE_DATE, oldExpireDate, expireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductIdentifier() {
		return productIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductIdentifier(String newProductIdentifier) {
		String oldProductIdentifier = productIdentifier;
		productIdentifier = newProductIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__PRODUCT_IDENTIFIER, oldProductIdentifier, productIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserIdentifier(String newUserIdentifier) {
		String oldUserIdentifier = userIdentifier;
		userIdentifier = newUserIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__USER_IDENTIFIER, oldUserIdentifier, userIdentifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LicPackage.LICENSE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LicenseCondition> getLicenseConditions() {
		if (licenseConditions == null) {
			licenseConditions = new EObjectContainmentEList<LicenseCondition>(LicenseCondition.class, this, LicPackage.LICENSE__LICENSE_CONDITIONS);
		}
		return licenseConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LicPackage.LICENSE__LICENSE_CONDITIONS:
				return ((InternalEList<?>)getLicenseConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LicPackage.LICENSE__IDENTIFIER:
				return getIdentifier();
			case LicPackage.LICENSE__ISSUE_DATE:
				return getIssueDate();
			case LicPackage.LICENSE__EXPIRE_DATE:
				return getExpireDate();
			case LicPackage.LICENSE__PRODUCT_IDENTIFIER:
				return getProductIdentifier();
			case LicPackage.LICENSE__PRODUCT_VERSION:
				return getProductVersion();
			case LicPackage.LICENSE__USER_IDENTIFIER:
				return getUserIdentifier();
			case LicPackage.LICENSE__CAPACITY:
				return getCapacity();
			case LicPackage.LICENSE__LICENSE_CONDITIONS:
				return getLicenseConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LicPackage.LICENSE__ISSUE_DATE:
				setIssueDate((Date)newValue);
				return;
			case LicPackage.LICENSE__EXPIRE_DATE:
				setExpireDate((Date)newValue);
				return;
			case LicPackage.LICENSE__PRODUCT_IDENTIFIER:
				setProductIdentifier((String)newValue);
				return;
			case LicPackage.LICENSE__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case LicPackage.LICENSE__USER_IDENTIFIER:
				setUserIdentifier((String)newValue);
				return;
			case LicPackage.LICENSE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case LicPackage.LICENSE__LICENSE_CONDITIONS:
				getLicenseConditions().clear();
				getLicenseConditions().addAll((Collection<? extends LicenseCondition>)newValue);
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
			case LicPackage.LICENSE__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
				return;
			case LicPackage.LICENSE__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case LicPackage.LICENSE__PRODUCT_IDENTIFIER:
				setProductIdentifier(PRODUCT_IDENTIFIER_EDEFAULT);
				return;
			case LicPackage.LICENSE__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case LicPackage.LICENSE__USER_IDENTIFIER:
				setUserIdentifier(USER_IDENTIFIER_EDEFAULT);
				return;
			case LicPackage.LICENSE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case LicPackage.LICENSE__LICENSE_CONDITIONS:
				getLicenseConditions().clear();
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
			case LicPackage.LICENSE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case LicPackage.LICENSE__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
			case LicPackage.LICENSE__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case LicPackage.LICENSE__PRODUCT_IDENTIFIER:
				return PRODUCT_IDENTIFIER_EDEFAULT == null ? productIdentifier != null : !PRODUCT_IDENTIFIER_EDEFAULT.equals(productIdentifier);
			case LicPackage.LICENSE__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null : !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
			case LicPackage.LICENSE__USER_IDENTIFIER:
				return USER_IDENTIFIER_EDEFAULT == null ? userIdentifier != null : !USER_IDENTIFIER_EDEFAULT.equals(userIdentifier);
			case LicPackage.LICENSE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case LicPackage.LICENSE__LICENSE_CONDITIONS:
				return licenseConditions != null && !licenseConditions.isEmpty();
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
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", issueDate: "); //$NON-NLS-1$
		result.append(issueDate);
		result.append(", expireDate: "); //$NON-NLS-1$
		result.append(expireDate);
		result.append(", productIdentifier: "); //$NON-NLS-1$
		result.append(productIdentifier);
		result.append(", productVersion: "); //$NON-NLS-1$
		result.append(productVersion);
		result.append(", userIdentifier: "); //$NON-NLS-1$
		result.append(userIdentifier);
		result.append(", capacity: "); //$NON-NLS-1$
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //LicenseImpl

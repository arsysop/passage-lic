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
package ru.arsysop.passage.licensing.runtime.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ru.arsysop.passage.licensing.runtime.model.api.Product;
import ru.arsysop.passage.licensing.runtime.model.meta.LicensingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getInstallationToken <em>Installation Token</em>}</li>
 *   <li>{@link ru.arsysop.passage.licensing.runtime.model.impl.ProductImpl#getSecureToken <em>Secure Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected static final String VERSION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected String version = VERSION_EDEFAULT;

		/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

		/**
	 * The default value of the '{@link #getInstallationToken() <em>Installation Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstallationToken()
	 * @generated
	 * @ordered
	 */
  protected static final String INSTALLATION_TOKEN_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getInstallationToken() <em>Installation Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstallationToken()
	 * @generated
	 * @ordered
	 */
  protected String installationToken = INSTALLATION_TOKEN_EDEFAULT;

		/**
	 * The default value of the '{@link #getSecureToken() <em>Secure Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecureToken()
	 * @generated
	 * @ordered
	 */
  protected static final String SECURE_TOKEN_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getSecureToken() <em>Secure Token</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSecureToken()
	 * @generated
	 * @ordered
	 */
  protected String secureToken = SECURE_TOKEN_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProductImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return LicensingPackage.Literals.PRODUCT;
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
  public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__IDENTIFIER, oldIdentifier, identifier));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getVersion() {
		return version;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__VERSION, oldVersion, version));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getInstallationToken() {
		return installationToken;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstallationToken(String newInstallationToken) {
		String oldInstallationToken = installationToken;
		installationToken = newInstallationToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__INSTALLATION_TOKEN, oldInstallationToken, installationToken));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getSecureToken() {
		return secureToken;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSecureToken(String newSecureToken) {
		String oldSecureToken = secureToken;
		secureToken = newSecureToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__SECURE_TOKEN, oldSecureToken, secureToken));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription() {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LicensingPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LicensingPackage.PRODUCT__IDENTIFIER:
				return getIdentifier();
			case LicensingPackage.PRODUCT__VERSION:
				return getVersion();
			case LicensingPackage.PRODUCT__NAME:
				return getName();
			case LicensingPackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case LicensingPackage.PRODUCT__INSTALLATION_TOKEN:
				return getInstallationToken();
			case LicensingPackage.PRODUCT__SECURE_TOKEN:
				return getSecureToken();
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
			case LicensingPackage.PRODUCT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case LicensingPackage.PRODUCT__VERSION:
				setVersion((String)newValue);
				return;
			case LicensingPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case LicensingPackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LicensingPackage.PRODUCT__INSTALLATION_TOKEN:
				setInstallationToken((String)newValue);
				return;
			case LicensingPackage.PRODUCT__SECURE_TOKEN:
				setSecureToken((String)newValue);
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
			case LicensingPackage.PRODUCT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case LicensingPackage.PRODUCT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case LicensingPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LicensingPackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LicensingPackage.PRODUCT__INSTALLATION_TOKEN:
				setInstallationToken(INSTALLATION_TOKEN_EDEFAULT);
				return;
			case LicensingPackage.PRODUCT__SECURE_TOKEN:
				setSecureToken(SECURE_TOKEN_EDEFAULT);
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
			case LicensingPackage.PRODUCT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case LicensingPackage.PRODUCT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case LicensingPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LicensingPackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LicensingPackage.PRODUCT__INSTALLATION_TOKEN:
				return INSTALLATION_TOKEN_EDEFAULT == null ? installationToken != null : !INSTALLATION_TOKEN_EDEFAULT.equals(installationToken);
			case LicensingPackage.PRODUCT__SECURE_TOKEN:
				return SECURE_TOKEN_EDEFAULT == null ? secureToken != null : !SECURE_TOKEN_EDEFAULT.equals(secureToken);
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
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", installationToken: "); //$NON-NLS-1$
		result.append(installationToken);
		result.append(", secureToken: "); //$NON-NLS-1$
		result.append(secureToken);
		result.append(')');
		return result.toString();
	}

  /**
   * @generated NOT
   */
  @Override
  public String createPassword() {
     return name+"###"+version;
  }

} //ProductImpl

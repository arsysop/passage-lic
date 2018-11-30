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
package ru.arsysop.passage.lic.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.arsysop.passage.lic.model.api.*;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.model.meta.LicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LicFactoryImpl extends EFactoryImpl implements LicFactory {
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static LicFactory init() {
		try {
			LicFactory theLicFactory = (LicFactory)EPackage.Registry.INSTANCE.getEFactory(LicPackage.eNS_URI);
			if (theLicFactory != null) {
				return theLicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LicFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LicFactoryImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LicPackage.FEATURE: return createFeature();
			case LicPackage.FEATURE_VERSION: return createFeatureVersion();
			case LicPackage.PRODUCT: return createProduct();
			case LicPackage.PRODUCT_VERSION: return createProductVersion();
			case LicPackage.PRODUCT_VERSION_FEATURE: return createProductVersionFeature();
			case LicPackage.USER: return createUser();
			case LicPackage.LICENSE: return createLicense();
			case LicPackage.LICENSE_CONDITION: return createLicenseCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVersion createProductVersion() {
		ProductVersionImpl productVersion = new ProductVersionImpl();
		return productVersion;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductVersionFeature createProductVersionFeature() {
		ProductVersionFeatureImpl productVersionFeature = new ProductVersionFeatureImpl();
		return productVersionFeature;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureVersion createFeatureVersion() {
		FeatureVersionImpl featureVersion = new FeatureVersionImpl();
		return featureVersion;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicensePack createLicense() {
		LicensePackImpl license = new LicensePackImpl();
		return license;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseGrant createLicenseCondition() {
		LicenseGrantImpl licenseCondition = new LicenseGrantImpl();
		return licenseCondition;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicPackage getLicPackage() {
		return (LicPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static LicPackage getPackage() {
		return LicPackage.eINSTANCE;
	}

} //PassageFactoryImpl

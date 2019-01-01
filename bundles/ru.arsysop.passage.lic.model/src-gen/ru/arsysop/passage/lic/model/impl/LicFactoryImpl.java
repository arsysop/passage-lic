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
			case LicPackage.FEATURE_SET: return createFeatureSet();
			case LicPackage.FEATURE: return createFeature();
			case LicPackage.FEATURE_VERSION: return createFeatureVersion();
			case LicPackage.PRODUCT_LINE: return createProductLine();
			case LicPackage.PRODUCT: return createProduct();
			case LicPackage.PRODUCT_VERSION: return createProductVersion();
			case LicPackage.PRODUCT_VERSION_FEATURE: return createProductVersionFeature();
			case LicPackage.USER_ORIGIN: return createUserOrigin();
			case LicPackage.USER: return createUser();
			case LicPackage.LICENSE_PACK: return createLicensePack();
			case LicPackage.LICENSE_GRANT: return createLicenseGrant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSet createFeatureSet() {
		FeatureSetImpl featureSet = new FeatureSetImpl();
		return featureSet;
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
	public UserOrigin createUserOrigin() {
		UserOriginImpl userOrigin = new UserOriginImpl();
		return userOrigin;
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
	public ProductLine createProductLine() {
		ProductLineImpl productLine = new ProductLineImpl();
		return productLine;
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
	public LicensePack createLicensePack() {
		LicensePackImpl licensePack = new LicensePackImpl();
		return licensePack;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseGrant createLicenseGrant() {
		LicenseGrantImpl licenseGrant = new LicenseGrantImpl();
		return licenseGrant;
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

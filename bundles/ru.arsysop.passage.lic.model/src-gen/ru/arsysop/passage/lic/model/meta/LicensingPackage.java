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
package ru.arsysop.passage.lic.model.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.arsysop.passage.lic.model.meta.LicensingFactory
 * @model kind="package"
 * @generated
 */
public interface LicensingPackage extends EPackage {
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "licensing";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.arsysop.ru/passage/licensing/0.2.0";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ru.arsysop.passage.licensing";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  LicensingPackage eINSTANCE = ru.arsysop.passage.lic.model.impl.LicensingPackageImpl.init();

  /**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getProductDescriptor()
	 * @generated
	 */
	int PRODUCT_DESCRIPTOR = 0;

		/**
	 * The number of structural features of the '<em>Product Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Product Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getFeatureDescriptor()
	 * @generated
	 */
	int FEATURE_DESCRIPTOR = 1;

		/**
	 * The number of structural features of the '<em>Feature Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Feature Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>Licensee Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.UserDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getLicenseeDescriptor()
	 * @generated
	 */
	int LICENSEE_DESCRIPTOR = 2;

		/**
	 * The number of structural features of the '<em>Licensee Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Licensee Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.ProductImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getProduct()
	 * @generated
	 */
  int PRODUCT = 3;

  /**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__IDENTIFIER = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__VERSION = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__NAME = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__DESCRIPTION = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Installation Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__INSTALLATION_TOKEN = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Secure Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__SECURE_TOKEN = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT_FEATURE_COUNT = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT_OPERATION_COUNT = PRODUCT_DESCRIPTOR_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.FeatureImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

		/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IDENTIFIER = FEATURE_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = FEATURE_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FEATURE_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = FEATURE_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FEATURE_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = FEATURE_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.LicenseeImpl <em>Licensee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.LicenseeImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getLicensee()
	 * @generated
	 */
	int LICENSEE = 5;

		/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE__EMAIL = LICENSEE_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE__FULL_NAME = LICENSEE_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE__DESCRIPTION = LICENSEE_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Licensee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_FEATURE_COUNT = LICENSEE_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Licensee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEE_OPERATION_COUNT = LICENSEE_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
	 * @model instanceClass="ru.arsysop.passage.licensing.runtime.registry.ProductDescriptor"
	 * @generated
	 */
	EClass getProductDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
	 * @model instanceClass="ru.arsysop.passage.licensing.runtime.registry.FeatureDescriptor"
	 * @generated
	 */
	EClass getFeatureDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>Licensee Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licensee Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.UserDescriptor
	 * @model instanceClass="ru.arsysop.passage.licensing.runtime.registry.LicenseeDescriptor"
	 * @generated
	 */
	EClass getLicenseeDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product
	 * @generated
	 */
  EClass getProduct();

  /**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getIdentifier()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_Identifier();

  /**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_Name();

  /**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getVersion()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_Version();

  /**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getInstallationToken <em>Installation Token</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Token</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getInstallationToken()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_InstallationToken();

  /**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getSecureToken <em>Secure Token</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Token</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getSecureToken()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_SecureToken();

  /**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature
	 * @generated
	 */
	EClass getFeature();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Feature#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature#getIdentifier()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Identifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Feature#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature#getVersion()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Version();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.Licensee <em>Licensee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licensee</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Licensee
	 * @generated
	 */
	EClass getLicensee();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Licensee#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Licensee#getEmail()
	 * @see #getLicensee()
	 * @generated
	 */
	EAttribute getLicensee_Email();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Licensee#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Licensee#getFullName()
	 * @see #getLicensee()
	 * @generated
	 */
	EAttribute getLicensee_FullName();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Licensee#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Licensee#getDescription()
	 * @see #getLicensee()
	 * @generated
	 */
	EAttribute getLicensee_Description();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LicensingFactory getLicensingFactory();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
  EAttribute getProduct_Description();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals {
    /**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getProductDescriptor()
		 * @generated
		 */
		EClass PRODUCT_DESCRIPTOR = eINSTANCE.getProductDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getFeatureDescriptor()
		 * @generated
		 */
		EClass FEATURE_DESCRIPTOR = eINSTANCE.getFeatureDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>Licensee Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.UserDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getLicenseeDescriptor()
		 * @generated
		 */
		EClass LICENSEE_DESCRIPTOR = eINSTANCE.getLicenseeDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.ProductImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getProduct()
		 * @generated
		 */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__IDENTIFIER = eINSTANCE.getProduct_Identifier();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

    /**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__VERSION = eINSTANCE.getProduct_Version();

    /**
		 * The meta object literal for the '<em><b>Installation Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__INSTALLATION_TOKEN = eINSTANCE.getProduct_InstallationToken();

    /**
		 * The meta object literal for the '<em><b>Secure Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__SECURE_TOKEN = eINSTANCE.getProduct_SecureToken();

    /**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.FeatureImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

				/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IDENTIFIER = eINSTANCE.getFeature_Identifier();

				/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VERSION = eINSTANCE.getFeature_Version();

				/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

				/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.LicenseeImpl <em>Licensee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.LicenseeImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicensingPackageImpl#getLicensee()
		 * @generated
		 */
		EClass LICENSEE = eINSTANCE.getLicensee();

				/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSEE__EMAIL = eINSTANCE.getLicensee_Email();

				/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSEE__FULL_NAME = eINSTANCE.getLicensee_FullName();

				/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSEE__DESCRIPTION = eINSTANCE.getLicensee_Description();

				/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

  }

} //PassagePackage

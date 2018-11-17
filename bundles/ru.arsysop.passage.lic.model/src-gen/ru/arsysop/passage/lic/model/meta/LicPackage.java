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
import org.eclipse.emf.ecore.EReference;

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
 * @see ru.arsysop.passage.lic.model.meta.LicFactory
 * @model kind="package"
 * @generated
 */
public interface LicPackage extends EPackage {
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "lic";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.arsysop.ru/passage/lic/0.3.0";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ru.arsysop.passage.lic";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  LicPackage eINSTANCE = ru.arsysop.passage.lic.model.impl.LicPackageImpl.init();

  /**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductDescriptor()
	 * @generated
	 */
	int PRODUCT_DESCRIPTOR = 2;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.ProductVersionDescriptor <em>Product Version Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.ProductVersionDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersionDescriptor()
	 * @generated
	 */
	int PRODUCT_VERSION_DESCRIPTOR = 3;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureDescriptor()
	 * @generated
	 */
	int FEATURE_DESCRIPTOR = 0;

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
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.FeatureVersionDescriptor <em>Feature Version Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.FeatureVersionDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureVersionDescriptor()
	 * @generated
	 */
	int FEATURE_VERSION_DESCRIPTOR = 1;

		/**
	 * The number of structural features of the '<em>Feature Version Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Feature Version Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION_DESCRIPTOR_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Product Version Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Product Version Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>User Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.UserDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getUserDescriptor()
	 * @generated
	 */
	int USER_DESCRIPTOR = 4;

		/**
	 * The number of structural features of the '<em>User Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>User Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.registry.LicenseDescriptor <em>License Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.registry.LicenseDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicenseDescriptor()
	 * @generated
	 */
	int LICENSE_DESCRIPTOR = 5;

		/**
	 * The number of structural features of the '<em>License Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>License Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.runtime.ConditionDescriptor <em>Condition Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.runtime.ConditionDescriptor
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getConditionDescriptor()
	 * @generated
	 */
	int CONDITION_DESCRIPTOR = 6;

		/**
	 * The number of structural features of the '<em>Condition Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESCRIPTOR_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Condition Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_DESCRIPTOR_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.ProductImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProduct()
	 * @generated
	 */
  int PRODUCT = 9;

  /**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.ProductVersionImpl <em>Product Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.ProductVersionImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersion()
	 * @generated
	 */
	int PRODUCT_VERSION = 10;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.ProductVersionFeatureImpl <em>Product Version Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.ProductVersionFeatureImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersionFeature()
	 * @generated
	 */
	int PRODUCT_VERSION_FEATURE = 11;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.FeatureImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 7;

		/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IDENTIFIER = FEATURE_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FEATURE_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = FEATURE_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Feature Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_VERSIONS = FEATURE_DESCRIPTOR_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.FeatureVersionImpl <em>Feature Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.FeatureVersionImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureVersion()
	 * @generated
	 */
	int FEATURE_VERSION = 8;

		/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__VERSION = FEATURE_VERSION_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__FEATURE = FEATURE_VERSION_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>News</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION__NEWS = FEATURE_VERSION_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Feature Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION_FEATURE_COUNT = FEATURE_VERSION_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Feature Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VERSION_OPERATION_COUNT = FEATURE_VERSION_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__IDENTIFIER = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__NAME = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT__DESCRIPTION = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Product Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_VERSIONS = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT_FEATURE_COUNT = PRODUCT_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRODUCT_OPERATION_COUNT = PRODUCT_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__VERSION = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__PRODUCT = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Installation Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__INSTALLATION_TOKEN = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Secure Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__SECURE_TOKEN = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Product Version Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__PRODUCT_VERSION_FEATURES = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>News</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION__NEWS = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 5;

		/**
	 * The number of structural features of the '<em>Product Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE_COUNT = PRODUCT_VERSION_DESCRIPTOR_FEATURE_COUNT + 6;

		/**
	 * The number of operations of the '<em>Product Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_OPERATION_COUNT = PRODUCT_VERSION_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Feature Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE__FEATURE_IDENTIFIER = 0;

		/**
	 * The feature id for the '<em><b>Feature Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE__FEATURE_VERSION = 1;

		/**
	 * The feature id for the '<em><b>Restriction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE__RESTRICTION_LEVEL = 2;

		/**
	 * The feature id for the '<em><b>Product Version</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE__PRODUCT_VERSION = 3;

		/**
	 * The number of structural features of the '<em>Product Version Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE_FEATURE_COUNT = 4;

		/**
	 * The number of operations of the '<em>Product Version Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_VERSION_FEATURE_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.UserImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getUser()
	 * @generated
	 */
	int USER = 12;

		/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IDENTIFIER = USER_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = USER_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FULL_NAME = USER_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = USER_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = USER_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = USER_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.LicenseImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 13;

		/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__IDENTIFIER = LICENSE_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__ISSUE_DATE = LICENSE_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__EXPIRE_DATE = LICENSE_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Product Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__PRODUCT_IDENTIFIER = LICENSE_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__PRODUCT_VERSION = LICENSE_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>User Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__USER_IDENTIFIER = LICENSE_DESCRIPTOR_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__CAPACITY = LICENSE_DESCRIPTOR_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>License Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__LICENSE_CONDITIONS = LICENSE_DESCRIPTOR_FEATURE_COUNT + 7;

		/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = LICENSE_DESCRIPTOR_FEATURE_COUNT + 8;

		/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = LICENSE_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl <em>License Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.arsysop.passage.lic.model.impl.LicenseConditionImpl
	 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicenseCondition()
	 * @generated
	 */
	int LICENSE_CONDITION = 14;

		/**
	 * The feature id for the '<em><b>Allowed Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION__ALLOWED_FEATURE_ID = CONDITION_DESCRIPTOR_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Allowed Feature Match Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION = CONDITION_DESCRIPTOR_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Allowed Feature Match Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE = CONDITION_DESCRIPTOR_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION__CONDITION_TYPE = CONDITION_DESCRIPTOR_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION__CONDITION_EXPRESSION = CONDITION_DESCRIPTOR_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>License Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION_FEATURE_COUNT = CONDITION_DESCRIPTOR_FEATURE_COUNT + 5;

		/**
	 * The number of operations of the '<em>License Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_CONDITION_OPERATION_COUNT = CONDITION_DESCRIPTOR_OPERATION_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.ProductDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.ProductDescriptor"
	 * @generated
	 */
	EClass getProductDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.ProductVersionDescriptor <em>Product Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Version Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.ProductVersionDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.ProductVersionDescriptor"
	 * @generated
	 */
	EClass getProductVersionDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.FeatureDescriptor"
	 * @generated
	 */
	EClass getFeatureDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.FeatureVersionDescriptor <em>Feature Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Version Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.FeatureVersionDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.FeatureVersionDescriptor"
	 * @generated
	 */
	EClass getFeatureVersionDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>User Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.UserDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.UserDescriptor"
	 * @generated
	 */
	EClass getUserDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.registry.LicenseDescriptor <em>License Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.registry.LicenseDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.registry.LicenseDescriptor"
	 * @generated
	 */
	EClass getLicenseDescriptor();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.runtime.ConditionDescriptor <em>Condition Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Descriptor</em>'.
	 * @see ru.arsysop.passage.lic.runtime.ConditionDescriptor
	 * @model instanceClass="ru.arsysop.passage.lic.runtime.ConditionDescriptor"
	 * @generated
	 */
	EClass getConditionDescriptor();

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
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.passage.lic.model.api.Feature#getFeatureVersions <em>Feature Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Versions</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Feature#getFeatureVersions()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureVersions();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.FeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion
	 * @generated
	 */
	EClass getFeatureVersion();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.FeatureVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion#getVersion()
	 * @see #getFeatureVersion()
	 * @generated
	 */
	EAttribute getFeatureVersion_Version();

		/**
	 * Returns the meta object for the container reference '{@link ru.arsysop.passage.lic.model.api.FeatureVersion#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion#getFeature()
	 * @see #getFeatureVersion()
	 * @generated
	 */
	EReference getFeatureVersion_Feature();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.FeatureVersion#getNews <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>News</em>'.
	 * @see ru.arsysop.passage.lic.model.api.FeatureVersion#getNews()
	 * @see #getFeatureVersion()
	 * @generated
	 */
	EAttribute getFeatureVersion_News();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see ru.arsysop.passage.lic.model.api.User
	 * @generated
	 */
	EClass getUser();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.User#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.User#getIdentifier()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Identifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see ru.arsysop.passage.lic.model.api.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.User#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see ru.arsysop.passage.lic.model.api.User#getFullName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FullName();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.User#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ru.arsysop.passage.lic.model.api.User#getDescription()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Description();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License
	 * @generated
	 */
	EClass getLicense();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getIdentifier()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Identifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getIssueDate()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_IssueDate();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getExpireDate <em>Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Date</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getExpireDate()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_ExpireDate();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getProductIdentifier <em>Product Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getProductIdentifier()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_ProductIdentifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getProductVersion()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_ProductVersion();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getUserIdentifier <em>User Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getUserIdentifier()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_UserIdentifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.License#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getCapacity()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Capacity();

		/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.passage.lic.model.api.License#getLicenseConditions <em>License Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>License Conditions</em>'.
	 * @see ru.arsysop.passage.lic.model.api.License#getLicenseConditions()
	 * @see #getLicense()
	 * @generated
	 */
	EReference getLicense_LicenseConditions();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.LicenseCondition <em>License Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License Condition</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition
	 * @generated
	 */
	EClass getLicenseCondition();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureId <em>Allowed Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Feature Id</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureId()
	 * @see #getLicenseCondition()
	 * @generated
	 */
	EAttribute getLicenseCondition_AllowedFeatureId();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchVersion <em>Allowed Feature Match Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Feature Match Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchVersion()
	 * @see #getLicenseCondition()
	 * @generated
	 */
	EAttribute getLicenseCondition_AllowedFeatureMatchVersion();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchRule <em>Allowed Feature Match Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Feature Match Rule</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition#getAllowedFeatureMatchRule()
	 * @see #getLicenseCondition()
	 * @generated
	 */
	EAttribute getLicenseCondition_AllowedFeatureMatchRule();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionType()
	 * @see #getLicenseCondition()
	 * @generated
	 */
	EAttribute getLicenseCondition_ConditionType();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Expression</em>'.
	 * @see ru.arsysop.passage.lic.model.api.LicenseCondition#getConditionExpression()
	 * @see #getLicenseCondition()
	 * @generated
	 */
	EAttribute getLicenseCondition_ConditionExpression();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LicFactory getLicFactory();

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
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.passage.lic.model.api.Product#getProductVersions <em>Product Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Versions</em>'.
	 * @see ru.arsysop.passage.lic.model.api.Product#getProductVersions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductVersions();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.ProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion
	 * @generated
	 */
	EClass getProductVersion();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getVersion()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_Version();

		/**
	 * Returns the meta object for the container reference '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getProduct()
	 * @see #getProductVersion()
	 * @generated
	 */
	EReference getProductVersion_Product();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getInstallationToken <em>Installation Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Token</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getInstallationToken()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_InstallationToken();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getSecureToken <em>Secure Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Token</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getSecureToken()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_SecureToken();

		/**
	 * Returns the meta object for the containment reference list '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getProductVersionFeatures <em>Product Version Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Version Features</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getProductVersionFeatures()
	 * @see #getProductVersion()
	 * @generated
	 */
	EReference getProductVersion_ProductVersionFeatures();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersion#getNews <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>News</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersion#getNews()
	 * @see #getProductVersion()
	 * @generated
	 */
	EAttribute getProductVersion_News();

		/**
	 * Returns the meta object for class '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature <em>Product Version Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Version Feature</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature
	 * @generated
	 */
	EClass getProductVersionFeature();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature#getFeatureIdentifier <em>Feature Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Identifier</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature#getFeatureIdentifier()
	 * @see #getProductVersionFeature()
	 * @generated
	 */
	EAttribute getProductVersionFeature_FeatureIdentifier();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature#getFeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature#getFeatureVersion()
	 * @see #getProductVersionFeature()
	 * @generated
	 */
	EAttribute getProductVersionFeature_FeatureVersion();

		/**
	 * Returns the meta object for the attribute '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature#getRestrictionLevel <em>Restriction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction Level</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature#getRestrictionLevel()
	 * @see #getProductVersionFeature()
	 * @generated
	 */
	EAttribute getProductVersionFeature_RestrictionLevel();

		/**
	 * Returns the meta object for the container reference '{@link ru.arsysop.passage.lic.model.api.ProductVersionFeature#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Version</em>'.
	 * @see ru.arsysop.passage.lic.model.api.ProductVersionFeature#getProductVersion()
	 * @see #getProductVersionFeature()
	 * @generated
	 */
	EReference getProductVersionFeature_ProductVersion();

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
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductDescriptor()
		 * @generated
		 */
		EClass PRODUCT_DESCRIPTOR = eINSTANCE.getProductDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.ProductVersionDescriptor <em>Product Version Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.ProductVersionDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersionDescriptor()
		 * @generated
		 */
		EClass PRODUCT_VERSION_DESCRIPTOR = eINSTANCE.getProductVersionDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.FeatureDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureDescriptor()
		 * @generated
		 */
		EClass FEATURE_DESCRIPTOR = eINSTANCE.getFeatureDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.FeatureVersionDescriptor <em>Feature Version Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.FeatureVersionDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureVersionDescriptor()
		 * @generated
		 */
		EClass FEATURE_VERSION_DESCRIPTOR = eINSTANCE.getFeatureVersionDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.UserDescriptor <em>User Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.UserDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getUserDescriptor()
		 * @generated
		 */
		EClass USER_DESCRIPTOR = eINSTANCE.getUserDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.registry.LicenseDescriptor <em>License Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.registry.LicenseDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicenseDescriptor()
		 * @generated
		 */
		EClass LICENSE_DESCRIPTOR = eINSTANCE.getLicenseDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.runtime.ConditionDescriptor <em>Condition Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.runtime.ConditionDescriptor
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getConditionDescriptor()
		 * @generated
		 */
		EClass CONDITION_DESCRIPTOR = eINSTANCE.getConditionDescriptor();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.ProductImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProduct()
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
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.FeatureImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeature()
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
		 * The meta object literal for the '<em><b>Feature Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_VERSIONS = eINSTANCE.getFeature_FeatureVersions();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.FeatureVersionImpl <em>Feature Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.FeatureVersionImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getFeatureVersion()
		 * @generated
		 */
		EClass FEATURE_VERSION = eINSTANCE.getFeatureVersion();

				/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VERSION__VERSION = eINSTANCE.getFeatureVersion_Version();

				/**
		 * The meta object literal for the '<em><b>Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VERSION__FEATURE = eINSTANCE.getFeatureVersion_Feature();

				/**
		 * The meta object literal for the '<em><b>News</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_VERSION__NEWS = eINSTANCE.getFeatureVersion_News();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.UserImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

				/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IDENTIFIER = eINSTANCE.getUser_Identifier();

				/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

				/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FULL_NAME = eINSTANCE.getUser_FullName();

				/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DESCRIPTION = eINSTANCE.getUser_Description();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.LicenseImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

				/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__IDENTIFIER = eINSTANCE.getLicense_Identifier();

				/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__ISSUE_DATE = eINSTANCE.getLicense_IssueDate();

				/**
		 * The meta object literal for the '<em><b>Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__EXPIRE_DATE = eINSTANCE.getLicense_ExpireDate();

				/**
		 * The meta object literal for the '<em><b>Product Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__PRODUCT_IDENTIFIER = eINSTANCE.getLicense_ProductIdentifier();

				/**
		 * The meta object literal for the '<em><b>Product Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__PRODUCT_VERSION = eINSTANCE.getLicense_ProductVersion();

				/**
		 * The meta object literal for the '<em><b>User Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__USER_IDENTIFIER = eINSTANCE.getLicense_UserIdentifier();

				/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__CAPACITY = eINSTANCE.getLicense_Capacity();

				/**
		 * The meta object literal for the '<em><b>License Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LICENSE__LICENSE_CONDITIONS = eINSTANCE.getLicense_LicenseConditions();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.LicenseConditionImpl <em>License Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.LicenseConditionImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getLicenseCondition()
		 * @generated
		 */
		EClass LICENSE_CONDITION = eINSTANCE.getLicenseCondition();

				/**
		 * The meta object literal for the '<em><b>Allowed Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_CONDITION__ALLOWED_FEATURE_ID = eINSTANCE.getLicenseCondition_AllowedFeatureId();

				/**
		 * The meta object literal for the '<em><b>Allowed Feature Match Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION = eINSTANCE.getLicenseCondition_AllowedFeatureMatchVersion();

				/**
		 * The meta object literal for the '<em><b>Allowed Feature Match Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE = eINSTANCE.getLicenseCondition_AllowedFeatureMatchRule();

				/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_CONDITION__CONDITION_TYPE = eINSTANCE.getLicenseCondition_ConditionType();

				/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE_CONDITION__CONDITION_EXPRESSION = eINSTANCE.getLicenseCondition_ConditionExpression();

				/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

				/**
		 * The meta object literal for the '<em><b>Product Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_VERSIONS = eINSTANCE.getProduct_ProductVersions();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.ProductVersionImpl <em>Product Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.ProductVersionImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersion()
		 * @generated
		 */
		EClass PRODUCT_VERSION = eINSTANCE.getProductVersion();

				/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__VERSION = eINSTANCE.getProductVersion_Version();

				/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_VERSION__PRODUCT = eINSTANCE.getProductVersion_Product();

				/**
		 * The meta object literal for the '<em><b>Installation Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__INSTALLATION_TOKEN = eINSTANCE.getProductVersion_InstallationToken();

				/**
		 * The meta object literal for the '<em><b>Secure Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__SECURE_TOKEN = eINSTANCE.getProductVersion_SecureToken();

				/**
		 * The meta object literal for the '<em><b>Product Version Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_VERSION__PRODUCT_VERSION_FEATURES = eINSTANCE.getProductVersion_ProductVersionFeatures();

				/**
		 * The meta object literal for the '<em><b>News</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION__NEWS = eINSTANCE.getProductVersion_News();

				/**
		 * The meta object literal for the '{@link ru.arsysop.passage.lic.model.impl.ProductVersionFeatureImpl <em>Product Version Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.arsysop.passage.lic.model.impl.ProductVersionFeatureImpl
		 * @see ru.arsysop.passage.lic.model.impl.LicPackageImpl#getProductVersionFeature()
		 * @generated
		 */
		EClass PRODUCT_VERSION_FEATURE = eINSTANCE.getProductVersionFeature();

				/**
		 * The meta object literal for the '<em><b>Feature Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION_FEATURE__FEATURE_IDENTIFIER = eINSTANCE.getProductVersionFeature_FeatureIdentifier();

				/**
		 * The meta object literal for the '<em><b>Feature Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION_FEATURE__FEATURE_VERSION = eINSTANCE.getProductVersionFeature_FeatureVersion();

				/**
		 * The meta object literal for the '<em><b>Restriction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_VERSION_FEATURE__RESTRICTION_LEVEL = eINSTANCE.getProductVersionFeature_RestrictionLevel();

				/**
		 * The meta object literal for the '<em><b>Product Version</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_VERSION_FEATURE__PRODUCT_VERSION = eINSTANCE.getProductVersionFeature_ProductVersion();

  }

} //PassagePackage

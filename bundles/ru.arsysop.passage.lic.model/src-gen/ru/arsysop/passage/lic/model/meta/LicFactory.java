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

import org.eclipse.emf.ecore.EFactory;

import ru.arsysop.passage.lic.model.api.Feature;
import ru.arsysop.passage.lic.model.api.FeatureVersion;
import ru.arsysop.passage.lic.model.api.License;
import ru.arsysop.passage.lic.model.api.LicenseCondition;
import ru.arsysop.passage.lic.model.api.User;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.api.ProductVersion;
import ru.arsysop.passage.lic.model.api.ProductVersionFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.arsysop.passage.lic.model.meta.LicPackage
 * @generated
 */
public interface LicFactory extends EFactory {
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  LicFactory eINSTANCE = ru.arsysop.passage.lic.model.impl.LicFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
  Product createProduct();

  /**
	 * Returns a new object of class '<em>Product Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Version</em>'.
	 * @generated
	 */
	ProductVersion createProductVersion();

		/**
	 * Returns a new object of class '<em>Product Version Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Version Feature</em>'.
	 * @generated
	 */
	ProductVersionFeature createProductVersionFeature();

		/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

		/**
	 * Returns a new object of class '<em>Feature Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Version</em>'.
	 * @generated
	 */
	FeatureVersion createFeatureVersion();

		/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

		/**
	 * Returns a new object of class '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License</em>'.
	 * @generated
	 */
	License createLicense();

		/**
	 * Returns a new object of class '<em>License Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Condition</em>'.
	 * @generated
	 */
	LicenseCondition createLicenseCondition();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LicPackage getLicPackage();

} //PassageFactory

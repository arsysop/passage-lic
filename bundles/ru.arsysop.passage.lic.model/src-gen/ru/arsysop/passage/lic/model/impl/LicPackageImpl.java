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
package ru.arsysop.passage.lic.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.arsysop.passage.lic.model.api.Feature;
import ru.arsysop.passage.lic.model.api.FeatureSet;
import ru.arsysop.passage.lic.model.api.FeatureVersion;
import ru.arsysop.passage.lic.model.api.LicensePack;
import ru.arsysop.passage.lic.model.api.LicenseGrant;
import ru.arsysop.passage.lic.model.api.User;
import ru.arsysop.passage.lic.model.api.UserOrigin;
import ru.arsysop.passage.lic.model.api.Product;
import ru.arsysop.passage.lic.model.api.ProductLine;
import ru.arsysop.passage.lic.model.api.ProductVersion;
import ru.arsysop.passage.lic.model.api.ProductVersionFeature;
import ru.arsysop.passage.lic.model.meta.LicFactory;
import ru.arsysop.passage.lic.model.meta.LicPackage;
import ru.arsysop.passage.lic.registry.FeatureDescriptor;
import ru.arsysop.passage.lic.registry.FeatureSetDescriptor;
import ru.arsysop.passage.lic.registry.FeatureVersionDescriptor;
import ru.arsysop.passage.lic.registry.LicenseGrantDescriptor;
import ru.arsysop.passage.lic.registry.LicensePackDescriptor;
import ru.arsysop.passage.lic.registry.UserDescriptor;
import ru.arsysop.passage.lic.registry.UserOriginDescriptor;
import ru.arsysop.passage.lic.registry.ProductDescriptor;
import ru.arsysop.passage.lic.registry.ProductLineDescriptor;
import ru.arsysop.passage.lic.registry.ProductVersionDescriptor;
import ru.arsysop.passage.lic.registry.ProductVersionFeatureDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LicPackageImpl extends EPackageImpl implements LicPackage {
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productVersionDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productVersionFeatureDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userOriginDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureVersionDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productLineDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licensePackDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseGrantDescriptorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass productEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productVersionEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productVersionFeatureEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userOriginEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureVersionEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productLineEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licensePackEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseGrantEClass = null;

		/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.arsysop.passage.lic.model.meta.LicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private LicPackageImpl() {
		super(eNS_URI, LicFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static LicPackage init() {
		if (isInited) return (LicPackage)EPackage.Registry.INSTANCE.getEPackage(LicPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLicPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LicPackageImpl theLicPackage = registeredLicPackage instanceof LicPackageImpl ? (LicPackageImpl)registeredLicPackage : new LicPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLicPackage.createPackageContents();

		// Initialize created meta-data
		theLicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLicPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LicPackage.eNS_URI, theLicPackage);
		return theLicPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSetDescriptor() {
		return featureSetDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDescriptor() {
		return productDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductVersionDescriptor() {
		return productVersionDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductVersionFeatureDescriptor() {
		return productVersionFeatureDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserOriginDescriptor() {
		return userOriginDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureDescriptor() {
		return featureDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureVersionDescriptor() {
		return featureVersionDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductLineDescriptor() {
		return productLineDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDescriptor() {
		return userDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicensePackDescriptor() {
		return licensePackDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicenseGrantDescriptor() {
		return licenseGrantDescriptorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSet() {
		return featureSetEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSet_Identifier() {
		return (EAttribute)featureSetEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSet_Name() {
		return (EAttribute)featureSetEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSet_Description() {
		return (EAttribute)featureSetEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSet_Features() {
		return (EReference)featureSetEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProduct() {
		return productEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProduct_Identifier() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Identifier() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Description() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureSet() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeatureVersions() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureVersion() {
		return featureVersionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureVersion_Version() {
		return (EAttribute)featureVersionEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureVersion_Feature() {
		return (EReference)featureVersionEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureVersion_News() {
		return (EAttribute)featureVersionEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductLine() {
		return productLineEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductLine_Identifier() {
		return (EAttribute)productLineEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductLine_Name() {
		return (EAttribute)productLineEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductLine_Description() {
		return (EAttribute)productLineEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductLine_Products() {
		return (EReference)productLineEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Identifier() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FullName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Description() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserOrigin() {
		return (EReference)userEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicensePack() {
		return licensePackEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicensePack_Identifier() {
		return (EAttribute)licensePackEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicensePack_IssueDate() {
		return (EAttribute)licensePackEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicensePack_ProductIdentifier() {
		return (EAttribute)licensePackEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicensePack_ProductVersion() {
		return (EAttribute)licensePackEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicensePack_UserIdentifier() {
		return (EAttribute)licensePackEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLicensePack_LicenseGrants() {
		return (EReference)licensePackEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLicenseGrant() {
		return licenseGrantEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_FeatureIdentifier() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_MatchVersion() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_MatchRule() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_ConditionType() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_ConditionExpression() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLicenseGrant_Capacity() {
		return (EAttribute)licenseGrantEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLicenseGrant_LicensePack() {
		return (EReference)licenseGrantEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicFactory getLicFactory() {
		return (LicFactory)getEFactoryInstance();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProduct_Description() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductLine() {
		return (EReference)productEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ProductVersions() {
		return (EReference)productEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductVersion() {
		return productVersionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersion_Version() {
		return (EAttribute)productVersionEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductVersion_Product() {
		return (EReference)productVersionEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersion_InstallationToken() {
		return (EAttribute)productVersionEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersion_SecureToken() {
		return (EAttribute)productVersionEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductVersion_ProductVersionFeatures() {
		return (EReference)productVersionEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersion_News() {
		return (EAttribute)productVersionEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductVersionFeature() {
		return productVersionFeatureEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersionFeature_FeatureIdentifier() {
		return (EAttribute)productVersionFeatureEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersionFeature_FeatureVersion() {
		return (EAttribute)productVersionFeatureEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductVersionFeature_RestrictionLevel() {
		return (EAttribute)productVersionFeatureEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductVersionFeature_ProductVersion() {
		return (EReference)productVersionFeatureEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserOrigin() {
		return userOriginEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserOrigin_Identifier() {
		return (EAttribute)userOriginEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserOrigin_Name() {
		return (EAttribute)userOriginEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserOrigin_Description() {
		return (EAttribute)userOriginEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserOrigin_Users() {
		return (EReference)userOriginEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		featureSetDescriptorEClass = createEClass(FEATURE_SET_DESCRIPTOR);

		featureDescriptorEClass = createEClass(FEATURE_DESCRIPTOR);

		featureVersionDescriptorEClass = createEClass(FEATURE_VERSION_DESCRIPTOR);

		productLineDescriptorEClass = createEClass(PRODUCT_LINE_DESCRIPTOR);

		productDescriptorEClass = createEClass(PRODUCT_DESCRIPTOR);

		productVersionDescriptorEClass = createEClass(PRODUCT_VERSION_DESCRIPTOR);

		productVersionFeatureDescriptorEClass = createEClass(PRODUCT_VERSION_FEATURE_DESCRIPTOR);

		userOriginDescriptorEClass = createEClass(USER_ORIGIN_DESCRIPTOR);

		userDescriptorEClass = createEClass(USER_DESCRIPTOR);

		licensePackDescriptorEClass = createEClass(LICENSE_PACK_DESCRIPTOR);

		licenseGrantDescriptorEClass = createEClass(LICENSE_GRANT_DESCRIPTOR);

		featureSetEClass = createEClass(FEATURE_SET);
		createEAttribute(featureSetEClass, FEATURE_SET__IDENTIFIER);
		createEAttribute(featureSetEClass, FEATURE_SET__NAME);
		createEAttribute(featureSetEClass, FEATURE_SET__DESCRIPTION);
		createEReference(featureSetEClass, FEATURE_SET__FEATURES);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IDENTIFIER);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);
		createEReference(featureEClass, FEATURE__FEATURE_SET);
		createEReference(featureEClass, FEATURE__FEATURE_VERSIONS);

		featureVersionEClass = createEClass(FEATURE_VERSION);
		createEAttribute(featureVersionEClass, FEATURE_VERSION__VERSION);
		createEReference(featureVersionEClass, FEATURE_VERSION__FEATURE);
		createEAttribute(featureVersionEClass, FEATURE_VERSION__NEWS);

		productLineEClass = createEClass(PRODUCT_LINE);
		createEAttribute(productLineEClass, PRODUCT_LINE__IDENTIFIER);
		createEAttribute(productLineEClass, PRODUCT_LINE__NAME);
		createEAttribute(productLineEClass, PRODUCT_LINE__DESCRIPTION);
		createEReference(productLineEClass, PRODUCT_LINE__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__IDENTIFIER);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__DESCRIPTION);
		createEReference(productEClass, PRODUCT__PRODUCT_LINE);
		createEReference(productEClass, PRODUCT__PRODUCT_VERSIONS);

		productVersionEClass = createEClass(PRODUCT_VERSION);
		createEAttribute(productVersionEClass, PRODUCT_VERSION__VERSION);
		createEReference(productVersionEClass, PRODUCT_VERSION__PRODUCT);
		createEAttribute(productVersionEClass, PRODUCT_VERSION__INSTALLATION_TOKEN);
		createEAttribute(productVersionEClass, PRODUCT_VERSION__SECURE_TOKEN);
		createEReference(productVersionEClass, PRODUCT_VERSION__PRODUCT_VERSION_FEATURES);
		createEAttribute(productVersionEClass, PRODUCT_VERSION__NEWS);

		productVersionFeatureEClass = createEClass(PRODUCT_VERSION_FEATURE);
		createEAttribute(productVersionFeatureEClass, PRODUCT_VERSION_FEATURE__FEATURE_IDENTIFIER);
		createEAttribute(productVersionFeatureEClass, PRODUCT_VERSION_FEATURE__FEATURE_VERSION);
		createEAttribute(productVersionFeatureEClass, PRODUCT_VERSION_FEATURE__RESTRICTION_LEVEL);
		createEReference(productVersionFeatureEClass, PRODUCT_VERSION_FEATURE__PRODUCT_VERSION);

		userOriginEClass = createEClass(USER_ORIGIN);
		createEAttribute(userOriginEClass, USER_ORIGIN__IDENTIFIER);
		createEAttribute(userOriginEClass, USER_ORIGIN__NAME);
		createEAttribute(userOriginEClass, USER_ORIGIN__DESCRIPTION);
		createEReference(userOriginEClass, USER_ORIGIN__USERS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__IDENTIFIER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__FULL_NAME);
		createEAttribute(userEClass, USER__DESCRIPTION);
		createEReference(userEClass, USER__USER_ORIGIN);

		licensePackEClass = createEClass(LICENSE_PACK);
		createEAttribute(licensePackEClass, LICENSE_PACK__IDENTIFIER);
		createEAttribute(licensePackEClass, LICENSE_PACK__ISSUE_DATE);
		createEAttribute(licensePackEClass, LICENSE_PACK__PRODUCT_IDENTIFIER);
		createEAttribute(licensePackEClass, LICENSE_PACK__PRODUCT_VERSION);
		createEAttribute(licensePackEClass, LICENSE_PACK__USER_IDENTIFIER);
		createEReference(licensePackEClass, LICENSE_PACK__LICENSE_GRANTS);

		licenseGrantEClass = createEClass(LICENSE_GRANT);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__FEATURE_IDENTIFIER);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__MATCH_VERSION);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__MATCH_RULE);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__CONDITION_TYPE);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__CONDITION_EXPRESSION);
		createEAttribute(licenseGrantEClass, LICENSE_GRANT__CAPACITY);
		createEReference(licenseGrantEClass, LICENSE_GRANT__LICENSE_PACK);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureSetEClass.getESuperTypes().add(this.getFeatureSetDescriptor());
		featureEClass.getESuperTypes().add(this.getFeatureDescriptor());
		featureVersionEClass.getESuperTypes().add(this.getFeatureVersionDescriptor());
		productLineEClass.getESuperTypes().add(this.getProductLineDescriptor());
		productEClass.getESuperTypes().add(this.getProductDescriptor());
		productVersionEClass.getESuperTypes().add(this.getProductVersionDescriptor());
		productVersionFeatureEClass.getESuperTypes().add(this.getProductVersionFeatureDescriptor());
		userOriginEClass.getESuperTypes().add(this.getUserOriginDescriptor());
		userEClass.getESuperTypes().add(this.getUserDescriptor());
		licensePackEClass.getESuperTypes().add(this.getLicensePackDescriptor());
		licenseGrantEClass.getESuperTypes().add(this.getLicenseGrantDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(featureSetDescriptorEClass, FeatureSetDescriptor.class, "FeatureSetDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(featureDescriptorEClass, FeatureDescriptor.class, "FeatureDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(featureVersionDescriptorEClass, FeatureVersionDescriptor.class, "FeatureVersionDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(productLineDescriptorEClass, ProductLineDescriptor.class, "ProductLineDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(productDescriptorEClass, ProductDescriptor.class, "ProductDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(productVersionDescriptorEClass, ProductVersionDescriptor.class, "ProductVersionDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(productVersionFeatureDescriptorEClass, ProductVersionFeatureDescriptor.class, "ProductVersionFeatureDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(userOriginDescriptorEClass, UserOriginDescriptor.class, "UserOriginDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(userDescriptorEClass, UserDescriptor.class, "UserDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(licensePackDescriptorEClass, LicensePackDescriptor.class, "LicensePackDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(licenseGrantDescriptorEClass, LicenseGrantDescriptor.class, "LicenseGrantDescriptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(featureSetEClass, FeatureSet.class, "FeatureSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFeatureSet_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, FeatureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeatureSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeatureSet_Description(), ecorePackage.getEString(), "description", null, 0, 1, FeatureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFeatureSet_Features(), this.getFeature(), this.getFeature_FeatureSet(), "features", null, 0, -1, FeatureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFeature_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFeature_FeatureSet(), this.getFeatureSet(), this.getFeatureSet_Features(), "featureSet", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFeature_FeatureVersions(), this.getFeatureVersion(), this.getFeatureVersion_Feature(), "featureVersions", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(featureVersionEClass, FeatureVersion.class, "FeatureVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFeatureVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1, FeatureVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getFeatureVersion_Feature(), this.getFeature(), this.getFeature_FeatureVersions(), "feature", null, 1, 1, FeatureVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFeatureVersion_News(), ecorePackage.getEString(), "news", null, 0, 1, FeatureVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(productLineEClass, ProductLine.class, "ProductLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProductLine_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductLine_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductLine_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProductLine_Products(), this.getProduct(), this.getProduct_ProductLine(), "products", null, 0, -1, ProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProduct_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProduct_ProductLine(), this.getProductLine(), this.getProductLine_Products(), "productLine", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProduct_ProductVersions(), this.getProductVersion(), this.getProductVersion_Product(), "productVersions", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(productVersionEClass, ProductVersion.class, "ProductVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProductVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProductVersion_Product(), this.getProduct(), this.getProduct_ProductVersions(), "product", null, 1, 1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductVersion_InstallationToken(), ecorePackage.getEString(), "installationToken", null, 0, 1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductVersion_SecureToken(), ecorePackage.getEString(), "secureToken", null, 0, 1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProductVersion_ProductVersionFeatures(), this.getProductVersionFeature(), this.getProductVersionFeature_ProductVersion(), "productVersionFeatures", null, 0, -1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductVersion_News(), ecorePackage.getEString(), "news", null, 0, 1, ProductVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(productVersionFeatureEClass, ProductVersionFeature.class, "ProductVersionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProductVersionFeature_FeatureIdentifier(), ecorePackage.getEString(), "featureIdentifier", null, 1, 1, ProductVersionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductVersionFeature_FeatureVersion(), ecorePackage.getEString(), "featureVersion", null, 1, 1, ProductVersionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getProductVersionFeature_RestrictionLevel(), ecorePackage.getEString(), "restrictionLevel", null, 0, 1, ProductVersionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getProductVersionFeature_ProductVersion(), this.getProductVersion(), this.getProductVersion_ProductVersionFeatures(), "productVersion", null, 1, 1, ProductVersionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(userOriginEClass, UserOrigin.class, "UserOrigin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUserOrigin_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, UserOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUserOrigin_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUserOrigin_Description(), ecorePackage.getEString(), "description", null, 0, 1, UserOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getUserOrigin_Users(), this.getUser(), this.getUser_UserOrigin(), "users", null, 0, -1, UserOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getUser_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUser_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getUser_Description(), ecorePackage.getEString(), "description", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getUser_UserOrigin(), this.getUserOrigin(), this.getUserOrigin_Users(), "userOrigin", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(licensePackEClass, LicensePack.class, "LicensePack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLicensePack_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicensePack_IssueDate(), ecorePackage.getEDate(), "issueDate", null, 1, 1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicensePack_ProductIdentifier(), ecorePackage.getEString(), "productIdentifier", null, 1, 1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicensePack_ProductVersion(), ecorePackage.getEString(), "productVersion", null, 1, 1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicensePack_UserIdentifier(), ecorePackage.getEString(), "userIdentifier", null, 1, 1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getLicensePack_LicenseGrants(), this.getLicenseGrant(), this.getLicenseGrant_LicensePack(), "licenseGrants", null, 0, -1, LicensePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(licenseGrantEClass, LicenseGrant.class, "LicenseGrant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLicenseGrant_FeatureIdentifier(), ecorePackage.getEString(), "featureIdentifier", null, 1, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicenseGrant_MatchVersion(), ecorePackage.getEString(), "matchVersion", "0.0.0", 1, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getLicenseGrant_MatchRule(), ecorePackage.getEString(), "matchRule", null, 0, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicenseGrant_ConditionType(), ecorePackage.getEString(), "conditionType", null, 1, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicenseGrant_ConditionExpression(), ecorePackage.getEString(), "conditionExpression", null, 1, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLicenseGrant_Capacity(), ecorePackage.getEInt(), "capacity", "1", 0, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getLicenseGrant_LicensePack(), this.getLicensePack(), this.getLicensePack_LicenseGrants(), "licensePack", null, 1, 1, LicenseGrant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //PassagePackageImpl

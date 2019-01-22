/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.eclipse.passage.lic.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.passage.lic.model.api.*;
import org.eclipse.passage.lic.model.meta.LicPackage;
import org.eclipse.passage.lic.registry.FeatureDescriptor;
import org.eclipse.passage.lic.registry.FeatureSetDescriptor;
import org.eclipse.passage.lic.registry.FeatureVersionDescriptor;
import org.eclipse.passage.lic.registry.LicenseGrantDescriptor;
import org.eclipse.passage.lic.registry.LicensePackDescriptor;
import org.eclipse.passage.lic.registry.ProductDescriptor;
import org.eclipse.passage.lic.registry.ProductLineDescriptor;
import org.eclipse.passage.lic.registry.ProductVersionDescriptor;
import org.eclipse.passage.lic.registry.ProductVersionFeatureDescriptor;
import org.eclipse.passage.lic.registry.UserDescriptor;
import org.eclipse.passage.lic.registry.UserOriginDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.passage.lic.model.meta.LicPackage
 * @generated
 */
public class LicAdapterFactory extends AdapterFactoryImpl {
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static LicPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LicPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LicSwitch<Adapter> modelSwitch =
    new LicSwitch<Adapter>() {
			@Override
			public Adapter caseFeatureSetDescriptor(FeatureSetDescriptor object) {
				return createFeatureSetDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureDescriptor(FeatureDescriptor object) {
				return createFeatureDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureVersionDescriptor(FeatureVersionDescriptor object) {
				return createFeatureVersionDescriptorAdapter();
			}
			@Override
			public Adapter caseProductLineDescriptor(ProductLineDescriptor object) {
				return createProductLineDescriptorAdapter();
			}
			@Override
			public Adapter caseProductDescriptor(ProductDescriptor object) {
				return createProductDescriptorAdapter();
			}
			@Override
			public Adapter caseProductVersionDescriptor(ProductVersionDescriptor object) {
				return createProductVersionDescriptorAdapter();
			}
			@Override
			public Adapter caseProductVersionFeatureDescriptor(ProductVersionFeatureDescriptor object) {
				return createProductVersionFeatureDescriptorAdapter();
			}
			@Override
			public Adapter caseUserOriginDescriptor(UserOriginDescriptor object) {
				return createUserOriginDescriptorAdapter();
			}
			@Override
			public Adapter caseUserDescriptor(UserDescriptor object) {
				return createUserDescriptorAdapter();
			}
			@Override
			public Adapter caseLicensePackDescriptor(LicensePackDescriptor object) {
				return createLicensePackDescriptorAdapter();
			}
			@Override
			public Adapter caseLicenseGrantDescriptor(LicenseGrantDescriptor object) {
				return createLicenseGrantDescriptorAdapter();
			}
			@Override
			public Adapter caseFeatureSet(FeatureSet object) {
				return createFeatureSetAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureVersion(FeatureVersion object) {
				return createFeatureVersionAdapter();
			}
			@Override
			public Adapter caseProductLine(ProductLine object) {
				return createProductLineAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProductVersion(ProductVersion object) {
				return createProductVersionAdapter();
			}
			@Override
			public Adapter caseProductVersionFeature(ProductVersionFeature object) {
				return createProductVersionFeatureAdapter();
			}
			@Override
			public Adapter caseUserOrigin(UserOrigin object) {
				return createUserOriginAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseLicensePack(LicensePack object) {
				return createLicensePackAdapter();
			}
			@Override
			public Adapter caseLicenseGrant(LicenseGrant object) {
				return createLicenseGrantAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.FeatureSetDescriptor <em>Feature Set Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.FeatureSetDescriptor
	 * @generated
	 */
	public Adapter createFeatureSetDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.ProductDescriptor <em>Product Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.ProductDescriptor
	 * @generated
	 */
	public Adapter createProductDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.ProductVersionDescriptor <em>Product Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.ProductVersionDescriptor
	 * @generated
	 */
	public Adapter createProductVersionDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.ProductVersionFeatureDescriptor <em>Product Version Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.ProductVersionFeatureDescriptor
	 * @generated
	 */
	public Adapter createProductVersionFeatureDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.UserOriginDescriptor <em>User Origin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.UserOriginDescriptor
	 * @generated
	 */
	public Adapter createUserOriginDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.FeatureDescriptor <em>Feature Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.FeatureDescriptor
	 * @generated
	 */
	public Adapter createFeatureDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.FeatureVersionDescriptor <em>Feature Version Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.FeatureVersionDescriptor
	 * @generated
	 */
	public Adapter createFeatureVersionDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.ProductLineDescriptor <em>Product Line Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.ProductLineDescriptor
	 * @generated
	 */
	public Adapter createProductLineDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.UserDescriptor <em>User Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.UserDescriptor
	 * @generated
	 */
	public Adapter createUserDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.LicensePackDescriptor <em>License Pack Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.LicensePackDescriptor
	 * @generated
	 */
	public Adapter createLicensePackDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.registry.LicenseGrantDescriptor <em>License Grant Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.registry.LicenseGrantDescriptor
	 * @generated
	 */
	public Adapter createLicenseGrantDescriptorAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.FeatureSet <em>Feature Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.FeatureSet
	 * @generated
	 */
	public Adapter createFeatureSetAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.Product
	 * @generated
	 */
  public Adapter createProductAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.ProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.ProductVersion
	 * @generated
	 */
	public Adapter createProductVersionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.ProductVersionFeature <em>Product Version Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.ProductVersionFeature
	 * @generated
	 */
	public Adapter createProductVersionFeatureAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.UserOrigin <em>User Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.UserOrigin
	 * @generated
	 */
	public Adapter createUserOriginAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.FeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.FeatureVersion
	 * @generated
	 */
	public Adapter createFeatureVersionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.ProductLine <em>Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.ProductLine
	 * @generated
	 */
	public Adapter createProductLineAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.LicensePack <em>License Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.LicensePack
	 * @generated
	 */
	public Adapter createLicensePackAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.passage.lic.model.api.LicenseGrant <em>License Grant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.passage.lic.model.api.LicenseGrant
	 * @generated
	 */
	public Adapter createLicenseGrantAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter() {
		return null;
	}

} //LicensingAdapterFactory

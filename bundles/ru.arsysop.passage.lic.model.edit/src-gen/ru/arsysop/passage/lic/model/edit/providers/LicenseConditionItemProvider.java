/**
 * 	Copyright (c) 2018 ArSysOp
 * 
 * 	Licensed under the Apache LicensePack, Version 2.0 (the "LicensePack");
 * 	you may not use this file except in compliance with the LicensePack.
 * 	You may obtain a copy of the LicensePack at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the LicensePack is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the LicensePack for the specific language governing permissions and
 * 	limitations under the LicensePack.
 * 
 * 	SPDX-LicensePack-Identifier: Apache-2.0
 * 
 * 	Contributors:
 * 		ArSysOp - initial API and implementation
 * 
 */
package ru.arsysop.passage.lic.model.edit.providers;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.arsysop.passage.lic.model.api.LicenseGrant;

import ru.arsysop.passage.lic.model.edit.LicEditPlugin;

import ru.arsysop.passage.lic.model.meta.LicPackage;

/**
 * This is the item provider adapter for a {@link ru.arsysop.passage.lic.model.api.LicenseGrant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LicenseConditionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseConditionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAllowedFeatureIdPropertyDescriptor(object);
			addAllowedFeatureMatchVersionPropertyDescriptor(object);
			addAllowedFeatureMatchRulePropertyDescriptor(object);
			addConditionTypePropertyDescriptor(object);
			addConditionExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allowed Feature Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedFeatureIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LicenseCondition_allowedFeatureId_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LicenseCondition_allowedFeatureId_feature", "_UI_LicenseCondition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LicPackage.Literals.LICENSE_CONDITION__ALLOWED_FEATURE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Feature Match Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedFeatureMatchVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LicenseCondition_allowedFeatureMatchVersion_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LicenseCondition_allowedFeatureMatchVersion_feature", "_UI_LicenseCondition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LicPackage.Literals.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allowed Feature Match Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedFeatureMatchRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LicenseCondition_allowedFeatureMatchRule_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LicenseCondition_allowedFeatureMatchRule_feature", "_UI_LicenseCondition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LicPackage.Literals.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LicenseCondition_conditionType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LicenseCondition_conditionType_feature", "_UI_LicenseCondition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LicPackage.Literals.LICENSE_CONDITION__CONDITION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LicenseCondition_conditionExpression_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_LicenseCondition_conditionExpression_feature", "_UI_LicenseCondition_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 LicPackage.Literals.LICENSE_CONDITION__CONDITION_EXPRESSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LicenseGrant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/license.png")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LicenseGrant)object).getFeatureIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_LicenseCondition_type") : //$NON-NLS-1$
			getString("_UI_LicenseCondition_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LicenseGrant.class)) {
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_ID:
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_VERSION:
			case LicPackage.LICENSE_CONDITION__ALLOWED_FEATURE_MATCH_RULE:
			case LicPackage.LICENSE_CONDITION__CONDITION_TYPE:
			case LicPackage.LICENSE_CONDITION__CONDITION_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LicEditPlugin.INSTANCE;
	}

}

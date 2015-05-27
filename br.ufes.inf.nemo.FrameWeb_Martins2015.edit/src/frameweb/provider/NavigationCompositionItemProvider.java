/**
 */
package frameweb.provider;


import frameweb.FramewebFactory;
import frameweb.FramewebPackage;
import frameweb.NavigationComposition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.AssociationItemProvider;

/**
 * This is the item provider adapter for a {@link frameweb.NavigationComposition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NavigationCompositionItemProvider extends AssociationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationCompositionItemProvider(AdapterFactory adapterFactory) {
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

			addSourceTemplatePropertyDescriptor(object);
			addSourcePagePropertyDescriptor(object);
			addTargetFormPropertyDescriptor(object);
			addTargetComponentPropertyDescriptor(object);
			addTargetJQueryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationComposition_SourceTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationComposition_SourceTemplate_feature", "_UI_NavigationComposition_type"),
				 FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationComposition_SourcePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationComposition_SourcePage_feature", "_UI_NavigationComposition_type"),
				 FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_PAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationComposition_TargetForm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationComposition_TargetForm_feature", "_UI_NavigationComposition_type"),
				 FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_FORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationComposition_TargetComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationComposition_TargetComponent_feature", "_UI_NavigationComposition_type"),
				 FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target JQuery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetJQueryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavigationComposition_TargetJQuery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavigationComposition_TargetJQuery_feature", "_UI_NavigationComposition_type"),
				 FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_JQUERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns NavigationComposition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NavigationComposition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NavigationComposition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NavigationComposition_type") :
			getString("_UI_NavigationComposition_type") + " " + label;
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

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDAOGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createServiceGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASSIFIER__GENERALIZATION,
				 FramewebFactory.eINSTANCE.createDomainGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__OWNED_END,
				 FramewebFactory.eINSTANCE.createFormComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createVersionAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIdAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createLOBAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createEmbeddedAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDecimalAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDateTimeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createUserViewAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createIOParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createBinaryAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createDAOAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createServiceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END,
				 FramewebFactory.eINSTANCE.createFormComponent()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE ||
			childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION ||
			childFeature == UMLPackage.Literals.ASSOCIATION__OWNED_END ||
			childFeature == UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FrameWebEditPlugin.INSTANCE;
	}

}
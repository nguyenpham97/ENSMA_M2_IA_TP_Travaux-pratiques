/**
 */
package robotnxt.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import robotnxt.Choreography;
import robotnxt.RobotnxtFactory;
import robotnxt.RobotnxtPackage;

/**
 * This is the item provider adapter for a {@link robotnxt.Choreography} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoreographyItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoreographyItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Choreography_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Choreography_name_feature", "_UI_Choreography_type"),
				 RobotnxtPackage.Literals.CHOREOGRAPHY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Choreography.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Choreography"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Choreography)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Choreography_type") :
			getString("_UI_Choreography_type") + " " + label;
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

		switch (notification.getFeatureID(Choreography.class)) {
			case RobotnxtPackage.CHOREOGRAPHY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RobotnxtPackage.CHOREOGRAPHY__INSTRUCTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createPenDown()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createPenUp()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createGrab()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createRelease()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createTurnLeft()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createTurnRight()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createGoForward()));

		newChildDescriptors.add
			(createChildParameter
				(RobotnxtPackage.Literals.CHOREOGRAPHY__INSTRUCTIONS,
				 RobotnxtFactory.eINSTANCE.createGoBackward()));
	}

}

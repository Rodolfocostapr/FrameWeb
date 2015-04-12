/**
 */
package frameweb.impl;

import frameweb.DAOAttribute;
import frameweb.DAOBaseOperation;
import frameweb.DAOInterface;
import frameweb.DAOInterfaceName;
import frameweb.DAOOperation;
import frameweb.FrameWebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.InterfaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getOwnBaseOperation <em>Own Base Operation</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getOwnOperation <em>Own Operation</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getDAOInterfaceName <em>DAO Interface Name</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getDAOInterfaceAttribute <em>DAO Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOInterfaceImpl extends InterfaceImpl implements DAOInterface {
	/**
	 * The cached value of the '{@link #getOwnBaseOperation() <em>Own Base Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnBaseOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOBaseOperation> ownBaseOperation;

	/**
	 * The cached value of the '{@link #getOwnOperation() <em>Own Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOOperation> ownOperation;

	/**
	 * The cached value of the '{@link #getDAOInterfaceName() <em>DAO Interface Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected DAOInterfaceName daoInterfaceName;

	/**
	 * The cached value of the '{@link #getDAOInterfaceAttribute() <em>DAO Interface Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOInterfaceAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOAttribute> daoInterfaceAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.DAO_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOBaseOperation> getOwnBaseOperation() {
		if (ownBaseOperation == null) {
			ownBaseOperation = new EObjectContainmentEList<DAOBaseOperation>(DAOBaseOperation.class, this, FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION);
		}
		return ownBaseOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOOperation> getOwnOperation() {
		if (ownOperation == null) {
			ownOperation = new EObjectContainmentEList<DAOOperation>(DAOOperation.class, this, FrameWebPackage.DAO_INTERFACE__OWN_OPERATION);
		}
		return ownOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceName getDAOInterfaceName() {
		if (daoInterfaceName != null && daoInterfaceName.eIsProxy()) {
			InternalEObject oldDAOInterfaceName = (InternalEObject)daoInterfaceName;
			daoInterfaceName = (DAOInterfaceName)eResolveProxy(oldDAOInterfaceName);
			if (daoInterfaceName != oldDAOInterfaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME, oldDAOInterfaceName, daoInterfaceName));
			}
		}
		return daoInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceName basicGetDAOInterfaceName() {
		return daoInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAOInterfaceName(DAOInterfaceName newDAOInterfaceName) {
		DAOInterfaceName oldDAOInterfaceName = daoInterfaceName;
		daoInterfaceName = newDAOInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME, oldDAOInterfaceName, daoInterfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOAttribute> getDAOInterfaceAttribute() {
		if (daoInterfaceAttribute == null) {
			daoInterfaceAttribute = new EObjectContainmentEList<DAOAttribute>(DAOAttribute.class, this, FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE);
		}
		return daoInterfaceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
				return ((InternalEList<?>)getOwnBaseOperation()).basicRemove(otherEnd, msgs);
			case FrameWebPackage.DAO_INTERFACE__OWN_OPERATION:
				return ((InternalEList<?>)getOwnOperation()).basicRemove(otherEnd, msgs);
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
				return ((InternalEList<?>)getDAOInterfaceAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
				return getOwnBaseOperation();
			case FrameWebPackage.DAO_INTERFACE__OWN_OPERATION:
				return getOwnOperation();
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				if (resolve) return getDAOInterfaceName();
				return basicGetDAOInterfaceName();
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
				return getDAOInterfaceAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
				getOwnBaseOperation().clear();
				getOwnBaseOperation().addAll((Collection<? extends DAOBaseOperation>)newValue);
				return;
			case FrameWebPackage.DAO_INTERFACE__OWN_OPERATION:
				getOwnOperation().clear();
				getOwnOperation().addAll((Collection<? extends DAOOperation>)newValue);
				return;
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				setDAOInterfaceName((DAOInterfaceName)newValue);
				return;
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
				getDAOInterfaceAttribute().clear();
				getDAOInterfaceAttribute().addAll((Collection<? extends DAOAttribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
				getOwnBaseOperation().clear();
				return;
			case FrameWebPackage.DAO_INTERFACE__OWN_OPERATION:
				getOwnOperation().clear();
				return;
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				setDAOInterfaceName((DAOInterfaceName)null);
				return;
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
				getDAOInterfaceAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FrameWebPackage.DAO_INTERFACE__OWN_BASE_OPERATION:
				return ownBaseOperation != null && !ownBaseOperation.isEmpty();
			case FrameWebPackage.DAO_INTERFACE__OWN_OPERATION:
				return ownOperation != null && !ownOperation.isEmpty();
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				return daoInterfaceName != null;
			case FrameWebPackage.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE:
				return daoInterfaceAttribute != null && !daoInterfaceAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DAOInterfaceImpl

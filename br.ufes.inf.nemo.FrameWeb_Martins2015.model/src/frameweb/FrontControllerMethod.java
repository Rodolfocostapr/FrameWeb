/**
 */
package frameweb;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front Controller Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link frameweb.FrontControllerMethod#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link frameweb.FrontControllerMethod#getMethodType <em>Method Type</em>}</li>
 * </ul>
 *
 * @see frameweb.FramewebPackage#getFrontControllerMethod()
 * @model
 * @generated
 */
public interface FrontControllerMethod extends Operation {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see frameweb.FramewebPackage#getFrontControllerMethod_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerMethod#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see #setMethodType(String)
	 * @see frameweb.FramewebPackage#getFrontControllerMethod_MethodType()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	String getMethodType();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerMethod#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(String value);

} // FrontControllerMethod

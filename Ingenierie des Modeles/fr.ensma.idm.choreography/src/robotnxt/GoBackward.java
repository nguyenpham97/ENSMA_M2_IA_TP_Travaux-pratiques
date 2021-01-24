/**
 */
package robotnxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotnxt.GoBackward#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see robotnxt.RobotnxtPackage#getGoBackward()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Dis2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot Dis2='self.distance &gt;= 0'"
 * @generated
 */
public interface GoBackward extends Movement {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see robotnxt.RobotnxtPackage#getGoBackward_Distance()
	 * @model required="true"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link robotnxt.GoBackward#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // GoBackward

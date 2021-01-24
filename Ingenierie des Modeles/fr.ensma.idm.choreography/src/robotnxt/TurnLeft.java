/**
 */
package robotnxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotnxt.TurnLeft#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see robotnxt.RobotnxtPackage#getTurnLeft()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResAng1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ResAng1='self.angle &gt;= 0 and self.angle &lt;= 180'"
 * @generated
 */
public interface TurnLeft extends Movement {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(int)
	 * @see robotnxt.RobotnxtPackage#getTurnLeft_Angle()
	 * @model required="true"
	 * @generated
	 */
	int getAngle();

	/**
	 * Sets the value of the '{@link robotnxt.TurnLeft#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(int value);

} // TurnLeft

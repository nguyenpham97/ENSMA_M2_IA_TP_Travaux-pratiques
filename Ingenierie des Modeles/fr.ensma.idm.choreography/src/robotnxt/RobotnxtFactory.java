/**
 */
package robotnxt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see robotnxt.RobotnxtPackage
 * @generated
 */
public interface RobotnxtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotnxtFactory eINSTANCE = robotnxt.impl.RobotnxtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choreography</em>'.
	 * @generated
	 */
	Choreography createChoreography();

	/**
	 * Returns a new object of class '<em>Pen Down</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pen Down</em>'.
	 * @generated
	 */
	PenDown createPenDown();

	/**
	 * Returns a new object of class '<em>Pen Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pen Up</em>'.
	 * @generated
	 */
	PenUp createPenUp();

	/**
	 * Returns a new object of class '<em>Grab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grab</em>'.
	 * @generated
	 */
	Grab createGrab();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns a new object of class '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Left</em>'.
	 * @generated
	 */
	TurnLeft createTurnLeft();

	/**
	 * Returns a new object of class '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Right</em>'.
	 * @generated
	 */
	TurnRight createTurnRight();

	/**
	 * Returns a new object of class '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Forward</em>'.
	 * @generated
	 */
	GoForward createGoForward();

	/**
	 * Returns a new object of class '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Backward</em>'.
	 * @generated
	 */
	GoBackward createGoBackward();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RobotnxtPackage getRobotnxtPackage();

} //RobotnxtFactory

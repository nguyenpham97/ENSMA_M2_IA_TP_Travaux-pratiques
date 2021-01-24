/**
 */
package robotnxt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotnxt.RobotnxtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RobotnxtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotnxt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/tpidm/robotnxt/0.0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotnxt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotnxtPackage eINSTANCE = robotnxt.impl.RobotnxtPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotnxt.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.InstructionImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.ChoreographyImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__NAME = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.MovementImpl <em>Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.MovementImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getMovement()
	 * @generated
	 */
	int MOVEMENT = 10;

	/**
	 * The number of structural features of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.PenDownImpl <em>Pen Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.PenDownImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getPenDown()
	 * @generated
	 */
	int PEN_DOWN = 2;

	/**
	 * The number of structural features of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_DOWN_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.PenUpImpl <em>Pen Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.PenUpImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getPenUp()
	 * @generated
	 */
	int PEN_UP = 3;

	/**
	 * The number of structural features of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pen Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEN_UP_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.GrabImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 4;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.ReleaseImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 5;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.TurnLeftImpl <em>Turn Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.TurnLeftImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getTurnLeft()
	 * @generated
	 */
	int TURN_LEFT = 6;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT__ANGLE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_LEFT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.TurnRightImpl <em>Turn Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.TurnRightImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getTurnRight()
	 * @generated
	 */
	int TURN_RIGHT = 7;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT__ANGLE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RIGHT_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.GoForwardImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 8;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__DISTANCE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotnxt.impl.GoBackwardImpl <em>Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotnxt.impl.GoBackwardImpl
	 * @see robotnxt.impl.RobotnxtPackageImpl#getGoBackward()
	 * @generated
	 */
	int GO_BACKWARD = 9;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__DISTANCE = MOVEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_FEATURE_COUNT = MOVEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_OPERATION_COUNT = MOVEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robotnxt.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see robotnxt.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link robotnxt.Choreography#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see robotnxt.Choreography#getInstructions()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link robotnxt.Choreography#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotnxt.Choreography#getName()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Name();

	/**
	 * Returns the meta object for class '{@link robotnxt.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see robotnxt.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link robotnxt.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Down</em>'.
	 * @see robotnxt.PenDown
	 * @generated
	 */
	EClass getPenDown();

	/**
	 * Returns the meta object for class '{@link robotnxt.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pen Up</em>'.
	 * @see robotnxt.PenUp
	 * @generated
	 */
	EClass getPenUp();

	/**
	 * Returns the meta object for class '{@link robotnxt.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see robotnxt.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for class '{@link robotnxt.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see robotnxt.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link robotnxt.TurnLeft <em>Turn Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Left</em>'.
	 * @see robotnxt.TurnLeft
	 * @generated
	 */
	EClass getTurnLeft();

	/**
	 * Returns the meta object for the attribute '{@link robotnxt.TurnLeft#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robotnxt.TurnLeft#getAngle()
	 * @see #getTurnLeft()
	 * @generated
	 */
	EAttribute getTurnLeft_Angle();

	/**
	 * Returns the meta object for class '{@link robotnxt.TurnRight <em>Turn Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Right</em>'.
	 * @see robotnxt.TurnRight
	 * @generated
	 */
	EClass getTurnRight();

	/**
	 * Returns the meta object for the attribute '{@link robotnxt.TurnRight#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robotnxt.TurnRight#getAngle()
	 * @see #getTurnRight()
	 * @generated
	 */
	EAttribute getTurnRight_Angle();

	/**
	 * Returns the meta object for class '{@link robotnxt.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see robotnxt.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for the attribute '{@link robotnxt.GoForward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see robotnxt.GoForward#getDistance()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Distance();

	/**
	 * Returns the meta object for class '{@link robotnxt.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Backward</em>'.
	 * @see robotnxt.GoBackward
	 * @generated
	 */
	EClass getGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link robotnxt.GoBackward#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see robotnxt.GoBackward#getDistance()
	 * @see #getGoBackward()
	 * @generated
	 */
	EAttribute getGoBackward_Distance();

	/**
	 * Returns the meta object for class '{@link robotnxt.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement</em>'.
	 * @see robotnxt.Movement
	 * @generated
	 */
	EClass getMovement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotnxtFactory getRobotnxtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotnxt.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.ChoreographyImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__INSTRUCTIONS = eINSTANCE.getChoreography_Instructions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__NAME = eINSTANCE.getChoreography_Name();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.InstructionImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.PenDownImpl <em>Pen Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.PenDownImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getPenDown()
		 * @generated
		 */
		EClass PEN_DOWN = eINSTANCE.getPenDown();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.PenUpImpl <em>Pen Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.PenUpImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getPenUp()
		 * @generated
		 */
		EClass PEN_UP = eINSTANCE.getPenUp();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.GrabImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.ReleaseImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.TurnLeftImpl <em>Turn Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.TurnLeftImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getTurnLeft()
		 * @generated
		 */
		EClass TURN_LEFT = eINSTANCE.getTurnLeft();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_LEFT__ANGLE = eINSTANCE.getTurnLeft_Angle();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.TurnRightImpl <em>Turn Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.TurnRightImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getTurnRight()
		 * @generated
		 */
		EClass TURN_RIGHT = eINSTANCE.getTurnRight();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_RIGHT__ANGLE = eINSTANCE.getTurnRight_Angle();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.GoForwardImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__DISTANCE = eINSTANCE.getGoForward_Distance();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.GoBackwardImpl <em>Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.GoBackwardImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getGoBackward()
		 * @generated
		 */
		EClass GO_BACKWARD = eINSTANCE.getGoBackward();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_BACKWARD__DISTANCE = eINSTANCE.getGoBackward_Distance();

		/**
		 * The meta object literal for the '{@link robotnxt.impl.MovementImpl <em>Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotnxt.impl.MovementImpl
		 * @see robotnxt.impl.RobotnxtPackageImpl#getMovement()
		 * @generated
		 */
		EClass MOVEMENT = eINSTANCE.getMovement();

	}

} //RobotnxtPackage

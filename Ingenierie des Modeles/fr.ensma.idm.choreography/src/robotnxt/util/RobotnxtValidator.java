/**
 */
package robotnxt.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import robotnxt.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see robotnxt.RobotnxtPackage
 * @generated
 */
public class RobotnxtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RobotnxtValidator INSTANCE = new RobotnxtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "robotnxt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotnxtValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RobotnxtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RobotnxtPackage.CHOREOGRAPHY:
				return validateChoreography((Choreography)value, diagnostics, context);
			case RobotnxtPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case RobotnxtPackage.PEN_DOWN:
				return validatePenDown((PenDown)value, diagnostics, context);
			case RobotnxtPackage.PEN_UP:
				return validatePenUp((PenUp)value, diagnostics, context);
			case RobotnxtPackage.GRAB:
				return validateGrab((Grab)value, diagnostics, context);
			case RobotnxtPackage.RELEASE:
				return validateRelease((Release)value, diagnostics, context);
			case RobotnxtPackage.TURN_LEFT:
				return validateTurnLeft((TurnLeft)value, diagnostics, context);
			case RobotnxtPackage.TURN_RIGHT:
				return validateTurnRight((TurnRight)value, diagnostics, context);
			case RobotnxtPackage.GO_FORWARD:
				return validateGoForward((GoForward)value, diagnostics, context);
			case RobotnxtPackage.GO_BACKWARD:
				return validateGoBackward((GoBackward)value, diagnostics, context);
			case RobotnxtPackage.MOVEMENT:
				return validateMovement((Movement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(choreography, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validateChoreography_nomunique(choreography, diagnostics, context);
		if (result || diagnostics != null) result &= validateChoreography_Etape4(choreography, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nomunique constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHOREOGRAPHY__NOMUNIQUE__EEXPRESSION = "Choreography.allInstances()->forAll(c1,c2 | c1<>c2 implies c1.name<>c2.name)";

	/**
	 * Validates the nomunique constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography_nomunique(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.CHOREOGRAPHY,
				 choreography,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nomunique",
				 CHOREOGRAPHY__NOMUNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Etape4 constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHOREOGRAPHY__ETAPE4__EEXPRESSION = "self.instructions->select(e:Instruction | e.oclIsTypeOf(PenDown))->size() - self.instructions->select(e:Instruction | e.oclIsTypeOf(PenUp))->size() = 0";

	/**
	 * Validates the Etape4 constraint of '<em>Choreography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoreography_Etape4(Choreography choreography, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.CHOREOGRAPHY,
				 choreography,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Etape4",
				 CHOREOGRAPHY__ETAPE4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenDown(PenDown penDown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penDown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenUp(PenUp penUp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penUp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrab(Grab grab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grab, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(release, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnLeft(TurnLeft turnLeft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnLeft, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turnLeft, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnLeft_ResAng1(turnLeft, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ResAng1 constraint of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_LEFT__RES_ANG1__EEXPRESSION = "self.angle >= 0 and self.angle <= 180";

	/**
	 * Validates the ResAng1 constraint of '<em>Turn Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnLeft_ResAng1(TurnLeft turnLeft, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.TURN_LEFT,
				 turnLeft,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ResAng1",
				 TURN_LEFT__RES_ANG1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnRight(TurnRight turnRight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnRight, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(turnRight, diagnostics, context);
		if (result || diagnostics != null) result &= validateTurnRight_ResAng2(turnRight, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ResAng2 constraint of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TURN_RIGHT__RES_ANG2__EEXPRESSION = "self.angle >= 0 and self.angle <= 180";

	/**
	 * Validates the ResAng2 constraint of '<em>Turn Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnRight_ResAng2(TurnRight turnRight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.TURN_RIGHT,
				 turnRight,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ResAng2",
				 TURN_RIGHT__RES_ANG2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoForward(GoForward goForward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goForward, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goForward, diagnostics, context);
		if (result || diagnostics != null) result &= validateGoForward_Dis1(goForward, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Dis1 constraint of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GO_FORWARD__DIS1__EEXPRESSION = "self.distance >= 0";

	/**
	 * Validates the Dis1 constraint of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoForward_Dis1(GoForward goForward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.GO_FORWARD,
				 goForward,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Dis1",
				 GO_FORWARD__DIS1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoBackward(GoBackward goBackward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goBackward, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goBackward, diagnostics, context);
		if (result || diagnostics != null) result &= validateGoBackward_Dis2(goBackward, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Dis2 constraint of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GO_BACKWARD__DIS2__EEXPRESSION = "self.distance >= 0";

	/**
	 * Validates the Dis2 constraint of '<em>Go Backward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoBackward_Dis2(GoBackward goBackward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RobotnxtPackage.Literals.GO_BACKWARD,
				 goBackward,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Dis2",
				 GO_BACKWARD__DIS2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovement(Movement movement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movement, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RobotnxtValidator

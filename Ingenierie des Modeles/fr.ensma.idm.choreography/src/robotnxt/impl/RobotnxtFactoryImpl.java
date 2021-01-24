/**
 */
package robotnxt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotnxt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotnxtFactoryImpl extends EFactoryImpl implements RobotnxtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotnxtFactory init() {
		try {
			RobotnxtFactory theRobotnxtFactory = (RobotnxtFactory)EPackage.Registry.INSTANCE.getEFactory(RobotnxtPackage.eNS_URI);
			if (theRobotnxtFactory != null) {
				return theRobotnxtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotnxtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotnxtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RobotnxtPackage.CHOREOGRAPHY: return createChoreography();
			case RobotnxtPackage.PEN_DOWN: return createPenDown();
			case RobotnxtPackage.PEN_UP: return createPenUp();
			case RobotnxtPackage.GRAB: return createGrab();
			case RobotnxtPackage.RELEASE: return createRelease();
			case RobotnxtPackage.TURN_LEFT: return createTurnLeft();
			case RobotnxtPackage.TURN_RIGHT: return createTurnRight();
			case RobotnxtPackage.GO_FORWARD: return createGoForward();
			case RobotnxtPackage.GO_BACKWARD: return createGoBackward();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenDown createPenDown() {
		PenDownImpl penDown = new PenDownImpl();
		return penDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenUp createPenUp() {
		PenUpImpl penUp = new PenUpImpl();
		return penUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grab createGrab() {
		GrabImpl grab = new GrabImpl();
		return grab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnLeft createTurnLeft() {
		TurnLeftImpl turnLeft = new TurnLeftImpl();
		return turnLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnRight createTurnRight() {
		TurnRightImpl turnRight = new TurnRightImpl();
		return turnRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoForward createGoForward() {
		GoForwardImpl goForward = new GoForwardImpl();
		return goForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoBackward createGoBackward() {
		GoBackwardImpl goBackward = new GoBackwardImpl();
		return goBackward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotnxtPackage getRobotnxtPackage() {
		return (RobotnxtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotnxtPackage getPackage() {
		return RobotnxtPackage.eINSTANCE;
	}

} //RobotnxtFactoryImpl

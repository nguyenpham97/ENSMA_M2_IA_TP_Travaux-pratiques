/**
 */
package robotnxt.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import robotnxt.Choreography;
import robotnxt.GoBackward;
import robotnxt.GoForward;
import robotnxt.Grab;
import robotnxt.Instruction;
import robotnxt.Movement;
import robotnxt.PenDown;
import robotnxt.PenUp;
import robotnxt.Release;
import robotnxt.RobotnxtFactory;
import robotnxt.RobotnxtPackage;
import robotnxt.TurnLeft;
import robotnxt.TurnRight;

import robotnxt.util.RobotnxtValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotnxtPackageImpl extends EPackageImpl implements RobotnxtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choreographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penUpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnLeftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnRightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goBackwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see robotnxt.RobotnxtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RobotnxtPackageImpl() {
		super(eNS_URI, RobotnxtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RobotnxtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RobotnxtPackage init() {
		if (isInited) return (RobotnxtPackage)EPackage.Registry.INSTANCE.getEPackage(RobotnxtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRobotnxtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RobotnxtPackageImpl theRobotnxtPackage = registeredRobotnxtPackage instanceof RobotnxtPackageImpl ? (RobotnxtPackageImpl)registeredRobotnxtPackage : new RobotnxtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRobotnxtPackage.createPackageContents();

		// Initialize created meta-data
		theRobotnxtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRobotnxtPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RobotnxtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRobotnxtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RobotnxtPackage.eNS_URI, theRobotnxtPackage);
		return theRobotnxtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoreography() {
		return choreographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoreography_Instructions() {
		return (EReference)choreographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoreography_Name() {
		return (EAttribute)choreographyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenDown() {
		return penDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenUp() {
		return penUpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrab() {
		return grabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnLeft() {
		return turnLeftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnLeft_Angle() {
		return (EAttribute)turnLeftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnRight() {
		return turnRightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnRight_Angle() {
		return (EAttribute)turnRightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoForward() {
		return goForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoForward_Distance() {
		return (EAttribute)goForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoBackward() {
		return goBackwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoBackward_Distance() {
		return (EAttribute)goBackwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMovement() {
		return movementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotnxtFactory getRobotnxtFactory() {
		return (RobotnxtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		choreographyEClass = createEClass(CHOREOGRAPHY);
		createEReference(choreographyEClass, CHOREOGRAPHY__INSTRUCTIONS);
		createEAttribute(choreographyEClass, CHOREOGRAPHY__NAME);

		instructionEClass = createEClass(INSTRUCTION);

		penDownEClass = createEClass(PEN_DOWN);

		penUpEClass = createEClass(PEN_UP);

		grabEClass = createEClass(GRAB);

		releaseEClass = createEClass(RELEASE);

		turnLeftEClass = createEClass(TURN_LEFT);
		createEAttribute(turnLeftEClass, TURN_LEFT__ANGLE);

		turnRightEClass = createEClass(TURN_RIGHT);
		createEAttribute(turnRightEClass, TURN_RIGHT__ANGLE);

		goForwardEClass = createEClass(GO_FORWARD);
		createEAttribute(goForwardEClass, GO_FORWARD__DISTANCE);

		goBackwardEClass = createEClass(GO_BACKWARD);
		createEAttribute(goBackwardEClass, GO_BACKWARD__DISTANCE);

		movementEClass = createEClass(MOVEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		choreographyEClass.getESuperTypes().add(this.getInstruction());
		penDownEClass.getESuperTypes().add(this.getMovement());
		penUpEClass.getESuperTypes().add(this.getMovement());
		grabEClass.getESuperTypes().add(this.getMovement());
		releaseEClass.getESuperTypes().add(this.getMovement());
		turnLeftEClass.getESuperTypes().add(this.getMovement());
		turnRightEClass.getESuperTypes().add(this.getMovement());
		goForwardEClass.getESuperTypes().add(this.getMovement());
		goBackwardEClass.getESuperTypes().add(this.getMovement());
		movementEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(choreographyEClass, Choreography.class, "Choreography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoreography_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoreography_Name(), ecorePackage.getEString(), "name", null, 1, 1, Choreography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(penDownEClass, PenDown.class, "PenDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(penUpEClass, PenUp.class, "PenUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grabEClass, Grab.class, "Grab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(turnLeftEClass, TurnLeft.class, "TurnLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnLeft_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, TurnLeft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnRightEClass, TurnRight.class, "TurnRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnRight_Angle(), ecorePackage.getEInt(), "angle", null, 1, 1, TurnRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goForwardEClass, GoForward.class, "GoForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoForward_Distance(), ecorePackage.getEInt(), "distance", null, 1, 1, GoForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goBackwardEClass, GoBackward.class, "GoBackward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoBackward_Distance(), ecorePackage.getEInt(), "distance", null, 1, 1, GoBackward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movementEClass, Movement.class, "Movement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (choreographyEClass,
		   source,
		   new String[] {
			   "constraints", "nomunique Etape4"
		   });
		addAnnotation
		  (turnLeftEClass,
		   source,
		   new String[] {
			   "constraints", "ResAng1"
		   });
		addAnnotation
		  (turnRightEClass,
		   source,
		   new String[] {
			   "constraints", "ResAng2"
		   });
		addAnnotation
		  (goForwardEClass,
		   source,
		   new String[] {
			   "constraints", "Dis1"
		   });
		addAnnotation
		  (goBackwardEClass,
		   source,
		   new String[] {
			   "constraints", "Dis2"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (choreographyEClass,
		   source,
		   new String[] {
			   "nomunique", "Choreography.allInstances()->forAll(c1,c2 | c1<>c2 implies c1.name<>c2.name)",
			   "Etape4", "self.instructions->select(e:Instruction | e.oclIsTypeOf(PenDown))->size() - self.instructions->select(e:Instruction | e.oclIsTypeOf(PenUp))->size() = 0"
		   });
		addAnnotation
		  (turnLeftEClass,
		   source,
		   new String[] {
			   "ResAng1", "self.angle >= 0 and self.angle <= 180"
		   });
		addAnnotation
		  (turnRightEClass,
		   source,
		   new String[] {
			   "ResAng2", "self.angle >= 0 and self.angle <= 180"
		   });
		addAnnotation
		  (goForwardEClass,
		   source,
		   new String[] {
			   "Dis1", "self.distance >= 0"
		   });
		addAnnotation
		  (goBackwardEClass,
		   source,
		   new String[] {
			   "Dis2", "self.distance >= 0"
		   });
	}

} //RobotnxtPackageImpl

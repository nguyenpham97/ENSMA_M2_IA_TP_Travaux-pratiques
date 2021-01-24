/**
 */
package robotnxt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link robotnxt.Choreography#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link robotnxt.Choreography#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see robotnxt.RobotnxtPackage#getChoreography()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomunique Etape4'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nomunique='Choreography.allInstances()-&gt;forAll(c1,c2 | c1&lt;&gt;c2 implies c1.name&lt;&gt;c2.name)' Etape4='self.instructions-&gt;select(e:Instruction | e.oclIsTypeOf(PenDown))-&gt;size() - self.instructions-&gt;select(e:Instruction | e.oclIsTypeOf(PenUp))-&gt;size() = 0'"
 * @generated
 */
public interface Choreography extends Instruction {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link robotnxt.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see robotnxt.RobotnxtPackage#getChoreography_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see robotnxt.RobotnxtPackage#getChoreography_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link robotnxt.Choreography#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Choreography

/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Insertion#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getInsertion()
 * @model
 * @generated
 */
public interface Insertion extends Queries {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getInsertion_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Insertion

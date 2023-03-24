/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Selection#getClause <em>Clause</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Queries {

	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getSelection_Clause()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clause> getClause();
} // Selection

/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.SqlProgram#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getSqlProgram()
 * @model
 * @generated
 */
public interface SqlProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Queries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getSqlProgram_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Queries> getQueries();

} // SqlProgram

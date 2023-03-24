/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Queries#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getQueries()
 * @model abstract="true"
 * @generated
 */
public interface Queries extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Objects}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getQueries_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Objects> getObjects();

} // Queries

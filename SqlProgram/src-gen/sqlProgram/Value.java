/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Value#getColumnvalues <em>Columnvalues</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Columnvalues</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.ColumnValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnvalues</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getValue_Columnvalues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnValue> getColumnvalues();

} // Value

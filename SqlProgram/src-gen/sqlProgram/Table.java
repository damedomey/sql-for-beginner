/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Table#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Objects {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Table

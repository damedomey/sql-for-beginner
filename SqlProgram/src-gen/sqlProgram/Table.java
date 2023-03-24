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
 *   <li>{@link sqlProgram.Table#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Objects {

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getTable_Column()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumn();
} // Table

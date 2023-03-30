/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Column#getConstaints <em>Constaints</em>}</li>
 *   <li>{@link sqlProgram.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends Objects {
	/**
	 * Returns the value of the '<em><b>Constaints</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Constaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constaints</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getColumn_Constaints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constaint> getConstaints();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sqlProgram.SqlProgramPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sqlProgram.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Column

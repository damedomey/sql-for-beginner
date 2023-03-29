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
 *   <li>{@link sqlProgram.Column#getType <em>Type</em>}</li>
 *   <li>{@link sqlProgram.Column#getConstaint <em>Constaint</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends Objects {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see sqlProgram.SqlProgramPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link sqlProgram.Column#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Constaint</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Constaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constaint</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getColumn_Constaint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constaint> getConstaint();
} // Column

/**
 */
package sqlProgram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.Creation#getConstaints <em>Constaints</em>}</li>
 *   <li>{@link sqlProgram.Creation#getType <em>Type</em>}</li>
 *   <li>{@link sqlProgram.Creation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getCreation()
 * @model
 * @generated
 */
public interface Creation extends Queries {
	/**
	 * Returns the value of the '<em><b>Constaints</b></em>' containment reference list.
	 * The list contents are of type {@link sqlProgram.Constaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constaints</em>' containment reference list.
	 * @see sqlProgram.SqlProgramPackage#getCreation_Constaints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constaint> getConstaints();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"table"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see sqlProgram.SqlProgramPackage#getCreation_Type()
	 * @model default="table" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link sqlProgram.Creation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sqlProgram.SqlProgramPackage#getCreation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sqlProgram.Creation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Creation

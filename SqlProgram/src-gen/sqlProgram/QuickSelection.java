/**
 */
package sqlProgram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quick Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sqlProgram.QuickSelection#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see sqlProgram.SqlProgramPackage#getQuickSelection()
 * @model
 * @generated
 */
public interface QuickSelection extends Selection {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see sqlProgram.SqlProgramPackage#getQuickSelection_Method()
	 * @model required="true"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link sqlProgram.QuickSelection#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // QuickSelection

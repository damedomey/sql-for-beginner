/**
 */
package sqlProgram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sqlProgram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlProgramFactoryImpl extends EFactoryImpl implements SqlProgramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SqlProgramFactory init() {
		try {
			SqlProgramFactory theSqlProgramFactory = (SqlProgramFactory) EPackage.Registry.INSTANCE
					.getEFactory(SqlProgramPackage.eNS_URI);
			if (theSqlProgramFactory != null) {
				return theSqlProgramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SqlProgramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProgramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SqlProgramPackage.SQL_PROGRAM:
			return createSqlProgram();
		case SqlProgramPackage.SELECTION:
			return createSelection();
		case SqlProgramPackage.TABLE:
			return createTable();
		case SqlProgramPackage.COLUMN:
			return createColumn();
		case SqlProgramPackage.CLAUSE:
			return createClause();
		case SqlProgramPackage.CREATION:
			return createCreation();
		case SqlProgramPackage.CONSTAINT:
			return createConstaint();
		case SqlProgramPackage.UPDATE:
			return createUpdate();
		case SqlProgramPackage.INSERTION:
			return createInsertion();
		case SqlProgramPackage.DELETE:
			return createDelete();
		case SqlProgramPackage.VALUE:
			return createValue();
		case SqlProgramPackage.COLUMN_VALUE:
			return createColumnValue();
		case SqlProgramPackage.QUICK_SELECTION:
			return createQuickSelection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProgram createSqlProgram() {
		SqlProgramImpl sqlProgram = new SqlProgramImpl();
		return sqlProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection createSelection() {
		SelectionImpl selection = new SelectionImpl();
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creation createCreation() {
		CreationImpl creation = new CreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constaint createConstaint() {
		ConstaintImpl constaint = new ConstaintImpl();
		return constaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insertion createInsertion() {
		InsertionImpl insertion = new InsertionImpl();
		return insertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnValue createColumnValue() {
		ColumnValueImpl columnValue = new ColumnValueImpl();
		return columnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuickSelection createQuickSelection() {
		QuickSelectionImpl quickSelection = new QuickSelectionImpl();
		return quickSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlProgramPackage getSqlProgramPackage() {
		return (SqlProgramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SqlProgramPackage getPackage() {
		return SqlProgramPackage.eINSTANCE;
	}

} //SqlProgramFactoryImpl

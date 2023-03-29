/**
 */
package sqlProgram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sqlProgram.SqlProgramFactory
 * @model kind="package"
 * @generated
 */
public interface SqlProgramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sqlProgram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sqlProgram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sqlProgram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlProgramPackage eINSTANCE = sqlProgram.impl.SqlProgramPackageImpl.init();

	/**
	 * The meta object id for the '{@link sqlProgram.impl.SqlProgramImpl <em>Sql Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.SqlProgramImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getSqlProgram()
	 * @generated
	 */
	int SQL_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM__QUERIES = 0;

	/**
	 * The number of structural features of the '<em>Sql Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sql Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.QueriesImpl <em>Queries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.QueriesImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getQueries()
	 * @generated
	 */
	int QUERIES = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERIES__OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Queries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Queries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.SelectionImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__OBJECTS = QUERIES__OBJECTS;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__CLAUSES = QUERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = QUERIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_OPERATION_COUNT = QUERIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ObjectsImpl <em>Objects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ObjectsImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getObjects()
	 * @generated
	 */
	int OBJECTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Objects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.TableImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = OBJECTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ColumnImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = OBJECTS__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = OBJECTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constaints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTAINTS = OBJECTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = OBJECTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = OBJECTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.TypeImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.LibraryImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ClauseImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.CreationImpl <em>Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.CreationImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getCreation()
	 * @generated
	 */
	int CREATION = 9;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__OBJECTS = QUERIES__OBJECTS;

	/**
	 * The feature id for the '<em><b>Constaints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__CONSTAINTS = QUERIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__TYPE = QUERIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION__NAME = QUERIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_FEATURE_COUNT = QUERIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_OPERATION_COUNT = QUERIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ConstaintImpl <em>Constaint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ConstaintImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getConstaint()
	 * @generated
	 */
	int CONSTAINT = 10;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTAINT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Constaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.UpdateImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 11;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__OBJECTS = QUERIES__OBJECTS;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CLAUSES = QUERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = QUERIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = QUERIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.InsertionImpl <em>Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.InsertionImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getInsertion()
	 * @generated
	 */
	int INSERTION = 12;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__OBJECTS = QUERIES__OBJECTS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__VALUES = QUERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_FEATURE_COUNT = QUERIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPERATION_COUNT = QUERIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.DeleteImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 13;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OBJECTS = QUERIES__OBJECTS;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CLAUSES = QUERIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = QUERIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = QUERIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ValueImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 14;

	/**
	 * The feature id for the '<em><b>Columnvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__COLUMNVALUES = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sqlProgram.impl.ColumnValueImpl <em>Column Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sqlProgram.impl.ColumnValueImpl
	 * @see sqlProgram.impl.SqlProgramPackageImpl#getColumnValue()
	 * @generated
	 */
	int COLUMN_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Column Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_VALUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link sqlProgram.SqlProgram <em>Sql Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Program</em>'.
	 * @see sqlProgram.SqlProgram
	 * @generated
	 */
	EClass getSqlProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.SqlProgram#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see sqlProgram.SqlProgram#getQueries()
	 * @see #getSqlProgram()
	 * @generated
	 */
	EReference getSqlProgram_Queries();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Queries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queries</em>'.
	 * @see sqlProgram.Queries
	 * @generated
	 */
	EClass getQueries();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Queries#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see sqlProgram.Queries#getObjects()
	 * @see #getQueries()
	 * @generated
	 */
	EReference getQueries_Objects();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see sqlProgram.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Selection#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see sqlProgram.Selection#getClauses()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Clauses();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Objects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objects</em>'.
	 * @see sqlProgram.Objects
	 * @generated
	 */
	EClass getObjects();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Objects#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sqlProgram.Objects#getName()
	 * @see #getObjects()
	 * @generated
	 */
	EAttribute getObjects_Name();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see sqlProgram.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see sqlProgram.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see sqlProgram.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference '{@link sqlProgram.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sqlProgram.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Column#getConstaints <em>Constaints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constaints</em>'.
	 * @see sqlProgram.Column#getConstaints()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Constaints();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see sqlProgram.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sqlProgram.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see sqlProgram.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Library#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see sqlProgram.Library#getType()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Type();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see sqlProgram.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Clause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sqlProgram.Clause#getName()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Name();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Clause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see sqlProgram.Clause#getBody()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Body();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Creation <em>Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation</em>'.
	 * @see sqlProgram.Creation
	 * @generated
	 */
	EClass getCreation();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Creation#getConstaints <em>Constaints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constaints</em>'.
	 * @see sqlProgram.Creation#getConstaints()
	 * @see #getCreation()
	 * @generated
	 */
	EReference getCreation_Constaints();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Creation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see sqlProgram.Creation#getType()
	 * @see #getCreation()
	 * @generated
	 */
	EAttribute getCreation_Type();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Creation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sqlProgram.Creation#getName()
	 * @see #getCreation()
	 * @generated
	 */
	EAttribute getCreation_Name();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Constaint <em>Constaint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constaint</em>'.
	 * @see sqlProgram.Constaint
	 * @generated
	 */
	EClass getConstaint();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.Constaint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see sqlProgram.Constaint#getBody()
	 * @see #getConstaint()
	 * @generated
	 */
	EAttribute getConstaint_Body();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see sqlProgram.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Update#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see sqlProgram.Update#getClauses()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_Clauses();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Insertion <em>Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion</em>'.
	 * @see sqlProgram.Insertion
	 * @generated
	 */
	EClass getInsertion();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Insertion#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see sqlProgram.Insertion#getValues()
	 * @see #getInsertion()
	 * @generated
	 */
	EReference getInsertion_Values();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see sqlProgram.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Delete#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see sqlProgram.Delete#getClauses()
	 * @see #getDelete()
	 * @generated
	 */
	EReference getDelete_Clauses();

	/**
	 * Returns the meta object for class '{@link sqlProgram.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see sqlProgram.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference list '{@link sqlProgram.Value#getColumnvalues <em>Columnvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columnvalues</em>'.
	 * @see sqlProgram.Value#getColumnvalues()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Columnvalues();

	/**
	 * Returns the meta object for class '{@link sqlProgram.ColumnValue <em>Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Value</em>'.
	 * @see sqlProgram.ColumnValue
	 * @generated
	 */
	EClass getColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link sqlProgram.ColumnValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sqlProgram.ColumnValue#getValue()
	 * @see #getColumnValue()
	 * @generated
	 */
	EAttribute getColumnValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlProgramFactory getSqlProgramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sqlProgram.impl.SqlProgramImpl <em>Sql Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.SqlProgramImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getSqlProgram()
		 * @generated
		 */
		EClass SQL_PROGRAM = eINSTANCE.getSqlProgram();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_PROGRAM__QUERIES = eINSTANCE.getSqlProgram_Queries();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.QueriesImpl <em>Queries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.QueriesImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getQueries()
		 * @generated
		 */
		EClass QUERIES = eINSTANCE.getQueries();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERIES__OBJECTS = eINSTANCE.getQueries_Objects();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.SelectionImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__CLAUSES = eINSTANCE.getSelection_Clauses();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ObjectsImpl <em>Objects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ObjectsImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getObjects()
		 * @generated
		 */
		EClass OBJECTS = eINSTANCE.getObjects();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTS__NAME = eINSTANCE.getObjects_Name();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.TableImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ColumnImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Constaints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CONSTAINTS = eINSTANCE.getColumn_Constaints();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.TypeImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.LibraryImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__TYPE = eINSTANCE.getLibrary_Type();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ClauseImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__NAME = eINSTANCE.getClause_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__BODY = eINSTANCE.getClause_Body();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.CreationImpl <em>Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.CreationImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getCreation()
		 * @generated
		 */
		EClass CREATION = eINSTANCE.getCreation();

		/**
		 * The meta object literal for the '<em><b>Constaints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION__CONSTAINTS = eINSTANCE.getCreation_Constaints();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION__TYPE = eINSTANCE.getCreation_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION__NAME = eINSTANCE.getCreation_Name();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ConstaintImpl <em>Constaint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ConstaintImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getConstaint()
		 * @generated
		 */
		EClass CONSTAINT = eINSTANCE.getConstaint();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTAINT__BODY = eINSTANCE.getConstaint_Body();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.UpdateImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__CLAUSES = eINSTANCE.getUpdate_Clauses();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.InsertionImpl <em>Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.InsertionImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getInsertion()
		 * @generated
		 */
		EClass INSERTION = eINSTANCE.getInsertion();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION__VALUES = eINSTANCE.getInsertion_Values();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.DeleteImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE__CLAUSES = eINSTANCE.getDelete_Clauses();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ValueImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Columnvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__COLUMNVALUES = eINSTANCE.getValue_Columnvalues();

		/**
		 * The meta object literal for the '{@link sqlProgram.impl.ColumnValueImpl <em>Column Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sqlProgram.impl.ColumnValueImpl
		 * @see sqlProgram.impl.SqlProgramPackageImpl#getColumnValue()
		 * @generated
		 */
		EClass COLUMN_VALUE = eINSTANCE.getColumnValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_VALUE__VALUE = eINSTANCE.getColumnValue_Value();

	}

} //SqlProgramPackage

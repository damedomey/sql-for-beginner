/*
 * generated by Xtext 2.30.0.M3
 */
package sqlProgram.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import sqlProgram.ide.contentassist.antlr.internal.InternalSqlDslParser;
import sqlProgram.services.SqlDslGrammarAccess;

public class SqlDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SqlDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SqlDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getQueriesAccess().getAlternatives(), "rule__Queries__Alternatives");
			builder.put(grammarAccess.getObjectsAccess().getAlternatives(), "rule__Objects__Alternatives");
			builder.put(grammarAccess.getCreationAccess().getAlternatives_2(), "rule__Creation__Alternatives_2");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getColumnOnCreationAccess().getTypeAlternatives_2_0(), "rule__ColumnOnCreation__TypeAlternatives_2_0");
			builder.put(grammarAccess.getSqlProgramAccess().getGroup(), "rule__SqlProgram__Group__0");
			builder.put(grammarAccess.getSqlProgramAccess().getGroup_1(), "rule__SqlProgram__Group_1__0");
			builder.put(grammarAccess.getQuickSelectionAccess().getGroup(), "rule__QuickSelection__Group__0");
			builder.put(grammarAccess.getQuickSelectionAccess().getGroup_4(), "rule__QuickSelection__Group_4__0");
			builder.put(grammarAccess.getSelectionAccess().getGroup(), "rule__Selection__Group__0");
			builder.put(grammarAccess.getSelectionAccess().getGroup_4(), "rule__Selection__Group_4__0");
			builder.put(grammarAccess.getCreationAccess().getGroup(), "rule__Creation__Group__0");
			builder.put(grammarAccess.getCreationAccess().getGroup_2_0(), "rule__Creation__Group_2_0__0");
			builder.put(grammarAccess.getCreationAccess().getGroup_2_0_2(), "rule__Creation__Group_2_0_2__0");
			builder.put(grammarAccess.getCreationAccess().getGroup_2_0_2_1(), "rule__Creation__Group_2_0_2_1__0");
			builder.put(grammarAccess.getCreationAccess().getGroup_2_1(), "rule__Creation__Group_2_1__0");
			builder.put(grammarAccess.getUpdateAccess().getGroup(), "rule__Update__Group__0");
			builder.put(grammarAccess.getUpdateAccess().getGroup_4(), "rule__Update__Group_4__0");
			builder.put(grammarAccess.getInsertionAccess().getGroup(), "rule__Insertion__Group__0");
			builder.put(grammarAccess.getInsertionAccess().getGroup_7(), "rule__Insertion__Group_7__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_4(), "rule__Delete__Group_4__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_4_1(), "rule__Delete__Group_4_1__0");
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup_3(), "rule__Table__Group_3__0");
			builder.put(grammarAccess.getTableAccess().getGroup_3_1(), "rule__Table__Group_3_1__0");
			builder.put(grammarAccess.getTableOnCreationAccess().getGroup(), "rule__TableOnCreation__Group__0");
			builder.put(grammarAccess.getTableOnCreationAccess().getGroup_4(), "rule__TableOnCreation__Group_4__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getColumnOnCreationAccess().getGroup(), "rule__ColumnOnCreation__Group__0");
			builder.put(grammarAccess.getConstaintAccess().getGroup(), "rule__Constaint__Group__0");
			builder.put(grammarAccess.getClauseAccess().getGroup(), "rule__Clause__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup_3(), "rule__Value__Group_3__0");
			builder.put(grammarAccess.getValueAccess().getGroup_3_1(), "rule__Value__Group_3_1__0");
			builder.put(grammarAccess.getColumnValueAccess().getGroup(), "rule__ColumnValue__Group__0");
			builder.put(grammarAccess.getComplexStringAccess().getGroup(), "rule__ComplexString__Group__0");
			builder.put(grammarAccess.getComplexStringAccess().getGroup_1(), "rule__ComplexString__Group_1__0");
			builder.put(grammarAccess.getComplexStringAccess().getGroup_2(), "rule__ComplexString__Group_2__0");
			builder.put(grammarAccess.getComplexStringAccess().getGroup_2_2(), "rule__ComplexString__Group_2_2__0");
			builder.put(grammarAccess.getSqlProgramAccess().getQueriesAssignment_1_0(), "rule__SqlProgram__QueriesAssignment_1_0");
			builder.put(grammarAccess.getQuickSelectionAccess().getMethodAssignment_1(), "rule__QuickSelection__MethodAssignment_1");
			builder.put(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_3(), "rule__QuickSelection__ObjectsAssignment_3");
			builder.put(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_4_1(), "rule__QuickSelection__ObjectsAssignment_4_1");
			builder.put(grammarAccess.getQuickSelectionAccess().getClausesAssignment_5(), "rule__QuickSelection__ClausesAssignment_5");
			builder.put(grammarAccess.getSelectionAccess().getObjectsAssignment_3(), "rule__Selection__ObjectsAssignment_3");
			builder.put(grammarAccess.getSelectionAccess().getObjectsAssignment_4_1(), "rule__Selection__ObjectsAssignment_4_1");
			builder.put(grammarAccess.getSelectionAccess().getClausesAssignment_5(), "rule__Selection__ClausesAssignment_5");
			builder.put(grammarAccess.getCreationAccess().getTypeAssignment_2_0_0(), "rule__Creation__TypeAssignment_2_0_0");
			builder.put(grammarAccess.getCreationAccess().getObjectsAssignment_2_0_1(), "rule__Creation__ObjectsAssignment_2_0_1");
			builder.put(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_0(), "rule__Creation__ConstaintsAssignment_2_0_2_0");
			builder.put(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_1_1(), "rule__Creation__ConstaintsAssignment_2_0_2_1_1");
			builder.put(grammarAccess.getCreationAccess().getTypeAssignment_2_1_0(), "rule__Creation__TypeAssignment_2_1_0");
			builder.put(grammarAccess.getCreationAccess().getNameAssignment_2_1_1(), "rule__Creation__NameAssignment_2_1_1");
			builder.put(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_3(), "rule__Creation__ObjectsAssignment_2_1_3");
			builder.put(grammarAccess.getUpdateAccess().getObjectsAssignment_2(), "rule__Update__ObjectsAssignment_2");
			builder.put(grammarAccess.getUpdateAccess().getClausesAssignment_3(), "rule__Update__ClausesAssignment_3");
			builder.put(grammarAccess.getUpdateAccess().getClausesAssignment_4_1(), "rule__Update__ClausesAssignment_4_1");
			builder.put(grammarAccess.getInsertionAccess().getObjectsAssignment_3(), "rule__Insertion__ObjectsAssignment_3");
			builder.put(grammarAccess.getInsertionAccess().getValuesAssignment_6(), "rule__Insertion__ValuesAssignment_6");
			builder.put(grammarAccess.getInsertionAccess().getValuesAssignment_7_1(), "rule__Insertion__ValuesAssignment_7_1");
			builder.put(grammarAccess.getDeleteAccess().getObjectsAssignment_3(), "rule__Delete__ObjectsAssignment_3");
			builder.put(grammarAccess.getDeleteAccess().getClausesAssignment_4_0(), "rule__Delete__ClausesAssignment_4_0");
			builder.put(grammarAccess.getDeleteAccess().getClausesAssignment_4_1_1(), "rule__Delete__ClausesAssignment_4_1_1");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_1(), "rule__Table__NameAssignment_1");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_3_0(), "rule__Table__ColumnsAssignment_3_0");
			builder.put(grammarAccess.getTableAccess().getColumnsAssignment_3_1_1(), "rule__Table__ColumnsAssignment_3_1_1");
			builder.put(grammarAccess.getTableOnCreationAccess().getNameAssignment_1(), "rule__TableOnCreation__NameAssignment_1");
			builder.put(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_3(), "rule__TableOnCreation__ColumnsAssignment_3");
			builder.put(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_4_1(), "rule__TableOnCreation__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getColumnAccess().getNameAssignment_1(), "rule__Column__NameAssignment_1");
			builder.put(grammarAccess.getColumnOnCreationAccess().getNameAssignment_1(), "rule__ColumnOnCreation__NameAssignment_1");
			builder.put(grammarAccess.getColumnOnCreationAccess().getTypeAssignment_2(), "rule__ColumnOnCreation__TypeAssignment_2");
			builder.put(grammarAccess.getColumnOnCreationAccess().getConstaintsAssignment_3(), "rule__ColumnOnCreation__ConstaintsAssignment_3");
			builder.put(grammarAccess.getConstaintAccess().getBodyAssignment_1(), "rule__Constaint__BodyAssignment_1");
			builder.put(grammarAccess.getConstaintOnCreationAccess().getBodyAssignment(), "rule__ConstaintOnCreation__BodyAssignment");
			builder.put(grammarAccess.getClauseAccess().getNameAssignment_0(), "rule__Clause__NameAssignment_0");
			builder.put(grammarAccess.getClauseAccess().getBodyAssignment_1(), "rule__Clause__BodyAssignment_1");
			builder.put(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_0(), "rule__Value__ColumnvaluesAssignment_3_0");
			builder.put(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_1_1(), "rule__Value__ColumnvaluesAssignment_3_1_1");
			builder.put(grammarAccess.getColumnValueAccess().getValueAssignment_1(), "rule__ColumnValue__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SqlDslGrammarAccess grammarAccess;

	@Override
	protected InternalSqlDslParser createParser() {
		InternalSqlDslParser result = new InternalSqlDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SqlDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SqlDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

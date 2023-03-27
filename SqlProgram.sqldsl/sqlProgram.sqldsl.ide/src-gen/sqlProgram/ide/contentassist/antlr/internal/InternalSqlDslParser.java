package sqlProgram.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import sqlProgram.services.SqlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'OR'", "'WHERE'", "'SET'", "'HAVING'", "'LIMIT'", "'OFFSET'", "'and'", "'or'", "'where'", "'set'", "'having'", "'limit'", "'offset'", "';'", "'SELECT'", "'FROM'", "','", "'CREATE'", "'UPDATE'", "'INSERT'", "'INTO'", "'DELETE'", "'{'", "'}'", "'CONSTRAINT'", "'Value'", "'('", "')'", "'()'", "'.'", "'*'", "'='", "'TABLE'", "'INDEX'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSqlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSqlDsl.g"; }


    	private SqlDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SqlDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSqlProgram"
    // InternalSqlDsl.g:53:1: entryRuleSqlProgram : ruleSqlProgram EOF ;
    public final void entryRuleSqlProgram() throws RecognitionException {
        try {
            // InternalSqlDsl.g:54:1: ( ruleSqlProgram EOF )
            // InternalSqlDsl.g:55:1: ruleSqlProgram EOF
            {
             before(grammarAccess.getSqlProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleSqlProgram();

            state._fsp--;

             after(grammarAccess.getSqlProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSqlProgram"


    // $ANTLR start "ruleSqlProgram"
    // InternalSqlDsl.g:62:1: ruleSqlProgram : ( ( rule__SqlProgram__Group__0 ) ) ;
    public final void ruleSqlProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:66:2: ( ( ( rule__SqlProgram__Group__0 ) ) )
            // InternalSqlDsl.g:67:2: ( ( rule__SqlProgram__Group__0 ) )
            {
            // InternalSqlDsl.g:67:2: ( ( rule__SqlProgram__Group__0 ) )
            // InternalSqlDsl.g:68:3: ( rule__SqlProgram__Group__0 )
            {
             before(grammarAccess.getSqlProgramAccess().getGroup()); 
            // InternalSqlDsl.g:69:3: ( rule__SqlProgram__Group__0 )
            // InternalSqlDsl.g:69:4: rule__SqlProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSqlProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSqlProgram"


    // $ANTLR start "entryRuleQueries"
    // InternalSqlDsl.g:78:1: entryRuleQueries : ruleQueries EOF ;
    public final void entryRuleQueries() throws RecognitionException {
        try {
            // InternalSqlDsl.g:79:1: ( ruleQueries EOF )
            // InternalSqlDsl.g:80:1: ruleQueries EOF
            {
             before(grammarAccess.getQueriesRule()); 
            pushFollow(FOLLOW_1);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getQueriesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueries"


    // $ANTLR start "ruleQueries"
    // InternalSqlDsl.g:87:1: ruleQueries : ( ( rule__Queries__Alternatives ) ) ;
    public final void ruleQueries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:91:2: ( ( ( rule__Queries__Alternatives ) ) )
            // InternalSqlDsl.g:92:2: ( ( rule__Queries__Alternatives ) )
            {
            // InternalSqlDsl.g:92:2: ( ( rule__Queries__Alternatives ) )
            // InternalSqlDsl.g:93:3: ( rule__Queries__Alternatives )
            {
             before(grammarAccess.getQueriesAccess().getAlternatives()); 
            // InternalSqlDsl.g:94:3: ( rule__Queries__Alternatives )
            // InternalSqlDsl.g:94:4: rule__Queries__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Queries__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueriesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueries"


    // $ANTLR start "entryRuleSelection"
    // InternalSqlDsl.g:103:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalSqlDsl.g:104:1: ( ruleSelection EOF )
            // InternalSqlDsl.g:105:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalSqlDsl.g:112:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:116:2: ( ( ( rule__Selection__Group__0 ) ) )
            // InternalSqlDsl.g:117:2: ( ( rule__Selection__Group__0 ) )
            {
            // InternalSqlDsl.g:117:2: ( ( rule__Selection__Group__0 ) )
            // InternalSqlDsl.g:118:3: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // InternalSqlDsl.g:119:3: ( rule__Selection__Group__0 )
            // InternalSqlDsl.g:119:4: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleCreation"
    // InternalSqlDsl.g:128:1: entryRuleCreation : ruleCreation EOF ;
    public final void entryRuleCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:129:1: ( ruleCreation EOF )
            // InternalSqlDsl.g:130:1: ruleCreation EOF
            {
             before(grammarAccess.getCreationRule()); 
            pushFollow(FOLLOW_1);
            ruleCreation();

            state._fsp--;

             after(grammarAccess.getCreationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreation"


    // $ANTLR start "ruleCreation"
    // InternalSqlDsl.g:137:1: ruleCreation : ( ( rule__Creation__Group__0 ) ) ;
    public final void ruleCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:141:2: ( ( ( rule__Creation__Group__0 ) ) )
            // InternalSqlDsl.g:142:2: ( ( rule__Creation__Group__0 ) )
            {
            // InternalSqlDsl.g:142:2: ( ( rule__Creation__Group__0 ) )
            // InternalSqlDsl.g:143:3: ( rule__Creation__Group__0 )
            {
             before(grammarAccess.getCreationAccess().getGroup()); 
            // InternalSqlDsl.g:144:3: ( rule__Creation__Group__0 )
            // InternalSqlDsl.g:144:4: rule__Creation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreation"


    // $ANTLR start "entryRuleUpdate"
    // InternalSqlDsl.g:153:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalSqlDsl.g:154:1: ( ruleUpdate EOF )
            // InternalSqlDsl.g:155:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalSqlDsl.g:162:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:166:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalSqlDsl.g:167:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalSqlDsl.g:167:2: ( ( rule__Update__Group__0 ) )
            // InternalSqlDsl.g:168:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalSqlDsl.g:169:3: ( rule__Update__Group__0 )
            // InternalSqlDsl.g:169:4: rule__Update__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleInsertion"
    // InternalSqlDsl.g:178:1: entryRuleInsertion : ruleInsertion EOF ;
    public final void entryRuleInsertion() throws RecognitionException {
        try {
            // InternalSqlDsl.g:179:1: ( ruleInsertion EOF )
            // InternalSqlDsl.g:180:1: ruleInsertion EOF
            {
             before(grammarAccess.getInsertionRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertion();

            state._fsp--;

             after(grammarAccess.getInsertionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsertion"


    // $ANTLR start "ruleInsertion"
    // InternalSqlDsl.g:187:1: ruleInsertion : ( ( rule__Insertion__Group__0 ) ) ;
    public final void ruleInsertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:191:2: ( ( ( rule__Insertion__Group__0 ) ) )
            // InternalSqlDsl.g:192:2: ( ( rule__Insertion__Group__0 ) )
            {
            // InternalSqlDsl.g:192:2: ( ( rule__Insertion__Group__0 ) )
            // InternalSqlDsl.g:193:3: ( rule__Insertion__Group__0 )
            {
             before(grammarAccess.getInsertionAccess().getGroup()); 
            // InternalSqlDsl.g:194:3: ( rule__Insertion__Group__0 )
            // InternalSqlDsl.g:194:4: rule__Insertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertion"


    // $ANTLR start "entryRuleDelete"
    // InternalSqlDsl.g:203:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalSqlDsl.g:204:1: ( ruleDelete EOF )
            // InternalSqlDsl.g:205:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalSqlDsl.g:212:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:216:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalSqlDsl.g:217:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalSqlDsl.g:217:2: ( ( rule__Delete__Group__0 ) )
            // InternalSqlDsl.g:218:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalSqlDsl.g:219:3: ( rule__Delete__Group__0 )
            // InternalSqlDsl.g:219:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleEString"
    // InternalSqlDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSqlDsl.g:229:1: ( ruleEString EOF )
            // InternalSqlDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSqlDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSqlDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSqlDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalSqlDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSqlDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalSqlDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalSqlDsl.g:253:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSqlDsl.g:254:1: ( ruleTable EOF )
            // InternalSqlDsl.g:255:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSqlDsl.g:262:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:266:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSqlDsl.g:267:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSqlDsl.g:267:2: ( ( rule__Table__Group__0 ) )
            // InternalSqlDsl.g:268:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSqlDsl.g:269:3: ( rule__Table__Group__0 )
            // InternalSqlDsl.g:269:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalSqlDsl.g:278:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSqlDsl.g:279:1: ( ruleColumn EOF )
            // InternalSqlDsl.g:280:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalSqlDsl.g:287:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:291:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSqlDsl.g:292:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSqlDsl.g:292:2: ( ( rule__Column__Group__0 ) )
            // InternalSqlDsl.g:293:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSqlDsl.g:294:3: ( rule__Column__Group__0 )
            // InternalSqlDsl.g:294:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleClause"
    // InternalSqlDsl.g:303:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalSqlDsl.g:304:1: ( ruleClause EOF )
            // InternalSqlDsl.g:305:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalSqlDsl.g:312:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:316:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalSqlDsl.g:317:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalSqlDsl.g:317:2: ( ( rule__Clause__Group__0 ) )
            // InternalSqlDsl.g:318:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalSqlDsl.g:319:3: ( rule__Clause__Group__0 )
            // InternalSqlDsl.g:319:4: rule__Clause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleConstaint"
    // InternalSqlDsl.g:328:1: entryRuleConstaint : ruleConstaint EOF ;
    public final void entryRuleConstaint() throws RecognitionException {
        try {
            // InternalSqlDsl.g:329:1: ( ruleConstaint EOF )
            // InternalSqlDsl.g:330:1: ruleConstaint EOF
            {
             before(grammarAccess.getConstaintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstaint();

            state._fsp--;

             after(grammarAccess.getConstaintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstaint"


    // $ANTLR start "ruleConstaint"
    // InternalSqlDsl.g:337:1: ruleConstaint : ( ( rule__Constaint__Group__0 ) ) ;
    public final void ruleConstaint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:341:2: ( ( ( rule__Constaint__Group__0 ) ) )
            // InternalSqlDsl.g:342:2: ( ( rule__Constaint__Group__0 ) )
            {
            // InternalSqlDsl.g:342:2: ( ( rule__Constaint__Group__0 ) )
            // InternalSqlDsl.g:343:3: ( rule__Constaint__Group__0 )
            {
             before(grammarAccess.getConstaintAccess().getGroup()); 
            // InternalSqlDsl.g:344:3: ( rule__Constaint__Group__0 )
            // InternalSqlDsl.g:344:4: rule__Constaint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constaint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstaintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstaint"


    // $ANTLR start "entryRuleValue"
    // InternalSqlDsl.g:353:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:354:1: ( ruleValue EOF )
            // InternalSqlDsl.g:355:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSqlDsl.g:362:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:366:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSqlDsl.g:367:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSqlDsl.g:367:2: ( ( rule__Value__Group__0 ) )
            // InternalSqlDsl.g:368:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSqlDsl.g:369:3: ( rule__Value__Group__0 )
            // InternalSqlDsl.g:369:4: rule__Value__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleColumnValue"
    // InternalSqlDsl.g:378:1: entryRuleColumnValue : ruleColumnValue EOF ;
    public final void entryRuleColumnValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:379:1: ( ruleColumnValue EOF )
            // InternalSqlDsl.g:380:1: ruleColumnValue EOF
            {
             before(grammarAccess.getColumnValueRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getColumnValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnValue"


    // $ANTLR start "ruleColumnValue"
    // InternalSqlDsl.g:387:1: ruleColumnValue : ( ( rule__ColumnValue__Group__0 ) ) ;
    public final void ruleColumnValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:391:2: ( ( ( rule__ColumnValue__Group__0 ) ) )
            // InternalSqlDsl.g:392:2: ( ( rule__ColumnValue__Group__0 ) )
            {
            // InternalSqlDsl.g:392:2: ( ( rule__ColumnValue__Group__0 ) )
            // InternalSqlDsl.g:393:3: ( rule__ColumnValue__Group__0 )
            {
             before(grammarAccess.getColumnValueAccess().getGroup()); 
            // InternalSqlDsl.g:394:3: ( rule__ColumnValue__Group__0 )
            // InternalSqlDsl.g:394:4: rule__ColumnValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnValue"


    // $ANTLR start "entryRuleComplexString"
    // InternalSqlDsl.g:403:1: entryRuleComplexString : ruleComplexString EOF ;
    public final void entryRuleComplexString() throws RecognitionException {
        try {
            // InternalSqlDsl.g:404:1: ( ruleComplexString EOF )
            // InternalSqlDsl.g:405:1: ruleComplexString EOF
            {
             before(grammarAccess.getComplexStringRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexString();

            state._fsp--;

             after(grammarAccess.getComplexStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexString"


    // $ANTLR start "ruleComplexString"
    // InternalSqlDsl.g:412:1: ruleComplexString : ( ( rule__ComplexString__Group__0 ) ) ;
    public final void ruleComplexString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:416:2: ( ( ( rule__ComplexString__Group__0 ) ) )
            // InternalSqlDsl.g:417:2: ( ( rule__ComplexString__Group__0 ) )
            {
            // InternalSqlDsl.g:417:2: ( ( rule__ComplexString__Group__0 ) )
            // InternalSqlDsl.g:418:3: ( rule__ComplexString__Group__0 )
            {
             before(grammarAccess.getComplexStringAccess().getGroup()); 
            // InternalSqlDsl.g:419:3: ( rule__ComplexString__Group__0 )
            // InternalSqlDsl.g:419:4: rule__ComplexString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexString"


    // $ANTLR start "rule__Queries__Alternatives"
    // InternalSqlDsl.g:427:1: rule__Queries__Alternatives : ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) );
    public final void rule__Queries__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:431:1: ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 33:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSqlDsl.g:432:2: ( ruleSelection )
                    {
                    // InternalSqlDsl.g:432:2: ( ruleSelection )
                    // InternalSqlDsl.g:433:3: ruleSelection
                    {
                     before(grammarAccess.getQueriesAccess().getSelectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelection();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getSelectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:438:2: ( ruleCreation )
                    {
                    // InternalSqlDsl.g:438:2: ( ruleCreation )
                    // InternalSqlDsl.g:439:3: ruleCreation
                    {
                     before(grammarAccess.getQueriesAccess().getCreationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreation();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getCreationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:444:2: ( ruleUpdate )
                    {
                    // InternalSqlDsl.g:444:2: ( ruleUpdate )
                    // InternalSqlDsl.g:445:3: ruleUpdate
                    {
                     before(grammarAccess.getQueriesAccess().getUpdateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getUpdateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:450:2: ( ruleInsertion )
                    {
                    // InternalSqlDsl.g:450:2: ( ruleInsertion )
                    // InternalSqlDsl.g:451:3: ruleInsertion
                    {
                     before(grammarAccess.getQueriesAccess().getInsertionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertion();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getInsertionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:456:2: ( ruleDelete )
                    {
                    // InternalSqlDsl.g:456:2: ( ruleDelete )
                    // InternalSqlDsl.g:457:3: ruleDelete
                    {
                     before(grammarAccess.getQueriesAccess().getDeleteParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getDeleteParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queries__Alternatives"


    // $ANTLR start "rule__Creation__Alternatives_2"
    // InternalSqlDsl.g:466:1: rule__Creation__Alternatives_2 : ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) );
    public final void rule__Creation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:470:1: ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==45) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlDsl.g:471:2: ( ( rule__Creation__Group_2_0__0 ) )
                    {
                    // InternalSqlDsl.g:471:2: ( ( rule__Creation__Group_2_0__0 ) )
                    // InternalSqlDsl.g:472:3: ( rule__Creation__Group_2_0__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_0()); 
                    // InternalSqlDsl.g:473:3: ( rule__Creation__Group_2_0__0 )
                    // InternalSqlDsl.g:473:4: rule__Creation__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:477:2: ( ( rule__Creation__Group_2_1__0 ) )
                    {
                    // InternalSqlDsl.g:477:2: ( ( rule__Creation__Group_2_1__0 ) )
                    // InternalSqlDsl.g:478:3: ( rule__Creation__Group_2_1__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_1()); 
                    // InternalSqlDsl.g:479:3: ( rule__Creation__Group_2_1__0 )
                    // InternalSqlDsl.g:479:4: rule__Creation__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreationAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Alternatives_2"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSqlDsl.g:487:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:491:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSqlDsl.g:492:2: ( RULE_STRING )
                    {
                    // InternalSqlDsl.g:492:2: ( RULE_STRING )
                    // InternalSqlDsl.g:493:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:498:2: ( RULE_ID )
                    {
                    // InternalSqlDsl.g:498:2: ( RULE_ID )
                    // InternalSqlDsl.g:499:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Clause__NameAlternatives_0_0"
    // InternalSqlDsl.g:508:1: rule__Clause__NameAlternatives_0_0 : ( ( 'AND' ) | ( 'OR' ) | ( 'WHERE' ) | ( 'SET' ) | ( 'HAVING' ) | ( 'LIMIT' ) | ( 'OFFSET' ) | ( 'and' ) | ( 'or' ) | ( 'where' ) | ( 'set' ) | ( 'having' ) | ( 'limit' ) | ( 'offset' ) );
    public final void rule__Clause__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:512:1: ( ( 'AND' ) | ( 'OR' ) | ( 'WHERE' ) | ( 'SET' ) | ( 'HAVING' ) | ( 'LIMIT' ) | ( 'OFFSET' ) | ( 'and' ) | ( 'or' ) | ( 'where' ) | ( 'set' ) | ( 'having' ) | ( 'limit' ) | ( 'offset' ) )
            int alt4=14;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
                {
                alt4=10;
                }
                break;
            case 21:
                {
                alt4=11;
                }
                break;
            case 22:
                {
                alt4=12;
                }
                break;
            case 23:
                {
                alt4=13;
                }
                break;
            case 24:
                {
                alt4=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSqlDsl.g:513:2: ( 'AND' )
                    {
                    // InternalSqlDsl.g:513:2: ( 'AND' )
                    // InternalSqlDsl.g:514:3: 'AND'
                    {
                     before(grammarAccess.getClauseAccess().getNameANDKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameANDKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:519:2: ( 'OR' )
                    {
                    // InternalSqlDsl.g:519:2: ( 'OR' )
                    // InternalSqlDsl.g:520:3: 'OR'
                    {
                     before(grammarAccess.getClauseAccess().getNameORKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameORKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:525:2: ( 'WHERE' )
                    {
                    // InternalSqlDsl.g:525:2: ( 'WHERE' )
                    // InternalSqlDsl.g:526:3: 'WHERE'
                    {
                     before(grammarAccess.getClauseAccess().getNameWHEREKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameWHEREKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:531:2: ( 'SET' )
                    {
                    // InternalSqlDsl.g:531:2: ( 'SET' )
                    // InternalSqlDsl.g:532:3: 'SET'
                    {
                     before(grammarAccess.getClauseAccess().getNameSETKeyword_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameSETKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:537:2: ( 'HAVING' )
                    {
                    // InternalSqlDsl.g:537:2: ( 'HAVING' )
                    // InternalSqlDsl.g:538:3: 'HAVING'
                    {
                     before(grammarAccess.getClauseAccess().getNameHAVINGKeyword_0_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameHAVINGKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:543:2: ( 'LIMIT' )
                    {
                    // InternalSqlDsl.g:543:2: ( 'LIMIT' )
                    // InternalSqlDsl.g:544:3: 'LIMIT'
                    {
                     before(grammarAccess.getClauseAccess().getNameLIMITKeyword_0_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameLIMITKeyword_0_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlDsl.g:549:2: ( 'OFFSET' )
                    {
                    // InternalSqlDsl.g:549:2: ( 'OFFSET' )
                    // InternalSqlDsl.g:550:3: 'OFFSET'
                    {
                     before(grammarAccess.getClauseAccess().getNameOFFSETKeyword_0_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameOFFSETKeyword_0_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSqlDsl.g:555:2: ( 'and' )
                    {
                    // InternalSqlDsl.g:555:2: ( 'and' )
                    // InternalSqlDsl.g:556:3: 'and'
                    {
                     before(grammarAccess.getClauseAccess().getNameAndKeyword_0_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameAndKeyword_0_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlDsl.g:561:2: ( 'or' )
                    {
                    // InternalSqlDsl.g:561:2: ( 'or' )
                    // InternalSqlDsl.g:562:3: 'or'
                    {
                     before(grammarAccess.getClauseAccess().getNameOrKeyword_0_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameOrKeyword_0_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSqlDsl.g:567:2: ( 'where' )
                    {
                    // InternalSqlDsl.g:567:2: ( 'where' )
                    // InternalSqlDsl.g:568:3: 'where'
                    {
                     before(grammarAccess.getClauseAccess().getNameWhereKeyword_0_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameWhereKeyword_0_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSqlDsl.g:573:2: ( 'set' )
                    {
                    // InternalSqlDsl.g:573:2: ( 'set' )
                    // InternalSqlDsl.g:574:3: 'set'
                    {
                     before(grammarAccess.getClauseAccess().getNameSetKeyword_0_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameSetKeyword_0_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSqlDsl.g:579:2: ( 'having' )
                    {
                    // InternalSqlDsl.g:579:2: ( 'having' )
                    // InternalSqlDsl.g:580:3: 'having'
                    {
                     before(grammarAccess.getClauseAccess().getNameHavingKeyword_0_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameHavingKeyword_0_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalSqlDsl.g:585:2: ( 'limit' )
                    {
                    // InternalSqlDsl.g:585:2: ( 'limit' )
                    // InternalSqlDsl.g:586:3: 'limit'
                    {
                     before(grammarAccess.getClauseAccess().getNameLimitKeyword_0_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameLimitKeyword_0_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalSqlDsl.g:591:2: ( 'offset' )
                    {
                    // InternalSqlDsl.g:591:2: ( 'offset' )
                    // InternalSqlDsl.g:592:3: 'offset'
                    {
                     before(grammarAccess.getClauseAccess().getNameOffsetKeyword_0_0_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getClauseAccess().getNameOffsetKeyword_0_0_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__NameAlternatives_0_0"


    // $ANTLR start "rule__SqlProgram__Group__0"
    // InternalSqlDsl.g:601:1: rule__SqlProgram__Group__0 : rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 ;
    public final void rule__SqlProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:605:1: ( rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 )
            // InternalSqlDsl.g:606:2: rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SqlProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group__0"


    // $ANTLR start "rule__SqlProgram__Group__0__Impl"
    // InternalSqlDsl.g:613:1: rule__SqlProgram__Group__0__Impl : ( () ) ;
    public final void rule__SqlProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:617:1: ( ( () ) )
            // InternalSqlDsl.g:618:1: ( () )
            {
            // InternalSqlDsl.g:618:1: ( () )
            // InternalSqlDsl.g:619:2: ()
            {
             before(grammarAccess.getSqlProgramAccess().getSqlProgramAction_0()); 
            // InternalSqlDsl.g:620:2: ()
            // InternalSqlDsl.g:620:3: 
            {
            }

             after(grammarAccess.getSqlProgramAccess().getSqlProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group__0__Impl"


    // $ANTLR start "rule__SqlProgram__Group__1"
    // InternalSqlDsl.g:628:1: rule__SqlProgram__Group__1 : rule__SqlProgram__Group__1__Impl ;
    public final void rule__SqlProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:632:1: ( rule__SqlProgram__Group__1__Impl )
            // InternalSqlDsl.g:633:2: rule__SqlProgram__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group__1"


    // $ANTLR start "rule__SqlProgram__Group__1__Impl"
    // InternalSqlDsl.g:639:1: rule__SqlProgram__Group__1__Impl : ( ( rule__SqlProgram__Group_1__0 )* ) ;
    public final void rule__SqlProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:643:1: ( ( ( rule__SqlProgram__Group_1__0 )* ) )
            // InternalSqlDsl.g:644:1: ( ( rule__SqlProgram__Group_1__0 )* )
            {
            // InternalSqlDsl.g:644:1: ( ( rule__SqlProgram__Group_1__0 )* )
            // InternalSqlDsl.g:645:2: ( rule__SqlProgram__Group_1__0 )*
            {
             before(grammarAccess.getSqlProgramAccess().getGroup_1()); 
            // InternalSqlDsl.g:646:2: ( rule__SqlProgram__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26||(LA5_0>=29 && LA5_0<=31)||LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSqlDsl.g:646:3: rule__SqlProgram__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SqlProgram__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSqlProgramAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group__1__Impl"


    // $ANTLR start "rule__SqlProgram__Group_1__0"
    // InternalSqlDsl.g:655:1: rule__SqlProgram__Group_1__0 : rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 ;
    public final void rule__SqlProgram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:659:1: ( rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 )
            // InternalSqlDsl.g:660:2: rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SqlProgram__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group_1__0"


    // $ANTLR start "rule__SqlProgram__Group_1__0__Impl"
    // InternalSqlDsl.g:667:1: rule__SqlProgram__Group_1__0__Impl : ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) ;
    public final void rule__SqlProgram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:671:1: ( ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) )
            // InternalSqlDsl.g:672:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            {
            // InternalSqlDsl.g:672:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            // InternalSqlDsl.g:673:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesAssignment_1_0()); 
            // InternalSqlDsl.g:674:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            // InternalSqlDsl.g:674:3: rule__SqlProgram__QueriesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__QueriesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSqlProgramAccess().getQueriesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group_1__0__Impl"


    // $ANTLR start "rule__SqlProgram__Group_1__1"
    // InternalSqlDsl.g:682:1: rule__SqlProgram__Group_1__1 : rule__SqlProgram__Group_1__1__Impl ;
    public final void rule__SqlProgram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:686:1: ( rule__SqlProgram__Group_1__1__Impl )
            // InternalSqlDsl.g:687:2: rule__SqlProgram__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group_1__1"


    // $ANTLR start "rule__SqlProgram__Group_1__1__Impl"
    // InternalSqlDsl.g:693:1: rule__SqlProgram__Group_1__1__Impl : ( ';' ) ;
    public final void rule__SqlProgram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:697:1: ( ( ';' ) )
            // InternalSqlDsl.g:698:1: ( ';' )
            {
            // InternalSqlDsl.g:698:1: ( ';' )
            // InternalSqlDsl.g:699:2: ';'
            {
             before(grammarAccess.getSqlProgramAccess().getSemicolonKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__Group_1__1__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // InternalSqlDsl.g:709:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:713:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalSqlDsl.g:714:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // InternalSqlDsl.g:721:1: rule__Selection__Group__0__Impl : ( () ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:725:1: ( ( () ) )
            // InternalSqlDsl.g:726:1: ( () )
            {
            // InternalSqlDsl.g:726:1: ( () )
            // InternalSqlDsl.g:727:2: ()
            {
             before(grammarAccess.getSelectionAccess().getSelectionAction_0()); 
            // InternalSqlDsl.g:728:2: ()
            // InternalSqlDsl.g:728:3: 
            {
            }

             after(grammarAccess.getSelectionAccess().getSelectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // InternalSqlDsl.g:736:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:740:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // InternalSqlDsl.g:741:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Selection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // InternalSqlDsl.g:748:1: rule__Selection__Group__1__Impl : ( 'SELECT' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:752:1: ( ( 'SELECT' ) )
            // InternalSqlDsl.g:753:1: ( 'SELECT' )
            {
            // InternalSqlDsl.g:753:1: ( 'SELECT' )
            // InternalSqlDsl.g:754:2: 'SELECT'
            {
             before(grammarAccess.getSelectionAccess().getSELECTKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getSELECTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // InternalSqlDsl.g:763:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:767:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // InternalSqlDsl.g:768:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Selection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // InternalSqlDsl.g:775:1: rule__Selection__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:779:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:780:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:780:1: ( 'FROM' )
            // InternalSqlDsl.g:781:2: 'FROM'
            {
             before(grammarAccess.getSelectionAccess().getFROMKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getFROMKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__3"
    // InternalSqlDsl.g:790:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:794:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // InternalSqlDsl.g:795:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Selection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3"


    // $ANTLR start "rule__Selection__Group__3__Impl"
    // InternalSqlDsl.g:802:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__ObjectsAssignment_3 ) ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:806:1: ( ( ( rule__Selection__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:807:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:807:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:808:2: ( rule__Selection__ObjectsAssignment_3 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:809:2: ( rule__Selection__ObjectsAssignment_3 )
            // InternalSqlDsl.g:809:3: rule__Selection__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getObjectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3__Impl"


    // $ANTLR start "rule__Selection__Group__4"
    // InternalSqlDsl.g:817:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:821:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // InternalSqlDsl.g:822:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Selection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4"


    // $ANTLR start "rule__Selection__Group__4__Impl"
    // InternalSqlDsl.g:829:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:833:1: ( ( ( rule__Selection__Group_4__0 )* ) )
            // InternalSqlDsl.g:834:1: ( ( rule__Selection__Group_4__0 )* )
            {
            // InternalSqlDsl.g:834:1: ( ( rule__Selection__Group_4__0 )* )
            // InternalSqlDsl.g:835:2: ( rule__Selection__Group_4__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // InternalSqlDsl.g:836:2: ( rule__Selection__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSqlDsl.g:836:3: rule__Selection__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Selection__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__5"
    // InternalSqlDsl.g:844:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:848:1: ( rule__Selection__Group__5__Impl )
            // InternalSqlDsl.g:849:2: rule__Selection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5"


    // $ANTLR start "rule__Selection__Group__5__Impl"
    // InternalSqlDsl.g:855:1: rule__Selection__Group__5__Impl : ( ( rule__Selection__ClausesAssignment_5 )* ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:859:1: ( ( ( rule__Selection__ClausesAssignment_5 )* ) )
            // InternalSqlDsl.g:860:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            {
            // InternalSqlDsl.g:860:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            // InternalSqlDsl.g:861:2: ( rule__Selection__ClausesAssignment_5 )*
            {
             before(grammarAccess.getSelectionAccess().getClausesAssignment_5()); 
            // InternalSqlDsl.g:862:2: ( rule__Selection__ClausesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSqlDsl.g:862:3: rule__Selection__ClausesAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Selection__ClausesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getClausesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5__Impl"


    // $ANTLR start "rule__Selection__Group_4__0"
    // InternalSqlDsl.g:871:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:875:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // InternalSqlDsl.g:876:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Selection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__0"


    // $ANTLR start "rule__Selection__Group_4__0__Impl"
    // InternalSqlDsl.g:883:1: rule__Selection__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:887:1: ( ( ',' ) )
            // InternalSqlDsl.g:888:1: ( ',' )
            {
            // InternalSqlDsl.g:888:1: ( ',' )
            // InternalSqlDsl.g:889:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__0__Impl"


    // $ANTLR start "rule__Selection__Group_4__1"
    // InternalSqlDsl.g:898:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:902:1: ( rule__Selection__Group_4__1__Impl )
            // InternalSqlDsl.g:903:2: rule__Selection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__1"


    // $ANTLR start "rule__Selection__Group_4__1__Impl"
    // InternalSqlDsl.g:909:1: rule__Selection__Group_4__1__Impl : ( ( rule__Selection__ObjectsAssignment_4_1 ) ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:913:1: ( ( ( rule__Selection__ObjectsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:914:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:914:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            // InternalSqlDsl.g:915:2: ( rule__Selection__ObjectsAssignment_4_1 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_4_1()); 
            // InternalSqlDsl.g:916:2: ( rule__Selection__ObjectsAssignment_4_1 )
            // InternalSqlDsl.g:916:3: rule__Selection__ObjectsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ObjectsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getObjectsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_4__1__Impl"


    // $ANTLR start "rule__Creation__Group__0"
    // InternalSqlDsl.g:925:1: rule__Creation__Group__0 : rule__Creation__Group__0__Impl rule__Creation__Group__1 ;
    public final void rule__Creation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:929:1: ( rule__Creation__Group__0__Impl rule__Creation__Group__1 )
            // InternalSqlDsl.g:930:2: rule__Creation__Group__0__Impl rule__Creation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Creation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__0"


    // $ANTLR start "rule__Creation__Group__0__Impl"
    // InternalSqlDsl.g:937:1: rule__Creation__Group__0__Impl : ( () ) ;
    public final void rule__Creation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:941:1: ( ( () ) )
            // InternalSqlDsl.g:942:1: ( () )
            {
            // InternalSqlDsl.g:942:1: ( () )
            // InternalSqlDsl.g:943:2: ()
            {
             before(grammarAccess.getCreationAccess().getCreationAction_0()); 
            // InternalSqlDsl.g:944:2: ()
            // InternalSqlDsl.g:944:3: 
            {
            }

             after(grammarAccess.getCreationAccess().getCreationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__0__Impl"


    // $ANTLR start "rule__Creation__Group__1"
    // InternalSqlDsl.g:952:1: rule__Creation__Group__1 : rule__Creation__Group__1__Impl rule__Creation__Group__2 ;
    public final void rule__Creation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:956:1: ( rule__Creation__Group__1__Impl rule__Creation__Group__2 )
            // InternalSqlDsl.g:957:2: rule__Creation__Group__1__Impl rule__Creation__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Creation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__1"


    // $ANTLR start "rule__Creation__Group__1__Impl"
    // InternalSqlDsl.g:964:1: rule__Creation__Group__1__Impl : ( 'CREATE' ) ;
    public final void rule__Creation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:968:1: ( ( 'CREATE' ) )
            // InternalSqlDsl.g:969:1: ( 'CREATE' )
            {
            // InternalSqlDsl.g:969:1: ( 'CREATE' )
            // InternalSqlDsl.g:970:2: 'CREATE'
            {
             before(grammarAccess.getCreationAccess().getCREATEKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getCREATEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__1__Impl"


    // $ANTLR start "rule__Creation__Group__2"
    // InternalSqlDsl.g:979:1: rule__Creation__Group__2 : rule__Creation__Group__2__Impl ;
    public final void rule__Creation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:983:1: ( rule__Creation__Group__2__Impl )
            // InternalSqlDsl.g:984:2: rule__Creation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__2"


    // $ANTLR start "rule__Creation__Group__2__Impl"
    // InternalSqlDsl.g:990:1: rule__Creation__Group__2__Impl : ( ( rule__Creation__Alternatives_2 ) ) ;
    public final void rule__Creation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:994:1: ( ( ( rule__Creation__Alternatives_2 ) ) )
            // InternalSqlDsl.g:995:1: ( ( rule__Creation__Alternatives_2 ) )
            {
            // InternalSqlDsl.g:995:1: ( ( rule__Creation__Alternatives_2 ) )
            // InternalSqlDsl.g:996:2: ( rule__Creation__Alternatives_2 )
            {
             before(grammarAccess.getCreationAccess().getAlternatives_2()); 
            // InternalSqlDsl.g:997:2: ( rule__Creation__Alternatives_2 )
            // InternalSqlDsl.g:997:3: rule__Creation__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group__2__Impl"


    // $ANTLR start "rule__Creation__Group_2_0__0"
    // InternalSqlDsl.g:1006:1: rule__Creation__Group_2_0__0 : rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 ;
    public final void rule__Creation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1010:1: ( rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 )
            // InternalSqlDsl.g:1011:2: rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Creation__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__0"


    // $ANTLR start "rule__Creation__Group_2_0__0__Impl"
    // InternalSqlDsl.g:1018:1: rule__Creation__Group_2_0__0__Impl : ( ( rule__Creation__TypeAssignment_2_0_0 ) ) ;
    public final void rule__Creation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1022:1: ( ( ( rule__Creation__TypeAssignment_2_0_0 ) ) )
            // InternalSqlDsl.g:1023:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            {
            // InternalSqlDsl.g:1023:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            // InternalSqlDsl.g:1024:2: ( rule__Creation__TypeAssignment_2_0_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_0_0()); 
            // InternalSqlDsl.g:1025:2: ( rule__Creation__TypeAssignment_2_0_0 )
            // InternalSqlDsl.g:1025:3: rule__Creation__TypeAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Creation__TypeAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getTypeAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__0__Impl"


    // $ANTLR start "rule__Creation__Group_2_0__1"
    // InternalSqlDsl.g:1033:1: rule__Creation__Group_2_0__1 : rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 ;
    public final void rule__Creation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1037:1: ( rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 )
            // InternalSqlDsl.g:1038:2: rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__1"


    // $ANTLR start "rule__Creation__Group_2_0__1__Impl"
    // InternalSqlDsl.g:1045:1: rule__Creation__Group_2_0__1__Impl : ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) ;
    public final void rule__Creation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1049:1: ( ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) )
            // InternalSqlDsl.g:1050:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            {
            // InternalSqlDsl.g:1050:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            // InternalSqlDsl.g:1051:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_0_1()); 
            // InternalSqlDsl.g:1052:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            // InternalSqlDsl.g:1052:3: rule__Creation__ObjectsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ObjectsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getObjectsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__1__Impl"


    // $ANTLR start "rule__Creation__Group_2_0__2"
    // InternalSqlDsl.g:1060:1: rule__Creation__Group_2_0__2 : rule__Creation__Group_2_0__2__Impl ;
    public final void rule__Creation__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1064:1: ( rule__Creation__Group_2_0__2__Impl )
            // InternalSqlDsl.g:1065:2: rule__Creation__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__2"


    // $ANTLR start "rule__Creation__Group_2_0__2__Impl"
    // InternalSqlDsl.g:1071:1: rule__Creation__Group_2_0__2__Impl : ( ( rule__Creation__Group_2_0_2__0 )? ) ;
    public final void rule__Creation__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1075:1: ( ( ( rule__Creation__Group_2_0_2__0 )? ) )
            // InternalSqlDsl.g:1076:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            {
            // InternalSqlDsl.g:1076:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            // InternalSqlDsl.g:1077:2: ( rule__Creation__Group_2_0_2__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2()); 
            // InternalSqlDsl.g:1078:2: ( rule__Creation__Group_2_0_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSqlDsl.g:1078:3: rule__Creation__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_2_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0__2__Impl"


    // $ANTLR start "rule__Creation__Group_2_0_2__0"
    // InternalSqlDsl.g:1087:1: rule__Creation__Group_2_0_2__0 : rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 ;
    public final void rule__Creation__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1091:1: ( rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 )
            // InternalSqlDsl.g:1092:2: rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Creation__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2__0"


    // $ANTLR start "rule__Creation__Group_2_0_2__0__Impl"
    // InternalSqlDsl.g:1099:1: rule__Creation__Group_2_0_2__0__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) ;
    public final void rule__Creation__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1103:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) )
            // InternalSqlDsl.g:1104:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            {
            // InternalSqlDsl.g:1104:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            // InternalSqlDsl.g:1105:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_0()); 
            // InternalSqlDsl.g:1106:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            // InternalSqlDsl.g:1106:3: rule__Creation__ConstaintsAssignment_2_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ConstaintsAssignment_2_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__Creation__Group_2_0_2__1"
    // InternalSqlDsl.g:1114:1: rule__Creation__Group_2_0_2__1 : rule__Creation__Group_2_0_2__1__Impl ;
    public final void rule__Creation__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1118:1: ( rule__Creation__Group_2_0_2__1__Impl )
            // InternalSqlDsl.g:1119:2: rule__Creation__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2__1"


    // $ANTLR start "rule__Creation__Group_2_0_2__1__Impl"
    // InternalSqlDsl.g:1125:1: rule__Creation__Group_2_0_2__1__Impl : ( ( rule__Creation__Group_2_0_2_1__0 )* ) ;
    public final void rule__Creation__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1129:1: ( ( ( rule__Creation__Group_2_0_2_1__0 )* ) )
            // InternalSqlDsl.g:1130:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            {
            // InternalSqlDsl.g:1130:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            // InternalSqlDsl.g:1131:2: ( rule__Creation__Group_2_0_2_1__0 )*
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2_1()); 
            // InternalSqlDsl.g:1132:2: ( rule__Creation__Group_2_0_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:1132:3: rule__Creation__Group_2_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Creation__Group_2_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCreationAccess().getGroup_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Creation__Group_2_0_2_1__0"
    // InternalSqlDsl.g:1141:1: rule__Creation__Group_2_0_2_1__0 : rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 ;
    public final void rule__Creation__Group_2_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1145:1: ( rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 )
            // InternalSqlDsl.g:1146:2: rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group_2_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2_1__0"


    // $ANTLR start "rule__Creation__Group_2_0_2_1__0__Impl"
    // InternalSqlDsl.g:1153:1: rule__Creation__Group_2_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Creation__Group_2_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1157:1: ( ( ',' ) )
            // InternalSqlDsl.g:1158:1: ( ',' )
            {
            // InternalSqlDsl.g:1158:1: ( ',' )
            // InternalSqlDsl.g:1159:2: ','
            {
             before(grammarAccess.getCreationAccess().getCommaKeyword_2_0_2_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getCommaKeyword_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2_1__0__Impl"


    // $ANTLR start "rule__Creation__Group_2_0_2_1__1"
    // InternalSqlDsl.g:1168:1: rule__Creation__Group_2_0_2_1__1 : rule__Creation__Group_2_0_2_1__1__Impl ;
    public final void rule__Creation__Group_2_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1172:1: ( rule__Creation__Group_2_0_2_1__1__Impl )
            // InternalSqlDsl.g:1173:2: rule__Creation__Group_2_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2_1__1"


    // $ANTLR start "rule__Creation__Group_2_0_2_1__1__Impl"
    // InternalSqlDsl.g:1179:1: rule__Creation__Group_2_0_2_1__1__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) ;
    public final void rule__Creation__Group_2_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1183:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) )
            // InternalSqlDsl.g:1184:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            {
            // InternalSqlDsl.g:1184:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            // InternalSqlDsl.g:1185:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_1_1()); 
            // InternalSqlDsl.g:1186:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            // InternalSqlDsl.g:1186:3: rule__Creation__ConstaintsAssignment_2_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ConstaintsAssignment_2_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_0_2_1__1__Impl"


    // $ANTLR start "rule__Creation__Group_2_1__0"
    // InternalSqlDsl.g:1195:1: rule__Creation__Group_2_1__0 : rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 ;
    public final void rule__Creation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1199:1: ( rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 )
            // InternalSqlDsl.g:1200:2: rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Creation__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__0"


    // $ANTLR start "rule__Creation__Group_2_1__0__Impl"
    // InternalSqlDsl.g:1207:1: rule__Creation__Group_2_1__0__Impl : ( ( rule__Creation__TypeAssignment_2_1_0 ) ) ;
    public final void rule__Creation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1211:1: ( ( ( rule__Creation__TypeAssignment_2_1_0 ) ) )
            // InternalSqlDsl.g:1212:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            {
            // InternalSqlDsl.g:1212:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            // InternalSqlDsl.g:1213:2: ( rule__Creation__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_1_0()); 
            // InternalSqlDsl.g:1214:2: ( rule__Creation__TypeAssignment_2_1_0 )
            // InternalSqlDsl.g:1214:3: rule__Creation__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Creation__TypeAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getTypeAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__0__Impl"


    // $ANTLR start "rule__Creation__Group_2_1__1"
    // InternalSqlDsl.g:1222:1: rule__Creation__Group_2_1__1 : rule__Creation__Group_2_1__1__Impl ;
    public final void rule__Creation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1226:1: ( rule__Creation__Group_2_1__1__Impl )
            // InternalSqlDsl.g:1227:2: rule__Creation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__1"


    // $ANTLR start "rule__Creation__Group_2_1__1__Impl"
    // InternalSqlDsl.g:1233:1: rule__Creation__Group_2_1__1__Impl : ( ( rule__Creation__ObjectsAssignment_2_1_1 ) ) ;
    public final void rule__Creation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1237:1: ( ( ( rule__Creation__ObjectsAssignment_2_1_1 ) ) )
            // InternalSqlDsl.g:1238:1: ( ( rule__Creation__ObjectsAssignment_2_1_1 ) )
            {
            // InternalSqlDsl.g:1238:1: ( ( rule__Creation__ObjectsAssignment_2_1_1 ) )
            // InternalSqlDsl.g:1239:2: ( rule__Creation__ObjectsAssignment_2_1_1 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_1()); 
            // InternalSqlDsl.g:1240:2: ( rule__Creation__ObjectsAssignment_2_1_1 )
            // InternalSqlDsl.g:1240:3: rule__Creation__ObjectsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ObjectsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__1__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalSqlDsl.g:1249:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1253:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalSqlDsl.g:1254:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // InternalSqlDsl.g:1261:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1265:1: ( ( () ) )
            // InternalSqlDsl.g:1266:1: ( () )
            {
            // InternalSqlDsl.g:1266:1: ( () )
            // InternalSqlDsl.g:1267:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalSqlDsl.g:1268:2: ()
            // InternalSqlDsl.g:1268:3: 
            {
            }

             after(grammarAccess.getUpdateAccess().getUpdateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // InternalSqlDsl.g:1276:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1280:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalSqlDsl.g:1281:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // InternalSqlDsl.g:1288:1: rule__Update__Group__1__Impl : ( 'UPDATE' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1292:1: ( ( 'UPDATE' ) )
            // InternalSqlDsl.g:1293:1: ( 'UPDATE' )
            {
            // InternalSqlDsl.g:1293:1: ( 'UPDATE' )
            // InternalSqlDsl.g:1294:2: 'UPDATE'
            {
             before(grammarAccess.getUpdateAccess().getUPDATEKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getUPDATEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // InternalSqlDsl.g:1303:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1307:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalSqlDsl.g:1308:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Update__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // InternalSqlDsl.g:1315:1: rule__Update__Group__2__Impl : ( ( rule__Update__ObjectsAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1319:1: ( ( ( rule__Update__ObjectsAssignment_2 ) ) )
            // InternalSqlDsl.g:1320:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            {
            // InternalSqlDsl.g:1320:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            // InternalSqlDsl.g:1321:2: ( rule__Update__ObjectsAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getObjectsAssignment_2()); 
            // InternalSqlDsl.g:1322:2: ( rule__Update__ObjectsAssignment_2 )
            // InternalSqlDsl.g:1322:3: rule__Update__ObjectsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__ObjectsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getObjectsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Update__Group__3"
    // InternalSqlDsl.g:1330:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1334:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalSqlDsl.g:1335:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Update__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3"


    // $ANTLR start "rule__Update__Group__3__Impl"
    // InternalSqlDsl.g:1342:1: rule__Update__Group__3__Impl : ( ( rule__Update__ClausesAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1346:1: ( ( ( rule__Update__ClausesAssignment_3 ) ) )
            // InternalSqlDsl.g:1347:1: ( ( rule__Update__ClausesAssignment_3 ) )
            {
            // InternalSqlDsl.g:1347:1: ( ( rule__Update__ClausesAssignment_3 ) )
            // InternalSqlDsl.g:1348:2: ( rule__Update__ClausesAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_3()); 
            // InternalSqlDsl.g:1349:2: ( rule__Update__ClausesAssignment_3 )
            // InternalSqlDsl.g:1349:3: rule__Update__ClausesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Update__ClausesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getClausesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__4"
    // InternalSqlDsl.g:1357:1: rule__Update__Group__4 : rule__Update__Group__4__Impl ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1361:1: ( rule__Update__Group__4__Impl )
            // InternalSqlDsl.g:1362:2: rule__Update__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4"


    // $ANTLR start "rule__Update__Group__4__Impl"
    // InternalSqlDsl.g:1368:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1372:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalSqlDsl.g:1373:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalSqlDsl.g:1373:1: ( ( rule__Update__Group_4__0 )* )
            // InternalSqlDsl.g:1374:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalSqlDsl.g:1375:2: ( rule__Update__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSqlDsl.g:1375:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Update__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4__Impl"


    // $ANTLR start "rule__Update__Group_4__0"
    // InternalSqlDsl.g:1384:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1388:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalSqlDsl.g:1389:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Update__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_4__0"


    // $ANTLR start "rule__Update__Group_4__0__Impl"
    // InternalSqlDsl.g:1396:1: rule__Update__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1400:1: ( ( ',' ) )
            // InternalSqlDsl.g:1401:1: ( ',' )
            {
            // InternalSqlDsl.g:1401:1: ( ',' )
            // InternalSqlDsl.g:1402:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_4__0__Impl"


    // $ANTLR start "rule__Update__Group_4__1"
    // InternalSqlDsl.g:1411:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1415:1: ( rule__Update__Group_4__1__Impl )
            // InternalSqlDsl.g:1416:2: rule__Update__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_4__1"


    // $ANTLR start "rule__Update__Group_4__1__Impl"
    // InternalSqlDsl.g:1422:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__ClausesAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1426:1: ( ( ( rule__Update__ClausesAssignment_4_1 ) ) )
            // InternalSqlDsl.g:1427:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:1427:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            // InternalSqlDsl.g:1428:2: ( rule__Update__ClausesAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_4_1()); 
            // InternalSqlDsl.g:1429:2: ( rule__Update__ClausesAssignment_4_1 )
            // InternalSqlDsl.g:1429:3: rule__Update__ClausesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__ClausesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getClausesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group_4__1__Impl"


    // $ANTLR start "rule__Insertion__Group__0"
    // InternalSqlDsl.g:1438:1: rule__Insertion__Group__0 : rule__Insertion__Group__0__Impl rule__Insertion__Group__1 ;
    public final void rule__Insertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1442:1: ( rule__Insertion__Group__0__Impl rule__Insertion__Group__1 )
            // InternalSqlDsl.g:1443:2: rule__Insertion__Group__0__Impl rule__Insertion__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Insertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__0"


    // $ANTLR start "rule__Insertion__Group__0__Impl"
    // InternalSqlDsl.g:1450:1: rule__Insertion__Group__0__Impl : ( () ) ;
    public final void rule__Insertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1454:1: ( ( () ) )
            // InternalSqlDsl.g:1455:1: ( () )
            {
            // InternalSqlDsl.g:1455:1: ( () )
            // InternalSqlDsl.g:1456:2: ()
            {
             before(grammarAccess.getInsertionAccess().getInsertionAction_0()); 
            // InternalSqlDsl.g:1457:2: ()
            // InternalSqlDsl.g:1457:3: 
            {
            }

             after(grammarAccess.getInsertionAccess().getInsertionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__0__Impl"


    // $ANTLR start "rule__Insertion__Group__1"
    // InternalSqlDsl.g:1465:1: rule__Insertion__Group__1 : rule__Insertion__Group__1__Impl rule__Insertion__Group__2 ;
    public final void rule__Insertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1469:1: ( rule__Insertion__Group__1__Impl rule__Insertion__Group__2 )
            // InternalSqlDsl.g:1470:2: rule__Insertion__Group__1__Impl rule__Insertion__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Insertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__1"


    // $ANTLR start "rule__Insertion__Group__1__Impl"
    // InternalSqlDsl.g:1477:1: rule__Insertion__Group__1__Impl : ( 'INSERT' ) ;
    public final void rule__Insertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1481:1: ( ( 'INSERT' ) )
            // InternalSqlDsl.g:1482:1: ( 'INSERT' )
            {
            // InternalSqlDsl.g:1482:1: ( 'INSERT' )
            // InternalSqlDsl.g:1483:2: 'INSERT'
            {
             before(grammarAccess.getInsertionAccess().getINSERTKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getINSERTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__1__Impl"


    // $ANTLR start "rule__Insertion__Group__2"
    // InternalSqlDsl.g:1492:1: rule__Insertion__Group__2 : rule__Insertion__Group__2__Impl rule__Insertion__Group__3 ;
    public final void rule__Insertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1496:1: ( rule__Insertion__Group__2__Impl rule__Insertion__Group__3 )
            // InternalSqlDsl.g:1497:2: rule__Insertion__Group__2__Impl rule__Insertion__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Insertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__2"


    // $ANTLR start "rule__Insertion__Group__2__Impl"
    // InternalSqlDsl.g:1504:1: rule__Insertion__Group__2__Impl : ( 'INTO' ) ;
    public final void rule__Insertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1508:1: ( ( 'INTO' ) )
            // InternalSqlDsl.g:1509:1: ( 'INTO' )
            {
            // InternalSqlDsl.g:1509:1: ( 'INTO' )
            // InternalSqlDsl.g:1510:2: 'INTO'
            {
             before(grammarAccess.getInsertionAccess().getINTOKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getINTOKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__2__Impl"


    // $ANTLR start "rule__Insertion__Group__3"
    // InternalSqlDsl.g:1519:1: rule__Insertion__Group__3 : rule__Insertion__Group__3__Impl rule__Insertion__Group__4 ;
    public final void rule__Insertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1523:1: ( rule__Insertion__Group__3__Impl rule__Insertion__Group__4 )
            // InternalSqlDsl.g:1524:2: rule__Insertion__Group__3__Impl rule__Insertion__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Insertion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__3"


    // $ANTLR start "rule__Insertion__Group__3__Impl"
    // InternalSqlDsl.g:1531:1: rule__Insertion__Group__3__Impl : ( ( rule__Insertion__ObjectsAssignment_3 ) ) ;
    public final void rule__Insertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1535:1: ( ( ( rule__Insertion__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1536:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1536:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1537:2: ( rule__Insertion__ObjectsAssignment_3 )
            {
             before(grammarAccess.getInsertionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1538:2: ( rule__Insertion__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1538:3: rule__Insertion__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getObjectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__3__Impl"


    // $ANTLR start "rule__Insertion__Group__4"
    // InternalSqlDsl.g:1546:1: rule__Insertion__Group__4 : rule__Insertion__Group__4__Impl rule__Insertion__Group__5 ;
    public final void rule__Insertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1550:1: ( rule__Insertion__Group__4__Impl rule__Insertion__Group__5 )
            // InternalSqlDsl.g:1551:2: rule__Insertion__Group__4__Impl rule__Insertion__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Insertion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__4"


    // $ANTLR start "rule__Insertion__Group__4__Impl"
    // InternalSqlDsl.g:1558:1: rule__Insertion__Group__4__Impl : ( ( rule__Insertion__ValuesAssignment_4 ) ) ;
    public final void rule__Insertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1562:1: ( ( ( rule__Insertion__ValuesAssignment_4 ) ) )
            // InternalSqlDsl.g:1563:1: ( ( rule__Insertion__ValuesAssignment_4 ) )
            {
            // InternalSqlDsl.g:1563:1: ( ( rule__Insertion__ValuesAssignment_4 ) )
            // InternalSqlDsl.g:1564:2: ( rule__Insertion__ValuesAssignment_4 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_4()); 
            // InternalSqlDsl.g:1565:2: ( rule__Insertion__ValuesAssignment_4 )
            // InternalSqlDsl.g:1565:3: rule__Insertion__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__4__Impl"


    // $ANTLR start "rule__Insertion__Group__5"
    // InternalSqlDsl.g:1573:1: rule__Insertion__Group__5 : rule__Insertion__Group__5__Impl ;
    public final void rule__Insertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1577:1: ( rule__Insertion__Group__5__Impl )
            // InternalSqlDsl.g:1578:2: rule__Insertion__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__5"


    // $ANTLR start "rule__Insertion__Group__5__Impl"
    // InternalSqlDsl.g:1584:1: rule__Insertion__Group__5__Impl : ( ( rule__Insertion__Group_5__0 )* ) ;
    public final void rule__Insertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1588:1: ( ( ( rule__Insertion__Group_5__0 )* ) )
            // InternalSqlDsl.g:1589:1: ( ( rule__Insertion__Group_5__0 )* )
            {
            // InternalSqlDsl.g:1589:1: ( ( rule__Insertion__Group_5__0 )* )
            // InternalSqlDsl.g:1590:2: ( rule__Insertion__Group_5__0 )*
            {
             before(grammarAccess.getInsertionAccess().getGroup_5()); 
            // InternalSqlDsl.g:1591:2: ( rule__Insertion__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqlDsl.g:1591:3: rule__Insertion__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Insertion__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInsertionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__5__Impl"


    // $ANTLR start "rule__Insertion__Group_5__0"
    // InternalSqlDsl.g:1600:1: rule__Insertion__Group_5__0 : rule__Insertion__Group_5__0__Impl rule__Insertion__Group_5__1 ;
    public final void rule__Insertion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1604:1: ( rule__Insertion__Group_5__0__Impl rule__Insertion__Group_5__1 )
            // InternalSqlDsl.g:1605:2: rule__Insertion__Group_5__0__Impl rule__Insertion__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Insertion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_5__0"


    // $ANTLR start "rule__Insertion__Group_5__0__Impl"
    // InternalSqlDsl.g:1612:1: rule__Insertion__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Insertion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1616:1: ( ( ',' ) )
            // InternalSqlDsl.g:1617:1: ( ',' )
            {
            // InternalSqlDsl.g:1617:1: ( ',' )
            // InternalSqlDsl.g:1618:2: ','
            {
             before(grammarAccess.getInsertionAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_5__0__Impl"


    // $ANTLR start "rule__Insertion__Group_5__1"
    // InternalSqlDsl.g:1627:1: rule__Insertion__Group_5__1 : rule__Insertion__Group_5__1__Impl ;
    public final void rule__Insertion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1631:1: ( rule__Insertion__Group_5__1__Impl )
            // InternalSqlDsl.g:1632:2: rule__Insertion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_5__1"


    // $ANTLR start "rule__Insertion__Group_5__1__Impl"
    // InternalSqlDsl.g:1638:1: rule__Insertion__Group_5__1__Impl : ( ( rule__Insertion__ValuesAssignment_5_1 ) ) ;
    public final void rule__Insertion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1642:1: ( ( ( rule__Insertion__ValuesAssignment_5_1 ) ) )
            // InternalSqlDsl.g:1643:1: ( ( rule__Insertion__ValuesAssignment_5_1 ) )
            {
            // InternalSqlDsl.g:1643:1: ( ( rule__Insertion__ValuesAssignment_5_1 ) )
            // InternalSqlDsl.g:1644:2: ( rule__Insertion__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_5_1()); 
            // InternalSqlDsl.g:1645:2: ( rule__Insertion__ValuesAssignment_5_1 )
            // InternalSqlDsl.g:1645:3: rule__Insertion__ValuesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_5__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalSqlDsl.g:1654:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1658:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalSqlDsl.g:1659:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalSqlDsl.g:1666:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1670:1: ( ( () ) )
            // InternalSqlDsl.g:1671:1: ( () )
            {
            // InternalSqlDsl.g:1671:1: ( () )
            // InternalSqlDsl.g:1672:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalSqlDsl.g:1673:2: ()
            // InternalSqlDsl.g:1673:3: 
            {
            }

             after(grammarAccess.getDeleteAccess().getDeleteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalSqlDsl.g:1681:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1685:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalSqlDsl.g:1686:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalSqlDsl.g:1693:1: rule__Delete__Group__1__Impl : ( 'DELETE' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1697:1: ( ( 'DELETE' ) )
            // InternalSqlDsl.g:1698:1: ( 'DELETE' )
            {
            // InternalSqlDsl.g:1698:1: ( 'DELETE' )
            // InternalSqlDsl.g:1699:2: 'DELETE'
            {
             before(grammarAccess.getDeleteAccess().getDELETEKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDELETEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // InternalSqlDsl.g:1708:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1712:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalSqlDsl.g:1713:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Delete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // InternalSqlDsl.g:1720:1: rule__Delete__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1724:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:1725:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:1725:1: ( 'FROM' )
            // InternalSqlDsl.g:1726:2: 'FROM'
            {
             before(grammarAccess.getDeleteAccess().getFROMKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getFROMKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__Delete__Group__3"
    // InternalSqlDsl.g:1735:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1739:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalSqlDsl.g:1740:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Delete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3"


    // $ANTLR start "rule__Delete__Group__3__Impl"
    // InternalSqlDsl.g:1747:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__ObjectsAssignment_3 ) ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1751:1: ( ( ( rule__Delete__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1752:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1752:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1753:2: ( rule__Delete__ObjectsAssignment_3 )
            {
             before(grammarAccess.getDeleteAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1754:2: ( rule__Delete__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1754:3: rule__Delete__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getObjectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__4"
    // InternalSqlDsl.g:1762:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1766:1: ( rule__Delete__Group__4__Impl )
            // InternalSqlDsl.g:1767:2: rule__Delete__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4"


    // $ANTLR start "rule__Delete__Group__4__Impl"
    // InternalSqlDsl.g:1773:1: rule__Delete__Group__4__Impl : ( ( rule__Delete__Group_4__0 )? ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1777:1: ( ( ( rule__Delete__Group_4__0 )? ) )
            // InternalSqlDsl.g:1778:1: ( ( rule__Delete__Group_4__0 )? )
            {
            // InternalSqlDsl.g:1778:1: ( ( rule__Delete__Group_4__0 )? )
            // InternalSqlDsl.g:1779:2: ( rule__Delete__Group_4__0 )?
            {
             before(grammarAccess.getDeleteAccess().getGroup_4()); 
            // InternalSqlDsl.g:1780:2: ( rule__Delete__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlDsl.g:1780:3: rule__Delete__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Delete__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeleteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4__Impl"


    // $ANTLR start "rule__Delete__Group_4__0"
    // InternalSqlDsl.g:1789:1: rule__Delete__Group_4__0 : rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 ;
    public final void rule__Delete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1793:1: ( rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 )
            // InternalSqlDsl.g:1794:2: rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Delete__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4__0"


    // $ANTLR start "rule__Delete__Group_4__0__Impl"
    // InternalSqlDsl.g:1801:1: rule__Delete__Group_4__0__Impl : ( ( rule__Delete__ClausesAssignment_4_0 ) ) ;
    public final void rule__Delete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1805:1: ( ( ( rule__Delete__ClausesAssignment_4_0 ) ) )
            // InternalSqlDsl.g:1806:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            {
            // InternalSqlDsl.g:1806:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            // InternalSqlDsl.g:1807:2: ( rule__Delete__ClausesAssignment_4_0 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_0()); 
            // InternalSqlDsl.g:1808:2: ( rule__Delete__ClausesAssignment_4_0 )
            // InternalSqlDsl.g:1808:3: rule__Delete__ClausesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ClausesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getClausesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4__0__Impl"


    // $ANTLR start "rule__Delete__Group_4__1"
    // InternalSqlDsl.g:1816:1: rule__Delete__Group_4__1 : rule__Delete__Group_4__1__Impl ;
    public final void rule__Delete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1820:1: ( rule__Delete__Group_4__1__Impl )
            // InternalSqlDsl.g:1821:2: rule__Delete__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4__1"


    // $ANTLR start "rule__Delete__Group_4__1__Impl"
    // InternalSqlDsl.g:1827:1: rule__Delete__Group_4__1__Impl : ( ( rule__Delete__Group_4_1__0 )* ) ;
    public final void rule__Delete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1831:1: ( ( ( rule__Delete__Group_4_1__0 )* ) )
            // InternalSqlDsl.g:1832:1: ( ( rule__Delete__Group_4_1__0 )* )
            {
            // InternalSqlDsl.g:1832:1: ( ( rule__Delete__Group_4_1__0 )* )
            // InternalSqlDsl.g:1833:2: ( rule__Delete__Group_4_1__0 )*
            {
             before(grammarAccess.getDeleteAccess().getGroup_4_1()); 
            // InternalSqlDsl.g:1834:2: ( rule__Delete__Group_4_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSqlDsl.g:1834:3: rule__Delete__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Delete__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDeleteAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4__1__Impl"


    // $ANTLR start "rule__Delete__Group_4_1__0"
    // InternalSqlDsl.g:1843:1: rule__Delete__Group_4_1__0 : rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 ;
    public final void rule__Delete__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1847:1: ( rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 )
            // InternalSqlDsl.g:1848:2: rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Delete__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4_1__0"


    // $ANTLR start "rule__Delete__Group_4_1__0__Impl"
    // InternalSqlDsl.g:1855:1: rule__Delete__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Delete__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1859:1: ( ( ',' ) )
            // InternalSqlDsl.g:1860:1: ( ',' )
            {
            // InternalSqlDsl.g:1860:1: ( ',' )
            // InternalSqlDsl.g:1861:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4_1__0__Impl"


    // $ANTLR start "rule__Delete__Group_4_1__1"
    // InternalSqlDsl.g:1870:1: rule__Delete__Group_4_1__1 : rule__Delete__Group_4_1__1__Impl ;
    public final void rule__Delete__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1874:1: ( rule__Delete__Group_4_1__1__Impl )
            // InternalSqlDsl.g:1875:2: rule__Delete__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4_1__1"


    // $ANTLR start "rule__Delete__Group_4_1__1__Impl"
    // InternalSqlDsl.g:1881:1: rule__Delete__Group_4_1__1__Impl : ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) ;
    public final void rule__Delete__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1885:1: ( ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) )
            // InternalSqlDsl.g:1886:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            {
            // InternalSqlDsl.g:1886:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            // InternalSqlDsl.g:1887:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_1_1()); 
            // InternalSqlDsl.g:1888:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            // InternalSqlDsl.g:1888:3: rule__Delete__ClausesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ClausesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getClausesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group_4_1__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSqlDsl.g:1897:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1901:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSqlDsl.g:1902:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalSqlDsl.g:1909:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1913:1: ( ( () ) )
            // InternalSqlDsl.g:1914:1: ( () )
            {
            // InternalSqlDsl.g:1914:1: ( () )
            // InternalSqlDsl.g:1915:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalSqlDsl.g:1916:2: ()
            // InternalSqlDsl.g:1916:3: 
            {
            }

             after(grammarAccess.getTableAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalSqlDsl.g:1924:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1928:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSqlDsl.g:1929:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalSqlDsl.g:1936:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1940:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:1941:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:1941:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSqlDsl.g:1942:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:1943:2: ( rule__Table__NameAssignment_1 )
            // InternalSqlDsl.g:1943:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalSqlDsl.g:1951:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1955:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSqlDsl.g:1956:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalSqlDsl.g:1963:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1967:1: ( ( '{' ) )
            // InternalSqlDsl.g:1968:1: ( '{' )
            {
            // InternalSqlDsl.g:1968:1: ( '{' )
            // InternalSqlDsl.g:1969:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalSqlDsl.g:1978:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1982:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSqlDsl.g:1983:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalSqlDsl.g:1990:1: rule__Table__Group__3__Impl : ( ( rule__Table__Group_3__0 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1994:1: ( ( ( rule__Table__Group_3__0 )? ) )
            // InternalSqlDsl.g:1995:1: ( ( rule__Table__Group_3__0 )? )
            {
            // InternalSqlDsl.g:1995:1: ( ( rule__Table__Group_3__0 )? )
            // InternalSqlDsl.g:1996:2: ( rule__Table__Group_3__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_3()); 
            // InternalSqlDsl.g:1997:2: ( rule__Table__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSqlDsl.g:1997:3: rule__Table__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalSqlDsl.g:2005:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2009:1: ( rule__Table__Group__4__Impl )
            // InternalSqlDsl.g:2010:2: rule__Table__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalSqlDsl.g:2016:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2020:1: ( ( '}' ) )
            // InternalSqlDsl.g:2021:1: ( '}' )
            {
            // InternalSqlDsl.g:2021:1: ( '}' )
            // InternalSqlDsl.g:2022:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group_3__0"
    // InternalSqlDsl.g:2032:1: rule__Table__Group_3__0 : rule__Table__Group_3__0__Impl rule__Table__Group_3__1 ;
    public final void rule__Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2036:1: ( rule__Table__Group_3__0__Impl rule__Table__Group_3__1 )
            // InternalSqlDsl.g:2037:2: rule__Table__Group_3__0__Impl rule__Table__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Table__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__0"


    // $ANTLR start "rule__Table__Group_3__0__Impl"
    // InternalSqlDsl.g:2044:1: rule__Table__Group_3__0__Impl : ( ( rule__Table__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2048:1: ( ( ( rule__Table__ColumnsAssignment_3_0 ) ) )
            // InternalSqlDsl.g:2049:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:2049:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            // InternalSqlDsl.g:2050:2: ( rule__Table__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_0()); 
            // InternalSqlDsl.g:2051:2: ( rule__Table__ColumnsAssignment_3_0 )
            // InternalSqlDsl.g:2051:3: rule__Table__ColumnsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__0__Impl"


    // $ANTLR start "rule__Table__Group_3__1"
    // InternalSqlDsl.g:2059:1: rule__Table__Group_3__1 : rule__Table__Group_3__1__Impl ;
    public final void rule__Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2063:1: ( rule__Table__Group_3__1__Impl )
            // InternalSqlDsl.g:2064:2: rule__Table__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__1"


    // $ANTLR start "rule__Table__Group_3__1__Impl"
    // InternalSqlDsl.g:2070:1: rule__Table__Group_3__1__Impl : ( ( rule__Table__Group_3_1__0 )* ) ;
    public final void rule__Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2074:1: ( ( ( rule__Table__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:2075:1: ( ( rule__Table__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:2075:1: ( ( rule__Table__Group_3_1__0 )* )
            // InternalSqlDsl.g:2076:2: ( rule__Table__Group_3_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:2077:2: ( rule__Table__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSqlDsl.g:2077:3: rule__Table__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Table__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3__1__Impl"


    // $ANTLR start "rule__Table__Group_3_1__0"
    // InternalSqlDsl.g:2086:1: rule__Table__Group_3_1__0 : rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 ;
    public final void rule__Table__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2090:1: ( rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 )
            // InternalSqlDsl.g:2091:2: rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3_1__0"


    // $ANTLR start "rule__Table__Group_3_1__0__Impl"
    // InternalSqlDsl.g:2098:1: rule__Table__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2102:1: ( ( ',' ) )
            // InternalSqlDsl.g:2103:1: ( ',' )
            {
            // InternalSqlDsl.g:2103:1: ( ',' )
            // InternalSqlDsl.g:2104:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3_1__0__Impl"


    // $ANTLR start "rule__Table__Group_3_1__1"
    // InternalSqlDsl.g:2113:1: rule__Table__Group_3_1__1 : rule__Table__Group_3_1__1__Impl ;
    public final void rule__Table__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2117:1: ( rule__Table__Group_3_1__1__Impl )
            // InternalSqlDsl.g:2118:2: rule__Table__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3_1__1"


    // $ANTLR start "rule__Table__Group_3_1__1__Impl"
    // InternalSqlDsl.g:2124:1: rule__Table__Group_3_1__1__Impl : ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Table__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2128:1: ( ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:2129:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:2129:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            // InternalSqlDsl.g:2130:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_1_1()); 
            // InternalSqlDsl.g:2131:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            // InternalSqlDsl.g:2131:3: rule__Table__ColumnsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_3_1__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalSqlDsl.g:2140:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2144:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSqlDsl.g:2145:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalSqlDsl.g:2152:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2156:1: ( ( () ) )
            // InternalSqlDsl.g:2157:1: ( () )
            {
            // InternalSqlDsl.g:2157:1: ( () )
            // InternalSqlDsl.g:2158:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:2159:2: ()
            // InternalSqlDsl.g:2159:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalSqlDsl.g:2167:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2171:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSqlDsl.g:2172:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalSqlDsl.g:2179:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2183:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2184:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2184:1: ( ( rule__Column__NameAssignment_1 ) )
            // InternalSqlDsl.g:2185:2: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2186:2: ( rule__Column__NameAssignment_1 )
            // InternalSqlDsl.g:2186:3: rule__Column__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalSqlDsl.g:2194:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2198:1: ( rule__Column__Group__2__Impl )
            // InternalSqlDsl.g:2199:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalSqlDsl.g:2205:1: rule__Column__Group__2__Impl : ( ( rule__Column__TypeAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2209:1: ( ( ( rule__Column__TypeAssignment_2 )? ) )
            // InternalSqlDsl.g:2210:1: ( ( rule__Column__TypeAssignment_2 )? )
            {
            // InternalSqlDsl.g:2210:1: ( ( rule__Column__TypeAssignment_2 )? )
            // InternalSqlDsl.g:2211:2: ( rule__Column__TypeAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_2()); 
            // InternalSqlDsl.g:2212:2: ( rule__Column__TypeAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSqlDsl.g:2212:3: rule__Column__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Clause__Group__0"
    // InternalSqlDsl.g:2221:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2225:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalSqlDsl.g:2226:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0"


    // $ANTLR start "rule__Clause__Group__0__Impl"
    // InternalSqlDsl.g:2233:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__NameAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2237:1: ( ( ( rule__Clause__NameAssignment_0 ) ) )
            // InternalSqlDsl.g:2238:1: ( ( rule__Clause__NameAssignment_0 ) )
            {
            // InternalSqlDsl.g:2238:1: ( ( rule__Clause__NameAssignment_0 ) )
            // InternalSqlDsl.g:2239:2: ( rule__Clause__NameAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getNameAssignment_0()); 
            // InternalSqlDsl.g:2240:2: ( rule__Clause__NameAssignment_0 )
            // InternalSqlDsl.g:2240:3: rule__Clause__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__0__Impl"


    // $ANTLR start "rule__Clause__Group__1"
    // InternalSqlDsl.g:2248:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2252:1: ( rule__Clause__Group__1__Impl )
            // InternalSqlDsl.g:2253:2: rule__Clause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1"


    // $ANTLR start "rule__Clause__Group__1__Impl"
    // InternalSqlDsl.g:2259:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__BodyAssignment_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2263:1: ( ( ( rule__Clause__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:2264:1: ( ( rule__Clause__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:2264:1: ( ( rule__Clause__BodyAssignment_1 ) )
            // InternalSqlDsl.g:2265:2: ( rule__Clause__BodyAssignment_1 )
            {
             before(grammarAccess.getClauseAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:2266:2: ( rule__Clause__BodyAssignment_1 )
            // InternalSqlDsl.g:2266:3: rule__Clause__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clause__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Group__1__Impl"


    // $ANTLR start "rule__Constaint__Group__0"
    // InternalSqlDsl.g:2275:1: rule__Constaint__Group__0 : rule__Constaint__Group__0__Impl rule__Constaint__Group__1 ;
    public final void rule__Constaint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2279:1: ( rule__Constaint__Group__0__Impl rule__Constaint__Group__1 )
            // InternalSqlDsl.g:2280:2: rule__Constaint__Group__0__Impl rule__Constaint__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Constaint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constaint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constaint__Group__0"


    // $ANTLR start "rule__Constaint__Group__0__Impl"
    // InternalSqlDsl.g:2287:1: rule__Constaint__Group__0__Impl : ( 'CONSTRAINT' ) ;
    public final void rule__Constaint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2291:1: ( ( 'CONSTRAINT' ) )
            // InternalSqlDsl.g:2292:1: ( 'CONSTRAINT' )
            {
            // InternalSqlDsl.g:2292:1: ( 'CONSTRAINT' )
            // InternalSqlDsl.g:2293:2: 'CONSTRAINT'
            {
             before(grammarAccess.getConstaintAccess().getCONSTRAINTKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstaintAccess().getCONSTRAINTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constaint__Group__0__Impl"


    // $ANTLR start "rule__Constaint__Group__1"
    // InternalSqlDsl.g:2302:1: rule__Constaint__Group__1 : rule__Constaint__Group__1__Impl ;
    public final void rule__Constaint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2306:1: ( rule__Constaint__Group__1__Impl )
            // InternalSqlDsl.g:2307:2: rule__Constaint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constaint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constaint__Group__1"


    // $ANTLR start "rule__Constaint__Group__1__Impl"
    // InternalSqlDsl.g:2313:1: rule__Constaint__Group__1__Impl : ( ( rule__Constaint__BodyAssignment_1 ) ) ;
    public final void rule__Constaint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2317:1: ( ( ( rule__Constaint__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:2318:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:2318:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            // InternalSqlDsl.g:2319:2: ( rule__Constaint__BodyAssignment_1 )
            {
             before(grammarAccess.getConstaintAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:2320:2: ( rule__Constaint__BodyAssignment_1 )
            // InternalSqlDsl.g:2320:3: rule__Constaint__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constaint__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstaintAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constaint__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalSqlDsl.g:2329:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2333:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSqlDsl.g:2334:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Value__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0"


    // $ANTLR start "rule__Value__Group__0__Impl"
    // InternalSqlDsl.g:2341:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2345:1: ( ( () ) )
            // InternalSqlDsl.g:2346:1: ( () )
            {
            // InternalSqlDsl.g:2346:1: ( () )
            // InternalSqlDsl.g:2347:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSqlDsl.g:2348:2: ()
            // InternalSqlDsl.g:2348:3: 
            {
            }

             after(grammarAccess.getValueAccess().getValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__0__Impl"


    // $ANTLR start "rule__Value__Group__1"
    // InternalSqlDsl.g:2356:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2360:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalSqlDsl.g:2361:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Value__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1"


    // $ANTLR start "rule__Value__Group__1__Impl"
    // InternalSqlDsl.g:2368:1: rule__Value__Group__1__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2372:1: ( ( 'Value' ) )
            // InternalSqlDsl.g:2373:1: ( 'Value' )
            {
            // InternalSqlDsl.g:2373:1: ( 'Value' )
            // InternalSqlDsl.g:2374:2: 'Value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__1__Impl"


    // $ANTLR start "rule__Value__Group__2"
    // InternalSqlDsl.g:2383:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2387:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalSqlDsl.g:2388:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Value__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2"


    // $ANTLR start "rule__Value__Group__2__Impl"
    // InternalSqlDsl.g:2395:1: rule__Value__Group__2__Impl : ( '(' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2399:1: ( ( '(' ) )
            // InternalSqlDsl.g:2400:1: ( '(' )
            {
            // InternalSqlDsl.g:2400:1: ( '(' )
            // InternalSqlDsl.g:2401:2: '('
            {
             before(grammarAccess.getValueAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__2__Impl"


    // $ANTLR start "rule__Value__Group__3"
    // InternalSqlDsl.g:2410:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2414:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalSqlDsl.g:2415:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Value__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3"


    // $ANTLR start "rule__Value__Group__3__Impl"
    // InternalSqlDsl.g:2422:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2426:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalSqlDsl.g:2427:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2427:1: ( ( rule__Value__Group_3__0 )? )
            // InternalSqlDsl.g:2428:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalSqlDsl.g:2429:2: ( rule__Value__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSqlDsl.g:2429:3: rule__Value__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__3__Impl"


    // $ANTLR start "rule__Value__Group__4"
    // InternalSqlDsl.g:2437:1: rule__Value__Group__4 : rule__Value__Group__4__Impl ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2441:1: ( rule__Value__Group__4__Impl )
            // InternalSqlDsl.g:2442:2: rule__Value__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__4"


    // $ANTLR start "rule__Value__Group__4__Impl"
    // InternalSqlDsl.g:2448:1: rule__Value__Group__4__Impl : ( ')' ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2452:1: ( ( ')' ) )
            // InternalSqlDsl.g:2453:1: ( ')' )
            {
            // InternalSqlDsl.g:2453:1: ( ')' )
            // InternalSqlDsl.g:2454:2: ')'
            {
             before(grammarAccess.getValueAccess().getRightParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group__4__Impl"


    // $ANTLR start "rule__Value__Group_3__0"
    // InternalSqlDsl.g:2464:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2468:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalSqlDsl.g:2469:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Value__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0"


    // $ANTLR start "rule__Value__Group_3__0__Impl"
    // InternalSqlDsl.g:2476:1: rule__Value__Group_3__0__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2480:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) )
            // InternalSqlDsl.g:2481:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:2481:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            // InternalSqlDsl.g:2482:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_0()); 
            // InternalSqlDsl.g:2483:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            // InternalSqlDsl.g:2483:3: rule__Value__ColumnvaluesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__ColumnvaluesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3__1"
    // InternalSqlDsl.g:2491:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2495:1: ( rule__Value__Group_3__1__Impl )
            // InternalSqlDsl.g:2496:2: rule__Value__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1"


    // $ANTLR start "rule__Value__Group_3__1__Impl"
    // InternalSqlDsl.g:2502:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__Group_3_1__0 )* ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2506:1: ( ( ( rule__Value__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:2507:1: ( ( rule__Value__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:2507:1: ( ( rule__Value__Group_3_1__0 )* )
            // InternalSqlDsl.g:2508:2: ( rule__Value__Group_3_1__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:2509:2: ( rule__Value__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSqlDsl.g:2509:3: rule__Value__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Value__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1__Impl"


    // $ANTLR start "rule__Value__Group_3_1__0"
    // InternalSqlDsl.g:2518:1: rule__Value__Group_3_1__0 : rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 ;
    public final void rule__Value__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2522:1: ( rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 )
            // InternalSqlDsl.g:2523:2: rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Value__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3_1__0"


    // $ANTLR start "rule__Value__Group_3_1__0__Impl"
    // InternalSqlDsl.g:2530:1: rule__Value__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Value__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2534:1: ( ( ',' ) )
            // InternalSqlDsl.g:2535:1: ( ',' )
            {
            // InternalSqlDsl.g:2535:1: ( ',' )
            // InternalSqlDsl.g:2536:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3_1__0__Impl"


    // $ANTLR start "rule__Value__Group_3_1__1"
    // InternalSqlDsl.g:2545:1: rule__Value__Group_3_1__1 : rule__Value__Group_3_1__1__Impl ;
    public final void rule__Value__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2549:1: ( rule__Value__Group_3_1__1__Impl )
            // InternalSqlDsl.g:2550:2: rule__Value__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3_1__1"


    // $ANTLR start "rule__Value__Group_3_1__1__Impl"
    // InternalSqlDsl.g:2556:1: rule__Value__Group_3_1__1__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) ;
    public final void rule__Value__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2560:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:2561:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:2561:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            // InternalSqlDsl.g:2562:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_1_1()); 
            // InternalSqlDsl.g:2563:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            // InternalSqlDsl.g:2563:3: rule__Value__ColumnvaluesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ColumnvaluesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3_1__1__Impl"


    // $ANTLR start "rule__ColumnValue__Group__0"
    // InternalSqlDsl.g:2572:1: rule__ColumnValue__Group__0 : rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 ;
    public final void rule__ColumnValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2576:1: ( rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 )
            // InternalSqlDsl.g:2577:2: rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ColumnValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__0"


    // $ANTLR start "rule__ColumnValue__Group__0__Impl"
    // InternalSqlDsl.g:2584:1: rule__ColumnValue__Group__0__Impl : ( () ) ;
    public final void rule__ColumnValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2588:1: ( ( () ) )
            // InternalSqlDsl.g:2589:1: ( () )
            {
            // InternalSqlDsl.g:2589:1: ( () )
            // InternalSqlDsl.g:2590:2: ()
            {
             before(grammarAccess.getColumnValueAccess().getColumnValueAction_0()); 
            // InternalSqlDsl.g:2591:2: ()
            // InternalSqlDsl.g:2591:3: 
            {
            }

             after(grammarAccess.getColumnValueAccess().getColumnValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__0__Impl"


    // $ANTLR start "rule__ColumnValue__Group__1"
    // InternalSqlDsl.g:2599:1: rule__ColumnValue__Group__1 : rule__ColumnValue__Group__1__Impl ;
    public final void rule__ColumnValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2603:1: ( rule__ColumnValue__Group__1__Impl )
            // InternalSqlDsl.g:2604:2: rule__ColumnValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__1"


    // $ANTLR start "rule__ColumnValue__Group__1__Impl"
    // InternalSqlDsl.g:2610:1: rule__ColumnValue__Group__1__Impl : ( ( rule__ColumnValue__ValueAssignment_1 ) ) ;
    public final void rule__ColumnValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2614:1: ( ( ( rule__ColumnValue__ValueAssignment_1 ) ) )
            // InternalSqlDsl.g:2615:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            {
            // InternalSqlDsl.g:2615:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            // InternalSqlDsl.g:2616:2: ( rule__ColumnValue__ValueAssignment_1 )
            {
             before(grammarAccess.getColumnValueAccess().getValueAssignment_1()); 
            // InternalSqlDsl.g:2617:2: ( rule__ColumnValue__ValueAssignment_1 )
            // InternalSqlDsl.g:2617:3: rule__ColumnValue__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__1__Impl"


    // $ANTLR start "rule__ComplexString__Group__0"
    // InternalSqlDsl.g:2626:1: rule__ComplexString__Group__0 : rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 ;
    public final void rule__ComplexString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2630:1: ( rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 )
            // InternalSqlDsl.g:2631:2: rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ComplexString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__0"


    // $ANTLR start "rule__ComplexString__Group__0__Impl"
    // InternalSqlDsl.g:2638:1: rule__ComplexString__Group__0__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2642:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:2643:1: ( ruleEString )
            {
            // InternalSqlDsl.g:2643:1: ( ruleEString )
            // InternalSqlDsl.g:2644:2: ruleEString
            {
             before(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__0__Impl"


    // $ANTLR start "rule__ComplexString__Group__1"
    // InternalSqlDsl.g:2653:1: rule__ComplexString__Group__1 : rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 ;
    public final void rule__ComplexString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2657:1: ( rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 )
            // InternalSqlDsl.g:2658:2: rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ComplexString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__1"


    // $ANTLR start "rule__ComplexString__Group__1__Impl"
    // InternalSqlDsl.g:2665:1: rule__ComplexString__Group__1__Impl : ( ( rule__ComplexString__Group_1__0 )* ) ;
    public final void rule__ComplexString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2669:1: ( ( ( rule__ComplexString__Group_1__0 )* ) )
            // InternalSqlDsl.g:2670:1: ( ( rule__ComplexString__Group_1__0 )* )
            {
            // InternalSqlDsl.g:2670:1: ( ( rule__ComplexString__Group_1__0 )* )
            // InternalSqlDsl.g:2671:2: ( rule__ComplexString__Group_1__0 )*
            {
             before(grammarAccess.getComplexStringAccess().getGroup_1()); 
            // InternalSqlDsl.g:2672:2: ( rule__ComplexString__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=41 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSqlDsl.g:2672:3: rule__ComplexString__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ComplexString__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComplexStringAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__1__Impl"


    // $ANTLR start "rule__ComplexString__Group__2"
    // InternalSqlDsl.g:2680:1: rule__ComplexString__Group__2 : rule__ComplexString__Group__2__Impl ;
    public final void rule__ComplexString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2684:1: ( rule__ComplexString__Group__2__Impl )
            // InternalSqlDsl.g:2685:2: rule__ComplexString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__2"


    // $ANTLR start "rule__ComplexString__Group__2__Impl"
    // InternalSqlDsl.g:2691:1: rule__ComplexString__Group__2__Impl : ( ( '()' )? ) ;
    public final void rule__ComplexString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2695:1: ( ( ( '()' )? ) )
            // InternalSqlDsl.g:2696:1: ( ( '()' )? )
            {
            // InternalSqlDsl.g:2696:1: ( ( '()' )? )
            // InternalSqlDsl.g:2697:2: ( '()' )?
            {
             before(grammarAccess.getComplexStringAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            // InternalSqlDsl.g:2698:2: ( '()' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSqlDsl.g:2698:3: '()'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getLeftParenthesisRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group__2__Impl"


    // $ANTLR start "rule__ComplexString__Group_1__0"
    // InternalSqlDsl.g:2707:1: rule__ComplexString__Group_1__0 : rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 ;
    public final void rule__ComplexString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2711:1: ( rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 )
            // InternalSqlDsl.g:2712:2: rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ComplexString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__0"


    // $ANTLR start "rule__ComplexString__Group_1__0__Impl"
    // InternalSqlDsl.g:2719:1: rule__ComplexString__Group_1__0__Impl : ( ( '.' )? ) ;
    public final void rule__ComplexString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2723:1: ( ( ( '.' )? ) )
            // InternalSqlDsl.g:2724:1: ( ( '.' )? )
            {
            // InternalSqlDsl.g:2724:1: ( ( '.' )? )
            // InternalSqlDsl.g:2725:2: ( '.' )?
            {
             before(grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0()); 
            // InternalSqlDsl.g:2726:2: ( '.' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSqlDsl.g:2726:3: '.'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__0__Impl"


    // $ANTLR start "rule__ComplexString__Group_1__1"
    // InternalSqlDsl.g:2734:1: rule__ComplexString__Group_1__1 : rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 ;
    public final void rule__ComplexString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2738:1: ( rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 )
            // InternalSqlDsl.g:2739:2: rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__ComplexString__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__1"


    // $ANTLR start "rule__ComplexString__Group_1__1__Impl"
    // InternalSqlDsl.g:2746:1: rule__ComplexString__Group_1__1__Impl : ( ( '*' )? ) ;
    public final void rule__ComplexString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2750:1: ( ( ( '*' )? ) )
            // InternalSqlDsl.g:2751:1: ( ( '*' )? )
            {
            // InternalSqlDsl.g:2751:1: ( ( '*' )? )
            // InternalSqlDsl.g:2752:2: ( '*' )?
            {
             before(grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1()); 
            // InternalSqlDsl.g:2753:2: ( '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSqlDsl.g:2753:3: '*'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__1__Impl"


    // $ANTLR start "rule__ComplexString__Group_1__2"
    // InternalSqlDsl.g:2761:1: rule__ComplexString__Group_1__2 : rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 ;
    public final void rule__ComplexString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2765:1: ( rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 )
            // InternalSqlDsl.g:2766:2: rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__ComplexString__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__2"


    // $ANTLR start "rule__ComplexString__Group_1__2__Impl"
    // InternalSqlDsl.g:2773:1: rule__ComplexString__Group_1__2__Impl : ( ( '=' )? ) ;
    public final void rule__ComplexString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2777:1: ( ( ( '=' )? ) )
            // InternalSqlDsl.g:2778:1: ( ( '=' )? )
            {
            // InternalSqlDsl.g:2778:1: ( ( '=' )? )
            // InternalSqlDsl.g:2779:2: ( '=' )?
            {
             before(grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2()); 
            // InternalSqlDsl.g:2780:2: ( '=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSqlDsl.g:2780:3: '='
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__2__Impl"


    // $ANTLR start "rule__ComplexString__Group_1__3"
    // InternalSqlDsl.g:2788:1: rule__ComplexString__Group_1__3 : rule__ComplexString__Group_1__3__Impl ;
    public final void rule__ComplexString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2792:1: ( rule__ComplexString__Group_1__3__Impl )
            // InternalSqlDsl.g:2793:2: rule__ComplexString__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__3"


    // $ANTLR start "rule__ComplexString__Group_1__3__Impl"
    // InternalSqlDsl.g:2799:1: rule__ComplexString__Group_1__3__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2803:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:2804:1: ( ruleEString )
            {
            // InternalSqlDsl.g:2804:1: ( ruleEString )
            // InternalSqlDsl.g:2805:2: ruleEString
            {
             before(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_3()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__3__Impl"


    // $ANTLR start "rule__SqlProgram__QueriesAssignment_1_0"
    // InternalSqlDsl.g:2815:1: rule__SqlProgram__QueriesAssignment_1_0 : ( ruleQueries ) ;
    public final void rule__SqlProgram__QueriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2819:1: ( ( ruleQueries ) )
            // InternalSqlDsl.g:2820:2: ( ruleQueries )
            {
            // InternalSqlDsl.g:2820:2: ( ruleQueries )
            // InternalSqlDsl.g:2821:3: ruleQueries
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SqlProgram__QueriesAssignment_1_0"


    // $ANTLR start "rule__Selection__ObjectsAssignment_3"
    // InternalSqlDsl.g:2830:1: rule__Selection__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2834:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:2835:2: ( ruleTable )
            {
            // InternalSqlDsl.g:2835:2: ( ruleTable )
            // InternalSqlDsl.g:2836:3: ruleTable
            {
             before(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__ObjectsAssignment_3"


    // $ANTLR start "rule__Selection__ObjectsAssignment_4_1"
    // InternalSqlDsl.g:2845:1: rule__Selection__ObjectsAssignment_4_1 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2849:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:2850:2: ( ruleTable )
            {
            // InternalSqlDsl.g:2850:2: ( ruleTable )
            // InternalSqlDsl.g:2851:3: ruleTable
            {
             before(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__ObjectsAssignment_4_1"


    // $ANTLR start "rule__Selection__ClausesAssignment_5"
    // InternalSqlDsl.g:2860:1: rule__Selection__ClausesAssignment_5 : ( ruleClause ) ;
    public final void rule__Selection__ClausesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2864:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:2865:2: ( ruleClause )
            {
            // InternalSqlDsl.g:2865:2: ( ruleClause )
            // InternalSqlDsl.g:2866:3: ruleClause
            {
             before(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__ClausesAssignment_5"


    // $ANTLR start "rule__Creation__TypeAssignment_2_0_0"
    // InternalSqlDsl.g:2875:1: rule__Creation__TypeAssignment_2_0_0 : ( ( 'TABLE' ) ) ;
    public final void rule__Creation__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2879:1: ( ( ( 'TABLE' ) ) )
            // InternalSqlDsl.g:2880:2: ( ( 'TABLE' ) )
            {
            // InternalSqlDsl.g:2880:2: ( ( 'TABLE' ) )
            // InternalSqlDsl.g:2881:3: ( 'TABLE' )
            {
             before(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 
            // InternalSqlDsl.g:2882:3: ( 'TABLE' )
            // InternalSqlDsl.g:2883:4: 'TABLE'
            {
             before(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__TypeAssignment_2_0_0"


    // $ANTLR start "rule__Creation__ObjectsAssignment_2_0_1"
    // InternalSqlDsl.g:2894:1: rule__Creation__ObjectsAssignment_2_0_1 : ( ruleTable ) ;
    public final void rule__Creation__ObjectsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2898:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:2899:2: ( ruleTable )
            {
            // InternalSqlDsl.g:2899:2: ( ruleTable )
            // InternalSqlDsl.g:2900:3: ruleTable
            {
             before(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__ObjectsAssignment_2_0_1"


    // $ANTLR start "rule__Creation__ConstaintsAssignment_2_0_2_0"
    // InternalSqlDsl.g:2909:1: rule__Creation__ConstaintsAssignment_2_0_2_0 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2913:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:2914:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:2914:2: ( ruleConstaint )
            // InternalSqlDsl.g:2915:3: ruleConstaint
            {
             before(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstaint();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__ConstaintsAssignment_2_0_2_0"


    // $ANTLR start "rule__Creation__ConstaintsAssignment_2_0_2_1_1"
    // InternalSqlDsl.g:2924:1: rule__Creation__ConstaintsAssignment_2_0_2_1_1 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2928:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:2929:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:2929:2: ( ruleConstaint )
            // InternalSqlDsl.g:2930:3: ruleConstaint
            {
             before(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstaint();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__ConstaintsAssignment_2_0_2_1_1"


    // $ANTLR start "rule__Creation__TypeAssignment_2_1_0"
    // InternalSqlDsl.g:2939:1: rule__Creation__TypeAssignment_2_1_0 : ( ( 'INDEX' ) ) ;
    public final void rule__Creation__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2943:1: ( ( ( 'INDEX' ) ) )
            // InternalSqlDsl.g:2944:2: ( ( 'INDEX' ) )
            {
            // InternalSqlDsl.g:2944:2: ( ( 'INDEX' ) )
            // InternalSqlDsl.g:2945:3: ( 'INDEX' )
            {
             before(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 
            // InternalSqlDsl.g:2946:3: ( 'INDEX' )
            // InternalSqlDsl.g:2947:4: 'INDEX'
            {
             before(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__TypeAssignment_2_1_0"


    // $ANTLR start "rule__Creation__ObjectsAssignment_2_1_1"
    // InternalSqlDsl.g:2958:1: rule__Creation__ObjectsAssignment_2_1_1 : ( ruleTable ) ;
    public final void rule__Creation__ObjectsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2962:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:2963:2: ( ruleTable )
            {
            // InternalSqlDsl.g:2963:2: ( ruleTable )
            // InternalSqlDsl.g:2964:3: ruleTable
            {
             before(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__ObjectsAssignment_2_1_1"


    // $ANTLR start "rule__Update__ObjectsAssignment_2"
    // InternalSqlDsl.g:2973:1: rule__Update__ObjectsAssignment_2 : ( ruleTable ) ;
    public final void rule__Update__ObjectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2977:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:2978:2: ( ruleTable )
            {
            // InternalSqlDsl.g:2978:2: ( ruleTable )
            // InternalSqlDsl.g:2979:3: ruleTable
            {
             before(grammarAccess.getUpdateAccess().getObjectsTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getObjectsTableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__ObjectsAssignment_2"


    // $ANTLR start "rule__Update__ClausesAssignment_3"
    // InternalSqlDsl.g:2988:1: rule__Update__ClausesAssignment_3 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2992:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:2993:2: ( ruleClause )
            {
            // InternalSqlDsl.g:2993:2: ( ruleClause )
            // InternalSqlDsl.g:2994:3: ruleClause
            {
             before(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__ClausesAssignment_3"


    // $ANTLR start "rule__Update__ClausesAssignment_4_1"
    // InternalSqlDsl.g:3003:1: rule__Update__ClausesAssignment_4_1 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3007:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3008:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3008:2: ( ruleClause )
            // InternalSqlDsl.g:3009:3: ruleClause
            {
             before(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__ClausesAssignment_4_1"


    // $ANTLR start "rule__Insertion__ObjectsAssignment_3"
    // InternalSqlDsl.g:3018:1: rule__Insertion__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Insertion__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3022:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3023:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3023:2: ( ruleTable )
            // InternalSqlDsl.g:3024:3: ruleTable
            {
             before(grammarAccess.getInsertionAccess().getObjectsTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getObjectsTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__ObjectsAssignment_3"


    // $ANTLR start "rule__Insertion__ValuesAssignment_4"
    // InternalSqlDsl.g:3033:1: rule__Insertion__ValuesAssignment_4 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3037:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:3038:2: ( ruleValue )
            {
            // InternalSqlDsl.g:3038:2: ( ruleValue )
            // InternalSqlDsl.g:3039:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__ValuesAssignment_4"


    // $ANTLR start "rule__Insertion__ValuesAssignment_5_1"
    // InternalSqlDsl.g:3048:1: rule__Insertion__ValuesAssignment_5_1 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3052:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:3053:2: ( ruleValue )
            {
            // InternalSqlDsl.g:3053:2: ( ruleValue )
            // InternalSqlDsl.g:3054:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__ValuesAssignment_5_1"


    // $ANTLR start "rule__Delete__ObjectsAssignment_3"
    // InternalSqlDsl.g:3063:1: rule__Delete__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Delete__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3067:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3068:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3068:2: ( ruleTable )
            // InternalSqlDsl.g:3069:3: ruleTable
            {
             before(grammarAccess.getDeleteAccess().getObjectsTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getObjectsTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__ObjectsAssignment_3"


    // $ANTLR start "rule__Delete__ClausesAssignment_4_0"
    // InternalSqlDsl.g:3078:1: rule__Delete__ClausesAssignment_4_0 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3082:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3083:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3083:2: ( ruleClause )
            // InternalSqlDsl.g:3084:3: ruleClause
            {
             before(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__ClausesAssignment_4_0"


    // $ANTLR start "rule__Delete__ClausesAssignment_4_1_1"
    // InternalSqlDsl.g:3093:1: rule__Delete__ClausesAssignment_4_1_1 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3097:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3098:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3098:2: ( ruleClause )
            // InternalSqlDsl.g:3099:3: ruleClause
            {
             before(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__ClausesAssignment_4_1_1"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalSqlDsl.g:3108:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3112:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3113:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3113:2: ( ruleEString )
            // InternalSqlDsl.g:3114:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_3_0"
    // InternalSqlDsl.g:3123:1: rule__Table__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3127:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:3128:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:3128:2: ( ruleColumn )
            // InternalSqlDsl.g:3129:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_3_0"


    // $ANTLR start "rule__Table__ColumnsAssignment_3_1_1"
    // InternalSqlDsl.g:3138:1: rule__Table__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3142:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:3143:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:3143:2: ( ruleColumn )
            // InternalSqlDsl.g:3144:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_3_1_1"


    // $ANTLR start "rule__Column__NameAssignment_1"
    // InternalSqlDsl.g:3153:1: rule__Column__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3157:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3158:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3158:2: ( ruleEString )
            // InternalSqlDsl.g:3159:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_1"


    // $ANTLR start "rule__Column__TypeAssignment_2"
    // InternalSqlDsl.g:3168:1: rule__Column__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Column__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3172:1: ( ( ( ruleEString ) ) )
            // InternalSqlDsl.g:3173:2: ( ( ruleEString ) )
            {
            // InternalSqlDsl.g:3173:2: ( ( ruleEString ) )
            // InternalSqlDsl.g:3174:3: ( ruleEString )
            {
             before(grammarAccess.getColumnAccess().getTypeTypeCrossReference_2_0()); 
            // InternalSqlDsl.g:3175:3: ( ruleEString )
            // InternalSqlDsl.g:3176:4: ruleEString
            {
             before(grammarAccess.getColumnAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getColumnAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_2"


    // $ANTLR start "rule__Clause__NameAssignment_0"
    // InternalSqlDsl.g:3187:1: rule__Clause__NameAssignment_0 : ( ( rule__Clause__NameAlternatives_0_0 ) ) ;
    public final void rule__Clause__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3191:1: ( ( ( rule__Clause__NameAlternatives_0_0 ) ) )
            // InternalSqlDsl.g:3192:2: ( ( rule__Clause__NameAlternatives_0_0 ) )
            {
            // InternalSqlDsl.g:3192:2: ( ( rule__Clause__NameAlternatives_0_0 ) )
            // InternalSqlDsl.g:3193:3: ( rule__Clause__NameAlternatives_0_0 )
            {
             before(grammarAccess.getClauseAccess().getNameAlternatives_0_0()); 
            // InternalSqlDsl.g:3194:3: ( rule__Clause__NameAlternatives_0_0 )
            // InternalSqlDsl.g:3194:4: rule__Clause__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getNameAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__NameAssignment_0"


    // $ANTLR start "rule__Clause__BodyAssignment_1"
    // InternalSqlDsl.g:3202:1: rule__Clause__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Clause__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3206:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:3207:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:3207:2: ( ruleComplexString )
            // InternalSqlDsl.g:3208:3: ruleComplexString
            {
             before(grammarAccess.getClauseAccess().getBodyComplexStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexString();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getBodyComplexStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__BodyAssignment_1"


    // $ANTLR start "rule__Constaint__BodyAssignment_1"
    // InternalSqlDsl.g:3217:1: rule__Constaint__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Constaint__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3221:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:3222:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:3222:2: ( ruleComplexString )
            // InternalSqlDsl.g:3223:3: ruleComplexString
            {
             before(grammarAccess.getConstaintAccess().getBodyComplexStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexString();

            state._fsp--;

             after(grammarAccess.getConstaintAccess().getBodyComplexStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constaint__BodyAssignment_1"


    // $ANTLR start "rule__Value__ColumnvaluesAssignment_3_0"
    // InternalSqlDsl.g:3232:1: rule__Value__ColumnvaluesAssignment_3_0 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3236:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:3237:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:3237:2: ( ruleColumnValue )
            // InternalSqlDsl.g:3238:3: ruleColumnValue
            {
             before(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ColumnvaluesAssignment_3_0"


    // $ANTLR start "rule__Value__ColumnvaluesAssignment_3_1_1"
    // InternalSqlDsl.g:3247:1: rule__Value__ColumnvaluesAssignment_3_1_1 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3251:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:3252:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:3252:2: ( ruleColumnValue )
            // InternalSqlDsl.g:3253:3: ruleColumnValue
            {
             before(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ColumnvaluesAssignment_3_1_1"


    // $ANTLR start "rule__ColumnValue__ValueAssignment_1"
    // InternalSqlDsl.g:3262:1: rule__ColumnValue__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3266:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3267:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3267:2: ( ruleEString )
            // InternalSqlDsl.g:3268:3: ruleEString
            {
             before(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000002E4000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000002E4000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000011FFF800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FFF802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001FFF800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000F0000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000E0000000032L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E0000000030L});

}
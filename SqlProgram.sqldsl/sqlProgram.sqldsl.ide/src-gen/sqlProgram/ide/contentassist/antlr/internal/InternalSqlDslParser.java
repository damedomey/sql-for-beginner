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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SqlProgram'", "'{'", "'}'", "'queries'", "','", "'Selection'", "'objects'", "'clauses'", "'Creation'", "'type'", "'constaints'", "'Update'", "'Insertion'", "'values'", "'Delete'", "'Table'", "'columns'", "'Column'", "'Clause'", "'body'", "'Constaint'", "'Value'", "'columnvalues'", "'ColumnValue'", "'value'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleObjects"
    // InternalSqlDsl.g:103:1: entryRuleObjects : ruleObjects EOF ;
    public final void entryRuleObjects() throws RecognitionException {
        try {
            // InternalSqlDsl.g:104:1: ( ruleObjects EOF )
            // InternalSqlDsl.g:105:1: ruleObjects EOF
            {
             before(grammarAccess.getObjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getObjectsRule()); 
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
    // $ANTLR end "entryRuleObjects"


    // $ANTLR start "ruleObjects"
    // InternalSqlDsl.g:112:1: ruleObjects : ( ( rule__Objects__Alternatives ) ) ;
    public final void ruleObjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:116:2: ( ( ( rule__Objects__Alternatives ) ) )
            // InternalSqlDsl.g:117:2: ( ( rule__Objects__Alternatives ) )
            {
            // InternalSqlDsl.g:117:2: ( ( rule__Objects__Alternatives ) )
            // InternalSqlDsl.g:118:3: ( rule__Objects__Alternatives )
            {
             before(grammarAccess.getObjectsAccess().getAlternatives()); 
            // InternalSqlDsl.g:119:3: ( rule__Objects__Alternatives )
            // InternalSqlDsl.g:119:4: rule__Objects__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Objects__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjects"


    // $ANTLR start "entryRuleSelection"
    // InternalSqlDsl.g:128:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalSqlDsl.g:129:1: ( ruleSelection EOF )
            // InternalSqlDsl.g:130:1: ruleSelection EOF
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
    // InternalSqlDsl.g:137:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:141:2: ( ( ( rule__Selection__Group__0 ) ) )
            // InternalSqlDsl.g:142:2: ( ( rule__Selection__Group__0 ) )
            {
            // InternalSqlDsl.g:142:2: ( ( rule__Selection__Group__0 ) )
            // InternalSqlDsl.g:143:3: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // InternalSqlDsl.g:144:3: ( rule__Selection__Group__0 )
            // InternalSqlDsl.g:144:4: rule__Selection__Group__0
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
    // InternalSqlDsl.g:153:1: entryRuleCreation : ruleCreation EOF ;
    public final void entryRuleCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:154:1: ( ruleCreation EOF )
            // InternalSqlDsl.g:155:1: ruleCreation EOF
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
    // InternalSqlDsl.g:162:1: ruleCreation : ( ( rule__Creation__Group__0 ) ) ;
    public final void ruleCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:166:2: ( ( ( rule__Creation__Group__0 ) ) )
            // InternalSqlDsl.g:167:2: ( ( rule__Creation__Group__0 ) )
            {
            // InternalSqlDsl.g:167:2: ( ( rule__Creation__Group__0 ) )
            // InternalSqlDsl.g:168:3: ( rule__Creation__Group__0 )
            {
             before(grammarAccess.getCreationAccess().getGroup()); 
            // InternalSqlDsl.g:169:3: ( rule__Creation__Group__0 )
            // InternalSqlDsl.g:169:4: rule__Creation__Group__0
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
    // InternalSqlDsl.g:178:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalSqlDsl.g:179:1: ( ruleUpdate EOF )
            // InternalSqlDsl.g:180:1: ruleUpdate EOF
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
    // InternalSqlDsl.g:187:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:191:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalSqlDsl.g:192:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalSqlDsl.g:192:2: ( ( rule__Update__Group__0 ) )
            // InternalSqlDsl.g:193:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalSqlDsl.g:194:3: ( rule__Update__Group__0 )
            // InternalSqlDsl.g:194:4: rule__Update__Group__0
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
    // InternalSqlDsl.g:203:1: entryRuleInsertion : ruleInsertion EOF ;
    public final void entryRuleInsertion() throws RecognitionException {
        try {
            // InternalSqlDsl.g:204:1: ( ruleInsertion EOF )
            // InternalSqlDsl.g:205:1: ruleInsertion EOF
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
    // InternalSqlDsl.g:212:1: ruleInsertion : ( ( rule__Insertion__Group__0 ) ) ;
    public final void ruleInsertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:216:2: ( ( ( rule__Insertion__Group__0 ) ) )
            // InternalSqlDsl.g:217:2: ( ( rule__Insertion__Group__0 ) )
            {
            // InternalSqlDsl.g:217:2: ( ( rule__Insertion__Group__0 ) )
            // InternalSqlDsl.g:218:3: ( rule__Insertion__Group__0 )
            {
             before(grammarAccess.getInsertionAccess().getGroup()); 
            // InternalSqlDsl.g:219:3: ( rule__Insertion__Group__0 )
            // InternalSqlDsl.g:219:4: rule__Insertion__Group__0
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
    // InternalSqlDsl.g:228:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalSqlDsl.g:229:1: ( ruleDelete EOF )
            // InternalSqlDsl.g:230:1: ruleDelete EOF
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
    // InternalSqlDsl.g:237:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:241:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalSqlDsl.g:242:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalSqlDsl.g:242:2: ( ( rule__Delete__Group__0 ) )
            // InternalSqlDsl.g:243:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalSqlDsl.g:244:3: ( rule__Delete__Group__0 )
            // InternalSqlDsl.g:244:4: rule__Delete__Group__0
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
    // InternalSqlDsl.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSqlDsl.g:254:1: ( ruleEString EOF )
            // InternalSqlDsl.g:255:1: ruleEString EOF
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
    // InternalSqlDsl.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSqlDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSqlDsl.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalSqlDsl.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSqlDsl.g:269:3: ( rule__EString__Alternatives )
            // InternalSqlDsl.g:269:4: rule__EString__Alternatives
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
    // InternalSqlDsl.g:278:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSqlDsl.g:279:1: ( ruleTable EOF )
            // InternalSqlDsl.g:280:1: ruleTable EOF
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
    // InternalSqlDsl.g:287:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:291:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalSqlDsl.g:292:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalSqlDsl.g:292:2: ( ( rule__Table__Group__0 ) )
            // InternalSqlDsl.g:293:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalSqlDsl.g:294:3: ( rule__Table__Group__0 )
            // InternalSqlDsl.g:294:4: rule__Table__Group__0
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
    // InternalSqlDsl.g:303:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSqlDsl.g:304:1: ( ruleColumn EOF )
            // InternalSqlDsl.g:305:1: ruleColumn EOF
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
    // InternalSqlDsl.g:312:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:316:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSqlDsl.g:317:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSqlDsl.g:317:2: ( ( rule__Column__Group__0 ) )
            // InternalSqlDsl.g:318:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSqlDsl.g:319:3: ( rule__Column__Group__0 )
            // InternalSqlDsl.g:319:4: rule__Column__Group__0
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
    // InternalSqlDsl.g:328:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalSqlDsl.g:329:1: ( ruleClause EOF )
            // InternalSqlDsl.g:330:1: ruleClause EOF
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
    // InternalSqlDsl.g:337:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:341:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalSqlDsl.g:342:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalSqlDsl.g:342:2: ( ( rule__Clause__Group__0 ) )
            // InternalSqlDsl.g:343:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalSqlDsl.g:344:3: ( rule__Clause__Group__0 )
            // InternalSqlDsl.g:344:4: rule__Clause__Group__0
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
    // InternalSqlDsl.g:353:1: entryRuleConstaint : ruleConstaint EOF ;
    public final void entryRuleConstaint() throws RecognitionException {
        try {
            // InternalSqlDsl.g:354:1: ( ruleConstaint EOF )
            // InternalSqlDsl.g:355:1: ruleConstaint EOF
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
    // InternalSqlDsl.g:362:1: ruleConstaint : ( ( rule__Constaint__Group__0 ) ) ;
    public final void ruleConstaint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:366:2: ( ( ( rule__Constaint__Group__0 ) ) )
            // InternalSqlDsl.g:367:2: ( ( rule__Constaint__Group__0 ) )
            {
            // InternalSqlDsl.g:367:2: ( ( rule__Constaint__Group__0 ) )
            // InternalSqlDsl.g:368:3: ( rule__Constaint__Group__0 )
            {
             before(grammarAccess.getConstaintAccess().getGroup()); 
            // InternalSqlDsl.g:369:3: ( rule__Constaint__Group__0 )
            // InternalSqlDsl.g:369:4: rule__Constaint__Group__0
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
    // InternalSqlDsl.g:378:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:379:1: ( ruleValue EOF )
            // InternalSqlDsl.g:380:1: ruleValue EOF
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
    // InternalSqlDsl.g:387:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:391:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSqlDsl.g:392:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSqlDsl.g:392:2: ( ( rule__Value__Group__0 ) )
            // InternalSqlDsl.g:393:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSqlDsl.g:394:3: ( rule__Value__Group__0 )
            // InternalSqlDsl.g:394:4: rule__Value__Group__0
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
    // InternalSqlDsl.g:403:1: entryRuleColumnValue : ruleColumnValue EOF ;
    public final void entryRuleColumnValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:404:1: ( ruleColumnValue EOF )
            // InternalSqlDsl.g:405:1: ruleColumnValue EOF
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
    // InternalSqlDsl.g:412:1: ruleColumnValue : ( ( rule__ColumnValue__Group__0 ) ) ;
    public final void ruleColumnValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:416:2: ( ( ( rule__ColumnValue__Group__0 ) ) )
            // InternalSqlDsl.g:417:2: ( ( rule__ColumnValue__Group__0 ) )
            {
            // InternalSqlDsl.g:417:2: ( ( rule__ColumnValue__Group__0 ) )
            // InternalSqlDsl.g:418:3: ( rule__ColumnValue__Group__0 )
            {
             before(grammarAccess.getColumnValueAccess().getGroup()); 
            // InternalSqlDsl.g:419:3: ( rule__ColumnValue__Group__0 )
            // InternalSqlDsl.g:419:4: rule__ColumnValue__Group__0
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


    // $ANTLR start "rule__Queries__Alternatives"
    // InternalSqlDsl.g:427:1: rule__Queries__Alternatives : ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) );
    public final void rule__Queries__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:431:1: ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 25:
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


    // $ANTLR start "rule__Objects__Alternatives"
    // InternalSqlDsl.g:466:1: rule__Objects__Alternatives : ( ( ruleTable ) | ( ruleColumn ) );
    public final void rule__Objects__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:470:1: ( ( ruleTable ) | ( ruleColumn ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlDsl.g:471:2: ( ruleTable )
                    {
                    // InternalSqlDsl.g:471:2: ( ruleTable )
                    // InternalSqlDsl.g:472:3: ruleTable
                    {
                     before(grammarAccess.getObjectsAccess().getTableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTable();

                    state._fsp--;

                     after(grammarAccess.getObjectsAccess().getTableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:477:2: ( ruleColumn )
                    {
                    // InternalSqlDsl.g:477:2: ( ruleColumn )
                    // InternalSqlDsl.g:478:3: ruleColumn
                    {
                     before(grammarAccess.getObjectsAccess().getColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getObjectsAccess().getColumnParserRuleCall_1()); 

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
    // $ANTLR end "rule__Objects__Alternatives"


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


    // $ANTLR start "rule__SqlProgram__Group__0"
    // InternalSqlDsl.g:508:1: rule__SqlProgram__Group__0 : rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 ;
    public final void rule__SqlProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:512:1: ( rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 )
            // InternalSqlDsl.g:513:2: rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1
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
    // InternalSqlDsl.g:520:1: rule__SqlProgram__Group__0__Impl : ( () ) ;
    public final void rule__SqlProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:524:1: ( ( () ) )
            // InternalSqlDsl.g:525:1: ( () )
            {
            // InternalSqlDsl.g:525:1: ( () )
            // InternalSqlDsl.g:526:2: ()
            {
             before(grammarAccess.getSqlProgramAccess().getSqlProgramAction_0()); 
            // InternalSqlDsl.g:527:2: ()
            // InternalSqlDsl.g:527:3: 
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
    // InternalSqlDsl.g:535:1: rule__SqlProgram__Group__1 : rule__SqlProgram__Group__1__Impl rule__SqlProgram__Group__2 ;
    public final void rule__SqlProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:539:1: ( rule__SqlProgram__Group__1__Impl rule__SqlProgram__Group__2 )
            // InternalSqlDsl.g:540:2: rule__SqlProgram__Group__1__Impl rule__SqlProgram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SqlProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__2();

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
    // InternalSqlDsl.g:547:1: rule__SqlProgram__Group__1__Impl : ( 'SqlProgram' ) ;
    public final void rule__SqlProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:551:1: ( ( 'SqlProgram' ) )
            // InternalSqlDsl.g:552:1: ( 'SqlProgram' )
            {
            // InternalSqlDsl.g:552:1: ( 'SqlProgram' )
            // InternalSqlDsl.g:553:2: 'SqlProgram'
            {
             before(grammarAccess.getSqlProgramAccess().getSqlProgramKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getSqlProgramKeyword_1()); 

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


    // $ANTLR start "rule__SqlProgram__Group__2"
    // InternalSqlDsl.g:562:1: rule__SqlProgram__Group__2 : rule__SqlProgram__Group__2__Impl rule__SqlProgram__Group__3 ;
    public final void rule__SqlProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:566:1: ( rule__SqlProgram__Group__2__Impl rule__SqlProgram__Group__3 )
            // InternalSqlDsl.g:567:2: rule__SqlProgram__Group__2__Impl rule__SqlProgram__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SqlProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__3();

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
    // $ANTLR end "rule__SqlProgram__Group__2"


    // $ANTLR start "rule__SqlProgram__Group__2__Impl"
    // InternalSqlDsl.g:574:1: rule__SqlProgram__Group__2__Impl : ( '{' ) ;
    public final void rule__SqlProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:578:1: ( ( '{' ) )
            // InternalSqlDsl.g:579:1: ( '{' )
            {
            // InternalSqlDsl.g:579:1: ( '{' )
            // InternalSqlDsl.g:580:2: '{'
            {
             before(grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SqlProgram__Group__2__Impl"


    // $ANTLR start "rule__SqlProgram__Group__3"
    // InternalSqlDsl.g:589:1: rule__SqlProgram__Group__3 : rule__SqlProgram__Group__3__Impl rule__SqlProgram__Group__4 ;
    public final void rule__SqlProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:593:1: ( rule__SqlProgram__Group__3__Impl rule__SqlProgram__Group__4 )
            // InternalSqlDsl.g:594:2: rule__SqlProgram__Group__3__Impl rule__SqlProgram__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SqlProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__4();

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
    // $ANTLR end "rule__SqlProgram__Group__3"


    // $ANTLR start "rule__SqlProgram__Group__3__Impl"
    // InternalSqlDsl.g:601:1: rule__SqlProgram__Group__3__Impl : ( ( rule__SqlProgram__Group_3__0 )? ) ;
    public final void rule__SqlProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:605:1: ( ( ( rule__SqlProgram__Group_3__0 )? ) )
            // InternalSqlDsl.g:606:1: ( ( rule__SqlProgram__Group_3__0 )? )
            {
            // InternalSqlDsl.g:606:1: ( ( rule__SqlProgram__Group_3__0 )? )
            // InternalSqlDsl.g:607:2: ( rule__SqlProgram__Group_3__0 )?
            {
             before(grammarAccess.getSqlProgramAccess().getGroup_3()); 
            // InternalSqlDsl.g:608:2: ( rule__SqlProgram__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSqlDsl.g:608:3: rule__SqlProgram__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SqlProgram__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSqlProgramAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SqlProgram__Group__3__Impl"


    // $ANTLR start "rule__SqlProgram__Group__4"
    // InternalSqlDsl.g:616:1: rule__SqlProgram__Group__4 : rule__SqlProgram__Group__4__Impl ;
    public final void rule__SqlProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:620:1: ( rule__SqlProgram__Group__4__Impl )
            // InternalSqlDsl.g:621:2: rule__SqlProgram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group__4__Impl();

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
    // $ANTLR end "rule__SqlProgram__Group__4"


    // $ANTLR start "rule__SqlProgram__Group__4__Impl"
    // InternalSqlDsl.g:627:1: rule__SqlProgram__Group__4__Impl : ( '}' ) ;
    public final void rule__SqlProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:631:1: ( ( '}' ) )
            // InternalSqlDsl.g:632:1: ( '}' )
            {
            // InternalSqlDsl.g:632:1: ( '}' )
            // InternalSqlDsl.g:633:2: '}'
            {
             before(grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SqlProgram__Group__4__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3__0"
    // InternalSqlDsl.g:643:1: rule__SqlProgram__Group_3__0 : rule__SqlProgram__Group_3__0__Impl rule__SqlProgram__Group_3__1 ;
    public final void rule__SqlProgram__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:647:1: ( rule__SqlProgram__Group_3__0__Impl rule__SqlProgram__Group_3__1 )
            // InternalSqlDsl.g:648:2: rule__SqlProgram__Group_3__0__Impl rule__SqlProgram__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SqlProgram__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3__1();

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
    // $ANTLR end "rule__SqlProgram__Group_3__0"


    // $ANTLR start "rule__SqlProgram__Group_3__0__Impl"
    // InternalSqlDsl.g:655:1: rule__SqlProgram__Group_3__0__Impl : ( 'queries' ) ;
    public final void rule__SqlProgram__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:659:1: ( ( 'queries' ) )
            // InternalSqlDsl.g:660:1: ( 'queries' )
            {
            // InternalSqlDsl.g:660:1: ( 'queries' )
            // InternalSqlDsl.g:661:2: 'queries'
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getQueriesKeyword_3_0()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3__0__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3__1"
    // InternalSqlDsl.g:670:1: rule__SqlProgram__Group_3__1 : rule__SqlProgram__Group_3__1__Impl rule__SqlProgram__Group_3__2 ;
    public final void rule__SqlProgram__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:674:1: ( rule__SqlProgram__Group_3__1__Impl rule__SqlProgram__Group_3__2 )
            // InternalSqlDsl.g:675:2: rule__SqlProgram__Group_3__1__Impl rule__SqlProgram__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__SqlProgram__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3__2();

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
    // $ANTLR end "rule__SqlProgram__Group_3__1"


    // $ANTLR start "rule__SqlProgram__Group_3__1__Impl"
    // InternalSqlDsl.g:682:1: rule__SqlProgram__Group_3__1__Impl : ( '{' ) ;
    public final void rule__SqlProgram__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:686:1: ( ( '{' ) )
            // InternalSqlDsl.g:687:1: ( '{' )
            {
            // InternalSqlDsl.g:687:1: ( '{' )
            // InternalSqlDsl.g:688:2: '{'
            {
             before(grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3__1__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3__2"
    // InternalSqlDsl.g:697:1: rule__SqlProgram__Group_3__2 : rule__SqlProgram__Group_3__2__Impl rule__SqlProgram__Group_3__3 ;
    public final void rule__SqlProgram__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:701:1: ( rule__SqlProgram__Group_3__2__Impl rule__SqlProgram__Group_3__3 )
            // InternalSqlDsl.g:702:2: rule__SqlProgram__Group_3__2__Impl rule__SqlProgram__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__SqlProgram__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3__3();

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
    // $ANTLR end "rule__SqlProgram__Group_3__2"


    // $ANTLR start "rule__SqlProgram__Group_3__2__Impl"
    // InternalSqlDsl.g:709:1: rule__SqlProgram__Group_3__2__Impl : ( ( rule__SqlProgram__QueriesAssignment_3_2 ) ) ;
    public final void rule__SqlProgram__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:713:1: ( ( ( rule__SqlProgram__QueriesAssignment_3_2 ) ) )
            // InternalSqlDsl.g:714:1: ( ( rule__SqlProgram__QueriesAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:714:1: ( ( rule__SqlProgram__QueriesAssignment_3_2 ) )
            // InternalSqlDsl.g:715:2: ( rule__SqlProgram__QueriesAssignment_3_2 )
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesAssignment_3_2()); 
            // InternalSqlDsl.g:716:2: ( rule__SqlProgram__QueriesAssignment_3_2 )
            // InternalSqlDsl.g:716:3: rule__SqlProgram__QueriesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__QueriesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSqlProgramAccess().getQueriesAssignment_3_2()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3__2__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3__3"
    // InternalSqlDsl.g:724:1: rule__SqlProgram__Group_3__3 : rule__SqlProgram__Group_3__3__Impl rule__SqlProgram__Group_3__4 ;
    public final void rule__SqlProgram__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:728:1: ( rule__SqlProgram__Group_3__3__Impl rule__SqlProgram__Group_3__4 )
            // InternalSqlDsl.g:729:2: rule__SqlProgram__Group_3__3__Impl rule__SqlProgram__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__SqlProgram__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3__4();

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
    // $ANTLR end "rule__SqlProgram__Group_3__3"


    // $ANTLR start "rule__SqlProgram__Group_3__3__Impl"
    // InternalSqlDsl.g:736:1: rule__SqlProgram__Group_3__3__Impl : ( ( rule__SqlProgram__Group_3_3__0 )* ) ;
    public final void rule__SqlProgram__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:740:1: ( ( ( rule__SqlProgram__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:741:1: ( ( rule__SqlProgram__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:741:1: ( ( rule__SqlProgram__Group_3_3__0 )* )
            // InternalSqlDsl.g:742:2: ( rule__SqlProgram__Group_3_3__0 )*
            {
             before(grammarAccess.getSqlProgramAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:743:2: ( rule__SqlProgram__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSqlDsl.g:743:3: rule__SqlProgram__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SqlProgram__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSqlProgramAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3__3__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3__4"
    // InternalSqlDsl.g:751:1: rule__SqlProgram__Group_3__4 : rule__SqlProgram__Group_3__4__Impl ;
    public final void rule__SqlProgram__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:755:1: ( rule__SqlProgram__Group_3__4__Impl )
            // InternalSqlDsl.g:756:2: rule__SqlProgram__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3__4__Impl();

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
    // $ANTLR end "rule__SqlProgram__Group_3__4"


    // $ANTLR start "rule__SqlProgram__Group_3__4__Impl"
    // InternalSqlDsl.g:762:1: rule__SqlProgram__Group_3__4__Impl : ( '}' ) ;
    public final void rule__SqlProgram__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:766:1: ( ( '}' ) )
            // InternalSqlDsl.g:767:1: ( '}' )
            {
            // InternalSqlDsl.g:767:1: ( '}' )
            // InternalSqlDsl.g:768:2: '}'
            {
             before(grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3__4__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3_3__0"
    // InternalSqlDsl.g:778:1: rule__SqlProgram__Group_3_3__0 : rule__SqlProgram__Group_3_3__0__Impl rule__SqlProgram__Group_3_3__1 ;
    public final void rule__SqlProgram__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:782:1: ( rule__SqlProgram__Group_3_3__0__Impl rule__SqlProgram__Group_3_3__1 )
            // InternalSqlDsl.g:783:2: rule__SqlProgram__Group_3_3__0__Impl rule__SqlProgram__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__SqlProgram__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3_3__1();

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
    // $ANTLR end "rule__SqlProgram__Group_3_3__0"


    // $ANTLR start "rule__SqlProgram__Group_3_3__0__Impl"
    // InternalSqlDsl.g:790:1: rule__SqlProgram__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__SqlProgram__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:794:1: ( ( ',' ) )
            // InternalSqlDsl.g:795:1: ( ',' )
            {
            // InternalSqlDsl.g:795:1: ( ',' )
            // InternalSqlDsl.g:796:2: ','
            {
             before(grammarAccess.getSqlProgramAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSqlProgramAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3_3__0__Impl"


    // $ANTLR start "rule__SqlProgram__Group_3_3__1"
    // InternalSqlDsl.g:805:1: rule__SqlProgram__Group_3_3__1 : rule__SqlProgram__Group_3_3__1__Impl ;
    public final void rule__SqlProgram__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:809:1: ( rule__SqlProgram__Group_3_3__1__Impl )
            // InternalSqlDsl.g:810:2: rule__SqlProgram__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__SqlProgram__Group_3_3__1"


    // $ANTLR start "rule__SqlProgram__Group_3_3__1__Impl"
    // InternalSqlDsl.g:816:1: rule__SqlProgram__Group_3_3__1__Impl : ( ( rule__SqlProgram__QueriesAssignment_3_3_1 ) ) ;
    public final void rule__SqlProgram__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:820:1: ( ( ( rule__SqlProgram__QueriesAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:821:1: ( ( rule__SqlProgram__QueriesAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:821:1: ( ( rule__SqlProgram__QueriesAssignment_3_3_1 ) )
            // InternalSqlDsl.g:822:2: ( rule__SqlProgram__QueriesAssignment_3_3_1 )
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesAssignment_3_3_1()); 
            // InternalSqlDsl.g:823:2: ( rule__SqlProgram__QueriesAssignment_3_3_1 )
            // InternalSqlDsl.g:823:3: rule__SqlProgram__QueriesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SqlProgram__QueriesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSqlProgramAccess().getQueriesAssignment_3_3_1()); 

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
    // $ANTLR end "rule__SqlProgram__Group_3_3__1__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // InternalSqlDsl.g:832:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:836:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalSqlDsl.g:837:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSqlDsl.g:844:1: rule__Selection__Group__0__Impl : ( () ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:848:1: ( ( () ) )
            // InternalSqlDsl.g:849:1: ( () )
            {
            // InternalSqlDsl.g:849:1: ( () )
            // InternalSqlDsl.g:850:2: ()
            {
             before(grammarAccess.getSelectionAccess().getSelectionAction_0()); 
            // InternalSqlDsl.g:851:2: ()
            // InternalSqlDsl.g:851:3: 
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
    // InternalSqlDsl.g:859:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:863:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // InternalSqlDsl.g:864:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:871:1: rule__Selection__Group__1__Impl : ( 'Selection' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:875:1: ( ( 'Selection' ) )
            // InternalSqlDsl.g:876:1: ( 'Selection' )
            {
            // InternalSqlDsl.g:876:1: ( 'Selection' )
            // InternalSqlDsl.g:877:2: 'Selection'
            {
             before(grammarAccess.getSelectionAccess().getSelectionKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getSelectionKeyword_1()); 

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
    // InternalSqlDsl.g:886:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:890:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // InternalSqlDsl.g:891:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:898:1: rule__Selection__Group__2__Impl : ( '{' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:902:1: ( ( '{' ) )
            // InternalSqlDsl.g:903:1: ( '{' )
            {
            // InternalSqlDsl.g:903:1: ( '{' )
            // InternalSqlDsl.g:904:2: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSqlDsl.g:913:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:917:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // InternalSqlDsl.g:918:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:925:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__Group_3__0 )? ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:929:1: ( ( ( rule__Selection__Group_3__0 )? ) )
            // InternalSqlDsl.g:930:1: ( ( rule__Selection__Group_3__0 )? )
            {
            // InternalSqlDsl.g:930:1: ( ( rule__Selection__Group_3__0 )? )
            // InternalSqlDsl.g:931:2: ( rule__Selection__Group_3__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_3()); 
            // InternalSqlDsl.g:932:2: ( rule__Selection__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqlDsl.g:932:3: rule__Selection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_3()); 

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
    // InternalSqlDsl.g:940:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:944:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // InternalSqlDsl.g:945:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:952:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )? ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:956:1: ( ( ( rule__Selection__Group_4__0 )? ) )
            // InternalSqlDsl.g:957:1: ( ( rule__Selection__Group_4__0 )? )
            {
            // InternalSqlDsl.g:957:1: ( ( rule__Selection__Group_4__0 )? )
            // InternalSqlDsl.g:958:2: ( rule__Selection__Group_4__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // InternalSqlDsl.g:959:2: ( rule__Selection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSqlDsl.g:959:3: rule__Selection__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSqlDsl.g:967:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:971:1: ( rule__Selection__Group__5__Impl )
            // InternalSqlDsl.g:972:2: rule__Selection__Group__5__Impl
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
    // InternalSqlDsl.g:978:1: rule__Selection__Group__5__Impl : ( '}' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:982:1: ( ( '}' ) )
            // InternalSqlDsl.g:983:1: ( '}' )
            {
            // InternalSqlDsl.g:983:1: ( '}' )
            // InternalSqlDsl.g:984:2: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Selection__Group_3__0"
    // InternalSqlDsl.g:994:1: rule__Selection__Group_3__0 : rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1 ;
    public final void rule__Selection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:998:1: ( rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1 )
            // InternalSqlDsl.g:999:2: rule__Selection__Group_3__0__Impl rule__Selection__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Selection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_3__1();

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
    // $ANTLR end "rule__Selection__Group_3__0"


    // $ANTLR start "rule__Selection__Group_3__0__Impl"
    // InternalSqlDsl.g:1006:1: rule__Selection__Group_3__0__Impl : ( 'objects' ) ;
    public final void rule__Selection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1010:1: ( ( 'objects' ) )
            // InternalSqlDsl.g:1011:1: ( 'objects' )
            {
            // InternalSqlDsl.g:1011:1: ( 'objects' )
            // InternalSqlDsl.g:1012:2: 'objects'
            {
             before(grammarAccess.getSelectionAccess().getObjectsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getObjectsKeyword_3_0()); 

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
    // $ANTLR end "rule__Selection__Group_3__0__Impl"


    // $ANTLR start "rule__Selection__Group_3__1"
    // InternalSqlDsl.g:1021:1: rule__Selection__Group_3__1 : rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2 ;
    public final void rule__Selection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1025:1: ( rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2 )
            // InternalSqlDsl.g:1026:2: rule__Selection__Group_3__1__Impl rule__Selection__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Selection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_3__2();

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
    // $ANTLR end "rule__Selection__Group_3__1"


    // $ANTLR start "rule__Selection__Group_3__1__Impl"
    // InternalSqlDsl.g:1033:1: rule__Selection__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Selection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1037:1: ( ( '{' ) )
            // InternalSqlDsl.g:1038:1: ( '{' )
            {
            // InternalSqlDsl.g:1038:1: ( '{' )
            // InternalSqlDsl.g:1039:2: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Selection__Group_3__1__Impl"


    // $ANTLR start "rule__Selection__Group_3__2"
    // InternalSqlDsl.g:1048:1: rule__Selection__Group_3__2 : rule__Selection__Group_3__2__Impl rule__Selection__Group_3__3 ;
    public final void rule__Selection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1052:1: ( rule__Selection__Group_3__2__Impl rule__Selection__Group_3__3 )
            // InternalSqlDsl.g:1053:2: rule__Selection__Group_3__2__Impl rule__Selection__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Selection__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_3__3();

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
    // $ANTLR end "rule__Selection__Group_3__2"


    // $ANTLR start "rule__Selection__Group_3__2__Impl"
    // InternalSqlDsl.g:1060:1: rule__Selection__Group_3__2__Impl : ( ( rule__Selection__ObjectsAssignment_3_2 ) ) ;
    public final void rule__Selection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1064:1: ( ( ( rule__Selection__ObjectsAssignment_3_2 ) ) )
            // InternalSqlDsl.g:1065:1: ( ( rule__Selection__ObjectsAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:1065:1: ( ( rule__Selection__ObjectsAssignment_3_2 ) )
            // InternalSqlDsl.g:1066:2: ( rule__Selection__ObjectsAssignment_3_2 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_3_2()); 
            // InternalSqlDsl.g:1067:2: ( rule__Selection__ObjectsAssignment_3_2 )
            // InternalSqlDsl.g:1067:3: rule__Selection__ObjectsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ObjectsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getObjectsAssignment_3_2()); 

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
    // $ANTLR end "rule__Selection__Group_3__2__Impl"


    // $ANTLR start "rule__Selection__Group_3__3"
    // InternalSqlDsl.g:1075:1: rule__Selection__Group_3__3 : rule__Selection__Group_3__3__Impl rule__Selection__Group_3__4 ;
    public final void rule__Selection__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1079:1: ( rule__Selection__Group_3__3__Impl rule__Selection__Group_3__4 )
            // InternalSqlDsl.g:1080:2: rule__Selection__Group_3__3__Impl rule__Selection__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Selection__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_3__4();

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
    // $ANTLR end "rule__Selection__Group_3__3"


    // $ANTLR start "rule__Selection__Group_3__3__Impl"
    // InternalSqlDsl.g:1087:1: rule__Selection__Group_3__3__Impl : ( ( rule__Selection__Group_3_3__0 )* ) ;
    public final void rule__Selection__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1091:1: ( ( ( rule__Selection__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:1092:1: ( ( rule__Selection__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:1092:1: ( ( rule__Selection__Group_3_3__0 )* )
            // InternalSqlDsl.g:1093:2: ( rule__Selection__Group_3_3__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:1094:2: ( rule__Selection__Group_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlDsl.g:1094:3: rule__Selection__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Selection__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Selection__Group_3__3__Impl"


    // $ANTLR start "rule__Selection__Group_3__4"
    // InternalSqlDsl.g:1102:1: rule__Selection__Group_3__4 : rule__Selection__Group_3__4__Impl ;
    public final void rule__Selection__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1106:1: ( rule__Selection__Group_3__4__Impl )
            // InternalSqlDsl.g:1107:2: rule__Selection__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_3__4__Impl();

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
    // $ANTLR end "rule__Selection__Group_3__4"


    // $ANTLR start "rule__Selection__Group_3__4__Impl"
    // InternalSqlDsl.g:1113:1: rule__Selection__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Selection__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1117:1: ( ( '}' ) )
            // InternalSqlDsl.g:1118:1: ( '}' )
            {
            // InternalSqlDsl.g:1118:1: ( '}' )
            // InternalSqlDsl.g:1119:2: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Selection__Group_3__4__Impl"


    // $ANTLR start "rule__Selection__Group_3_3__0"
    // InternalSqlDsl.g:1129:1: rule__Selection__Group_3_3__0 : rule__Selection__Group_3_3__0__Impl rule__Selection__Group_3_3__1 ;
    public final void rule__Selection__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1133:1: ( rule__Selection__Group_3_3__0__Impl rule__Selection__Group_3_3__1 )
            // InternalSqlDsl.g:1134:2: rule__Selection__Group_3_3__0__Impl rule__Selection__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Selection__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_3_3__1();

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
    // $ANTLR end "rule__Selection__Group_3_3__0"


    // $ANTLR start "rule__Selection__Group_3_3__0__Impl"
    // InternalSqlDsl.g:1141:1: rule__Selection__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1145:1: ( ( ',' ) )
            // InternalSqlDsl.g:1146:1: ( ',' )
            {
            // InternalSqlDsl.g:1146:1: ( ',' )
            // InternalSqlDsl.g:1147:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Selection__Group_3_3__0__Impl"


    // $ANTLR start "rule__Selection__Group_3_3__1"
    // InternalSqlDsl.g:1156:1: rule__Selection__Group_3_3__1 : rule__Selection__Group_3_3__1__Impl ;
    public final void rule__Selection__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1160:1: ( rule__Selection__Group_3_3__1__Impl )
            // InternalSqlDsl.g:1161:2: rule__Selection__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_3_3__1"


    // $ANTLR start "rule__Selection__Group_3_3__1__Impl"
    // InternalSqlDsl.g:1167:1: rule__Selection__Group_3_3__1__Impl : ( ( rule__Selection__ObjectsAssignment_3_3_1 ) ) ;
    public final void rule__Selection__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1171:1: ( ( ( rule__Selection__ObjectsAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:1172:1: ( ( rule__Selection__ObjectsAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:1172:1: ( ( rule__Selection__ObjectsAssignment_3_3_1 ) )
            // InternalSqlDsl.g:1173:2: ( rule__Selection__ObjectsAssignment_3_3_1 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_3_3_1()); 
            // InternalSqlDsl.g:1174:2: ( rule__Selection__ObjectsAssignment_3_3_1 )
            // InternalSqlDsl.g:1174:3: rule__Selection__ObjectsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ObjectsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getObjectsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Selection__Group_3_3__1__Impl"


    // $ANTLR start "rule__Selection__Group_4__0"
    // InternalSqlDsl.g:1183:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1187:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // InternalSqlDsl.g:1188:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:1195:1: rule__Selection__Group_4__0__Impl : ( 'clauses' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1199:1: ( ( 'clauses' ) )
            // InternalSqlDsl.g:1200:1: ( 'clauses' )
            {
            // InternalSqlDsl.g:1200:1: ( 'clauses' )
            // InternalSqlDsl.g:1201:2: 'clauses'
            {
             before(grammarAccess.getSelectionAccess().getClausesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getClausesKeyword_4_0()); 

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
    // InternalSqlDsl.g:1210:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2 ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1214:1: ( rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2 )
            // InternalSqlDsl.g:1215:2: rule__Selection__Group_4__1__Impl rule__Selection__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Selection__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__2();

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
    // InternalSqlDsl.g:1222:1: rule__Selection__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1226:1: ( ( '{' ) )
            // InternalSqlDsl.g:1227:1: ( '{' )
            {
            // InternalSqlDsl.g:1227:1: ( '{' )
            // InternalSqlDsl.g:1228:2: '{'
            {
             before(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_4_1()); 

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


    // $ANTLR start "rule__Selection__Group_4__2"
    // InternalSqlDsl.g:1237:1: rule__Selection__Group_4__2 : rule__Selection__Group_4__2__Impl rule__Selection__Group_4__3 ;
    public final void rule__Selection__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1241:1: ( rule__Selection__Group_4__2__Impl rule__Selection__Group_4__3 )
            // InternalSqlDsl.g:1242:2: rule__Selection__Group_4__2__Impl rule__Selection__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Selection__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__3();

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
    // $ANTLR end "rule__Selection__Group_4__2"


    // $ANTLR start "rule__Selection__Group_4__2__Impl"
    // InternalSqlDsl.g:1249:1: rule__Selection__Group_4__2__Impl : ( ( rule__Selection__ClausesAssignment_4_2 ) ) ;
    public final void rule__Selection__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1253:1: ( ( ( rule__Selection__ClausesAssignment_4_2 ) ) )
            // InternalSqlDsl.g:1254:1: ( ( rule__Selection__ClausesAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:1254:1: ( ( rule__Selection__ClausesAssignment_4_2 ) )
            // InternalSqlDsl.g:1255:2: ( rule__Selection__ClausesAssignment_4_2 )
            {
             before(grammarAccess.getSelectionAccess().getClausesAssignment_4_2()); 
            // InternalSqlDsl.g:1256:2: ( rule__Selection__ClausesAssignment_4_2 )
            // InternalSqlDsl.g:1256:3: rule__Selection__ClausesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ClausesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getClausesAssignment_4_2()); 

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
    // $ANTLR end "rule__Selection__Group_4__2__Impl"


    // $ANTLR start "rule__Selection__Group_4__3"
    // InternalSqlDsl.g:1264:1: rule__Selection__Group_4__3 : rule__Selection__Group_4__3__Impl rule__Selection__Group_4__4 ;
    public final void rule__Selection__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1268:1: ( rule__Selection__Group_4__3__Impl rule__Selection__Group_4__4 )
            // InternalSqlDsl.g:1269:2: rule__Selection__Group_4__3__Impl rule__Selection__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Selection__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__4();

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
    // $ANTLR end "rule__Selection__Group_4__3"


    // $ANTLR start "rule__Selection__Group_4__3__Impl"
    // InternalSqlDsl.g:1276:1: rule__Selection__Group_4__3__Impl : ( ( rule__Selection__Group_4_3__0 )* ) ;
    public final void rule__Selection__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1280:1: ( ( ( rule__Selection__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:1281:1: ( ( rule__Selection__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:1281:1: ( ( rule__Selection__Group_4_3__0 )* )
            // InternalSqlDsl.g:1282:2: ( rule__Selection__Group_4_3__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:1283:2: ( rule__Selection__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:1283:3: rule__Selection__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Selection__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Selection__Group_4__3__Impl"


    // $ANTLR start "rule__Selection__Group_4__4"
    // InternalSqlDsl.g:1291:1: rule__Selection__Group_4__4 : rule__Selection__Group_4__4__Impl ;
    public final void rule__Selection__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1295:1: ( rule__Selection__Group_4__4__Impl )
            // InternalSqlDsl.g:1296:2: rule__Selection__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_4__4__Impl();

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
    // $ANTLR end "rule__Selection__Group_4__4"


    // $ANTLR start "rule__Selection__Group_4__4__Impl"
    // InternalSqlDsl.g:1302:1: rule__Selection__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Selection__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1306:1: ( ( '}' ) )
            // InternalSqlDsl.g:1307:1: ( '}' )
            {
            // InternalSqlDsl.g:1307:1: ( '}' )
            // InternalSqlDsl.g:1308:2: '}'
            {
             before(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Selection__Group_4__4__Impl"


    // $ANTLR start "rule__Selection__Group_4_3__0"
    // InternalSqlDsl.g:1318:1: rule__Selection__Group_4_3__0 : rule__Selection__Group_4_3__0__Impl rule__Selection__Group_4_3__1 ;
    public final void rule__Selection__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1322:1: ( rule__Selection__Group_4_3__0__Impl rule__Selection__Group_4_3__1 )
            // InternalSqlDsl.g:1323:2: rule__Selection__Group_4_3__0__Impl rule__Selection__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Selection__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_4_3__1();

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
    // $ANTLR end "rule__Selection__Group_4_3__0"


    // $ANTLR start "rule__Selection__Group_4_3__0__Impl"
    // InternalSqlDsl.g:1330:1: rule__Selection__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1334:1: ( ( ',' ) )
            // InternalSqlDsl.g:1335:1: ( ',' )
            {
            // InternalSqlDsl.g:1335:1: ( ',' )
            // InternalSqlDsl.g:1336:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Selection__Group_4_3__0__Impl"


    // $ANTLR start "rule__Selection__Group_4_3__1"
    // InternalSqlDsl.g:1345:1: rule__Selection__Group_4_3__1 : rule__Selection__Group_4_3__1__Impl ;
    public final void rule__Selection__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1349:1: ( rule__Selection__Group_4_3__1__Impl )
            // InternalSqlDsl.g:1350:2: rule__Selection__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_4_3__1"


    // $ANTLR start "rule__Selection__Group_4_3__1__Impl"
    // InternalSqlDsl.g:1356:1: rule__Selection__Group_4_3__1__Impl : ( ( rule__Selection__ClausesAssignment_4_3_1 ) ) ;
    public final void rule__Selection__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1360:1: ( ( ( rule__Selection__ClausesAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:1361:1: ( ( rule__Selection__ClausesAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:1361:1: ( ( rule__Selection__ClausesAssignment_4_3_1 ) )
            // InternalSqlDsl.g:1362:2: ( rule__Selection__ClausesAssignment_4_3_1 )
            {
             before(grammarAccess.getSelectionAccess().getClausesAssignment_4_3_1()); 
            // InternalSqlDsl.g:1363:2: ( rule__Selection__ClausesAssignment_4_3_1 )
            // InternalSqlDsl.g:1363:3: rule__Selection__ClausesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Selection__ClausesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getClausesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Selection__Group_4_3__1__Impl"


    // $ANTLR start "rule__Creation__Group__0"
    // InternalSqlDsl.g:1372:1: rule__Creation__Group__0 : rule__Creation__Group__0__Impl rule__Creation__Group__1 ;
    public final void rule__Creation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1376:1: ( rule__Creation__Group__0__Impl rule__Creation__Group__1 )
            // InternalSqlDsl.g:1377:2: rule__Creation__Group__0__Impl rule__Creation__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSqlDsl.g:1384:1: rule__Creation__Group__0__Impl : ( () ) ;
    public final void rule__Creation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1388:1: ( ( () ) )
            // InternalSqlDsl.g:1389:1: ( () )
            {
            // InternalSqlDsl.g:1389:1: ( () )
            // InternalSqlDsl.g:1390:2: ()
            {
             before(grammarAccess.getCreationAccess().getCreationAction_0()); 
            // InternalSqlDsl.g:1391:2: ()
            // InternalSqlDsl.g:1391:3: 
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
    // InternalSqlDsl.g:1399:1: rule__Creation__Group__1 : rule__Creation__Group__1__Impl rule__Creation__Group__2 ;
    public final void rule__Creation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1403:1: ( rule__Creation__Group__1__Impl rule__Creation__Group__2 )
            // InternalSqlDsl.g:1404:2: rule__Creation__Group__1__Impl rule__Creation__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:1411:1: rule__Creation__Group__1__Impl : ( 'Creation' ) ;
    public final void rule__Creation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1415:1: ( ( 'Creation' ) )
            // InternalSqlDsl.g:1416:1: ( 'Creation' )
            {
            // InternalSqlDsl.g:1416:1: ( 'Creation' )
            // InternalSqlDsl.g:1417:2: 'Creation'
            {
             before(grammarAccess.getCreationAccess().getCreationKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getCreationKeyword_1()); 

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
    // InternalSqlDsl.g:1426:1: rule__Creation__Group__2 : rule__Creation__Group__2__Impl rule__Creation__Group__3 ;
    public final void rule__Creation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1430:1: ( rule__Creation__Group__2__Impl rule__Creation__Group__3 )
            // InternalSqlDsl.g:1431:2: rule__Creation__Group__2__Impl rule__Creation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__3();

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
    // InternalSqlDsl.g:1438:1: rule__Creation__Group__2__Impl : ( '{' ) ;
    public final void rule__Creation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1442:1: ( ( '{' ) )
            // InternalSqlDsl.g:1443:1: ( '{' )
            {
            // InternalSqlDsl.g:1443:1: ( '{' )
            // InternalSqlDsl.g:1444:2: '{'
            {
             before(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Creation__Group__3"
    // InternalSqlDsl.g:1453:1: rule__Creation__Group__3 : rule__Creation__Group__3__Impl rule__Creation__Group__4 ;
    public final void rule__Creation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1457:1: ( rule__Creation__Group__3__Impl rule__Creation__Group__4 )
            // InternalSqlDsl.g:1458:2: rule__Creation__Group__3__Impl rule__Creation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__4();

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
    // $ANTLR end "rule__Creation__Group__3"


    // $ANTLR start "rule__Creation__Group__3__Impl"
    // InternalSqlDsl.g:1465:1: rule__Creation__Group__3__Impl : ( ( rule__Creation__Group_3__0 )? ) ;
    public final void rule__Creation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1469:1: ( ( ( rule__Creation__Group_3__0 )? ) )
            // InternalSqlDsl.g:1470:1: ( ( rule__Creation__Group_3__0 )? )
            {
            // InternalSqlDsl.g:1470:1: ( ( rule__Creation__Group_3__0 )? )
            // InternalSqlDsl.g:1471:2: ( rule__Creation__Group_3__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_3()); 
            // InternalSqlDsl.g:1472:2: ( rule__Creation__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlDsl.g:1472:3: rule__Creation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Creation__Group__3__Impl"


    // $ANTLR start "rule__Creation__Group__4"
    // InternalSqlDsl.g:1480:1: rule__Creation__Group__4 : rule__Creation__Group__4__Impl rule__Creation__Group__5 ;
    public final void rule__Creation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1484:1: ( rule__Creation__Group__4__Impl rule__Creation__Group__5 )
            // InternalSqlDsl.g:1485:2: rule__Creation__Group__4__Impl rule__Creation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__5();

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
    // $ANTLR end "rule__Creation__Group__4"


    // $ANTLR start "rule__Creation__Group__4__Impl"
    // InternalSqlDsl.g:1492:1: rule__Creation__Group__4__Impl : ( ( rule__Creation__Group_4__0 )? ) ;
    public final void rule__Creation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1496:1: ( ( ( rule__Creation__Group_4__0 )? ) )
            // InternalSqlDsl.g:1497:1: ( ( rule__Creation__Group_4__0 )? )
            {
            // InternalSqlDsl.g:1497:1: ( ( rule__Creation__Group_4__0 )? )
            // InternalSqlDsl.g:1498:2: ( rule__Creation__Group_4__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_4()); 
            // InternalSqlDsl.g:1499:2: ( rule__Creation__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSqlDsl.g:1499:3: rule__Creation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Creation__Group__4__Impl"


    // $ANTLR start "rule__Creation__Group__5"
    // InternalSqlDsl.g:1507:1: rule__Creation__Group__5 : rule__Creation__Group__5__Impl rule__Creation__Group__6 ;
    public final void rule__Creation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1511:1: ( rule__Creation__Group__5__Impl rule__Creation__Group__6 )
            // InternalSqlDsl.g:1512:2: rule__Creation__Group__5__Impl rule__Creation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Creation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group__6();

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
    // $ANTLR end "rule__Creation__Group__5"


    // $ANTLR start "rule__Creation__Group__5__Impl"
    // InternalSqlDsl.g:1519:1: rule__Creation__Group__5__Impl : ( ( rule__Creation__Group_5__0 )? ) ;
    public final void rule__Creation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1523:1: ( ( ( rule__Creation__Group_5__0 )? ) )
            // InternalSqlDsl.g:1524:1: ( ( rule__Creation__Group_5__0 )? )
            {
            // InternalSqlDsl.g:1524:1: ( ( rule__Creation__Group_5__0 )? )
            // InternalSqlDsl.g:1525:2: ( rule__Creation__Group_5__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_5()); 
            // InternalSqlDsl.g:1526:2: ( rule__Creation__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlDsl.g:1526:3: rule__Creation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Creation__Group__5__Impl"


    // $ANTLR start "rule__Creation__Group__6"
    // InternalSqlDsl.g:1534:1: rule__Creation__Group__6 : rule__Creation__Group__6__Impl ;
    public final void rule__Creation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1538:1: ( rule__Creation__Group__6__Impl )
            // InternalSqlDsl.g:1539:2: rule__Creation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group__6__Impl();

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
    // $ANTLR end "rule__Creation__Group__6"


    // $ANTLR start "rule__Creation__Group__6__Impl"
    // InternalSqlDsl.g:1545:1: rule__Creation__Group__6__Impl : ( '}' ) ;
    public final void rule__Creation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1549:1: ( ( '}' ) )
            // InternalSqlDsl.g:1550:1: ( '}' )
            {
            // InternalSqlDsl.g:1550:1: ( '}' )
            // InternalSqlDsl.g:1551:2: '}'
            {
             before(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Creation__Group__6__Impl"


    // $ANTLR start "rule__Creation__Group_3__0"
    // InternalSqlDsl.g:1561:1: rule__Creation__Group_3__0 : rule__Creation__Group_3__0__Impl rule__Creation__Group_3__1 ;
    public final void rule__Creation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1565:1: ( rule__Creation__Group_3__0__Impl rule__Creation__Group_3__1 )
            // InternalSqlDsl.g:1566:2: rule__Creation__Group_3__0__Impl rule__Creation__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Creation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_3__1();

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
    // $ANTLR end "rule__Creation__Group_3__0"


    // $ANTLR start "rule__Creation__Group_3__0__Impl"
    // InternalSqlDsl.g:1573:1: rule__Creation__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Creation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1577:1: ( ( 'type' ) )
            // InternalSqlDsl.g:1578:1: ( 'type' )
            {
            // InternalSqlDsl.g:1578:1: ( 'type' )
            // InternalSqlDsl.g:1579:2: 'type'
            {
             before(grammarAccess.getCreationAccess().getTypeKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__Creation__Group_3__0__Impl"


    // $ANTLR start "rule__Creation__Group_3__1"
    // InternalSqlDsl.g:1588:1: rule__Creation__Group_3__1 : rule__Creation__Group_3__1__Impl ;
    public final void rule__Creation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1592:1: ( rule__Creation__Group_3__1__Impl )
            // InternalSqlDsl.g:1593:2: rule__Creation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Creation__Group_3__1"


    // $ANTLR start "rule__Creation__Group_3__1__Impl"
    // InternalSqlDsl.g:1599:1: rule__Creation__Group_3__1__Impl : ( ( rule__Creation__TypeAssignment_3_1 ) ) ;
    public final void rule__Creation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1603:1: ( ( ( rule__Creation__TypeAssignment_3_1 ) ) )
            // InternalSqlDsl.g:1604:1: ( ( rule__Creation__TypeAssignment_3_1 ) )
            {
            // InternalSqlDsl.g:1604:1: ( ( rule__Creation__TypeAssignment_3_1 ) )
            // InternalSqlDsl.g:1605:2: ( rule__Creation__TypeAssignment_3_1 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_3_1()); 
            // InternalSqlDsl.g:1606:2: ( rule__Creation__TypeAssignment_3_1 )
            // InternalSqlDsl.g:1606:3: rule__Creation__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Creation__Group_3__1__Impl"


    // $ANTLR start "rule__Creation__Group_4__0"
    // InternalSqlDsl.g:1615:1: rule__Creation__Group_4__0 : rule__Creation__Group_4__0__Impl rule__Creation__Group_4__1 ;
    public final void rule__Creation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1619:1: ( rule__Creation__Group_4__0__Impl rule__Creation__Group_4__1 )
            // InternalSqlDsl.g:1620:2: rule__Creation__Group_4__0__Impl rule__Creation__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Creation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_4__1();

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
    // $ANTLR end "rule__Creation__Group_4__0"


    // $ANTLR start "rule__Creation__Group_4__0__Impl"
    // InternalSqlDsl.g:1627:1: rule__Creation__Group_4__0__Impl : ( 'objects' ) ;
    public final void rule__Creation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1631:1: ( ( 'objects' ) )
            // InternalSqlDsl.g:1632:1: ( 'objects' )
            {
            // InternalSqlDsl.g:1632:1: ( 'objects' )
            // InternalSqlDsl.g:1633:2: 'objects'
            {
             before(grammarAccess.getCreationAccess().getObjectsKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getObjectsKeyword_4_0()); 

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
    // $ANTLR end "rule__Creation__Group_4__0__Impl"


    // $ANTLR start "rule__Creation__Group_4__1"
    // InternalSqlDsl.g:1642:1: rule__Creation__Group_4__1 : rule__Creation__Group_4__1__Impl rule__Creation__Group_4__2 ;
    public final void rule__Creation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1646:1: ( rule__Creation__Group_4__1__Impl rule__Creation__Group_4__2 )
            // InternalSqlDsl.g:1647:2: rule__Creation__Group_4__1__Impl rule__Creation__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Creation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_4__2();

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
    // $ANTLR end "rule__Creation__Group_4__1"


    // $ANTLR start "rule__Creation__Group_4__1__Impl"
    // InternalSqlDsl.g:1654:1: rule__Creation__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Creation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1658:1: ( ( '{' ) )
            // InternalSqlDsl.g:1659:1: ( '{' )
            {
            // InternalSqlDsl.g:1659:1: ( '{' )
            // InternalSqlDsl.g:1660:2: '{'
            {
             before(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Creation__Group_4__1__Impl"


    // $ANTLR start "rule__Creation__Group_4__2"
    // InternalSqlDsl.g:1669:1: rule__Creation__Group_4__2 : rule__Creation__Group_4__2__Impl rule__Creation__Group_4__3 ;
    public final void rule__Creation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1673:1: ( rule__Creation__Group_4__2__Impl rule__Creation__Group_4__3 )
            // InternalSqlDsl.g:1674:2: rule__Creation__Group_4__2__Impl rule__Creation__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Creation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_4__3();

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
    // $ANTLR end "rule__Creation__Group_4__2"


    // $ANTLR start "rule__Creation__Group_4__2__Impl"
    // InternalSqlDsl.g:1681:1: rule__Creation__Group_4__2__Impl : ( ( rule__Creation__ObjectsAssignment_4_2 ) ) ;
    public final void rule__Creation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1685:1: ( ( ( rule__Creation__ObjectsAssignment_4_2 ) ) )
            // InternalSqlDsl.g:1686:1: ( ( rule__Creation__ObjectsAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:1686:1: ( ( rule__Creation__ObjectsAssignment_4_2 ) )
            // InternalSqlDsl.g:1687:2: ( rule__Creation__ObjectsAssignment_4_2 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_4_2()); 
            // InternalSqlDsl.g:1688:2: ( rule__Creation__ObjectsAssignment_4_2 )
            // InternalSqlDsl.g:1688:3: rule__Creation__ObjectsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ObjectsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getObjectsAssignment_4_2()); 

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
    // $ANTLR end "rule__Creation__Group_4__2__Impl"


    // $ANTLR start "rule__Creation__Group_4__3"
    // InternalSqlDsl.g:1696:1: rule__Creation__Group_4__3 : rule__Creation__Group_4__3__Impl rule__Creation__Group_4__4 ;
    public final void rule__Creation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1700:1: ( rule__Creation__Group_4__3__Impl rule__Creation__Group_4__4 )
            // InternalSqlDsl.g:1701:2: rule__Creation__Group_4__3__Impl rule__Creation__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Creation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_4__4();

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
    // $ANTLR end "rule__Creation__Group_4__3"


    // $ANTLR start "rule__Creation__Group_4__3__Impl"
    // InternalSqlDsl.g:1708:1: rule__Creation__Group_4__3__Impl : ( ( rule__Creation__Group_4_3__0 )* ) ;
    public final void rule__Creation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1712:1: ( ( ( rule__Creation__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:1713:1: ( ( rule__Creation__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:1713:1: ( ( rule__Creation__Group_4_3__0 )* )
            // InternalSqlDsl.g:1714:2: ( rule__Creation__Group_4_3__0 )*
            {
             before(grammarAccess.getCreationAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:1715:2: ( rule__Creation__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSqlDsl.g:1715:3: rule__Creation__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Creation__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCreationAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Creation__Group_4__3__Impl"


    // $ANTLR start "rule__Creation__Group_4__4"
    // InternalSqlDsl.g:1723:1: rule__Creation__Group_4__4 : rule__Creation__Group_4__4__Impl ;
    public final void rule__Creation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1727:1: ( rule__Creation__Group_4__4__Impl )
            // InternalSqlDsl.g:1728:2: rule__Creation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_4__4__Impl();

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
    // $ANTLR end "rule__Creation__Group_4__4"


    // $ANTLR start "rule__Creation__Group_4__4__Impl"
    // InternalSqlDsl.g:1734:1: rule__Creation__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Creation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1738:1: ( ( '}' ) )
            // InternalSqlDsl.g:1739:1: ( '}' )
            {
            // InternalSqlDsl.g:1739:1: ( '}' )
            // InternalSqlDsl.g:1740:2: '}'
            {
             before(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Creation__Group_4__4__Impl"


    // $ANTLR start "rule__Creation__Group_4_3__0"
    // InternalSqlDsl.g:1750:1: rule__Creation__Group_4_3__0 : rule__Creation__Group_4_3__0__Impl rule__Creation__Group_4_3__1 ;
    public final void rule__Creation__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1754:1: ( rule__Creation__Group_4_3__0__Impl rule__Creation__Group_4_3__1 )
            // InternalSqlDsl.g:1755:2: rule__Creation__Group_4_3__0__Impl rule__Creation__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Creation__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_4_3__1();

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
    // $ANTLR end "rule__Creation__Group_4_3__0"


    // $ANTLR start "rule__Creation__Group_4_3__0__Impl"
    // InternalSqlDsl.g:1762:1: rule__Creation__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Creation__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1766:1: ( ( ',' ) )
            // InternalSqlDsl.g:1767:1: ( ',' )
            {
            // InternalSqlDsl.g:1767:1: ( ',' )
            // InternalSqlDsl.g:1768:2: ','
            {
             before(grammarAccess.getCreationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Creation__Group_4_3__0__Impl"


    // $ANTLR start "rule__Creation__Group_4_3__1"
    // InternalSqlDsl.g:1777:1: rule__Creation__Group_4_3__1 : rule__Creation__Group_4_3__1__Impl ;
    public final void rule__Creation__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1781:1: ( rule__Creation__Group_4_3__1__Impl )
            // InternalSqlDsl.g:1782:2: rule__Creation__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Creation__Group_4_3__1"


    // $ANTLR start "rule__Creation__Group_4_3__1__Impl"
    // InternalSqlDsl.g:1788:1: rule__Creation__Group_4_3__1__Impl : ( ( rule__Creation__ObjectsAssignment_4_3_1 ) ) ;
    public final void rule__Creation__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1792:1: ( ( ( rule__Creation__ObjectsAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:1793:1: ( ( rule__Creation__ObjectsAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:1793:1: ( ( rule__Creation__ObjectsAssignment_4_3_1 ) )
            // InternalSqlDsl.g:1794:2: ( rule__Creation__ObjectsAssignment_4_3_1 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_4_3_1()); 
            // InternalSqlDsl.g:1795:2: ( rule__Creation__ObjectsAssignment_4_3_1 )
            // InternalSqlDsl.g:1795:3: rule__Creation__ObjectsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ObjectsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getObjectsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Creation__Group_4_3__1__Impl"


    // $ANTLR start "rule__Creation__Group_5__0"
    // InternalSqlDsl.g:1804:1: rule__Creation__Group_5__0 : rule__Creation__Group_5__0__Impl rule__Creation__Group_5__1 ;
    public final void rule__Creation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1808:1: ( rule__Creation__Group_5__0__Impl rule__Creation__Group_5__1 )
            // InternalSqlDsl.g:1809:2: rule__Creation__Group_5__0__Impl rule__Creation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Creation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_5__1();

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
    // $ANTLR end "rule__Creation__Group_5__0"


    // $ANTLR start "rule__Creation__Group_5__0__Impl"
    // InternalSqlDsl.g:1816:1: rule__Creation__Group_5__0__Impl : ( 'constaints' ) ;
    public final void rule__Creation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1820:1: ( ( 'constaints' ) )
            // InternalSqlDsl.g:1821:1: ( 'constaints' )
            {
            // InternalSqlDsl.g:1821:1: ( 'constaints' )
            // InternalSqlDsl.g:1822:2: 'constaints'
            {
             before(grammarAccess.getCreationAccess().getConstaintsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getConstaintsKeyword_5_0()); 

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
    // $ANTLR end "rule__Creation__Group_5__0__Impl"


    // $ANTLR start "rule__Creation__Group_5__1"
    // InternalSqlDsl.g:1831:1: rule__Creation__Group_5__1 : rule__Creation__Group_5__1__Impl rule__Creation__Group_5__2 ;
    public final void rule__Creation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1835:1: ( rule__Creation__Group_5__1__Impl rule__Creation__Group_5__2 )
            // InternalSqlDsl.g:1836:2: rule__Creation__Group_5__1__Impl rule__Creation__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Creation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_5__2();

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
    // $ANTLR end "rule__Creation__Group_5__1"


    // $ANTLR start "rule__Creation__Group_5__1__Impl"
    // InternalSqlDsl.g:1843:1: rule__Creation__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Creation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1847:1: ( ( '{' ) )
            // InternalSqlDsl.g:1848:1: ( '{' )
            {
            // InternalSqlDsl.g:1848:1: ( '{' )
            // InternalSqlDsl.g:1849:2: '{'
            {
             before(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Creation__Group_5__1__Impl"


    // $ANTLR start "rule__Creation__Group_5__2"
    // InternalSqlDsl.g:1858:1: rule__Creation__Group_5__2 : rule__Creation__Group_5__2__Impl rule__Creation__Group_5__3 ;
    public final void rule__Creation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1862:1: ( rule__Creation__Group_5__2__Impl rule__Creation__Group_5__3 )
            // InternalSqlDsl.g:1863:2: rule__Creation__Group_5__2__Impl rule__Creation__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Creation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_5__3();

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
    // $ANTLR end "rule__Creation__Group_5__2"


    // $ANTLR start "rule__Creation__Group_5__2__Impl"
    // InternalSqlDsl.g:1870:1: rule__Creation__Group_5__2__Impl : ( ( rule__Creation__ConstaintsAssignment_5_2 ) ) ;
    public final void rule__Creation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1874:1: ( ( ( rule__Creation__ConstaintsAssignment_5_2 ) ) )
            // InternalSqlDsl.g:1875:1: ( ( rule__Creation__ConstaintsAssignment_5_2 ) )
            {
            // InternalSqlDsl.g:1875:1: ( ( rule__Creation__ConstaintsAssignment_5_2 ) )
            // InternalSqlDsl.g:1876:2: ( rule__Creation__ConstaintsAssignment_5_2 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_5_2()); 
            // InternalSqlDsl.g:1877:2: ( rule__Creation__ConstaintsAssignment_5_2 )
            // InternalSqlDsl.g:1877:3: rule__Creation__ConstaintsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ConstaintsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getConstaintsAssignment_5_2()); 

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
    // $ANTLR end "rule__Creation__Group_5__2__Impl"


    // $ANTLR start "rule__Creation__Group_5__3"
    // InternalSqlDsl.g:1885:1: rule__Creation__Group_5__3 : rule__Creation__Group_5__3__Impl rule__Creation__Group_5__4 ;
    public final void rule__Creation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1889:1: ( rule__Creation__Group_5__3__Impl rule__Creation__Group_5__4 )
            // InternalSqlDsl.g:1890:2: rule__Creation__Group_5__3__Impl rule__Creation__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__Creation__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_5__4();

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
    // $ANTLR end "rule__Creation__Group_5__3"


    // $ANTLR start "rule__Creation__Group_5__3__Impl"
    // InternalSqlDsl.g:1897:1: rule__Creation__Group_5__3__Impl : ( ( rule__Creation__Group_5_3__0 )* ) ;
    public final void rule__Creation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1901:1: ( ( ( rule__Creation__Group_5_3__0 )* ) )
            // InternalSqlDsl.g:1902:1: ( ( rule__Creation__Group_5_3__0 )* )
            {
            // InternalSqlDsl.g:1902:1: ( ( rule__Creation__Group_5_3__0 )* )
            // InternalSqlDsl.g:1903:2: ( rule__Creation__Group_5_3__0 )*
            {
             before(grammarAccess.getCreationAccess().getGroup_5_3()); 
            // InternalSqlDsl.g:1904:2: ( rule__Creation__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSqlDsl.g:1904:3: rule__Creation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Creation__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCreationAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Creation__Group_5__3__Impl"


    // $ANTLR start "rule__Creation__Group_5__4"
    // InternalSqlDsl.g:1912:1: rule__Creation__Group_5__4 : rule__Creation__Group_5__4__Impl ;
    public final void rule__Creation__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1916:1: ( rule__Creation__Group_5__4__Impl )
            // InternalSqlDsl.g:1917:2: rule__Creation__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_5__4__Impl();

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
    // $ANTLR end "rule__Creation__Group_5__4"


    // $ANTLR start "rule__Creation__Group_5__4__Impl"
    // InternalSqlDsl.g:1923:1: rule__Creation__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Creation__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1927:1: ( ( '}' ) )
            // InternalSqlDsl.g:1928:1: ( '}' )
            {
            // InternalSqlDsl.g:1928:1: ( '}' )
            // InternalSqlDsl.g:1929:2: '}'
            {
             before(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Creation__Group_5__4__Impl"


    // $ANTLR start "rule__Creation__Group_5_3__0"
    // InternalSqlDsl.g:1939:1: rule__Creation__Group_5_3__0 : rule__Creation__Group_5_3__0__Impl rule__Creation__Group_5_3__1 ;
    public final void rule__Creation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1943:1: ( rule__Creation__Group_5_3__0__Impl rule__Creation__Group_5_3__1 )
            // InternalSqlDsl.g:1944:2: rule__Creation__Group_5_3__0__Impl rule__Creation__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Creation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_5_3__1();

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
    // $ANTLR end "rule__Creation__Group_5_3__0"


    // $ANTLR start "rule__Creation__Group_5_3__0__Impl"
    // InternalSqlDsl.g:1951:1: rule__Creation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Creation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1955:1: ( ( ',' ) )
            // InternalSqlDsl.g:1956:1: ( ',' )
            {
            // InternalSqlDsl.g:1956:1: ( ',' )
            // InternalSqlDsl.g:1957:2: ','
            {
             before(grammarAccess.getCreationAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Creation__Group_5_3__0__Impl"


    // $ANTLR start "rule__Creation__Group_5_3__1"
    // InternalSqlDsl.g:1966:1: rule__Creation__Group_5_3__1 : rule__Creation__Group_5_3__1__Impl ;
    public final void rule__Creation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1970:1: ( rule__Creation__Group_5_3__1__Impl )
            // InternalSqlDsl.g:1971:2: rule__Creation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Creation__Group_5_3__1"


    // $ANTLR start "rule__Creation__Group_5_3__1__Impl"
    // InternalSqlDsl.g:1977:1: rule__Creation__Group_5_3__1__Impl : ( ( rule__Creation__ConstaintsAssignment_5_3_1 ) ) ;
    public final void rule__Creation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1981:1: ( ( ( rule__Creation__ConstaintsAssignment_5_3_1 ) ) )
            // InternalSqlDsl.g:1982:1: ( ( rule__Creation__ConstaintsAssignment_5_3_1 ) )
            {
            // InternalSqlDsl.g:1982:1: ( ( rule__Creation__ConstaintsAssignment_5_3_1 ) )
            // InternalSqlDsl.g:1983:2: ( rule__Creation__ConstaintsAssignment_5_3_1 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_5_3_1()); 
            // InternalSqlDsl.g:1984:2: ( rule__Creation__ConstaintsAssignment_5_3_1 )
            // InternalSqlDsl.g:1984:3: rule__Creation__ConstaintsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ConstaintsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getConstaintsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Creation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalSqlDsl.g:1993:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1997:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalSqlDsl.g:1998:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSqlDsl.g:2005:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2009:1: ( ( () ) )
            // InternalSqlDsl.g:2010:1: ( () )
            {
            // InternalSqlDsl.g:2010:1: ( () )
            // InternalSqlDsl.g:2011:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalSqlDsl.g:2012:2: ()
            // InternalSqlDsl.g:2012:3: 
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
    // InternalSqlDsl.g:2020:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2024:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalSqlDsl.g:2025:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:2032:1: rule__Update__Group__1__Impl : ( 'Update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2036:1: ( ( 'Update' ) )
            // InternalSqlDsl.g:2037:1: ( 'Update' )
            {
            // InternalSqlDsl.g:2037:1: ( 'Update' )
            // InternalSqlDsl.g:2038:2: 'Update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 

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
    // InternalSqlDsl.g:2047:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2051:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalSqlDsl.g:2052:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:2059:1: rule__Update__Group__2__Impl : ( '{' ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2063:1: ( ( '{' ) )
            // InternalSqlDsl.g:2064:1: ( '{' )
            {
            // InternalSqlDsl.g:2064:1: ( '{' )
            // InternalSqlDsl.g:2065:2: '{'
            {
             before(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSqlDsl.g:2074:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2078:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalSqlDsl.g:2079:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:2086:1: rule__Update__Group__3__Impl : ( ( rule__Update__Group_3__0 )? ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2090:1: ( ( ( rule__Update__Group_3__0 )? ) )
            // InternalSqlDsl.g:2091:1: ( ( rule__Update__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2091:1: ( ( rule__Update__Group_3__0 )? )
            // InternalSqlDsl.g:2092:2: ( rule__Update__Group_3__0 )?
            {
             before(grammarAccess.getUpdateAccess().getGroup_3()); 
            // InternalSqlDsl.g:2093:2: ( rule__Update__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:2093:3: rule__Update__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Update__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateAccess().getGroup_3()); 

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
    // InternalSqlDsl.g:2101:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2105:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalSqlDsl.g:2106:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Update__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__5();

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
    // InternalSqlDsl.g:2113:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )? ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2117:1: ( ( ( rule__Update__Group_4__0 )? ) )
            // InternalSqlDsl.g:2118:1: ( ( rule__Update__Group_4__0 )? )
            {
            // InternalSqlDsl.g:2118:1: ( ( rule__Update__Group_4__0 )? )
            // InternalSqlDsl.g:2119:2: ( rule__Update__Group_4__0 )?
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalSqlDsl.g:2120:2: ( rule__Update__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSqlDsl.g:2120:3: rule__Update__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Update__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__Update__Group__5"
    // InternalSqlDsl.g:2128:1: rule__Update__Group__5 : rule__Update__Group__5__Impl ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2132:1: ( rule__Update__Group__5__Impl )
            // InternalSqlDsl.g:2133:2: rule__Update__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__5__Impl();

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
    // $ANTLR end "rule__Update__Group__5"


    // $ANTLR start "rule__Update__Group__5__Impl"
    // InternalSqlDsl.g:2139:1: rule__Update__Group__5__Impl : ( '}' ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2143:1: ( ( '}' ) )
            // InternalSqlDsl.g:2144:1: ( '}' )
            {
            // InternalSqlDsl.g:2144:1: ( '}' )
            // InternalSqlDsl.g:2145:2: '}'
            {
             before(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Update__Group__5__Impl"


    // $ANTLR start "rule__Update__Group_3__0"
    // InternalSqlDsl.g:2155:1: rule__Update__Group_3__0 : rule__Update__Group_3__0__Impl rule__Update__Group_3__1 ;
    public final void rule__Update__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2159:1: ( rule__Update__Group_3__0__Impl rule__Update__Group_3__1 )
            // InternalSqlDsl.g:2160:2: rule__Update__Group_3__0__Impl rule__Update__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Update__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_3__1();

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
    // $ANTLR end "rule__Update__Group_3__0"


    // $ANTLR start "rule__Update__Group_3__0__Impl"
    // InternalSqlDsl.g:2167:1: rule__Update__Group_3__0__Impl : ( 'objects' ) ;
    public final void rule__Update__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2171:1: ( ( 'objects' ) )
            // InternalSqlDsl.g:2172:1: ( 'objects' )
            {
            // InternalSqlDsl.g:2172:1: ( 'objects' )
            // InternalSqlDsl.g:2173:2: 'objects'
            {
             before(grammarAccess.getUpdateAccess().getObjectsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getObjectsKeyword_3_0()); 

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
    // $ANTLR end "rule__Update__Group_3__0__Impl"


    // $ANTLR start "rule__Update__Group_3__1"
    // InternalSqlDsl.g:2182:1: rule__Update__Group_3__1 : rule__Update__Group_3__1__Impl rule__Update__Group_3__2 ;
    public final void rule__Update__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2186:1: ( rule__Update__Group_3__1__Impl rule__Update__Group_3__2 )
            // InternalSqlDsl.g:2187:2: rule__Update__Group_3__1__Impl rule__Update__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Update__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_3__2();

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
    // $ANTLR end "rule__Update__Group_3__1"


    // $ANTLR start "rule__Update__Group_3__1__Impl"
    // InternalSqlDsl.g:2194:1: rule__Update__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Update__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2198:1: ( ( '{' ) )
            // InternalSqlDsl.g:2199:1: ( '{' )
            {
            // InternalSqlDsl.g:2199:1: ( '{' )
            // InternalSqlDsl.g:2200:2: '{'
            {
             before(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Update__Group_3__1__Impl"


    // $ANTLR start "rule__Update__Group_3__2"
    // InternalSqlDsl.g:2209:1: rule__Update__Group_3__2 : rule__Update__Group_3__2__Impl rule__Update__Group_3__3 ;
    public final void rule__Update__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2213:1: ( rule__Update__Group_3__2__Impl rule__Update__Group_3__3 )
            // InternalSqlDsl.g:2214:2: rule__Update__Group_3__2__Impl rule__Update__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Update__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_3__3();

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
    // $ANTLR end "rule__Update__Group_3__2"


    // $ANTLR start "rule__Update__Group_3__2__Impl"
    // InternalSqlDsl.g:2221:1: rule__Update__Group_3__2__Impl : ( ( rule__Update__ObjectsAssignment_3_2 ) ) ;
    public final void rule__Update__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2225:1: ( ( ( rule__Update__ObjectsAssignment_3_2 ) ) )
            // InternalSqlDsl.g:2226:1: ( ( rule__Update__ObjectsAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:2226:1: ( ( rule__Update__ObjectsAssignment_3_2 ) )
            // InternalSqlDsl.g:2227:2: ( rule__Update__ObjectsAssignment_3_2 )
            {
             before(grammarAccess.getUpdateAccess().getObjectsAssignment_3_2()); 
            // InternalSqlDsl.g:2228:2: ( rule__Update__ObjectsAssignment_3_2 )
            // InternalSqlDsl.g:2228:3: rule__Update__ObjectsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__ObjectsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getObjectsAssignment_3_2()); 

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
    // $ANTLR end "rule__Update__Group_3__2__Impl"


    // $ANTLR start "rule__Update__Group_3__3"
    // InternalSqlDsl.g:2236:1: rule__Update__Group_3__3 : rule__Update__Group_3__3__Impl rule__Update__Group_3__4 ;
    public final void rule__Update__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2240:1: ( rule__Update__Group_3__3__Impl rule__Update__Group_3__4 )
            // InternalSqlDsl.g:2241:2: rule__Update__Group_3__3__Impl rule__Update__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Update__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_3__4();

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
    // $ANTLR end "rule__Update__Group_3__3"


    // $ANTLR start "rule__Update__Group_3__3__Impl"
    // InternalSqlDsl.g:2248:1: rule__Update__Group_3__3__Impl : ( ( rule__Update__Group_3_3__0 )* ) ;
    public final void rule__Update__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2252:1: ( ( ( rule__Update__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:2253:1: ( ( rule__Update__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:2253:1: ( ( rule__Update__Group_3_3__0 )* )
            // InternalSqlDsl.g:2254:2: ( rule__Update__Group_3_3__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:2255:2: ( rule__Update__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSqlDsl.g:2255:3: rule__Update__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Update__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Update__Group_3__3__Impl"


    // $ANTLR start "rule__Update__Group_3__4"
    // InternalSqlDsl.g:2263:1: rule__Update__Group_3__4 : rule__Update__Group_3__4__Impl ;
    public final void rule__Update__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2267:1: ( rule__Update__Group_3__4__Impl )
            // InternalSqlDsl.g:2268:2: rule__Update__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_3__4__Impl();

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
    // $ANTLR end "rule__Update__Group_3__4"


    // $ANTLR start "rule__Update__Group_3__4__Impl"
    // InternalSqlDsl.g:2274:1: rule__Update__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Update__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2278:1: ( ( '}' ) )
            // InternalSqlDsl.g:2279:1: ( '}' )
            {
            // InternalSqlDsl.g:2279:1: ( '}' )
            // InternalSqlDsl.g:2280:2: '}'
            {
             before(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Update__Group_3__4__Impl"


    // $ANTLR start "rule__Update__Group_3_3__0"
    // InternalSqlDsl.g:2290:1: rule__Update__Group_3_3__0 : rule__Update__Group_3_3__0__Impl rule__Update__Group_3_3__1 ;
    public final void rule__Update__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2294:1: ( rule__Update__Group_3_3__0__Impl rule__Update__Group_3_3__1 )
            // InternalSqlDsl.g:2295:2: rule__Update__Group_3_3__0__Impl rule__Update__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Update__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_3_3__1();

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
    // $ANTLR end "rule__Update__Group_3_3__0"


    // $ANTLR start "rule__Update__Group_3_3__0__Impl"
    // InternalSqlDsl.g:2302:1: rule__Update__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2306:1: ( ( ',' ) )
            // InternalSqlDsl.g:2307:1: ( ',' )
            {
            // InternalSqlDsl.g:2307:1: ( ',' )
            // InternalSqlDsl.g:2308:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Update__Group_3_3__0__Impl"


    // $ANTLR start "rule__Update__Group_3_3__1"
    // InternalSqlDsl.g:2317:1: rule__Update__Group_3_3__1 : rule__Update__Group_3_3__1__Impl ;
    public final void rule__Update__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2321:1: ( rule__Update__Group_3_3__1__Impl )
            // InternalSqlDsl.g:2322:2: rule__Update__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Update__Group_3_3__1"


    // $ANTLR start "rule__Update__Group_3_3__1__Impl"
    // InternalSqlDsl.g:2328:1: rule__Update__Group_3_3__1__Impl : ( ( rule__Update__ObjectsAssignment_3_3_1 ) ) ;
    public final void rule__Update__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2332:1: ( ( ( rule__Update__ObjectsAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:2333:1: ( ( rule__Update__ObjectsAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:2333:1: ( ( rule__Update__ObjectsAssignment_3_3_1 ) )
            // InternalSqlDsl.g:2334:2: ( rule__Update__ObjectsAssignment_3_3_1 )
            {
             before(grammarAccess.getUpdateAccess().getObjectsAssignment_3_3_1()); 
            // InternalSqlDsl.g:2335:2: ( rule__Update__ObjectsAssignment_3_3_1 )
            // InternalSqlDsl.g:2335:3: rule__Update__ObjectsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__ObjectsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getObjectsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Update__Group_3_3__1__Impl"


    // $ANTLR start "rule__Update__Group_4__0"
    // InternalSqlDsl.g:2344:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2348:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalSqlDsl.g:2349:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:2356:1: rule__Update__Group_4__0__Impl : ( 'clauses' ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2360:1: ( ( 'clauses' ) )
            // InternalSqlDsl.g:2361:1: ( 'clauses' )
            {
            // InternalSqlDsl.g:2361:1: ( 'clauses' )
            // InternalSqlDsl.g:2362:2: 'clauses'
            {
             before(grammarAccess.getUpdateAccess().getClausesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getClausesKeyword_4_0()); 

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
    // InternalSqlDsl.g:2371:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl rule__Update__Group_4__2 ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2375:1: ( rule__Update__Group_4__1__Impl rule__Update__Group_4__2 )
            // InternalSqlDsl.g:2376:2: rule__Update__Group_4__1__Impl rule__Update__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Update__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__2();

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
    // InternalSqlDsl.g:2383:1: rule__Update__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2387:1: ( ( '{' ) )
            // InternalSqlDsl.g:2388:1: ( '{' )
            {
            // InternalSqlDsl.g:2388:1: ( '{' )
            // InternalSqlDsl.g:2389:2: '{'
            {
             before(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_4_1()); 

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


    // $ANTLR start "rule__Update__Group_4__2"
    // InternalSqlDsl.g:2398:1: rule__Update__Group_4__2 : rule__Update__Group_4__2__Impl rule__Update__Group_4__3 ;
    public final void rule__Update__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2402:1: ( rule__Update__Group_4__2__Impl rule__Update__Group_4__3 )
            // InternalSqlDsl.g:2403:2: rule__Update__Group_4__2__Impl rule__Update__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Update__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__3();

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
    // $ANTLR end "rule__Update__Group_4__2"


    // $ANTLR start "rule__Update__Group_4__2__Impl"
    // InternalSqlDsl.g:2410:1: rule__Update__Group_4__2__Impl : ( ( rule__Update__ClausesAssignment_4_2 ) ) ;
    public final void rule__Update__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2414:1: ( ( ( rule__Update__ClausesAssignment_4_2 ) ) )
            // InternalSqlDsl.g:2415:1: ( ( rule__Update__ClausesAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:2415:1: ( ( rule__Update__ClausesAssignment_4_2 ) )
            // InternalSqlDsl.g:2416:2: ( rule__Update__ClausesAssignment_4_2 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_4_2()); 
            // InternalSqlDsl.g:2417:2: ( rule__Update__ClausesAssignment_4_2 )
            // InternalSqlDsl.g:2417:3: rule__Update__ClausesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__ClausesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getClausesAssignment_4_2()); 

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
    // $ANTLR end "rule__Update__Group_4__2__Impl"


    // $ANTLR start "rule__Update__Group_4__3"
    // InternalSqlDsl.g:2425:1: rule__Update__Group_4__3 : rule__Update__Group_4__3__Impl rule__Update__Group_4__4 ;
    public final void rule__Update__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2429:1: ( rule__Update__Group_4__3__Impl rule__Update__Group_4__4 )
            // InternalSqlDsl.g:2430:2: rule__Update__Group_4__3__Impl rule__Update__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Update__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4__4();

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
    // $ANTLR end "rule__Update__Group_4__3"


    // $ANTLR start "rule__Update__Group_4__3__Impl"
    // InternalSqlDsl.g:2437:1: rule__Update__Group_4__3__Impl : ( ( rule__Update__Group_4_3__0 )* ) ;
    public final void rule__Update__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2441:1: ( ( ( rule__Update__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:2442:1: ( ( rule__Update__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:2442:1: ( ( rule__Update__Group_4_3__0 )* )
            // InternalSqlDsl.g:2443:2: ( rule__Update__Group_4_3__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:2444:2: ( rule__Update__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSqlDsl.g:2444:3: rule__Update__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Update__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Update__Group_4__3__Impl"


    // $ANTLR start "rule__Update__Group_4__4"
    // InternalSqlDsl.g:2452:1: rule__Update__Group_4__4 : rule__Update__Group_4__4__Impl ;
    public final void rule__Update__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2456:1: ( rule__Update__Group_4__4__Impl )
            // InternalSqlDsl.g:2457:2: rule__Update__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_4__4__Impl();

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
    // $ANTLR end "rule__Update__Group_4__4"


    // $ANTLR start "rule__Update__Group_4__4__Impl"
    // InternalSqlDsl.g:2463:1: rule__Update__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Update__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2467:1: ( ( '}' ) )
            // InternalSqlDsl.g:2468:1: ( '}' )
            {
            // InternalSqlDsl.g:2468:1: ( '}' )
            // InternalSqlDsl.g:2469:2: '}'
            {
             before(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Update__Group_4__4__Impl"


    // $ANTLR start "rule__Update__Group_4_3__0"
    // InternalSqlDsl.g:2479:1: rule__Update__Group_4_3__0 : rule__Update__Group_4_3__0__Impl rule__Update__Group_4_3__1 ;
    public final void rule__Update__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2483:1: ( rule__Update__Group_4_3__0__Impl rule__Update__Group_4_3__1 )
            // InternalSqlDsl.g:2484:2: rule__Update__Group_4_3__0__Impl rule__Update__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Update__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_4_3__1();

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
    // $ANTLR end "rule__Update__Group_4_3__0"


    // $ANTLR start "rule__Update__Group_4_3__0__Impl"
    // InternalSqlDsl.g:2491:1: rule__Update__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2495:1: ( ( ',' ) )
            // InternalSqlDsl.g:2496:1: ( ',' )
            {
            // InternalSqlDsl.g:2496:1: ( ',' )
            // InternalSqlDsl.g:2497:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Update__Group_4_3__0__Impl"


    // $ANTLR start "rule__Update__Group_4_3__1"
    // InternalSqlDsl.g:2506:1: rule__Update__Group_4_3__1 : rule__Update__Group_4_3__1__Impl ;
    public final void rule__Update__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2510:1: ( rule__Update__Group_4_3__1__Impl )
            // InternalSqlDsl.g:2511:2: rule__Update__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Update__Group_4_3__1"


    // $ANTLR start "rule__Update__Group_4_3__1__Impl"
    // InternalSqlDsl.g:2517:1: rule__Update__Group_4_3__1__Impl : ( ( rule__Update__ClausesAssignment_4_3_1 ) ) ;
    public final void rule__Update__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2521:1: ( ( ( rule__Update__ClausesAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:2522:1: ( ( rule__Update__ClausesAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:2522:1: ( ( rule__Update__ClausesAssignment_4_3_1 ) )
            // InternalSqlDsl.g:2523:2: ( rule__Update__ClausesAssignment_4_3_1 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_4_3_1()); 
            // InternalSqlDsl.g:2524:2: ( rule__Update__ClausesAssignment_4_3_1 )
            // InternalSqlDsl.g:2524:3: rule__Update__ClausesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__ClausesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getClausesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Update__Group_4_3__1__Impl"


    // $ANTLR start "rule__Insertion__Group__0"
    // InternalSqlDsl.g:2533:1: rule__Insertion__Group__0 : rule__Insertion__Group__0__Impl rule__Insertion__Group__1 ;
    public final void rule__Insertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2537:1: ( rule__Insertion__Group__0__Impl rule__Insertion__Group__1 )
            // InternalSqlDsl.g:2538:2: rule__Insertion__Group__0__Impl rule__Insertion__Group__1
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
    // InternalSqlDsl.g:2545:1: rule__Insertion__Group__0__Impl : ( () ) ;
    public final void rule__Insertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2549:1: ( ( () ) )
            // InternalSqlDsl.g:2550:1: ( () )
            {
            // InternalSqlDsl.g:2550:1: ( () )
            // InternalSqlDsl.g:2551:2: ()
            {
             before(grammarAccess.getInsertionAccess().getInsertionAction_0()); 
            // InternalSqlDsl.g:2552:2: ()
            // InternalSqlDsl.g:2552:3: 
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
    // InternalSqlDsl.g:2560:1: rule__Insertion__Group__1 : rule__Insertion__Group__1__Impl rule__Insertion__Group__2 ;
    public final void rule__Insertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2564:1: ( rule__Insertion__Group__1__Impl rule__Insertion__Group__2 )
            // InternalSqlDsl.g:2565:2: rule__Insertion__Group__1__Impl rule__Insertion__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:2572:1: rule__Insertion__Group__1__Impl : ( 'Insertion' ) ;
    public final void rule__Insertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2576:1: ( ( 'Insertion' ) )
            // InternalSqlDsl.g:2577:1: ( 'Insertion' )
            {
            // InternalSqlDsl.g:2577:1: ( 'Insertion' )
            // InternalSqlDsl.g:2578:2: 'Insertion'
            {
             before(grammarAccess.getInsertionAccess().getInsertionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getInsertionKeyword_1()); 

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
    // InternalSqlDsl.g:2587:1: rule__Insertion__Group__2 : rule__Insertion__Group__2__Impl rule__Insertion__Group__3 ;
    public final void rule__Insertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2591:1: ( rule__Insertion__Group__2__Impl rule__Insertion__Group__3 )
            // InternalSqlDsl.g:2592:2: rule__Insertion__Group__2__Impl rule__Insertion__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSqlDsl.g:2599:1: rule__Insertion__Group__2__Impl : ( '{' ) ;
    public final void rule__Insertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2603:1: ( ( '{' ) )
            // InternalSqlDsl.g:2604:1: ( '{' )
            {
            // InternalSqlDsl.g:2604:1: ( '{' )
            // InternalSqlDsl.g:2605:2: '{'
            {
             before(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSqlDsl.g:2614:1: rule__Insertion__Group__3 : rule__Insertion__Group__3__Impl rule__Insertion__Group__4 ;
    public final void rule__Insertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2618:1: ( rule__Insertion__Group__3__Impl rule__Insertion__Group__4 )
            // InternalSqlDsl.g:2619:2: rule__Insertion__Group__3__Impl rule__Insertion__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSqlDsl.g:2626:1: rule__Insertion__Group__3__Impl : ( ( rule__Insertion__Group_3__0 )? ) ;
    public final void rule__Insertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2630:1: ( ( ( rule__Insertion__Group_3__0 )? ) )
            // InternalSqlDsl.g:2631:1: ( ( rule__Insertion__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2631:1: ( ( rule__Insertion__Group_3__0 )? )
            // InternalSqlDsl.g:2632:2: ( rule__Insertion__Group_3__0 )?
            {
             before(grammarAccess.getInsertionAccess().getGroup_3()); 
            // InternalSqlDsl.g:2633:2: ( rule__Insertion__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSqlDsl.g:2633:3: rule__Insertion__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insertion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInsertionAccess().getGroup_3()); 

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
    // InternalSqlDsl.g:2641:1: rule__Insertion__Group__4 : rule__Insertion__Group__4__Impl rule__Insertion__Group__5 ;
    public final void rule__Insertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2645:1: ( rule__Insertion__Group__4__Impl rule__Insertion__Group__5 )
            // InternalSqlDsl.g:2646:2: rule__Insertion__Group__4__Impl rule__Insertion__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalSqlDsl.g:2653:1: rule__Insertion__Group__4__Impl : ( ( rule__Insertion__Group_4__0 )? ) ;
    public final void rule__Insertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2657:1: ( ( ( rule__Insertion__Group_4__0 )? ) )
            // InternalSqlDsl.g:2658:1: ( ( rule__Insertion__Group_4__0 )? )
            {
            // InternalSqlDsl.g:2658:1: ( ( rule__Insertion__Group_4__0 )? )
            // InternalSqlDsl.g:2659:2: ( rule__Insertion__Group_4__0 )?
            {
             before(grammarAccess.getInsertionAccess().getGroup_4()); 
            // InternalSqlDsl.g:2660:2: ( rule__Insertion__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSqlDsl.g:2660:3: rule__Insertion__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insertion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInsertionAccess().getGroup_4()); 

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
    // InternalSqlDsl.g:2668:1: rule__Insertion__Group__5 : rule__Insertion__Group__5__Impl ;
    public final void rule__Insertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2672:1: ( rule__Insertion__Group__5__Impl )
            // InternalSqlDsl.g:2673:2: rule__Insertion__Group__5__Impl
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
    // InternalSqlDsl.g:2679:1: rule__Insertion__Group__5__Impl : ( '}' ) ;
    public final void rule__Insertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2683:1: ( ( '}' ) )
            // InternalSqlDsl.g:2684:1: ( '}' )
            {
            // InternalSqlDsl.g:2684:1: ( '}' )
            // InternalSqlDsl.g:2685:2: '}'
            {
             before(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Insertion__Group_3__0"
    // InternalSqlDsl.g:2695:1: rule__Insertion__Group_3__0 : rule__Insertion__Group_3__0__Impl rule__Insertion__Group_3__1 ;
    public final void rule__Insertion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2699:1: ( rule__Insertion__Group_3__0__Impl rule__Insertion__Group_3__1 )
            // InternalSqlDsl.g:2700:2: rule__Insertion__Group_3__0__Impl rule__Insertion__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Insertion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3__1();

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
    // $ANTLR end "rule__Insertion__Group_3__0"


    // $ANTLR start "rule__Insertion__Group_3__0__Impl"
    // InternalSqlDsl.g:2707:1: rule__Insertion__Group_3__0__Impl : ( 'objects' ) ;
    public final void rule__Insertion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2711:1: ( ( 'objects' ) )
            // InternalSqlDsl.g:2712:1: ( 'objects' )
            {
            // InternalSqlDsl.g:2712:1: ( 'objects' )
            // InternalSqlDsl.g:2713:2: 'objects'
            {
             before(grammarAccess.getInsertionAccess().getObjectsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getObjectsKeyword_3_0()); 

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
    // $ANTLR end "rule__Insertion__Group_3__0__Impl"


    // $ANTLR start "rule__Insertion__Group_3__1"
    // InternalSqlDsl.g:2722:1: rule__Insertion__Group_3__1 : rule__Insertion__Group_3__1__Impl rule__Insertion__Group_3__2 ;
    public final void rule__Insertion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2726:1: ( rule__Insertion__Group_3__1__Impl rule__Insertion__Group_3__2 )
            // InternalSqlDsl.g:2727:2: rule__Insertion__Group_3__1__Impl rule__Insertion__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Insertion__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3__2();

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
    // $ANTLR end "rule__Insertion__Group_3__1"


    // $ANTLR start "rule__Insertion__Group_3__1__Impl"
    // InternalSqlDsl.g:2734:1: rule__Insertion__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Insertion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2738:1: ( ( '{' ) )
            // InternalSqlDsl.g:2739:1: ( '{' )
            {
            // InternalSqlDsl.g:2739:1: ( '{' )
            // InternalSqlDsl.g:2740:2: '{'
            {
             before(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Insertion__Group_3__1__Impl"


    // $ANTLR start "rule__Insertion__Group_3__2"
    // InternalSqlDsl.g:2749:1: rule__Insertion__Group_3__2 : rule__Insertion__Group_3__2__Impl rule__Insertion__Group_3__3 ;
    public final void rule__Insertion__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2753:1: ( rule__Insertion__Group_3__2__Impl rule__Insertion__Group_3__3 )
            // InternalSqlDsl.g:2754:2: rule__Insertion__Group_3__2__Impl rule__Insertion__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Insertion__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3__3();

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
    // $ANTLR end "rule__Insertion__Group_3__2"


    // $ANTLR start "rule__Insertion__Group_3__2__Impl"
    // InternalSqlDsl.g:2761:1: rule__Insertion__Group_3__2__Impl : ( ( rule__Insertion__ObjectsAssignment_3_2 ) ) ;
    public final void rule__Insertion__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2765:1: ( ( ( rule__Insertion__ObjectsAssignment_3_2 ) ) )
            // InternalSqlDsl.g:2766:1: ( ( rule__Insertion__ObjectsAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:2766:1: ( ( rule__Insertion__ObjectsAssignment_3_2 ) )
            // InternalSqlDsl.g:2767:2: ( rule__Insertion__ObjectsAssignment_3_2 )
            {
             before(grammarAccess.getInsertionAccess().getObjectsAssignment_3_2()); 
            // InternalSqlDsl.g:2768:2: ( rule__Insertion__ObjectsAssignment_3_2 )
            // InternalSqlDsl.g:2768:3: rule__Insertion__ObjectsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ObjectsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getObjectsAssignment_3_2()); 

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
    // $ANTLR end "rule__Insertion__Group_3__2__Impl"


    // $ANTLR start "rule__Insertion__Group_3__3"
    // InternalSqlDsl.g:2776:1: rule__Insertion__Group_3__3 : rule__Insertion__Group_3__3__Impl rule__Insertion__Group_3__4 ;
    public final void rule__Insertion__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2780:1: ( rule__Insertion__Group_3__3__Impl rule__Insertion__Group_3__4 )
            // InternalSqlDsl.g:2781:2: rule__Insertion__Group_3__3__Impl rule__Insertion__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Insertion__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3__4();

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
    // $ANTLR end "rule__Insertion__Group_3__3"


    // $ANTLR start "rule__Insertion__Group_3__3__Impl"
    // InternalSqlDsl.g:2788:1: rule__Insertion__Group_3__3__Impl : ( ( rule__Insertion__Group_3_3__0 )* ) ;
    public final void rule__Insertion__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2792:1: ( ( ( rule__Insertion__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:2793:1: ( ( rule__Insertion__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:2793:1: ( ( rule__Insertion__Group_3_3__0 )* )
            // InternalSqlDsl.g:2794:2: ( rule__Insertion__Group_3_3__0 )*
            {
             before(grammarAccess.getInsertionAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:2795:2: ( rule__Insertion__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSqlDsl.g:2795:3: rule__Insertion__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Insertion__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getInsertionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Insertion__Group_3__3__Impl"


    // $ANTLR start "rule__Insertion__Group_3__4"
    // InternalSqlDsl.g:2803:1: rule__Insertion__Group_3__4 : rule__Insertion__Group_3__4__Impl ;
    public final void rule__Insertion__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2807:1: ( rule__Insertion__Group_3__4__Impl )
            // InternalSqlDsl.g:2808:2: rule__Insertion__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3__4__Impl();

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
    // $ANTLR end "rule__Insertion__Group_3__4"


    // $ANTLR start "rule__Insertion__Group_3__4__Impl"
    // InternalSqlDsl.g:2814:1: rule__Insertion__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Insertion__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2818:1: ( ( '}' ) )
            // InternalSqlDsl.g:2819:1: ( '}' )
            {
            // InternalSqlDsl.g:2819:1: ( '}' )
            // InternalSqlDsl.g:2820:2: '}'
            {
             before(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Insertion__Group_3__4__Impl"


    // $ANTLR start "rule__Insertion__Group_3_3__0"
    // InternalSqlDsl.g:2830:1: rule__Insertion__Group_3_3__0 : rule__Insertion__Group_3_3__0__Impl rule__Insertion__Group_3_3__1 ;
    public final void rule__Insertion__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2834:1: ( rule__Insertion__Group_3_3__0__Impl rule__Insertion__Group_3_3__1 )
            // InternalSqlDsl.g:2835:2: rule__Insertion__Group_3_3__0__Impl rule__Insertion__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Insertion__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3_3__1();

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
    // $ANTLR end "rule__Insertion__Group_3_3__0"


    // $ANTLR start "rule__Insertion__Group_3_3__0__Impl"
    // InternalSqlDsl.g:2842:1: rule__Insertion__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Insertion__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2846:1: ( ( ',' ) )
            // InternalSqlDsl.g:2847:1: ( ',' )
            {
            // InternalSqlDsl.g:2847:1: ( ',' )
            // InternalSqlDsl.g:2848:2: ','
            {
             before(grammarAccess.getInsertionAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Insertion__Group_3_3__0__Impl"


    // $ANTLR start "rule__Insertion__Group_3_3__1"
    // InternalSqlDsl.g:2857:1: rule__Insertion__Group_3_3__1 : rule__Insertion__Group_3_3__1__Impl ;
    public final void rule__Insertion__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2861:1: ( rule__Insertion__Group_3_3__1__Impl )
            // InternalSqlDsl.g:2862:2: rule__Insertion__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Insertion__Group_3_3__1"


    // $ANTLR start "rule__Insertion__Group_3_3__1__Impl"
    // InternalSqlDsl.g:2868:1: rule__Insertion__Group_3_3__1__Impl : ( ( rule__Insertion__ObjectsAssignment_3_3_1 ) ) ;
    public final void rule__Insertion__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2872:1: ( ( ( rule__Insertion__ObjectsAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:2873:1: ( ( rule__Insertion__ObjectsAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:2873:1: ( ( rule__Insertion__ObjectsAssignment_3_3_1 ) )
            // InternalSqlDsl.g:2874:2: ( rule__Insertion__ObjectsAssignment_3_3_1 )
            {
             before(grammarAccess.getInsertionAccess().getObjectsAssignment_3_3_1()); 
            // InternalSqlDsl.g:2875:2: ( rule__Insertion__ObjectsAssignment_3_3_1 )
            // InternalSqlDsl.g:2875:3: rule__Insertion__ObjectsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ObjectsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getObjectsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Insertion__Group_3_3__1__Impl"


    // $ANTLR start "rule__Insertion__Group_4__0"
    // InternalSqlDsl.g:2884:1: rule__Insertion__Group_4__0 : rule__Insertion__Group_4__0__Impl rule__Insertion__Group_4__1 ;
    public final void rule__Insertion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2888:1: ( rule__Insertion__Group_4__0__Impl rule__Insertion__Group_4__1 )
            // InternalSqlDsl.g:2889:2: rule__Insertion__Group_4__0__Impl rule__Insertion__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Insertion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4__1();

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
    // $ANTLR end "rule__Insertion__Group_4__0"


    // $ANTLR start "rule__Insertion__Group_4__0__Impl"
    // InternalSqlDsl.g:2896:1: rule__Insertion__Group_4__0__Impl : ( 'values' ) ;
    public final void rule__Insertion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2900:1: ( ( 'values' ) )
            // InternalSqlDsl.g:2901:1: ( 'values' )
            {
            // InternalSqlDsl.g:2901:1: ( 'values' )
            // InternalSqlDsl.g:2902:2: 'values'
            {
             before(grammarAccess.getInsertionAccess().getValuesKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getValuesKeyword_4_0()); 

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
    // $ANTLR end "rule__Insertion__Group_4__0__Impl"


    // $ANTLR start "rule__Insertion__Group_4__1"
    // InternalSqlDsl.g:2911:1: rule__Insertion__Group_4__1 : rule__Insertion__Group_4__1__Impl rule__Insertion__Group_4__2 ;
    public final void rule__Insertion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2915:1: ( rule__Insertion__Group_4__1__Impl rule__Insertion__Group_4__2 )
            // InternalSqlDsl.g:2916:2: rule__Insertion__Group_4__1__Impl rule__Insertion__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__Insertion__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4__2();

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
    // $ANTLR end "rule__Insertion__Group_4__1"


    // $ANTLR start "rule__Insertion__Group_4__1__Impl"
    // InternalSqlDsl.g:2923:1: rule__Insertion__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Insertion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2927:1: ( ( '{' ) )
            // InternalSqlDsl.g:2928:1: ( '{' )
            {
            // InternalSqlDsl.g:2928:1: ( '{' )
            // InternalSqlDsl.g:2929:2: '{'
            {
             before(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Insertion__Group_4__1__Impl"


    // $ANTLR start "rule__Insertion__Group_4__2"
    // InternalSqlDsl.g:2938:1: rule__Insertion__Group_4__2 : rule__Insertion__Group_4__2__Impl rule__Insertion__Group_4__3 ;
    public final void rule__Insertion__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2942:1: ( rule__Insertion__Group_4__2__Impl rule__Insertion__Group_4__3 )
            // InternalSqlDsl.g:2943:2: rule__Insertion__Group_4__2__Impl rule__Insertion__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Insertion__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4__3();

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
    // $ANTLR end "rule__Insertion__Group_4__2"


    // $ANTLR start "rule__Insertion__Group_4__2__Impl"
    // InternalSqlDsl.g:2950:1: rule__Insertion__Group_4__2__Impl : ( ( rule__Insertion__ValuesAssignment_4_2 ) ) ;
    public final void rule__Insertion__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2954:1: ( ( ( rule__Insertion__ValuesAssignment_4_2 ) ) )
            // InternalSqlDsl.g:2955:1: ( ( rule__Insertion__ValuesAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:2955:1: ( ( rule__Insertion__ValuesAssignment_4_2 ) )
            // InternalSqlDsl.g:2956:2: ( rule__Insertion__ValuesAssignment_4_2 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_4_2()); 
            // InternalSqlDsl.g:2957:2: ( rule__Insertion__ValuesAssignment_4_2 )
            // InternalSqlDsl.g:2957:3: rule__Insertion__ValuesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_4_2()); 

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
    // $ANTLR end "rule__Insertion__Group_4__2__Impl"


    // $ANTLR start "rule__Insertion__Group_4__3"
    // InternalSqlDsl.g:2965:1: rule__Insertion__Group_4__3 : rule__Insertion__Group_4__3__Impl rule__Insertion__Group_4__4 ;
    public final void rule__Insertion__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2969:1: ( rule__Insertion__Group_4__3__Impl rule__Insertion__Group_4__4 )
            // InternalSqlDsl.g:2970:2: rule__Insertion__Group_4__3__Impl rule__Insertion__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Insertion__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4__4();

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
    // $ANTLR end "rule__Insertion__Group_4__3"


    // $ANTLR start "rule__Insertion__Group_4__3__Impl"
    // InternalSqlDsl.g:2977:1: rule__Insertion__Group_4__3__Impl : ( ( rule__Insertion__Group_4_3__0 )* ) ;
    public final void rule__Insertion__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2981:1: ( ( ( rule__Insertion__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:2982:1: ( ( rule__Insertion__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:2982:1: ( ( rule__Insertion__Group_4_3__0 )* )
            // InternalSqlDsl.g:2983:2: ( rule__Insertion__Group_4_3__0 )*
            {
             before(grammarAccess.getInsertionAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:2984:2: ( rule__Insertion__Group_4_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSqlDsl.g:2984:3: rule__Insertion__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Insertion__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInsertionAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Insertion__Group_4__3__Impl"


    // $ANTLR start "rule__Insertion__Group_4__4"
    // InternalSqlDsl.g:2992:1: rule__Insertion__Group_4__4 : rule__Insertion__Group_4__4__Impl ;
    public final void rule__Insertion__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2996:1: ( rule__Insertion__Group_4__4__Impl )
            // InternalSqlDsl.g:2997:2: rule__Insertion__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4__4__Impl();

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
    // $ANTLR end "rule__Insertion__Group_4__4"


    // $ANTLR start "rule__Insertion__Group_4__4__Impl"
    // InternalSqlDsl.g:3003:1: rule__Insertion__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Insertion__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3007:1: ( ( '}' ) )
            // InternalSqlDsl.g:3008:1: ( '}' )
            {
            // InternalSqlDsl.g:3008:1: ( '}' )
            // InternalSqlDsl.g:3009:2: '}'
            {
             before(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Insertion__Group_4__4__Impl"


    // $ANTLR start "rule__Insertion__Group_4_3__0"
    // InternalSqlDsl.g:3019:1: rule__Insertion__Group_4_3__0 : rule__Insertion__Group_4_3__0__Impl rule__Insertion__Group_4_3__1 ;
    public final void rule__Insertion__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3023:1: ( rule__Insertion__Group_4_3__0__Impl rule__Insertion__Group_4_3__1 )
            // InternalSqlDsl.g:3024:2: rule__Insertion__Group_4_3__0__Impl rule__Insertion__Group_4_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Insertion__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4_3__1();

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
    // $ANTLR end "rule__Insertion__Group_4_3__0"


    // $ANTLR start "rule__Insertion__Group_4_3__0__Impl"
    // InternalSqlDsl.g:3031:1: rule__Insertion__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Insertion__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3035:1: ( ( ',' ) )
            // InternalSqlDsl.g:3036:1: ( ',' )
            {
            // InternalSqlDsl.g:3036:1: ( ',' )
            // InternalSqlDsl.g:3037:2: ','
            {
             before(grammarAccess.getInsertionAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Insertion__Group_4_3__0__Impl"


    // $ANTLR start "rule__Insertion__Group_4_3__1"
    // InternalSqlDsl.g:3046:1: rule__Insertion__Group_4_3__1 : rule__Insertion__Group_4_3__1__Impl ;
    public final void rule__Insertion__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3050:1: ( rule__Insertion__Group_4_3__1__Impl )
            // InternalSqlDsl.g:3051:2: rule__Insertion__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Insertion__Group_4_3__1"


    // $ANTLR start "rule__Insertion__Group_4_3__1__Impl"
    // InternalSqlDsl.g:3057:1: rule__Insertion__Group_4_3__1__Impl : ( ( rule__Insertion__ValuesAssignment_4_3_1 ) ) ;
    public final void rule__Insertion__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3061:1: ( ( ( rule__Insertion__ValuesAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:3062:1: ( ( rule__Insertion__ValuesAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:3062:1: ( ( rule__Insertion__ValuesAssignment_4_3_1 ) )
            // InternalSqlDsl.g:3063:2: ( rule__Insertion__ValuesAssignment_4_3_1 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_4_3_1()); 
            // InternalSqlDsl.g:3064:2: ( rule__Insertion__ValuesAssignment_4_3_1 )
            // InternalSqlDsl.g:3064:3: rule__Insertion__ValuesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Insertion__Group_4_3__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalSqlDsl.g:3073:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3077:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalSqlDsl.g:3078:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3085:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3089:1: ( ( () ) )
            // InternalSqlDsl.g:3090:1: ( () )
            {
            // InternalSqlDsl.g:3090:1: ( () )
            // InternalSqlDsl.g:3091:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalSqlDsl.g:3092:2: ()
            // InternalSqlDsl.g:3092:3: 
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
    // InternalSqlDsl.g:3100:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3104:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalSqlDsl.g:3105:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:3112:1: rule__Delete__Group__1__Impl : ( 'Delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3116:1: ( ( 'Delete' ) )
            // InternalSqlDsl.g:3117:1: ( 'Delete' )
            {
            // InternalSqlDsl.g:3117:1: ( 'Delete' )
            // InternalSqlDsl.g:3118:2: 'Delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 

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
    // InternalSqlDsl.g:3127:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3131:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalSqlDsl.g:3132:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:3139:1: rule__Delete__Group__2__Impl : ( '{' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3143:1: ( ( '{' ) )
            // InternalSqlDsl.g:3144:1: ( '{' )
            {
            // InternalSqlDsl.g:3144:1: ( '{' )
            // InternalSqlDsl.g:3145:2: '{'
            {
             before(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSqlDsl.g:3154:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3158:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalSqlDsl.g:3159:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSqlDsl.g:3166:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__Group_3__0 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3170:1: ( ( ( rule__Delete__Group_3__0 )? ) )
            // InternalSqlDsl.g:3171:1: ( ( rule__Delete__Group_3__0 )? )
            {
            // InternalSqlDsl.g:3171:1: ( ( rule__Delete__Group_3__0 )? )
            // InternalSqlDsl.g:3172:2: ( rule__Delete__Group_3__0 )?
            {
             before(grammarAccess.getDeleteAccess().getGroup_3()); 
            // InternalSqlDsl.g:3173:2: ( rule__Delete__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSqlDsl.g:3173:3: rule__Delete__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Delete__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeleteAccess().getGroup_3()); 

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
    // InternalSqlDsl.g:3181:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl rule__Delete__Group__5 ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3185:1: ( rule__Delete__Group__4__Impl rule__Delete__Group__5 )
            // InternalSqlDsl.g:3186:2: rule__Delete__Group__4__Impl rule__Delete__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Delete__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__5();

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
    // InternalSqlDsl.g:3193:1: rule__Delete__Group__4__Impl : ( ( rule__Delete__Group_4__0 )? ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3197:1: ( ( ( rule__Delete__Group_4__0 )? ) )
            // InternalSqlDsl.g:3198:1: ( ( rule__Delete__Group_4__0 )? )
            {
            // InternalSqlDsl.g:3198:1: ( ( rule__Delete__Group_4__0 )? )
            // InternalSqlDsl.g:3199:2: ( rule__Delete__Group_4__0 )?
            {
             before(grammarAccess.getDeleteAccess().getGroup_4()); 
            // InternalSqlDsl.g:3200:2: ( rule__Delete__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSqlDsl.g:3200:3: rule__Delete__Group_4__0
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


    // $ANTLR start "rule__Delete__Group__5"
    // InternalSqlDsl.g:3208:1: rule__Delete__Group__5 : rule__Delete__Group__5__Impl ;
    public final void rule__Delete__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3212:1: ( rule__Delete__Group__5__Impl )
            // InternalSqlDsl.g:3213:2: rule__Delete__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__5__Impl();

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
    // $ANTLR end "rule__Delete__Group__5"


    // $ANTLR start "rule__Delete__Group__5__Impl"
    // InternalSqlDsl.g:3219:1: rule__Delete__Group__5__Impl : ( '}' ) ;
    public final void rule__Delete__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3223:1: ( ( '}' ) )
            // InternalSqlDsl.g:3224:1: ( '}' )
            {
            // InternalSqlDsl.g:3224:1: ( '}' )
            // InternalSqlDsl.g:3225:2: '}'
            {
             before(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Delete__Group__5__Impl"


    // $ANTLR start "rule__Delete__Group_3__0"
    // InternalSqlDsl.g:3235:1: rule__Delete__Group_3__0 : rule__Delete__Group_3__0__Impl rule__Delete__Group_3__1 ;
    public final void rule__Delete__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3239:1: ( rule__Delete__Group_3__0__Impl rule__Delete__Group_3__1 )
            // InternalSqlDsl.g:3240:2: rule__Delete__Group_3__0__Impl rule__Delete__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Delete__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_3__1();

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
    // $ANTLR end "rule__Delete__Group_3__0"


    // $ANTLR start "rule__Delete__Group_3__0__Impl"
    // InternalSqlDsl.g:3247:1: rule__Delete__Group_3__0__Impl : ( 'objects' ) ;
    public final void rule__Delete__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3251:1: ( ( 'objects' ) )
            // InternalSqlDsl.g:3252:1: ( 'objects' )
            {
            // InternalSqlDsl.g:3252:1: ( 'objects' )
            // InternalSqlDsl.g:3253:2: 'objects'
            {
             before(grammarAccess.getDeleteAccess().getObjectsKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getObjectsKeyword_3_0()); 

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
    // $ANTLR end "rule__Delete__Group_3__0__Impl"


    // $ANTLR start "rule__Delete__Group_3__1"
    // InternalSqlDsl.g:3262:1: rule__Delete__Group_3__1 : rule__Delete__Group_3__1__Impl rule__Delete__Group_3__2 ;
    public final void rule__Delete__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3266:1: ( rule__Delete__Group_3__1__Impl rule__Delete__Group_3__2 )
            // InternalSqlDsl.g:3267:2: rule__Delete__Group_3__1__Impl rule__Delete__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Delete__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_3__2();

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
    // $ANTLR end "rule__Delete__Group_3__1"


    // $ANTLR start "rule__Delete__Group_3__1__Impl"
    // InternalSqlDsl.g:3274:1: rule__Delete__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Delete__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3278:1: ( ( '{' ) )
            // InternalSqlDsl.g:3279:1: ( '{' )
            {
            // InternalSqlDsl.g:3279:1: ( '{' )
            // InternalSqlDsl.g:3280:2: '{'
            {
             before(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Delete__Group_3__1__Impl"


    // $ANTLR start "rule__Delete__Group_3__2"
    // InternalSqlDsl.g:3289:1: rule__Delete__Group_3__2 : rule__Delete__Group_3__2__Impl rule__Delete__Group_3__3 ;
    public final void rule__Delete__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3293:1: ( rule__Delete__Group_3__2__Impl rule__Delete__Group_3__3 )
            // InternalSqlDsl.g:3294:2: rule__Delete__Group_3__2__Impl rule__Delete__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Delete__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_3__3();

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
    // $ANTLR end "rule__Delete__Group_3__2"


    // $ANTLR start "rule__Delete__Group_3__2__Impl"
    // InternalSqlDsl.g:3301:1: rule__Delete__Group_3__2__Impl : ( ( rule__Delete__ObjectsAssignment_3_2 ) ) ;
    public final void rule__Delete__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3305:1: ( ( ( rule__Delete__ObjectsAssignment_3_2 ) ) )
            // InternalSqlDsl.g:3306:1: ( ( rule__Delete__ObjectsAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:3306:1: ( ( rule__Delete__ObjectsAssignment_3_2 ) )
            // InternalSqlDsl.g:3307:2: ( rule__Delete__ObjectsAssignment_3_2 )
            {
             before(grammarAccess.getDeleteAccess().getObjectsAssignment_3_2()); 
            // InternalSqlDsl.g:3308:2: ( rule__Delete__ObjectsAssignment_3_2 )
            // InternalSqlDsl.g:3308:3: rule__Delete__ObjectsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ObjectsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getObjectsAssignment_3_2()); 

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
    // $ANTLR end "rule__Delete__Group_3__2__Impl"


    // $ANTLR start "rule__Delete__Group_3__3"
    // InternalSqlDsl.g:3316:1: rule__Delete__Group_3__3 : rule__Delete__Group_3__3__Impl rule__Delete__Group_3__4 ;
    public final void rule__Delete__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3320:1: ( rule__Delete__Group_3__3__Impl rule__Delete__Group_3__4 )
            // InternalSqlDsl.g:3321:2: rule__Delete__Group_3__3__Impl rule__Delete__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Delete__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_3__4();

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
    // $ANTLR end "rule__Delete__Group_3__3"


    // $ANTLR start "rule__Delete__Group_3__3__Impl"
    // InternalSqlDsl.g:3328:1: rule__Delete__Group_3__3__Impl : ( ( rule__Delete__Group_3_3__0 )* ) ;
    public final void rule__Delete__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3332:1: ( ( ( rule__Delete__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:3333:1: ( ( rule__Delete__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:3333:1: ( ( rule__Delete__Group_3_3__0 )* )
            // InternalSqlDsl.g:3334:2: ( rule__Delete__Group_3_3__0 )*
            {
             before(grammarAccess.getDeleteAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:3335:2: ( rule__Delete__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSqlDsl.g:3335:3: rule__Delete__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Delete__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDeleteAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Delete__Group_3__3__Impl"


    // $ANTLR start "rule__Delete__Group_3__4"
    // InternalSqlDsl.g:3343:1: rule__Delete__Group_3__4 : rule__Delete__Group_3__4__Impl ;
    public final void rule__Delete__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3347:1: ( rule__Delete__Group_3__4__Impl )
            // InternalSqlDsl.g:3348:2: rule__Delete__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_3__4__Impl();

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
    // $ANTLR end "rule__Delete__Group_3__4"


    // $ANTLR start "rule__Delete__Group_3__4__Impl"
    // InternalSqlDsl.g:3354:1: rule__Delete__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Delete__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3358:1: ( ( '}' ) )
            // InternalSqlDsl.g:3359:1: ( '}' )
            {
            // InternalSqlDsl.g:3359:1: ( '}' )
            // InternalSqlDsl.g:3360:2: '}'
            {
             before(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Delete__Group_3__4__Impl"


    // $ANTLR start "rule__Delete__Group_3_3__0"
    // InternalSqlDsl.g:3370:1: rule__Delete__Group_3_3__0 : rule__Delete__Group_3_3__0__Impl rule__Delete__Group_3_3__1 ;
    public final void rule__Delete__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3374:1: ( rule__Delete__Group_3_3__0__Impl rule__Delete__Group_3_3__1 )
            // InternalSqlDsl.g:3375:2: rule__Delete__Group_3_3__0__Impl rule__Delete__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Delete__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_3_3__1();

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
    // $ANTLR end "rule__Delete__Group_3_3__0"


    // $ANTLR start "rule__Delete__Group_3_3__0__Impl"
    // InternalSqlDsl.g:3382:1: rule__Delete__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Delete__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3386:1: ( ( ',' ) )
            // InternalSqlDsl.g:3387:1: ( ',' )
            {
            // InternalSqlDsl.g:3387:1: ( ',' )
            // InternalSqlDsl.g:3388:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Delete__Group_3_3__0__Impl"


    // $ANTLR start "rule__Delete__Group_3_3__1"
    // InternalSqlDsl.g:3397:1: rule__Delete__Group_3_3__1 : rule__Delete__Group_3_3__1__Impl ;
    public final void rule__Delete__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3401:1: ( rule__Delete__Group_3_3__1__Impl )
            // InternalSqlDsl.g:3402:2: rule__Delete__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Delete__Group_3_3__1"


    // $ANTLR start "rule__Delete__Group_3_3__1__Impl"
    // InternalSqlDsl.g:3408:1: rule__Delete__Group_3_3__1__Impl : ( ( rule__Delete__ObjectsAssignment_3_3_1 ) ) ;
    public final void rule__Delete__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3412:1: ( ( ( rule__Delete__ObjectsAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:3413:1: ( ( rule__Delete__ObjectsAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:3413:1: ( ( rule__Delete__ObjectsAssignment_3_3_1 ) )
            // InternalSqlDsl.g:3414:2: ( rule__Delete__ObjectsAssignment_3_3_1 )
            {
             before(grammarAccess.getDeleteAccess().getObjectsAssignment_3_3_1()); 
            // InternalSqlDsl.g:3415:2: ( rule__Delete__ObjectsAssignment_3_3_1 )
            // InternalSqlDsl.g:3415:3: rule__Delete__ObjectsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ObjectsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getObjectsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Delete__Group_3_3__1__Impl"


    // $ANTLR start "rule__Delete__Group_4__0"
    // InternalSqlDsl.g:3424:1: rule__Delete__Group_4__0 : rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 ;
    public final void rule__Delete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3428:1: ( rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 )
            // InternalSqlDsl.g:3429:2: rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:3436:1: rule__Delete__Group_4__0__Impl : ( 'clauses' ) ;
    public final void rule__Delete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3440:1: ( ( 'clauses' ) )
            // InternalSqlDsl.g:3441:1: ( 'clauses' )
            {
            // InternalSqlDsl.g:3441:1: ( 'clauses' )
            // InternalSqlDsl.g:3442:2: 'clauses'
            {
             before(grammarAccess.getDeleteAccess().getClausesKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getClausesKeyword_4_0()); 

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
    // InternalSqlDsl.g:3451:1: rule__Delete__Group_4__1 : rule__Delete__Group_4__1__Impl rule__Delete__Group_4__2 ;
    public final void rule__Delete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3455:1: ( rule__Delete__Group_4__1__Impl rule__Delete__Group_4__2 )
            // InternalSqlDsl.g:3456:2: rule__Delete__Group_4__1__Impl rule__Delete__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Delete__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__2();

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
    // InternalSqlDsl.g:3463:1: rule__Delete__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Delete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3467:1: ( ( '{' ) )
            // InternalSqlDsl.g:3468:1: ( '{' )
            {
            // InternalSqlDsl.g:3468:1: ( '{' )
            // InternalSqlDsl.g:3469:2: '{'
            {
             before(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_4_1()); 

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


    // $ANTLR start "rule__Delete__Group_4__2"
    // InternalSqlDsl.g:3478:1: rule__Delete__Group_4__2 : rule__Delete__Group_4__2__Impl rule__Delete__Group_4__3 ;
    public final void rule__Delete__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3482:1: ( rule__Delete__Group_4__2__Impl rule__Delete__Group_4__3 )
            // InternalSqlDsl.g:3483:2: rule__Delete__Group_4__2__Impl rule__Delete__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Delete__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__3();

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
    // $ANTLR end "rule__Delete__Group_4__2"


    // $ANTLR start "rule__Delete__Group_4__2__Impl"
    // InternalSqlDsl.g:3490:1: rule__Delete__Group_4__2__Impl : ( ( rule__Delete__ClausesAssignment_4_2 ) ) ;
    public final void rule__Delete__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3494:1: ( ( ( rule__Delete__ClausesAssignment_4_2 ) ) )
            // InternalSqlDsl.g:3495:1: ( ( rule__Delete__ClausesAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:3495:1: ( ( rule__Delete__ClausesAssignment_4_2 ) )
            // InternalSqlDsl.g:3496:2: ( rule__Delete__ClausesAssignment_4_2 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_2()); 
            // InternalSqlDsl.g:3497:2: ( rule__Delete__ClausesAssignment_4_2 )
            // InternalSqlDsl.g:3497:3: rule__Delete__ClausesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ClausesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getClausesAssignment_4_2()); 

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
    // $ANTLR end "rule__Delete__Group_4__2__Impl"


    // $ANTLR start "rule__Delete__Group_4__3"
    // InternalSqlDsl.g:3505:1: rule__Delete__Group_4__3 : rule__Delete__Group_4__3__Impl rule__Delete__Group_4__4 ;
    public final void rule__Delete__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3509:1: ( rule__Delete__Group_4__3__Impl rule__Delete__Group_4__4 )
            // InternalSqlDsl.g:3510:2: rule__Delete__Group_4__3__Impl rule__Delete__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Delete__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__4();

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
    // $ANTLR end "rule__Delete__Group_4__3"


    // $ANTLR start "rule__Delete__Group_4__3__Impl"
    // InternalSqlDsl.g:3517:1: rule__Delete__Group_4__3__Impl : ( ( rule__Delete__Group_4_3__0 )* ) ;
    public final void rule__Delete__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3521:1: ( ( ( rule__Delete__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:3522:1: ( ( rule__Delete__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:3522:1: ( ( rule__Delete__Group_4_3__0 )* )
            // InternalSqlDsl.g:3523:2: ( rule__Delete__Group_4_3__0 )*
            {
             before(grammarAccess.getDeleteAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:3524:2: ( rule__Delete__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSqlDsl.g:3524:3: rule__Delete__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Delete__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDeleteAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Delete__Group_4__3__Impl"


    // $ANTLR start "rule__Delete__Group_4__4"
    // InternalSqlDsl.g:3532:1: rule__Delete__Group_4__4 : rule__Delete__Group_4__4__Impl ;
    public final void rule__Delete__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3536:1: ( rule__Delete__Group_4__4__Impl )
            // InternalSqlDsl.g:3537:2: rule__Delete__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_4__4__Impl();

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
    // $ANTLR end "rule__Delete__Group_4__4"


    // $ANTLR start "rule__Delete__Group_4__4__Impl"
    // InternalSqlDsl.g:3543:1: rule__Delete__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Delete__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3547:1: ( ( '}' ) )
            // InternalSqlDsl.g:3548:1: ( '}' )
            {
            // InternalSqlDsl.g:3548:1: ( '}' )
            // InternalSqlDsl.g:3549:2: '}'
            {
             before(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Delete__Group_4__4__Impl"


    // $ANTLR start "rule__Delete__Group_4_3__0"
    // InternalSqlDsl.g:3559:1: rule__Delete__Group_4_3__0 : rule__Delete__Group_4_3__0__Impl rule__Delete__Group_4_3__1 ;
    public final void rule__Delete__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3563:1: ( rule__Delete__Group_4_3__0__Impl rule__Delete__Group_4_3__1 )
            // InternalSqlDsl.g:3564:2: rule__Delete__Group_4_3__0__Impl rule__Delete__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Delete__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group_4_3__1();

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
    // $ANTLR end "rule__Delete__Group_4_3__0"


    // $ANTLR start "rule__Delete__Group_4_3__0__Impl"
    // InternalSqlDsl.g:3571:1: rule__Delete__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Delete__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3575:1: ( ( ',' ) )
            // InternalSqlDsl.g:3576:1: ( ',' )
            {
            // InternalSqlDsl.g:3576:1: ( ',' )
            // InternalSqlDsl.g:3577:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Delete__Group_4_3__0__Impl"


    // $ANTLR start "rule__Delete__Group_4_3__1"
    // InternalSqlDsl.g:3586:1: rule__Delete__Group_4_3__1 : rule__Delete__Group_4_3__1__Impl ;
    public final void rule__Delete__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3590:1: ( rule__Delete__Group_4_3__1__Impl )
            // InternalSqlDsl.g:3591:2: rule__Delete__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Delete__Group_4_3__1"


    // $ANTLR start "rule__Delete__Group_4_3__1__Impl"
    // InternalSqlDsl.g:3597:1: rule__Delete__Group_4_3__1__Impl : ( ( rule__Delete__ClausesAssignment_4_3_1 ) ) ;
    public final void rule__Delete__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3601:1: ( ( ( rule__Delete__ClausesAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:3602:1: ( ( rule__Delete__ClausesAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:3602:1: ( ( rule__Delete__ClausesAssignment_4_3_1 ) )
            // InternalSqlDsl.g:3603:2: ( rule__Delete__ClausesAssignment_4_3_1 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_3_1()); 
            // InternalSqlDsl.g:3604:2: ( rule__Delete__ClausesAssignment_4_3_1 )
            // InternalSqlDsl.g:3604:3: rule__Delete__ClausesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Delete__ClausesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getClausesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Delete__Group_4_3__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalSqlDsl.g:3613:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3617:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSqlDsl.g:3618:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSqlDsl.g:3625:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3629:1: ( ( () ) )
            // InternalSqlDsl.g:3630:1: ( () )
            {
            // InternalSqlDsl.g:3630:1: ( () )
            // InternalSqlDsl.g:3631:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalSqlDsl.g:3632:2: ()
            // InternalSqlDsl.g:3632:3: 
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
    // InternalSqlDsl.g:3640:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3644:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSqlDsl.g:3645:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSqlDsl.g:3652:1: rule__Table__Group__1__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3656:1: ( ( 'Table' ) )
            // InternalSqlDsl.g:3657:1: ( 'Table' )
            {
            // InternalSqlDsl.g:3657:1: ( 'Table' )
            // InternalSqlDsl.g:3658:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_1()); 

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
    // InternalSqlDsl.g:3667:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3671:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSqlDsl.g:3672:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:3679:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3683:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalSqlDsl.g:3684:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalSqlDsl.g:3684:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalSqlDsl.g:3685:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalSqlDsl.g:3686:2: ( rule__Table__NameAssignment_2 )
            // InternalSqlDsl.g:3686:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

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
    // InternalSqlDsl.g:3694:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3698:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSqlDsl.g:3699:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSqlDsl.g:3706:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3710:1: ( ( '{' ) )
            // InternalSqlDsl.g:3711:1: ( '{' )
            {
            // InternalSqlDsl.g:3711:1: ( '{' )
            // InternalSqlDsl.g:3712:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSqlDsl.g:3721:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3725:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalSqlDsl.g:3726:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // InternalSqlDsl.g:3733:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3737:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalSqlDsl.g:3738:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalSqlDsl.g:3738:1: ( ( rule__Table__Group_4__0 )? )
            // InternalSqlDsl.g:3739:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalSqlDsl.g:3740:2: ( rule__Table__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSqlDsl.g:3740:3: rule__Table__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Table__Group__5"
    // InternalSqlDsl.g:3748:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3752:1: ( rule__Table__Group__5__Impl )
            // InternalSqlDsl.g:3753:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalSqlDsl.g:3759:1: rule__Table__Group__5__Impl : ( '}' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3763:1: ( ( '}' ) )
            // InternalSqlDsl.g:3764:1: ( '}' )
            {
            // InternalSqlDsl.g:3764:1: ( '}' )
            // InternalSqlDsl.g:3765:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalSqlDsl.g:3775:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3779:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalSqlDsl.g:3780:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

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
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalSqlDsl.g:3787:1: rule__Table__Group_4__0__Impl : ( 'columns' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3791:1: ( ( 'columns' ) )
            // InternalSqlDsl.g:3792:1: ( 'columns' )
            {
            // InternalSqlDsl.g:3792:1: ( 'columns' )
            // InternalSqlDsl.g:3793:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColumnsKeyword_4_0()); 

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
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalSqlDsl.g:3802:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl rule__Table__Group_4__2 ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3806:1: ( rule__Table__Group_4__1__Impl rule__Table__Group_4__2 )
            // InternalSqlDsl.g:3807:2: rule__Table__Group_4__1__Impl rule__Table__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__2();

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
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalSqlDsl.g:3814:1: rule__Table__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3818:1: ( ( '{' ) )
            // InternalSqlDsl.g:3819:1: ( '{' )
            {
            // InternalSqlDsl.g:3819:1: ( '{' )
            // InternalSqlDsl.g:3820:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group_4__2"
    // InternalSqlDsl.g:3829:1: rule__Table__Group_4__2 : rule__Table__Group_4__2__Impl rule__Table__Group_4__3 ;
    public final void rule__Table__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3833:1: ( rule__Table__Group_4__2__Impl rule__Table__Group_4__3 )
            // InternalSqlDsl.g:3834:2: rule__Table__Group_4__2__Impl rule__Table__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__3();

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
    // $ANTLR end "rule__Table__Group_4__2"


    // $ANTLR start "rule__Table__Group_4__2__Impl"
    // InternalSqlDsl.g:3841:1: rule__Table__Group_4__2__Impl : ( ( rule__Table__ColumnsAssignment_4_2 ) ) ;
    public final void rule__Table__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3845:1: ( ( ( rule__Table__ColumnsAssignment_4_2 ) ) )
            // InternalSqlDsl.g:3846:1: ( ( rule__Table__ColumnsAssignment_4_2 ) )
            {
            // InternalSqlDsl.g:3846:1: ( ( rule__Table__ColumnsAssignment_4_2 ) )
            // InternalSqlDsl.g:3847:2: ( rule__Table__ColumnsAssignment_4_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_2()); 
            // InternalSqlDsl.g:3848:2: ( rule__Table__ColumnsAssignment_4_2 )
            // InternalSqlDsl.g:3848:3: rule__Table__ColumnsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_2()); 

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
    // $ANTLR end "rule__Table__Group_4__2__Impl"


    // $ANTLR start "rule__Table__Group_4__3"
    // InternalSqlDsl.g:3856:1: rule__Table__Group_4__3 : rule__Table__Group_4__3__Impl rule__Table__Group_4__4 ;
    public final void rule__Table__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3860:1: ( rule__Table__Group_4__3__Impl rule__Table__Group_4__4 )
            // InternalSqlDsl.g:3861:2: rule__Table__Group_4__3__Impl rule__Table__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__4();

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
    // $ANTLR end "rule__Table__Group_4__3"


    // $ANTLR start "rule__Table__Group_4__3__Impl"
    // InternalSqlDsl.g:3868:1: rule__Table__Group_4__3__Impl : ( ( rule__Table__Group_4_3__0 )* ) ;
    public final void rule__Table__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3872:1: ( ( ( rule__Table__Group_4_3__0 )* ) )
            // InternalSqlDsl.g:3873:1: ( ( rule__Table__Group_4_3__0 )* )
            {
            // InternalSqlDsl.g:3873:1: ( ( rule__Table__Group_4_3__0 )* )
            // InternalSqlDsl.g:3874:2: ( rule__Table__Group_4_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4_3()); 
            // InternalSqlDsl.g:3875:2: ( rule__Table__Group_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSqlDsl.g:3875:3: rule__Table__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Table__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Table__Group_4__3__Impl"


    // $ANTLR start "rule__Table__Group_4__4"
    // InternalSqlDsl.g:3883:1: rule__Table__Group_4__4 : rule__Table__Group_4__4__Impl ;
    public final void rule__Table__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3887:1: ( rule__Table__Group_4__4__Impl )
            // InternalSqlDsl.g:3888:2: rule__Table__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__4__Impl();

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
    // $ANTLR end "rule__Table__Group_4__4"


    // $ANTLR start "rule__Table__Group_4__4__Impl"
    // InternalSqlDsl.g:3894:1: rule__Table__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3898:1: ( ( '}' ) )
            // InternalSqlDsl.g:3899:1: ( '}' )
            {
            // InternalSqlDsl.g:3899:1: ( '}' )
            // InternalSqlDsl.g:3900:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Table__Group_4__4__Impl"


    // $ANTLR start "rule__Table__Group_4_3__0"
    // InternalSqlDsl.g:3910:1: rule__Table__Group_4_3__0 : rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1 ;
    public final void rule__Table__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3914:1: ( rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1 )
            // InternalSqlDsl.g:3915:2: rule__Table__Group_4_3__0__Impl rule__Table__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4_3__1();

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
    // $ANTLR end "rule__Table__Group_4_3__0"


    // $ANTLR start "rule__Table__Group_4_3__0__Impl"
    // InternalSqlDsl.g:3922:1: rule__Table__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3926:1: ( ( ',' ) )
            // InternalSqlDsl.g:3927:1: ( ',' )
            {
            // InternalSqlDsl.g:3927:1: ( ',' )
            // InternalSqlDsl.g:3928:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Table__Group_4_3__0__Impl"


    // $ANTLR start "rule__Table__Group_4_3__1"
    // InternalSqlDsl.g:3937:1: rule__Table__Group_4_3__1 : rule__Table__Group_4_3__1__Impl ;
    public final void rule__Table__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3941:1: ( rule__Table__Group_4_3__1__Impl )
            // InternalSqlDsl.g:3942:2: rule__Table__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Table__Group_4_3__1"


    // $ANTLR start "rule__Table__Group_4_3__1__Impl"
    // InternalSqlDsl.g:3948:1: rule__Table__Group_4_3__1__Impl : ( ( rule__Table__ColumnsAssignment_4_3_1 ) ) ;
    public final void rule__Table__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3952:1: ( ( ( rule__Table__ColumnsAssignment_4_3_1 ) ) )
            // InternalSqlDsl.g:3953:1: ( ( rule__Table__ColumnsAssignment_4_3_1 ) )
            {
            // InternalSqlDsl.g:3953:1: ( ( rule__Table__ColumnsAssignment_4_3_1 ) )
            // InternalSqlDsl.g:3954:2: ( rule__Table__ColumnsAssignment_4_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_3_1()); 
            // InternalSqlDsl.g:3955:2: ( rule__Table__ColumnsAssignment_4_3_1 )
            // InternalSqlDsl.g:3955:3: rule__Table__ColumnsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Table__Group_4_3__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalSqlDsl.g:3964:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3968:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSqlDsl.g:3969:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSqlDsl.g:3976:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3980:1: ( ( () ) )
            // InternalSqlDsl.g:3981:1: ( () )
            {
            // InternalSqlDsl.g:3981:1: ( () )
            // InternalSqlDsl.g:3982:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:3983:2: ()
            // InternalSqlDsl.g:3983:3: 
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
    // InternalSqlDsl.g:3991:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3995:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalSqlDsl.g:3996:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSqlDsl.g:4003:1: rule__Column__Group__1__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4007:1: ( ( 'Column' ) )
            // InternalSqlDsl.g:4008:1: ( 'Column' )
            {
            // InternalSqlDsl.g:4008:1: ( 'Column' )
            // InternalSqlDsl.g:4009:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 

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
    // InternalSqlDsl.g:4018:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4022:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalSqlDsl.g:4023:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

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
    // InternalSqlDsl.g:4030:1: rule__Column__Group__2__Impl : ( ( rule__Column__NameAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4034:1: ( ( ( rule__Column__NameAssignment_2 ) ) )
            // InternalSqlDsl.g:4035:1: ( ( rule__Column__NameAssignment_2 ) )
            {
            // InternalSqlDsl.g:4035:1: ( ( rule__Column__NameAssignment_2 ) )
            // InternalSqlDsl.g:4036:2: ( rule__Column__NameAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_2()); 
            // InternalSqlDsl.g:4037:2: ( rule__Column__NameAssignment_2 )
            // InternalSqlDsl.g:4037:3: rule__Column__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__Column__Group__3"
    // InternalSqlDsl.g:4045:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4049:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalSqlDsl.g:4050:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalSqlDsl.g:4057:1: rule__Column__Group__3__Impl : ( '{' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4061:1: ( ( '{' ) )
            // InternalSqlDsl.g:4062:1: ( '{' )
            {
            // InternalSqlDsl.g:4062:1: ( '{' )
            // InternalSqlDsl.g:4063:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalSqlDsl.g:4072:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4076:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalSqlDsl.g:4077:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalSqlDsl.g:4084:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4088:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalSqlDsl.g:4089:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalSqlDsl.g:4089:1: ( ( rule__Column__Group_4__0 )? )
            // InternalSqlDsl.g:4090:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalSqlDsl.g:4091:2: ( rule__Column__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSqlDsl.g:4091:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalSqlDsl.g:4099:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4103:1: ( rule__Column__Group__5__Impl )
            // InternalSqlDsl.g:4104:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

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
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalSqlDsl.g:4110:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4114:1: ( ( '}' ) )
            // InternalSqlDsl.g:4115:1: ( '}' )
            {
            // InternalSqlDsl.g:4115:1: ( '}' )
            // InternalSqlDsl.g:4116:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalSqlDsl.g:4126:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4130:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalSqlDsl.g:4131:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

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
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalSqlDsl.g:4138:1: rule__Column__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4142:1: ( ( 'type' ) )
            // InternalSqlDsl.g:4143:1: ( 'type' )
            {
            // InternalSqlDsl.g:4143:1: ( 'type' )
            // InternalSqlDsl.g:4144:2: 'type'
            {
             before(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalSqlDsl.g:4153:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4157:1: ( rule__Column__Group_4__1__Impl )
            // InternalSqlDsl.g:4158:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

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
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalSqlDsl.g:4164:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__TypeAssignment_4_1 ) ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4168:1: ( ( ( rule__Column__TypeAssignment_4_1 ) ) )
            // InternalSqlDsl.g:4169:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:4169:1: ( ( rule__Column__TypeAssignment_4_1 ) )
            // InternalSqlDsl.g:4170:2: ( rule__Column__TypeAssignment_4_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 
            // InternalSqlDsl.g:4171:2: ( rule__Column__TypeAssignment_4_1 )
            // InternalSqlDsl.g:4171:3: rule__Column__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Clause__Group__0"
    // InternalSqlDsl.g:4180:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4184:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalSqlDsl.g:4185:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSqlDsl.g:4192:1: rule__Clause__Group__0__Impl : ( 'Clause' ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4196:1: ( ( 'Clause' ) )
            // InternalSqlDsl.g:4197:1: ( 'Clause' )
            {
            // InternalSqlDsl.g:4197:1: ( 'Clause' )
            // InternalSqlDsl.g:4198:2: 'Clause'
            {
             before(grammarAccess.getClauseAccess().getClauseKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getClauseKeyword_0()); 

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
    // InternalSqlDsl.g:4207:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl rule__Clause__Group__2 ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4211:1: ( rule__Clause__Group__1__Impl rule__Clause__Group__2 )
            // InternalSqlDsl.g:4212:2: rule__Clause__Group__1__Impl rule__Clause__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Clause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__2();

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
    // InternalSqlDsl.g:4219:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__NameAssignment_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4223:1: ( ( ( rule__Clause__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:4224:1: ( ( rule__Clause__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:4224:1: ( ( rule__Clause__NameAssignment_1 ) )
            // InternalSqlDsl.g:4225:2: ( rule__Clause__NameAssignment_1 )
            {
             before(grammarAccess.getClauseAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:4226:2: ( rule__Clause__NameAssignment_1 )
            // InternalSqlDsl.g:4226:3: rule__Clause__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clause__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Clause__Group__2"
    // InternalSqlDsl.g:4234:1: rule__Clause__Group__2 : rule__Clause__Group__2__Impl rule__Clause__Group__3 ;
    public final void rule__Clause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4238:1: ( rule__Clause__Group__2__Impl rule__Clause__Group__3 )
            // InternalSqlDsl.g:4239:2: rule__Clause__Group__2__Impl rule__Clause__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Clause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__3();

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
    // $ANTLR end "rule__Clause__Group__2"


    // $ANTLR start "rule__Clause__Group__2__Impl"
    // InternalSqlDsl.g:4246:1: rule__Clause__Group__2__Impl : ( '{' ) ;
    public final void rule__Clause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4250:1: ( ( '{' ) )
            // InternalSqlDsl.g:4251:1: ( '{' )
            {
            // InternalSqlDsl.g:4251:1: ( '{' )
            // InternalSqlDsl.g:4252:2: '{'
            {
             before(grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Clause__Group__2__Impl"


    // $ANTLR start "rule__Clause__Group__3"
    // InternalSqlDsl.g:4261:1: rule__Clause__Group__3 : rule__Clause__Group__3__Impl rule__Clause__Group__4 ;
    public final void rule__Clause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4265:1: ( rule__Clause__Group__3__Impl rule__Clause__Group__4 )
            // InternalSqlDsl.g:4266:2: rule__Clause__Group__3__Impl rule__Clause__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Clause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__4();

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
    // $ANTLR end "rule__Clause__Group__3"


    // $ANTLR start "rule__Clause__Group__3__Impl"
    // InternalSqlDsl.g:4273:1: rule__Clause__Group__3__Impl : ( 'body' ) ;
    public final void rule__Clause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4277:1: ( ( 'body' ) )
            // InternalSqlDsl.g:4278:1: ( 'body' )
            {
            // InternalSqlDsl.g:4278:1: ( 'body' )
            // InternalSqlDsl.g:4279:2: 'body'
            {
             before(grammarAccess.getClauseAccess().getBodyKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getBodyKeyword_3()); 

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
    // $ANTLR end "rule__Clause__Group__3__Impl"


    // $ANTLR start "rule__Clause__Group__4"
    // InternalSqlDsl.g:4288:1: rule__Clause__Group__4 : rule__Clause__Group__4__Impl rule__Clause__Group__5 ;
    public final void rule__Clause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4292:1: ( rule__Clause__Group__4__Impl rule__Clause__Group__5 )
            // InternalSqlDsl.g:4293:2: rule__Clause__Group__4__Impl rule__Clause__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Clause__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__5();

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
    // $ANTLR end "rule__Clause__Group__4"


    // $ANTLR start "rule__Clause__Group__4__Impl"
    // InternalSqlDsl.g:4300:1: rule__Clause__Group__4__Impl : ( ( rule__Clause__BodyAssignment_4 ) ) ;
    public final void rule__Clause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4304:1: ( ( ( rule__Clause__BodyAssignment_4 ) ) )
            // InternalSqlDsl.g:4305:1: ( ( rule__Clause__BodyAssignment_4 ) )
            {
            // InternalSqlDsl.g:4305:1: ( ( rule__Clause__BodyAssignment_4 ) )
            // InternalSqlDsl.g:4306:2: ( rule__Clause__BodyAssignment_4 )
            {
             before(grammarAccess.getClauseAccess().getBodyAssignment_4()); 
            // InternalSqlDsl.g:4307:2: ( rule__Clause__BodyAssignment_4 )
            // InternalSqlDsl.g:4307:3: rule__Clause__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Clause__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getBodyAssignment_4()); 

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
    // $ANTLR end "rule__Clause__Group__4__Impl"


    // $ANTLR start "rule__Clause__Group__5"
    // InternalSqlDsl.g:4315:1: rule__Clause__Group__5 : rule__Clause__Group__5__Impl ;
    public final void rule__Clause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4319:1: ( rule__Clause__Group__5__Impl )
            // InternalSqlDsl.g:4320:2: rule__Clause__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__5__Impl();

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
    // $ANTLR end "rule__Clause__Group__5"


    // $ANTLR start "rule__Clause__Group__5__Impl"
    // InternalSqlDsl.g:4326:1: rule__Clause__Group__5__Impl : ( '}' ) ;
    public final void rule__Clause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4330:1: ( ( '}' ) )
            // InternalSqlDsl.g:4331:1: ( '}' )
            {
            // InternalSqlDsl.g:4331:1: ( '}' )
            // InternalSqlDsl.g:4332:2: '}'
            {
             before(grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Clause__Group__5__Impl"


    // $ANTLR start "rule__Constaint__Group__0"
    // InternalSqlDsl.g:4342:1: rule__Constaint__Group__0 : rule__Constaint__Group__0__Impl rule__Constaint__Group__1 ;
    public final void rule__Constaint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4346:1: ( rule__Constaint__Group__0__Impl rule__Constaint__Group__1 )
            // InternalSqlDsl.g:4347:2: rule__Constaint__Group__0__Impl rule__Constaint__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:4354:1: rule__Constaint__Group__0__Impl : ( 'Constaint' ) ;
    public final void rule__Constaint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4358:1: ( ( 'Constaint' ) )
            // InternalSqlDsl.g:4359:1: ( 'Constaint' )
            {
            // InternalSqlDsl.g:4359:1: ( 'Constaint' )
            // InternalSqlDsl.g:4360:2: 'Constaint'
            {
             before(grammarAccess.getConstaintAccess().getConstaintKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstaintAccess().getConstaintKeyword_0()); 

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
    // InternalSqlDsl.g:4369:1: rule__Constaint__Group__1 : rule__Constaint__Group__1__Impl rule__Constaint__Group__2 ;
    public final void rule__Constaint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4373:1: ( rule__Constaint__Group__1__Impl rule__Constaint__Group__2 )
            // InternalSqlDsl.g:4374:2: rule__Constaint__Group__1__Impl rule__Constaint__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Constaint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constaint__Group__2();

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
    // InternalSqlDsl.g:4381:1: rule__Constaint__Group__1__Impl : ( '{' ) ;
    public final void rule__Constaint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4385:1: ( ( '{' ) )
            // InternalSqlDsl.g:4386:1: ( '{' )
            {
            // InternalSqlDsl.g:4386:1: ( '{' )
            // InternalSqlDsl.g:4387:2: '{'
            {
             before(grammarAccess.getConstaintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConstaintAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__Constaint__Group__2"
    // InternalSqlDsl.g:4396:1: rule__Constaint__Group__2 : rule__Constaint__Group__2__Impl rule__Constaint__Group__3 ;
    public final void rule__Constaint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4400:1: ( rule__Constaint__Group__2__Impl rule__Constaint__Group__3 )
            // InternalSqlDsl.g:4401:2: rule__Constaint__Group__2__Impl rule__Constaint__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Constaint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constaint__Group__3();

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
    // $ANTLR end "rule__Constaint__Group__2"


    // $ANTLR start "rule__Constaint__Group__2__Impl"
    // InternalSqlDsl.g:4408:1: rule__Constaint__Group__2__Impl : ( 'body' ) ;
    public final void rule__Constaint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4412:1: ( ( 'body' ) )
            // InternalSqlDsl.g:4413:1: ( 'body' )
            {
            // InternalSqlDsl.g:4413:1: ( 'body' )
            // InternalSqlDsl.g:4414:2: 'body'
            {
             before(grammarAccess.getConstaintAccess().getBodyKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstaintAccess().getBodyKeyword_2()); 

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
    // $ANTLR end "rule__Constaint__Group__2__Impl"


    // $ANTLR start "rule__Constaint__Group__3"
    // InternalSqlDsl.g:4423:1: rule__Constaint__Group__3 : rule__Constaint__Group__3__Impl rule__Constaint__Group__4 ;
    public final void rule__Constaint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4427:1: ( rule__Constaint__Group__3__Impl rule__Constaint__Group__4 )
            // InternalSqlDsl.g:4428:2: rule__Constaint__Group__3__Impl rule__Constaint__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Constaint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constaint__Group__4();

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
    // $ANTLR end "rule__Constaint__Group__3"


    // $ANTLR start "rule__Constaint__Group__3__Impl"
    // InternalSqlDsl.g:4435:1: rule__Constaint__Group__3__Impl : ( ( rule__Constaint__BodyAssignment_3 ) ) ;
    public final void rule__Constaint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4439:1: ( ( ( rule__Constaint__BodyAssignment_3 ) ) )
            // InternalSqlDsl.g:4440:1: ( ( rule__Constaint__BodyAssignment_3 ) )
            {
            // InternalSqlDsl.g:4440:1: ( ( rule__Constaint__BodyAssignment_3 ) )
            // InternalSqlDsl.g:4441:2: ( rule__Constaint__BodyAssignment_3 )
            {
             before(grammarAccess.getConstaintAccess().getBodyAssignment_3()); 
            // InternalSqlDsl.g:4442:2: ( rule__Constaint__BodyAssignment_3 )
            // InternalSqlDsl.g:4442:3: rule__Constaint__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constaint__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstaintAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Constaint__Group__3__Impl"


    // $ANTLR start "rule__Constaint__Group__4"
    // InternalSqlDsl.g:4450:1: rule__Constaint__Group__4 : rule__Constaint__Group__4__Impl ;
    public final void rule__Constaint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4454:1: ( rule__Constaint__Group__4__Impl )
            // InternalSqlDsl.g:4455:2: rule__Constaint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constaint__Group__4__Impl();

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
    // $ANTLR end "rule__Constaint__Group__4"


    // $ANTLR start "rule__Constaint__Group__4__Impl"
    // InternalSqlDsl.g:4461:1: rule__Constaint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constaint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4465:1: ( ( '}' ) )
            // InternalSqlDsl.g:4466:1: ( '}' )
            {
            // InternalSqlDsl.g:4466:1: ( '}' )
            // InternalSqlDsl.g:4467:2: '}'
            {
             before(grammarAccess.getConstaintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConstaintAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Constaint__Group__4__Impl"


    // $ANTLR start "rule__Value__Group__0"
    // InternalSqlDsl.g:4477:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4481:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSqlDsl.g:4482:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalSqlDsl.g:4489:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4493:1: ( ( () ) )
            // InternalSqlDsl.g:4494:1: ( () )
            {
            // InternalSqlDsl.g:4494:1: ( () )
            // InternalSqlDsl.g:4495:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSqlDsl.g:4496:2: ()
            // InternalSqlDsl.g:4496:3: 
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
    // InternalSqlDsl.g:4504:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4508:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalSqlDsl.g:4509:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:4516:1: rule__Value__Group__1__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4520:1: ( ( 'Value' ) )
            // InternalSqlDsl.g:4521:1: ( 'Value' )
            {
            // InternalSqlDsl.g:4521:1: ( 'Value' )
            // InternalSqlDsl.g:4522:2: 'Value'
            {
             before(grammarAccess.getValueAccess().getValueKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSqlDsl.g:4531:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4535:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalSqlDsl.g:4536:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSqlDsl.g:4543:1: rule__Value__Group__2__Impl : ( '{' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4547:1: ( ( '{' ) )
            // InternalSqlDsl.g:4548:1: ( '{' )
            {
            // InternalSqlDsl.g:4548:1: ( '{' )
            // InternalSqlDsl.g:4549:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSqlDsl.g:4558:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4562:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalSqlDsl.g:4563:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSqlDsl.g:4570:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4574:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalSqlDsl.g:4575:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalSqlDsl.g:4575:1: ( ( rule__Value__Group_3__0 )? )
            // InternalSqlDsl.g:4576:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalSqlDsl.g:4577:2: ( rule__Value__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSqlDsl.g:4577:3: rule__Value__Group_3__0
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
    // InternalSqlDsl.g:4585:1: rule__Value__Group__4 : rule__Value__Group__4__Impl ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4589:1: ( rule__Value__Group__4__Impl )
            // InternalSqlDsl.g:4590:2: rule__Value__Group__4__Impl
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
    // InternalSqlDsl.g:4596:1: rule__Value__Group__4__Impl : ( '}' ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4600:1: ( ( '}' ) )
            // InternalSqlDsl.g:4601:1: ( '}' )
            {
            // InternalSqlDsl.g:4601:1: ( '}' )
            // InternalSqlDsl.g:4602:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalSqlDsl.g:4612:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4616:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalSqlDsl.g:4617:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSqlDsl.g:4624:1: rule__Value__Group_3__0__Impl : ( 'columnvalues' ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4628:1: ( ( 'columnvalues' ) )
            // InternalSqlDsl.g:4629:1: ( 'columnvalues' )
            {
            // InternalSqlDsl.g:4629:1: ( 'columnvalues' )
            // InternalSqlDsl.g:4630:2: 'columnvalues'
            {
             before(grammarAccess.getValueAccess().getColumnvaluesKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getColumnvaluesKeyword_3_0()); 

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
    // InternalSqlDsl.g:4639:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl rule__Value__Group_3__2 ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4643:1: ( rule__Value__Group_3__1__Impl rule__Value__Group_3__2 )
            // InternalSqlDsl.g:4644:2: rule__Value__Group_3__1__Impl rule__Value__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__Value__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__2();

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
    // InternalSqlDsl.g:4651:1: rule__Value__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4655:1: ( ( '{' ) )
            // InternalSqlDsl.g:4656:1: ( '{' )
            {
            // InternalSqlDsl.g:4656:1: ( '{' )
            // InternalSqlDsl.g:4657:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3_1()); 

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


    // $ANTLR start "rule__Value__Group_3__2"
    // InternalSqlDsl.g:4666:1: rule__Value__Group_3__2 : rule__Value__Group_3__2__Impl rule__Value__Group_3__3 ;
    public final void rule__Value__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4670:1: ( rule__Value__Group_3__2__Impl rule__Value__Group_3__3 )
            // InternalSqlDsl.g:4671:2: rule__Value__Group_3__2__Impl rule__Value__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__3();

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
    // $ANTLR end "rule__Value__Group_3__2"


    // $ANTLR start "rule__Value__Group_3__2__Impl"
    // InternalSqlDsl.g:4678:1: rule__Value__Group_3__2__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_2 ) ) ;
    public final void rule__Value__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4682:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_2 ) ) )
            // InternalSqlDsl.g:4683:1: ( ( rule__Value__ColumnvaluesAssignment_3_2 ) )
            {
            // InternalSqlDsl.g:4683:1: ( ( rule__Value__ColumnvaluesAssignment_3_2 ) )
            // InternalSqlDsl.g:4684:2: ( rule__Value__ColumnvaluesAssignment_3_2 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_2()); 
            // InternalSqlDsl.g:4685:2: ( rule__Value__ColumnvaluesAssignment_3_2 )
            // InternalSqlDsl.g:4685:3: rule__Value__ColumnvaluesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Value__ColumnvaluesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_2()); 

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
    // $ANTLR end "rule__Value__Group_3__2__Impl"


    // $ANTLR start "rule__Value__Group_3__3"
    // InternalSqlDsl.g:4693:1: rule__Value__Group_3__3 : rule__Value__Group_3__3__Impl rule__Value__Group_3__4 ;
    public final void rule__Value__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4697:1: ( rule__Value__Group_3__3__Impl rule__Value__Group_3__4 )
            // InternalSqlDsl.g:4698:2: rule__Value__Group_3__3__Impl rule__Value__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Value__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__4();

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
    // $ANTLR end "rule__Value__Group_3__3"


    // $ANTLR start "rule__Value__Group_3__3__Impl"
    // InternalSqlDsl.g:4705:1: rule__Value__Group_3__3__Impl : ( ( rule__Value__Group_3_3__0 )* ) ;
    public final void rule__Value__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4709:1: ( ( ( rule__Value__Group_3_3__0 )* ) )
            // InternalSqlDsl.g:4710:1: ( ( rule__Value__Group_3_3__0 )* )
            {
            // InternalSqlDsl.g:4710:1: ( ( rule__Value__Group_3_3__0 )* )
            // InternalSqlDsl.g:4711:2: ( rule__Value__Group_3_3__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_3_3()); 
            // InternalSqlDsl.g:4712:2: ( rule__Value__Group_3_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSqlDsl.g:4712:3: rule__Value__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Value__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Value__Group_3__3__Impl"


    // $ANTLR start "rule__Value__Group_3__4"
    // InternalSqlDsl.g:4720:1: rule__Value__Group_3__4 : rule__Value__Group_3__4__Impl ;
    public final void rule__Value__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4724:1: ( rule__Value__Group_3__4__Impl )
            // InternalSqlDsl.g:4725:2: rule__Value__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__4__Impl();

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
    // $ANTLR end "rule__Value__Group_3__4"


    // $ANTLR start "rule__Value__Group_3__4__Impl"
    // InternalSqlDsl.g:4731:1: rule__Value__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Value__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4735:1: ( ( '}' ) )
            // InternalSqlDsl.g:4736:1: ( '}' )
            {
            // InternalSqlDsl.g:4736:1: ( '}' )
            // InternalSqlDsl.g:4737:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Value__Group_3__4__Impl"


    // $ANTLR start "rule__Value__Group_3_3__0"
    // InternalSqlDsl.g:4747:1: rule__Value__Group_3_3__0 : rule__Value__Group_3_3__0__Impl rule__Value__Group_3_3__1 ;
    public final void rule__Value__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4751:1: ( rule__Value__Group_3_3__0__Impl rule__Value__Group_3_3__1 )
            // InternalSqlDsl.g:4752:2: rule__Value__Group_3_3__0__Impl rule__Value__Group_3_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Value__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3_3__1();

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
    // $ANTLR end "rule__Value__Group_3_3__0"


    // $ANTLR start "rule__Value__Group_3_3__0__Impl"
    // InternalSqlDsl.g:4759:1: rule__Value__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Value__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4763:1: ( ( ',' ) )
            // InternalSqlDsl.g:4764:1: ( ',' )
            {
            // InternalSqlDsl.g:4764:1: ( ',' )
            // InternalSqlDsl.g:4765:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Value__Group_3_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3_3__1"
    // InternalSqlDsl.g:4774:1: rule__Value__Group_3_3__1 : rule__Value__Group_3_3__1__Impl ;
    public final void rule__Value__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4778:1: ( rule__Value__Group_3_3__1__Impl )
            // InternalSqlDsl.g:4779:2: rule__Value__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Value__Group_3_3__1"


    // $ANTLR start "rule__Value__Group_3_3__1__Impl"
    // InternalSqlDsl.g:4785:1: rule__Value__Group_3_3__1__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_3_1 ) ) ;
    public final void rule__Value__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4789:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_3_1 ) ) )
            // InternalSqlDsl.g:4790:1: ( ( rule__Value__ColumnvaluesAssignment_3_3_1 ) )
            {
            // InternalSqlDsl.g:4790:1: ( ( rule__Value__ColumnvaluesAssignment_3_3_1 ) )
            // InternalSqlDsl.g:4791:2: ( rule__Value__ColumnvaluesAssignment_3_3_1 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_3_1()); 
            // InternalSqlDsl.g:4792:2: ( rule__Value__ColumnvaluesAssignment_3_3_1 )
            // InternalSqlDsl.g:4792:3: rule__Value__ColumnvaluesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ColumnvaluesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Value__Group_3_3__1__Impl"


    // $ANTLR start "rule__ColumnValue__Group__0"
    // InternalSqlDsl.g:4801:1: rule__ColumnValue__Group__0 : rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 ;
    public final void rule__ColumnValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4805:1: ( rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 )
            // InternalSqlDsl.g:4806:2: rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSqlDsl.g:4813:1: rule__ColumnValue__Group__0__Impl : ( () ) ;
    public final void rule__ColumnValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4817:1: ( ( () ) )
            // InternalSqlDsl.g:4818:1: ( () )
            {
            // InternalSqlDsl.g:4818:1: ( () )
            // InternalSqlDsl.g:4819:2: ()
            {
             before(grammarAccess.getColumnValueAccess().getColumnValueAction_0()); 
            // InternalSqlDsl.g:4820:2: ()
            // InternalSqlDsl.g:4820:3: 
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
    // InternalSqlDsl.g:4828:1: rule__ColumnValue__Group__1 : rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2 ;
    public final void rule__ColumnValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4832:1: ( rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2 )
            // InternalSqlDsl.g:4833:2: rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ColumnValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__2();

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
    // InternalSqlDsl.g:4840:1: rule__ColumnValue__Group__1__Impl : ( 'ColumnValue' ) ;
    public final void rule__ColumnValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4844:1: ( ( 'ColumnValue' ) )
            // InternalSqlDsl.g:4845:1: ( 'ColumnValue' )
            {
            // InternalSqlDsl.g:4845:1: ( 'ColumnValue' )
            // InternalSqlDsl.g:4846:2: 'ColumnValue'
            {
             before(grammarAccess.getColumnValueAccess().getColumnValueKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getColumnValueAccess().getColumnValueKeyword_1()); 

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


    // $ANTLR start "rule__ColumnValue__Group__2"
    // InternalSqlDsl.g:4855:1: rule__ColumnValue__Group__2 : rule__ColumnValue__Group__2__Impl rule__ColumnValue__Group__3 ;
    public final void rule__ColumnValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4859:1: ( rule__ColumnValue__Group__2__Impl rule__ColumnValue__Group__3 )
            // InternalSqlDsl.g:4860:2: rule__ColumnValue__Group__2__Impl rule__ColumnValue__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ColumnValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__3();

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
    // $ANTLR end "rule__ColumnValue__Group__2"


    // $ANTLR start "rule__ColumnValue__Group__2__Impl"
    // InternalSqlDsl.g:4867:1: rule__ColumnValue__Group__2__Impl : ( '{' ) ;
    public final void rule__ColumnValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4871:1: ( ( '{' ) )
            // InternalSqlDsl.g:4872:1: ( '{' )
            {
            // InternalSqlDsl.g:4872:1: ( '{' )
            // InternalSqlDsl.g:4873:2: '{'
            {
             before(grammarAccess.getColumnValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColumnValueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ColumnValue__Group__2__Impl"


    // $ANTLR start "rule__ColumnValue__Group__3"
    // InternalSqlDsl.g:4882:1: rule__ColumnValue__Group__3 : rule__ColumnValue__Group__3__Impl rule__ColumnValue__Group__4 ;
    public final void rule__ColumnValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4886:1: ( rule__ColumnValue__Group__3__Impl rule__ColumnValue__Group__4 )
            // InternalSqlDsl.g:4887:2: rule__ColumnValue__Group__3__Impl rule__ColumnValue__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ColumnValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__4();

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
    // $ANTLR end "rule__ColumnValue__Group__3"


    // $ANTLR start "rule__ColumnValue__Group__3__Impl"
    // InternalSqlDsl.g:4894:1: rule__ColumnValue__Group__3__Impl : ( ( rule__ColumnValue__Group_3__0 )? ) ;
    public final void rule__ColumnValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4898:1: ( ( ( rule__ColumnValue__Group_3__0 )? ) )
            // InternalSqlDsl.g:4899:1: ( ( rule__ColumnValue__Group_3__0 )? )
            {
            // InternalSqlDsl.g:4899:1: ( ( rule__ColumnValue__Group_3__0 )? )
            // InternalSqlDsl.g:4900:2: ( rule__ColumnValue__Group_3__0 )?
            {
             before(grammarAccess.getColumnValueAccess().getGroup_3()); 
            // InternalSqlDsl.g:4901:2: ( rule__ColumnValue__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSqlDsl.g:4901:3: rule__ColumnValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnValueAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ColumnValue__Group__3__Impl"


    // $ANTLR start "rule__ColumnValue__Group__4"
    // InternalSqlDsl.g:4909:1: rule__ColumnValue__Group__4 : rule__ColumnValue__Group__4__Impl ;
    public final void rule__ColumnValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4913:1: ( rule__ColumnValue__Group__4__Impl )
            // InternalSqlDsl.g:4914:2: rule__ColumnValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group__4__Impl();

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
    // $ANTLR end "rule__ColumnValue__Group__4"


    // $ANTLR start "rule__ColumnValue__Group__4__Impl"
    // InternalSqlDsl.g:4920:1: rule__ColumnValue__Group__4__Impl : ( '}' ) ;
    public final void rule__ColumnValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4924:1: ( ( '}' ) )
            // InternalSqlDsl.g:4925:1: ( '}' )
            {
            // InternalSqlDsl.g:4925:1: ( '}' )
            // InternalSqlDsl.g:4926:2: '}'
            {
             before(grammarAccess.getColumnValueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getColumnValueAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ColumnValue__Group__4__Impl"


    // $ANTLR start "rule__ColumnValue__Group_3__0"
    // InternalSqlDsl.g:4936:1: rule__ColumnValue__Group_3__0 : rule__ColumnValue__Group_3__0__Impl rule__ColumnValue__Group_3__1 ;
    public final void rule__ColumnValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4940:1: ( rule__ColumnValue__Group_3__0__Impl rule__ColumnValue__Group_3__1 )
            // InternalSqlDsl.g:4941:2: rule__ColumnValue__Group_3__0__Impl rule__ColumnValue__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ColumnValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group_3__1();

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
    // $ANTLR end "rule__ColumnValue__Group_3__0"


    // $ANTLR start "rule__ColumnValue__Group_3__0__Impl"
    // InternalSqlDsl.g:4948:1: rule__ColumnValue__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__ColumnValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4952:1: ( ( 'value' ) )
            // InternalSqlDsl.g:4953:1: ( 'value' )
            {
            // InternalSqlDsl.g:4953:1: ( 'value' )
            // InternalSqlDsl.g:4954:2: 'value'
            {
             before(grammarAccess.getColumnValueAccess().getValueKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getColumnValueAccess().getValueKeyword_3_0()); 

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
    // $ANTLR end "rule__ColumnValue__Group_3__0__Impl"


    // $ANTLR start "rule__ColumnValue__Group_3__1"
    // InternalSqlDsl.g:4963:1: rule__ColumnValue__Group_3__1 : rule__ColumnValue__Group_3__1__Impl ;
    public final void rule__ColumnValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4967:1: ( rule__ColumnValue__Group_3__1__Impl )
            // InternalSqlDsl.g:4968:2: rule__ColumnValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__Group_3__1__Impl();

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
    // $ANTLR end "rule__ColumnValue__Group_3__1"


    // $ANTLR start "rule__ColumnValue__Group_3__1__Impl"
    // InternalSqlDsl.g:4974:1: rule__ColumnValue__Group_3__1__Impl : ( ( rule__ColumnValue__ValueAssignment_3_1 ) ) ;
    public final void rule__ColumnValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4978:1: ( ( ( rule__ColumnValue__ValueAssignment_3_1 ) ) )
            // InternalSqlDsl.g:4979:1: ( ( rule__ColumnValue__ValueAssignment_3_1 ) )
            {
            // InternalSqlDsl.g:4979:1: ( ( rule__ColumnValue__ValueAssignment_3_1 ) )
            // InternalSqlDsl.g:4980:2: ( rule__ColumnValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getColumnValueAccess().getValueAssignment_3_1()); 
            // InternalSqlDsl.g:4981:2: ( rule__ColumnValue__ValueAssignment_3_1 )
            // InternalSqlDsl.g:4981:3: rule__ColumnValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ColumnValue__Group_3__1__Impl"


    // $ANTLR start "rule__SqlProgram__QueriesAssignment_3_2"
    // InternalSqlDsl.g:4990:1: rule__SqlProgram__QueriesAssignment_3_2 : ( ruleQueries ) ;
    public final void rule__SqlProgram__QueriesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4994:1: ( ( ruleQueries ) )
            // InternalSqlDsl.g:4995:2: ( ruleQueries )
            {
            // InternalSqlDsl.g:4995:2: ( ruleQueries )
            // InternalSqlDsl.g:4996:3: ruleQueries
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__SqlProgram__QueriesAssignment_3_2"


    // $ANTLR start "rule__SqlProgram__QueriesAssignment_3_3_1"
    // InternalSqlDsl.g:5005:1: rule__SqlProgram__QueriesAssignment_3_3_1 : ( ruleQueries ) ;
    public final void rule__SqlProgram__QueriesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5009:1: ( ( ruleQueries ) )
            // InternalSqlDsl.g:5010:2: ( ruleQueries )
            {
            // InternalSqlDsl.g:5010:2: ( ruleQueries )
            // InternalSqlDsl.g:5011:3: ruleQueries
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueries();

            state._fsp--;

             after(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__SqlProgram__QueriesAssignment_3_3_1"


    // $ANTLR start "rule__Selection__ObjectsAssignment_3_2"
    // InternalSqlDsl.g:5020:1: rule__Selection__ObjectsAssignment_3_2 : ( ruleObjects ) ;
    public final void rule__Selection__ObjectsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5024:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5025:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5025:2: ( ruleObjects )
            // InternalSqlDsl.g:5026:3: ruleObjects
            {
             before(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Selection__ObjectsAssignment_3_2"


    // $ANTLR start "rule__Selection__ObjectsAssignment_3_3_1"
    // InternalSqlDsl.g:5035:1: rule__Selection__ObjectsAssignment_3_3_1 : ( ruleObjects ) ;
    public final void rule__Selection__ObjectsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5039:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5040:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5040:2: ( ruleObjects )
            // InternalSqlDsl.g:5041:3: ruleObjects
            {
             before(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Selection__ObjectsAssignment_3_3_1"


    // $ANTLR start "rule__Selection__ClausesAssignment_4_2"
    // InternalSqlDsl.g:5050:1: rule__Selection__ClausesAssignment_4_2 : ( ruleClause ) ;
    public final void rule__Selection__ClausesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5054:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5055:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5055:2: ( ruleClause )
            // InternalSqlDsl.g:5056:3: ruleClause
            {
             before(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Selection__ClausesAssignment_4_2"


    // $ANTLR start "rule__Selection__ClausesAssignment_4_3_1"
    // InternalSqlDsl.g:5065:1: rule__Selection__ClausesAssignment_4_3_1 : ( ruleClause ) ;
    public final void rule__Selection__ClausesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5069:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5070:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5070:2: ( ruleClause )
            // InternalSqlDsl.g:5071:3: ruleClause
            {
             before(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Selection__ClausesAssignment_4_3_1"


    // $ANTLR start "rule__Creation__TypeAssignment_3_1"
    // InternalSqlDsl.g:5080:1: rule__Creation__TypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Creation__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5084:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5085:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5085:2: ( ruleEString )
            // InternalSqlDsl.g:5086:3: ruleEString
            {
             before(grammarAccess.getCreationAccess().getTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getTypeEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Creation__TypeAssignment_3_1"


    // $ANTLR start "rule__Creation__ObjectsAssignment_4_2"
    // InternalSqlDsl.g:5095:1: rule__Creation__ObjectsAssignment_4_2 : ( ruleObjects ) ;
    public final void rule__Creation__ObjectsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5099:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5100:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5100:2: ( ruleObjects )
            // InternalSqlDsl.g:5101:3: ruleObjects
            {
             before(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Creation__ObjectsAssignment_4_2"


    // $ANTLR start "rule__Creation__ObjectsAssignment_4_3_1"
    // InternalSqlDsl.g:5110:1: rule__Creation__ObjectsAssignment_4_3_1 : ( ruleObjects ) ;
    public final void rule__Creation__ObjectsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5114:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5115:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5115:2: ( ruleObjects )
            // InternalSqlDsl.g:5116:3: ruleObjects
            {
             before(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Creation__ObjectsAssignment_4_3_1"


    // $ANTLR start "rule__Creation__ConstaintsAssignment_5_2"
    // InternalSqlDsl.g:5125:1: rule__Creation__ConstaintsAssignment_5_2 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5129:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:5130:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:5130:2: ( ruleConstaint )
            // InternalSqlDsl.g:5131:3: ruleConstaint
            {
             before(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstaint();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Creation__ConstaintsAssignment_5_2"


    // $ANTLR start "rule__Creation__ConstaintsAssignment_5_3_1"
    // InternalSqlDsl.g:5140:1: rule__Creation__ConstaintsAssignment_5_3_1 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5144:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:5145:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:5145:2: ( ruleConstaint )
            // InternalSqlDsl.g:5146:3: ruleConstaint
            {
             before(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstaint();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Creation__ConstaintsAssignment_5_3_1"


    // $ANTLR start "rule__Update__ObjectsAssignment_3_2"
    // InternalSqlDsl.g:5155:1: rule__Update__ObjectsAssignment_3_2 : ( ruleObjects ) ;
    public final void rule__Update__ObjectsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5159:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5160:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5160:2: ( ruleObjects )
            // InternalSqlDsl.g:5161:3: ruleObjects
            {
             before(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Update__ObjectsAssignment_3_2"


    // $ANTLR start "rule__Update__ObjectsAssignment_3_3_1"
    // InternalSqlDsl.g:5170:1: rule__Update__ObjectsAssignment_3_3_1 : ( ruleObjects ) ;
    public final void rule__Update__ObjectsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5174:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5175:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5175:2: ( ruleObjects )
            // InternalSqlDsl.g:5176:3: ruleObjects
            {
             before(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Update__ObjectsAssignment_3_3_1"


    // $ANTLR start "rule__Update__ClausesAssignment_4_2"
    // InternalSqlDsl.g:5185:1: rule__Update__ClausesAssignment_4_2 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5189:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5190:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5190:2: ( ruleClause )
            // InternalSqlDsl.g:5191:3: ruleClause
            {
             before(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Update__ClausesAssignment_4_2"


    // $ANTLR start "rule__Update__ClausesAssignment_4_3_1"
    // InternalSqlDsl.g:5200:1: rule__Update__ClausesAssignment_4_3_1 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5204:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5205:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5205:2: ( ruleClause )
            // InternalSqlDsl.g:5206:3: ruleClause
            {
             before(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Update__ClausesAssignment_4_3_1"


    // $ANTLR start "rule__Insertion__ObjectsAssignment_3_2"
    // InternalSqlDsl.g:5215:1: rule__Insertion__ObjectsAssignment_3_2 : ( ruleObjects ) ;
    public final void rule__Insertion__ObjectsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5219:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5220:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5220:2: ( ruleObjects )
            // InternalSqlDsl.g:5221:3: ruleObjects
            {
             before(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Insertion__ObjectsAssignment_3_2"


    // $ANTLR start "rule__Insertion__ObjectsAssignment_3_3_1"
    // InternalSqlDsl.g:5230:1: rule__Insertion__ObjectsAssignment_3_3_1 : ( ruleObjects ) ;
    public final void rule__Insertion__ObjectsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5234:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5235:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5235:2: ( ruleObjects )
            // InternalSqlDsl.g:5236:3: ruleObjects
            {
             before(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Insertion__ObjectsAssignment_3_3_1"


    // $ANTLR start "rule__Insertion__ValuesAssignment_4_2"
    // InternalSqlDsl.g:5245:1: rule__Insertion__ValuesAssignment_4_2 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5249:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:5250:2: ( ruleValue )
            {
            // InternalSqlDsl.g:5250:2: ( ruleValue )
            // InternalSqlDsl.g:5251:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Insertion__ValuesAssignment_4_2"


    // $ANTLR start "rule__Insertion__ValuesAssignment_4_3_1"
    // InternalSqlDsl.g:5260:1: rule__Insertion__ValuesAssignment_4_3_1 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5264:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:5265:2: ( ruleValue )
            {
            // InternalSqlDsl.g:5265:2: ( ruleValue )
            // InternalSqlDsl.g:5266:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Insertion__ValuesAssignment_4_3_1"


    // $ANTLR start "rule__Delete__ObjectsAssignment_3_2"
    // InternalSqlDsl.g:5275:1: rule__Delete__ObjectsAssignment_3_2 : ( ruleObjects ) ;
    public final void rule__Delete__ObjectsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5279:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5280:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5280:2: ( ruleObjects )
            // InternalSqlDsl.g:5281:3: ruleObjects
            {
             before(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Delete__ObjectsAssignment_3_2"


    // $ANTLR start "rule__Delete__ObjectsAssignment_3_3_1"
    // InternalSqlDsl.g:5290:1: rule__Delete__ObjectsAssignment_3_3_1 : ( ruleObjects ) ;
    public final void rule__Delete__ObjectsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5294:1: ( ( ruleObjects ) )
            // InternalSqlDsl.g:5295:2: ( ruleObjects )
            {
            // InternalSqlDsl.g:5295:2: ( ruleObjects )
            // InternalSqlDsl.g:5296:3: ruleObjects
            {
             before(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjects();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Delete__ObjectsAssignment_3_3_1"


    // $ANTLR start "rule__Delete__ClausesAssignment_4_2"
    // InternalSqlDsl.g:5305:1: rule__Delete__ClausesAssignment_4_2 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5309:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5310:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5310:2: ( ruleClause )
            // InternalSqlDsl.g:5311:3: ruleClause
            {
             before(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Delete__ClausesAssignment_4_2"


    // $ANTLR start "rule__Delete__ClausesAssignment_4_3_1"
    // InternalSqlDsl.g:5320:1: rule__Delete__ClausesAssignment_4_3_1 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5324:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:5325:2: ( ruleClause )
            {
            // InternalSqlDsl.g:5325:2: ( ruleClause )
            // InternalSqlDsl.g:5326:3: ruleClause
            {
             before(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Delete__ClausesAssignment_4_3_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalSqlDsl.g:5335:1: rule__Table__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5339:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5340:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5340:2: ( ruleEString )
            // InternalSqlDsl.g:5341:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_2"
    // InternalSqlDsl.g:5350:1: rule__Table__ColumnsAssignment_4_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5354:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:5355:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:5355:2: ( ruleColumn )
            // InternalSqlDsl.g:5356:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_4_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_3_1"
    // InternalSqlDsl.g:5365:1: rule__Table__ColumnsAssignment_4_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5369:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:5370:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:5370:2: ( ruleColumn )
            // InternalSqlDsl.g:5371:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_4_3_1"


    // $ANTLR start "rule__Column__NameAssignment_2"
    // InternalSqlDsl.g:5380:1: rule__Column__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5384:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5385:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5385:2: ( ruleEString )
            // InternalSqlDsl.g:5386:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment_2"


    // $ANTLR start "rule__Column__TypeAssignment_4_1"
    // InternalSqlDsl.g:5395:1: rule__Column__TypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Column__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5399:1: ( ( ( ruleEString ) ) )
            // InternalSqlDsl.g:5400:2: ( ( ruleEString ) )
            {
            // InternalSqlDsl.g:5400:2: ( ( ruleEString ) )
            // InternalSqlDsl.g:5401:3: ( ruleEString )
            {
             before(grammarAccess.getColumnAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalSqlDsl.g:5402:3: ( ruleEString )
            // InternalSqlDsl.g:5403:4: ruleEString
            {
             before(grammarAccess.getColumnAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getColumnAccess().getTypeTypeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Column__TypeAssignment_4_1"


    // $ANTLR start "rule__Clause__NameAssignment_1"
    // InternalSqlDsl.g:5414:1: rule__Clause__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clause__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5418:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5419:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5419:2: ( ruleEString )
            // InternalSqlDsl.g:5420:3: ruleEString
            {
             before(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Clause__NameAssignment_1"


    // $ANTLR start "rule__Clause__BodyAssignment_4"
    // InternalSqlDsl.g:5429:1: rule__Clause__BodyAssignment_4 : ( ruleEString ) ;
    public final void rule__Clause__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5433:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5434:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5434:2: ( ruleEString )
            // InternalSqlDsl.g:5435:3: ruleEString
            {
             before(grammarAccess.getClauseAccess().getBodyEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getBodyEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Clause__BodyAssignment_4"


    // $ANTLR start "rule__Constaint__BodyAssignment_3"
    // InternalSqlDsl.g:5444:1: rule__Constaint__BodyAssignment_3 : ( ruleEString ) ;
    public final void rule__Constaint__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5448:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5449:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5449:2: ( ruleEString )
            // InternalSqlDsl.g:5450:3: ruleEString
            {
             before(grammarAccess.getConstaintAccess().getBodyEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConstaintAccess().getBodyEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constaint__BodyAssignment_3"


    // $ANTLR start "rule__Value__ColumnvaluesAssignment_3_2"
    // InternalSqlDsl.g:5459:1: rule__Value__ColumnvaluesAssignment_3_2 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5463:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:5464:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:5464:2: ( ruleColumnValue )
            // InternalSqlDsl.g:5465:3: ruleColumnValue
            {
             before(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Value__ColumnvaluesAssignment_3_2"


    // $ANTLR start "rule__Value__ColumnvaluesAssignment_3_3_1"
    // InternalSqlDsl.g:5474:1: rule__Value__ColumnvaluesAssignment_3_3_1 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5478:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:5479:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:5479:2: ( ruleColumnValue )
            // InternalSqlDsl.g:5480:3: ruleColumnValue
            {
             before(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Value__ColumnvaluesAssignment_3_3_1"


    // $ANTLR start "rule__ColumnValue__ValueAssignment_3_1"
    // InternalSqlDsl.g:5489:1: rule__ColumnValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ColumnValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:5493:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:5494:2: ( ruleEString )
            {
            // InternalSqlDsl.g:5494:2: ( ruleEString )
            // InternalSqlDsl.g:5495:3: ruleEString
            {
             before(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ColumnValue__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002C90000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000322000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001022000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800002000L});

}
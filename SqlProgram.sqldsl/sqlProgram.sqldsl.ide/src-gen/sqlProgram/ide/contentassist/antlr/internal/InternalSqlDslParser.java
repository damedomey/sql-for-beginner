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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'varchar(100)'", "'char(100)'", "'text'", "'date'", "'INT'", "'FLOAT'", "'VARCHAR(100)'", "'CHAR(100)'", "'TEXT'", "'DATE'", "';'", "'SELECT'", "'FROM'", "','", "'CREATE'", "'ON'", "'UPDATE'", "'INSERT'", "'INTO'", "'VALUES'", "'{'", "'}'", "'DELETE'", "'CONSTRAINT'", "'Value'", "'('", "')'", "'.'", "'*'", "'='", "'<'", "'>'", "'TABLE'", "'INDEX'"
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
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int T__46=46;
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


    // $ANTLR start "entryRuleTableOnCreation"
    // InternalSqlDsl.g:278:1: entryRuleTableOnCreation : ruleTableOnCreation EOF ;
    public final void entryRuleTableOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:279:1: ( ruleTableOnCreation EOF )
            // InternalSqlDsl.g:280:1: ruleTableOnCreation EOF
            {
             before(grammarAccess.getTableOnCreationRule()); 
            pushFollow(FOLLOW_1);
            ruleTableOnCreation();

            state._fsp--;

             after(grammarAccess.getTableOnCreationRule()); 
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
    // $ANTLR end "entryRuleTableOnCreation"


    // $ANTLR start "ruleTableOnCreation"
    // InternalSqlDsl.g:287:1: ruleTableOnCreation : ( ( rule__TableOnCreation__Group__0 ) ) ;
    public final void ruleTableOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:291:2: ( ( ( rule__TableOnCreation__Group__0 ) ) )
            // InternalSqlDsl.g:292:2: ( ( rule__TableOnCreation__Group__0 ) )
            {
            // InternalSqlDsl.g:292:2: ( ( rule__TableOnCreation__Group__0 ) )
            // InternalSqlDsl.g:293:3: ( rule__TableOnCreation__Group__0 )
            {
             before(grammarAccess.getTableOnCreationAccess().getGroup()); 
            // InternalSqlDsl.g:294:3: ( rule__TableOnCreation__Group__0 )
            // InternalSqlDsl.g:294:4: rule__TableOnCreation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableOnCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableOnCreation"


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


    // $ANTLR start "entryRuleColumnOnCreation"
    // InternalSqlDsl.g:328:1: entryRuleColumnOnCreation : ruleColumnOnCreation EOF ;
    public final void entryRuleColumnOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:329:1: ( ruleColumnOnCreation EOF )
            // InternalSqlDsl.g:330:1: ruleColumnOnCreation EOF
            {
             before(grammarAccess.getColumnOnCreationRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnOnCreation();

            state._fsp--;

             after(grammarAccess.getColumnOnCreationRule()); 
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
    // $ANTLR end "entryRuleColumnOnCreation"


    // $ANTLR start "ruleColumnOnCreation"
    // InternalSqlDsl.g:337:1: ruleColumnOnCreation : ( ( rule__ColumnOnCreation__Group__0 ) ) ;
    public final void ruleColumnOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:341:2: ( ( ( rule__ColumnOnCreation__Group__0 ) ) )
            // InternalSqlDsl.g:342:2: ( ( rule__ColumnOnCreation__Group__0 ) )
            {
            // InternalSqlDsl.g:342:2: ( ( rule__ColumnOnCreation__Group__0 ) )
            // InternalSqlDsl.g:343:3: ( rule__ColumnOnCreation__Group__0 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getGroup()); 
            // InternalSqlDsl.g:344:3: ( rule__ColumnOnCreation__Group__0 )
            // InternalSqlDsl.g:344:4: rule__ColumnOnCreation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnOnCreationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnOnCreation"


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


    // $ANTLR start "entryRuleConstaintOnCreation"
    // InternalSqlDsl.g:378:1: entryRuleConstaintOnCreation : ruleConstaintOnCreation EOF ;
    public final void entryRuleConstaintOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:379:1: ( ruleConstaintOnCreation EOF )
            // InternalSqlDsl.g:380:1: ruleConstaintOnCreation EOF
            {
             before(grammarAccess.getConstaintOnCreationRule()); 
            pushFollow(FOLLOW_1);
            ruleConstaintOnCreation();

            state._fsp--;

             after(grammarAccess.getConstaintOnCreationRule()); 
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
    // $ANTLR end "entryRuleConstaintOnCreation"


    // $ANTLR start "ruleConstaintOnCreation"
    // InternalSqlDsl.g:387:1: ruleConstaintOnCreation : ( ( rule__ConstaintOnCreation__BodyAssignment ) ) ;
    public final void ruleConstaintOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:391:2: ( ( ( rule__ConstaintOnCreation__BodyAssignment ) ) )
            // InternalSqlDsl.g:392:2: ( ( rule__ConstaintOnCreation__BodyAssignment ) )
            {
            // InternalSqlDsl.g:392:2: ( ( rule__ConstaintOnCreation__BodyAssignment ) )
            // InternalSqlDsl.g:393:3: ( rule__ConstaintOnCreation__BodyAssignment )
            {
             before(grammarAccess.getConstaintOnCreationAccess().getBodyAssignment()); 
            // InternalSqlDsl.g:394:3: ( rule__ConstaintOnCreation__BodyAssignment )
            // InternalSqlDsl.g:394:4: rule__ConstaintOnCreation__BodyAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConstaintOnCreation__BodyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstaintOnCreationAccess().getBodyAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstaintOnCreation"


    // $ANTLR start "entryRuleClause"
    // InternalSqlDsl.g:403:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalSqlDsl.g:404:1: ( ruleClause EOF )
            // InternalSqlDsl.g:405:1: ruleClause EOF
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
    // InternalSqlDsl.g:412:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:416:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalSqlDsl.g:417:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalSqlDsl.g:417:2: ( ( rule__Clause__Group__0 ) )
            // InternalSqlDsl.g:418:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalSqlDsl.g:419:3: ( rule__Clause__Group__0 )
            // InternalSqlDsl.g:419:4: rule__Clause__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalSqlDsl.g:428:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:429:1: ( ruleValue EOF )
            // InternalSqlDsl.g:430:1: ruleValue EOF
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
    // InternalSqlDsl.g:437:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:441:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSqlDsl.g:442:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSqlDsl.g:442:2: ( ( rule__Value__Group__0 ) )
            // InternalSqlDsl.g:443:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSqlDsl.g:444:3: ( rule__Value__Group__0 )
            // InternalSqlDsl.g:444:4: rule__Value__Group__0
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
    // InternalSqlDsl.g:453:1: entryRuleColumnValue : ruleColumnValue EOF ;
    public final void entryRuleColumnValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:454:1: ( ruleColumnValue EOF )
            // InternalSqlDsl.g:455:1: ruleColumnValue EOF
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
    // InternalSqlDsl.g:462:1: ruleColumnValue : ( ( rule__ColumnValue__Group__0 ) ) ;
    public final void ruleColumnValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:466:2: ( ( ( rule__ColumnValue__Group__0 ) ) )
            // InternalSqlDsl.g:467:2: ( ( rule__ColumnValue__Group__0 ) )
            {
            // InternalSqlDsl.g:467:2: ( ( rule__ColumnValue__Group__0 ) )
            // InternalSqlDsl.g:468:3: ( rule__ColumnValue__Group__0 )
            {
             before(grammarAccess.getColumnValueAccess().getGroup()); 
            // InternalSqlDsl.g:469:3: ( rule__ColumnValue__Group__0 )
            // InternalSqlDsl.g:469:4: rule__ColumnValue__Group__0
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
    // InternalSqlDsl.g:478:1: entryRuleComplexString : ruleComplexString EOF ;
    public final void entryRuleComplexString() throws RecognitionException {
        try {
            // InternalSqlDsl.g:479:1: ( ruleComplexString EOF )
            // InternalSqlDsl.g:480:1: ruleComplexString EOF
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
    // InternalSqlDsl.g:487:1: ruleComplexString : ( ( rule__ComplexString__Group__0 ) ) ;
    public final void ruleComplexString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:491:2: ( ( ( rule__ComplexString__Group__0 ) ) )
            // InternalSqlDsl.g:492:2: ( ( rule__ComplexString__Group__0 ) )
            {
            // InternalSqlDsl.g:492:2: ( ( rule__ComplexString__Group__0 ) )
            // InternalSqlDsl.g:493:3: ( rule__ComplexString__Group__0 )
            {
             before(grammarAccess.getComplexStringAccess().getGroup()); 
            // InternalSqlDsl.g:494:3: ( rule__ComplexString__Group__0 )
            // InternalSqlDsl.g:494:4: rule__ComplexString__Group__0
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
    // InternalSqlDsl.g:502:1: rule__Queries__Alternatives : ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) );
    public final void rule__Queries__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:506:1: ( ( ruleSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 35:
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
                    // InternalSqlDsl.g:507:2: ( ruleSelection )
                    {
                    // InternalSqlDsl.g:507:2: ( ruleSelection )
                    // InternalSqlDsl.g:508:3: ruleSelection
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
                    // InternalSqlDsl.g:513:2: ( ruleCreation )
                    {
                    // InternalSqlDsl.g:513:2: ( ruleCreation )
                    // InternalSqlDsl.g:514:3: ruleCreation
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
                    // InternalSqlDsl.g:519:2: ( ruleUpdate )
                    {
                    // InternalSqlDsl.g:519:2: ( ruleUpdate )
                    // InternalSqlDsl.g:520:3: ruleUpdate
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
                    // InternalSqlDsl.g:525:2: ( ruleInsertion )
                    {
                    // InternalSqlDsl.g:525:2: ( ruleInsertion )
                    // InternalSqlDsl.g:526:3: ruleInsertion
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
                    // InternalSqlDsl.g:531:2: ( ruleDelete )
                    {
                    // InternalSqlDsl.g:531:2: ( ruleDelete )
                    // InternalSqlDsl.g:532:3: ruleDelete
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
    // InternalSqlDsl.g:541:1: rule__Creation__Alternatives_2 : ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) );
    public final void rule__Creation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:545:1: ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            else if ( (LA2_0==46) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlDsl.g:546:2: ( ( rule__Creation__Group_2_0__0 ) )
                    {
                    // InternalSqlDsl.g:546:2: ( ( rule__Creation__Group_2_0__0 ) )
                    // InternalSqlDsl.g:547:3: ( rule__Creation__Group_2_0__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_0()); 
                    // InternalSqlDsl.g:548:3: ( rule__Creation__Group_2_0__0 )
                    // InternalSqlDsl.g:548:4: rule__Creation__Group_2_0__0
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
                    // InternalSqlDsl.g:552:2: ( ( rule__Creation__Group_2_1__0 ) )
                    {
                    // InternalSqlDsl.g:552:2: ( ( rule__Creation__Group_2_1__0 ) )
                    // InternalSqlDsl.g:553:3: ( rule__Creation__Group_2_1__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_1()); 
                    // InternalSqlDsl.g:554:3: ( rule__Creation__Group_2_1__0 )
                    // InternalSqlDsl.g:554:4: rule__Creation__Group_2_1__0
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
    // InternalSqlDsl.g:562:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:566:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSqlDsl.g:567:2: ( RULE_STRING )
                    {
                    // InternalSqlDsl.g:567:2: ( RULE_STRING )
                    // InternalSqlDsl.g:568:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:573:2: ( RULE_ID )
                    {
                    // InternalSqlDsl.g:573:2: ( RULE_ID )
                    // InternalSqlDsl.g:574:3: RULE_ID
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


    // $ANTLR start "rule__ColumnOnCreation__TypeAlternatives_2_0"
    // InternalSqlDsl.g:583:1: rule__ColumnOnCreation__TypeAlternatives_2_0 : ( ( 'int' ) | ( 'float' ) | ( 'varchar(100)' ) | ( 'char(100)' ) | ( 'text' ) | ( 'date' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'VARCHAR(100)' ) | ( 'CHAR(100)' ) | ( 'TEXT' ) | ( 'DATE' ) );
    public final void rule__ColumnOnCreation__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:587:1: ( ( 'int' ) | ( 'float' ) | ( 'varchar(100)' ) | ( 'char(100)' ) | ( 'text' ) | ( 'date' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'VARCHAR(100)' ) | ( 'CHAR(100)' ) | ( 'TEXT' ) | ( 'DATE' ) )
            int alt4=12;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSqlDsl.g:588:2: ( 'int' )
                    {
                    // InternalSqlDsl.g:588:2: ( 'int' )
                    // InternalSqlDsl.g:589:3: 'int'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeIntKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeIntKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:594:2: ( 'float' )
                    {
                    // InternalSqlDsl.g:594:2: ( 'float' )
                    // InternalSqlDsl.g:595:3: 'float'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeFloatKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeFloatKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:600:2: ( 'varchar(100)' )
                    {
                    // InternalSqlDsl.g:600:2: ( 'varchar(100)' )
                    // InternalSqlDsl.g:601:3: 'varchar(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeVarchar100Keyword_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeVarchar100Keyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:606:2: ( 'char(100)' )
                    {
                    // InternalSqlDsl.g:606:2: ( 'char(100)' )
                    // InternalSqlDsl.g:607:3: 'char(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeChar100Keyword_2_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeChar100Keyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:612:2: ( 'text' )
                    {
                    // InternalSqlDsl.g:612:2: ( 'text' )
                    // InternalSqlDsl.g:613:3: 'text'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeTextKeyword_2_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeTextKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:618:2: ( 'date' )
                    {
                    // InternalSqlDsl.g:618:2: ( 'date' )
                    // InternalSqlDsl.g:619:3: 'date'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeDateKeyword_2_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeDateKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlDsl.g:624:2: ( 'INT' )
                    {
                    // InternalSqlDsl.g:624:2: ( 'INT' )
                    // InternalSqlDsl.g:625:3: 'INT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeINTKeyword_2_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeINTKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSqlDsl.g:630:2: ( 'FLOAT' )
                    {
                    // InternalSqlDsl.g:630:2: ( 'FLOAT' )
                    // InternalSqlDsl.g:631:3: 'FLOAT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeFLOATKeyword_2_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeFLOATKeyword_2_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlDsl.g:636:2: ( 'VARCHAR(100)' )
                    {
                    // InternalSqlDsl.g:636:2: ( 'VARCHAR(100)' )
                    // InternalSqlDsl.g:637:3: 'VARCHAR(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeVARCHAR100Keyword_2_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeVARCHAR100Keyword_2_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSqlDsl.g:642:2: ( 'CHAR(100)' )
                    {
                    // InternalSqlDsl.g:642:2: ( 'CHAR(100)' )
                    // InternalSqlDsl.g:643:3: 'CHAR(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeCHAR100Keyword_2_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeCHAR100Keyword_2_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSqlDsl.g:648:2: ( 'TEXT' )
                    {
                    // InternalSqlDsl.g:648:2: ( 'TEXT' )
                    // InternalSqlDsl.g:649:3: 'TEXT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeTEXTKeyword_2_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeTEXTKeyword_2_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSqlDsl.g:654:2: ( 'DATE' )
                    {
                    // InternalSqlDsl.g:654:2: ( 'DATE' )
                    // InternalSqlDsl.g:655:3: 'DATE'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeDATEKeyword_2_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeDATEKeyword_2_0_11()); 

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
    // $ANTLR end "rule__ColumnOnCreation__TypeAlternatives_2_0"


    // $ANTLR start "rule__SqlProgram__Group__0"
    // InternalSqlDsl.g:664:1: rule__SqlProgram__Group__0 : rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 ;
    public final void rule__SqlProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:668:1: ( rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 )
            // InternalSqlDsl.g:669:2: rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1
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
    // InternalSqlDsl.g:676:1: rule__SqlProgram__Group__0__Impl : ( () ) ;
    public final void rule__SqlProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:680:1: ( ( () ) )
            // InternalSqlDsl.g:681:1: ( () )
            {
            // InternalSqlDsl.g:681:1: ( () )
            // InternalSqlDsl.g:682:2: ()
            {
             before(grammarAccess.getSqlProgramAccess().getSqlProgramAction_0()); 
            // InternalSqlDsl.g:683:2: ()
            // InternalSqlDsl.g:683:3: 
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
    // InternalSqlDsl.g:691:1: rule__SqlProgram__Group__1 : rule__SqlProgram__Group__1__Impl ;
    public final void rule__SqlProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:695:1: ( rule__SqlProgram__Group__1__Impl )
            // InternalSqlDsl.g:696:2: rule__SqlProgram__Group__1__Impl
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
    // InternalSqlDsl.g:702:1: rule__SqlProgram__Group__1__Impl : ( ( rule__SqlProgram__Group_1__0 )* ) ;
    public final void rule__SqlProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:706:1: ( ( ( rule__SqlProgram__Group_1__0 )* ) )
            // InternalSqlDsl.g:707:1: ( ( rule__SqlProgram__Group_1__0 )* )
            {
            // InternalSqlDsl.g:707:1: ( ( rule__SqlProgram__Group_1__0 )* )
            // InternalSqlDsl.g:708:2: ( rule__SqlProgram__Group_1__0 )*
            {
             before(grammarAccess.getSqlProgramAccess().getGroup_1()); 
            // InternalSqlDsl.g:709:2: ( rule__SqlProgram__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||LA5_0==27||(LA5_0>=29 && LA5_0<=30)||LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSqlDsl.g:709:3: rule__SqlProgram__Group_1__0
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
    // InternalSqlDsl.g:718:1: rule__SqlProgram__Group_1__0 : rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 ;
    public final void rule__SqlProgram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:722:1: ( rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 )
            // InternalSqlDsl.g:723:2: rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1
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
    // InternalSqlDsl.g:730:1: rule__SqlProgram__Group_1__0__Impl : ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) ;
    public final void rule__SqlProgram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:734:1: ( ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) )
            // InternalSqlDsl.g:735:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            {
            // InternalSqlDsl.g:735:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            // InternalSqlDsl.g:736:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesAssignment_1_0()); 
            // InternalSqlDsl.g:737:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            // InternalSqlDsl.g:737:3: rule__SqlProgram__QueriesAssignment_1_0
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
    // InternalSqlDsl.g:745:1: rule__SqlProgram__Group_1__1 : rule__SqlProgram__Group_1__1__Impl ;
    public final void rule__SqlProgram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:749:1: ( rule__SqlProgram__Group_1__1__Impl )
            // InternalSqlDsl.g:750:2: rule__SqlProgram__Group_1__1__Impl
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
    // InternalSqlDsl.g:756:1: rule__SqlProgram__Group_1__1__Impl : ( ';' ) ;
    public final void rule__SqlProgram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:760:1: ( ( ';' ) )
            // InternalSqlDsl.g:761:1: ( ';' )
            {
            // InternalSqlDsl.g:761:1: ( ';' )
            // InternalSqlDsl.g:762:2: ';'
            {
             before(grammarAccess.getSqlProgramAccess().getSemicolonKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSqlDsl.g:772:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:776:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalSqlDsl.g:777:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
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
    // InternalSqlDsl.g:784:1: rule__Selection__Group__0__Impl : ( () ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:788:1: ( ( () ) )
            // InternalSqlDsl.g:789:1: ( () )
            {
            // InternalSqlDsl.g:789:1: ( () )
            // InternalSqlDsl.g:790:2: ()
            {
             before(grammarAccess.getSelectionAccess().getSelectionAction_0()); 
            // InternalSqlDsl.g:791:2: ()
            // InternalSqlDsl.g:791:3: 
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
    // InternalSqlDsl.g:799:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:803:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // InternalSqlDsl.g:804:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
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
    // InternalSqlDsl.g:811:1: rule__Selection__Group__1__Impl : ( 'SELECT' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:815:1: ( ( 'SELECT' ) )
            // InternalSqlDsl.g:816:1: ( 'SELECT' )
            {
            // InternalSqlDsl.g:816:1: ( 'SELECT' )
            // InternalSqlDsl.g:817:2: 'SELECT'
            {
             before(grammarAccess.getSelectionAccess().getSELECTKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSqlDsl.g:826:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:830:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // InternalSqlDsl.g:831:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
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
    // InternalSqlDsl.g:838:1: rule__Selection__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:842:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:843:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:843:1: ( 'FROM' )
            // InternalSqlDsl.g:844:2: 'FROM'
            {
             before(grammarAccess.getSelectionAccess().getFROMKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:853:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:857:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // InternalSqlDsl.g:858:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
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
    // InternalSqlDsl.g:865:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__ObjectsAssignment_3 ) ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:869:1: ( ( ( rule__Selection__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:870:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:870:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:871:2: ( rule__Selection__ObjectsAssignment_3 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:872:2: ( rule__Selection__ObjectsAssignment_3 )
            // InternalSqlDsl.g:872:3: rule__Selection__ObjectsAssignment_3
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
    // InternalSqlDsl.g:880:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:884:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // InternalSqlDsl.g:885:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
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
    // InternalSqlDsl.g:892:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:896:1: ( ( ( rule__Selection__Group_4__0 )* ) )
            // InternalSqlDsl.g:897:1: ( ( rule__Selection__Group_4__0 )* )
            {
            // InternalSqlDsl.g:897:1: ( ( rule__Selection__Group_4__0 )* )
            // InternalSqlDsl.g:898:2: ( rule__Selection__Group_4__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // InternalSqlDsl.g:899:2: ( rule__Selection__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSqlDsl.g:899:3: rule__Selection__Group_4__0
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
    // InternalSqlDsl.g:907:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:911:1: ( rule__Selection__Group__5__Impl )
            // InternalSqlDsl.g:912:2: rule__Selection__Group__5__Impl
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
    // InternalSqlDsl.g:918:1: rule__Selection__Group__5__Impl : ( ( rule__Selection__ClausesAssignment_5 )* ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:922:1: ( ( ( rule__Selection__ClausesAssignment_5 )* ) )
            // InternalSqlDsl.g:923:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            {
            // InternalSqlDsl.g:923:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            // InternalSqlDsl.g:924:2: ( rule__Selection__ClausesAssignment_5 )*
            {
             before(grammarAccess.getSelectionAccess().getClausesAssignment_5()); 
            // InternalSqlDsl.g:925:2: ( rule__Selection__ClausesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSqlDsl.g:925:3: rule__Selection__ClausesAssignment_5
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
    // InternalSqlDsl.g:934:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:938:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // InternalSqlDsl.g:939:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
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
    // InternalSqlDsl.g:946:1: rule__Selection__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:950:1: ( ( ',' ) )
            // InternalSqlDsl.g:951:1: ( ',' )
            {
            // InternalSqlDsl.g:951:1: ( ',' )
            // InternalSqlDsl.g:952:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:961:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:965:1: ( rule__Selection__Group_4__1__Impl )
            // InternalSqlDsl.g:966:2: rule__Selection__Group_4__1__Impl
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
    // InternalSqlDsl.g:972:1: rule__Selection__Group_4__1__Impl : ( ( rule__Selection__ObjectsAssignment_4_1 ) ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:976:1: ( ( ( rule__Selection__ObjectsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:977:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:977:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            // InternalSqlDsl.g:978:2: ( rule__Selection__ObjectsAssignment_4_1 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_4_1()); 
            // InternalSqlDsl.g:979:2: ( rule__Selection__ObjectsAssignment_4_1 )
            // InternalSqlDsl.g:979:3: rule__Selection__ObjectsAssignment_4_1
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
    // InternalSqlDsl.g:988:1: rule__Creation__Group__0 : rule__Creation__Group__0__Impl rule__Creation__Group__1 ;
    public final void rule__Creation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:992:1: ( rule__Creation__Group__0__Impl rule__Creation__Group__1 )
            // InternalSqlDsl.g:993:2: rule__Creation__Group__0__Impl rule__Creation__Group__1
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
    // InternalSqlDsl.g:1000:1: rule__Creation__Group__0__Impl : ( () ) ;
    public final void rule__Creation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1004:1: ( ( () ) )
            // InternalSqlDsl.g:1005:1: ( () )
            {
            // InternalSqlDsl.g:1005:1: ( () )
            // InternalSqlDsl.g:1006:2: ()
            {
             before(grammarAccess.getCreationAccess().getCreationAction_0()); 
            // InternalSqlDsl.g:1007:2: ()
            // InternalSqlDsl.g:1007:3: 
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
    // InternalSqlDsl.g:1015:1: rule__Creation__Group__1 : rule__Creation__Group__1__Impl rule__Creation__Group__2 ;
    public final void rule__Creation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1019:1: ( rule__Creation__Group__1__Impl rule__Creation__Group__2 )
            // InternalSqlDsl.g:1020:2: rule__Creation__Group__1__Impl rule__Creation__Group__2
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
    // InternalSqlDsl.g:1027:1: rule__Creation__Group__1__Impl : ( 'CREATE' ) ;
    public final void rule__Creation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1031:1: ( ( 'CREATE' ) )
            // InternalSqlDsl.g:1032:1: ( 'CREATE' )
            {
            // InternalSqlDsl.g:1032:1: ( 'CREATE' )
            // InternalSqlDsl.g:1033:2: 'CREATE'
            {
             before(grammarAccess.getCreationAccess().getCREATEKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSqlDsl.g:1042:1: rule__Creation__Group__2 : rule__Creation__Group__2__Impl ;
    public final void rule__Creation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1046:1: ( rule__Creation__Group__2__Impl )
            // InternalSqlDsl.g:1047:2: rule__Creation__Group__2__Impl
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
    // InternalSqlDsl.g:1053:1: rule__Creation__Group__2__Impl : ( ( rule__Creation__Alternatives_2 ) ) ;
    public final void rule__Creation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1057:1: ( ( ( rule__Creation__Alternatives_2 ) ) )
            // InternalSqlDsl.g:1058:1: ( ( rule__Creation__Alternatives_2 ) )
            {
            // InternalSqlDsl.g:1058:1: ( ( rule__Creation__Alternatives_2 ) )
            // InternalSqlDsl.g:1059:2: ( rule__Creation__Alternatives_2 )
            {
             before(grammarAccess.getCreationAccess().getAlternatives_2()); 
            // InternalSqlDsl.g:1060:2: ( rule__Creation__Alternatives_2 )
            // InternalSqlDsl.g:1060:3: rule__Creation__Alternatives_2
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
    // InternalSqlDsl.g:1069:1: rule__Creation__Group_2_0__0 : rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 ;
    public final void rule__Creation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1073:1: ( rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 )
            // InternalSqlDsl.g:1074:2: rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1
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
    // InternalSqlDsl.g:1081:1: rule__Creation__Group_2_0__0__Impl : ( ( rule__Creation__TypeAssignment_2_0_0 ) ) ;
    public final void rule__Creation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1085:1: ( ( ( rule__Creation__TypeAssignment_2_0_0 ) ) )
            // InternalSqlDsl.g:1086:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            {
            // InternalSqlDsl.g:1086:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            // InternalSqlDsl.g:1087:2: ( rule__Creation__TypeAssignment_2_0_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_0_0()); 
            // InternalSqlDsl.g:1088:2: ( rule__Creation__TypeAssignment_2_0_0 )
            // InternalSqlDsl.g:1088:3: rule__Creation__TypeAssignment_2_0_0
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
    // InternalSqlDsl.g:1096:1: rule__Creation__Group_2_0__1 : rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 ;
    public final void rule__Creation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1100:1: ( rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 )
            // InternalSqlDsl.g:1101:2: rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2
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
    // InternalSqlDsl.g:1108:1: rule__Creation__Group_2_0__1__Impl : ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) ;
    public final void rule__Creation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1112:1: ( ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) )
            // InternalSqlDsl.g:1113:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            {
            // InternalSqlDsl.g:1113:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            // InternalSqlDsl.g:1114:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_0_1()); 
            // InternalSqlDsl.g:1115:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            // InternalSqlDsl.g:1115:3: rule__Creation__ObjectsAssignment_2_0_1
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
    // InternalSqlDsl.g:1123:1: rule__Creation__Group_2_0__2 : rule__Creation__Group_2_0__2__Impl ;
    public final void rule__Creation__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1127:1: ( rule__Creation__Group_2_0__2__Impl )
            // InternalSqlDsl.g:1128:2: rule__Creation__Group_2_0__2__Impl
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
    // InternalSqlDsl.g:1134:1: rule__Creation__Group_2_0__2__Impl : ( ( rule__Creation__Group_2_0_2__0 )? ) ;
    public final void rule__Creation__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1138:1: ( ( ( rule__Creation__Group_2_0_2__0 )? ) )
            // InternalSqlDsl.g:1139:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            {
            // InternalSqlDsl.g:1139:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            // InternalSqlDsl.g:1140:2: ( rule__Creation__Group_2_0_2__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2()); 
            // InternalSqlDsl.g:1141:2: ( rule__Creation__Group_2_0_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSqlDsl.g:1141:3: rule__Creation__Group_2_0_2__0
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
    // InternalSqlDsl.g:1150:1: rule__Creation__Group_2_0_2__0 : rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 ;
    public final void rule__Creation__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1154:1: ( rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 )
            // InternalSqlDsl.g:1155:2: rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1
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
    // InternalSqlDsl.g:1162:1: rule__Creation__Group_2_0_2__0__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) ;
    public final void rule__Creation__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1166:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) )
            // InternalSqlDsl.g:1167:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            {
            // InternalSqlDsl.g:1167:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            // InternalSqlDsl.g:1168:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_0()); 
            // InternalSqlDsl.g:1169:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            // InternalSqlDsl.g:1169:3: rule__Creation__ConstaintsAssignment_2_0_2_0
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
    // InternalSqlDsl.g:1177:1: rule__Creation__Group_2_0_2__1 : rule__Creation__Group_2_0_2__1__Impl ;
    public final void rule__Creation__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1181:1: ( rule__Creation__Group_2_0_2__1__Impl )
            // InternalSqlDsl.g:1182:2: rule__Creation__Group_2_0_2__1__Impl
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
    // InternalSqlDsl.g:1188:1: rule__Creation__Group_2_0_2__1__Impl : ( ( rule__Creation__Group_2_0_2_1__0 )* ) ;
    public final void rule__Creation__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1192:1: ( ( ( rule__Creation__Group_2_0_2_1__0 )* ) )
            // InternalSqlDsl.g:1193:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            {
            // InternalSqlDsl.g:1193:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            // InternalSqlDsl.g:1194:2: ( rule__Creation__Group_2_0_2_1__0 )*
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2_1()); 
            // InternalSqlDsl.g:1195:2: ( rule__Creation__Group_2_0_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:1195:3: rule__Creation__Group_2_0_2_1__0
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
    // InternalSqlDsl.g:1204:1: rule__Creation__Group_2_0_2_1__0 : rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 ;
    public final void rule__Creation__Group_2_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1208:1: ( rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 )
            // InternalSqlDsl.g:1209:2: rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1
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
    // InternalSqlDsl.g:1216:1: rule__Creation__Group_2_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Creation__Group_2_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1220:1: ( ( ',' ) )
            // InternalSqlDsl.g:1221:1: ( ',' )
            {
            // InternalSqlDsl.g:1221:1: ( ',' )
            // InternalSqlDsl.g:1222:2: ','
            {
             before(grammarAccess.getCreationAccess().getCommaKeyword_2_0_2_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:1231:1: rule__Creation__Group_2_0_2_1__1 : rule__Creation__Group_2_0_2_1__1__Impl ;
    public final void rule__Creation__Group_2_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1235:1: ( rule__Creation__Group_2_0_2_1__1__Impl )
            // InternalSqlDsl.g:1236:2: rule__Creation__Group_2_0_2_1__1__Impl
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
    // InternalSqlDsl.g:1242:1: rule__Creation__Group_2_0_2_1__1__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) ;
    public final void rule__Creation__Group_2_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1246:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) )
            // InternalSqlDsl.g:1247:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            {
            // InternalSqlDsl.g:1247:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            // InternalSqlDsl.g:1248:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_1_1()); 
            // InternalSqlDsl.g:1249:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            // InternalSqlDsl.g:1249:3: rule__Creation__ConstaintsAssignment_2_0_2_1_1
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
    // InternalSqlDsl.g:1258:1: rule__Creation__Group_2_1__0 : rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 ;
    public final void rule__Creation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1262:1: ( rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 )
            // InternalSqlDsl.g:1263:2: rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSqlDsl.g:1270:1: rule__Creation__Group_2_1__0__Impl : ( ( rule__Creation__TypeAssignment_2_1_0 ) ) ;
    public final void rule__Creation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1274:1: ( ( ( rule__Creation__TypeAssignment_2_1_0 ) ) )
            // InternalSqlDsl.g:1275:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            {
            // InternalSqlDsl.g:1275:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            // InternalSqlDsl.g:1276:2: ( rule__Creation__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_1_0()); 
            // InternalSqlDsl.g:1277:2: ( rule__Creation__TypeAssignment_2_1_0 )
            // InternalSqlDsl.g:1277:3: rule__Creation__TypeAssignment_2_1_0
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
    // InternalSqlDsl.g:1285:1: rule__Creation__Group_2_1__1 : rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2 ;
    public final void rule__Creation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1289:1: ( rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2 )
            // InternalSqlDsl.g:1290:2: rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Creation__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_1__2();

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
    // InternalSqlDsl.g:1297:1: rule__Creation__Group_2_1__1__Impl : ( ( rule__Creation__NameAssignment_2_1_1 )? ) ;
    public final void rule__Creation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1301:1: ( ( ( rule__Creation__NameAssignment_2_1_1 )? ) )
            // InternalSqlDsl.g:1302:1: ( ( rule__Creation__NameAssignment_2_1_1 )? )
            {
            // InternalSqlDsl.g:1302:1: ( ( rule__Creation__NameAssignment_2_1_1 )? )
            // InternalSqlDsl.g:1303:2: ( rule__Creation__NameAssignment_2_1_1 )?
            {
             before(grammarAccess.getCreationAccess().getNameAssignment_2_1_1()); 
            // InternalSqlDsl.g:1304:2: ( rule__Creation__NameAssignment_2_1_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlDsl.g:1304:3: rule__Creation__NameAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creation__NameAssignment_2_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCreationAccess().getNameAssignment_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Creation__Group_2_1__2"
    // InternalSqlDsl.g:1312:1: rule__Creation__Group_2_1__2 : rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3 ;
    public final void rule__Creation__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1316:1: ( rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3 )
            // InternalSqlDsl.g:1317:2: rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Creation__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_1__3();

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
    // $ANTLR end "rule__Creation__Group_2_1__2"


    // $ANTLR start "rule__Creation__Group_2_1__2__Impl"
    // InternalSqlDsl.g:1324:1: rule__Creation__Group_2_1__2__Impl : ( 'ON' ) ;
    public final void rule__Creation__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1328:1: ( ( 'ON' ) )
            // InternalSqlDsl.g:1329:1: ( 'ON' )
            {
            // InternalSqlDsl.g:1329:1: ( 'ON' )
            // InternalSqlDsl.g:1330:2: 'ON'
            {
             before(grammarAccess.getCreationAccess().getONKeyword_2_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCreationAccess().getONKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__2__Impl"


    // $ANTLR start "rule__Creation__Group_2_1__3"
    // InternalSqlDsl.g:1339:1: rule__Creation__Group_2_1__3 : rule__Creation__Group_2_1__3__Impl ;
    public final void rule__Creation__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1343:1: ( rule__Creation__Group_2_1__3__Impl )
            // InternalSqlDsl.g:1344:2: rule__Creation__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creation__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__Creation__Group_2_1__3"


    // $ANTLR start "rule__Creation__Group_2_1__3__Impl"
    // InternalSqlDsl.g:1350:1: rule__Creation__Group_2_1__3__Impl : ( ( rule__Creation__ObjectsAssignment_2_1_3 ) ) ;
    public final void rule__Creation__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1354:1: ( ( ( rule__Creation__ObjectsAssignment_2_1_3 ) ) )
            // InternalSqlDsl.g:1355:1: ( ( rule__Creation__ObjectsAssignment_2_1_3 ) )
            {
            // InternalSqlDsl.g:1355:1: ( ( rule__Creation__ObjectsAssignment_2_1_3 ) )
            // InternalSqlDsl.g:1356:2: ( rule__Creation__ObjectsAssignment_2_1_3 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_3()); 
            // InternalSqlDsl.g:1357:2: ( rule__Creation__ObjectsAssignment_2_1_3 )
            // InternalSqlDsl.g:1357:3: rule__Creation__ObjectsAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Creation__ObjectsAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__Group_2_1__3__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalSqlDsl.g:1366:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1370:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalSqlDsl.g:1371:2: rule__Update__Group__0__Impl rule__Update__Group__1
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
    // InternalSqlDsl.g:1378:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1382:1: ( ( () ) )
            // InternalSqlDsl.g:1383:1: ( () )
            {
            // InternalSqlDsl.g:1383:1: ( () )
            // InternalSqlDsl.g:1384:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalSqlDsl.g:1385:2: ()
            // InternalSqlDsl.g:1385:3: 
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
    // InternalSqlDsl.g:1393:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1397:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalSqlDsl.g:1398:2: rule__Update__Group__1__Impl rule__Update__Group__2
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
    // InternalSqlDsl.g:1405:1: rule__Update__Group__1__Impl : ( 'UPDATE' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1409:1: ( ( 'UPDATE' ) )
            // InternalSqlDsl.g:1410:1: ( 'UPDATE' )
            {
            // InternalSqlDsl.g:1410:1: ( 'UPDATE' )
            // InternalSqlDsl.g:1411:2: 'UPDATE'
            {
             before(grammarAccess.getUpdateAccess().getUPDATEKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSqlDsl.g:1420:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1424:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalSqlDsl.g:1425:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:1432:1: rule__Update__Group__2__Impl : ( ( rule__Update__ObjectsAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1436:1: ( ( ( rule__Update__ObjectsAssignment_2 ) ) )
            // InternalSqlDsl.g:1437:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            {
            // InternalSqlDsl.g:1437:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            // InternalSqlDsl.g:1438:2: ( rule__Update__ObjectsAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getObjectsAssignment_2()); 
            // InternalSqlDsl.g:1439:2: ( rule__Update__ObjectsAssignment_2 )
            // InternalSqlDsl.g:1439:3: rule__Update__ObjectsAssignment_2
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
    // InternalSqlDsl.g:1447:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1451:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalSqlDsl.g:1452:2: rule__Update__Group__3__Impl rule__Update__Group__4
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
    // InternalSqlDsl.g:1459:1: rule__Update__Group__3__Impl : ( ( rule__Update__ClausesAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1463:1: ( ( ( rule__Update__ClausesAssignment_3 ) ) )
            // InternalSqlDsl.g:1464:1: ( ( rule__Update__ClausesAssignment_3 ) )
            {
            // InternalSqlDsl.g:1464:1: ( ( rule__Update__ClausesAssignment_3 ) )
            // InternalSqlDsl.g:1465:2: ( rule__Update__ClausesAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_3()); 
            // InternalSqlDsl.g:1466:2: ( rule__Update__ClausesAssignment_3 )
            // InternalSqlDsl.g:1466:3: rule__Update__ClausesAssignment_3
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
    // InternalSqlDsl.g:1474:1: rule__Update__Group__4 : rule__Update__Group__4__Impl ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1478:1: ( rule__Update__Group__4__Impl )
            // InternalSqlDsl.g:1479:2: rule__Update__Group__4__Impl
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
    // InternalSqlDsl.g:1485:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1489:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalSqlDsl.g:1490:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalSqlDsl.g:1490:1: ( ( rule__Update__Group_4__0 )* )
            // InternalSqlDsl.g:1491:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalSqlDsl.g:1492:2: ( rule__Update__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqlDsl.g:1492:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Update__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSqlDsl.g:1501:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1505:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalSqlDsl.g:1506:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:1513:1: rule__Update__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1517:1: ( ( ',' ) )
            // InternalSqlDsl.g:1518:1: ( ',' )
            {
            // InternalSqlDsl.g:1518:1: ( ',' )
            // InternalSqlDsl.g:1519:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:1528:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1532:1: ( rule__Update__Group_4__1__Impl )
            // InternalSqlDsl.g:1533:2: rule__Update__Group_4__1__Impl
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
    // InternalSqlDsl.g:1539:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__ClausesAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1543:1: ( ( ( rule__Update__ClausesAssignment_4_1 ) ) )
            // InternalSqlDsl.g:1544:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:1544:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            // InternalSqlDsl.g:1545:2: ( rule__Update__ClausesAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_4_1()); 
            // InternalSqlDsl.g:1546:2: ( rule__Update__ClausesAssignment_4_1 )
            // InternalSqlDsl.g:1546:3: rule__Update__ClausesAssignment_4_1
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
    // InternalSqlDsl.g:1555:1: rule__Insertion__Group__0 : rule__Insertion__Group__0__Impl rule__Insertion__Group__1 ;
    public final void rule__Insertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1559:1: ( rule__Insertion__Group__0__Impl rule__Insertion__Group__1 )
            // InternalSqlDsl.g:1560:2: rule__Insertion__Group__0__Impl rule__Insertion__Group__1
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
    // InternalSqlDsl.g:1567:1: rule__Insertion__Group__0__Impl : ( () ) ;
    public final void rule__Insertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1571:1: ( ( () ) )
            // InternalSqlDsl.g:1572:1: ( () )
            {
            // InternalSqlDsl.g:1572:1: ( () )
            // InternalSqlDsl.g:1573:2: ()
            {
             before(grammarAccess.getInsertionAccess().getInsertionAction_0()); 
            // InternalSqlDsl.g:1574:2: ()
            // InternalSqlDsl.g:1574:3: 
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
    // InternalSqlDsl.g:1582:1: rule__Insertion__Group__1 : rule__Insertion__Group__1__Impl rule__Insertion__Group__2 ;
    public final void rule__Insertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1586:1: ( rule__Insertion__Group__1__Impl rule__Insertion__Group__2 )
            // InternalSqlDsl.g:1587:2: rule__Insertion__Group__1__Impl rule__Insertion__Group__2
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
    // InternalSqlDsl.g:1594:1: rule__Insertion__Group__1__Impl : ( 'INSERT' ) ;
    public final void rule__Insertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1598:1: ( ( 'INSERT' ) )
            // InternalSqlDsl.g:1599:1: ( 'INSERT' )
            {
            // InternalSqlDsl.g:1599:1: ( 'INSERT' )
            // InternalSqlDsl.g:1600:2: 'INSERT'
            {
             before(grammarAccess.getInsertionAccess().getINSERTKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSqlDsl.g:1609:1: rule__Insertion__Group__2 : rule__Insertion__Group__2__Impl rule__Insertion__Group__3 ;
    public final void rule__Insertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1613:1: ( rule__Insertion__Group__2__Impl rule__Insertion__Group__3 )
            // InternalSqlDsl.g:1614:2: rule__Insertion__Group__2__Impl rule__Insertion__Group__3
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
    // InternalSqlDsl.g:1621:1: rule__Insertion__Group__2__Impl : ( 'INTO' ) ;
    public final void rule__Insertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1625:1: ( ( 'INTO' ) )
            // InternalSqlDsl.g:1626:1: ( 'INTO' )
            {
            // InternalSqlDsl.g:1626:1: ( 'INTO' )
            // InternalSqlDsl.g:1627:2: 'INTO'
            {
             before(grammarAccess.getInsertionAccess().getINTOKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSqlDsl.g:1636:1: rule__Insertion__Group__3 : rule__Insertion__Group__3__Impl rule__Insertion__Group__4 ;
    public final void rule__Insertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1640:1: ( rule__Insertion__Group__3__Impl rule__Insertion__Group__4 )
            // InternalSqlDsl.g:1641:2: rule__Insertion__Group__3__Impl rule__Insertion__Group__4
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
    // InternalSqlDsl.g:1648:1: rule__Insertion__Group__3__Impl : ( ( rule__Insertion__ObjectsAssignment_3 ) ) ;
    public final void rule__Insertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1652:1: ( ( ( rule__Insertion__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1653:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1653:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1654:2: ( rule__Insertion__ObjectsAssignment_3 )
            {
             before(grammarAccess.getInsertionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1655:2: ( rule__Insertion__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1655:3: rule__Insertion__ObjectsAssignment_3
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
    // InternalSqlDsl.g:1663:1: rule__Insertion__Group__4 : rule__Insertion__Group__4__Impl rule__Insertion__Group__5 ;
    public final void rule__Insertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1667:1: ( rule__Insertion__Group__4__Impl rule__Insertion__Group__5 )
            // InternalSqlDsl.g:1668:2: rule__Insertion__Group__4__Impl rule__Insertion__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSqlDsl.g:1675:1: rule__Insertion__Group__4__Impl : ( 'VALUES' ) ;
    public final void rule__Insertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1679:1: ( ( 'VALUES' ) )
            // InternalSqlDsl.g:1680:1: ( 'VALUES' )
            {
            // InternalSqlDsl.g:1680:1: ( 'VALUES' )
            // InternalSqlDsl.g:1681:2: 'VALUES'
            {
             before(grammarAccess.getInsertionAccess().getVALUESKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getVALUESKeyword_4()); 

            }


            }

        }
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
    // InternalSqlDsl.g:1690:1: rule__Insertion__Group__5 : rule__Insertion__Group__5__Impl rule__Insertion__Group__6 ;
    public final void rule__Insertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1694:1: ( rule__Insertion__Group__5__Impl rule__Insertion__Group__6 )
            // InternalSqlDsl.g:1695:2: rule__Insertion__Group__5__Impl rule__Insertion__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Insertion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__6();

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
    // InternalSqlDsl.g:1702:1: rule__Insertion__Group__5__Impl : ( '{' ) ;
    public final void rule__Insertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1706:1: ( ( '{' ) )
            // InternalSqlDsl.g:1707:1: ( '{' )
            {
            // InternalSqlDsl.g:1707:1: ( '{' )
            // InternalSqlDsl.g:1708:2: '{'
            {
             before(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Insertion__Group__6"
    // InternalSqlDsl.g:1717:1: rule__Insertion__Group__6 : rule__Insertion__Group__6__Impl rule__Insertion__Group__7 ;
    public final void rule__Insertion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1721:1: ( rule__Insertion__Group__6__Impl rule__Insertion__Group__7 )
            // InternalSqlDsl.g:1722:2: rule__Insertion__Group__6__Impl rule__Insertion__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Insertion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__7();

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
    // $ANTLR end "rule__Insertion__Group__6"


    // $ANTLR start "rule__Insertion__Group__6__Impl"
    // InternalSqlDsl.g:1729:1: rule__Insertion__Group__6__Impl : ( ( rule__Insertion__ValuesAssignment_6 ) ) ;
    public final void rule__Insertion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1733:1: ( ( ( rule__Insertion__ValuesAssignment_6 ) ) )
            // InternalSqlDsl.g:1734:1: ( ( rule__Insertion__ValuesAssignment_6 ) )
            {
            // InternalSqlDsl.g:1734:1: ( ( rule__Insertion__ValuesAssignment_6 ) )
            // InternalSqlDsl.g:1735:2: ( rule__Insertion__ValuesAssignment_6 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_6()); 
            // InternalSqlDsl.g:1736:2: ( rule__Insertion__ValuesAssignment_6 )
            // InternalSqlDsl.g:1736:3: rule__Insertion__ValuesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__6__Impl"


    // $ANTLR start "rule__Insertion__Group__7"
    // InternalSqlDsl.g:1744:1: rule__Insertion__Group__7 : rule__Insertion__Group__7__Impl rule__Insertion__Group__8 ;
    public final void rule__Insertion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1748:1: ( rule__Insertion__Group__7__Impl rule__Insertion__Group__8 )
            // InternalSqlDsl.g:1749:2: rule__Insertion__Group__7__Impl rule__Insertion__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Insertion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group__8();

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
    // $ANTLR end "rule__Insertion__Group__7"


    // $ANTLR start "rule__Insertion__Group__7__Impl"
    // InternalSqlDsl.g:1756:1: rule__Insertion__Group__7__Impl : ( ( rule__Insertion__Group_7__0 )* ) ;
    public final void rule__Insertion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1760:1: ( ( ( rule__Insertion__Group_7__0 )* ) )
            // InternalSqlDsl.g:1761:1: ( ( rule__Insertion__Group_7__0 )* )
            {
            // InternalSqlDsl.g:1761:1: ( ( rule__Insertion__Group_7__0 )* )
            // InternalSqlDsl.g:1762:2: ( rule__Insertion__Group_7__0 )*
            {
             before(grammarAccess.getInsertionAccess().getGroup_7()); 
            // InternalSqlDsl.g:1763:2: ( rule__Insertion__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSqlDsl.g:1763:3: rule__Insertion__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Insertion__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getInsertionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__7__Impl"


    // $ANTLR start "rule__Insertion__Group__8"
    // InternalSqlDsl.g:1771:1: rule__Insertion__Group__8 : rule__Insertion__Group__8__Impl ;
    public final void rule__Insertion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1775:1: ( rule__Insertion__Group__8__Impl )
            // InternalSqlDsl.g:1776:2: rule__Insertion__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group__8__Impl();

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
    // $ANTLR end "rule__Insertion__Group__8"


    // $ANTLR start "rule__Insertion__Group__8__Impl"
    // InternalSqlDsl.g:1782:1: rule__Insertion__Group__8__Impl : ( '}' ) ;
    public final void rule__Insertion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1786:1: ( ( '}' ) )
            // InternalSqlDsl.g:1787:1: ( '}' )
            {
            // InternalSqlDsl.g:1787:1: ( '}' )
            // InternalSqlDsl.g:1788:2: '}'
            {
             before(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group__8__Impl"


    // $ANTLR start "rule__Insertion__Group_7__0"
    // InternalSqlDsl.g:1798:1: rule__Insertion__Group_7__0 : rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1 ;
    public final void rule__Insertion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1802:1: ( rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1 )
            // InternalSqlDsl.g:1803:2: rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1
            {
            pushFollow(FOLLOW_22);
            rule__Insertion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insertion__Group_7__1();

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
    // $ANTLR end "rule__Insertion__Group_7__0"


    // $ANTLR start "rule__Insertion__Group_7__0__Impl"
    // InternalSqlDsl.g:1810:1: rule__Insertion__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Insertion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1814:1: ( ( ',' ) )
            // InternalSqlDsl.g:1815:1: ( ',' )
            {
            // InternalSqlDsl.g:1815:1: ( ',' )
            // InternalSqlDsl.g:1816:2: ','
            {
             before(grammarAccess.getInsertionAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_7__0__Impl"


    // $ANTLR start "rule__Insertion__Group_7__1"
    // InternalSqlDsl.g:1825:1: rule__Insertion__Group_7__1 : rule__Insertion__Group_7__1__Impl ;
    public final void rule__Insertion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1829:1: ( rule__Insertion__Group_7__1__Impl )
            // InternalSqlDsl.g:1830:2: rule__Insertion__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__Group_7__1__Impl();

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
    // $ANTLR end "rule__Insertion__Group_7__1"


    // $ANTLR start "rule__Insertion__Group_7__1__Impl"
    // InternalSqlDsl.g:1836:1: rule__Insertion__Group_7__1__Impl : ( ( rule__Insertion__ValuesAssignment_7_1 ) ) ;
    public final void rule__Insertion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1840:1: ( ( ( rule__Insertion__ValuesAssignment_7_1 ) ) )
            // InternalSqlDsl.g:1841:1: ( ( rule__Insertion__ValuesAssignment_7_1 ) )
            {
            // InternalSqlDsl.g:1841:1: ( ( rule__Insertion__ValuesAssignment_7_1 ) )
            // InternalSqlDsl.g:1842:2: ( rule__Insertion__ValuesAssignment_7_1 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_7_1()); 
            // InternalSqlDsl.g:1843:2: ( rule__Insertion__ValuesAssignment_7_1 )
            // InternalSqlDsl.g:1843:3: rule__Insertion__ValuesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Insertion__ValuesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertionAccess().getValuesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__Group_7__1__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalSqlDsl.g:1852:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1856:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalSqlDsl.g:1857:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
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
    // InternalSqlDsl.g:1864:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1868:1: ( ( () ) )
            // InternalSqlDsl.g:1869:1: ( () )
            {
            // InternalSqlDsl.g:1869:1: ( () )
            // InternalSqlDsl.g:1870:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalSqlDsl.g:1871:2: ()
            // InternalSqlDsl.g:1871:3: 
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
    // InternalSqlDsl.g:1879:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1883:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalSqlDsl.g:1884:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
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
    // InternalSqlDsl.g:1891:1: rule__Delete__Group__1__Impl : ( 'DELETE' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1895:1: ( ( 'DELETE' ) )
            // InternalSqlDsl.g:1896:1: ( 'DELETE' )
            {
            // InternalSqlDsl.g:1896:1: ( 'DELETE' )
            // InternalSqlDsl.g:1897:2: 'DELETE'
            {
             before(grammarAccess.getDeleteAccess().getDELETEKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSqlDsl.g:1906:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1910:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalSqlDsl.g:1911:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
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
    // InternalSqlDsl.g:1918:1: rule__Delete__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1922:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:1923:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:1923:1: ( 'FROM' )
            // InternalSqlDsl.g:1924:2: 'FROM'
            {
             before(grammarAccess.getDeleteAccess().getFROMKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:1933:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1937:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalSqlDsl.g:1938:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:1945:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__ObjectsAssignment_3 ) ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1949:1: ( ( ( rule__Delete__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1950:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1950:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1951:2: ( rule__Delete__ObjectsAssignment_3 )
            {
             before(grammarAccess.getDeleteAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1952:2: ( rule__Delete__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1952:3: rule__Delete__ObjectsAssignment_3
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
    // InternalSqlDsl.g:1960:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1964:1: ( rule__Delete__Group__4__Impl )
            // InternalSqlDsl.g:1965:2: rule__Delete__Group__4__Impl
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
    // InternalSqlDsl.g:1971:1: rule__Delete__Group__4__Impl : ( ( rule__Delete__Group_4__0 )? ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1975:1: ( ( ( rule__Delete__Group_4__0 )? ) )
            // InternalSqlDsl.g:1976:1: ( ( rule__Delete__Group_4__0 )? )
            {
            // InternalSqlDsl.g:1976:1: ( ( rule__Delete__Group_4__0 )? )
            // InternalSqlDsl.g:1977:2: ( rule__Delete__Group_4__0 )?
            {
             before(grammarAccess.getDeleteAccess().getGroup_4()); 
            // InternalSqlDsl.g:1978:2: ( rule__Delete__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSqlDsl.g:1978:3: rule__Delete__Group_4__0
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
    // InternalSqlDsl.g:1987:1: rule__Delete__Group_4__0 : rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 ;
    public final void rule__Delete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1991:1: ( rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 )
            // InternalSqlDsl.g:1992:2: rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1
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
    // InternalSqlDsl.g:1999:1: rule__Delete__Group_4__0__Impl : ( ( rule__Delete__ClausesAssignment_4_0 ) ) ;
    public final void rule__Delete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2003:1: ( ( ( rule__Delete__ClausesAssignment_4_0 ) ) )
            // InternalSqlDsl.g:2004:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            {
            // InternalSqlDsl.g:2004:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            // InternalSqlDsl.g:2005:2: ( rule__Delete__ClausesAssignment_4_0 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_0()); 
            // InternalSqlDsl.g:2006:2: ( rule__Delete__ClausesAssignment_4_0 )
            // InternalSqlDsl.g:2006:3: rule__Delete__ClausesAssignment_4_0
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
    // InternalSqlDsl.g:2014:1: rule__Delete__Group_4__1 : rule__Delete__Group_4__1__Impl ;
    public final void rule__Delete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2018:1: ( rule__Delete__Group_4__1__Impl )
            // InternalSqlDsl.g:2019:2: rule__Delete__Group_4__1__Impl
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
    // InternalSqlDsl.g:2025:1: rule__Delete__Group_4__1__Impl : ( ( rule__Delete__Group_4_1__0 )* ) ;
    public final void rule__Delete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2029:1: ( ( ( rule__Delete__Group_4_1__0 )* ) )
            // InternalSqlDsl.g:2030:1: ( ( rule__Delete__Group_4_1__0 )* )
            {
            // InternalSqlDsl.g:2030:1: ( ( rule__Delete__Group_4_1__0 )* )
            // InternalSqlDsl.g:2031:2: ( rule__Delete__Group_4_1__0 )*
            {
             before(grammarAccess.getDeleteAccess().getGroup_4_1()); 
            // InternalSqlDsl.g:2032:2: ( rule__Delete__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSqlDsl.g:2032:3: rule__Delete__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Delete__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSqlDsl.g:2041:1: rule__Delete__Group_4_1__0 : rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 ;
    public final void rule__Delete__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2045:1: ( rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 )
            // InternalSqlDsl.g:2046:2: rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:2053:1: rule__Delete__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Delete__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2057:1: ( ( ',' ) )
            // InternalSqlDsl.g:2058:1: ( ',' )
            {
            // InternalSqlDsl.g:2058:1: ( ',' )
            // InternalSqlDsl.g:2059:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:2068:1: rule__Delete__Group_4_1__1 : rule__Delete__Group_4_1__1__Impl ;
    public final void rule__Delete__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2072:1: ( rule__Delete__Group_4_1__1__Impl )
            // InternalSqlDsl.g:2073:2: rule__Delete__Group_4_1__1__Impl
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
    // InternalSqlDsl.g:2079:1: rule__Delete__Group_4_1__1__Impl : ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) ;
    public final void rule__Delete__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2083:1: ( ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) )
            // InternalSqlDsl.g:2084:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            {
            // InternalSqlDsl.g:2084:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            // InternalSqlDsl.g:2085:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_1_1()); 
            // InternalSqlDsl.g:2086:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            // InternalSqlDsl.g:2086:3: rule__Delete__ClausesAssignment_4_1_1
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
    // InternalSqlDsl.g:2095:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2099:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSqlDsl.g:2100:2: rule__Table__Group__0__Impl rule__Table__Group__1
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
    // InternalSqlDsl.g:2107:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2111:1: ( ( () ) )
            // InternalSqlDsl.g:2112:1: ( () )
            {
            // InternalSqlDsl.g:2112:1: ( () )
            // InternalSqlDsl.g:2113:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalSqlDsl.g:2114:2: ()
            // InternalSqlDsl.g:2114:3: 
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
    // InternalSqlDsl.g:2122:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2126:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSqlDsl.g:2127:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSqlDsl.g:2134:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2138:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2139:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2139:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSqlDsl.g:2140:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2141:2: ( rule__Table__NameAssignment_1 )
            // InternalSqlDsl.g:2141:3: rule__Table__NameAssignment_1
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
    // InternalSqlDsl.g:2149:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2153:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSqlDsl.g:2154:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSqlDsl.g:2161:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2165:1: ( ( '{' ) )
            // InternalSqlDsl.g:2166:1: ( '{' )
            {
            // InternalSqlDsl.g:2166:1: ( '{' )
            // InternalSqlDsl.g:2167:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSqlDsl.g:2176:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2180:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSqlDsl.g:2181:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSqlDsl.g:2188:1: rule__Table__Group__3__Impl : ( ( rule__Table__Group_3__0 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2192:1: ( ( ( rule__Table__Group_3__0 )? ) )
            // InternalSqlDsl.g:2193:1: ( ( rule__Table__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2193:1: ( ( rule__Table__Group_3__0 )? )
            // InternalSqlDsl.g:2194:2: ( rule__Table__Group_3__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_3()); 
            // InternalSqlDsl.g:2195:2: ( rule__Table__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:2195:3: rule__Table__Group_3__0
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
    // InternalSqlDsl.g:2203:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2207:1: ( rule__Table__Group__4__Impl )
            // InternalSqlDsl.g:2208:2: rule__Table__Group__4__Impl
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
    // InternalSqlDsl.g:2214:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2218:1: ( ( '}' ) )
            // InternalSqlDsl.g:2219:1: ( '}' )
            {
            // InternalSqlDsl.g:2219:1: ( '}' )
            // InternalSqlDsl.g:2220:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSqlDsl.g:2230:1: rule__Table__Group_3__0 : rule__Table__Group_3__0__Impl rule__Table__Group_3__1 ;
    public final void rule__Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2234:1: ( rule__Table__Group_3__0__Impl rule__Table__Group_3__1 )
            // InternalSqlDsl.g:2235:2: rule__Table__Group_3__0__Impl rule__Table__Group_3__1
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
    // InternalSqlDsl.g:2242:1: rule__Table__Group_3__0__Impl : ( ( rule__Table__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2246:1: ( ( ( rule__Table__ColumnsAssignment_3_0 ) ) )
            // InternalSqlDsl.g:2247:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:2247:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            // InternalSqlDsl.g:2248:2: ( rule__Table__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_0()); 
            // InternalSqlDsl.g:2249:2: ( rule__Table__ColumnsAssignment_3_0 )
            // InternalSqlDsl.g:2249:3: rule__Table__ColumnsAssignment_3_0
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
    // InternalSqlDsl.g:2257:1: rule__Table__Group_3__1 : rule__Table__Group_3__1__Impl ;
    public final void rule__Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2261:1: ( rule__Table__Group_3__1__Impl )
            // InternalSqlDsl.g:2262:2: rule__Table__Group_3__1__Impl
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
    // InternalSqlDsl.g:2268:1: rule__Table__Group_3__1__Impl : ( ( rule__Table__Group_3_1__0 )* ) ;
    public final void rule__Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2272:1: ( ( ( rule__Table__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:2273:1: ( ( rule__Table__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:2273:1: ( ( rule__Table__Group_3_1__0 )* )
            // InternalSqlDsl.g:2274:2: ( rule__Table__Group_3_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:2275:2: ( rule__Table__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSqlDsl.g:2275:3: rule__Table__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Table__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSqlDsl.g:2284:1: rule__Table__Group_3_1__0 : rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 ;
    public final void rule__Table__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2288:1: ( rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 )
            // InternalSqlDsl.g:2289:2: rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1
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
    // InternalSqlDsl.g:2296:1: rule__Table__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2300:1: ( ( ',' ) )
            // InternalSqlDsl.g:2301:1: ( ',' )
            {
            // InternalSqlDsl.g:2301:1: ( ',' )
            // InternalSqlDsl.g:2302:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:2311:1: rule__Table__Group_3_1__1 : rule__Table__Group_3_1__1__Impl ;
    public final void rule__Table__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2315:1: ( rule__Table__Group_3_1__1__Impl )
            // InternalSqlDsl.g:2316:2: rule__Table__Group_3_1__1__Impl
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
    // InternalSqlDsl.g:2322:1: rule__Table__Group_3_1__1__Impl : ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Table__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2326:1: ( ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:2327:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:2327:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            // InternalSqlDsl.g:2328:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_1_1()); 
            // InternalSqlDsl.g:2329:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            // InternalSqlDsl.g:2329:3: rule__Table__ColumnsAssignment_3_1_1
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


    // $ANTLR start "rule__TableOnCreation__Group__0"
    // InternalSqlDsl.g:2338:1: rule__TableOnCreation__Group__0 : rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1 ;
    public final void rule__TableOnCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2342:1: ( rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1 )
            // InternalSqlDsl.g:2343:2: rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TableOnCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__1();

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
    // $ANTLR end "rule__TableOnCreation__Group__0"


    // $ANTLR start "rule__TableOnCreation__Group__0__Impl"
    // InternalSqlDsl.g:2350:1: rule__TableOnCreation__Group__0__Impl : ( () ) ;
    public final void rule__TableOnCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2354:1: ( ( () ) )
            // InternalSqlDsl.g:2355:1: ( () )
            {
            // InternalSqlDsl.g:2355:1: ( () )
            // InternalSqlDsl.g:2356:2: ()
            {
             before(grammarAccess.getTableOnCreationAccess().getTableAction_0()); 
            // InternalSqlDsl.g:2357:2: ()
            // InternalSqlDsl.g:2357:3: 
            {
            }

             after(grammarAccess.getTableOnCreationAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__0__Impl"


    // $ANTLR start "rule__TableOnCreation__Group__1"
    // InternalSqlDsl.g:2365:1: rule__TableOnCreation__Group__1 : rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2 ;
    public final void rule__TableOnCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2369:1: ( rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2 )
            // InternalSqlDsl.g:2370:2: rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TableOnCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__2();

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
    // $ANTLR end "rule__TableOnCreation__Group__1"


    // $ANTLR start "rule__TableOnCreation__Group__1__Impl"
    // InternalSqlDsl.g:2377:1: rule__TableOnCreation__Group__1__Impl : ( ( rule__TableOnCreation__NameAssignment_1 ) ) ;
    public final void rule__TableOnCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2381:1: ( ( ( rule__TableOnCreation__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2382:1: ( ( rule__TableOnCreation__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2382:1: ( ( rule__TableOnCreation__NameAssignment_1 ) )
            // InternalSqlDsl.g:2383:2: ( rule__TableOnCreation__NameAssignment_1 )
            {
             before(grammarAccess.getTableOnCreationAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2384:2: ( rule__TableOnCreation__NameAssignment_1 )
            // InternalSqlDsl.g:2384:3: rule__TableOnCreation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableOnCreationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__1__Impl"


    // $ANTLR start "rule__TableOnCreation__Group__2"
    // InternalSqlDsl.g:2392:1: rule__TableOnCreation__Group__2 : rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3 ;
    public final void rule__TableOnCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2396:1: ( rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3 )
            // InternalSqlDsl.g:2397:2: rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TableOnCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__3();

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
    // $ANTLR end "rule__TableOnCreation__Group__2"


    // $ANTLR start "rule__TableOnCreation__Group__2__Impl"
    // InternalSqlDsl.g:2404:1: rule__TableOnCreation__Group__2__Impl : ( '{' ) ;
    public final void rule__TableOnCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2408:1: ( ( '{' ) )
            // InternalSqlDsl.g:2409:1: ( '{' )
            {
            // InternalSqlDsl.g:2409:1: ( '{' )
            // InternalSqlDsl.g:2410:2: '{'
            {
             before(grammarAccess.getTableOnCreationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTableOnCreationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__2__Impl"


    // $ANTLR start "rule__TableOnCreation__Group__3"
    // InternalSqlDsl.g:2419:1: rule__TableOnCreation__Group__3 : rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4 ;
    public final void rule__TableOnCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2423:1: ( rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4 )
            // InternalSqlDsl.g:2424:2: rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__TableOnCreation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__4();

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
    // $ANTLR end "rule__TableOnCreation__Group__3"


    // $ANTLR start "rule__TableOnCreation__Group__3__Impl"
    // InternalSqlDsl.g:2431:1: rule__TableOnCreation__Group__3__Impl : ( ( rule__TableOnCreation__ColumnsAssignment_3 ) ) ;
    public final void rule__TableOnCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2435:1: ( ( ( rule__TableOnCreation__ColumnsAssignment_3 ) ) )
            // InternalSqlDsl.g:2436:1: ( ( rule__TableOnCreation__ColumnsAssignment_3 ) )
            {
            // InternalSqlDsl.g:2436:1: ( ( rule__TableOnCreation__ColumnsAssignment_3 ) )
            // InternalSqlDsl.g:2437:2: ( rule__TableOnCreation__ColumnsAssignment_3 )
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_3()); 
            // InternalSqlDsl.g:2438:2: ( rule__TableOnCreation__ColumnsAssignment_3 )
            // InternalSqlDsl.g:2438:3: rule__TableOnCreation__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__3__Impl"


    // $ANTLR start "rule__TableOnCreation__Group__4"
    // InternalSqlDsl.g:2446:1: rule__TableOnCreation__Group__4 : rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5 ;
    public final void rule__TableOnCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2450:1: ( rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5 )
            // InternalSqlDsl.g:2451:2: rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__TableOnCreation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__5();

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
    // $ANTLR end "rule__TableOnCreation__Group__4"


    // $ANTLR start "rule__TableOnCreation__Group__4__Impl"
    // InternalSqlDsl.g:2458:1: rule__TableOnCreation__Group__4__Impl : ( ( rule__TableOnCreation__Group_4__0 )* ) ;
    public final void rule__TableOnCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2462:1: ( ( ( rule__TableOnCreation__Group_4__0 )* ) )
            // InternalSqlDsl.g:2463:1: ( ( rule__TableOnCreation__Group_4__0 )* )
            {
            // InternalSqlDsl.g:2463:1: ( ( rule__TableOnCreation__Group_4__0 )* )
            // InternalSqlDsl.g:2464:2: ( rule__TableOnCreation__Group_4__0 )*
            {
             before(grammarAccess.getTableOnCreationAccess().getGroup_4()); 
            // InternalSqlDsl.g:2465:2: ( rule__TableOnCreation__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSqlDsl.g:2465:3: rule__TableOnCreation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TableOnCreation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTableOnCreationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__4__Impl"


    // $ANTLR start "rule__TableOnCreation__Group__5"
    // InternalSqlDsl.g:2473:1: rule__TableOnCreation__Group__5 : rule__TableOnCreation__Group__5__Impl ;
    public final void rule__TableOnCreation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2477:1: ( rule__TableOnCreation__Group__5__Impl )
            // InternalSqlDsl.g:2478:2: rule__TableOnCreation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group__5__Impl();

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
    // $ANTLR end "rule__TableOnCreation__Group__5"


    // $ANTLR start "rule__TableOnCreation__Group__5__Impl"
    // InternalSqlDsl.g:2484:1: rule__TableOnCreation__Group__5__Impl : ( '}' ) ;
    public final void rule__TableOnCreation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2488:1: ( ( '}' ) )
            // InternalSqlDsl.g:2489:1: ( '}' )
            {
            // InternalSqlDsl.g:2489:1: ( '}' )
            // InternalSqlDsl.g:2490:2: '}'
            {
             before(grammarAccess.getTableOnCreationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTableOnCreationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group__5__Impl"


    // $ANTLR start "rule__TableOnCreation__Group_4__0"
    // InternalSqlDsl.g:2500:1: rule__TableOnCreation__Group_4__0 : rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1 ;
    public final void rule__TableOnCreation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2504:1: ( rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1 )
            // InternalSqlDsl.g:2505:2: rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__TableOnCreation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group_4__1();

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
    // $ANTLR end "rule__TableOnCreation__Group_4__0"


    // $ANTLR start "rule__TableOnCreation__Group_4__0__Impl"
    // InternalSqlDsl.g:2512:1: rule__TableOnCreation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TableOnCreation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2516:1: ( ( ',' ) )
            // InternalSqlDsl.g:2517:1: ( ',' )
            {
            // InternalSqlDsl.g:2517:1: ( ',' )
            // InternalSqlDsl.g:2518:2: ','
            {
             before(grammarAccess.getTableOnCreationAccess().getCommaKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTableOnCreationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group_4__0__Impl"


    // $ANTLR start "rule__TableOnCreation__Group_4__1"
    // InternalSqlDsl.g:2527:1: rule__TableOnCreation__Group_4__1 : rule__TableOnCreation__Group_4__1__Impl ;
    public final void rule__TableOnCreation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2531:1: ( rule__TableOnCreation__Group_4__1__Impl )
            // InternalSqlDsl.g:2532:2: rule__TableOnCreation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__Group_4__1__Impl();

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
    // $ANTLR end "rule__TableOnCreation__Group_4__1"


    // $ANTLR start "rule__TableOnCreation__Group_4__1__Impl"
    // InternalSqlDsl.g:2538:1: rule__TableOnCreation__Group_4__1__Impl : ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) ) ;
    public final void rule__TableOnCreation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2542:1: ( ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:2543:1: ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:2543:1: ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) )
            // InternalSqlDsl.g:2544:2: ( rule__TableOnCreation__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_4_1()); 
            // InternalSqlDsl.g:2545:2: ( rule__TableOnCreation__ColumnsAssignment_4_1 )
            // InternalSqlDsl.g:2545:3: rule__TableOnCreation__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TableOnCreation__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalSqlDsl.g:2554:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2558:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSqlDsl.g:2559:2: rule__Column__Group__0__Impl rule__Column__Group__1
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
    // InternalSqlDsl.g:2566:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2570:1: ( ( () ) )
            // InternalSqlDsl.g:2571:1: ( () )
            {
            // InternalSqlDsl.g:2571:1: ( () )
            // InternalSqlDsl.g:2572:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:2573:2: ()
            // InternalSqlDsl.g:2573:3: 
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
    // InternalSqlDsl.g:2581:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2585:1: ( rule__Column__Group__1__Impl )
            // InternalSqlDsl.g:2586:2: rule__Column__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__1__Impl();

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
    // InternalSqlDsl.g:2592:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2596:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2597:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2597:1: ( ( rule__Column__NameAssignment_1 ) )
            // InternalSqlDsl.g:2598:2: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2599:2: ( rule__Column__NameAssignment_1 )
            // InternalSqlDsl.g:2599:3: rule__Column__NameAssignment_1
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


    // $ANTLR start "rule__ColumnOnCreation__Group__0"
    // InternalSqlDsl.g:2608:1: rule__ColumnOnCreation__Group__0 : rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1 ;
    public final void rule__ColumnOnCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2612:1: ( rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1 )
            // InternalSqlDsl.g:2613:2: rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ColumnOnCreation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__Group__1();

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
    // $ANTLR end "rule__ColumnOnCreation__Group__0"


    // $ANTLR start "rule__ColumnOnCreation__Group__0__Impl"
    // InternalSqlDsl.g:2620:1: rule__ColumnOnCreation__Group__0__Impl : ( () ) ;
    public final void rule__ColumnOnCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2624:1: ( ( () ) )
            // InternalSqlDsl.g:2625:1: ( () )
            {
            // InternalSqlDsl.g:2625:1: ( () )
            // InternalSqlDsl.g:2626:2: ()
            {
             before(grammarAccess.getColumnOnCreationAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:2627:2: ()
            // InternalSqlDsl.g:2627:3: 
            {
            }

             after(grammarAccess.getColumnOnCreationAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__Group__0__Impl"


    // $ANTLR start "rule__ColumnOnCreation__Group__1"
    // InternalSqlDsl.g:2635:1: rule__ColumnOnCreation__Group__1 : rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2 ;
    public final void rule__ColumnOnCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2639:1: ( rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2 )
            // InternalSqlDsl.g:2640:2: rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ColumnOnCreation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__Group__2();

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
    // $ANTLR end "rule__ColumnOnCreation__Group__1"


    // $ANTLR start "rule__ColumnOnCreation__Group__1__Impl"
    // InternalSqlDsl.g:2647:1: rule__ColumnOnCreation__Group__1__Impl : ( ( rule__ColumnOnCreation__NameAssignment_1 ) ) ;
    public final void rule__ColumnOnCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2651:1: ( ( ( rule__ColumnOnCreation__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2652:1: ( ( rule__ColumnOnCreation__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2652:1: ( ( rule__ColumnOnCreation__NameAssignment_1 ) )
            // InternalSqlDsl.g:2653:2: ( rule__ColumnOnCreation__NameAssignment_1 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2654:2: ( rule__ColumnOnCreation__NameAssignment_1 )
            // InternalSqlDsl.g:2654:3: rule__ColumnOnCreation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnOnCreationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__Group__1__Impl"


    // $ANTLR start "rule__ColumnOnCreation__Group__2"
    // InternalSqlDsl.g:2662:1: rule__ColumnOnCreation__Group__2 : rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3 ;
    public final void rule__ColumnOnCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2666:1: ( rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3 )
            // InternalSqlDsl.g:2667:2: rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ColumnOnCreation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__Group__3();

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
    // $ANTLR end "rule__ColumnOnCreation__Group__2"


    // $ANTLR start "rule__ColumnOnCreation__Group__2__Impl"
    // InternalSqlDsl.g:2674:1: rule__ColumnOnCreation__Group__2__Impl : ( ( rule__ColumnOnCreation__TypeAssignment_2 ) ) ;
    public final void rule__ColumnOnCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2678:1: ( ( ( rule__ColumnOnCreation__TypeAssignment_2 ) ) )
            // InternalSqlDsl.g:2679:1: ( ( rule__ColumnOnCreation__TypeAssignment_2 ) )
            {
            // InternalSqlDsl.g:2679:1: ( ( rule__ColumnOnCreation__TypeAssignment_2 ) )
            // InternalSqlDsl.g:2680:2: ( rule__ColumnOnCreation__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getTypeAssignment_2()); 
            // InternalSqlDsl.g:2681:2: ( rule__ColumnOnCreation__TypeAssignment_2 )
            // InternalSqlDsl.g:2681:3: rule__ColumnOnCreation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnOnCreationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__Group__2__Impl"


    // $ANTLR start "rule__ColumnOnCreation__Group__3"
    // InternalSqlDsl.g:2689:1: rule__ColumnOnCreation__Group__3 : rule__ColumnOnCreation__Group__3__Impl ;
    public final void rule__ColumnOnCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2693:1: ( rule__ColumnOnCreation__Group__3__Impl )
            // InternalSqlDsl.g:2694:2: rule__ColumnOnCreation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__Group__3__Impl();

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
    // $ANTLR end "rule__ColumnOnCreation__Group__3"


    // $ANTLR start "rule__ColumnOnCreation__Group__3__Impl"
    // InternalSqlDsl.g:2700:1: rule__ColumnOnCreation__Group__3__Impl : ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? ) ;
    public final void rule__ColumnOnCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2704:1: ( ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? ) )
            // InternalSqlDsl.g:2705:1: ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? )
            {
            // InternalSqlDsl.g:2705:1: ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? )
            // InternalSqlDsl.g:2706:2: ( rule__ColumnOnCreation__ConstaintsAssignment_3 )?
            {
             before(grammarAccess.getColumnOnCreationAccess().getConstaintsAssignment_3()); 
            // InternalSqlDsl.g:2707:2: ( rule__ColumnOnCreation__ConstaintsAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSqlDsl.g:2707:3: rule__ColumnOnCreation__ConstaintsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnOnCreation__ConstaintsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnOnCreationAccess().getConstaintsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__Group__3__Impl"


    // $ANTLR start "rule__Constaint__Group__0"
    // InternalSqlDsl.g:2716:1: rule__Constaint__Group__0 : rule__Constaint__Group__0__Impl rule__Constaint__Group__1 ;
    public final void rule__Constaint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2720:1: ( rule__Constaint__Group__0__Impl rule__Constaint__Group__1 )
            // InternalSqlDsl.g:2721:2: rule__Constaint__Group__0__Impl rule__Constaint__Group__1
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
    // InternalSqlDsl.g:2728:1: rule__Constaint__Group__0__Impl : ( 'CONSTRAINT' ) ;
    public final void rule__Constaint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2732:1: ( ( 'CONSTRAINT' ) )
            // InternalSqlDsl.g:2733:1: ( 'CONSTRAINT' )
            {
            // InternalSqlDsl.g:2733:1: ( 'CONSTRAINT' )
            // InternalSqlDsl.g:2734:2: 'CONSTRAINT'
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
    // InternalSqlDsl.g:2743:1: rule__Constaint__Group__1 : rule__Constaint__Group__1__Impl ;
    public final void rule__Constaint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2747:1: ( rule__Constaint__Group__1__Impl )
            // InternalSqlDsl.g:2748:2: rule__Constaint__Group__1__Impl
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
    // InternalSqlDsl.g:2754:1: rule__Constaint__Group__1__Impl : ( ( rule__Constaint__BodyAssignment_1 ) ) ;
    public final void rule__Constaint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2758:1: ( ( ( rule__Constaint__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:2759:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:2759:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            // InternalSqlDsl.g:2760:2: ( rule__Constaint__BodyAssignment_1 )
            {
             before(grammarAccess.getConstaintAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:2761:2: ( rule__Constaint__BodyAssignment_1 )
            // InternalSqlDsl.g:2761:3: rule__Constaint__BodyAssignment_1
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


    // $ANTLR start "rule__Clause__Group__0"
    // InternalSqlDsl.g:2770:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2774:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalSqlDsl.g:2775:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
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
    // InternalSqlDsl.g:2782:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__NameAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2786:1: ( ( ( rule__Clause__NameAssignment_0 ) ) )
            // InternalSqlDsl.g:2787:1: ( ( rule__Clause__NameAssignment_0 ) )
            {
            // InternalSqlDsl.g:2787:1: ( ( rule__Clause__NameAssignment_0 ) )
            // InternalSqlDsl.g:2788:2: ( rule__Clause__NameAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getNameAssignment_0()); 
            // InternalSqlDsl.g:2789:2: ( rule__Clause__NameAssignment_0 )
            // InternalSqlDsl.g:2789:3: rule__Clause__NameAssignment_0
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
    // InternalSqlDsl.g:2797:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2801:1: ( rule__Clause__Group__1__Impl )
            // InternalSqlDsl.g:2802:2: rule__Clause__Group__1__Impl
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
    // InternalSqlDsl.g:2808:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__BodyAssignment_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2812:1: ( ( ( rule__Clause__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:2813:1: ( ( rule__Clause__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:2813:1: ( ( rule__Clause__BodyAssignment_1 ) )
            // InternalSqlDsl.g:2814:2: ( rule__Clause__BodyAssignment_1 )
            {
             before(grammarAccess.getClauseAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:2815:2: ( rule__Clause__BodyAssignment_1 )
            // InternalSqlDsl.g:2815:3: rule__Clause__BodyAssignment_1
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


    // $ANTLR start "rule__Value__Group__0"
    // InternalSqlDsl.g:2824:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2828:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSqlDsl.g:2829:2: rule__Value__Group__0__Impl rule__Value__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSqlDsl.g:2836:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2840:1: ( ( () ) )
            // InternalSqlDsl.g:2841:1: ( () )
            {
            // InternalSqlDsl.g:2841:1: ( () )
            // InternalSqlDsl.g:2842:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSqlDsl.g:2843:2: ()
            // InternalSqlDsl.g:2843:3: 
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
    // InternalSqlDsl.g:2851:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2855:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalSqlDsl.g:2856:2: rule__Value__Group__1__Impl rule__Value__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSqlDsl.g:2863:1: rule__Value__Group__1__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2867:1: ( ( 'Value' ) )
            // InternalSqlDsl.g:2868:1: ( 'Value' )
            {
            // InternalSqlDsl.g:2868:1: ( 'Value' )
            // InternalSqlDsl.g:2869:2: 'Value'
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
    // InternalSqlDsl.g:2878:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2882:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalSqlDsl.g:2883:2: rule__Value__Group__2__Impl rule__Value__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSqlDsl.g:2890:1: rule__Value__Group__2__Impl : ( '(' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2894:1: ( ( '(' ) )
            // InternalSqlDsl.g:2895:1: ( '(' )
            {
            // InternalSqlDsl.g:2895:1: ( '(' )
            // InternalSqlDsl.g:2896:2: '('
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
    // InternalSqlDsl.g:2905:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2909:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalSqlDsl.g:2910:2: rule__Value__Group__3__Impl rule__Value__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSqlDsl.g:2917:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2921:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalSqlDsl.g:2922:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2922:1: ( ( rule__Value__Group_3__0 )? )
            // InternalSqlDsl.g:2923:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalSqlDsl.g:2924:2: ( rule__Value__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSqlDsl.g:2924:3: rule__Value__Group_3__0
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
    // InternalSqlDsl.g:2932:1: rule__Value__Group__4 : rule__Value__Group__4__Impl ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2936:1: ( rule__Value__Group__4__Impl )
            // InternalSqlDsl.g:2937:2: rule__Value__Group__4__Impl
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
    // InternalSqlDsl.g:2943:1: rule__Value__Group__4__Impl : ( ')' ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2947:1: ( ( ')' ) )
            // InternalSqlDsl.g:2948:1: ( ')' )
            {
            // InternalSqlDsl.g:2948:1: ( ')' )
            // InternalSqlDsl.g:2949:2: ')'
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
    // InternalSqlDsl.g:2959:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2963:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalSqlDsl.g:2964:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalSqlDsl.g:2971:1: rule__Value__Group_3__0__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2975:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) )
            // InternalSqlDsl.g:2976:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:2976:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            // InternalSqlDsl.g:2977:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_0()); 
            // InternalSqlDsl.g:2978:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            // InternalSqlDsl.g:2978:3: rule__Value__ColumnvaluesAssignment_3_0
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
    // InternalSqlDsl.g:2986:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2990:1: ( rule__Value__Group_3__1__Impl )
            // InternalSqlDsl.g:2991:2: rule__Value__Group_3__1__Impl
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
    // InternalSqlDsl.g:2997:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__Group_3_1__0 )* ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3001:1: ( ( ( rule__Value__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:3002:1: ( ( rule__Value__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:3002:1: ( ( rule__Value__Group_3_1__0 )* )
            // InternalSqlDsl.g:3003:2: ( rule__Value__Group_3_1__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:3004:2: ( rule__Value__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSqlDsl.g:3004:3: rule__Value__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Value__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSqlDsl.g:3013:1: rule__Value__Group_3_1__0 : rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 ;
    public final void rule__Value__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3017:1: ( rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 )
            // InternalSqlDsl.g:3018:2: rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1
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
    // InternalSqlDsl.g:3025:1: rule__Value__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Value__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3029:1: ( ( ',' ) )
            // InternalSqlDsl.g:3030:1: ( ',' )
            {
            // InternalSqlDsl.g:3030:1: ( ',' )
            // InternalSqlDsl.g:3031:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_3_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSqlDsl.g:3040:1: rule__Value__Group_3_1__1 : rule__Value__Group_3_1__1__Impl ;
    public final void rule__Value__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3044:1: ( rule__Value__Group_3_1__1__Impl )
            // InternalSqlDsl.g:3045:2: rule__Value__Group_3_1__1__Impl
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
    // InternalSqlDsl.g:3051:1: rule__Value__Group_3_1__1__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) ;
    public final void rule__Value__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3055:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:3056:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:3056:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            // InternalSqlDsl.g:3057:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_1_1()); 
            // InternalSqlDsl.g:3058:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            // InternalSqlDsl.g:3058:3: rule__Value__ColumnvaluesAssignment_3_1_1
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
    // InternalSqlDsl.g:3067:1: rule__ColumnValue__Group__0 : rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 ;
    public final void rule__ColumnValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3071:1: ( rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 )
            // InternalSqlDsl.g:3072:2: rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1
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
    // InternalSqlDsl.g:3079:1: rule__ColumnValue__Group__0__Impl : ( () ) ;
    public final void rule__ColumnValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3083:1: ( ( () ) )
            // InternalSqlDsl.g:3084:1: ( () )
            {
            // InternalSqlDsl.g:3084:1: ( () )
            // InternalSqlDsl.g:3085:2: ()
            {
             before(grammarAccess.getColumnValueAccess().getColumnValueAction_0()); 
            // InternalSqlDsl.g:3086:2: ()
            // InternalSqlDsl.g:3086:3: 
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
    // InternalSqlDsl.g:3094:1: rule__ColumnValue__Group__1 : rule__ColumnValue__Group__1__Impl ;
    public final void rule__ColumnValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3098:1: ( rule__ColumnValue__Group__1__Impl )
            // InternalSqlDsl.g:3099:2: rule__ColumnValue__Group__1__Impl
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
    // InternalSqlDsl.g:3105:1: rule__ColumnValue__Group__1__Impl : ( ( rule__ColumnValue__ValueAssignment_1 ) ) ;
    public final void rule__ColumnValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3109:1: ( ( ( rule__ColumnValue__ValueAssignment_1 ) ) )
            // InternalSqlDsl.g:3110:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            {
            // InternalSqlDsl.g:3110:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            // InternalSqlDsl.g:3111:2: ( rule__ColumnValue__ValueAssignment_1 )
            {
             before(grammarAccess.getColumnValueAccess().getValueAssignment_1()); 
            // InternalSqlDsl.g:3112:2: ( rule__ColumnValue__ValueAssignment_1 )
            // InternalSqlDsl.g:3112:3: rule__ColumnValue__ValueAssignment_1
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
    // InternalSqlDsl.g:3121:1: rule__ComplexString__Group__0 : rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 ;
    public final void rule__ComplexString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3125:1: ( rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 )
            // InternalSqlDsl.g:3126:2: rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSqlDsl.g:3133:1: rule__ComplexString__Group__0__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3137:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3138:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3138:1: ( ruleEString )
            // InternalSqlDsl.g:3139:2: ruleEString
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
    // InternalSqlDsl.g:3148:1: rule__ComplexString__Group__1 : rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 ;
    public final void rule__ComplexString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3152:1: ( rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 )
            // InternalSqlDsl.g:3153:2: rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSqlDsl.g:3160:1: rule__ComplexString__Group__1__Impl : ( ( rule__ComplexString__Group_1__0 )* ) ;
    public final void rule__ComplexString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3164:1: ( ( ( rule__ComplexString__Group_1__0 )* ) )
            // InternalSqlDsl.g:3165:1: ( ( rule__ComplexString__Group_1__0 )* )
            {
            // InternalSqlDsl.g:3165:1: ( ( rule__ComplexString__Group_1__0 )* )
            // InternalSqlDsl.g:3166:2: ( rule__ComplexString__Group_1__0 )*
            {
             before(grammarAccess.getComplexStringAccess().getGroup_1()); 
            // InternalSqlDsl.g:3167:2: ( rule__ComplexString__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt21=1;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 23:
                    case 26:
                    case 34:
                    case 38:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt21=1;
                        }
                        break;
                    case 40:
                        {
                        alt21=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(2) ) {
                    case EOF:
                    case RULE_ID:
                    case 23:
                    case 26:
                    case 34:
                    case 38:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt21=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt21=1;
                        }
                        break;
                    case 40:
                        {
                        alt21=1;
                        }
                        break;

                    }

                    }
                    break;
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalSqlDsl.g:3167:3: rule__ComplexString__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ComplexString__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSqlDsl.g:3175:1: rule__ComplexString__Group__2 : rule__ComplexString__Group__2__Impl ;
    public final void rule__ComplexString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3179:1: ( rule__ComplexString__Group__2__Impl )
            // InternalSqlDsl.g:3180:2: rule__ComplexString__Group__2__Impl
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
    // InternalSqlDsl.g:3186:1: rule__ComplexString__Group__2__Impl : ( ( rule__ComplexString__Group_2__0 )? ) ;
    public final void rule__ComplexString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3190:1: ( ( ( rule__ComplexString__Group_2__0 )? ) )
            // InternalSqlDsl.g:3191:1: ( ( rule__ComplexString__Group_2__0 )? )
            {
            // InternalSqlDsl.g:3191:1: ( ( rule__ComplexString__Group_2__0 )? )
            // InternalSqlDsl.g:3192:2: ( rule__ComplexString__Group_2__0 )?
            {
             before(grammarAccess.getComplexStringAccess().getGroup_2()); 
            // InternalSqlDsl.g:3193:2: ( rule__ComplexString__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSqlDsl.g:3193:3: rule__ComplexString__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexString__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalSqlDsl.g:3202:1: rule__ComplexString__Group_1__0 : rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 ;
    public final void rule__ComplexString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3206:1: ( rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 )
            // InternalSqlDsl.g:3207:2: rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSqlDsl.g:3214:1: rule__ComplexString__Group_1__0__Impl : ( ( '.' )? ) ;
    public final void rule__ComplexString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3218:1: ( ( ( '.' )? ) )
            // InternalSqlDsl.g:3219:1: ( ( '.' )? )
            {
            // InternalSqlDsl.g:3219:1: ( ( '.' )? )
            // InternalSqlDsl.g:3220:2: ( '.' )?
            {
             before(grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0()); 
            // InternalSqlDsl.g:3221:2: ( '.' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSqlDsl.g:3221:3: '.'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalSqlDsl.g:3229:1: rule__ComplexString__Group_1__1 : rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 ;
    public final void rule__ComplexString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3233:1: ( rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 )
            // InternalSqlDsl.g:3234:2: rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSqlDsl.g:3241:1: rule__ComplexString__Group_1__1__Impl : ( ( '*' )? ) ;
    public final void rule__ComplexString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3245:1: ( ( ( '*' )? ) )
            // InternalSqlDsl.g:3246:1: ( ( '*' )? )
            {
            // InternalSqlDsl.g:3246:1: ( ( '*' )? )
            // InternalSqlDsl.g:3247:2: ( '*' )?
            {
             before(grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1()); 
            // InternalSqlDsl.g:3248:2: ( '*' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSqlDsl.g:3248:3: '*'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalSqlDsl.g:3256:1: rule__ComplexString__Group_1__2 : rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 ;
    public final void rule__ComplexString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3260:1: ( rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 )
            // InternalSqlDsl.g:3261:2: rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSqlDsl.g:3268:1: rule__ComplexString__Group_1__2__Impl : ( ( '=' )? ) ;
    public final void rule__ComplexString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3272:1: ( ( ( '=' )? ) )
            // InternalSqlDsl.g:3273:1: ( ( '=' )? )
            {
            // InternalSqlDsl.g:3273:1: ( ( '=' )? )
            // InternalSqlDsl.g:3274:2: ( '=' )?
            {
             before(grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2()); 
            // InternalSqlDsl.g:3275:2: ( '=' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSqlDsl.g:3275:3: '='
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalSqlDsl.g:3283:1: rule__ComplexString__Group_1__3 : rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4 ;
    public final void rule__ComplexString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3287:1: ( rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4 )
            // InternalSqlDsl.g:3288:2: rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4
            {
            pushFollow(FOLLOW_30);
            rule__ComplexString__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__4();

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
    // InternalSqlDsl.g:3295:1: rule__ComplexString__Group_1__3__Impl : ( ( '<' )? ) ;
    public final void rule__ComplexString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3299:1: ( ( ( '<' )? ) )
            // InternalSqlDsl.g:3300:1: ( ( '<' )? )
            {
            // InternalSqlDsl.g:3300:1: ( ( '<' )? )
            // InternalSqlDsl.g:3301:2: ( '<' )?
            {
             before(grammarAccess.getComplexStringAccess().getLessThanSignKeyword_1_3()); 
            // InternalSqlDsl.g:3302:2: ( '<' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSqlDsl.g:3302:3: '<'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getLessThanSignKeyword_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComplexString__Group_1__4"
    // InternalSqlDsl.g:3310:1: rule__ComplexString__Group_1__4 : rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5 ;
    public final void rule__ComplexString__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3314:1: ( rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5 )
            // InternalSqlDsl.g:3315:2: rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5
            {
            pushFollow(FOLLOW_30);
            rule__ComplexString__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__5();

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
    // $ANTLR end "rule__ComplexString__Group_1__4"


    // $ANTLR start "rule__ComplexString__Group_1__4__Impl"
    // InternalSqlDsl.g:3322:1: rule__ComplexString__Group_1__4__Impl : ( ( '>' )? ) ;
    public final void rule__ComplexString__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3326:1: ( ( ( '>' )? ) )
            // InternalSqlDsl.g:3327:1: ( ( '>' )? )
            {
            // InternalSqlDsl.g:3327:1: ( ( '>' )? )
            // InternalSqlDsl.g:3328:2: ( '>' )?
            {
             before(grammarAccess.getComplexStringAccess().getGreaterThanSignKeyword_1_4()); 
            // InternalSqlDsl.g:3329:2: ( '>' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSqlDsl.g:3329:3: '>'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComplexStringAccess().getGreaterThanSignKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__4__Impl"


    // $ANTLR start "rule__ComplexString__Group_1__5"
    // InternalSqlDsl.g:3337:1: rule__ComplexString__Group_1__5 : rule__ComplexString__Group_1__5__Impl ;
    public final void rule__ComplexString__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3341:1: ( rule__ComplexString__Group_1__5__Impl )
            // InternalSqlDsl.g:3342:2: rule__ComplexString__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_1__5__Impl();

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
    // $ANTLR end "rule__ComplexString__Group_1__5"


    // $ANTLR start "rule__ComplexString__Group_1__5__Impl"
    // InternalSqlDsl.g:3348:1: rule__ComplexString__Group_1__5__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3352:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3353:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3353:1: ( ruleEString )
            // InternalSqlDsl.g:3354:2: ruleEString
            {
             before(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_5()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_1__5__Impl"


    // $ANTLR start "rule__ComplexString__Group_2__0"
    // InternalSqlDsl.g:3364:1: rule__ComplexString__Group_2__0 : rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1 ;
    public final void rule__ComplexString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3368:1: ( rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1 )
            // InternalSqlDsl.g:3369:2: rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ComplexString__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2__1();

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
    // $ANTLR end "rule__ComplexString__Group_2__0"


    // $ANTLR start "rule__ComplexString__Group_2__0__Impl"
    // InternalSqlDsl.g:3376:1: rule__ComplexString__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ComplexString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3380:1: ( ( '(' ) )
            // InternalSqlDsl.g:3381:1: ( '(' )
            {
            // InternalSqlDsl.g:3381:1: ( '(' )
            // InternalSqlDsl.g:3382:2: '('
            {
             before(grammarAccess.getComplexStringAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComplexStringAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexString__Group_2__1"
    // InternalSqlDsl.g:3391:1: rule__ComplexString__Group_2__1 : rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2 ;
    public final void rule__ComplexString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3395:1: ( rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2 )
            // InternalSqlDsl.g:3396:2: rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__ComplexString__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2__2();

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
    // $ANTLR end "rule__ComplexString__Group_2__1"


    // $ANTLR start "rule__ComplexString__Group_2__1__Impl"
    // InternalSqlDsl.g:3403:1: rule__ComplexString__Group_2__1__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3407:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3408:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3408:1: ( ruleEString )
            // InternalSqlDsl.g:3409:2: ruleEString
            {
             before(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexString__Group_2__2"
    // InternalSqlDsl.g:3418:1: rule__ComplexString__Group_2__2 : rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3 ;
    public final void rule__ComplexString__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3422:1: ( rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3 )
            // InternalSqlDsl.g:3423:2: rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3
            {
            pushFollow(FOLLOW_31);
            rule__ComplexString__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2__3();

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
    // $ANTLR end "rule__ComplexString__Group_2__2"


    // $ANTLR start "rule__ComplexString__Group_2__2__Impl"
    // InternalSqlDsl.g:3430:1: rule__ComplexString__Group_2__2__Impl : ( ( rule__ComplexString__Group_2_2__0 )* ) ;
    public final void rule__ComplexString__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3434:1: ( ( ( rule__ComplexString__Group_2_2__0 )* ) )
            // InternalSqlDsl.g:3435:1: ( ( rule__ComplexString__Group_2_2__0 )* )
            {
            // InternalSqlDsl.g:3435:1: ( ( rule__ComplexString__Group_2_2__0 )* )
            // InternalSqlDsl.g:3436:2: ( rule__ComplexString__Group_2_2__0 )*
            {
             before(grammarAccess.getComplexStringAccess().getGroup_2_2()); 
            // InternalSqlDsl.g:3437:2: ( rule__ComplexString__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSqlDsl.g:3437:3: rule__ComplexString__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComplexString__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getComplexStringAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2__2__Impl"


    // $ANTLR start "rule__ComplexString__Group_2__3"
    // InternalSqlDsl.g:3445:1: rule__ComplexString__Group_2__3 : rule__ComplexString__Group_2__3__Impl ;
    public final void rule__ComplexString__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3449:1: ( rule__ComplexString__Group_2__3__Impl )
            // InternalSqlDsl.g:3450:2: rule__ComplexString__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2__3__Impl();

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
    // $ANTLR end "rule__ComplexString__Group_2__3"


    // $ANTLR start "rule__ComplexString__Group_2__3__Impl"
    // InternalSqlDsl.g:3456:1: rule__ComplexString__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ComplexString__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3460:1: ( ( ')' ) )
            // InternalSqlDsl.g:3461:1: ( ')' )
            {
            // InternalSqlDsl.g:3461:1: ( ')' )
            // InternalSqlDsl.g:3462:2: ')'
            {
             before(grammarAccess.getComplexStringAccess().getRightParenthesisKeyword_2_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComplexStringAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2__3__Impl"


    // $ANTLR start "rule__ComplexString__Group_2_2__0"
    // InternalSqlDsl.g:3472:1: rule__ComplexString__Group_2_2__0 : rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1 ;
    public final void rule__ComplexString__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3476:1: ( rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1 )
            // InternalSqlDsl.g:3477:2: rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ComplexString__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2_2__1();

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
    // $ANTLR end "rule__ComplexString__Group_2_2__0"


    // $ANTLR start "rule__ComplexString__Group_2_2__0__Impl"
    // InternalSqlDsl.g:3484:1: rule__ComplexString__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexString__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3488:1: ( ( ',' ) )
            // InternalSqlDsl.g:3489:1: ( ',' )
            {
            // InternalSqlDsl.g:3489:1: ( ',' )
            // InternalSqlDsl.g:3490:2: ','
            {
             before(grammarAccess.getComplexStringAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComplexStringAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2_2__0__Impl"


    // $ANTLR start "rule__ComplexString__Group_2_2__1"
    // InternalSqlDsl.g:3499:1: rule__ComplexString__Group_2_2__1 : rule__ComplexString__Group_2_2__1__Impl ;
    public final void rule__ComplexString__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3503:1: ( rule__ComplexString__Group_2_2__1__Impl )
            // InternalSqlDsl.g:3504:2: rule__ComplexString__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexString__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__ComplexString__Group_2_2__1"


    // $ANTLR start "rule__ComplexString__Group_2_2__1__Impl"
    // InternalSqlDsl.g:3510:1: rule__ComplexString__Group_2_2__1__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3514:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3515:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3515:1: ( ruleEString )
            // InternalSqlDsl.g:3516:2: ruleEString
            {
             before(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_2_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexString__Group_2_2__1__Impl"


    // $ANTLR start "rule__SqlProgram__QueriesAssignment_1_0"
    // InternalSqlDsl.g:3526:1: rule__SqlProgram__QueriesAssignment_1_0 : ( ruleQueries ) ;
    public final void rule__SqlProgram__QueriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3530:1: ( ( ruleQueries ) )
            // InternalSqlDsl.g:3531:2: ( ruleQueries )
            {
            // InternalSqlDsl.g:3531:2: ( ruleQueries )
            // InternalSqlDsl.g:3532:3: ruleQueries
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
    // InternalSqlDsl.g:3541:1: rule__Selection__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3545:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3546:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3546:2: ( ruleTable )
            // InternalSqlDsl.g:3547:3: ruleTable
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
    // InternalSqlDsl.g:3556:1: rule__Selection__ObjectsAssignment_4_1 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3560:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3561:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3561:2: ( ruleTable )
            // InternalSqlDsl.g:3562:3: ruleTable
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
    // InternalSqlDsl.g:3571:1: rule__Selection__ClausesAssignment_5 : ( ruleClause ) ;
    public final void rule__Selection__ClausesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3575:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3576:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3576:2: ( ruleClause )
            // InternalSqlDsl.g:3577:3: ruleClause
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
    // InternalSqlDsl.g:3586:1: rule__Creation__TypeAssignment_2_0_0 : ( ( 'TABLE' ) ) ;
    public final void rule__Creation__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3590:1: ( ( ( 'TABLE' ) ) )
            // InternalSqlDsl.g:3591:2: ( ( 'TABLE' ) )
            {
            // InternalSqlDsl.g:3591:2: ( ( 'TABLE' ) )
            // InternalSqlDsl.g:3592:3: ( 'TABLE' )
            {
             before(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 
            // InternalSqlDsl.g:3593:3: ( 'TABLE' )
            // InternalSqlDsl.g:3594:4: 'TABLE'
            {
             before(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSqlDsl.g:3605:1: rule__Creation__ObjectsAssignment_2_0_1 : ( ruleTableOnCreation ) ;
    public final void rule__Creation__ObjectsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3609:1: ( ( ruleTableOnCreation ) )
            // InternalSqlDsl.g:3610:2: ( ruleTableOnCreation )
            {
            // InternalSqlDsl.g:3610:2: ( ruleTableOnCreation )
            // InternalSqlDsl.g:3611:3: ruleTableOnCreation
            {
             before(grammarAccess.getCreationAccess().getObjectsTableOnCreationParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableOnCreation();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsTableOnCreationParserRuleCall_2_0_1_0()); 

            }


            }

        }
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
    // InternalSqlDsl.g:3620:1: rule__Creation__ConstaintsAssignment_2_0_2_0 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3624:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:3625:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:3625:2: ( ruleConstaint )
            // InternalSqlDsl.g:3626:3: ruleConstaint
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
    // InternalSqlDsl.g:3635:1: rule__Creation__ConstaintsAssignment_2_0_2_1_1 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3639:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:3640:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:3640:2: ( ruleConstaint )
            // InternalSqlDsl.g:3641:3: ruleConstaint
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
    // InternalSqlDsl.g:3650:1: rule__Creation__TypeAssignment_2_1_0 : ( ( 'INDEX' ) ) ;
    public final void rule__Creation__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3654:1: ( ( ( 'INDEX' ) ) )
            // InternalSqlDsl.g:3655:2: ( ( 'INDEX' ) )
            {
            // InternalSqlDsl.g:3655:2: ( ( 'INDEX' ) )
            // InternalSqlDsl.g:3656:3: ( 'INDEX' )
            {
             before(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 
            // InternalSqlDsl.g:3657:3: ( 'INDEX' )
            // InternalSqlDsl.g:3658:4: 'INDEX'
            {
             before(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 
            match(input,46,FOLLOW_2); 
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


    // $ANTLR start "rule__Creation__NameAssignment_2_1_1"
    // InternalSqlDsl.g:3669:1: rule__Creation__NameAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__Creation__NameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3673:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3674:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3674:2: ( ruleEString )
            // InternalSqlDsl.g:3675:3: ruleEString
            {
             before(grammarAccess.getCreationAccess().getNameEStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getNameEStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__NameAssignment_2_1_1"


    // $ANTLR start "rule__Creation__ObjectsAssignment_2_1_3"
    // InternalSqlDsl.g:3684:1: rule__Creation__ObjectsAssignment_2_1_3 : ( ruleTable ) ;
    public final void rule__Creation__ObjectsAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3688:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3689:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3689:2: ( ruleTable )
            // InternalSqlDsl.g:3690:3: ruleTable
            {
             before(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creation__ObjectsAssignment_2_1_3"


    // $ANTLR start "rule__Update__ObjectsAssignment_2"
    // InternalSqlDsl.g:3699:1: rule__Update__ObjectsAssignment_2 : ( ruleTable ) ;
    public final void rule__Update__ObjectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3703:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3704:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3704:2: ( ruleTable )
            // InternalSqlDsl.g:3705:3: ruleTable
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
    // InternalSqlDsl.g:3714:1: rule__Update__ClausesAssignment_3 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3718:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3719:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3719:2: ( ruleClause )
            // InternalSqlDsl.g:3720:3: ruleClause
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
    // InternalSqlDsl.g:3729:1: rule__Update__ClausesAssignment_4_1 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3733:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3734:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3734:2: ( ruleClause )
            // InternalSqlDsl.g:3735:3: ruleClause
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
    // InternalSqlDsl.g:3744:1: rule__Insertion__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Insertion__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3748:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3749:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3749:2: ( ruleTable )
            // InternalSqlDsl.g:3750:3: ruleTable
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


    // $ANTLR start "rule__Insertion__ValuesAssignment_6"
    // InternalSqlDsl.g:3759:1: rule__Insertion__ValuesAssignment_6 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3763:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:3764:2: ( ruleValue )
            {
            // InternalSqlDsl.g:3764:2: ( ruleValue )
            // InternalSqlDsl.g:3765:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__ValuesAssignment_6"


    // $ANTLR start "rule__Insertion__ValuesAssignment_7_1"
    // InternalSqlDsl.g:3774:1: rule__Insertion__ValuesAssignment_7_1 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3778:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:3779:2: ( ruleValue )
            {
            // InternalSqlDsl.g:3779:2: ( ruleValue )
            // InternalSqlDsl.g:3780:3: ruleValue
            {
             before(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insertion__ValuesAssignment_7_1"


    // $ANTLR start "rule__Delete__ObjectsAssignment_3"
    // InternalSqlDsl.g:3789:1: rule__Delete__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Delete__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3793:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3794:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3794:2: ( ruleTable )
            // InternalSqlDsl.g:3795:3: ruleTable
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
    // InternalSqlDsl.g:3804:1: rule__Delete__ClausesAssignment_4_0 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3808:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3809:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3809:2: ( ruleClause )
            // InternalSqlDsl.g:3810:3: ruleClause
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
    // InternalSqlDsl.g:3819:1: rule__Delete__ClausesAssignment_4_1_1 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3823:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3824:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3824:2: ( ruleClause )
            // InternalSqlDsl.g:3825:3: ruleClause
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
    // InternalSqlDsl.g:3834:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3838:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3839:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3839:2: ( ruleEString )
            // InternalSqlDsl.g:3840:3: ruleEString
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
    // InternalSqlDsl.g:3849:1: rule__Table__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3853:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:3854:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:3854:2: ( ruleColumn )
            // InternalSqlDsl.g:3855:3: ruleColumn
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
    // InternalSqlDsl.g:3864:1: rule__Table__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3868:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:3869:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:3869:2: ( ruleColumn )
            // InternalSqlDsl.g:3870:3: ruleColumn
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


    // $ANTLR start "rule__TableOnCreation__NameAssignment_1"
    // InternalSqlDsl.g:3879:1: rule__TableOnCreation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TableOnCreation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3883:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3884:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3884:2: ( ruleEString )
            // InternalSqlDsl.g:3885:3: ruleEString
            {
             before(grammarAccess.getTableOnCreationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableOnCreationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__NameAssignment_1"


    // $ANTLR start "rule__TableOnCreation__ColumnsAssignment_3"
    // InternalSqlDsl.g:3894:1: rule__TableOnCreation__ColumnsAssignment_3 : ( ruleColumnOnCreation ) ;
    public final void rule__TableOnCreation__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3898:1: ( ( ruleColumnOnCreation ) )
            // InternalSqlDsl.g:3899:2: ( ruleColumnOnCreation )
            {
            // InternalSqlDsl.g:3899:2: ( ruleColumnOnCreation )
            // InternalSqlDsl.g:3900:3: ruleColumnOnCreation
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnOnCreation();

            state._fsp--;

             after(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__ColumnsAssignment_3"


    // $ANTLR start "rule__TableOnCreation__ColumnsAssignment_4_1"
    // InternalSqlDsl.g:3909:1: rule__TableOnCreation__ColumnsAssignment_4_1 : ( ruleColumnOnCreation ) ;
    public final void rule__TableOnCreation__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3913:1: ( ( ruleColumnOnCreation ) )
            // InternalSqlDsl.g:3914:2: ( ruleColumnOnCreation )
            {
            // InternalSqlDsl.g:3914:2: ( ruleColumnOnCreation )
            // InternalSqlDsl.g:3915:3: ruleColumnOnCreation
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnOnCreation();

            state._fsp--;

             after(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableOnCreation__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Column__NameAssignment_1"
    // InternalSqlDsl.g:3924:1: rule__Column__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3928:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3929:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3929:2: ( ruleEString )
            // InternalSqlDsl.g:3930:3: ruleEString
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


    // $ANTLR start "rule__ColumnOnCreation__NameAssignment_1"
    // InternalSqlDsl.g:3939:1: rule__ColumnOnCreation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnOnCreation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3943:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3944:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3944:2: ( ruleEString )
            // InternalSqlDsl.g:3945:3: ruleEString
            {
             before(grammarAccess.getColumnOnCreationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnOnCreationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__NameAssignment_1"


    // $ANTLR start "rule__ColumnOnCreation__TypeAssignment_2"
    // InternalSqlDsl.g:3954:1: rule__ColumnOnCreation__TypeAssignment_2 : ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) ) ;
    public final void rule__ColumnOnCreation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3958:1: ( ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) ) )
            // InternalSqlDsl.g:3959:2: ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) )
            {
            // InternalSqlDsl.g:3959:2: ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) )
            // InternalSqlDsl.g:3960:3: ( rule__ColumnOnCreation__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getTypeAlternatives_2_0()); 
            // InternalSqlDsl.g:3961:3: ( rule__ColumnOnCreation__TypeAlternatives_2_0 )
            // InternalSqlDsl.g:3961:4: rule__ColumnOnCreation__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ColumnOnCreation__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnOnCreationAccess().getTypeAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__TypeAssignment_2"


    // $ANTLR start "rule__ColumnOnCreation__ConstaintsAssignment_3"
    // InternalSqlDsl.g:3969:1: rule__ColumnOnCreation__ConstaintsAssignment_3 : ( ruleConstaintOnCreation ) ;
    public final void rule__ColumnOnCreation__ConstaintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3973:1: ( ( ruleConstaintOnCreation ) )
            // InternalSqlDsl.g:3974:2: ( ruleConstaintOnCreation )
            {
            // InternalSqlDsl.g:3974:2: ( ruleConstaintOnCreation )
            // InternalSqlDsl.g:3975:3: ruleConstaintOnCreation
            {
             before(grammarAccess.getColumnOnCreationAccess().getConstaintsConstaintOnCreationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstaintOnCreation();

            state._fsp--;

             after(grammarAccess.getColumnOnCreationAccess().getConstaintsConstaintOnCreationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnOnCreation__ConstaintsAssignment_3"


    // $ANTLR start "rule__Constaint__BodyAssignment_1"
    // InternalSqlDsl.g:3984:1: rule__Constaint__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Constaint__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3988:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:3989:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:3989:2: ( ruleComplexString )
            // InternalSqlDsl.g:3990:3: ruleComplexString
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


    // $ANTLR start "rule__ConstaintOnCreation__BodyAssignment"
    // InternalSqlDsl.g:3999:1: rule__ConstaintOnCreation__BodyAssignment : ( ruleComplexString ) ;
    public final void rule__ConstaintOnCreation__BodyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4003:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:4004:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:4004:2: ( ruleComplexString )
            // InternalSqlDsl.g:4005:3: ruleComplexString
            {
             before(grammarAccess.getConstaintOnCreationAccess().getBodyComplexStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexString();

            state._fsp--;

             after(grammarAccess.getConstaintOnCreationAccess().getBodyComplexStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstaintOnCreation__BodyAssignment"


    // $ANTLR start "rule__Clause__NameAssignment_0"
    // InternalSqlDsl.g:4014:1: rule__Clause__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Clause__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4018:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4019:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4019:2: ( ruleEString )
            // InternalSqlDsl.g:4020:3: ruleEString
            {
             before(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalSqlDsl.g:4029:1: rule__Clause__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Clause__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4033:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:4034:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:4034:2: ( ruleComplexString )
            // InternalSqlDsl.g:4035:3: ruleComplexString
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


    // $ANTLR start "rule__Value__ColumnvaluesAssignment_3_0"
    // InternalSqlDsl.g:4044:1: rule__Value__ColumnvaluesAssignment_3_0 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4048:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:4049:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:4049:2: ( ruleColumnValue )
            // InternalSqlDsl.g:4050:3: ruleColumnValue
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
    // InternalSqlDsl.g:4059:1: rule__Value__ColumnvaluesAssignment_3_1_1 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4063:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:4064:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:4064:2: ( ruleColumnValue )
            // InternalSqlDsl.g:4065:3: ruleColumnValue
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
    // InternalSqlDsl.g:4074:1: rule__ColumnValue__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4078:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4079:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4079:2: ( ruleEString )
            // InternalSqlDsl.g:4080:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000869000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000869000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001F4000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001F0000000032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001F0000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008004000000L});

}
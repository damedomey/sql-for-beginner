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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'varchar(100)'", "'char(100)'", "'text'", "'date'", "'INT'", "'FLOAT'", "'VARCHAR(100)'", "'CHAR(100)'", "'TEXT'", "'DATE'", "';'", "'FROM'", "','", "'SELECT'", "'CREATE'", "'ON'", "'UPDATE'", "'INSERT'", "'INTO'", "'VALUES'", "'{'", "'}'", "'DELETE'", "'CONSTRAINT'", "'Value'", "'('", "')'", "'.'", "'*'", "'='", "'<'", "'>'", "'TABLE'", "'INDEX'"
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


    // $ANTLR start "entryRuleQuickSelection"
    // InternalSqlDsl.g:103:1: entryRuleQuickSelection : ruleQuickSelection EOF ;
    public final void entryRuleQuickSelection() throws RecognitionException {
        try {
            // InternalSqlDsl.g:104:1: ( ruleQuickSelection EOF )
            // InternalSqlDsl.g:105:1: ruleQuickSelection EOF
            {
             before(grammarAccess.getQuickSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuickSelection();

            state._fsp--;

             after(grammarAccess.getQuickSelectionRule()); 
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
    // $ANTLR end "entryRuleQuickSelection"


    // $ANTLR start "ruleQuickSelection"
    // InternalSqlDsl.g:112:1: ruleQuickSelection : ( ( rule__QuickSelection__Group__0 ) ) ;
    public final void ruleQuickSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:116:2: ( ( ( rule__QuickSelection__Group__0 ) ) )
            // InternalSqlDsl.g:117:2: ( ( rule__QuickSelection__Group__0 ) )
            {
            // InternalSqlDsl.g:117:2: ( ( rule__QuickSelection__Group__0 ) )
            // InternalSqlDsl.g:118:3: ( rule__QuickSelection__Group__0 )
            {
             before(grammarAccess.getQuickSelectionAccess().getGroup()); 
            // InternalSqlDsl.g:119:3: ( rule__QuickSelection__Group__0 )
            // InternalSqlDsl.g:119:4: rule__QuickSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuickSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuickSelection"


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


    // $ANTLR start "entryRuleTableOnCreation"
    // InternalSqlDsl.g:303:1: entryRuleTableOnCreation : ruleTableOnCreation EOF ;
    public final void entryRuleTableOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:304:1: ( ruleTableOnCreation EOF )
            // InternalSqlDsl.g:305:1: ruleTableOnCreation EOF
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
    // InternalSqlDsl.g:312:1: ruleTableOnCreation : ( ( rule__TableOnCreation__Group__0 ) ) ;
    public final void ruleTableOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:316:2: ( ( ( rule__TableOnCreation__Group__0 ) ) )
            // InternalSqlDsl.g:317:2: ( ( rule__TableOnCreation__Group__0 ) )
            {
            // InternalSqlDsl.g:317:2: ( ( rule__TableOnCreation__Group__0 ) )
            // InternalSqlDsl.g:318:3: ( rule__TableOnCreation__Group__0 )
            {
             before(grammarAccess.getTableOnCreationAccess().getGroup()); 
            // InternalSqlDsl.g:319:3: ( rule__TableOnCreation__Group__0 )
            // InternalSqlDsl.g:319:4: rule__TableOnCreation__Group__0
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
    // InternalSqlDsl.g:328:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSqlDsl.g:329:1: ( ruleColumn EOF )
            // InternalSqlDsl.g:330:1: ruleColumn EOF
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
    // InternalSqlDsl.g:337:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:341:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalSqlDsl.g:342:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalSqlDsl.g:342:2: ( ( rule__Column__Group__0 ) )
            // InternalSqlDsl.g:343:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalSqlDsl.g:344:3: ( rule__Column__Group__0 )
            // InternalSqlDsl.g:344:4: rule__Column__Group__0
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
    // InternalSqlDsl.g:353:1: entryRuleColumnOnCreation : ruleColumnOnCreation EOF ;
    public final void entryRuleColumnOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:354:1: ( ruleColumnOnCreation EOF )
            // InternalSqlDsl.g:355:1: ruleColumnOnCreation EOF
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
    // InternalSqlDsl.g:362:1: ruleColumnOnCreation : ( ( rule__ColumnOnCreation__Group__0 ) ) ;
    public final void ruleColumnOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:366:2: ( ( ( rule__ColumnOnCreation__Group__0 ) ) )
            // InternalSqlDsl.g:367:2: ( ( rule__ColumnOnCreation__Group__0 ) )
            {
            // InternalSqlDsl.g:367:2: ( ( rule__ColumnOnCreation__Group__0 ) )
            // InternalSqlDsl.g:368:3: ( rule__ColumnOnCreation__Group__0 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getGroup()); 
            // InternalSqlDsl.g:369:3: ( rule__ColumnOnCreation__Group__0 )
            // InternalSqlDsl.g:369:4: rule__ColumnOnCreation__Group__0
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
    // InternalSqlDsl.g:378:1: entryRuleConstaint : ruleConstaint EOF ;
    public final void entryRuleConstaint() throws RecognitionException {
        try {
            // InternalSqlDsl.g:379:1: ( ruleConstaint EOF )
            // InternalSqlDsl.g:380:1: ruleConstaint EOF
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
    // InternalSqlDsl.g:387:1: ruleConstaint : ( ( rule__Constaint__Group__0 ) ) ;
    public final void ruleConstaint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:391:2: ( ( ( rule__Constaint__Group__0 ) ) )
            // InternalSqlDsl.g:392:2: ( ( rule__Constaint__Group__0 ) )
            {
            // InternalSqlDsl.g:392:2: ( ( rule__Constaint__Group__0 ) )
            // InternalSqlDsl.g:393:3: ( rule__Constaint__Group__0 )
            {
             before(grammarAccess.getConstaintAccess().getGroup()); 
            // InternalSqlDsl.g:394:3: ( rule__Constaint__Group__0 )
            // InternalSqlDsl.g:394:4: rule__Constaint__Group__0
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
    // InternalSqlDsl.g:403:1: entryRuleConstaintOnCreation : ruleConstaintOnCreation EOF ;
    public final void entryRuleConstaintOnCreation() throws RecognitionException {
        try {
            // InternalSqlDsl.g:404:1: ( ruleConstaintOnCreation EOF )
            // InternalSqlDsl.g:405:1: ruleConstaintOnCreation EOF
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
    // InternalSqlDsl.g:412:1: ruleConstaintOnCreation : ( ( rule__ConstaintOnCreation__BodyAssignment ) ) ;
    public final void ruleConstaintOnCreation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:416:2: ( ( ( rule__ConstaintOnCreation__BodyAssignment ) ) )
            // InternalSqlDsl.g:417:2: ( ( rule__ConstaintOnCreation__BodyAssignment ) )
            {
            // InternalSqlDsl.g:417:2: ( ( rule__ConstaintOnCreation__BodyAssignment ) )
            // InternalSqlDsl.g:418:3: ( rule__ConstaintOnCreation__BodyAssignment )
            {
             before(grammarAccess.getConstaintOnCreationAccess().getBodyAssignment()); 
            // InternalSqlDsl.g:419:3: ( rule__ConstaintOnCreation__BodyAssignment )
            // InternalSqlDsl.g:419:4: rule__ConstaintOnCreation__BodyAssignment
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
    // InternalSqlDsl.g:428:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalSqlDsl.g:429:1: ( ruleClause EOF )
            // InternalSqlDsl.g:430:1: ruleClause EOF
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
    // InternalSqlDsl.g:437:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:441:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalSqlDsl.g:442:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalSqlDsl.g:442:2: ( ( rule__Clause__Group__0 ) )
            // InternalSqlDsl.g:443:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalSqlDsl.g:444:3: ( rule__Clause__Group__0 )
            // InternalSqlDsl.g:444:4: rule__Clause__Group__0
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
    // InternalSqlDsl.g:453:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:454:1: ( ruleValue EOF )
            // InternalSqlDsl.g:455:1: ruleValue EOF
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
    // InternalSqlDsl.g:462:1: ruleValue : ( ( rule__Value__Group__0 ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:466:2: ( ( ( rule__Value__Group__0 ) ) )
            // InternalSqlDsl.g:467:2: ( ( rule__Value__Group__0 ) )
            {
            // InternalSqlDsl.g:467:2: ( ( rule__Value__Group__0 ) )
            // InternalSqlDsl.g:468:3: ( rule__Value__Group__0 )
            {
             before(grammarAccess.getValueAccess().getGroup()); 
            // InternalSqlDsl.g:469:3: ( rule__Value__Group__0 )
            // InternalSqlDsl.g:469:4: rule__Value__Group__0
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
    // InternalSqlDsl.g:478:1: entryRuleColumnValue : ruleColumnValue EOF ;
    public final void entryRuleColumnValue() throws RecognitionException {
        try {
            // InternalSqlDsl.g:479:1: ( ruleColumnValue EOF )
            // InternalSqlDsl.g:480:1: ruleColumnValue EOF
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
    // InternalSqlDsl.g:487:1: ruleColumnValue : ( ( rule__ColumnValue__Group__0 ) ) ;
    public final void ruleColumnValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:491:2: ( ( ( rule__ColumnValue__Group__0 ) ) )
            // InternalSqlDsl.g:492:2: ( ( rule__ColumnValue__Group__0 ) )
            {
            // InternalSqlDsl.g:492:2: ( ( rule__ColumnValue__Group__0 ) )
            // InternalSqlDsl.g:493:3: ( rule__ColumnValue__Group__0 )
            {
             before(grammarAccess.getColumnValueAccess().getGroup()); 
            // InternalSqlDsl.g:494:3: ( rule__ColumnValue__Group__0 )
            // InternalSqlDsl.g:494:4: rule__ColumnValue__Group__0
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
    // InternalSqlDsl.g:503:1: entryRuleComplexString : ruleComplexString EOF ;
    public final void entryRuleComplexString() throws RecognitionException {
        try {
            // InternalSqlDsl.g:504:1: ( ruleComplexString EOF )
            // InternalSqlDsl.g:505:1: ruleComplexString EOF
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
    // InternalSqlDsl.g:512:1: ruleComplexString : ( ( rule__ComplexString__Group__0 ) ) ;
    public final void ruleComplexString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:516:2: ( ( ( rule__ComplexString__Group__0 ) ) )
            // InternalSqlDsl.g:517:2: ( ( rule__ComplexString__Group__0 ) )
            {
            // InternalSqlDsl.g:517:2: ( ( rule__ComplexString__Group__0 ) )
            // InternalSqlDsl.g:518:3: ( rule__ComplexString__Group__0 )
            {
             before(grammarAccess.getComplexStringAccess().getGroup()); 
            // InternalSqlDsl.g:519:3: ( rule__ComplexString__Group__0 )
            // InternalSqlDsl.g:519:4: rule__ComplexString__Group__0
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
    // InternalSqlDsl.g:527:1: rule__Queries__Alternatives : ( ( ruleSelection ) | ( ruleQuickSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) );
    public final void rule__Queries__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:531:1: ( ( ruleSelection ) | ( ruleQuickSelection ) | ( ruleCreation ) | ( ruleUpdate ) | ( ruleInsertion ) | ( ruleDelete ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSqlDsl.g:532:2: ( ruleSelection )
                    {
                    // InternalSqlDsl.g:532:2: ( ruleSelection )
                    // InternalSqlDsl.g:533:3: ruleSelection
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
                    // InternalSqlDsl.g:538:2: ( ruleQuickSelection )
                    {
                    // InternalSqlDsl.g:538:2: ( ruleQuickSelection )
                    // InternalSqlDsl.g:539:3: ruleQuickSelection
                    {
                     before(grammarAccess.getQueriesAccess().getQuickSelectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuickSelection();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getQuickSelectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:544:2: ( ruleCreation )
                    {
                    // InternalSqlDsl.g:544:2: ( ruleCreation )
                    // InternalSqlDsl.g:545:3: ruleCreation
                    {
                     before(grammarAccess.getQueriesAccess().getCreationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCreation();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getCreationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:550:2: ( ruleUpdate )
                    {
                    // InternalSqlDsl.g:550:2: ( ruleUpdate )
                    // InternalSqlDsl.g:551:3: ruleUpdate
                    {
                     before(grammarAccess.getQueriesAccess().getUpdateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getUpdateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:556:2: ( ruleInsertion )
                    {
                    // InternalSqlDsl.g:556:2: ( ruleInsertion )
                    // InternalSqlDsl.g:557:3: ruleInsertion
                    {
                     before(grammarAccess.getQueriesAccess().getInsertionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertion();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getInsertionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:562:2: ( ruleDelete )
                    {
                    // InternalSqlDsl.g:562:2: ( ruleDelete )
                    // InternalSqlDsl.g:563:3: ruleDelete
                    {
                     before(grammarAccess.getQueriesAccess().getDeleteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getQueriesAccess().getDeleteParserRuleCall_5()); 

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
    // InternalSqlDsl.g:572:1: rule__Creation__Alternatives_2 : ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) );
    public final void rule__Creation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:576:1: ( ( ( rule__Creation__Group_2_0__0 ) ) | ( ( rule__Creation__Group_2_1__0 ) ) )
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
                    // InternalSqlDsl.g:577:2: ( ( rule__Creation__Group_2_0__0 ) )
                    {
                    // InternalSqlDsl.g:577:2: ( ( rule__Creation__Group_2_0__0 ) )
                    // InternalSqlDsl.g:578:3: ( rule__Creation__Group_2_0__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_0()); 
                    // InternalSqlDsl.g:579:3: ( rule__Creation__Group_2_0__0 )
                    // InternalSqlDsl.g:579:4: rule__Creation__Group_2_0__0
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
                    // InternalSqlDsl.g:583:2: ( ( rule__Creation__Group_2_1__0 ) )
                    {
                    // InternalSqlDsl.g:583:2: ( ( rule__Creation__Group_2_1__0 ) )
                    // InternalSqlDsl.g:584:3: ( rule__Creation__Group_2_1__0 )
                    {
                     before(grammarAccess.getCreationAccess().getGroup_2_1()); 
                    // InternalSqlDsl.g:585:3: ( rule__Creation__Group_2_1__0 )
                    // InternalSqlDsl.g:585:4: rule__Creation__Group_2_1__0
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
    // InternalSqlDsl.g:593:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:597:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSqlDsl.g:598:2: ( RULE_STRING )
                    {
                    // InternalSqlDsl.g:598:2: ( RULE_STRING )
                    // InternalSqlDsl.g:599:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:604:2: ( RULE_ID )
                    {
                    // InternalSqlDsl.g:604:2: ( RULE_ID )
                    // InternalSqlDsl.g:605:3: RULE_ID
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
    // InternalSqlDsl.g:614:1: rule__ColumnOnCreation__TypeAlternatives_2_0 : ( ( 'int' ) | ( 'float' ) | ( 'varchar(100)' ) | ( 'char(100)' ) | ( 'text' ) | ( 'date' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'VARCHAR(100)' ) | ( 'CHAR(100)' ) | ( 'TEXT' ) | ( 'DATE' ) );
    public final void rule__ColumnOnCreation__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:618:1: ( ( 'int' ) | ( 'float' ) | ( 'varchar(100)' ) | ( 'char(100)' ) | ( 'text' ) | ( 'date' ) | ( 'INT' ) | ( 'FLOAT' ) | ( 'VARCHAR(100)' ) | ( 'CHAR(100)' ) | ( 'TEXT' ) | ( 'DATE' ) )
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
                    // InternalSqlDsl.g:619:2: ( 'int' )
                    {
                    // InternalSqlDsl.g:619:2: ( 'int' )
                    // InternalSqlDsl.g:620:3: 'int'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeIntKeyword_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeIntKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:625:2: ( 'float' )
                    {
                    // InternalSqlDsl.g:625:2: ( 'float' )
                    // InternalSqlDsl.g:626:3: 'float'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeFloatKeyword_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeFloatKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:631:2: ( 'varchar(100)' )
                    {
                    // InternalSqlDsl.g:631:2: ( 'varchar(100)' )
                    // InternalSqlDsl.g:632:3: 'varchar(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeVarchar100Keyword_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeVarchar100Keyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:637:2: ( 'char(100)' )
                    {
                    // InternalSqlDsl.g:637:2: ( 'char(100)' )
                    // InternalSqlDsl.g:638:3: 'char(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeChar100Keyword_2_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeChar100Keyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:643:2: ( 'text' )
                    {
                    // InternalSqlDsl.g:643:2: ( 'text' )
                    // InternalSqlDsl.g:644:3: 'text'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeTextKeyword_2_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeTextKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:649:2: ( 'date' )
                    {
                    // InternalSqlDsl.g:649:2: ( 'date' )
                    // InternalSqlDsl.g:650:3: 'date'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeDateKeyword_2_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeDateKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSqlDsl.g:655:2: ( 'INT' )
                    {
                    // InternalSqlDsl.g:655:2: ( 'INT' )
                    // InternalSqlDsl.g:656:3: 'INT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeINTKeyword_2_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeINTKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSqlDsl.g:661:2: ( 'FLOAT' )
                    {
                    // InternalSqlDsl.g:661:2: ( 'FLOAT' )
                    // InternalSqlDsl.g:662:3: 'FLOAT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeFLOATKeyword_2_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeFLOATKeyword_2_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSqlDsl.g:667:2: ( 'VARCHAR(100)' )
                    {
                    // InternalSqlDsl.g:667:2: ( 'VARCHAR(100)' )
                    // InternalSqlDsl.g:668:3: 'VARCHAR(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeVARCHAR100Keyword_2_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeVARCHAR100Keyword_2_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSqlDsl.g:673:2: ( 'CHAR(100)' )
                    {
                    // InternalSqlDsl.g:673:2: ( 'CHAR(100)' )
                    // InternalSqlDsl.g:674:3: 'CHAR(100)'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeCHAR100Keyword_2_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeCHAR100Keyword_2_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSqlDsl.g:679:2: ( 'TEXT' )
                    {
                    // InternalSqlDsl.g:679:2: ( 'TEXT' )
                    // InternalSqlDsl.g:680:3: 'TEXT'
                    {
                     before(grammarAccess.getColumnOnCreationAccess().getTypeTEXTKeyword_2_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getColumnOnCreationAccess().getTypeTEXTKeyword_2_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSqlDsl.g:685:2: ( 'DATE' )
                    {
                    // InternalSqlDsl.g:685:2: ( 'DATE' )
                    // InternalSqlDsl.g:686:3: 'DATE'
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
    // InternalSqlDsl.g:695:1: rule__SqlProgram__Group__0 : rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 ;
    public final void rule__SqlProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:699:1: ( rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1 )
            // InternalSqlDsl.g:700:2: rule__SqlProgram__Group__0__Impl rule__SqlProgram__Group__1
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
    // InternalSqlDsl.g:707:1: rule__SqlProgram__Group__0__Impl : ( () ) ;
    public final void rule__SqlProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:711:1: ( ( () ) )
            // InternalSqlDsl.g:712:1: ( () )
            {
            // InternalSqlDsl.g:712:1: ( () )
            // InternalSqlDsl.g:713:2: ()
            {
             before(grammarAccess.getSqlProgramAccess().getSqlProgramAction_0()); 
            // InternalSqlDsl.g:714:2: ()
            // InternalSqlDsl.g:714:3: 
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
    // InternalSqlDsl.g:722:1: rule__SqlProgram__Group__1 : rule__SqlProgram__Group__1__Impl ;
    public final void rule__SqlProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:726:1: ( rule__SqlProgram__Group__1__Impl )
            // InternalSqlDsl.g:727:2: rule__SqlProgram__Group__1__Impl
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
    // InternalSqlDsl.g:733:1: rule__SqlProgram__Group__1__Impl : ( ( rule__SqlProgram__Group_1__0 )* ) ;
    public final void rule__SqlProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:737:1: ( ( ( rule__SqlProgram__Group_1__0 )* ) )
            // InternalSqlDsl.g:738:1: ( ( rule__SqlProgram__Group_1__0 )* )
            {
            // InternalSqlDsl.g:738:1: ( ( rule__SqlProgram__Group_1__0 )* )
            // InternalSqlDsl.g:739:2: ( rule__SqlProgram__Group_1__0 )*
            {
             before(grammarAccess.getSqlProgramAccess().getGroup_1()); 
            // InternalSqlDsl.g:740:2: ( rule__SqlProgram__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=26 && LA5_0<=27)||(LA5_0>=29 && LA5_0<=30)||LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSqlDsl.g:740:3: rule__SqlProgram__Group_1__0
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
    // InternalSqlDsl.g:749:1: rule__SqlProgram__Group_1__0 : rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 ;
    public final void rule__SqlProgram__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:753:1: ( rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1 )
            // InternalSqlDsl.g:754:2: rule__SqlProgram__Group_1__0__Impl rule__SqlProgram__Group_1__1
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
    // InternalSqlDsl.g:761:1: rule__SqlProgram__Group_1__0__Impl : ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) ;
    public final void rule__SqlProgram__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:765:1: ( ( ( rule__SqlProgram__QueriesAssignment_1_0 ) ) )
            // InternalSqlDsl.g:766:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            {
            // InternalSqlDsl.g:766:1: ( ( rule__SqlProgram__QueriesAssignment_1_0 ) )
            // InternalSqlDsl.g:767:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            {
             before(grammarAccess.getSqlProgramAccess().getQueriesAssignment_1_0()); 
            // InternalSqlDsl.g:768:2: ( rule__SqlProgram__QueriesAssignment_1_0 )
            // InternalSqlDsl.g:768:3: rule__SqlProgram__QueriesAssignment_1_0
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
    // InternalSqlDsl.g:776:1: rule__SqlProgram__Group_1__1 : rule__SqlProgram__Group_1__1__Impl ;
    public final void rule__SqlProgram__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:780:1: ( rule__SqlProgram__Group_1__1__Impl )
            // InternalSqlDsl.g:781:2: rule__SqlProgram__Group_1__1__Impl
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
    // InternalSqlDsl.g:787:1: rule__SqlProgram__Group_1__1__Impl : ( ';' ) ;
    public final void rule__SqlProgram__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:791:1: ( ( ';' ) )
            // InternalSqlDsl.g:792:1: ( ';' )
            {
            // InternalSqlDsl.g:792:1: ( ';' )
            // InternalSqlDsl.g:793:2: ';'
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


    // $ANTLR start "rule__QuickSelection__Group__0"
    // InternalSqlDsl.g:803:1: rule__QuickSelection__Group__0 : rule__QuickSelection__Group__0__Impl rule__QuickSelection__Group__1 ;
    public final void rule__QuickSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:807:1: ( rule__QuickSelection__Group__0__Impl rule__QuickSelection__Group__1 )
            // InternalSqlDsl.g:808:2: rule__QuickSelection__Group__0__Impl rule__QuickSelection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QuickSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__0"


    // $ANTLR start "rule__QuickSelection__Group__0__Impl"
    // InternalSqlDsl.g:815:1: rule__QuickSelection__Group__0__Impl : ( () ) ;
    public final void rule__QuickSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:819:1: ( ( () ) )
            // InternalSqlDsl.g:820:1: ( () )
            {
            // InternalSqlDsl.g:820:1: ( () )
            // InternalSqlDsl.g:821:2: ()
            {
             before(grammarAccess.getQuickSelectionAccess().getQuickSelectionAction_0()); 
            // InternalSqlDsl.g:822:2: ()
            // InternalSqlDsl.g:822:3: 
            {
            }

             after(grammarAccess.getQuickSelectionAccess().getQuickSelectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__0__Impl"


    // $ANTLR start "rule__QuickSelection__Group__1"
    // InternalSqlDsl.g:830:1: rule__QuickSelection__Group__1 : rule__QuickSelection__Group__1__Impl rule__QuickSelection__Group__2 ;
    public final void rule__QuickSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:834:1: ( rule__QuickSelection__Group__1__Impl rule__QuickSelection__Group__2 )
            // InternalSqlDsl.g:835:2: rule__QuickSelection__Group__1__Impl rule__QuickSelection__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__QuickSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__1"


    // $ANTLR start "rule__QuickSelection__Group__1__Impl"
    // InternalSqlDsl.g:842:1: rule__QuickSelection__Group__1__Impl : ( ( rule__QuickSelection__MethodAssignment_1 ) ) ;
    public final void rule__QuickSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:846:1: ( ( ( rule__QuickSelection__MethodAssignment_1 ) ) )
            // InternalSqlDsl.g:847:1: ( ( rule__QuickSelection__MethodAssignment_1 ) )
            {
            // InternalSqlDsl.g:847:1: ( ( rule__QuickSelection__MethodAssignment_1 ) )
            // InternalSqlDsl.g:848:2: ( rule__QuickSelection__MethodAssignment_1 )
            {
             before(grammarAccess.getQuickSelectionAccess().getMethodAssignment_1()); 
            // InternalSqlDsl.g:849:2: ( rule__QuickSelection__MethodAssignment_1 )
            // InternalSqlDsl.g:849:3: rule__QuickSelection__MethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__MethodAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuickSelectionAccess().getMethodAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__1__Impl"


    // $ANTLR start "rule__QuickSelection__Group__2"
    // InternalSqlDsl.g:857:1: rule__QuickSelection__Group__2 : rule__QuickSelection__Group__2__Impl rule__QuickSelection__Group__3 ;
    public final void rule__QuickSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:861:1: ( rule__QuickSelection__Group__2__Impl rule__QuickSelection__Group__3 )
            // InternalSqlDsl.g:862:2: rule__QuickSelection__Group__2__Impl rule__QuickSelection__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__QuickSelection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__2"


    // $ANTLR start "rule__QuickSelection__Group__2__Impl"
    // InternalSqlDsl.g:869:1: rule__QuickSelection__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__QuickSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:873:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:874:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:874:1: ( 'FROM' )
            // InternalSqlDsl.g:875:2: 'FROM'
            {
             before(grammarAccess.getQuickSelectionAccess().getFROMKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQuickSelectionAccess().getFROMKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__2__Impl"


    // $ANTLR start "rule__QuickSelection__Group__3"
    // InternalSqlDsl.g:884:1: rule__QuickSelection__Group__3 : rule__QuickSelection__Group__3__Impl rule__QuickSelection__Group__4 ;
    public final void rule__QuickSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:888:1: ( rule__QuickSelection__Group__3__Impl rule__QuickSelection__Group__4 )
            // InternalSqlDsl.g:889:2: rule__QuickSelection__Group__3__Impl rule__QuickSelection__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__QuickSelection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__3"


    // $ANTLR start "rule__QuickSelection__Group__3__Impl"
    // InternalSqlDsl.g:896:1: rule__QuickSelection__Group__3__Impl : ( ( rule__QuickSelection__ObjectsAssignment_3 ) ) ;
    public final void rule__QuickSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:900:1: ( ( ( rule__QuickSelection__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:901:1: ( ( rule__QuickSelection__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:901:1: ( ( rule__QuickSelection__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:902:2: ( rule__QuickSelection__ObjectsAssignment_3 )
            {
             before(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:903:2: ( rule__QuickSelection__ObjectsAssignment_3 )
            // InternalSqlDsl.g:903:3: rule__QuickSelection__ObjectsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__ObjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__3__Impl"


    // $ANTLR start "rule__QuickSelection__Group__4"
    // InternalSqlDsl.g:911:1: rule__QuickSelection__Group__4 : rule__QuickSelection__Group__4__Impl rule__QuickSelection__Group__5 ;
    public final void rule__QuickSelection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:915:1: ( rule__QuickSelection__Group__4__Impl rule__QuickSelection__Group__5 )
            // InternalSqlDsl.g:916:2: rule__QuickSelection__Group__4__Impl rule__QuickSelection__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__QuickSelection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__4"


    // $ANTLR start "rule__QuickSelection__Group__4__Impl"
    // InternalSqlDsl.g:923:1: rule__QuickSelection__Group__4__Impl : ( ( rule__QuickSelection__Group_4__0 )* ) ;
    public final void rule__QuickSelection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:927:1: ( ( ( rule__QuickSelection__Group_4__0 )* ) )
            // InternalSqlDsl.g:928:1: ( ( rule__QuickSelection__Group_4__0 )* )
            {
            // InternalSqlDsl.g:928:1: ( ( rule__QuickSelection__Group_4__0 )* )
            // InternalSqlDsl.g:929:2: ( rule__QuickSelection__Group_4__0 )*
            {
             before(grammarAccess.getQuickSelectionAccess().getGroup_4()); 
            // InternalSqlDsl.g:930:2: ( rule__QuickSelection__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSqlDsl.g:930:3: rule__QuickSelection__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuickSelection__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuickSelectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__4__Impl"


    // $ANTLR start "rule__QuickSelection__Group__5"
    // InternalSqlDsl.g:938:1: rule__QuickSelection__Group__5 : rule__QuickSelection__Group__5__Impl ;
    public final void rule__QuickSelection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:942:1: ( rule__QuickSelection__Group__5__Impl )
            // InternalSqlDsl.g:943:2: rule__QuickSelection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__5"


    // $ANTLR start "rule__QuickSelection__Group__5__Impl"
    // InternalSqlDsl.g:949:1: rule__QuickSelection__Group__5__Impl : ( ( rule__QuickSelection__ClausesAssignment_5 )* ) ;
    public final void rule__QuickSelection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:953:1: ( ( ( rule__QuickSelection__ClausesAssignment_5 )* ) )
            // InternalSqlDsl.g:954:1: ( ( rule__QuickSelection__ClausesAssignment_5 )* )
            {
            // InternalSqlDsl.g:954:1: ( ( rule__QuickSelection__ClausesAssignment_5 )* )
            // InternalSqlDsl.g:955:2: ( rule__QuickSelection__ClausesAssignment_5 )*
            {
             before(grammarAccess.getQuickSelectionAccess().getClausesAssignment_5()); 
            // InternalSqlDsl.g:956:2: ( rule__QuickSelection__ClausesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSqlDsl.g:956:3: rule__QuickSelection__ClausesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QuickSelection__ClausesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQuickSelectionAccess().getClausesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group__5__Impl"


    // $ANTLR start "rule__QuickSelection__Group_4__0"
    // InternalSqlDsl.g:965:1: rule__QuickSelection__Group_4__0 : rule__QuickSelection__Group_4__0__Impl rule__QuickSelection__Group_4__1 ;
    public final void rule__QuickSelection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:969:1: ( rule__QuickSelection__Group_4__0__Impl rule__QuickSelection__Group_4__1 )
            // InternalSqlDsl.g:970:2: rule__QuickSelection__Group_4__0__Impl rule__QuickSelection__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__QuickSelection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group_4__0"


    // $ANTLR start "rule__QuickSelection__Group_4__0__Impl"
    // InternalSqlDsl.g:977:1: rule__QuickSelection__Group_4__0__Impl : ( ',' ) ;
    public final void rule__QuickSelection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:981:1: ( ( ',' ) )
            // InternalSqlDsl.g:982:1: ( ',' )
            {
            // InternalSqlDsl.g:982:1: ( ',' )
            // InternalSqlDsl.g:983:2: ','
            {
             before(grammarAccess.getQuickSelectionAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQuickSelectionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group_4__0__Impl"


    // $ANTLR start "rule__QuickSelection__Group_4__1"
    // InternalSqlDsl.g:992:1: rule__QuickSelection__Group_4__1 : rule__QuickSelection__Group_4__1__Impl ;
    public final void rule__QuickSelection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:996:1: ( rule__QuickSelection__Group_4__1__Impl )
            // InternalSqlDsl.g:997:2: rule__QuickSelection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group_4__1"


    // $ANTLR start "rule__QuickSelection__Group_4__1__Impl"
    // InternalSqlDsl.g:1003:1: rule__QuickSelection__Group_4__1__Impl : ( ( rule__QuickSelection__ObjectsAssignment_4_1 ) ) ;
    public final void rule__QuickSelection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1007:1: ( ( ( rule__QuickSelection__ObjectsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:1008:1: ( ( rule__QuickSelection__ObjectsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:1008:1: ( ( rule__QuickSelection__ObjectsAssignment_4_1 ) )
            // InternalSqlDsl.g:1009:2: ( rule__QuickSelection__ObjectsAssignment_4_1 )
            {
             before(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_4_1()); 
            // InternalSqlDsl.g:1010:2: ( rule__QuickSelection__ObjectsAssignment_4_1 )
            // InternalSqlDsl.g:1010:3: rule__QuickSelection__ObjectsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QuickSelection__ObjectsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuickSelectionAccess().getObjectsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__Group_4__1__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // InternalSqlDsl.g:1019:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1023:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalSqlDsl.g:1024:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSqlDsl.g:1031:1: rule__Selection__Group__0__Impl : ( () ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1035:1: ( ( () ) )
            // InternalSqlDsl.g:1036:1: ( () )
            {
            // InternalSqlDsl.g:1036:1: ( () )
            // InternalSqlDsl.g:1037:2: ()
            {
             before(grammarAccess.getSelectionAccess().getSelectionAction_0()); 
            // InternalSqlDsl.g:1038:2: ()
            // InternalSqlDsl.g:1038:3: 
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
    // InternalSqlDsl.g:1046:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1050:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // InternalSqlDsl.g:1051:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
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
    // InternalSqlDsl.g:1058:1: rule__Selection__Group__1__Impl : ( 'SELECT' ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1062:1: ( ( 'SELECT' ) )
            // InternalSqlDsl.g:1063:1: ( 'SELECT' )
            {
            // InternalSqlDsl.g:1063:1: ( 'SELECT' )
            // InternalSqlDsl.g:1064:2: 'SELECT'
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
    // InternalSqlDsl.g:1073:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1077:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // InternalSqlDsl.g:1078:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1085:1: rule__Selection__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1089:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:1090:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:1090:1: ( 'FROM' )
            // InternalSqlDsl.g:1091:2: 'FROM'
            {
             before(grammarAccess.getSelectionAccess().getFROMKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSqlDsl.g:1100:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1104:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // InternalSqlDsl.g:1105:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:1112:1: rule__Selection__Group__3__Impl : ( ( rule__Selection__ObjectsAssignment_3 ) ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1116:1: ( ( ( rule__Selection__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1117:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1117:1: ( ( rule__Selection__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1118:2: ( rule__Selection__ObjectsAssignment_3 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1119:2: ( rule__Selection__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1119:3: rule__Selection__ObjectsAssignment_3
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
    // InternalSqlDsl.g:1127:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1131:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // InternalSqlDsl.g:1132:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalSqlDsl.g:1139:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__Group_4__0 )* ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1143:1: ( ( ( rule__Selection__Group_4__0 )* ) )
            // InternalSqlDsl.g:1144:1: ( ( rule__Selection__Group_4__0 )* )
            {
            // InternalSqlDsl.g:1144:1: ( ( rule__Selection__Group_4__0 )* )
            // InternalSqlDsl.g:1145:2: ( rule__Selection__Group_4__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_4()); 
            // InternalSqlDsl.g:1146:2: ( rule__Selection__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlDsl.g:1146:3: rule__Selection__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Selection__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalSqlDsl.g:1154:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1158:1: ( rule__Selection__Group__5__Impl )
            // InternalSqlDsl.g:1159:2: rule__Selection__Group__5__Impl
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
    // InternalSqlDsl.g:1165:1: rule__Selection__Group__5__Impl : ( ( rule__Selection__ClausesAssignment_5 )* ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1169:1: ( ( ( rule__Selection__ClausesAssignment_5 )* ) )
            // InternalSqlDsl.g:1170:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            {
            // InternalSqlDsl.g:1170:1: ( ( rule__Selection__ClausesAssignment_5 )* )
            // InternalSqlDsl.g:1171:2: ( rule__Selection__ClausesAssignment_5 )*
            {
             before(grammarAccess.getSelectionAccess().getClausesAssignment_5()); 
            // InternalSqlDsl.g:1172:2: ( rule__Selection__ClausesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:1172:3: rule__Selection__ClausesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Selection__ClausesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSqlDsl.g:1181:1: rule__Selection__Group_4__0 : rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 ;
    public final void rule__Selection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1185:1: ( rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1 )
            // InternalSqlDsl.g:1186:2: rule__Selection__Group_4__0__Impl rule__Selection__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1193:1: rule__Selection__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1197:1: ( ( ',' ) )
            // InternalSqlDsl.g:1198:1: ( ',' )
            {
            // InternalSqlDsl.g:1198:1: ( ',' )
            // InternalSqlDsl.g:1199:2: ','
            {
             before(grammarAccess.getSelectionAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:1208:1: rule__Selection__Group_4__1 : rule__Selection__Group_4__1__Impl ;
    public final void rule__Selection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1212:1: ( rule__Selection__Group_4__1__Impl )
            // InternalSqlDsl.g:1213:2: rule__Selection__Group_4__1__Impl
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
    // InternalSqlDsl.g:1219:1: rule__Selection__Group_4__1__Impl : ( ( rule__Selection__ObjectsAssignment_4_1 ) ) ;
    public final void rule__Selection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1223:1: ( ( ( rule__Selection__ObjectsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:1224:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:1224:1: ( ( rule__Selection__ObjectsAssignment_4_1 ) )
            // InternalSqlDsl.g:1225:2: ( rule__Selection__ObjectsAssignment_4_1 )
            {
             before(grammarAccess.getSelectionAccess().getObjectsAssignment_4_1()); 
            // InternalSqlDsl.g:1226:2: ( rule__Selection__ObjectsAssignment_4_1 )
            // InternalSqlDsl.g:1226:3: rule__Selection__ObjectsAssignment_4_1
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
    // InternalSqlDsl.g:1235:1: rule__Creation__Group__0 : rule__Creation__Group__0__Impl rule__Creation__Group__1 ;
    public final void rule__Creation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1239:1: ( rule__Creation__Group__0__Impl rule__Creation__Group__1 )
            // InternalSqlDsl.g:1240:2: rule__Creation__Group__0__Impl rule__Creation__Group__1
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
    // InternalSqlDsl.g:1247:1: rule__Creation__Group__0__Impl : ( () ) ;
    public final void rule__Creation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1251:1: ( ( () ) )
            // InternalSqlDsl.g:1252:1: ( () )
            {
            // InternalSqlDsl.g:1252:1: ( () )
            // InternalSqlDsl.g:1253:2: ()
            {
             before(grammarAccess.getCreationAccess().getCreationAction_0()); 
            // InternalSqlDsl.g:1254:2: ()
            // InternalSqlDsl.g:1254:3: 
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
    // InternalSqlDsl.g:1262:1: rule__Creation__Group__1 : rule__Creation__Group__1__Impl rule__Creation__Group__2 ;
    public final void rule__Creation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1266:1: ( rule__Creation__Group__1__Impl rule__Creation__Group__2 )
            // InternalSqlDsl.g:1267:2: rule__Creation__Group__1__Impl rule__Creation__Group__2
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
    // InternalSqlDsl.g:1274:1: rule__Creation__Group__1__Impl : ( 'CREATE' ) ;
    public final void rule__Creation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1278:1: ( ( 'CREATE' ) )
            // InternalSqlDsl.g:1279:1: ( 'CREATE' )
            {
            // InternalSqlDsl.g:1279:1: ( 'CREATE' )
            // InternalSqlDsl.g:1280:2: 'CREATE'
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
    // InternalSqlDsl.g:1289:1: rule__Creation__Group__2 : rule__Creation__Group__2__Impl ;
    public final void rule__Creation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1293:1: ( rule__Creation__Group__2__Impl )
            // InternalSqlDsl.g:1294:2: rule__Creation__Group__2__Impl
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
    // InternalSqlDsl.g:1300:1: rule__Creation__Group__2__Impl : ( ( rule__Creation__Alternatives_2 ) ) ;
    public final void rule__Creation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1304:1: ( ( ( rule__Creation__Alternatives_2 ) ) )
            // InternalSqlDsl.g:1305:1: ( ( rule__Creation__Alternatives_2 ) )
            {
            // InternalSqlDsl.g:1305:1: ( ( rule__Creation__Alternatives_2 ) )
            // InternalSqlDsl.g:1306:2: ( rule__Creation__Alternatives_2 )
            {
             before(grammarAccess.getCreationAccess().getAlternatives_2()); 
            // InternalSqlDsl.g:1307:2: ( rule__Creation__Alternatives_2 )
            // InternalSqlDsl.g:1307:3: rule__Creation__Alternatives_2
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
    // InternalSqlDsl.g:1316:1: rule__Creation__Group_2_0__0 : rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 ;
    public final void rule__Creation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1320:1: ( rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1 )
            // InternalSqlDsl.g:1321:2: rule__Creation__Group_2_0__0__Impl rule__Creation__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1328:1: rule__Creation__Group_2_0__0__Impl : ( ( rule__Creation__TypeAssignment_2_0_0 ) ) ;
    public final void rule__Creation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1332:1: ( ( ( rule__Creation__TypeAssignment_2_0_0 ) ) )
            // InternalSqlDsl.g:1333:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            {
            // InternalSqlDsl.g:1333:1: ( ( rule__Creation__TypeAssignment_2_0_0 ) )
            // InternalSqlDsl.g:1334:2: ( rule__Creation__TypeAssignment_2_0_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_0_0()); 
            // InternalSqlDsl.g:1335:2: ( rule__Creation__TypeAssignment_2_0_0 )
            // InternalSqlDsl.g:1335:3: rule__Creation__TypeAssignment_2_0_0
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
    // InternalSqlDsl.g:1343:1: rule__Creation__Group_2_0__1 : rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 ;
    public final void rule__Creation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1347:1: ( rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2 )
            // InternalSqlDsl.g:1348:2: rule__Creation__Group_2_0__1__Impl rule__Creation__Group_2_0__2
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
    // InternalSqlDsl.g:1355:1: rule__Creation__Group_2_0__1__Impl : ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) ;
    public final void rule__Creation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1359:1: ( ( ( rule__Creation__ObjectsAssignment_2_0_1 ) ) )
            // InternalSqlDsl.g:1360:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            {
            // InternalSqlDsl.g:1360:1: ( ( rule__Creation__ObjectsAssignment_2_0_1 ) )
            // InternalSqlDsl.g:1361:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_0_1()); 
            // InternalSqlDsl.g:1362:2: ( rule__Creation__ObjectsAssignment_2_0_1 )
            // InternalSqlDsl.g:1362:3: rule__Creation__ObjectsAssignment_2_0_1
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
    // InternalSqlDsl.g:1370:1: rule__Creation__Group_2_0__2 : rule__Creation__Group_2_0__2__Impl ;
    public final void rule__Creation__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1374:1: ( rule__Creation__Group_2_0__2__Impl )
            // InternalSqlDsl.g:1375:2: rule__Creation__Group_2_0__2__Impl
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
    // InternalSqlDsl.g:1381:1: rule__Creation__Group_2_0__2__Impl : ( ( rule__Creation__Group_2_0_2__0 )? ) ;
    public final void rule__Creation__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1385:1: ( ( ( rule__Creation__Group_2_0_2__0 )? ) )
            // InternalSqlDsl.g:1386:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            {
            // InternalSqlDsl.g:1386:1: ( ( rule__Creation__Group_2_0_2__0 )? )
            // InternalSqlDsl.g:1387:2: ( rule__Creation__Group_2_0_2__0 )?
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2()); 
            // InternalSqlDsl.g:1388:2: ( rule__Creation__Group_2_0_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSqlDsl.g:1388:3: rule__Creation__Group_2_0_2__0
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
    // InternalSqlDsl.g:1397:1: rule__Creation__Group_2_0_2__0 : rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 ;
    public final void rule__Creation__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1401:1: ( rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1 )
            // InternalSqlDsl.g:1402:2: rule__Creation__Group_2_0_2__0__Impl rule__Creation__Group_2_0_2__1
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
    // InternalSqlDsl.g:1409:1: rule__Creation__Group_2_0_2__0__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) ;
    public final void rule__Creation__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1413:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) ) )
            // InternalSqlDsl.g:1414:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            {
            // InternalSqlDsl.g:1414:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_0 ) )
            // InternalSqlDsl.g:1415:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_0()); 
            // InternalSqlDsl.g:1416:2: ( rule__Creation__ConstaintsAssignment_2_0_2_0 )
            // InternalSqlDsl.g:1416:3: rule__Creation__ConstaintsAssignment_2_0_2_0
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
    // InternalSqlDsl.g:1424:1: rule__Creation__Group_2_0_2__1 : rule__Creation__Group_2_0_2__1__Impl ;
    public final void rule__Creation__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1428:1: ( rule__Creation__Group_2_0_2__1__Impl )
            // InternalSqlDsl.g:1429:2: rule__Creation__Group_2_0_2__1__Impl
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
    // InternalSqlDsl.g:1435:1: rule__Creation__Group_2_0_2__1__Impl : ( ( rule__Creation__Group_2_0_2_1__0 )* ) ;
    public final void rule__Creation__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1439:1: ( ( ( rule__Creation__Group_2_0_2_1__0 )* ) )
            // InternalSqlDsl.g:1440:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            {
            // InternalSqlDsl.g:1440:1: ( ( rule__Creation__Group_2_0_2_1__0 )* )
            // InternalSqlDsl.g:1441:2: ( rule__Creation__Group_2_0_2_1__0 )*
            {
             before(grammarAccess.getCreationAccess().getGroup_2_0_2_1()); 
            // InternalSqlDsl.g:1442:2: ( rule__Creation__Group_2_0_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSqlDsl.g:1442:3: rule__Creation__Group_2_0_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Creation__Group_2_0_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSqlDsl.g:1451:1: rule__Creation__Group_2_0_2_1__0 : rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 ;
    public final void rule__Creation__Group_2_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1455:1: ( rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1 )
            // InternalSqlDsl.g:1456:2: rule__Creation__Group_2_0_2_1__0__Impl rule__Creation__Group_2_0_2_1__1
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
    // InternalSqlDsl.g:1463:1: rule__Creation__Group_2_0_2_1__0__Impl : ( ',' ) ;
    public final void rule__Creation__Group_2_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1467:1: ( ( ',' ) )
            // InternalSqlDsl.g:1468:1: ( ',' )
            {
            // InternalSqlDsl.g:1468:1: ( ',' )
            // InternalSqlDsl.g:1469:2: ','
            {
             before(grammarAccess.getCreationAccess().getCommaKeyword_2_0_2_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:1478:1: rule__Creation__Group_2_0_2_1__1 : rule__Creation__Group_2_0_2_1__1__Impl ;
    public final void rule__Creation__Group_2_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1482:1: ( rule__Creation__Group_2_0_2_1__1__Impl )
            // InternalSqlDsl.g:1483:2: rule__Creation__Group_2_0_2_1__1__Impl
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
    // InternalSqlDsl.g:1489:1: rule__Creation__Group_2_0_2_1__1__Impl : ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) ;
    public final void rule__Creation__Group_2_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1493:1: ( ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) ) )
            // InternalSqlDsl.g:1494:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            {
            // InternalSqlDsl.g:1494:1: ( ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 ) )
            // InternalSqlDsl.g:1495:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            {
             before(grammarAccess.getCreationAccess().getConstaintsAssignment_2_0_2_1_1()); 
            // InternalSqlDsl.g:1496:2: ( rule__Creation__ConstaintsAssignment_2_0_2_1_1 )
            // InternalSqlDsl.g:1496:3: rule__Creation__ConstaintsAssignment_2_0_2_1_1
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
    // InternalSqlDsl.g:1505:1: rule__Creation__Group_2_1__0 : rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 ;
    public final void rule__Creation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1509:1: ( rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1 )
            // InternalSqlDsl.g:1510:2: rule__Creation__Group_2_1__0__Impl rule__Creation__Group_2_1__1
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
    // InternalSqlDsl.g:1517:1: rule__Creation__Group_2_1__0__Impl : ( ( rule__Creation__TypeAssignment_2_1_0 ) ) ;
    public final void rule__Creation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1521:1: ( ( ( rule__Creation__TypeAssignment_2_1_0 ) ) )
            // InternalSqlDsl.g:1522:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            {
            // InternalSqlDsl.g:1522:1: ( ( rule__Creation__TypeAssignment_2_1_0 ) )
            // InternalSqlDsl.g:1523:2: ( rule__Creation__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getCreationAccess().getTypeAssignment_2_1_0()); 
            // InternalSqlDsl.g:1524:2: ( rule__Creation__TypeAssignment_2_1_0 )
            // InternalSqlDsl.g:1524:3: rule__Creation__TypeAssignment_2_1_0
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
    // InternalSqlDsl.g:1532:1: rule__Creation__Group_2_1__1 : rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2 ;
    public final void rule__Creation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1536:1: ( rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2 )
            // InternalSqlDsl.g:1537:2: rule__Creation__Group_2_1__1__Impl rule__Creation__Group_2_1__2
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
    // InternalSqlDsl.g:1544:1: rule__Creation__Group_2_1__1__Impl : ( ( rule__Creation__NameAssignment_2_1_1 )? ) ;
    public final void rule__Creation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1548:1: ( ( ( rule__Creation__NameAssignment_2_1_1 )? ) )
            // InternalSqlDsl.g:1549:1: ( ( rule__Creation__NameAssignment_2_1_1 )? )
            {
            // InternalSqlDsl.g:1549:1: ( ( rule__Creation__NameAssignment_2_1_1 )? )
            // InternalSqlDsl.g:1550:2: ( rule__Creation__NameAssignment_2_1_1 )?
            {
             before(grammarAccess.getCreationAccess().getNameAssignment_2_1_1()); 
            // InternalSqlDsl.g:1551:2: ( rule__Creation__NameAssignment_2_1_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlDsl.g:1551:3: rule__Creation__NameAssignment_2_1_1
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
    // InternalSqlDsl.g:1559:1: rule__Creation__Group_2_1__2 : rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3 ;
    public final void rule__Creation__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1563:1: ( rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3 )
            // InternalSqlDsl.g:1564:2: rule__Creation__Group_2_1__2__Impl rule__Creation__Group_2_1__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1571:1: rule__Creation__Group_2_1__2__Impl : ( 'ON' ) ;
    public final void rule__Creation__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1575:1: ( ( 'ON' ) )
            // InternalSqlDsl.g:1576:1: ( 'ON' )
            {
            // InternalSqlDsl.g:1576:1: ( 'ON' )
            // InternalSqlDsl.g:1577:2: 'ON'
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
    // InternalSqlDsl.g:1586:1: rule__Creation__Group_2_1__3 : rule__Creation__Group_2_1__3__Impl ;
    public final void rule__Creation__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1590:1: ( rule__Creation__Group_2_1__3__Impl )
            // InternalSqlDsl.g:1591:2: rule__Creation__Group_2_1__3__Impl
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
    // InternalSqlDsl.g:1597:1: rule__Creation__Group_2_1__3__Impl : ( ( rule__Creation__ObjectsAssignment_2_1_3 ) ) ;
    public final void rule__Creation__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1601:1: ( ( ( rule__Creation__ObjectsAssignment_2_1_3 ) ) )
            // InternalSqlDsl.g:1602:1: ( ( rule__Creation__ObjectsAssignment_2_1_3 ) )
            {
            // InternalSqlDsl.g:1602:1: ( ( rule__Creation__ObjectsAssignment_2_1_3 ) )
            // InternalSqlDsl.g:1603:2: ( rule__Creation__ObjectsAssignment_2_1_3 )
            {
             before(grammarAccess.getCreationAccess().getObjectsAssignment_2_1_3()); 
            // InternalSqlDsl.g:1604:2: ( rule__Creation__ObjectsAssignment_2_1_3 )
            // InternalSqlDsl.g:1604:3: rule__Creation__ObjectsAssignment_2_1_3
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
    // InternalSqlDsl.g:1613:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1617:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalSqlDsl.g:1618:2: rule__Update__Group__0__Impl rule__Update__Group__1
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
    // InternalSqlDsl.g:1625:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1629:1: ( ( () ) )
            // InternalSqlDsl.g:1630:1: ( () )
            {
            // InternalSqlDsl.g:1630:1: ( () )
            // InternalSqlDsl.g:1631:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalSqlDsl.g:1632:2: ()
            // InternalSqlDsl.g:1632:3: 
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
    // InternalSqlDsl.g:1640:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1644:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalSqlDsl.g:1645:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1652:1: rule__Update__Group__1__Impl : ( 'UPDATE' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1656:1: ( ( 'UPDATE' ) )
            // InternalSqlDsl.g:1657:1: ( 'UPDATE' )
            {
            // InternalSqlDsl.g:1657:1: ( 'UPDATE' )
            // InternalSqlDsl.g:1658:2: 'UPDATE'
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
    // InternalSqlDsl.g:1667:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1671:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalSqlDsl.g:1672:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1679:1: rule__Update__Group__2__Impl : ( ( rule__Update__ObjectsAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1683:1: ( ( ( rule__Update__ObjectsAssignment_2 ) ) )
            // InternalSqlDsl.g:1684:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            {
            // InternalSqlDsl.g:1684:1: ( ( rule__Update__ObjectsAssignment_2 ) )
            // InternalSqlDsl.g:1685:2: ( rule__Update__ObjectsAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getObjectsAssignment_2()); 
            // InternalSqlDsl.g:1686:2: ( rule__Update__ObjectsAssignment_2 )
            // InternalSqlDsl.g:1686:3: rule__Update__ObjectsAssignment_2
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
    // InternalSqlDsl.g:1694:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1698:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalSqlDsl.g:1699:2: rule__Update__Group__3__Impl rule__Update__Group__4
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
    // InternalSqlDsl.g:1706:1: rule__Update__Group__3__Impl : ( ( rule__Update__ClausesAssignment_3 ) ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1710:1: ( ( ( rule__Update__ClausesAssignment_3 ) ) )
            // InternalSqlDsl.g:1711:1: ( ( rule__Update__ClausesAssignment_3 ) )
            {
            // InternalSqlDsl.g:1711:1: ( ( rule__Update__ClausesAssignment_3 ) )
            // InternalSqlDsl.g:1712:2: ( rule__Update__ClausesAssignment_3 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_3()); 
            // InternalSqlDsl.g:1713:2: ( rule__Update__ClausesAssignment_3 )
            // InternalSqlDsl.g:1713:3: rule__Update__ClausesAssignment_3
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
    // InternalSqlDsl.g:1721:1: rule__Update__Group__4 : rule__Update__Group__4__Impl ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1725:1: ( rule__Update__Group__4__Impl )
            // InternalSqlDsl.g:1726:2: rule__Update__Group__4__Impl
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
    // InternalSqlDsl.g:1732:1: rule__Update__Group__4__Impl : ( ( rule__Update__Group_4__0 )* ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1736:1: ( ( ( rule__Update__Group_4__0 )* ) )
            // InternalSqlDsl.g:1737:1: ( ( rule__Update__Group_4__0 )* )
            {
            // InternalSqlDsl.g:1737:1: ( ( rule__Update__Group_4__0 )* )
            // InternalSqlDsl.g:1738:2: ( rule__Update__Group_4__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_4()); 
            // InternalSqlDsl.g:1739:2: ( rule__Update__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSqlDsl.g:1739:3: rule__Update__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Update__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSqlDsl.g:1748:1: rule__Update__Group_4__0 : rule__Update__Group_4__0__Impl rule__Update__Group_4__1 ;
    public final void rule__Update__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1752:1: ( rule__Update__Group_4__0__Impl rule__Update__Group_4__1 )
            // InternalSqlDsl.g:1753:2: rule__Update__Group_4__0__Impl rule__Update__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1760:1: rule__Update__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1764:1: ( ( ',' ) )
            // InternalSqlDsl.g:1765:1: ( ',' )
            {
            // InternalSqlDsl.g:1765:1: ( ',' )
            // InternalSqlDsl.g:1766:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:1775:1: rule__Update__Group_4__1 : rule__Update__Group_4__1__Impl ;
    public final void rule__Update__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1779:1: ( rule__Update__Group_4__1__Impl )
            // InternalSqlDsl.g:1780:2: rule__Update__Group_4__1__Impl
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
    // InternalSqlDsl.g:1786:1: rule__Update__Group_4__1__Impl : ( ( rule__Update__ClausesAssignment_4_1 ) ) ;
    public final void rule__Update__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1790:1: ( ( ( rule__Update__ClausesAssignment_4_1 ) ) )
            // InternalSqlDsl.g:1791:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:1791:1: ( ( rule__Update__ClausesAssignment_4_1 ) )
            // InternalSqlDsl.g:1792:2: ( rule__Update__ClausesAssignment_4_1 )
            {
             before(grammarAccess.getUpdateAccess().getClausesAssignment_4_1()); 
            // InternalSqlDsl.g:1793:2: ( rule__Update__ClausesAssignment_4_1 )
            // InternalSqlDsl.g:1793:3: rule__Update__ClausesAssignment_4_1
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
    // InternalSqlDsl.g:1802:1: rule__Insertion__Group__0 : rule__Insertion__Group__0__Impl rule__Insertion__Group__1 ;
    public final void rule__Insertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1806:1: ( rule__Insertion__Group__0__Impl rule__Insertion__Group__1 )
            // InternalSqlDsl.g:1807:2: rule__Insertion__Group__0__Impl rule__Insertion__Group__1
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
    // InternalSqlDsl.g:1814:1: rule__Insertion__Group__0__Impl : ( () ) ;
    public final void rule__Insertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1818:1: ( ( () ) )
            // InternalSqlDsl.g:1819:1: ( () )
            {
            // InternalSqlDsl.g:1819:1: ( () )
            // InternalSqlDsl.g:1820:2: ()
            {
             before(grammarAccess.getInsertionAccess().getInsertionAction_0()); 
            // InternalSqlDsl.g:1821:2: ()
            // InternalSqlDsl.g:1821:3: 
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
    // InternalSqlDsl.g:1829:1: rule__Insertion__Group__1 : rule__Insertion__Group__1__Impl rule__Insertion__Group__2 ;
    public final void rule__Insertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1833:1: ( rule__Insertion__Group__1__Impl rule__Insertion__Group__2 )
            // InternalSqlDsl.g:1834:2: rule__Insertion__Group__1__Impl rule__Insertion__Group__2
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
    // InternalSqlDsl.g:1841:1: rule__Insertion__Group__1__Impl : ( 'INSERT' ) ;
    public final void rule__Insertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1845:1: ( ( 'INSERT' ) )
            // InternalSqlDsl.g:1846:1: ( 'INSERT' )
            {
            // InternalSqlDsl.g:1846:1: ( 'INSERT' )
            // InternalSqlDsl.g:1847:2: 'INSERT'
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
    // InternalSqlDsl.g:1856:1: rule__Insertion__Group__2 : rule__Insertion__Group__2__Impl rule__Insertion__Group__3 ;
    public final void rule__Insertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1860:1: ( rule__Insertion__Group__2__Impl rule__Insertion__Group__3 )
            // InternalSqlDsl.g:1861:2: rule__Insertion__Group__2__Impl rule__Insertion__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:1868:1: rule__Insertion__Group__2__Impl : ( 'INTO' ) ;
    public final void rule__Insertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1872:1: ( ( 'INTO' ) )
            // InternalSqlDsl.g:1873:1: ( 'INTO' )
            {
            // InternalSqlDsl.g:1873:1: ( 'INTO' )
            // InternalSqlDsl.g:1874:2: 'INTO'
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
    // InternalSqlDsl.g:1883:1: rule__Insertion__Group__3 : rule__Insertion__Group__3__Impl rule__Insertion__Group__4 ;
    public final void rule__Insertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1887:1: ( rule__Insertion__Group__3__Impl rule__Insertion__Group__4 )
            // InternalSqlDsl.g:1888:2: rule__Insertion__Group__3__Impl rule__Insertion__Group__4
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
    // InternalSqlDsl.g:1895:1: rule__Insertion__Group__3__Impl : ( ( rule__Insertion__ObjectsAssignment_3 ) ) ;
    public final void rule__Insertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1899:1: ( ( ( rule__Insertion__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:1900:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:1900:1: ( ( rule__Insertion__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:1901:2: ( rule__Insertion__ObjectsAssignment_3 )
            {
             before(grammarAccess.getInsertionAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:1902:2: ( rule__Insertion__ObjectsAssignment_3 )
            // InternalSqlDsl.g:1902:3: rule__Insertion__ObjectsAssignment_3
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
    // InternalSqlDsl.g:1910:1: rule__Insertion__Group__4 : rule__Insertion__Group__4__Impl rule__Insertion__Group__5 ;
    public final void rule__Insertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1914:1: ( rule__Insertion__Group__4__Impl rule__Insertion__Group__5 )
            // InternalSqlDsl.g:1915:2: rule__Insertion__Group__4__Impl rule__Insertion__Group__5
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
    // InternalSqlDsl.g:1922:1: rule__Insertion__Group__4__Impl : ( 'VALUES' ) ;
    public final void rule__Insertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1926:1: ( ( 'VALUES' ) )
            // InternalSqlDsl.g:1927:1: ( 'VALUES' )
            {
            // InternalSqlDsl.g:1927:1: ( 'VALUES' )
            // InternalSqlDsl.g:1928:2: 'VALUES'
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
    // InternalSqlDsl.g:1937:1: rule__Insertion__Group__5 : rule__Insertion__Group__5__Impl rule__Insertion__Group__6 ;
    public final void rule__Insertion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1941:1: ( rule__Insertion__Group__5__Impl rule__Insertion__Group__6 )
            // InternalSqlDsl.g:1942:2: rule__Insertion__Group__5__Impl rule__Insertion__Group__6
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
    // InternalSqlDsl.g:1949:1: rule__Insertion__Group__5__Impl : ( '{' ) ;
    public final void rule__Insertion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1953:1: ( ( '{' ) )
            // InternalSqlDsl.g:1954:1: ( '{' )
            {
            // InternalSqlDsl.g:1954:1: ( '{' )
            // InternalSqlDsl.g:1955:2: '{'
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
    // InternalSqlDsl.g:1964:1: rule__Insertion__Group__6 : rule__Insertion__Group__6__Impl rule__Insertion__Group__7 ;
    public final void rule__Insertion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1968:1: ( rule__Insertion__Group__6__Impl rule__Insertion__Group__7 )
            // InternalSqlDsl.g:1969:2: rule__Insertion__Group__6__Impl rule__Insertion__Group__7
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
    // InternalSqlDsl.g:1976:1: rule__Insertion__Group__6__Impl : ( ( rule__Insertion__ValuesAssignment_6 ) ) ;
    public final void rule__Insertion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1980:1: ( ( ( rule__Insertion__ValuesAssignment_6 ) ) )
            // InternalSqlDsl.g:1981:1: ( ( rule__Insertion__ValuesAssignment_6 ) )
            {
            // InternalSqlDsl.g:1981:1: ( ( rule__Insertion__ValuesAssignment_6 ) )
            // InternalSqlDsl.g:1982:2: ( rule__Insertion__ValuesAssignment_6 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_6()); 
            // InternalSqlDsl.g:1983:2: ( rule__Insertion__ValuesAssignment_6 )
            // InternalSqlDsl.g:1983:3: rule__Insertion__ValuesAssignment_6
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
    // InternalSqlDsl.g:1991:1: rule__Insertion__Group__7 : rule__Insertion__Group__7__Impl rule__Insertion__Group__8 ;
    public final void rule__Insertion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:1995:1: ( rule__Insertion__Group__7__Impl rule__Insertion__Group__8 )
            // InternalSqlDsl.g:1996:2: rule__Insertion__Group__7__Impl rule__Insertion__Group__8
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
    // InternalSqlDsl.g:2003:1: rule__Insertion__Group__7__Impl : ( ( rule__Insertion__Group_7__0 )* ) ;
    public final void rule__Insertion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2007:1: ( ( ( rule__Insertion__Group_7__0 )* ) )
            // InternalSqlDsl.g:2008:1: ( ( rule__Insertion__Group_7__0 )* )
            {
            // InternalSqlDsl.g:2008:1: ( ( rule__Insertion__Group_7__0 )* )
            // InternalSqlDsl.g:2009:2: ( rule__Insertion__Group_7__0 )*
            {
             before(grammarAccess.getInsertionAccess().getGroup_7()); 
            // InternalSqlDsl.g:2010:2: ( rule__Insertion__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSqlDsl.g:2010:3: rule__Insertion__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Insertion__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSqlDsl.g:2018:1: rule__Insertion__Group__8 : rule__Insertion__Group__8__Impl ;
    public final void rule__Insertion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2022:1: ( rule__Insertion__Group__8__Impl )
            // InternalSqlDsl.g:2023:2: rule__Insertion__Group__8__Impl
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
    // InternalSqlDsl.g:2029:1: rule__Insertion__Group__8__Impl : ( '}' ) ;
    public final void rule__Insertion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2033:1: ( ( '}' ) )
            // InternalSqlDsl.g:2034:1: ( '}' )
            {
            // InternalSqlDsl.g:2034:1: ( '}' )
            // InternalSqlDsl.g:2035:2: '}'
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
    // InternalSqlDsl.g:2045:1: rule__Insertion__Group_7__0 : rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1 ;
    public final void rule__Insertion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2049:1: ( rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1 )
            // InternalSqlDsl.g:2050:2: rule__Insertion__Group_7__0__Impl rule__Insertion__Group_7__1
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
    // InternalSqlDsl.g:2057:1: rule__Insertion__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Insertion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2061:1: ( ( ',' ) )
            // InternalSqlDsl.g:2062:1: ( ',' )
            {
            // InternalSqlDsl.g:2062:1: ( ',' )
            // InternalSqlDsl.g:2063:2: ','
            {
             before(grammarAccess.getInsertionAccess().getCommaKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:2072:1: rule__Insertion__Group_7__1 : rule__Insertion__Group_7__1__Impl ;
    public final void rule__Insertion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2076:1: ( rule__Insertion__Group_7__1__Impl )
            // InternalSqlDsl.g:2077:2: rule__Insertion__Group_7__1__Impl
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
    // InternalSqlDsl.g:2083:1: rule__Insertion__Group_7__1__Impl : ( ( rule__Insertion__ValuesAssignment_7_1 ) ) ;
    public final void rule__Insertion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2087:1: ( ( ( rule__Insertion__ValuesAssignment_7_1 ) ) )
            // InternalSqlDsl.g:2088:1: ( ( rule__Insertion__ValuesAssignment_7_1 ) )
            {
            // InternalSqlDsl.g:2088:1: ( ( rule__Insertion__ValuesAssignment_7_1 ) )
            // InternalSqlDsl.g:2089:2: ( rule__Insertion__ValuesAssignment_7_1 )
            {
             before(grammarAccess.getInsertionAccess().getValuesAssignment_7_1()); 
            // InternalSqlDsl.g:2090:2: ( rule__Insertion__ValuesAssignment_7_1 )
            // InternalSqlDsl.g:2090:3: rule__Insertion__ValuesAssignment_7_1
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
    // InternalSqlDsl.g:2099:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2103:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalSqlDsl.g:2104:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
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
    // InternalSqlDsl.g:2111:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2115:1: ( ( () ) )
            // InternalSqlDsl.g:2116:1: ( () )
            {
            // InternalSqlDsl.g:2116:1: ( () )
            // InternalSqlDsl.g:2117:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalSqlDsl.g:2118:2: ()
            // InternalSqlDsl.g:2118:3: 
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
    // InternalSqlDsl.g:2126:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2130:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalSqlDsl.g:2131:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
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
    // InternalSqlDsl.g:2138:1: rule__Delete__Group__1__Impl : ( 'DELETE' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2142:1: ( ( 'DELETE' ) )
            // InternalSqlDsl.g:2143:1: ( 'DELETE' )
            {
            // InternalSqlDsl.g:2143:1: ( 'DELETE' )
            // InternalSqlDsl.g:2144:2: 'DELETE'
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
    // InternalSqlDsl.g:2153:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2157:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalSqlDsl.g:2158:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2165:1: rule__Delete__Group__2__Impl : ( 'FROM' ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2169:1: ( ( 'FROM' ) )
            // InternalSqlDsl.g:2170:1: ( 'FROM' )
            {
            // InternalSqlDsl.g:2170:1: ( 'FROM' )
            // InternalSqlDsl.g:2171:2: 'FROM'
            {
             before(grammarAccess.getDeleteAccess().getFROMKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSqlDsl.g:2180:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2184:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalSqlDsl.g:2185:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2192:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__ObjectsAssignment_3 ) ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2196:1: ( ( ( rule__Delete__ObjectsAssignment_3 ) ) )
            // InternalSqlDsl.g:2197:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            {
            // InternalSqlDsl.g:2197:1: ( ( rule__Delete__ObjectsAssignment_3 ) )
            // InternalSqlDsl.g:2198:2: ( rule__Delete__ObjectsAssignment_3 )
            {
             before(grammarAccess.getDeleteAccess().getObjectsAssignment_3()); 
            // InternalSqlDsl.g:2199:2: ( rule__Delete__ObjectsAssignment_3 )
            // InternalSqlDsl.g:2199:3: rule__Delete__ObjectsAssignment_3
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
    // InternalSqlDsl.g:2207:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2211:1: ( rule__Delete__Group__4__Impl )
            // InternalSqlDsl.g:2212:2: rule__Delete__Group__4__Impl
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
    // InternalSqlDsl.g:2218:1: rule__Delete__Group__4__Impl : ( ( rule__Delete__Group_4__0 )? ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2222:1: ( ( ( rule__Delete__Group_4__0 )? ) )
            // InternalSqlDsl.g:2223:1: ( ( rule__Delete__Group_4__0 )? )
            {
            // InternalSqlDsl.g:2223:1: ( ( rule__Delete__Group_4__0 )? )
            // InternalSqlDsl.g:2224:2: ( rule__Delete__Group_4__0 )?
            {
             before(grammarAccess.getDeleteAccess().getGroup_4()); 
            // InternalSqlDsl.g:2225:2: ( rule__Delete__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:2225:3: rule__Delete__Group_4__0
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
    // InternalSqlDsl.g:2234:1: rule__Delete__Group_4__0 : rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 ;
    public final void rule__Delete__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2238:1: ( rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1 )
            // InternalSqlDsl.g:2239:2: rule__Delete__Group_4__0__Impl rule__Delete__Group_4__1
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
    // InternalSqlDsl.g:2246:1: rule__Delete__Group_4__0__Impl : ( ( rule__Delete__ClausesAssignment_4_0 ) ) ;
    public final void rule__Delete__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2250:1: ( ( ( rule__Delete__ClausesAssignment_4_0 ) ) )
            // InternalSqlDsl.g:2251:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            {
            // InternalSqlDsl.g:2251:1: ( ( rule__Delete__ClausesAssignment_4_0 ) )
            // InternalSqlDsl.g:2252:2: ( rule__Delete__ClausesAssignment_4_0 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_0()); 
            // InternalSqlDsl.g:2253:2: ( rule__Delete__ClausesAssignment_4_0 )
            // InternalSqlDsl.g:2253:3: rule__Delete__ClausesAssignment_4_0
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
    // InternalSqlDsl.g:2261:1: rule__Delete__Group_4__1 : rule__Delete__Group_4__1__Impl ;
    public final void rule__Delete__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2265:1: ( rule__Delete__Group_4__1__Impl )
            // InternalSqlDsl.g:2266:2: rule__Delete__Group_4__1__Impl
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
    // InternalSqlDsl.g:2272:1: rule__Delete__Group_4__1__Impl : ( ( rule__Delete__Group_4_1__0 )* ) ;
    public final void rule__Delete__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2276:1: ( ( ( rule__Delete__Group_4_1__0 )* ) )
            // InternalSqlDsl.g:2277:1: ( ( rule__Delete__Group_4_1__0 )* )
            {
            // InternalSqlDsl.g:2277:1: ( ( rule__Delete__Group_4_1__0 )* )
            // InternalSqlDsl.g:2278:2: ( rule__Delete__Group_4_1__0 )*
            {
             before(grammarAccess.getDeleteAccess().getGroup_4_1()); 
            // InternalSqlDsl.g:2279:2: ( rule__Delete__Group_4_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSqlDsl.g:2279:3: rule__Delete__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Delete__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalSqlDsl.g:2288:1: rule__Delete__Group_4_1__0 : rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 ;
    public final void rule__Delete__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2292:1: ( rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1 )
            // InternalSqlDsl.g:2293:2: rule__Delete__Group_4_1__0__Impl rule__Delete__Group_4_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2300:1: rule__Delete__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Delete__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2304:1: ( ( ',' ) )
            // InternalSqlDsl.g:2305:1: ( ',' )
            {
            // InternalSqlDsl.g:2305:1: ( ',' )
            // InternalSqlDsl.g:2306:2: ','
            {
             before(grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:2315:1: rule__Delete__Group_4_1__1 : rule__Delete__Group_4_1__1__Impl ;
    public final void rule__Delete__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2319:1: ( rule__Delete__Group_4_1__1__Impl )
            // InternalSqlDsl.g:2320:2: rule__Delete__Group_4_1__1__Impl
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
    // InternalSqlDsl.g:2326:1: rule__Delete__Group_4_1__1__Impl : ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) ;
    public final void rule__Delete__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2330:1: ( ( ( rule__Delete__ClausesAssignment_4_1_1 ) ) )
            // InternalSqlDsl.g:2331:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            {
            // InternalSqlDsl.g:2331:1: ( ( rule__Delete__ClausesAssignment_4_1_1 ) )
            // InternalSqlDsl.g:2332:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            {
             before(grammarAccess.getDeleteAccess().getClausesAssignment_4_1_1()); 
            // InternalSqlDsl.g:2333:2: ( rule__Delete__ClausesAssignment_4_1_1 )
            // InternalSqlDsl.g:2333:3: rule__Delete__ClausesAssignment_4_1_1
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
    // InternalSqlDsl.g:2342:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2346:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalSqlDsl.g:2347:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2354:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2358:1: ( ( () ) )
            // InternalSqlDsl.g:2359:1: ( () )
            {
            // InternalSqlDsl.g:2359:1: ( () )
            // InternalSqlDsl.g:2360:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalSqlDsl.g:2361:2: ()
            // InternalSqlDsl.g:2361:3: 
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
    // InternalSqlDsl.g:2369:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2373:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalSqlDsl.g:2374:2: rule__Table__Group__1__Impl rule__Table__Group__2
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
    // InternalSqlDsl.g:2381:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2385:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2386:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2386:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalSqlDsl.g:2387:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2388:2: ( rule__Table__NameAssignment_1 )
            // InternalSqlDsl.g:2388:3: rule__Table__NameAssignment_1
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
    // InternalSqlDsl.g:2396:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2400:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalSqlDsl.g:2401:2: rule__Table__Group__2__Impl rule__Table__Group__3
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
    // InternalSqlDsl.g:2408:1: rule__Table__Group__2__Impl : ( '{' ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2412:1: ( ( '{' ) )
            // InternalSqlDsl.g:2413:1: ( '{' )
            {
            // InternalSqlDsl.g:2413:1: ( '{' )
            // InternalSqlDsl.g:2414:2: '{'
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
    // InternalSqlDsl.g:2423:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2427:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalSqlDsl.g:2428:2: rule__Table__Group__3__Impl rule__Table__Group__4
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
    // InternalSqlDsl.g:2435:1: rule__Table__Group__3__Impl : ( ( rule__Table__Group_3__0 )? ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2439:1: ( ( ( rule__Table__Group_3__0 )? ) )
            // InternalSqlDsl.g:2440:1: ( ( rule__Table__Group_3__0 )? )
            {
            // InternalSqlDsl.g:2440:1: ( ( rule__Table__Group_3__0 )? )
            // InternalSqlDsl.g:2441:2: ( rule__Table__Group_3__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_3()); 
            // InternalSqlDsl.g:2442:2: ( rule__Table__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSqlDsl.g:2442:3: rule__Table__Group_3__0
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
    // InternalSqlDsl.g:2450:1: rule__Table__Group__4 : rule__Table__Group__4__Impl ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2454:1: ( rule__Table__Group__4__Impl )
            // InternalSqlDsl.g:2455:2: rule__Table__Group__4__Impl
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
    // InternalSqlDsl.g:2461:1: rule__Table__Group__4__Impl : ( '}' ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2465:1: ( ( '}' ) )
            // InternalSqlDsl.g:2466:1: ( '}' )
            {
            // InternalSqlDsl.g:2466:1: ( '}' )
            // InternalSqlDsl.g:2467:2: '}'
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
    // InternalSqlDsl.g:2477:1: rule__Table__Group_3__0 : rule__Table__Group_3__0__Impl rule__Table__Group_3__1 ;
    public final void rule__Table__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2481:1: ( rule__Table__Group_3__0__Impl rule__Table__Group_3__1 )
            // InternalSqlDsl.g:2482:2: rule__Table__Group_3__0__Impl rule__Table__Group_3__1
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
    // InternalSqlDsl.g:2489:1: rule__Table__Group_3__0__Impl : ( ( rule__Table__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Table__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2493:1: ( ( ( rule__Table__ColumnsAssignment_3_0 ) ) )
            // InternalSqlDsl.g:2494:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:2494:1: ( ( rule__Table__ColumnsAssignment_3_0 ) )
            // InternalSqlDsl.g:2495:2: ( rule__Table__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_0()); 
            // InternalSqlDsl.g:2496:2: ( rule__Table__ColumnsAssignment_3_0 )
            // InternalSqlDsl.g:2496:3: rule__Table__ColumnsAssignment_3_0
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
    // InternalSqlDsl.g:2504:1: rule__Table__Group_3__1 : rule__Table__Group_3__1__Impl ;
    public final void rule__Table__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2508:1: ( rule__Table__Group_3__1__Impl )
            // InternalSqlDsl.g:2509:2: rule__Table__Group_3__1__Impl
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
    // InternalSqlDsl.g:2515:1: rule__Table__Group_3__1__Impl : ( ( rule__Table__Group_3_1__0 )* ) ;
    public final void rule__Table__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2519:1: ( ( ( rule__Table__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:2520:1: ( ( rule__Table__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:2520:1: ( ( rule__Table__Group_3_1__0 )* )
            // InternalSqlDsl.g:2521:2: ( rule__Table__Group_3_1__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:2522:2: ( rule__Table__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSqlDsl.g:2522:3: rule__Table__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSqlDsl.g:2531:1: rule__Table__Group_3_1__0 : rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 ;
    public final void rule__Table__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2535:1: ( rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1 )
            // InternalSqlDsl.g:2536:2: rule__Table__Group_3_1__0__Impl rule__Table__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2543:1: rule__Table__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2547:1: ( ( ',' ) )
            // InternalSqlDsl.g:2548:1: ( ',' )
            {
            // InternalSqlDsl.g:2548:1: ( ',' )
            // InternalSqlDsl.g:2549:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:2558:1: rule__Table__Group_3_1__1 : rule__Table__Group_3_1__1__Impl ;
    public final void rule__Table__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2562:1: ( rule__Table__Group_3_1__1__Impl )
            // InternalSqlDsl.g:2563:2: rule__Table__Group_3_1__1__Impl
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
    // InternalSqlDsl.g:2569:1: rule__Table__Group_3_1__1__Impl : ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Table__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2573:1: ( ( ( rule__Table__ColumnsAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:2574:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:2574:1: ( ( rule__Table__ColumnsAssignment_3_1_1 ) )
            // InternalSqlDsl.g:2575:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3_1_1()); 
            // InternalSqlDsl.g:2576:2: ( rule__Table__ColumnsAssignment_3_1_1 )
            // InternalSqlDsl.g:2576:3: rule__Table__ColumnsAssignment_3_1_1
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
    // InternalSqlDsl.g:2585:1: rule__TableOnCreation__Group__0 : rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1 ;
    public final void rule__TableOnCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2589:1: ( rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1 )
            // InternalSqlDsl.g:2590:2: rule__TableOnCreation__Group__0__Impl rule__TableOnCreation__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2597:1: rule__TableOnCreation__Group__0__Impl : ( () ) ;
    public final void rule__TableOnCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2601:1: ( ( () ) )
            // InternalSqlDsl.g:2602:1: ( () )
            {
            // InternalSqlDsl.g:2602:1: ( () )
            // InternalSqlDsl.g:2603:2: ()
            {
             before(grammarAccess.getTableOnCreationAccess().getTableAction_0()); 
            // InternalSqlDsl.g:2604:2: ()
            // InternalSqlDsl.g:2604:3: 
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
    // InternalSqlDsl.g:2612:1: rule__TableOnCreation__Group__1 : rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2 ;
    public final void rule__TableOnCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2616:1: ( rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2 )
            // InternalSqlDsl.g:2617:2: rule__TableOnCreation__Group__1__Impl rule__TableOnCreation__Group__2
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
    // InternalSqlDsl.g:2624:1: rule__TableOnCreation__Group__1__Impl : ( ( rule__TableOnCreation__NameAssignment_1 ) ) ;
    public final void rule__TableOnCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2628:1: ( ( ( rule__TableOnCreation__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2629:1: ( ( rule__TableOnCreation__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2629:1: ( ( rule__TableOnCreation__NameAssignment_1 ) )
            // InternalSqlDsl.g:2630:2: ( rule__TableOnCreation__NameAssignment_1 )
            {
             before(grammarAccess.getTableOnCreationAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2631:2: ( rule__TableOnCreation__NameAssignment_1 )
            // InternalSqlDsl.g:2631:3: rule__TableOnCreation__NameAssignment_1
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
    // InternalSqlDsl.g:2639:1: rule__TableOnCreation__Group__2 : rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3 ;
    public final void rule__TableOnCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2643:1: ( rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3 )
            // InternalSqlDsl.g:2644:2: rule__TableOnCreation__Group__2__Impl rule__TableOnCreation__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2651:1: rule__TableOnCreation__Group__2__Impl : ( '{' ) ;
    public final void rule__TableOnCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2655:1: ( ( '{' ) )
            // InternalSqlDsl.g:2656:1: ( '{' )
            {
            // InternalSqlDsl.g:2656:1: ( '{' )
            // InternalSqlDsl.g:2657:2: '{'
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
    // InternalSqlDsl.g:2666:1: rule__TableOnCreation__Group__3 : rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4 ;
    public final void rule__TableOnCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2670:1: ( rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4 )
            // InternalSqlDsl.g:2671:2: rule__TableOnCreation__Group__3__Impl rule__TableOnCreation__Group__4
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
    // InternalSqlDsl.g:2678:1: rule__TableOnCreation__Group__3__Impl : ( ( rule__TableOnCreation__ColumnsAssignment_3 ) ) ;
    public final void rule__TableOnCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2682:1: ( ( ( rule__TableOnCreation__ColumnsAssignment_3 ) ) )
            // InternalSqlDsl.g:2683:1: ( ( rule__TableOnCreation__ColumnsAssignment_3 ) )
            {
            // InternalSqlDsl.g:2683:1: ( ( rule__TableOnCreation__ColumnsAssignment_3 ) )
            // InternalSqlDsl.g:2684:2: ( rule__TableOnCreation__ColumnsAssignment_3 )
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_3()); 
            // InternalSqlDsl.g:2685:2: ( rule__TableOnCreation__ColumnsAssignment_3 )
            // InternalSqlDsl.g:2685:3: rule__TableOnCreation__ColumnsAssignment_3
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
    // InternalSqlDsl.g:2693:1: rule__TableOnCreation__Group__4 : rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5 ;
    public final void rule__TableOnCreation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2697:1: ( rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5 )
            // InternalSqlDsl.g:2698:2: rule__TableOnCreation__Group__4__Impl rule__TableOnCreation__Group__5
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
    // InternalSqlDsl.g:2705:1: rule__TableOnCreation__Group__4__Impl : ( ( rule__TableOnCreation__Group_4__0 )* ) ;
    public final void rule__TableOnCreation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2709:1: ( ( ( rule__TableOnCreation__Group_4__0 )* ) )
            // InternalSqlDsl.g:2710:1: ( ( rule__TableOnCreation__Group_4__0 )* )
            {
            // InternalSqlDsl.g:2710:1: ( ( rule__TableOnCreation__Group_4__0 )* )
            // InternalSqlDsl.g:2711:2: ( rule__TableOnCreation__Group_4__0 )*
            {
             before(grammarAccess.getTableOnCreationAccess().getGroup_4()); 
            // InternalSqlDsl.g:2712:2: ( rule__TableOnCreation__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSqlDsl.g:2712:3: rule__TableOnCreation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TableOnCreation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalSqlDsl.g:2720:1: rule__TableOnCreation__Group__5 : rule__TableOnCreation__Group__5__Impl ;
    public final void rule__TableOnCreation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2724:1: ( rule__TableOnCreation__Group__5__Impl )
            // InternalSqlDsl.g:2725:2: rule__TableOnCreation__Group__5__Impl
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
    // InternalSqlDsl.g:2731:1: rule__TableOnCreation__Group__5__Impl : ( '}' ) ;
    public final void rule__TableOnCreation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2735:1: ( ( '}' ) )
            // InternalSqlDsl.g:2736:1: ( '}' )
            {
            // InternalSqlDsl.g:2736:1: ( '}' )
            // InternalSqlDsl.g:2737:2: '}'
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
    // InternalSqlDsl.g:2747:1: rule__TableOnCreation__Group_4__0 : rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1 ;
    public final void rule__TableOnCreation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2751:1: ( rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1 )
            // InternalSqlDsl.g:2752:2: rule__TableOnCreation__Group_4__0__Impl rule__TableOnCreation__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2759:1: rule__TableOnCreation__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TableOnCreation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2763:1: ( ( ',' ) )
            // InternalSqlDsl.g:2764:1: ( ',' )
            {
            // InternalSqlDsl.g:2764:1: ( ',' )
            // InternalSqlDsl.g:2765:2: ','
            {
             before(grammarAccess.getTableOnCreationAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:2774:1: rule__TableOnCreation__Group_4__1 : rule__TableOnCreation__Group_4__1__Impl ;
    public final void rule__TableOnCreation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2778:1: ( rule__TableOnCreation__Group_4__1__Impl )
            // InternalSqlDsl.g:2779:2: rule__TableOnCreation__Group_4__1__Impl
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
    // InternalSqlDsl.g:2785:1: rule__TableOnCreation__Group_4__1__Impl : ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) ) ;
    public final void rule__TableOnCreation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2789:1: ( ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) ) )
            // InternalSqlDsl.g:2790:1: ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) )
            {
            // InternalSqlDsl.g:2790:1: ( ( rule__TableOnCreation__ColumnsAssignment_4_1 ) )
            // InternalSqlDsl.g:2791:2: ( rule__TableOnCreation__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getTableOnCreationAccess().getColumnsAssignment_4_1()); 
            // InternalSqlDsl.g:2792:2: ( rule__TableOnCreation__ColumnsAssignment_4_1 )
            // InternalSqlDsl.g:2792:3: rule__TableOnCreation__ColumnsAssignment_4_1
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
    // InternalSqlDsl.g:2801:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2805:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalSqlDsl.g:2806:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2813:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2817:1: ( ( () ) )
            // InternalSqlDsl.g:2818:1: ( () )
            {
            // InternalSqlDsl.g:2818:1: ( () )
            // InternalSqlDsl.g:2819:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:2820:2: ()
            // InternalSqlDsl.g:2820:3: 
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
    // InternalSqlDsl.g:2828:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2832:1: ( rule__Column__Group__1__Impl )
            // InternalSqlDsl.g:2833:2: rule__Column__Group__1__Impl
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
    // InternalSqlDsl.g:2839:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2843:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2844:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2844:1: ( ( rule__Column__NameAssignment_1 ) )
            // InternalSqlDsl.g:2845:2: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2846:2: ( rule__Column__NameAssignment_1 )
            // InternalSqlDsl.g:2846:3: rule__Column__NameAssignment_1
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
    // InternalSqlDsl.g:2855:1: rule__ColumnOnCreation__Group__0 : rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1 ;
    public final void rule__ColumnOnCreation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2859:1: ( rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1 )
            // InternalSqlDsl.g:2860:2: rule__ColumnOnCreation__Group__0__Impl rule__ColumnOnCreation__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2867:1: rule__ColumnOnCreation__Group__0__Impl : ( () ) ;
    public final void rule__ColumnOnCreation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2871:1: ( ( () ) )
            // InternalSqlDsl.g:2872:1: ( () )
            {
            // InternalSqlDsl.g:2872:1: ( () )
            // InternalSqlDsl.g:2873:2: ()
            {
             before(grammarAccess.getColumnOnCreationAccess().getColumnAction_0()); 
            // InternalSqlDsl.g:2874:2: ()
            // InternalSqlDsl.g:2874:3: 
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
    // InternalSqlDsl.g:2882:1: rule__ColumnOnCreation__Group__1 : rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2 ;
    public final void rule__ColumnOnCreation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2886:1: ( rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2 )
            // InternalSqlDsl.g:2887:2: rule__ColumnOnCreation__Group__1__Impl rule__ColumnOnCreation__Group__2
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
    // InternalSqlDsl.g:2894:1: rule__ColumnOnCreation__Group__1__Impl : ( ( rule__ColumnOnCreation__NameAssignment_1 ) ) ;
    public final void rule__ColumnOnCreation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2898:1: ( ( ( rule__ColumnOnCreation__NameAssignment_1 ) ) )
            // InternalSqlDsl.g:2899:1: ( ( rule__ColumnOnCreation__NameAssignment_1 ) )
            {
            // InternalSqlDsl.g:2899:1: ( ( rule__ColumnOnCreation__NameAssignment_1 ) )
            // InternalSqlDsl.g:2900:2: ( rule__ColumnOnCreation__NameAssignment_1 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getNameAssignment_1()); 
            // InternalSqlDsl.g:2901:2: ( rule__ColumnOnCreation__NameAssignment_1 )
            // InternalSqlDsl.g:2901:3: rule__ColumnOnCreation__NameAssignment_1
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
    // InternalSqlDsl.g:2909:1: rule__ColumnOnCreation__Group__2 : rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3 ;
    public final void rule__ColumnOnCreation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2913:1: ( rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3 )
            // InternalSqlDsl.g:2914:2: rule__ColumnOnCreation__Group__2__Impl rule__ColumnOnCreation__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2921:1: rule__ColumnOnCreation__Group__2__Impl : ( ( rule__ColumnOnCreation__TypeAssignment_2 ) ) ;
    public final void rule__ColumnOnCreation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2925:1: ( ( ( rule__ColumnOnCreation__TypeAssignment_2 ) ) )
            // InternalSqlDsl.g:2926:1: ( ( rule__ColumnOnCreation__TypeAssignment_2 ) )
            {
            // InternalSqlDsl.g:2926:1: ( ( rule__ColumnOnCreation__TypeAssignment_2 ) )
            // InternalSqlDsl.g:2927:2: ( rule__ColumnOnCreation__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getTypeAssignment_2()); 
            // InternalSqlDsl.g:2928:2: ( rule__ColumnOnCreation__TypeAssignment_2 )
            // InternalSqlDsl.g:2928:3: rule__ColumnOnCreation__TypeAssignment_2
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
    // InternalSqlDsl.g:2936:1: rule__ColumnOnCreation__Group__3 : rule__ColumnOnCreation__Group__3__Impl ;
    public final void rule__ColumnOnCreation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2940:1: ( rule__ColumnOnCreation__Group__3__Impl )
            // InternalSqlDsl.g:2941:2: rule__ColumnOnCreation__Group__3__Impl
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
    // InternalSqlDsl.g:2947:1: rule__ColumnOnCreation__Group__3__Impl : ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? ) ;
    public final void rule__ColumnOnCreation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2951:1: ( ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? ) )
            // InternalSqlDsl.g:2952:1: ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? )
            {
            // InternalSqlDsl.g:2952:1: ( ( rule__ColumnOnCreation__ConstaintsAssignment_3 )? )
            // InternalSqlDsl.g:2953:2: ( rule__ColumnOnCreation__ConstaintsAssignment_3 )?
            {
             before(grammarAccess.getColumnOnCreationAccess().getConstaintsAssignment_3()); 
            // InternalSqlDsl.g:2954:2: ( rule__ColumnOnCreation__ConstaintsAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSqlDsl.g:2954:3: rule__ColumnOnCreation__ConstaintsAssignment_3
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
    // InternalSqlDsl.g:2963:1: rule__Constaint__Group__0 : rule__Constaint__Group__0__Impl rule__Constaint__Group__1 ;
    public final void rule__Constaint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2967:1: ( rule__Constaint__Group__0__Impl rule__Constaint__Group__1 )
            // InternalSqlDsl.g:2968:2: rule__Constaint__Group__0__Impl rule__Constaint__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:2975:1: rule__Constaint__Group__0__Impl : ( 'CONSTRAINT' ) ;
    public final void rule__Constaint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2979:1: ( ( 'CONSTRAINT' ) )
            // InternalSqlDsl.g:2980:1: ( 'CONSTRAINT' )
            {
            // InternalSqlDsl.g:2980:1: ( 'CONSTRAINT' )
            // InternalSqlDsl.g:2981:2: 'CONSTRAINT'
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
    // InternalSqlDsl.g:2990:1: rule__Constaint__Group__1 : rule__Constaint__Group__1__Impl ;
    public final void rule__Constaint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:2994:1: ( rule__Constaint__Group__1__Impl )
            // InternalSqlDsl.g:2995:2: rule__Constaint__Group__1__Impl
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
    // InternalSqlDsl.g:3001:1: rule__Constaint__Group__1__Impl : ( ( rule__Constaint__BodyAssignment_1 ) ) ;
    public final void rule__Constaint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3005:1: ( ( ( rule__Constaint__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:3006:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:3006:1: ( ( rule__Constaint__BodyAssignment_1 ) )
            // InternalSqlDsl.g:3007:2: ( rule__Constaint__BodyAssignment_1 )
            {
             before(grammarAccess.getConstaintAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:3008:2: ( rule__Constaint__BodyAssignment_1 )
            // InternalSqlDsl.g:3008:3: rule__Constaint__BodyAssignment_1
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
    // InternalSqlDsl.g:3017:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3021:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalSqlDsl.g:3022:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3029:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__NameAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3033:1: ( ( ( rule__Clause__NameAssignment_0 ) ) )
            // InternalSqlDsl.g:3034:1: ( ( rule__Clause__NameAssignment_0 ) )
            {
            // InternalSqlDsl.g:3034:1: ( ( rule__Clause__NameAssignment_0 ) )
            // InternalSqlDsl.g:3035:2: ( rule__Clause__NameAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getNameAssignment_0()); 
            // InternalSqlDsl.g:3036:2: ( rule__Clause__NameAssignment_0 )
            // InternalSqlDsl.g:3036:3: rule__Clause__NameAssignment_0
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
    // InternalSqlDsl.g:3044:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3048:1: ( rule__Clause__Group__1__Impl )
            // InternalSqlDsl.g:3049:2: rule__Clause__Group__1__Impl
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
    // InternalSqlDsl.g:3055:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__BodyAssignment_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3059:1: ( ( ( rule__Clause__BodyAssignment_1 ) ) )
            // InternalSqlDsl.g:3060:1: ( ( rule__Clause__BodyAssignment_1 ) )
            {
            // InternalSqlDsl.g:3060:1: ( ( rule__Clause__BodyAssignment_1 ) )
            // InternalSqlDsl.g:3061:2: ( rule__Clause__BodyAssignment_1 )
            {
             before(grammarAccess.getClauseAccess().getBodyAssignment_1()); 
            // InternalSqlDsl.g:3062:2: ( rule__Clause__BodyAssignment_1 )
            // InternalSqlDsl.g:3062:3: rule__Clause__BodyAssignment_1
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
    // InternalSqlDsl.g:3071:1: rule__Value__Group__0 : rule__Value__Group__0__Impl rule__Value__Group__1 ;
    public final void rule__Value__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3075:1: ( rule__Value__Group__0__Impl rule__Value__Group__1 )
            // InternalSqlDsl.g:3076:2: rule__Value__Group__0__Impl rule__Value__Group__1
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
    // InternalSqlDsl.g:3083:1: rule__Value__Group__0__Impl : ( () ) ;
    public final void rule__Value__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3087:1: ( ( () ) )
            // InternalSqlDsl.g:3088:1: ( () )
            {
            // InternalSqlDsl.g:3088:1: ( () )
            // InternalSqlDsl.g:3089:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0()); 
            // InternalSqlDsl.g:3090:2: ()
            // InternalSqlDsl.g:3090:3: 
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
    // InternalSqlDsl.g:3098:1: rule__Value__Group__1 : rule__Value__Group__1__Impl rule__Value__Group__2 ;
    public final void rule__Value__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3102:1: ( rule__Value__Group__1__Impl rule__Value__Group__2 )
            // InternalSqlDsl.g:3103:2: rule__Value__Group__1__Impl rule__Value__Group__2
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
    // InternalSqlDsl.g:3110:1: rule__Value__Group__1__Impl : ( 'Value' ) ;
    public final void rule__Value__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3114:1: ( ( 'Value' ) )
            // InternalSqlDsl.g:3115:1: ( 'Value' )
            {
            // InternalSqlDsl.g:3115:1: ( 'Value' )
            // InternalSqlDsl.g:3116:2: 'Value'
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
    // InternalSqlDsl.g:3125:1: rule__Value__Group__2 : rule__Value__Group__2__Impl rule__Value__Group__3 ;
    public final void rule__Value__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3129:1: ( rule__Value__Group__2__Impl rule__Value__Group__3 )
            // InternalSqlDsl.g:3130:2: rule__Value__Group__2__Impl rule__Value__Group__3
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
    // InternalSqlDsl.g:3137:1: rule__Value__Group__2__Impl : ( '(' ) ;
    public final void rule__Value__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3141:1: ( ( '(' ) )
            // InternalSqlDsl.g:3142:1: ( '(' )
            {
            // InternalSqlDsl.g:3142:1: ( '(' )
            // InternalSqlDsl.g:3143:2: '('
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
    // InternalSqlDsl.g:3152:1: rule__Value__Group__3 : rule__Value__Group__3__Impl rule__Value__Group__4 ;
    public final void rule__Value__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3156:1: ( rule__Value__Group__3__Impl rule__Value__Group__4 )
            // InternalSqlDsl.g:3157:2: rule__Value__Group__3__Impl rule__Value__Group__4
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
    // InternalSqlDsl.g:3164:1: rule__Value__Group__3__Impl : ( ( rule__Value__Group_3__0 )? ) ;
    public final void rule__Value__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3168:1: ( ( ( rule__Value__Group_3__0 )? ) )
            // InternalSqlDsl.g:3169:1: ( ( rule__Value__Group_3__0 )? )
            {
            // InternalSqlDsl.g:3169:1: ( ( rule__Value__Group_3__0 )? )
            // InternalSqlDsl.g:3170:2: ( rule__Value__Group_3__0 )?
            {
             before(grammarAccess.getValueAccess().getGroup_3()); 
            // InternalSqlDsl.g:3171:2: ( rule__Value__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSqlDsl.g:3171:3: rule__Value__Group_3__0
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
    // InternalSqlDsl.g:3179:1: rule__Value__Group__4 : rule__Value__Group__4__Impl ;
    public final void rule__Value__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3183:1: ( rule__Value__Group__4__Impl )
            // InternalSqlDsl.g:3184:2: rule__Value__Group__4__Impl
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
    // InternalSqlDsl.g:3190:1: rule__Value__Group__4__Impl : ( ')' ) ;
    public final void rule__Value__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3194:1: ( ( ')' ) )
            // InternalSqlDsl.g:3195:1: ( ')' )
            {
            // InternalSqlDsl.g:3195:1: ( ')' )
            // InternalSqlDsl.g:3196:2: ')'
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
    // InternalSqlDsl.g:3206:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3210:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalSqlDsl.g:3211:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
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
    // InternalSqlDsl.g:3218:1: rule__Value__Group_3__0__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3222:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_0 ) ) )
            // InternalSqlDsl.g:3223:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            {
            // InternalSqlDsl.g:3223:1: ( ( rule__Value__ColumnvaluesAssignment_3_0 ) )
            // InternalSqlDsl.g:3224:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_0()); 
            // InternalSqlDsl.g:3225:2: ( rule__Value__ColumnvaluesAssignment_3_0 )
            // InternalSqlDsl.g:3225:3: rule__Value__ColumnvaluesAssignment_3_0
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
    // InternalSqlDsl.g:3233:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3237:1: ( rule__Value__Group_3__1__Impl )
            // InternalSqlDsl.g:3238:2: rule__Value__Group_3__1__Impl
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
    // InternalSqlDsl.g:3244:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__Group_3_1__0 )* ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3248:1: ( ( ( rule__Value__Group_3_1__0 )* ) )
            // InternalSqlDsl.g:3249:1: ( ( rule__Value__Group_3_1__0 )* )
            {
            // InternalSqlDsl.g:3249:1: ( ( rule__Value__Group_3_1__0 )* )
            // InternalSqlDsl.g:3250:2: ( rule__Value__Group_3_1__0 )*
            {
             before(grammarAccess.getValueAccess().getGroup_3_1()); 
            // InternalSqlDsl.g:3251:2: ( rule__Value__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSqlDsl.g:3251:3: rule__Value__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Value__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSqlDsl.g:3260:1: rule__Value__Group_3_1__0 : rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 ;
    public final void rule__Value__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3264:1: ( rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1 )
            // InternalSqlDsl.g:3265:2: rule__Value__Group_3_1__0__Impl rule__Value__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3272:1: rule__Value__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Value__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3276:1: ( ( ',' ) )
            // InternalSqlDsl.g:3277:1: ( ',' )
            {
            // InternalSqlDsl.g:3277:1: ( ',' )
            // InternalSqlDsl.g:3278:2: ','
            {
             before(grammarAccess.getValueAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:3287:1: rule__Value__Group_3_1__1 : rule__Value__Group_3_1__1__Impl ;
    public final void rule__Value__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3291:1: ( rule__Value__Group_3_1__1__Impl )
            // InternalSqlDsl.g:3292:2: rule__Value__Group_3_1__1__Impl
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
    // InternalSqlDsl.g:3298:1: rule__Value__Group_3_1__1__Impl : ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) ;
    public final void rule__Value__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3302:1: ( ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) ) )
            // InternalSqlDsl.g:3303:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            {
            // InternalSqlDsl.g:3303:1: ( ( rule__Value__ColumnvaluesAssignment_3_1_1 ) )
            // InternalSqlDsl.g:3304:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            {
             before(grammarAccess.getValueAccess().getColumnvaluesAssignment_3_1_1()); 
            // InternalSqlDsl.g:3305:2: ( rule__Value__ColumnvaluesAssignment_3_1_1 )
            // InternalSqlDsl.g:3305:3: rule__Value__ColumnvaluesAssignment_3_1_1
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
    // InternalSqlDsl.g:3314:1: rule__ColumnValue__Group__0 : rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 ;
    public final void rule__ColumnValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3318:1: ( rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 )
            // InternalSqlDsl.g:3319:2: rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3326:1: rule__ColumnValue__Group__0__Impl : ( () ) ;
    public final void rule__ColumnValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3330:1: ( ( () ) )
            // InternalSqlDsl.g:3331:1: ( () )
            {
            // InternalSqlDsl.g:3331:1: ( () )
            // InternalSqlDsl.g:3332:2: ()
            {
             before(grammarAccess.getColumnValueAccess().getColumnValueAction_0()); 
            // InternalSqlDsl.g:3333:2: ()
            // InternalSqlDsl.g:3333:3: 
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
    // InternalSqlDsl.g:3341:1: rule__ColumnValue__Group__1 : rule__ColumnValue__Group__1__Impl ;
    public final void rule__ColumnValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3345:1: ( rule__ColumnValue__Group__1__Impl )
            // InternalSqlDsl.g:3346:2: rule__ColumnValue__Group__1__Impl
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
    // InternalSqlDsl.g:3352:1: rule__ColumnValue__Group__1__Impl : ( ( rule__ColumnValue__ValueAssignment_1 ) ) ;
    public final void rule__ColumnValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3356:1: ( ( ( rule__ColumnValue__ValueAssignment_1 ) ) )
            // InternalSqlDsl.g:3357:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            {
            // InternalSqlDsl.g:3357:1: ( ( rule__ColumnValue__ValueAssignment_1 ) )
            // InternalSqlDsl.g:3358:2: ( rule__ColumnValue__ValueAssignment_1 )
            {
             before(grammarAccess.getColumnValueAccess().getValueAssignment_1()); 
            // InternalSqlDsl.g:3359:2: ( rule__ColumnValue__ValueAssignment_1 )
            // InternalSqlDsl.g:3359:3: rule__ColumnValue__ValueAssignment_1
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
    // InternalSqlDsl.g:3368:1: rule__ComplexString__Group__0 : rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 ;
    public final void rule__ComplexString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3372:1: ( rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1 )
            // InternalSqlDsl.g:3373:2: rule__ComplexString__Group__0__Impl rule__ComplexString__Group__1
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
    // InternalSqlDsl.g:3380:1: rule__ComplexString__Group__0__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3384:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3385:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3385:1: ( ruleEString )
            // InternalSqlDsl.g:3386:2: ruleEString
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
    // InternalSqlDsl.g:3395:1: rule__ComplexString__Group__1 : rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 ;
    public final void rule__ComplexString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3399:1: ( rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2 )
            // InternalSqlDsl.g:3400:2: rule__ComplexString__Group__1__Impl rule__ComplexString__Group__2
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
    // InternalSqlDsl.g:3407:1: rule__ComplexString__Group__1__Impl : ( ( rule__ComplexString__Group_1__0 )* ) ;
    public final void rule__ComplexString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3411:1: ( ( ( rule__ComplexString__Group_1__0 )* ) )
            // InternalSqlDsl.g:3412:1: ( ( rule__ComplexString__Group_1__0 )* )
            {
            // InternalSqlDsl.g:3412:1: ( ( rule__ComplexString__Group_1__0 )* )
            // InternalSqlDsl.g:3413:2: ( rule__ComplexString__Group_1__0 )*
            {
             before(grammarAccess.getComplexStringAccess().getGroup_1()); 
            // InternalSqlDsl.g:3414:2: ( rule__ComplexString__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt23=1;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 23:
                    case 25:
                    case 34:
                    case 38:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt23=1;
                        }
                        break;
                    case 40:
                        {
                        alt23=1;
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
                    case 25:
                    case 34:
                    case 38:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt23=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt23=1;
                        }
                        break;
                    case 40:
                        {
                        alt23=1;
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
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalSqlDsl.g:3414:3: rule__ComplexString__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ComplexString__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalSqlDsl.g:3422:1: rule__ComplexString__Group__2 : rule__ComplexString__Group__2__Impl ;
    public final void rule__ComplexString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3426:1: ( rule__ComplexString__Group__2__Impl )
            // InternalSqlDsl.g:3427:2: rule__ComplexString__Group__2__Impl
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
    // InternalSqlDsl.g:3433:1: rule__ComplexString__Group__2__Impl : ( ( rule__ComplexString__Group_2__0 )? ) ;
    public final void rule__ComplexString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3437:1: ( ( ( rule__ComplexString__Group_2__0 )? ) )
            // InternalSqlDsl.g:3438:1: ( ( rule__ComplexString__Group_2__0 )? )
            {
            // InternalSqlDsl.g:3438:1: ( ( rule__ComplexString__Group_2__0 )? )
            // InternalSqlDsl.g:3439:2: ( rule__ComplexString__Group_2__0 )?
            {
             before(grammarAccess.getComplexStringAccess().getGroup_2()); 
            // InternalSqlDsl.g:3440:2: ( rule__ComplexString__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSqlDsl.g:3440:3: rule__ComplexString__Group_2__0
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
    // InternalSqlDsl.g:3449:1: rule__ComplexString__Group_1__0 : rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 ;
    public final void rule__ComplexString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3453:1: ( rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1 )
            // InternalSqlDsl.g:3454:2: rule__ComplexString__Group_1__0__Impl rule__ComplexString__Group_1__1
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
    // InternalSqlDsl.g:3461:1: rule__ComplexString__Group_1__0__Impl : ( ( '.' )? ) ;
    public final void rule__ComplexString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3465:1: ( ( ( '.' )? ) )
            // InternalSqlDsl.g:3466:1: ( ( '.' )? )
            {
            // InternalSqlDsl.g:3466:1: ( ( '.' )? )
            // InternalSqlDsl.g:3467:2: ( '.' )?
            {
             before(grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0()); 
            // InternalSqlDsl.g:3468:2: ( '.' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSqlDsl.g:3468:3: '.'
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
    // InternalSqlDsl.g:3476:1: rule__ComplexString__Group_1__1 : rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 ;
    public final void rule__ComplexString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3480:1: ( rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2 )
            // InternalSqlDsl.g:3481:2: rule__ComplexString__Group_1__1__Impl rule__ComplexString__Group_1__2
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
    // InternalSqlDsl.g:3488:1: rule__ComplexString__Group_1__1__Impl : ( ( '*' )? ) ;
    public final void rule__ComplexString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3492:1: ( ( ( '*' )? ) )
            // InternalSqlDsl.g:3493:1: ( ( '*' )? )
            {
            // InternalSqlDsl.g:3493:1: ( ( '*' )? )
            // InternalSqlDsl.g:3494:2: ( '*' )?
            {
             before(grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1()); 
            // InternalSqlDsl.g:3495:2: ( '*' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSqlDsl.g:3495:3: '*'
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
    // InternalSqlDsl.g:3503:1: rule__ComplexString__Group_1__2 : rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 ;
    public final void rule__ComplexString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3507:1: ( rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3 )
            // InternalSqlDsl.g:3508:2: rule__ComplexString__Group_1__2__Impl rule__ComplexString__Group_1__3
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
    // InternalSqlDsl.g:3515:1: rule__ComplexString__Group_1__2__Impl : ( ( '=' )? ) ;
    public final void rule__ComplexString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3519:1: ( ( ( '=' )? ) )
            // InternalSqlDsl.g:3520:1: ( ( '=' )? )
            {
            // InternalSqlDsl.g:3520:1: ( ( '=' )? )
            // InternalSqlDsl.g:3521:2: ( '=' )?
            {
             before(grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2()); 
            // InternalSqlDsl.g:3522:2: ( '=' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSqlDsl.g:3522:3: '='
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
    // InternalSqlDsl.g:3530:1: rule__ComplexString__Group_1__3 : rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4 ;
    public final void rule__ComplexString__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3534:1: ( rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4 )
            // InternalSqlDsl.g:3535:2: rule__ComplexString__Group_1__3__Impl rule__ComplexString__Group_1__4
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
    // InternalSqlDsl.g:3542:1: rule__ComplexString__Group_1__3__Impl : ( ( '<' )? ) ;
    public final void rule__ComplexString__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3546:1: ( ( ( '<' )? ) )
            // InternalSqlDsl.g:3547:1: ( ( '<' )? )
            {
            // InternalSqlDsl.g:3547:1: ( ( '<' )? )
            // InternalSqlDsl.g:3548:2: ( '<' )?
            {
             before(grammarAccess.getComplexStringAccess().getLessThanSignKeyword_1_3()); 
            // InternalSqlDsl.g:3549:2: ( '<' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSqlDsl.g:3549:3: '<'
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
    // InternalSqlDsl.g:3557:1: rule__ComplexString__Group_1__4 : rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5 ;
    public final void rule__ComplexString__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3561:1: ( rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5 )
            // InternalSqlDsl.g:3562:2: rule__ComplexString__Group_1__4__Impl rule__ComplexString__Group_1__5
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
    // InternalSqlDsl.g:3569:1: rule__ComplexString__Group_1__4__Impl : ( ( '>' )? ) ;
    public final void rule__ComplexString__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3573:1: ( ( ( '>' )? ) )
            // InternalSqlDsl.g:3574:1: ( ( '>' )? )
            {
            // InternalSqlDsl.g:3574:1: ( ( '>' )? )
            // InternalSqlDsl.g:3575:2: ( '>' )?
            {
             before(grammarAccess.getComplexStringAccess().getGreaterThanSignKeyword_1_4()); 
            // InternalSqlDsl.g:3576:2: ( '>' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSqlDsl.g:3576:3: '>'
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
    // InternalSqlDsl.g:3584:1: rule__ComplexString__Group_1__5 : rule__ComplexString__Group_1__5__Impl ;
    public final void rule__ComplexString__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3588:1: ( rule__ComplexString__Group_1__5__Impl )
            // InternalSqlDsl.g:3589:2: rule__ComplexString__Group_1__5__Impl
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
    // InternalSqlDsl.g:3595:1: rule__ComplexString__Group_1__5__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3599:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3600:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3600:1: ( ruleEString )
            // InternalSqlDsl.g:3601:2: ruleEString
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
    // InternalSqlDsl.g:3611:1: rule__ComplexString__Group_2__0 : rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1 ;
    public final void rule__ComplexString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3615:1: ( rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1 )
            // InternalSqlDsl.g:3616:2: rule__ComplexString__Group_2__0__Impl rule__ComplexString__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3623:1: rule__ComplexString__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ComplexString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3627:1: ( ( '(' ) )
            // InternalSqlDsl.g:3628:1: ( '(' )
            {
            // InternalSqlDsl.g:3628:1: ( '(' )
            // InternalSqlDsl.g:3629:2: '('
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
    // InternalSqlDsl.g:3638:1: rule__ComplexString__Group_2__1 : rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2 ;
    public final void rule__ComplexString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3642:1: ( rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2 )
            // InternalSqlDsl.g:3643:2: rule__ComplexString__Group_2__1__Impl rule__ComplexString__Group_2__2
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
    // InternalSqlDsl.g:3650:1: rule__ComplexString__Group_2__1__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3654:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3655:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3655:1: ( ruleEString )
            // InternalSqlDsl.g:3656:2: ruleEString
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
    // InternalSqlDsl.g:3665:1: rule__ComplexString__Group_2__2 : rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3 ;
    public final void rule__ComplexString__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3669:1: ( rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3 )
            // InternalSqlDsl.g:3670:2: rule__ComplexString__Group_2__2__Impl rule__ComplexString__Group_2__3
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
    // InternalSqlDsl.g:3677:1: rule__ComplexString__Group_2__2__Impl : ( ( rule__ComplexString__Group_2_2__0 )* ) ;
    public final void rule__ComplexString__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3681:1: ( ( ( rule__ComplexString__Group_2_2__0 )* ) )
            // InternalSqlDsl.g:3682:1: ( ( rule__ComplexString__Group_2_2__0 )* )
            {
            // InternalSqlDsl.g:3682:1: ( ( rule__ComplexString__Group_2_2__0 )* )
            // InternalSqlDsl.g:3683:2: ( rule__ComplexString__Group_2_2__0 )*
            {
             before(grammarAccess.getComplexStringAccess().getGroup_2_2()); 
            // InternalSqlDsl.g:3684:2: ( rule__ComplexString__Group_2_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSqlDsl.g:3684:3: rule__ComplexString__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComplexString__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSqlDsl.g:3692:1: rule__ComplexString__Group_2__3 : rule__ComplexString__Group_2__3__Impl ;
    public final void rule__ComplexString__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3696:1: ( rule__ComplexString__Group_2__3__Impl )
            // InternalSqlDsl.g:3697:2: rule__ComplexString__Group_2__3__Impl
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
    // InternalSqlDsl.g:3703:1: rule__ComplexString__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ComplexString__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3707:1: ( ( ')' ) )
            // InternalSqlDsl.g:3708:1: ( ')' )
            {
            // InternalSqlDsl.g:3708:1: ( ')' )
            // InternalSqlDsl.g:3709:2: ')'
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
    // InternalSqlDsl.g:3719:1: rule__ComplexString__Group_2_2__0 : rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1 ;
    public final void rule__ComplexString__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3723:1: ( rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1 )
            // InternalSqlDsl.g:3724:2: rule__ComplexString__Group_2_2__0__Impl rule__ComplexString__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSqlDsl.g:3731:1: rule__ComplexString__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ComplexString__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3735:1: ( ( ',' ) )
            // InternalSqlDsl.g:3736:1: ( ',' )
            {
            // InternalSqlDsl.g:3736:1: ( ',' )
            // InternalSqlDsl.g:3737:2: ','
            {
             before(grammarAccess.getComplexStringAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSqlDsl.g:3746:1: rule__ComplexString__Group_2_2__1 : rule__ComplexString__Group_2_2__1__Impl ;
    public final void rule__ComplexString__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3750:1: ( rule__ComplexString__Group_2_2__1__Impl )
            // InternalSqlDsl.g:3751:2: rule__ComplexString__Group_2_2__1__Impl
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
    // InternalSqlDsl.g:3757:1: rule__ComplexString__Group_2_2__1__Impl : ( ruleEString ) ;
    public final void rule__ComplexString__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3761:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3762:1: ( ruleEString )
            {
            // InternalSqlDsl.g:3762:1: ( ruleEString )
            // InternalSqlDsl.g:3763:2: ruleEString
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
    // InternalSqlDsl.g:3773:1: rule__SqlProgram__QueriesAssignment_1_0 : ( ruleQueries ) ;
    public final void rule__SqlProgram__QueriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3777:1: ( ( ruleQueries ) )
            // InternalSqlDsl.g:3778:2: ( ruleQueries )
            {
            // InternalSqlDsl.g:3778:2: ( ruleQueries )
            // InternalSqlDsl.g:3779:3: ruleQueries
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


    // $ANTLR start "rule__QuickSelection__MethodAssignment_1"
    // InternalSqlDsl.g:3788:1: rule__QuickSelection__MethodAssignment_1 : ( ruleEString ) ;
    public final void rule__QuickSelection__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3792:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3793:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3793:2: ( ruleEString )
            // InternalSqlDsl.g:3794:3: ruleEString
            {
             before(grammarAccess.getQuickSelectionAccess().getMethodEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuickSelectionAccess().getMethodEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__MethodAssignment_1"


    // $ANTLR start "rule__QuickSelection__ObjectsAssignment_3"
    // InternalSqlDsl.g:3803:1: rule__QuickSelection__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__QuickSelection__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3807:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3808:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3808:2: ( ruleTable )
            // InternalSqlDsl.g:3809:3: ruleTable
            {
             before(grammarAccess.getQuickSelectionAccess().getObjectsTableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getQuickSelectionAccess().getObjectsTableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__ObjectsAssignment_3"


    // $ANTLR start "rule__QuickSelection__ObjectsAssignment_4_1"
    // InternalSqlDsl.g:3818:1: rule__QuickSelection__ObjectsAssignment_4_1 : ( ruleTable ) ;
    public final void rule__QuickSelection__ObjectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3822:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3823:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3823:2: ( ruleTable )
            // InternalSqlDsl.g:3824:3: ruleTable
            {
             before(grammarAccess.getQuickSelectionAccess().getObjectsTableParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getQuickSelectionAccess().getObjectsTableParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__ObjectsAssignment_4_1"


    // $ANTLR start "rule__QuickSelection__ClausesAssignment_5"
    // InternalSqlDsl.g:3833:1: rule__QuickSelection__ClausesAssignment_5 : ( ruleClause ) ;
    public final void rule__QuickSelection__ClausesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3837:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3838:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3838:2: ( ruleClause )
            // InternalSqlDsl.g:3839:3: ruleClause
            {
             before(grammarAccess.getQuickSelectionAccess().getClausesClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getQuickSelectionAccess().getClausesClauseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuickSelection__ClausesAssignment_5"


    // $ANTLR start "rule__Selection__ObjectsAssignment_3"
    // InternalSqlDsl.g:3848:1: rule__Selection__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3852:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3853:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3853:2: ( ruleTable )
            // InternalSqlDsl.g:3854:3: ruleTable
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
    // InternalSqlDsl.g:3863:1: rule__Selection__ObjectsAssignment_4_1 : ( ruleTable ) ;
    public final void rule__Selection__ObjectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3867:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3868:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3868:2: ( ruleTable )
            // InternalSqlDsl.g:3869:3: ruleTable
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
    // InternalSqlDsl.g:3878:1: rule__Selection__ClausesAssignment_5 : ( ruleClause ) ;
    public final void rule__Selection__ClausesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3882:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:3883:2: ( ruleClause )
            {
            // InternalSqlDsl.g:3883:2: ( ruleClause )
            // InternalSqlDsl.g:3884:3: ruleClause
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
    // InternalSqlDsl.g:3893:1: rule__Creation__TypeAssignment_2_0_0 : ( ( 'TABLE' ) ) ;
    public final void rule__Creation__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3897:1: ( ( ( 'TABLE' ) ) )
            // InternalSqlDsl.g:3898:2: ( ( 'TABLE' ) )
            {
            // InternalSqlDsl.g:3898:2: ( ( 'TABLE' ) )
            // InternalSqlDsl.g:3899:3: ( 'TABLE' )
            {
             before(grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0()); 
            // InternalSqlDsl.g:3900:3: ( 'TABLE' )
            // InternalSqlDsl.g:3901:4: 'TABLE'
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
    // InternalSqlDsl.g:3912:1: rule__Creation__ObjectsAssignment_2_0_1 : ( ruleTableOnCreation ) ;
    public final void rule__Creation__ObjectsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3916:1: ( ( ruleTableOnCreation ) )
            // InternalSqlDsl.g:3917:2: ( ruleTableOnCreation )
            {
            // InternalSqlDsl.g:3917:2: ( ruleTableOnCreation )
            // InternalSqlDsl.g:3918:3: ruleTableOnCreation
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
    // InternalSqlDsl.g:3927:1: rule__Creation__ConstaintsAssignment_2_0_2_0 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3931:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:3932:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:3932:2: ( ruleConstaint )
            // InternalSqlDsl.g:3933:3: ruleConstaint
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
    // InternalSqlDsl.g:3942:1: rule__Creation__ConstaintsAssignment_2_0_2_1_1 : ( ruleConstaint ) ;
    public final void rule__Creation__ConstaintsAssignment_2_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3946:1: ( ( ruleConstaint ) )
            // InternalSqlDsl.g:3947:2: ( ruleConstaint )
            {
            // InternalSqlDsl.g:3947:2: ( ruleConstaint )
            // InternalSqlDsl.g:3948:3: ruleConstaint
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
    // InternalSqlDsl.g:3957:1: rule__Creation__TypeAssignment_2_1_0 : ( ( 'INDEX' ) ) ;
    public final void rule__Creation__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3961:1: ( ( ( 'INDEX' ) ) )
            // InternalSqlDsl.g:3962:2: ( ( 'INDEX' ) )
            {
            // InternalSqlDsl.g:3962:2: ( ( 'INDEX' ) )
            // InternalSqlDsl.g:3963:3: ( 'INDEX' )
            {
             before(grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0()); 
            // InternalSqlDsl.g:3964:3: ( 'INDEX' )
            // InternalSqlDsl.g:3965:4: 'INDEX'
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
    // InternalSqlDsl.g:3976:1: rule__Creation__NameAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__Creation__NameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3980:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:3981:2: ( ruleEString )
            {
            // InternalSqlDsl.g:3981:2: ( ruleEString )
            // InternalSqlDsl.g:3982:3: ruleEString
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
    // InternalSqlDsl.g:3991:1: rule__Creation__ObjectsAssignment_2_1_3 : ( ruleTable ) ;
    public final void rule__Creation__ObjectsAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:3995:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:3996:2: ( ruleTable )
            {
            // InternalSqlDsl.g:3996:2: ( ruleTable )
            // InternalSqlDsl.g:3997:3: ruleTable
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
    // InternalSqlDsl.g:4006:1: rule__Update__ObjectsAssignment_2 : ( ruleTable ) ;
    public final void rule__Update__ObjectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4010:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:4011:2: ( ruleTable )
            {
            // InternalSqlDsl.g:4011:2: ( ruleTable )
            // InternalSqlDsl.g:4012:3: ruleTable
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
    // InternalSqlDsl.g:4021:1: rule__Update__ClausesAssignment_3 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4025:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:4026:2: ( ruleClause )
            {
            // InternalSqlDsl.g:4026:2: ( ruleClause )
            // InternalSqlDsl.g:4027:3: ruleClause
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
    // InternalSqlDsl.g:4036:1: rule__Update__ClausesAssignment_4_1 : ( ruleClause ) ;
    public final void rule__Update__ClausesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4040:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:4041:2: ( ruleClause )
            {
            // InternalSqlDsl.g:4041:2: ( ruleClause )
            // InternalSqlDsl.g:4042:3: ruleClause
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
    // InternalSqlDsl.g:4051:1: rule__Insertion__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Insertion__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4055:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:4056:2: ( ruleTable )
            {
            // InternalSqlDsl.g:4056:2: ( ruleTable )
            // InternalSqlDsl.g:4057:3: ruleTable
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
    // InternalSqlDsl.g:4066:1: rule__Insertion__ValuesAssignment_6 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4070:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:4071:2: ( ruleValue )
            {
            // InternalSqlDsl.g:4071:2: ( ruleValue )
            // InternalSqlDsl.g:4072:3: ruleValue
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
    // InternalSqlDsl.g:4081:1: rule__Insertion__ValuesAssignment_7_1 : ( ruleValue ) ;
    public final void rule__Insertion__ValuesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4085:1: ( ( ruleValue ) )
            // InternalSqlDsl.g:4086:2: ( ruleValue )
            {
            // InternalSqlDsl.g:4086:2: ( ruleValue )
            // InternalSqlDsl.g:4087:3: ruleValue
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
    // InternalSqlDsl.g:4096:1: rule__Delete__ObjectsAssignment_3 : ( ruleTable ) ;
    public final void rule__Delete__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4100:1: ( ( ruleTable ) )
            // InternalSqlDsl.g:4101:2: ( ruleTable )
            {
            // InternalSqlDsl.g:4101:2: ( ruleTable )
            // InternalSqlDsl.g:4102:3: ruleTable
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
    // InternalSqlDsl.g:4111:1: rule__Delete__ClausesAssignment_4_0 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4115:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:4116:2: ( ruleClause )
            {
            // InternalSqlDsl.g:4116:2: ( ruleClause )
            // InternalSqlDsl.g:4117:3: ruleClause
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
    // InternalSqlDsl.g:4126:1: rule__Delete__ClausesAssignment_4_1_1 : ( ruleClause ) ;
    public final void rule__Delete__ClausesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4130:1: ( ( ruleClause ) )
            // InternalSqlDsl.g:4131:2: ( ruleClause )
            {
            // InternalSqlDsl.g:4131:2: ( ruleClause )
            // InternalSqlDsl.g:4132:3: ruleClause
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
    // InternalSqlDsl.g:4141:1: rule__Table__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4145:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4146:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4146:2: ( ruleEString )
            // InternalSqlDsl.g:4147:3: ruleEString
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
    // InternalSqlDsl.g:4156:1: rule__Table__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4160:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:4161:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:4161:2: ( ruleColumn )
            // InternalSqlDsl.g:4162:3: ruleColumn
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
    // InternalSqlDsl.g:4171:1: rule__Table__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4175:1: ( ( ruleColumn ) )
            // InternalSqlDsl.g:4176:2: ( ruleColumn )
            {
            // InternalSqlDsl.g:4176:2: ( ruleColumn )
            // InternalSqlDsl.g:4177:3: ruleColumn
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
    // InternalSqlDsl.g:4186:1: rule__TableOnCreation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TableOnCreation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4190:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4191:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4191:2: ( ruleEString )
            // InternalSqlDsl.g:4192:3: ruleEString
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
    // InternalSqlDsl.g:4201:1: rule__TableOnCreation__ColumnsAssignment_3 : ( ruleColumnOnCreation ) ;
    public final void rule__TableOnCreation__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4205:1: ( ( ruleColumnOnCreation ) )
            // InternalSqlDsl.g:4206:2: ( ruleColumnOnCreation )
            {
            // InternalSqlDsl.g:4206:2: ( ruleColumnOnCreation )
            // InternalSqlDsl.g:4207:3: ruleColumnOnCreation
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
    // InternalSqlDsl.g:4216:1: rule__TableOnCreation__ColumnsAssignment_4_1 : ( ruleColumnOnCreation ) ;
    public final void rule__TableOnCreation__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4220:1: ( ( ruleColumnOnCreation ) )
            // InternalSqlDsl.g:4221:2: ( ruleColumnOnCreation )
            {
            // InternalSqlDsl.g:4221:2: ( ruleColumnOnCreation )
            // InternalSqlDsl.g:4222:3: ruleColumnOnCreation
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
    // InternalSqlDsl.g:4231:1: rule__Column__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4235:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4236:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4236:2: ( ruleEString )
            // InternalSqlDsl.g:4237:3: ruleEString
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
    // InternalSqlDsl.g:4246:1: rule__ColumnOnCreation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnOnCreation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4250:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4251:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4251:2: ( ruleEString )
            // InternalSqlDsl.g:4252:3: ruleEString
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
    // InternalSqlDsl.g:4261:1: rule__ColumnOnCreation__TypeAssignment_2 : ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) ) ;
    public final void rule__ColumnOnCreation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4265:1: ( ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) ) )
            // InternalSqlDsl.g:4266:2: ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) )
            {
            // InternalSqlDsl.g:4266:2: ( ( rule__ColumnOnCreation__TypeAlternatives_2_0 ) )
            // InternalSqlDsl.g:4267:3: ( rule__ColumnOnCreation__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getColumnOnCreationAccess().getTypeAlternatives_2_0()); 
            // InternalSqlDsl.g:4268:3: ( rule__ColumnOnCreation__TypeAlternatives_2_0 )
            // InternalSqlDsl.g:4268:4: rule__ColumnOnCreation__TypeAlternatives_2_0
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
    // InternalSqlDsl.g:4276:1: rule__ColumnOnCreation__ConstaintsAssignment_3 : ( ruleConstaintOnCreation ) ;
    public final void rule__ColumnOnCreation__ConstaintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4280:1: ( ( ruleConstaintOnCreation ) )
            // InternalSqlDsl.g:4281:2: ( ruleConstaintOnCreation )
            {
            // InternalSqlDsl.g:4281:2: ( ruleConstaintOnCreation )
            // InternalSqlDsl.g:4282:3: ruleConstaintOnCreation
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
    // InternalSqlDsl.g:4291:1: rule__Constaint__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Constaint__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4295:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:4296:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:4296:2: ( ruleComplexString )
            // InternalSqlDsl.g:4297:3: ruleComplexString
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
    // InternalSqlDsl.g:4306:1: rule__ConstaintOnCreation__BodyAssignment : ( ruleComplexString ) ;
    public final void rule__ConstaintOnCreation__BodyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4310:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:4311:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:4311:2: ( ruleComplexString )
            // InternalSqlDsl.g:4312:3: ruleComplexString
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
    // InternalSqlDsl.g:4321:1: rule__Clause__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Clause__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4325:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4326:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4326:2: ( ruleEString )
            // InternalSqlDsl.g:4327:3: ruleEString
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
    // InternalSqlDsl.g:4336:1: rule__Clause__BodyAssignment_1 : ( ruleComplexString ) ;
    public final void rule__Clause__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4340:1: ( ( ruleComplexString ) )
            // InternalSqlDsl.g:4341:2: ( ruleComplexString )
            {
            // InternalSqlDsl.g:4341:2: ( ruleComplexString )
            // InternalSqlDsl.g:4342:3: ruleComplexString
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
    // InternalSqlDsl.g:4351:1: rule__Value__ColumnvaluesAssignment_3_0 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4355:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:4356:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:4356:2: ( ruleColumnValue )
            // InternalSqlDsl.g:4357:3: ruleColumnValue
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
    // InternalSqlDsl.g:4366:1: rule__Value__ColumnvaluesAssignment_3_1_1 : ( ruleColumnValue ) ;
    public final void rule__Value__ColumnvaluesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4370:1: ( ( ruleColumnValue ) )
            // InternalSqlDsl.g:4371:2: ( ruleColumnValue )
            {
            // InternalSqlDsl.g:4371:2: ( ruleColumnValue )
            // InternalSqlDsl.g:4372:3: ruleColumnValue
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
    // InternalSqlDsl.g:4381:1: rule__ColumnValue__ValueAssignment_1 : ( ruleEString ) ;
    public final void rule__ColumnValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSqlDsl.g:4385:1: ( ( ruleEString ) )
            // InternalSqlDsl.g:4386:2: ( ruleEString )
            {
            // InternalSqlDsl.g:4386:2: ( ruleEString )
            // InternalSqlDsl.g:4387:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000086C000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000086C000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000007FF800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001F4000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001F0000000032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001F0000000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008002000000L});

}
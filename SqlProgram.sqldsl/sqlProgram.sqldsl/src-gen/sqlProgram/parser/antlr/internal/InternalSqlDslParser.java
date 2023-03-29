package sqlProgram.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sqlProgram.services.SqlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'SELECT'", "'FROM'", "','", "'CREATE'", "'TABLE'", "'INDEX'", "'ON'", "'UPDATE'", "'INSERT'", "'INTO'", "'VALUES'", "'{'", "'}'", "'DELETE'", "'int'", "'float'", "'varchar(100)'", "'char(100)'", "'text'", "'date'", "'INT'", "'FLOAT'", "'VARCHAR(100)'", "'CHAR(100)'", "'TEXT'", "'DATE'", "'CONSTRAINT'", "'Value'", "'('", "')'", "'.'", "'*'", "'='", "'<'", "'>'"
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

        public InternalSqlDslParser(TokenStream input, SqlDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SqlProgram";
       	}

       	@Override
       	protected SqlDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSqlProgram"
    // InternalSqlDsl.g:64:1: entryRuleSqlProgram returns [EObject current=null] : iv_ruleSqlProgram= ruleSqlProgram EOF ;
    public final EObject entryRuleSqlProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlProgram = null;


        try {
            // InternalSqlDsl.g:64:51: (iv_ruleSqlProgram= ruleSqlProgram EOF )
            // InternalSqlDsl.g:65:2: iv_ruleSqlProgram= ruleSqlProgram EOF
            {
             newCompositeNode(grammarAccess.getSqlProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqlProgram=ruleSqlProgram();

            state._fsp--;

             current =iv_ruleSqlProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqlProgram"


    // $ANTLR start "ruleSqlProgram"
    // InternalSqlDsl.g:71:1: ruleSqlProgram returns [EObject current=null] : ( () ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )* ) ;
    public final EObject ruleSqlProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_queries_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:77:2: ( ( () ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )* ) )
            // InternalSqlDsl.g:78:2: ( () ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )* )
            {
            // InternalSqlDsl.g:78:2: ( () ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )* )
            // InternalSqlDsl.g:79:3: () ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )*
            {
            // InternalSqlDsl.g:79:3: ()
            // InternalSqlDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSqlProgramAccess().getSqlProgramAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:86:3: ( ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15||(LA1_0>=19 && LA1_0<=20)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSqlDsl.g:87:4: ( (lv_queries_1_0= ruleQueries ) ) otherlv_2= ';'
            	    {
            	    // InternalSqlDsl.g:87:4: ( (lv_queries_1_0= ruleQueries ) )
            	    // InternalSqlDsl.g:88:5: (lv_queries_1_0= ruleQueries )
            	    {
            	    // InternalSqlDsl.g:88:5: (lv_queries_1_0= ruleQueries )
            	    // InternalSqlDsl.g:89:6: lv_queries_1_0= ruleQueries
            	    {

            	    						newCompositeNode(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_queries_1_0=ruleQueries();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSqlProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"queries",
            	    							lv_queries_1_0,
            	    							"sqlProgram.SqlDsl.Queries");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSqlProgramAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqlProgram"


    // $ANTLR start "entryRuleQueries"
    // InternalSqlDsl.g:115:1: entryRuleQueries returns [EObject current=null] : iv_ruleQueries= ruleQueries EOF ;
    public final EObject entryRuleQueries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueries = null;


        try {
            // InternalSqlDsl.g:115:48: (iv_ruleQueries= ruleQueries EOF )
            // InternalSqlDsl.g:116:2: iv_ruleQueries= ruleQueries EOF
            {
             newCompositeNode(grammarAccess.getQueriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueries=ruleQueries();

            state._fsp--;

             current =iv_ruleQueries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueries"


    // $ANTLR start "ruleQueries"
    // InternalSqlDsl.g:122:1: ruleQueries returns [EObject current=null] : (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete ) ;
    public final EObject ruleQueries() throws RecognitionException {
        EObject current = null;

        EObject this_Selection_0 = null;

        EObject this_Creation_1 = null;

        EObject this_Update_2 = null;

        EObject this_Insertion_3 = null;

        EObject this_Delete_4 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:128:2: ( (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete ) )
            // InternalSqlDsl.g:129:2: (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete )
            {
            // InternalSqlDsl.g:129:2: (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSqlDsl.g:130:3: this_Selection_0= ruleSelection
                    {

                    			newCompositeNode(grammarAccess.getQueriesAccess().getSelectionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selection_0=ruleSelection();

                    state._fsp--;


                    			current = this_Selection_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:139:3: this_Creation_1= ruleCreation
                    {

                    			newCompositeNode(grammarAccess.getQueriesAccess().getCreationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Creation_1=ruleCreation();

                    state._fsp--;


                    			current = this_Creation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:148:3: this_Update_2= ruleUpdate
                    {

                    			newCompositeNode(grammarAccess.getQueriesAccess().getUpdateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Update_2=ruleUpdate();

                    state._fsp--;


                    			current = this_Update_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:157:3: this_Insertion_3= ruleInsertion
                    {

                    			newCompositeNode(grammarAccess.getQueriesAccess().getInsertionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insertion_3=ruleInsertion();

                    state._fsp--;


                    			current = this_Insertion_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:166:3: this_Delete_4= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getQueriesAccess().getDeleteParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_4=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueries"


    // $ANTLR start "entryRuleSelection"
    // InternalSqlDsl.g:178:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalSqlDsl.g:178:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalSqlDsl.g:179:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalSqlDsl.g:185:1: ruleSelection returns [EObject current=null] : ( () otherlv_1= 'SELECT' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )* ( (lv_clauses_6_0= ruleClause ) )* ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_objects_3_0 = null;

        EObject lv_objects_5_0 = null;

        EObject lv_clauses_6_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:191:2: ( ( () otherlv_1= 'SELECT' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )* ( (lv_clauses_6_0= ruleClause ) )* ) )
            // InternalSqlDsl.g:192:2: ( () otherlv_1= 'SELECT' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )* ( (lv_clauses_6_0= ruleClause ) )* )
            {
            // InternalSqlDsl.g:192:2: ( () otherlv_1= 'SELECT' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )* ( (lv_clauses_6_0= ruleClause ) )* )
            // InternalSqlDsl.g:193:3: () otherlv_1= 'SELECT' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )* ( (lv_clauses_6_0= ruleClause ) )*
            {
            // InternalSqlDsl.g:193:3: ()
            // InternalSqlDsl.g:194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectionAccess().getSelectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getSELECTKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getFROMKeyword_2());
            		
            // InternalSqlDsl.g:208:3: ( (lv_objects_3_0= ruleTable ) )
            // InternalSqlDsl.g:209:4: (lv_objects_3_0= ruleTable )
            {
            // InternalSqlDsl.g:209:4: (lv_objects_3_0= ruleTable )
            // InternalSqlDsl.g:210:5: lv_objects_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_objects_3_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectionRule());
            					}
            					add(
            						current,
            						"objects",
            						lv_objects_3_0,
            						"sqlProgram.SqlDsl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:227:3: (otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSqlDsl.g:228:4: otherlv_4= ',' ( (lv_objects_5_0= ruleTable ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSqlDsl.g:232:4: ( (lv_objects_5_0= ruleTable ) )
            	    // InternalSqlDsl.g:233:5: (lv_objects_5_0= ruleTable )
            	    {
            	    // InternalSqlDsl.g:233:5: (lv_objects_5_0= ruleTable )
            	    // InternalSqlDsl.g:234:6: lv_objects_5_0= ruleTable
            	    {

            	    						newCompositeNode(grammarAccess.getSelectionAccess().getObjectsTableParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_objects_5_0=ruleTable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_5_0,
            	    							"sqlProgram.SqlDsl.Table");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSqlDsl.g:252:3: ( (lv_clauses_6_0= ruleClause ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSqlDsl.g:253:4: (lv_clauses_6_0= ruleClause )
            	    {
            	    // InternalSqlDsl.g:253:4: (lv_clauses_6_0= ruleClause )
            	    // InternalSqlDsl.g:254:5: lv_clauses_6_0= ruleClause
            	    {

            	    					newCompositeNode(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_clauses_6_0=ruleClause();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clauses",
            	    						lv_clauses_6_0,
            	    						"sqlProgram.SqlDsl.Clause");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleCreation"
    // InternalSqlDsl.g:275:1: entryRuleCreation returns [EObject current=null] : iv_ruleCreation= ruleCreation EOF ;
    public final EObject entryRuleCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreation = null;


        try {
            // InternalSqlDsl.g:275:49: (iv_ruleCreation= ruleCreation EOF )
            // InternalSqlDsl.g:276:2: iv_ruleCreation= ruleCreation EOF
            {
             newCompositeNode(grammarAccess.getCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreation=ruleCreation();

            state._fsp--;

             current =iv_ruleCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreation"


    // $ANTLR start "ruleCreation"
    // InternalSqlDsl.g:282:1: ruleCreation returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) ) ) ;
    public final EObject ruleCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_5=null;
        Token lv_type_7_0=null;
        Token otherlv_9=null;
        EObject lv_objects_3_0 = null;

        EObject lv_constaints_4_0 = null;

        EObject lv_constaints_6_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        EObject lv_objects_10_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:288:2: ( ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) ) ) )
            // InternalSqlDsl.g:289:2: ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) ) )
            {
            // InternalSqlDsl.g:289:2: ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) ) )
            // InternalSqlDsl.g:290:3: () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) )
            {
            // InternalSqlDsl.g:290:3: ()
            // InternalSqlDsl.g:291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreationAccess().getCreationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCreationAccess().getCREATEKeyword_1());
            		
            // InternalSqlDsl.g:301:3: ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSqlDsl.g:302:4: ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? )
                    {
                    // InternalSqlDsl.g:302:4: ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? )
                    // InternalSqlDsl.g:303:5: ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTableOnCreation ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )?
                    {
                    // InternalSqlDsl.g:303:5: ( (lv_type_2_0= 'TABLE' ) )
                    // InternalSqlDsl.g:304:6: (lv_type_2_0= 'TABLE' )
                    {
                    // InternalSqlDsl.g:304:6: (lv_type_2_0= 'TABLE' )
                    // InternalSqlDsl.g:305:7: lv_type_2_0= 'TABLE'
                    {
                    lv_type_2_0=(Token)match(input,16,FOLLOW_6); 

                    							newLeafNode(lv_type_2_0, grammarAccess.getCreationAccess().getTypeTABLEKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCreationRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_2_0, "TABLE");
                    						

                    }


                    }

                    // InternalSqlDsl.g:317:5: ( (lv_objects_3_0= ruleTableOnCreation ) )
                    // InternalSqlDsl.g:318:6: (lv_objects_3_0= ruleTableOnCreation )
                    {
                    // InternalSqlDsl.g:318:6: (lv_objects_3_0= ruleTableOnCreation )
                    // InternalSqlDsl.g:319:7: lv_objects_3_0= ruleTableOnCreation
                    {

                    							newCompositeNode(grammarAccess.getCreationAccess().getObjectsTableOnCreationParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_objects_3_0=ruleTableOnCreation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    							}
                    							add(
                    								current,
                    								"objects",
                    								lv_objects_3_0,
                    								"sqlProgram.SqlDsl.TableOnCreation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalSqlDsl.g:336:5: ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==38) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSqlDsl.g:337:6: ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )*
                            {
                            // InternalSqlDsl.g:337:6: ( (lv_constaints_4_0= ruleConstaint ) )
                            // InternalSqlDsl.g:338:7: (lv_constaints_4_0= ruleConstaint )
                            {
                            // InternalSqlDsl.g:338:7: (lv_constaints_4_0= ruleConstaint )
                            // InternalSqlDsl.g:339:8: lv_constaints_4_0= ruleConstaint
                            {

                            								newCompositeNode(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_0_0());
                            							
                            pushFollow(FOLLOW_11);
                            lv_constaints_4_0=ruleConstaint();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getCreationRule());
                            								}
                            								add(
                            									current,
                            									"constaints",
                            									lv_constaints_4_0,
                            									"sqlProgram.SqlDsl.Constaint");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalSqlDsl.g:356:6: (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==14) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalSqlDsl.g:357:7: otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) )
                            	    {
                            	    otherlv_5=(Token)match(input,14,FOLLOW_12); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getCreationAccess().getCommaKeyword_2_0_2_1_0());
                            	    						
                            	    // InternalSqlDsl.g:361:7: ( (lv_constaints_6_0= ruleConstaint ) )
                            	    // InternalSqlDsl.g:362:8: (lv_constaints_6_0= ruleConstaint )
                            	    {
                            	    // InternalSqlDsl.g:362:8: (lv_constaints_6_0= ruleConstaint )
                            	    // InternalSqlDsl.g:363:9: lv_constaints_6_0= ruleConstaint
                            	    {

                            	    									newCompositeNode(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_2_0_2_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_11);
                            	    lv_constaints_6_0=ruleConstaint();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getCreationRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"constaints",
                            	    										lv_constaints_6_0,
                            	    										"sqlProgram.SqlDsl.Constaint");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:384:4: ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) )
                    {
                    // InternalSqlDsl.g:384:4: ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) ) )
                    // InternalSqlDsl.g:385:5: ( (lv_type_7_0= 'INDEX' ) ) ( (lv_name_8_0= ruleEString ) )? otherlv_9= 'ON' ( (lv_objects_10_0= ruleTable ) )
                    {
                    // InternalSqlDsl.g:385:5: ( (lv_type_7_0= 'INDEX' ) )
                    // InternalSqlDsl.g:386:6: (lv_type_7_0= 'INDEX' )
                    {
                    // InternalSqlDsl.g:386:6: (lv_type_7_0= 'INDEX' )
                    // InternalSqlDsl.g:387:7: lv_type_7_0= 'INDEX'
                    {
                    lv_type_7_0=(Token)match(input,17,FOLLOW_13); 

                    							newLeafNode(lv_type_7_0, grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCreationRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_7_0, "INDEX");
                    						

                    }


                    }

                    // InternalSqlDsl.g:399:5: ( (lv_name_8_0= ruleEString ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSqlDsl.g:400:6: (lv_name_8_0= ruleEString )
                            {
                            // InternalSqlDsl.g:400:6: (lv_name_8_0= ruleEString )
                            // InternalSqlDsl.g:401:7: lv_name_8_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getCreationAccess().getNameEStringParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_name_8_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getCreationRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_8_0,
                            								"sqlProgram.SqlDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_6); 

                    					newLeafNode(otherlv_9, grammarAccess.getCreationAccess().getONKeyword_2_1_2());
                    				
                    // InternalSqlDsl.g:422:5: ( (lv_objects_10_0= ruleTable ) )
                    // InternalSqlDsl.g:423:6: (lv_objects_10_0= ruleTable )
                    {
                    // InternalSqlDsl.g:423:6: (lv_objects_10_0= ruleTable )
                    // InternalSqlDsl.g:424:7: lv_objects_10_0= ruleTable
                    {

                    							newCompositeNode(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_3_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_objects_10_0=ruleTable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    							}
                    							add(
                    								current,
                    								"objects",
                    								lv_objects_10_0,
                    								"sqlProgram.SqlDsl.Table");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreation"


    // $ANTLR start "entryRuleUpdate"
    // InternalSqlDsl.g:447:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalSqlDsl.g:447:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalSqlDsl.g:448:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalSqlDsl.g:454:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objects_2_0 = null;

        EObject lv_clauses_3_0 = null;

        EObject lv_clauses_5_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:460:2: ( ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* ) )
            // InternalSqlDsl.g:461:2: ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* )
            {
            // InternalSqlDsl.g:461:2: ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* )
            // InternalSqlDsl.g:462:3: () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )*
            {
            // InternalSqlDsl.g:462:3: ()
            // InternalSqlDsl.g:463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUPDATEKeyword_1());
            		
            // InternalSqlDsl.g:473:3: ( (lv_objects_2_0= ruleTable ) )
            // InternalSqlDsl.g:474:4: (lv_objects_2_0= ruleTable )
            {
            // InternalSqlDsl.g:474:4: (lv_objects_2_0= ruleTable )
            // InternalSqlDsl.g:475:5: lv_objects_2_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getObjectsTableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_objects_2_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"objects",
            						lv_objects_2_0,
            						"sqlProgram.SqlDsl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:492:3: ( (lv_clauses_3_0= ruleClause ) )
            // InternalSqlDsl.g:493:4: (lv_clauses_3_0= ruleClause )
            {
            // InternalSqlDsl.g:493:4: (lv_clauses_3_0= ruleClause )
            // InternalSqlDsl.g:494:5: lv_clauses_3_0= ruleClause
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_clauses_3_0=ruleClause();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"clauses",
            						lv_clauses_3_0,
            						"sqlProgram.SqlDsl.Clause");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:511:3: (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:512:4: otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSqlDsl.g:516:4: ( (lv_clauses_5_0= ruleClause ) )
            	    // InternalSqlDsl.g:517:5: (lv_clauses_5_0= ruleClause )
            	    {
            	    // InternalSqlDsl.g:517:5: (lv_clauses_5_0= ruleClause )
            	    // InternalSqlDsl.g:518:6: lv_clauses_5_0= ruleClause
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_clauses_5_0=ruleClause();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"clauses",
            	    							lv_clauses_5_0,
            	    							"sqlProgram.SqlDsl.Clause");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleInsertion"
    // InternalSqlDsl.g:540:1: entryRuleInsertion returns [EObject current=null] : iv_ruleInsertion= ruleInsertion EOF ;
    public final EObject entryRuleInsertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertion = null;


        try {
            // InternalSqlDsl.g:540:50: (iv_ruleInsertion= ruleInsertion EOF )
            // InternalSqlDsl.g:541:2: iv_ruleInsertion= ruleInsertion EOF
            {
             newCompositeNode(grammarAccess.getInsertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertion=ruleInsertion();

            state._fsp--;

             current =iv_ruleInsertion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertion"


    // $ANTLR start "ruleInsertion"
    // InternalSqlDsl.g:547:1: ruleInsertion returns [EObject current=null] : ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) otherlv_4= 'VALUES' otherlv_5= '{' ( (lv_values_6_0= ruleValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleInsertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_objects_3_0 = null;

        EObject lv_values_6_0 = null;

        EObject lv_values_8_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:553:2: ( ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) otherlv_4= 'VALUES' otherlv_5= '{' ( (lv_values_6_0= ruleValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )* otherlv_9= '}' ) )
            // InternalSqlDsl.g:554:2: ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) otherlv_4= 'VALUES' otherlv_5= '{' ( (lv_values_6_0= ruleValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )* otherlv_9= '}' )
            {
            // InternalSqlDsl.g:554:2: ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) otherlv_4= 'VALUES' otherlv_5= '{' ( (lv_values_6_0= ruleValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )* otherlv_9= '}' )
            // InternalSqlDsl.g:555:3: () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) otherlv_4= 'VALUES' otherlv_5= '{' ( (lv_values_6_0= ruleValue ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )* otherlv_9= '}'
            {
            // InternalSqlDsl.g:555:3: ()
            // InternalSqlDsl.g:556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInsertionAccess().getInsertionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertionAccess().getINSERTKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertionAccess().getINTOKeyword_2());
            		
            // InternalSqlDsl.g:570:3: ( (lv_objects_3_0= ruleTable ) )
            // InternalSqlDsl.g:571:4: (lv_objects_3_0= ruleTable )
            {
            // InternalSqlDsl.g:571:4: (lv_objects_3_0= ruleTable )
            // InternalSqlDsl.g:572:5: lv_objects_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getInsertionAccess().getObjectsTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_objects_3_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertionRule());
            					}
            					add(
            						current,
            						"objects",
            						lv_objects_3_0,
            						"sqlProgram.SqlDsl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertionAccess().getVALUESKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSqlDsl.g:597:3: ( (lv_values_6_0= ruleValue ) )
            // InternalSqlDsl.g:598:4: (lv_values_6_0= ruleValue )
            {
            // InternalSqlDsl.g:598:4: (lv_values_6_0= ruleValue )
            // InternalSqlDsl.g:599:5: lv_values_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_values_6_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_6_0,
            						"sqlProgram.SqlDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:616:3: (otherlv_7= ',' ( (lv_values_8_0= ruleValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSqlDsl.g:617:4: otherlv_7= ',' ( (lv_values_8_0= ruleValue ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_18); 

            	    				newLeafNode(otherlv_7, grammarAccess.getInsertionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalSqlDsl.g:621:4: ( (lv_values_8_0= ruleValue ) )
            	    // InternalSqlDsl.g:622:5: (lv_values_8_0= ruleValue )
            	    {
            	    // InternalSqlDsl.g:622:5: (lv_values_8_0= ruleValue )
            	    // InternalSqlDsl.g:623:6: lv_values_8_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_values_8_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_8_0,
            	    							"sqlProgram.SqlDsl.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertion"


    // $ANTLR start "entryRuleDelete"
    // InternalSqlDsl.g:649:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalSqlDsl.g:649:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalSqlDsl.g:650:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalSqlDsl.g:656:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_objects_3_0 = null;

        EObject lv_clauses_4_0 = null;

        EObject lv_clauses_6_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:662:2: ( ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? ) )
            // InternalSqlDsl.g:663:2: ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? )
            {
            // InternalSqlDsl.g:663:2: ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? )
            // InternalSqlDsl.g:664:3: () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )?
            {
            // InternalSqlDsl.g:664:3: ()
            // InternalSqlDsl.g:665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDELETEKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getFROMKeyword_2());
            		
            // InternalSqlDsl.g:679:3: ( (lv_objects_3_0= ruleTable ) )
            // InternalSqlDsl.g:680:4: (lv_objects_3_0= ruleTable )
            {
            // InternalSqlDsl.g:680:4: (lv_objects_3_0= ruleTable )
            // InternalSqlDsl.g:681:5: lv_objects_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getObjectsTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_objects_3_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					add(
            						current,
            						"objects",
            						lv_objects_3_0,
            						"sqlProgram.SqlDsl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:698:3: ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlDsl.g:699:4: ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )*
                    {
                    // InternalSqlDsl.g:699:4: ( (lv_clauses_4_0= ruleClause ) )
                    // InternalSqlDsl.g:700:5: (lv_clauses_4_0= ruleClause )
                    {
                    // InternalSqlDsl.g:700:5: (lv_clauses_4_0= ruleClause )
                    // InternalSqlDsl.g:701:6: lv_clauses_4_0= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_clauses_4_0=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteRule());
                    						}
                    						add(
                    							current,
                    							"clauses",
                    							lv_clauses_4_0,
                    							"sqlProgram.SqlDsl.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:718:4: (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSqlDsl.g:719:5: otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSqlDsl.g:723:5: ( (lv_clauses_6_0= ruleClause ) )
                    	    // InternalSqlDsl.g:724:6: (lv_clauses_6_0= ruleClause )
                    	    {
                    	    // InternalSqlDsl.g:724:6: (lv_clauses_6_0= ruleClause )
                    	    // InternalSqlDsl.g:725:7: lv_clauses_6_0= ruleClause
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_clauses_6_0=ruleClause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clauses",
                    	    								lv_clauses_6_0,
                    	    								"sqlProgram.SqlDsl.Clause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleEString"
    // InternalSqlDsl.g:748:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSqlDsl.g:748:47: (iv_ruleEString= ruleEString EOF )
            // InternalSqlDsl.g:749:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSqlDsl.g:755:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSqlDsl.g:761:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSqlDsl.g:762:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSqlDsl.g:762:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSqlDsl.g:763:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:771:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTable"
    // InternalSqlDsl.g:782:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSqlDsl.g:782:46: (iv_ruleTable= ruleTable EOF )
            // InternalSqlDsl.g:783:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSqlDsl.g:789:1: ruleTable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:795:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' ) )
            // InternalSqlDsl.g:796:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' )
            {
            // InternalSqlDsl.g:796:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' )
            // InternalSqlDsl.g:797:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}'
            {
            // InternalSqlDsl.g:797:3: ()
            // InternalSqlDsl.g:798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:804:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:805:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:805:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:806:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:827:3: ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:828:4: ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    {
                    // InternalSqlDsl.g:828:4: ( (lv_columns_3_0= ruleColumn ) )
                    // InternalSqlDsl.g:829:5: (lv_columns_3_0= ruleColumn )
                    {
                    // InternalSqlDsl.g:829:5: (lv_columns_3_0= ruleColumn )
                    // InternalSqlDsl.g:830:6: lv_columns_3_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_columns_3_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_3_0,
                    							"sqlProgram.SqlDsl.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:847:4: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSqlDsl.g:848:5: otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSqlDsl.g:852:5: ( (lv_columns_5_0= ruleColumn ) )
                    	    // InternalSqlDsl.g:853:6: (lv_columns_5_0= ruleColumn )
                    	    {
                    	    // InternalSqlDsl.g:853:6: (lv_columns_5_0= ruleColumn )
                    	    // InternalSqlDsl.g:854:7: lv_columns_5_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_columns_5_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_5_0,
                    	    								"sqlProgram.SqlDsl.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableOnCreation"
    // InternalSqlDsl.g:881:1: entryRuleTableOnCreation returns [EObject current=null] : iv_ruleTableOnCreation= ruleTableOnCreation EOF ;
    public final EObject entryRuleTableOnCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableOnCreation = null;


        try {
            // InternalSqlDsl.g:881:56: (iv_ruleTableOnCreation= ruleTableOnCreation EOF )
            // InternalSqlDsl.g:882:2: iv_ruleTableOnCreation= ruleTableOnCreation EOF
            {
             newCompositeNode(grammarAccess.getTableOnCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableOnCreation=ruleTableOnCreation();

            state._fsp--;

             current =iv_ruleTableOnCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTableOnCreation"


    // $ANTLR start "ruleTableOnCreation"
    // InternalSqlDsl.g:888:1: ruleTableOnCreation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumnOnCreation ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTableOnCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:894:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumnOnCreation ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )* otherlv_6= '}' ) )
            // InternalSqlDsl.g:895:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumnOnCreation ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )* otherlv_6= '}' )
            {
            // InternalSqlDsl.g:895:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumnOnCreation ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )* otherlv_6= '}' )
            // InternalSqlDsl.g:896:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumnOnCreation ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )* otherlv_6= '}'
            {
            // InternalSqlDsl.g:896:3: ()
            // InternalSqlDsl.g:897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableOnCreationAccess().getTableAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:903:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:904:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:904:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:905:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableOnCreationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableOnCreationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTableOnCreationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:926:3: ( (lv_columns_3_0= ruleColumnOnCreation ) )
            // InternalSqlDsl.g:927:4: (lv_columns_3_0= ruleColumnOnCreation )
            {
            // InternalSqlDsl.g:927:4: (lv_columns_3_0= ruleColumnOnCreation )
            // InternalSqlDsl.g:928:5: lv_columns_3_0= ruleColumnOnCreation
            {

            					newCompositeNode(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_columns_3_0=ruleColumnOnCreation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableOnCreationRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"sqlProgram.SqlDsl.ColumnOnCreation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:945:3: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSqlDsl.g:946:4: otherlv_4= ',' ( (lv_columns_5_0= ruleColumnOnCreation ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableOnCreationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSqlDsl.g:950:4: ( (lv_columns_5_0= ruleColumnOnCreation ) )
            	    // InternalSqlDsl.g:951:5: (lv_columns_5_0= ruleColumnOnCreation )
            	    {
            	    // InternalSqlDsl.g:951:5: (lv_columns_5_0= ruleColumnOnCreation )
            	    // InternalSqlDsl.g:952:6: lv_columns_5_0= ruleColumnOnCreation
            	    {

            	    						newCompositeNode(grammarAccess.getTableOnCreationAccess().getColumnsColumnOnCreationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_columns_5_0=ruleColumnOnCreation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableOnCreationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"sqlProgram.SqlDsl.ColumnOnCreation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableOnCreationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTableOnCreation"


    // $ANTLR start "entryRuleColumn"
    // InternalSqlDsl.g:978:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSqlDsl.g:978:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSqlDsl.g:979:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalSqlDsl.g:985:1: ruleColumn returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:991:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSqlDsl.g:992:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSqlDsl.g:992:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalSqlDsl.g:993:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalSqlDsl.g:993:3: ()
            // InternalSqlDsl.g:994:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:1000:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:1001:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:1001:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:1002:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnOnCreation"
    // InternalSqlDsl.g:1023:1: entryRuleColumnOnCreation returns [EObject current=null] : iv_ruleColumnOnCreation= ruleColumnOnCreation EOF ;
    public final EObject entryRuleColumnOnCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnOnCreation = null;


        try {
            // InternalSqlDsl.g:1023:57: (iv_ruleColumnOnCreation= ruleColumnOnCreation EOF )
            // InternalSqlDsl.g:1024:2: iv_ruleColumnOnCreation= ruleColumnOnCreation EOF
            {
             newCompositeNode(grammarAccess.getColumnOnCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnOnCreation=ruleColumnOnCreation();

            state._fsp--;

             current =iv_ruleColumnOnCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnOnCreation"


    // $ANTLR start "ruleColumnOnCreation"
    // InternalSqlDsl.g:1030:1: ruleColumnOnCreation returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) ) ( (lv_constaints_3_0= ruleConstaintOnCreation ) )? ) ;
    public final EObject ruleColumnOnCreation() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        Token lv_type_2_3=null;
        Token lv_type_2_4=null;
        Token lv_type_2_5=null;
        Token lv_type_2_6=null;
        Token lv_type_2_7=null;
        Token lv_type_2_8=null;
        Token lv_type_2_9=null;
        Token lv_type_2_10=null;
        Token lv_type_2_11=null;
        Token lv_type_2_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_constaints_3_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1036:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) ) ( (lv_constaints_3_0= ruleConstaintOnCreation ) )? ) )
            // InternalSqlDsl.g:1037:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) ) ( (lv_constaints_3_0= ruleConstaintOnCreation ) )? )
            {
            // InternalSqlDsl.g:1037:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) ) ( (lv_constaints_3_0= ruleConstaintOnCreation ) )? )
            // InternalSqlDsl.g:1038:3: () ( (lv_name_1_0= ruleEString ) ) ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) ) ( (lv_constaints_3_0= ruleConstaintOnCreation ) )?
            {
            // InternalSqlDsl.g:1038:3: ()
            // InternalSqlDsl.g:1039:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnOnCreationAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:1045:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:1046:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:1046:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:1047:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnOnCreationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnOnCreationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:1064:3: ( ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) ) )
            // InternalSqlDsl.g:1065:4: ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) )
            {
            // InternalSqlDsl.g:1065:4: ( (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' ) )
            // InternalSqlDsl.g:1066:5: (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' )
            {
            // InternalSqlDsl.g:1066:5: (lv_type_2_1= 'int' | lv_type_2_2= 'float' | lv_type_2_3= 'varchar(100)' | lv_type_2_4= 'char(100)' | lv_type_2_5= 'text' | lv_type_2_6= 'date' | lv_type_2_7= 'INT' | lv_type_2_8= 'FLOAT' | lv_type_2_9= 'VARCHAR(100)' | lv_type_2_10= 'CHAR(100)' | lv_type_2_11= 'TEXT' | lv_type_2_12= 'DATE' )
            int alt17=12;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            case 30:
                {
                alt17=5;
                }
                break;
            case 31:
                {
                alt17=6;
                }
                break;
            case 32:
                {
                alt17=7;
                }
                break;
            case 33:
                {
                alt17=8;
                }
                break;
            case 34:
                {
                alt17=9;
                }
                break;
            case 35:
                {
                alt17=10;
                }
                break;
            case 36:
                {
                alt17=11;
                }
                break;
            case 37:
                {
                alt17=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSqlDsl.g:1067:6: lv_type_2_1= 'int'
                    {
                    lv_type_2_1=(Token)match(input,26,FOLLOW_8); 

                    						newLeafNode(lv_type_2_1, grammarAccess.getColumnOnCreationAccess().getTypeIntKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:1078:6: lv_type_2_2= 'float'
                    {
                    lv_type_2_2=(Token)match(input,27,FOLLOW_8); 

                    						newLeafNode(lv_type_2_2, grammarAccess.getColumnOnCreationAccess().getTypeFloatKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:1089:6: lv_type_2_3= 'varchar(100)'
                    {
                    lv_type_2_3=(Token)match(input,28,FOLLOW_8); 

                    						newLeafNode(lv_type_2_3, grammarAccess.getColumnOnCreationAccess().getTypeVarchar100Keyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:1100:6: lv_type_2_4= 'char(100)'
                    {
                    lv_type_2_4=(Token)match(input,29,FOLLOW_8); 

                    						newLeafNode(lv_type_2_4, grammarAccess.getColumnOnCreationAccess().getTypeChar100Keyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:1111:6: lv_type_2_5= 'text'
                    {
                    lv_type_2_5=(Token)match(input,30,FOLLOW_8); 

                    						newLeafNode(lv_type_2_5, grammarAccess.getColumnOnCreationAccess().getTypeTextKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:1122:6: lv_type_2_6= 'date'
                    {
                    lv_type_2_6=(Token)match(input,31,FOLLOW_8); 

                    						newLeafNode(lv_type_2_6, grammarAccess.getColumnOnCreationAccess().getTypeDateKeyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalSqlDsl.g:1133:6: lv_type_2_7= 'INT'
                    {
                    lv_type_2_7=(Token)match(input,32,FOLLOW_8); 

                    						newLeafNode(lv_type_2_7, grammarAccess.getColumnOnCreationAccess().getTypeINTKeyword_2_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalSqlDsl.g:1144:6: lv_type_2_8= 'FLOAT'
                    {
                    lv_type_2_8=(Token)match(input,33,FOLLOW_8); 

                    						newLeafNode(lv_type_2_8, grammarAccess.getColumnOnCreationAccess().getTypeFLOATKeyword_2_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalSqlDsl.g:1155:6: lv_type_2_9= 'VARCHAR(100)'
                    {
                    lv_type_2_9=(Token)match(input,34,FOLLOW_8); 

                    						newLeafNode(lv_type_2_9, grammarAccess.getColumnOnCreationAccess().getTypeVARCHAR100Keyword_2_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalSqlDsl.g:1166:6: lv_type_2_10= 'CHAR(100)'
                    {
                    lv_type_2_10=(Token)match(input,35,FOLLOW_8); 

                    						newLeafNode(lv_type_2_10, grammarAccess.getColumnOnCreationAccess().getTypeCHAR100Keyword_2_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalSqlDsl.g:1177:6: lv_type_2_11= 'TEXT'
                    {
                    lv_type_2_11=(Token)match(input,36,FOLLOW_8); 

                    						newLeafNode(lv_type_2_11, grammarAccess.getColumnOnCreationAccess().getTypeTEXTKeyword_2_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalSqlDsl.g:1188:6: lv_type_2_12= 'DATE'
                    {
                    lv_type_2_12=(Token)match(input,37,FOLLOW_8); 

                    						newLeafNode(lv_type_2_12, grammarAccess.getColumnOnCreationAccess().getTypeDATEKeyword_2_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnOnCreationRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_2_12, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSqlDsl.g:1201:3: ( (lv_constaints_3_0= ruleConstaintOnCreation ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSqlDsl.g:1202:4: (lv_constaints_3_0= ruleConstaintOnCreation )
                    {
                    // InternalSqlDsl.g:1202:4: (lv_constaints_3_0= ruleConstaintOnCreation )
                    // InternalSqlDsl.g:1203:5: lv_constaints_3_0= ruleConstaintOnCreation
                    {

                    					newCompositeNode(grammarAccess.getColumnOnCreationAccess().getConstaintsConstaintOnCreationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constaints_3_0=ruleConstaintOnCreation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnOnCreationRule());
                    					}
                    					add(
                    						current,
                    						"constaints",
                    						lv_constaints_3_0,
                    						"sqlProgram.SqlDsl.ConstaintOnCreation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnOnCreation"


    // $ANTLR start "entryRuleConstaint"
    // InternalSqlDsl.g:1224:1: entryRuleConstaint returns [EObject current=null] : iv_ruleConstaint= ruleConstaint EOF ;
    public final EObject entryRuleConstaint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstaint = null;


        try {
            // InternalSqlDsl.g:1224:50: (iv_ruleConstaint= ruleConstaint EOF )
            // InternalSqlDsl.g:1225:2: iv_ruleConstaint= ruleConstaint EOF
            {
             newCompositeNode(grammarAccess.getConstaintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstaint=ruleConstaint();

            state._fsp--;

             current =iv_ruleConstaint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstaint"


    // $ANTLR start "ruleConstaint"
    // InternalSqlDsl.g:1231:1: ruleConstaint returns [EObject current=null] : (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) ) ;
    public final EObject ruleConstaint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1237:2: ( (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) ) )
            // InternalSqlDsl.g:1238:2: (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) )
            {
            // InternalSqlDsl.g:1238:2: (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) )
            // InternalSqlDsl.g:1239:3: otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstaintAccess().getCONSTRAINTKeyword_0());
            		
            // InternalSqlDsl.g:1243:3: ( (lv_body_1_0= ruleComplexString ) )
            // InternalSqlDsl.g:1244:4: (lv_body_1_0= ruleComplexString )
            {
            // InternalSqlDsl.g:1244:4: (lv_body_1_0= ruleComplexString )
            // InternalSqlDsl.g:1245:5: lv_body_1_0= ruleComplexString
            {

            					newCompositeNode(grammarAccess.getConstaintAccess().getBodyComplexStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleComplexString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstaintRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"sqlProgram.SqlDsl.ComplexString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstaint"


    // $ANTLR start "entryRuleConstaintOnCreation"
    // InternalSqlDsl.g:1266:1: entryRuleConstaintOnCreation returns [EObject current=null] : iv_ruleConstaintOnCreation= ruleConstaintOnCreation EOF ;
    public final EObject entryRuleConstaintOnCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstaintOnCreation = null;


        try {
            // InternalSqlDsl.g:1266:60: (iv_ruleConstaintOnCreation= ruleConstaintOnCreation EOF )
            // InternalSqlDsl.g:1267:2: iv_ruleConstaintOnCreation= ruleConstaintOnCreation EOF
            {
             newCompositeNode(grammarAccess.getConstaintOnCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstaintOnCreation=ruleConstaintOnCreation();

            state._fsp--;

             current =iv_ruleConstaintOnCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstaintOnCreation"


    // $ANTLR start "ruleConstaintOnCreation"
    // InternalSqlDsl.g:1273:1: ruleConstaintOnCreation returns [EObject current=null] : ( (lv_body_0_0= ruleComplexString ) ) ;
    public final EObject ruleConstaintOnCreation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_body_0_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1279:2: ( ( (lv_body_0_0= ruleComplexString ) ) )
            // InternalSqlDsl.g:1280:2: ( (lv_body_0_0= ruleComplexString ) )
            {
            // InternalSqlDsl.g:1280:2: ( (lv_body_0_0= ruleComplexString ) )
            // InternalSqlDsl.g:1281:3: (lv_body_0_0= ruleComplexString )
            {
            // InternalSqlDsl.g:1281:3: (lv_body_0_0= ruleComplexString )
            // InternalSqlDsl.g:1282:4: lv_body_0_0= ruleComplexString
            {

            				newCompositeNode(grammarAccess.getConstaintOnCreationAccess().getBodyComplexStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_body_0_0=ruleComplexString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConstaintOnCreationRule());
            				}
            				set(
            					current,
            					"body",
            					lv_body_0_0,
            					"sqlProgram.SqlDsl.ComplexString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstaintOnCreation"


    // $ANTLR start "entryRuleClause"
    // InternalSqlDsl.g:1302:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSqlDsl.g:1302:47: (iv_ruleClause= ruleClause EOF )
            // InternalSqlDsl.g:1303:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalSqlDsl.g:1309:1: ruleClause returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_body_1_0= ruleComplexString ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1315:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_body_1_0= ruleComplexString ) ) ) )
            // InternalSqlDsl.g:1316:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_body_1_0= ruleComplexString ) ) )
            {
            // InternalSqlDsl.g:1316:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_body_1_0= ruleComplexString ) ) )
            // InternalSqlDsl.g:1317:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_body_1_0= ruleComplexString ) )
            {
            // InternalSqlDsl.g:1317:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSqlDsl.g:1318:4: (lv_name_0_0= ruleEString )
            {
            // InternalSqlDsl.g:1318:4: (lv_name_0_0= ruleEString )
            // InternalSqlDsl.g:1319:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:1336:3: ( (lv_body_1_0= ruleComplexString ) )
            // InternalSqlDsl.g:1337:4: (lv_body_1_0= ruleComplexString )
            {
            // InternalSqlDsl.g:1337:4: (lv_body_1_0= ruleComplexString )
            // InternalSqlDsl.g:1338:5: lv_body_1_0= ruleComplexString
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getBodyComplexStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleComplexString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"sqlProgram.SqlDsl.ComplexString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleValue"
    // InternalSqlDsl.g:1359:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSqlDsl.g:1359:46: (iv_ruleValue= ruleValue EOF )
            // InternalSqlDsl.g:1360:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalSqlDsl.g:1366:1: ruleValue returns [EObject current=null] : ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_columnvalues_3_0 = null;

        EObject lv_columnvalues_5_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1372:2: ( ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' ) )
            // InternalSqlDsl.g:1373:2: ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' )
            {
            // InternalSqlDsl.g:1373:2: ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' )
            // InternalSqlDsl.g:1374:3: () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')'
            {
            // InternalSqlDsl.g:1374:3: ()
            // InternalSqlDsl.g:1375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSqlDsl.g:1389:3: ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSqlDsl.g:1390:4: ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )*
                    {
                    // InternalSqlDsl.g:1390:4: ( (lv_columnvalues_3_0= ruleColumnValue ) )
                    // InternalSqlDsl.g:1391:5: (lv_columnvalues_3_0= ruleColumnValue )
                    {
                    // InternalSqlDsl.g:1391:5: (lv_columnvalues_3_0= ruleColumnValue )
                    // InternalSqlDsl.g:1392:6: lv_columnvalues_3_0= ruleColumnValue
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_columnvalues_3_0=ruleColumnValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValueRule());
                    						}
                    						add(
                    							current,
                    							"columnvalues",
                    							lv_columnvalues_3_0,
                    							"sqlProgram.SqlDsl.ColumnValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:1409:4: (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1410:5: otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getValueAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSqlDsl.g:1414:5: ( (lv_columnvalues_5_0= ruleColumnValue ) )
                    	    // InternalSqlDsl.g:1415:6: (lv_columnvalues_5_0= ruleColumnValue )
                    	    {
                    	    // InternalSqlDsl.g:1415:6: (lv_columnvalues_5_0= ruleColumnValue )
                    	    // InternalSqlDsl.g:1416:7: lv_columnvalues_5_0= ruleColumnValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_columnvalues_5_0=ruleColumnValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columnvalues",
                    	    								lv_columnvalues_5_0,
                    	    								"sqlProgram.SqlDsl.ColumnValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValueAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleColumnValue"
    // InternalSqlDsl.g:1443:1: entryRuleColumnValue returns [EObject current=null] : iv_ruleColumnValue= ruleColumnValue EOF ;
    public final EObject entryRuleColumnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnValue = null;


        try {
            // InternalSqlDsl.g:1443:52: (iv_ruleColumnValue= ruleColumnValue EOF )
            // InternalSqlDsl.g:1444:2: iv_ruleColumnValue= ruleColumnValue EOF
            {
             newCompositeNode(grammarAccess.getColumnValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnValue=ruleColumnValue();

            state._fsp--;

             current =iv_ruleColumnValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnValue"


    // $ANTLR start "ruleColumnValue"
    // InternalSqlDsl.g:1450:1: ruleColumnValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleColumnValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1456:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalSqlDsl.g:1457:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalSqlDsl.g:1457:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalSqlDsl.g:1458:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalSqlDsl.g:1458:3: ()
            // InternalSqlDsl.g:1459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnValueAccess().getColumnValueAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:1465:3: ( (lv_value_1_0= ruleEString ) )
            // InternalSqlDsl.g:1466:4: (lv_value_1_0= ruleEString )
            {
            // InternalSqlDsl.g:1466:4: (lv_value_1_0= ruleEString )
            // InternalSqlDsl.g:1467:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnValue"


    // $ANTLR start "entryRuleComplexString"
    // InternalSqlDsl.g:1488:1: entryRuleComplexString returns [String current=null] : iv_ruleComplexString= ruleComplexString EOF ;
    public final String entryRuleComplexString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexString = null;


        try {
            // InternalSqlDsl.g:1488:53: (iv_ruleComplexString= ruleComplexString EOF )
            // InternalSqlDsl.g:1489:2: iv_ruleComplexString= ruleComplexString EOF
            {
             newCompositeNode(grammarAccess.getComplexStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexString=ruleComplexString();

            state._fsp--;

             current =iv_ruleComplexString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexString"


    // $ANTLR start "ruleComplexString"
    // InternalSqlDsl.g:1495:1: ruleComplexString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )* (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleComplexString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_6 = null;

        AntlrDatatypeRuleToken this_EString_8 = null;

        AntlrDatatypeRuleToken this_EString_10 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1501:2: ( (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )* (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )? ) )
            // InternalSqlDsl.g:1502:2: (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )* (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )? )
            {
            // InternalSqlDsl.g:1502:2: (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )* (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )? )
            // InternalSqlDsl.g:1503:3: this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )* (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )?
            {

            			newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_EString_0=ruleEString();

            state._fsp--;


            			current.merge(this_EString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSqlDsl.g:1513:3: ( (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    switch ( input.LA(2) ) {
                    case EOF:
                    case 11:
                    case 14:
                    case 24:
                    case 40:
                    case 42:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_ID:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt26=1;
                        }
                        break;

                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt26=1;
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case 11:
                    case 14:
                    case 24:
                    case 40:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt26=1;
                        }
                        break;
                    case 42:
                        {
                        alt26=1;
                        }
                        break;

                    }

                    }
                    break;
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalSqlDsl.g:1514:4: (kw= '.' )? (kw= '*' )? (kw= '=' )? (kw= '<' )? (kw= '>' )? this_EString_6= ruleEString
            	    {
            	    // InternalSqlDsl.g:1514:4: (kw= '.' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==42) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalSqlDsl.g:1515:5: kw= '.'
            	            {
            	            kw=(Token)match(input,42,FOLLOW_26); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1521:4: (kw= '*' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==43) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalSqlDsl.g:1522:5: kw= '*'
            	            {
            	            kw=(Token)match(input,43,FOLLOW_27); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1528:4: (kw= '=' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==44) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalSqlDsl.g:1529:5: kw= '='
            	            {
            	            kw=(Token)match(input,44,FOLLOW_28); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1535:4: (kw= '<' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==45) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalSqlDsl.g:1536:5: kw= '<'
            	            {
            	            kw=(Token)match(input,45,FOLLOW_29); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getLessThanSignKeyword_1_3());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1542:4: (kw= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==46) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalSqlDsl.g:1543:5: kw= '>'
            	            {
            	            kw=(Token)match(input,46,FOLLOW_6); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getGreaterThanSignKeyword_1_4());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_5());
            	    			
            	    pushFollow(FOLLOW_25);
            	    this_EString_6=ruleEString();

            	    state._fsp--;


            	    				current.merge(this_EString_6);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalSqlDsl.g:1560:3: (kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSqlDsl.g:1561:4: kw= '(' this_EString_8= ruleEString (kw= ',' this_EString_10= ruleEString )* kw= ')'
                    {
                    kw=(Token)match(input,40,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplexStringAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_EString_8=ruleEString();

                    state._fsp--;


                    				current.merge(this_EString_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSqlDsl.g:1576:4: (kw= ',' this_EString_10= ruleEString )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1577:5: kw= ',' this_EString_10= ruleEString
                    	    {
                    	    kw=(Token)match(input,14,FOLLOW_6); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getComplexStringAccess().getCommaKeyword_2_2_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_2_2_1());
                    	    				
                    	    pushFollow(FOLLOW_24);
                    	    this_EString_10=ruleEString();

                    	    state._fsp--;


                    	    					current.merge(this_EString_10);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    kw=(Token)match(input,41,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplexStringAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002189002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003FFC000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00007D0000000032L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000780000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000700000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000600000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000030L});

}
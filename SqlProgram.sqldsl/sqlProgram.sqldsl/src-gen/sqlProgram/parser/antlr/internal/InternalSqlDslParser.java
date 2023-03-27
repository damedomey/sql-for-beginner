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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'SELECT'", "'FROM'", "','", "'CREATE'", "'TABLE'", "'INDEX'", "'UPDATE'", "'INSERT'", "'INTO'", "'DELETE'", "'{'", "'}'", "'AND'", "'OR'", "'WHERE'", "'SET'", "'HAVING'", "'LIMIT'", "'OFFSET'", "'and'", "'or'", "'where'", "'set'", "'having'", "'limit'", "'offset'", "'CONSTRAINT'", "'Value'", "'('", "')'", "'.'", "'*'", "'='", "'()'"
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

                if ( (LA1_0==12||LA1_0==15||(LA1_0>=18 && LA1_0<=19)||LA1_0==21) ) {
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
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 21:
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

                if ( ((LA4_0>=24 && LA4_0<=37)) ) {
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
    // InternalSqlDsl.g:282:1: ruleCreation returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) ) ) ;
    public final EObject ruleCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_5=null;
        Token lv_type_7_0=null;
        EObject lv_objects_3_0 = null;

        EObject lv_constaints_4_0 = null;

        EObject lv_constaints_6_0 = null;

        EObject lv_objects_8_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:288:2: ( ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) ) ) )
            // InternalSqlDsl.g:289:2: ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) ) )
            {
            // InternalSqlDsl.g:289:2: ( () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) ) )
            // InternalSqlDsl.g:290:3: () otherlv_1= 'CREATE' ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) )
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
            		
            // InternalSqlDsl.g:301:3: ( ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? ) | ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSqlDsl.g:302:4: ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? )
                    {
                    // InternalSqlDsl.g:302:4: ( ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )? )
                    // InternalSqlDsl.g:303:5: ( (lv_type_2_0= 'TABLE' ) ) ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_constaints_4_0= ruleConstaint ) ) (otherlv_5= ',' ( (lv_constaints_6_0= ruleConstaint ) ) )* )?
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

                    // InternalSqlDsl.g:317:5: ( (lv_objects_3_0= ruleTable ) )
                    // InternalSqlDsl.g:318:6: (lv_objects_3_0= ruleTable )
                    {
                    // InternalSqlDsl.g:318:6: (lv_objects_3_0= ruleTable )
                    // InternalSqlDsl.g:319:7: lv_objects_3_0= ruleTable
                    {

                    							newCompositeNode(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_objects_3_0=ruleTable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    							}
                    							add(
                    								current,
                    								"objects",
                    								lv_objects_3_0,
                    								"sqlProgram.SqlDsl.Table");
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
                    // InternalSqlDsl.g:384:4: ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) )
                    {
                    // InternalSqlDsl.g:384:4: ( ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) ) )
                    // InternalSqlDsl.g:385:5: ( (lv_type_7_0= 'INDEX' ) ) ( (lv_objects_8_0= ruleTable ) )
                    {
                    // InternalSqlDsl.g:385:5: ( (lv_type_7_0= 'INDEX' ) )
                    // InternalSqlDsl.g:386:6: (lv_type_7_0= 'INDEX' )
                    {
                    // InternalSqlDsl.g:386:6: (lv_type_7_0= 'INDEX' )
                    // InternalSqlDsl.g:387:7: lv_type_7_0= 'INDEX'
                    {
                    lv_type_7_0=(Token)match(input,17,FOLLOW_6); 

                    							newLeafNode(lv_type_7_0, grammarAccess.getCreationAccess().getTypeINDEXKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCreationRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_7_0, "INDEX");
                    						

                    }


                    }

                    // InternalSqlDsl.g:399:5: ( (lv_objects_8_0= ruleTable ) )
                    // InternalSqlDsl.g:400:6: (lv_objects_8_0= ruleTable )
                    {
                    // InternalSqlDsl.g:400:6: (lv_objects_8_0= ruleTable )
                    // InternalSqlDsl.g:401:7: lv_objects_8_0= ruleTable
                    {

                    							newCompositeNode(grammarAccess.getCreationAccess().getObjectsTableParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_objects_8_0=ruleTable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    							}
                    							add(
                    								current,
                    								"objects",
                    								lv_objects_8_0,
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
    // InternalSqlDsl.g:424:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalSqlDsl.g:424:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalSqlDsl.g:425:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalSqlDsl.g:431:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_objects_2_0 = null;

        EObject lv_clauses_3_0 = null;

        EObject lv_clauses_5_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:437:2: ( ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* ) )
            // InternalSqlDsl.g:438:2: ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* )
            {
            // InternalSqlDsl.g:438:2: ( () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )* )
            // InternalSqlDsl.g:439:3: () otherlv_1= 'UPDATE' ( (lv_objects_2_0= ruleTable ) ) ( (lv_clauses_3_0= ruleClause ) ) (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )*
            {
            // InternalSqlDsl.g:439:3: ()
            // InternalSqlDsl.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUPDATEKeyword_1());
            		
            // InternalSqlDsl.g:450:3: ( (lv_objects_2_0= ruleTable ) )
            // InternalSqlDsl.g:451:4: (lv_objects_2_0= ruleTable )
            {
            // InternalSqlDsl.g:451:4: (lv_objects_2_0= ruleTable )
            // InternalSqlDsl.g:452:5: lv_objects_2_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getObjectsTableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalSqlDsl.g:469:3: ( (lv_clauses_3_0= ruleClause ) )
            // InternalSqlDsl.g:470:4: (lv_clauses_3_0= ruleClause )
            {
            // InternalSqlDsl.g:470:4: (lv_clauses_3_0= ruleClause )
            // InternalSqlDsl.g:471:5: lv_clauses_3_0= ruleClause
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

            // InternalSqlDsl.g:488:3: (otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSqlDsl.g:489:4: otherlv_4= ',' ( (lv_clauses_5_0= ruleClause ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSqlDsl.g:493:4: ( (lv_clauses_5_0= ruleClause ) )
            	    // InternalSqlDsl.g:494:5: (lv_clauses_5_0= ruleClause )
            	    {
            	    // InternalSqlDsl.g:494:5: (lv_clauses_5_0= ruleClause )
            	    // InternalSqlDsl.g:495:6: lv_clauses_5_0= ruleClause
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
            	    break loop8;
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
    // InternalSqlDsl.g:517:1: entryRuleInsertion returns [EObject current=null] : iv_ruleInsertion= ruleInsertion EOF ;
    public final EObject entryRuleInsertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertion = null;


        try {
            // InternalSqlDsl.g:517:50: (iv_ruleInsertion= ruleInsertion EOF )
            // InternalSqlDsl.g:518:2: iv_ruleInsertion= ruleInsertion EOF
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
    // InternalSqlDsl.g:524:1: ruleInsertion returns [EObject current=null] : ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* ) ;
    public final EObject ruleInsertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_objects_3_0 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:530:2: ( ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* ) )
            // InternalSqlDsl.g:531:2: ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* )
            {
            // InternalSqlDsl.g:531:2: ( () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )* )
            // InternalSqlDsl.g:532:3: () otherlv_1= 'INSERT' otherlv_2= 'INTO' ( (lv_objects_3_0= ruleTable ) ) ( (lv_values_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )*
            {
            // InternalSqlDsl.g:532:3: ()
            // InternalSqlDsl.g:533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInsertionAccess().getInsertionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertionAccess().getINSERTKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertionAccess().getINTOKeyword_2());
            		
            // InternalSqlDsl.g:547:3: ( (lv_objects_3_0= ruleTable ) )
            // InternalSqlDsl.g:548:4: (lv_objects_3_0= ruleTable )
            {
            // InternalSqlDsl.g:548:4: (lv_objects_3_0= ruleTable )
            // InternalSqlDsl.g:549:5: lv_objects_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getInsertionAccess().getObjectsTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalSqlDsl.g:566:3: ( (lv_values_4_0= ruleValue ) )
            // InternalSqlDsl.g:567:4: (lv_values_4_0= ruleValue )
            {
            // InternalSqlDsl.g:567:4: (lv_values_4_0= ruleValue )
            // InternalSqlDsl.g:568:5: lv_values_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_values_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertionRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_4_0,
            						"sqlProgram.SqlDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSqlDsl.g:585:3: (otherlv_5= ',' ( (lv_values_6_0= ruleValue ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSqlDsl.g:586:4: otherlv_5= ',' ( (lv_values_6_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInsertionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSqlDsl.g:590:4: ( (lv_values_6_0= ruleValue ) )
            	    // InternalSqlDsl.g:591:5: (lv_values_6_0= ruleValue )
            	    {
            	    // InternalSqlDsl.g:591:5: (lv_values_6_0= ruleValue )
            	    // InternalSqlDsl.g:592:6: lv_values_6_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // $ANTLR end "ruleInsertion"


    // $ANTLR start "entryRuleDelete"
    // InternalSqlDsl.g:614:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalSqlDsl.g:614:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalSqlDsl.g:615:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalSqlDsl.g:621:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? ) ;
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
            // InternalSqlDsl.g:627:2: ( ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? ) )
            // InternalSqlDsl.g:628:2: ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? )
            {
            // InternalSqlDsl.g:628:2: ( () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )? )
            // InternalSqlDsl.g:629:3: () otherlv_1= 'DELETE' otherlv_2= 'FROM' ( (lv_objects_3_0= ruleTable ) ) ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )?
            {
            // InternalSqlDsl.g:629:3: ()
            // InternalSqlDsl.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDELETEKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getFROMKeyword_2());
            		
            // InternalSqlDsl.g:644:3: ( (lv_objects_3_0= ruleTable ) )
            // InternalSqlDsl.g:645:4: (lv_objects_3_0= ruleTable )
            {
            // InternalSqlDsl.g:645:4: (lv_objects_3_0= ruleTable )
            // InternalSqlDsl.g:646:5: lv_objects_3_0= ruleTable
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

            // InternalSqlDsl.g:663:3: ( ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=37)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSqlDsl.g:664:4: ( (lv_clauses_4_0= ruleClause ) ) (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )*
                    {
                    // InternalSqlDsl.g:664:4: ( (lv_clauses_4_0= ruleClause ) )
                    // InternalSqlDsl.g:665:5: (lv_clauses_4_0= ruleClause )
                    {
                    // InternalSqlDsl.g:665:5: (lv_clauses_4_0= ruleClause )
                    // InternalSqlDsl.g:666:6: lv_clauses_4_0= ruleClause
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

                    // InternalSqlDsl.g:683:4: (otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSqlDsl.g:684:5: otherlv_5= ',' ( (lv_clauses_6_0= ruleClause ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDeleteAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSqlDsl.g:688:5: ( (lv_clauses_6_0= ruleClause ) )
                    	    // InternalSqlDsl.g:689:6: (lv_clauses_6_0= ruleClause )
                    	    {
                    	    // InternalSqlDsl.g:689:6: (lv_clauses_6_0= ruleClause )
                    	    // InternalSqlDsl.g:690:7: lv_clauses_6_0= ruleClause
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
                    	    break loop10;
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
    // InternalSqlDsl.g:713:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSqlDsl.g:713:47: (iv_ruleEString= ruleEString EOF )
            // InternalSqlDsl.g:714:2: iv_ruleEString= ruleEString EOF
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
    // InternalSqlDsl.g:720:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSqlDsl.g:726:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSqlDsl.g:727:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSqlDsl.g:727:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSqlDsl.g:728:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:736:3: this_ID_1= RULE_ID
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
    // InternalSqlDsl.g:747:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSqlDsl.g:747:46: (iv_ruleTable= ruleTable EOF )
            // InternalSqlDsl.g:748:2: iv_ruleTable= ruleTable EOF
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
    // InternalSqlDsl.g:754:1: ruleTable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' ) ;
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
            // InternalSqlDsl.g:760:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' ) )
            // InternalSqlDsl.g:761:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' )
            {
            // InternalSqlDsl.g:761:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}' )
            // InternalSqlDsl.g:762:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? otherlv_6= '}'
            {
            // InternalSqlDsl.g:762:3: ()
            // InternalSqlDsl.g:763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:769:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:770:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:770:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:771:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:792:3: ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSqlDsl.g:793:4: ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    {
                    // InternalSqlDsl.g:793:4: ( (lv_columns_3_0= ruleColumn ) )
                    // InternalSqlDsl.g:794:5: (lv_columns_3_0= ruleColumn )
                    {
                    // InternalSqlDsl.g:794:5: (lv_columns_3_0= ruleColumn )
                    // InternalSqlDsl.g:795:6: lv_columns_3_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalSqlDsl.g:812:4: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSqlDsl.g:813:5: otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSqlDsl.g:817:5: ( (lv_columns_5_0= ruleColumn ) )
                    	    // InternalSqlDsl.g:818:6: (lv_columns_5_0= ruleColumn )
                    	    {
                    	    // InternalSqlDsl.g:818:6: (lv_columns_5_0= ruleColumn )
                    	    // InternalSqlDsl.g:819:7: lv_columns_5_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleColumn"
    // InternalSqlDsl.g:846:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSqlDsl.g:846:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSqlDsl.g:847:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSqlDsl.g:853:1: ruleColumn returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:859:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) )? ) )
            // InternalSqlDsl.g:860:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) )? )
            {
            // InternalSqlDsl.g:860:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) )? )
            // InternalSqlDsl.g:861:3: () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) )?
            {
            // InternalSqlDsl.g:861:3: ()
            // InternalSqlDsl.g:862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:868:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:869:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:869:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:870:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalSqlDsl.g:887:3: ( ( ruleEString ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:888:4: ( ruleEString )
                    {
                    // InternalSqlDsl.g:888:4: ( ruleEString )
                    // InternalSqlDsl.g:889:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getColumnAccess().getTypeTypeCrossReference_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleClause"
    // InternalSqlDsl.g:907:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSqlDsl.g:907:47: (iv_ruleClause= ruleClause EOF )
            // InternalSqlDsl.g:908:2: iv_ruleClause= ruleClause EOF
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
    // InternalSqlDsl.g:914:1: ruleClause returns [EObject current=null] : ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) ) ( (lv_body_1_0= ruleComplexString ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token lv_name_0_11=null;
        Token lv_name_0_12=null;
        Token lv_name_0_13=null;
        Token lv_name_0_14=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:920:2: ( ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) ) ( (lv_body_1_0= ruleComplexString ) ) ) )
            // InternalSqlDsl.g:921:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) ) ( (lv_body_1_0= ruleComplexString ) ) )
            {
            // InternalSqlDsl.g:921:2: ( ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) ) ( (lv_body_1_0= ruleComplexString ) ) )
            // InternalSqlDsl.g:922:3: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) ) ( (lv_body_1_0= ruleComplexString ) )
            {
            // InternalSqlDsl.g:922:3: ( ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) ) )
            // InternalSqlDsl.g:923:4: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) )
            {
            // InternalSqlDsl.g:923:4: ( (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' ) )
            // InternalSqlDsl.g:924:5: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' )
            {
            // InternalSqlDsl.g:924:5: (lv_name_0_1= 'AND' | lv_name_0_2= 'OR' | lv_name_0_3= 'WHERE' | lv_name_0_4= 'SET' | lv_name_0_5= 'HAVING' | lv_name_0_6= 'LIMIT' | lv_name_0_7= 'OFFSET' | lv_name_0_8= 'and' | lv_name_0_9= 'or' | lv_name_0_10= 'where' | lv_name_0_11= 'set' | lv_name_0_12= 'having' | lv_name_0_13= 'limit' | lv_name_0_14= 'offset' )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                alt16=4;
                }
                break;
            case 28:
                {
                alt16=5;
                }
                break;
            case 29:
                {
                alt16=6;
                }
                break;
            case 30:
                {
                alt16=7;
                }
                break;
            case 31:
                {
                alt16=8;
                }
                break;
            case 32:
                {
                alt16=9;
                }
                break;
            case 33:
                {
                alt16=10;
                }
                break;
            case 34:
                {
                alt16=11;
                }
                break;
            case 35:
                {
                alt16=12;
                }
                break;
            case 36:
                {
                alt16=13;
                }
                break;
            case 37:
                {
                alt16=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSqlDsl.g:925:6: lv_name_0_1= 'AND'
                    {
                    lv_name_0_1=(Token)match(input,24,FOLLOW_6); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getClauseAccess().getNameANDKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:936:6: lv_name_0_2= 'OR'
                    {
                    lv_name_0_2=(Token)match(input,25,FOLLOW_6); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getClauseAccess().getNameORKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSqlDsl.g:947:6: lv_name_0_3= 'WHERE'
                    {
                    lv_name_0_3=(Token)match(input,26,FOLLOW_6); 

                    						newLeafNode(lv_name_0_3, grammarAccess.getClauseAccess().getNameWHEREKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSqlDsl.g:958:6: lv_name_0_4= 'SET'
                    {
                    lv_name_0_4=(Token)match(input,27,FOLLOW_6); 

                    						newLeafNode(lv_name_0_4, grammarAccess.getClauseAccess().getNameSETKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSqlDsl.g:969:6: lv_name_0_5= 'HAVING'
                    {
                    lv_name_0_5=(Token)match(input,28,FOLLOW_6); 

                    						newLeafNode(lv_name_0_5, grammarAccess.getClauseAccess().getNameHAVINGKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalSqlDsl.g:980:6: lv_name_0_6= 'LIMIT'
                    {
                    lv_name_0_6=(Token)match(input,29,FOLLOW_6); 

                    						newLeafNode(lv_name_0_6, grammarAccess.getClauseAccess().getNameLIMITKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalSqlDsl.g:991:6: lv_name_0_7= 'OFFSET'
                    {
                    lv_name_0_7=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(lv_name_0_7, grammarAccess.getClauseAccess().getNameOFFSETKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalSqlDsl.g:1002:6: lv_name_0_8= 'and'
                    {
                    lv_name_0_8=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_name_0_8, grammarAccess.getClauseAccess().getNameAndKeyword_0_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalSqlDsl.g:1013:6: lv_name_0_9= 'or'
                    {
                    lv_name_0_9=(Token)match(input,32,FOLLOW_6); 

                    						newLeafNode(lv_name_0_9, grammarAccess.getClauseAccess().getNameOrKeyword_0_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalSqlDsl.g:1024:6: lv_name_0_10= 'where'
                    {
                    lv_name_0_10=(Token)match(input,33,FOLLOW_6); 

                    						newLeafNode(lv_name_0_10, grammarAccess.getClauseAccess().getNameWhereKeyword_0_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalSqlDsl.g:1035:6: lv_name_0_11= 'set'
                    {
                    lv_name_0_11=(Token)match(input,34,FOLLOW_6); 

                    						newLeafNode(lv_name_0_11, grammarAccess.getClauseAccess().getNameSetKeyword_0_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalSqlDsl.g:1046:6: lv_name_0_12= 'having'
                    {
                    lv_name_0_12=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(lv_name_0_12, grammarAccess.getClauseAccess().getNameHavingKeyword_0_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalSqlDsl.g:1057:6: lv_name_0_13= 'limit'
                    {
                    lv_name_0_13=(Token)match(input,36,FOLLOW_6); 

                    						newLeafNode(lv_name_0_13, grammarAccess.getClauseAccess().getNameLimitKeyword_0_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalSqlDsl.g:1068:6: lv_name_0_14= 'offset'
                    {
                    lv_name_0_14=(Token)match(input,37,FOLLOW_6); 

                    						newLeafNode(lv_name_0_14, grammarAccess.getClauseAccess().getNameOffsetKeyword_0_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClauseRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_14, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSqlDsl.g:1081:3: ( (lv_body_1_0= ruleComplexString ) )
            // InternalSqlDsl.g:1082:4: (lv_body_1_0= ruleComplexString )
            {
            // InternalSqlDsl.g:1082:4: (lv_body_1_0= ruleComplexString )
            // InternalSqlDsl.g:1083:5: lv_body_1_0= ruleComplexString
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


    // $ANTLR start "entryRuleConstaint"
    // InternalSqlDsl.g:1104:1: entryRuleConstaint returns [EObject current=null] : iv_ruleConstaint= ruleConstaint EOF ;
    public final EObject entryRuleConstaint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstaint = null;


        try {
            // InternalSqlDsl.g:1104:50: (iv_ruleConstaint= ruleConstaint EOF )
            // InternalSqlDsl.g:1105:2: iv_ruleConstaint= ruleConstaint EOF
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
    // InternalSqlDsl.g:1111:1: ruleConstaint returns [EObject current=null] : (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) ) ;
    public final EObject ruleConstaint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1117:2: ( (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) ) )
            // InternalSqlDsl.g:1118:2: (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) )
            {
            // InternalSqlDsl.g:1118:2: (otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) ) )
            // InternalSqlDsl.g:1119:3: otherlv_0= 'CONSTRAINT' ( (lv_body_1_0= ruleComplexString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstaintAccess().getCONSTRAINTKeyword_0());
            		
            // InternalSqlDsl.g:1123:3: ( (lv_body_1_0= ruleComplexString ) )
            // InternalSqlDsl.g:1124:4: (lv_body_1_0= ruleComplexString )
            {
            // InternalSqlDsl.g:1124:4: (lv_body_1_0= ruleComplexString )
            // InternalSqlDsl.g:1125:5: lv_body_1_0= ruleComplexString
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


    // $ANTLR start "entryRuleValue"
    // InternalSqlDsl.g:1146:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSqlDsl.g:1146:46: (iv_ruleValue= ruleValue EOF )
            // InternalSqlDsl.g:1147:2: iv_ruleValue= ruleValue EOF
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
    // InternalSqlDsl.g:1153:1: ruleValue returns [EObject current=null] : ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalSqlDsl.g:1159:2: ( ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' ) )
            // InternalSqlDsl.g:1160:2: ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' )
            {
            // InternalSqlDsl.g:1160:2: ( () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')' )
            // InternalSqlDsl.g:1161:3: () otherlv_1= 'Value' otherlv_2= '(' ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )? otherlv_6= ')'
            {
            // InternalSqlDsl.g:1161:3: ()
            // InternalSqlDsl.g:1162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSqlDsl.g:1176:3: ( ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSqlDsl.g:1177:4: ( (lv_columnvalues_3_0= ruleColumnValue ) ) (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )*
                    {
                    // InternalSqlDsl.g:1177:4: ( (lv_columnvalues_3_0= ruleColumnValue ) )
                    // InternalSqlDsl.g:1178:5: (lv_columnvalues_3_0= ruleColumnValue )
                    {
                    // InternalSqlDsl.g:1178:5: (lv_columnvalues_3_0= ruleColumnValue )
                    // InternalSqlDsl.g:1179:6: lv_columnvalues_3_0= ruleColumnValue
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalSqlDsl.g:1196:4: (otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1197:5: otherlv_4= ',' ( (lv_columnvalues_5_0= ruleColumnValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getValueAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalSqlDsl.g:1201:5: ( (lv_columnvalues_5_0= ruleColumnValue ) )
                    	    // InternalSqlDsl.g:1202:6: (lv_columnvalues_5_0= ruleColumnValue )
                    	    {
                    	    // InternalSqlDsl.g:1202:6: (lv_columnvalues_5_0= ruleColumnValue )
                    	    // InternalSqlDsl.g:1203:7: lv_columnvalues_5_0= ruleColumnValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop17;
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
    // InternalSqlDsl.g:1230:1: entryRuleColumnValue returns [EObject current=null] : iv_ruleColumnValue= ruleColumnValue EOF ;
    public final EObject entryRuleColumnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnValue = null;


        try {
            // InternalSqlDsl.g:1230:52: (iv_ruleColumnValue= ruleColumnValue EOF )
            // InternalSqlDsl.g:1231:2: iv_ruleColumnValue= ruleColumnValue EOF
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
    // InternalSqlDsl.g:1237:1: ruleColumnValue returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleColumnValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1243:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalSqlDsl.g:1244:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalSqlDsl.g:1244:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalSqlDsl.g:1245:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalSqlDsl.g:1245:3: ()
            // InternalSqlDsl.g:1246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnValueAccess().getColumnValueAction_0(),
            					current);
            			

            }

            // InternalSqlDsl.g:1252:3: ( (lv_value_1_0= ruleEString ) )
            // InternalSqlDsl.g:1253:4: (lv_value_1_0= ruleEString )
            {
            // InternalSqlDsl.g:1253:4: (lv_value_1_0= ruleEString )
            // InternalSqlDsl.g:1254:5: lv_value_1_0= ruleEString
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
    // InternalSqlDsl.g:1275:1: entryRuleComplexString returns [String current=null] : iv_ruleComplexString= ruleComplexString EOF ;
    public final String entryRuleComplexString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexString = null;


        try {
            // InternalSqlDsl.g:1275:53: (iv_ruleComplexString= ruleComplexString EOF )
            // InternalSqlDsl.g:1276:2: iv_ruleComplexString= ruleComplexString EOF
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
    // InternalSqlDsl.g:1282:1: ruleComplexString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )* (kw= '()' )? ) ;
    public final AntlrDatatypeRuleToken ruleComplexString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_4 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1288:2: ( (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )* (kw= '()' )? ) )
            // InternalSqlDsl.g:1289:2: (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )* (kw= '()' )? )
            {
            // InternalSqlDsl.g:1289:2: (this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )* (kw= '()' )? )
            // InternalSqlDsl.g:1290:3: this_EString_0= ruleEString ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )* (kw= '()' )?
            {

            			newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_EString_0=ruleEString();

            state._fsp--;


            			current.merge(this_EString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSqlDsl.g:1300:3: ( (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)||(LA22_0>=42 && LA22_0<=44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSqlDsl.g:1301:4: (kw= '.' )? (kw= '*' )? (kw= '=' )? this_EString_4= ruleEString
            	    {
            	    // InternalSqlDsl.g:1301:4: (kw= '.' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==42) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSqlDsl.g:1302:5: kw= '.'
            	            {
            	            kw=(Token)match(input,42,FOLLOW_24); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getFullStopKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1308:4: (kw= '*' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==43) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalSqlDsl.g:1309:5: kw= '*'
            	            {
            	            kw=(Token)match(input,43,FOLLOW_25); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getAsteriskKeyword_1_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalSqlDsl.g:1315:4: (kw= '=' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==44) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalSqlDsl.g:1316:5: kw= '='
            	            {
            	            kw=(Token)match(input,44,FOLLOW_6); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getComplexStringAccess().getEqualsSignKeyword_1_2());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getComplexStringAccess().getEStringParserRuleCall_1_3());
            	    			
            	    pushFollow(FOLLOW_23);
            	    this_EString_4=ruleEString();

            	    state._fsp--;


            	    				current.merge(this_EString_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalSqlDsl.g:1333:3: (kw= '()' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSqlDsl.g:1334:4: kw= '()'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplexStringAccess().getLeftParenthesisRightParenthesisKeyword_2());
                    			

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000002C9002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003FFF004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003FFF000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003FFF000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003C0000000032L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000030L});

}
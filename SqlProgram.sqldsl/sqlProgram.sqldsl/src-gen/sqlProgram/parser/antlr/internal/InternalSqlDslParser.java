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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SqlProgram'", "'{'", "'queries'", "','", "'}'", "'Selection'", "'objects'", "'clauses'", "'Creation'", "'type'", "'constaints'", "'Update'", "'Insertion'", "'values'", "'Delete'", "'Table'", "'columns'", "'Column'", "'Clause'", "'body'", "'Constaint'", "'Value'", "'columnvalues'", "'ColumnValue'", "'value'"
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
    // InternalSqlDsl.g:71:1: ruleSqlProgram returns [EObject current=null] : ( () otherlv_1= 'SqlProgram' otherlv_2= '{' (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleSqlProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_queries_5_0 = null;

        EObject lv_queries_7_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:77:2: ( ( () otherlv_1= 'SqlProgram' otherlv_2= '{' (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSqlDsl.g:78:2: ( () otherlv_1= 'SqlProgram' otherlv_2= '{' (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSqlDsl.g:78:2: ( () otherlv_1= 'SqlProgram' otherlv_2= '{' (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSqlDsl.g:79:3: () otherlv_1= 'SqlProgram' otherlv_2= '{' (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSqlDsl.g:79:3: ()
            // InternalSqlDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSqlProgramAccess().getSqlProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSqlProgramAccess().getSqlProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:94:3: (otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSqlDsl.g:95:4: otherlv_3= 'queries' otherlv_4= '{' ( (lv_queries_5_0= ruleQueries ) ) (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSqlProgramAccess().getQueriesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSqlProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:103:4: ( (lv_queries_5_0= ruleQueries ) )
                    // InternalSqlDsl.g:104:5: (lv_queries_5_0= ruleQueries )
                    {
                    // InternalSqlDsl.g:104:5: (lv_queries_5_0= ruleQueries )
                    // InternalSqlDsl.g:105:6: lv_queries_5_0= ruleQueries
                    {

                    						newCompositeNode(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_queries_5_0=ruleQueries();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSqlProgramRule());
                    						}
                    						add(
                    							current,
                    							"queries",
                    							lv_queries_5_0,
                    							"sqlProgram.SqlDsl.Queries");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:122:4: (otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSqlDsl.g:123:5: otherlv_6= ',' ( (lv_queries_7_0= ruleQueries ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSqlProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:127:5: ( (lv_queries_7_0= ruleQueries ) )
                    	    // InternalSqlDsl.g:128:6: (lv_queries_7_0= ruleQueries )
                    	    {
                    	    // InternalSqlDsl.g:128:6: (lv_queries_7_0= ruleQueries )
                    	    // InternalSqlDsl.g:129:7: lv_queries_7_0= ruleQueries
                    	    {

                    	    							newCompositeNode(grammarAccess.getSqlProgramAccess().getQueriesQueriesParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_queries_7_0=ruleQueries();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSqlProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"queries",
                    	    								lv_queries_7_0,
                    	    								"sqlProgram.SqlDsl.Queries");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSqlProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSqlDsl.g:160:1: entryRuleQueries returns [EObject current=null] : iv_ruleQueries= ruleQueries EOF ;
    public final EObject entryRuleQueries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueries = null;


        try {
            // InternalSqlDsl.g:160:48: (iv_ruleQueries= ruleQueries EOF )
            // InternalSqlDsl.g:161:2: iv_ruleQueries= ruleQueries EOF
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
    // InternalSqlDsl.g:167:1: ruleQueries returns [EObject current=null] : (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete ) ;
    public final EObject ruleQueries() throws RecognitionException {
        EObject current = null;

        EObject this_Selection_0 = null;

        EObject this_Creation_1 = null;

        EObject this_Update_2 = null;

        EObject this_Insertion_3 = null;

        EObject this_Delete_4 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:173:2: ( (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete ) )
            // InternalSqlDsl.g:174:2: (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete )
            {
            // InternalSqlDsl.g:174:2: (this_Selection_0= ruleSelection | this_Creation_1= ruleCreation | this_Update_2= ruleUpdate | this_Insertion_3= ruleInsertion | this_Delete_4= ruleDelete )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSqlDsl.g:175:3: this_Selection_0= ruleSelection
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
                    // InternalSqlDsl.g:184:3: this_Creation_1= ruleCreation
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
                    // InternalSqlDsl.g:193:3: this_Update_2= ruleUpdate
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
                    // InternalSqlDsl.g:202:3: this_Insertion_3= ruleInsertion
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
                    // InternalSqlDsl.g:211:3: this_Delete_4= ruleDelete
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


    // $ANTLR start "entryRuleObjects"
    // InternalSqlDsl.g:223:1: entryRuleObjects returns [EObject current=null] : iv_ruleObjects= ruleObjects EOF ;
    public final EObject entryRuleObjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjects = null;


        try {
            // InternalSqlDsl.g:223:48: (iv_ruleObjects= ruleObjects EOF )
            // InternalSqlDsl.g:224:2: iv_ruleObjects= ruleObjects EOF
            {
             newCompositeNode(grammarAccess.getObjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjects=ruleObjects();

            state._fsp--;

             current =iv_ruleObjects; 
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
    // $ANTLR end "entryRuleObjects"


    // $ANTLR start "ruleObjects"
    // InternalSqlDsl.g:230:1: ruleObjects returns [EObject current=null] : (this_Table_0= ruleTable | this_Column_1= ruleColumn ) ;
    public final EObject ruleObjects() throws RecognitionException {
        EObject current = null;

        EObject this_Table_0 = null;

        EObject this_Column_1 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:236:2: ( (this_Table_0= ruleTable | this_Column_1= ruleColumn ) )
            // InternalSqlDsl.g:237:2: (this_Table_0= ruleTable | this_Column_1= ruleColumn )
            {
            // InternalSqlDsl.g:237:2: (this_Table_0= ruleTable | this_Column_1= ruleColumn )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSqlDsl.g:238:3: this_Table_0= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getObjectsAccess().getTableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_0=ruleTable();

                    state._fsp--;


                    			current = this_Table_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:247:3: this_Column_1= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getObjectsAccess().getColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_1=ruleColumn();

                    state._fsp--;


                    			current = this_Column_1;
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
    // $ANTLR end "ruleObjects"


    // $ANTLR start "entryRuleSelection"
    // InternalSqlDsl.g:259:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalSqlDsl.g:259:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalSqlDsl.g:260:2: iv_ruleSelection= ruleSelection EOF
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
    // InternalSqlDsl.g:266:1: ruleSelection returns [EObject current=null] : ( () otherlv_1= 'Selection' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_objects_5_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_clauses_11_0 = null;

        EObject lv_clauses_13_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:272:2: ( ( () otherlv_1= 'Selection' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSqlDsl.g:273:2: ( () otherlv_1= 'Selection' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSqlDsl.g:273:2: ( () otherlv_1= 'Selection' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSqlDsl.g:274:3: () otherlv_1= 'Selection' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSqlDsl.g:274:3: ()
            // InternalSqlDsl.g:275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectionAccess().getSelectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getSelectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:289:3: (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSqlDsl.g:290:4: otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getObjectsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:298:4: ( (lv_objects_5_0= ruleObjects ) )
                    // InternalSqlDsl.g:299:5: (lv_objects_5_0= ruleObjects )
                    {
                    // InternalSqlDsl.g:299:5: (lv_objects_5_0= ruleObjects )
                    // InternalSqlDsl.g:300:6: lv_objects_5_0= ruleObjects
                    {

                    						newCompositeNode(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objects_5_0=ruleObjects();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectionRule());
                    						}
                    						add(
                    							current,
                    							"objects",
                    							lv_objects_5_0,
                    							"sqlProgram.SqlDsl.Objects");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:317:4: (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSqlDsl.g:318:5: otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:322:5: ( (lv_objects_7_0= ruleObjects ) )
                    	    // InternalSqlDsl.g:323:6: (lv_objects_7_0= ruleObjects )
                    	    {
                    	    // InternalSqlDsl.g:323:6: (lv_objects_7_0= ruleObjects )
                    	    // InternalSqlDsl.g:324:7: lv_objects_7_0= ruleObjects
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectionAccess().getObjectsObjectsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objects_7_0=ruleObjects();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objects",
                    	    								lv_objects_7_0,
                    	    								"sqlProgram.SqlDsl.Objects");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSqlDsl.g:347:3: (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSqlDsl.g:348:4: otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSelectionAccess().getClausesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:356:4: ( (lv_clauses_11_0= ruleClause ) )
                    // InternalSqlDsl.g:357:5: (lv_clauses_11_0= ruleClause )
                    {
                    // InternalSqlDsl.g:357:5: (lv_clauses_11_0= ruleClause )
                    // InternalSqlDsl.g:358:6: lv_clauses_11_0= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_clauses_11_0=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectionRule());
                    						}
                    						add(
                    							current,
                    							"clauses",
                    							lv_clauses_11_0,
                    							"sqlProgram.SqlDsl.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:375:4: (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSqlDsl.g:376:5: otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSelectionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:380:5: ( (lv_clauses_13_0= ruleClause ) )
                    	    // InternalSqlDsl.g:381:6: (lv_clauses_13_0= ruleClause )
                    	    {
                    	    // InternalSqlDsl.g:381:6: (lv_clauses_13_0= ruleClause )
                    	    // InternalSqlDsl.g:382:7: lv_clauses_13_0= ruleClause
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectionAccess().getClausesClauseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_clauses_13_0=ruleClause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clauses",
                    	    								lv_clauses_13_0,
                    	    								"sqlProgram.SqlDsl.Clause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:413:1: entryRuleCreation returns [EObject current=null] : iv_ruleCreation= ruleCreation EOF ;
    public final EObject entryRuleCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreation = null;


        try {
            // InternalSqlDsl.g:413:49: (iv_ruleCreation= ruleCreation EOF )
            // InternalSqlDsl.g:414:2: iv_ruleCreation= ruleCreation EOF
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
    // InternalSqlDsl.g:420:1: ruleCreation returns [EObject current=null] : ( () otherlv_1= 'Creation' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )? (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleCreation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_objects_9_0 = null;

        EObject lv_constaints_13_0 = null;

        EObject lv_constaints_15_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:426:2: ( ( () otherlv_1= 'Creation' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )? (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalSqlDsl.g:427:2: ( () otherlv_1= 'Creation' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )? (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalSqlDsl.g:427:2: ( () otherlv_1= 'Creation' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )? (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalSqlDsl.g:428:3: () otherlv_1= 'Creation' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )? (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalSqlDsl.g:428:3: ()
            // InternalSqlDsl.g:429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreationAccess().getCreationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCreationAccess().getCreationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:443:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSqlDsl.g:444:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getCreationAccess().getTypeKeyword_3_0());
                    			
                    // InternalSqlDsl.g:448:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalSqlDsl.g:449:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalSqlDsl.g:449:5: (lv_type_4_0= ruleEString )
                    // InternalSqlDsl.g:450:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCreationAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"sqlProgram.SqlDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSqlDsl.g:468:3: (otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSqlDsl.g:469:4: otherlv_5= 'objects' otherlv_6= '{' ( (lv_objects_7_0= ruleObjects ) ) (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreationAccess().getObjectsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:477:4: ( (lv_objects_7_0= ruleObjects ) )
                    // InternalSqlDsl.g:478:5: (lv_objects_7_0= ruleObjects )
                    {
                    // InternalSqlDsl.g:478:5: (lv_objects_7_0= ruleObjects )
                    // InternalSqlDsl.g:479:6: lv_objects_7_0= ruleObjects
                    {

                    						newCompositeNode(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objects_7_0=ruleObjects();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreationRule());
                    						}
                    						add(
                    							current,
                    							"objects",
                    							lv_objects_7_0,
                    							"sqlProgram.SqlDsl.Objects");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:496:4: (otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSqlDsl.g:497:5: otherlv_8= ',' ( (lv_objects_9_0= ruleObjects ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCreationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:501:5: ( (lv_objects_9_0= ruleObjects ) )
                    	    // InternalSqlDsl.g:502:6: (lv_objects_9_0= ruleObjects )
                    	    {
                    	    // InternalSqlDsl.g:502:6: (lv_objects_9_0= ruleObjects )
                    	    // InternalSqlDsl.g:503:7: lv_objects_9_0= ruleObjects
                    	    {

                    	    							newCompositeNode(grammarAccess.getCreationAccess().getObjectsObjectsParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objects_9_0=ruleObjects();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objects",
                    	    								lv_objects_9_0,
                    	    								"sqlProgram.SqlDsl.Objects");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSqlDsl.g:526:3: (otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSqlDsl.g:527:4: otherlv_11= 'constaints' otherlv_12= '{' ( (lv_constaints_13_0= ruleConstaint ) ) (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCreationAccess().getConstaintsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getCreationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSqlDsl.g:535:4: ( (lv_constaints_13_0= ruleConstaint ) )
                    // InternalSqlDsl.g:536:5: (lv_constaints_13_0= ruleConstaint )
                    {
                    // InternalSqlDsl.g:536:5: (lv_constaints_13_0= ruleConstaint )
                    // InternalSqlDsl.g:537:6: lv_constaints_13_0= ruleConstaint
                    {

                    						newCompositeNode(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_constaints_13_0=ruleConstaint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreationRule());
                    						}
                    						add(
                    							current,
                    							"constaints",
                    							lv_constaints_13_0,
                    							"sqlProgram.SqlDsl.Constaint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:554:4: (otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSqlDsl.g:555:5: otherlv_14= ',' ( (lv_constaints_15_0= ruleConstaint ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCreationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSqlDsl.g:559:5: ( (lv_constaints_15_0= ruleConstaint ) )
                    	    // InternalSqlDsl.g:560:6: (lv_constaints_15_0= ruleConstaint )
                    	    {
                    	    // InternalSqlDsl.g:560:6: (lv_constaints_15_0= ruleConstaint )
                    	    // InternalSqlDsl.g:561:7: lv_constaints_15_0= ruleConstaint
                    	    {

                    	    							newCompositeNode(grammarAccess.getCreationAccess().getConstaintsConstaintParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_constaints_15_0=ruleConstaint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCreationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constaints",
                    	    								lv_constaints_15_0,
                    	    								"sqlProgram.SqlDsl.Constaint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCreationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalSqlDsl.g:592:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalSqlDsl.g:592:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalSqlDsl.g:593:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalSqlDsl.g:599:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'Update' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_objects_5_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_clauses_11_0 = null;

        EObject lv_clauses_13_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:605:2: ( ( () otherlv_1= 'Update' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSqlDsl.g:606:2: ( () otherlv_1= 'Update' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSqlDsl.g:606:2: ( () otherlv_1= 'Update' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSqlDsl.g:607:3: () otherlv_1= 'Update' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSqlDsl.g:607:3: ()
            // InternalSqlDsl.g:608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:622:3: (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSqlDsl.g:623:4: otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getObjectsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:631:4: ( (lv_objects_5_0= ruleObjects ) )
                    // InternalSqlDsl.g:632:5: (lv_objects_5_0= ruleObjects )
                    {
                    // InternalSqlDsl.g:632:5: (lv_objects_5_0= ruleObjects )
                    // InternalSqlDsl.g:633:6: lv_objects_5_0= ruleObjects
                    {

                    						newCompositeNode(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objects_5_0=ruleObjects();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateRule());
                    						}
                    						add(
                    							current,
                    							"objects",
                    							lv_objects_5_0,
                    							"sqlProgram.SqlDsl.Objects");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:650:4: (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSqlDsl.g:651:5: otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:655:5: ( (lv_objects_7_0= ruleObjects ) )
                    	    // InternalSqlDsl.g:656:6: (lv_objects_7_0= ruleObjects )
                    	    {
                    	    // InternalSqlDsl.g:656:6: (lv_objects_7_0= ruleObjects )
                    	    // InternalSqlDsl.g:657:7: lv_objects_7_0= ruleObjects
                    	    {

                    	    							newCompositeNode(grammarAccess.getUpdateAccess().getObjectsObjectsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objects_7_0=ruleObjects();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objects",
                    	    								lv_objects_7_0,
                    	    								"sqlProgram.SqlDsl.Objects");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSqlDsl.g:680:3: (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSqlDsl.g:681:4: otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getUpdateAccess().getClausesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:689:4: ( (lv_clauses_11_0= ruleClause ) )
                    // InternalSqlDsl.g:690:5: (lv_clauses_11_0= ruleClause )
                    {
                    // InternalSqlDsl.g:690:5: (lv_clauses_11_0= ruleClause )
                    // InternalSqlDsl.g:691:6: lv_clauses_11_0= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_clauses_11_0=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateRule());
                    						}
                    						add(
                    							current,
                    							"clauses",
                    							lv_clauses_11_0,
                    							"sqlProgram.SqlDsl.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:708:4: (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSqlDsl.g:709:5: otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getUpdateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:713:5: ( (lv_clauses_13_0= ruleClause ) )
                    	    // InternalSqlDsl.g:714:6: (lv_clauses_13_0= ruleClause )
                    	    {
                    	    // InternalSqlDsl.g:714:6: (lv_clauses_13_0= ruleClause )
                    	    // InternalSqlDsl.g:715:7: lv_clauses_13_0= ruleClause
                    	    {

                    	    							newCompositeNode(grammarAccess.getUpdateAccess().getClausesClauseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_clauses_13_0=ruleClause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUpdateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clauses",
                    	    								lv_clauses_13_0,
                    	    								"sqlProgram.SqlDsl.Clause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:746:1: entryRuleInsertion returns [EObject current=null] : iv_ruleInsertion= ruleInsertion EOF ;
    public final EObject entryRuleInsertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertion = null;


        try {
            // InternalSqlDsl.g:746:50: (iv_ruleInsertion= ruleInsertion EOF )
            // InternalSqlDsl.g:747:2: iv_ruleInsertion= ruleInsertion EOF
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
    // InternalSqlDsl.g:753:1: ruleInsertion returns [EObject current=null] : ( () otherlv_1= 'Insertion' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleInsertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_objects_5_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_values_11_0 = null;

        EObject lv_values_13_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:759:2: ( ( () otherlv_1= 'Insertion' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSqlDsl.g:760:2: ( () otherlv_1= 'Insertion' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSqlDsl.g:760:2: ( () otherlv_1= 'Insertion' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSqlDsl.g:761:3: () otherlv_1= 'Insertion' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSqlDsl.g:761:3: ()
            // InternalSqlDsl.g:762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInsertionAccess().getInsertionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertionAccess().getInsertionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:776:3: (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSqlDsl.g:777:4: otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInsertionAccess().getObjectsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:785:4: ( (lv_objects_5_0= ruleObjects ) )
                    // InternalSqlDsl.g:786:5: (lv_objects_5_0= ruleObjects )
                    {
                    // InternalSqlDsl.g:786:5: (lv_objects_5_0= ruleObjects )
                    // InternalSqlDsl.g:787:6: lv_objects_5_0= ruleObjects
                    {

                    						newCompositeNode(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objects_5_0=ruleObjects();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertionRule());
                    						}
                    						add(
                    							current,
                    							"objects",
                    							lv_objects_5_0,
                    							"sqlProgram.SqlDsl.Objects");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:804:4: (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSqlDsl.g:805:5: otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getInsertionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:809:5: ( (lv_objects_7_0= ruleObjects ) )
                    	    // InternalSqlDsl.g:810:6: (lv_objects_7_0= ruleObjects )
                    	    {
                    	    // InternalSqlDsl.g:810:6: (lv_objects_7_0= ruleObjects )
                    	    // InternalSqlDsl.g:811:7: lv_objects_7_0= ruleObjects
                    	    {

                    	    							newCompositeNode(grammarAccess.getInsertionAccess().getObjectsObjectsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objects_7_0=ruleObjects();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInsertionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objects",
                    	    								lv_objects_7_0,
                    	    								"sqlProgram.SqlDsl.Objects");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSqlDsl.g:834:3: (otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSqlDsl.g:835:4: otherlv_9= 'values' otherlv_10= '{' ( (lv_values_11_0= ruleValue ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getInsertionAccess().getValuesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getInsertionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:843:4: ( (lv_values_11_0= ruleValue ) )
                    // InternalSqlDsl.g:844:5: (lv_values_11_0= ruleValue )
                    {
                    // InternalSqlDsl.g:844:5: (lv_values_11_0= ruleValue )
                    // InternalSqlDsl.g:845:6: lv_values_11_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_values_11_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertionRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_11_0,
                    							"sqlProgram.SqlDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:862:4: (otherlv_12= ',' ( (lv_values_13_0= ruleValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSqlDsl.g:863:5: otherlv_12= ',' ( (lv_values_13_0= ruleValue ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getInsertionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:867:5: ( (lv_values_13_0= ruleValue ) )
                    	    // InternalSqlDsl.g:868:6: (lv_values_13_0= ruleValue )
                    	    {
                    	    // InternalSqlDsl.g:868:6: (lv_values_13_0= ruleValue )
                    	    // InternalSqlDsl.g:869:7: lv_values_13_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getInsertionAccess().getValuesValueParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_values_13_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInsertionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_13_0,
                    	    								"sqlProgram.SqlDsl.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getInsertionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:900:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalSqlDsl.g:900:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalSqlDsl.g:901:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalSqlDsl.g:907:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'Delete' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_objects_5_0 = null;

        EObject lv_objects_7_0 = null;

        EObject lv_clauses_11_0 = null;

        EObject lv_clauses_13_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:913:2: ( ( () otherlv_1= 'Delete' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalSqlDsl.g:914:2: ( () otherlv_1= 'Delete' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalSqlDsl.g:914:2: ( () otherlv_1= 'Delete' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalSqlDsl.g:915:3: () otherlv_1= 'Delete' otherlv_2= '{' (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )? (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalSqlDsl.g:915:3: ()
            // InternalSqlDsl.g:916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:930:3: (otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSqlDsl.g:931:4: otherlv_3= 'objects' otherlv_4= '{' ( (lv_objects_5_0= ruleObjects ) ) (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeleteAccess().getObjectsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:939:4: ( (lv_objects_5_0= ruleObjects ) )
                    // InternalSqlDsl.g:940:5: (lv_objects_5_0= ruleObjects )
                    {
                    // InternalSqlDsl.g:940:5: (lv_objects_5_0= ruleObjects )
                    // InternalSqlDsl.g:941:6: lv_objects_5_0= ruleObjects
                    {

                    						newCompositeNode(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_objects_5_0=ruleObjects();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteRule());
                    						}
                    						add(
                    							current,
                    							"objects",
                    							lv_objects_5_0,
                    							"sqlProgram.SqlDsl.Objects");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:958:4: (otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSqlDsl.g:959:5: otherlv_6= ',' ( (lv_objects_7_0= ruleObjects ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDeleteAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:963:5: ( (lv_objects_7_0= ruleObjects ) )
                    	    // InternalSqlDsl.g:964:6: (lv_objects_7_0= ruleObjects )
                    	    {
                    	    // InternalSqlDsl.g:964:6: (lv_objects_7_0= ruleObjects )
                    	    // InternalSqlDsl.g:965:7: lv_objects_7_0= ruleObjects
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeleteAccess().getObjectsObjectsParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_objects_7_0=ruleObjects();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"objects",
                    	    								lv_objects_7_0,
                    	    								"sqlProgram.SqlDsl.Objects");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSqlDsl.g:988:3: (otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSqlDsl.g:989:4: otherlv_9= 'clauses' otherlv_10= '{' ( (lv_clauses_11_0= ruleClause ) ) (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeleteAccess().getClausesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:997:4: ( (lv_clauses_11_0= ruleClause ) )
                    // InternalSqlDsl.g:998:5: (lv_clauses_11_0= ruleClause )
                    {
                    // InternalSqlDsl.g:998:5: (lv_clauses_11_0= ruleClause )
                    // InternalSqlDsl.g:999:6: lv_clauses_11_0= ruleClause
                    {

                    						newCompositeNode(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_clauses_11_0=ruleClause();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteRule());
                    						}
                    						add(
                    							current,
                    							"clauses",
                    							lv_clauses_11_0,
                    							"sqlProgram.SqlDsl.Clause");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:1016:4: (otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1017:5: otherlv_12= ',' ( (lv_clauses_13_0= ruleClause ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDeleteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:1021:5: ( (lv_clauses_13_0= ruleClause ) )
                    	    // InternalSqlDsl.g:1022:6: (lv_clauses_13_0= ruleClause )
                    	    {
                    	    // InternalSqlDsl.g:1022:6: (lv_clauses_13_0= ruleClause )
                    	    // InternalSqlDsl.g:1023:7: lv_clauses_13_0= ruleClause
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeleteAccess().getClausesClauseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_clauses_13_0=ruleClause();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeleteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"clauses",
                    	    								lv_clauses_13_0,
                    	    								"sqlProgram.SqlDsl.Clause");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:1054:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSqlDsl.g:1054:47: (iv_ruleEString= ruleEString EOF )
            // InternalSqlDsl.g:1055:2: iv_ruleEString= ruleEString EOF
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
    // InternalSqlDsl.g:1061:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSqlDsl.g:1067:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSqlDsl.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSqlDsl.g:1068:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSqlDsl.g:1069:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSqlDsl.g:1077:3: this_ID_1= RULE_ID
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
    // InternalSqlDsl.g:1088:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSqlDsl.g:1088:46: (iv_ruleTable= ruleTable EOF )
            // InternalSqlDsl.g:1089:2: iv_ruleTable= ruleTable EOF
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
    // InternalSqlDsl.g:1095:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_columns_8_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1101:2: ( ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalSqlDsl.g:1102:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalSqlDsl.g:1102:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalSqlDsl.g:1103:3: () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalSqlDsl.g:1103:3: ()
            // InternalSqlDsl.g:1104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            // InternalSqlDsl.g:1114:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSqlDsl.g:1115:4: (lv_name_2_0= ruleEString )
            {
            // InternalSqlDsl.g:1115:4: (lv_name_2_0= ruleEString )
            // InternalSqlDsl.g:1116:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSqlDsl.g:1137:3: (otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSqlDsl.g:1138:4: otherlv_4= 'columns' otherlv_5= '{' ( (lv_columns_6_0= ruleColumn ) ) (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getColumnsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSqlDsl.g:1146:4: ( (lv_columns_6_0= ruleColumn ) )
                    // InternalSqlDsl.g:1147:5: (lv_columns_6_0= ruleColumn )
                    {
                    // InternalSqlDsl.g:1147:5: (lv_columns_6_0= ruleColumn )
                    // InternalSqlDsl.g:1148:6: lv_columns_6_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_columns_6_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_6_0,
                    							"sqlProgram.SqlDsl.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSqlDsl.g:1165:4: (otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1166:5: otherlv_7= ',' ( (lv_columns_8_0= ruleColumn ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalSqlDsl.g:1170:5: ( (lv_columns_8_0= ruleColumn ) )
                    	    // InternalSqlDsl.g:1171:6: (lv_columns_8_0= ruleColumn )
                    	    {
                    	    // InternalSqlDsl.g:1171:6: (lv_columns_8_0= ruleColumn )
                    	    // InternalSqlDsl.g:1172:7: lv_columns_8_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_columns_8_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_8_0,
                    	    								"sqlProgram.SqlDsl.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:1203:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSqlDsl.g:1203:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSqlDsl.g:1204:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalSqlDsl.g:1210:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1216:2: ( ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSqlDsl.g:1217:2: ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSqlDsl.g:1217:2: ( () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalSqlDsl.g:1218:3: () otherlv_1= 'Column' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSqlDsl.g:1218:3: ()
            // InternalSqlDsl.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            // InternalSqlDsl.g:1229:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSqlDsl.g:1230:4: (lv_name_2_0= ruleEString )
            {
            // InternalSqlDsl.g:1230:4: (lv_name_2_0= ruleEString )
            // InternalSqlDsl.g:1231:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSqlDsl.g:1252:3: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSqlDsl.g:1253:4: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getTypeKeyword_4_0());
                    			
                    // InternalSqlDsl.g:1257:4: ( ( ruleEString ) )
                    // InternalSqlDsl.g:1258:5: ( ruleEString )
                    {
                    // InternalSqlDsl.g:1258:5: ( ruleEString )
                    // InternalSqlDsl.g:1259:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getColumnAccess().getTypeTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:1282:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalSqlDsl.g:1282:47: (iv_ruleClause= ruleClause EOF )
            // InternalSqlDsl.g:1283:2: iv_ruleClause= ruleClause EOF
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
    // InternalSqlDsl.g:1289:1: ruleClause returns [EObject current=null] : (otherlv_0= 'Clause' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1295:2: ( (otherlv_0= 'Clause' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalSqlDsl.g:1296:2: (otherlv_0= 'Clause' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSqlDsl.g:1296:2: (otherlv_0= 'Clause' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalSqlDsl.g:1297:3: otherlv_0= 'Clause' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'body' ( (lv_body_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getClauseKeyword_0());
            		
            // InternalSqlDsl.g:1301:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSqlDsl.g:1302:4: (lv_name_1_0= ruleEString )
            {
            // InternalSqlDsl.g:1302:4: (lv_name_1_0= ruleEString )
            // InternalSqlDsl.g:1303:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getBodyKeyword_3());
            		
            // InternalSqlDsl.g:1328:3: ( (lv_body_4_0= ruleEString ) )
            // InternalSqlDsl.g:1329:4: (lv_body_4_0= ruleEString )
            {
            // InternalSqlDsl.g:1329:4: (lv_body_4_0= ruleEString )
            // InternalSqlDsl.g:1330:5: lv_body_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getBodyEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_body_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_4_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClauseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalSqlDsl.g:1355:1: entryRuleConstaint returns [EObject current=null] : iv_ruleConstaint= ruleConstaint EOF ;
    public final EObject entryRuleConstaint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstaint = null;


        try {
            // InternalSqlDsl.g:1355:50: (iv_ruleConstaint= ruleConstaint EOF )
            // InternalSqlDsl.g:1356:2: iv_ruleConstaint= ruleConstaint EOF
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
    // InternalSqlDsl.g:1362:1: ruleConstaint returns [EObject current=null] : (otherlv_0= 'Constaint' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstaint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1368:2: ( (otherlv_0= 'Constaint' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalSqlDsl.g:1369:2: (otherlv_0= 'Constaint' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalSqlDsl.g:1369:2: (otherlv_0= 'Constaint' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalSqlDsl.g:1370:3: otherlv_0= 'Constaint' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstaintAccess().getConstaintKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getConstaintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConstaintAccess().getBodyKeyword_2());
            		
            // InternalSqlDsl.g:1382:3: ( (lv_body_3_0= ruleEString ) )
            // InternalSqlDsl.g:1383:4: (lv_body_3_0= ruleEString )
            {
            // InternalSqlDsl.g:1383:4: (lv_body_3_0= ruleEString )
            // InternalSqlDsl.g:1384:5: lv_body_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstaintAccess().getBodyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_body_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstaintRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"sqlProgram.SqlDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstaintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSqlDsl.g:1409:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSqlDsl.g:1409:46: (iv_ruleValue= ruleValue EOF )
            // InternalSqlDsl.g:1410:2: iv_ruleValue= ruleValue EOF
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
    // InternalSqlDsl.g:1416:1: ruleValue returns [EObject current=null] : ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_columnvalues_5_0 = null;

        EObject lv_columnvalues_7_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1422:2: ( ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSqlDsl.g:1423:2: ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSqlDsl.g:1423:2: ( () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSqlDsl.g:1424:3: () otherlv_1= 'Value' otherlv_2= '{' (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSqlDsl.g:1424:3: ()
            // InternalSqlDsl.g:1425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueAccess().getValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getValueAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:1439:3: (otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSqlDsl.g:1440:4: otherlv_3= 'columnvalues' otherlv_4= '{' ( (lv_columnvalues_5_0= ruleColumnValue ) ) (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getValueAccess().getColumnvaluesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSqlDsl.g:1448:4: ( (lv_columnvalues_5_0= ruleColumnValue ) )
                    // InternalSqlDsl.g:1449:5: (lv_columnvalues_5_0= ruleColumnValue )
                    {
                    // InternalSqlDsl.g:1449:5: (lv_columnvalues_5_0= ruleColumnValue )
                    // InternalSqlDsl.g:1450:6: lv_columnvalues_5_0= ruleColumnValue
                    {

                    						newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalSqlDsl.g:1467:4: (otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalSqlDsl.g:1468:5: otherlv_6= ',' ( (lv_columnvalues_7_0= ruleColumnValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getValueAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSqlDsl.g:1472:5: ( (lv_columnvalues_7_0= ruleColumnValue ) )
                    	    // InternalSqlDsl.g:1473:6: (lv_columnvalues_7_0= ruleColumnValue )
                    	    {
                    	    // InternalSqlDsl.g:1473:6: (lv_columnvalues_7_0= ruleColumnValue )
                    	    // InternalSqlDsl.g:1474:7: lv_columnvalues_7_0= ruleColumnValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getValueAccess().getColumnvaluesColumnValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_columnvalues_7_0=ruleColumnValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columnvalues",
                    	    								lv_columnvalues_7_0,
                    	    								"sqlProgram.SqlDsl.ColumnValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalSqlDsl.g:1505:1: entryRuleColumnValue returns [EObject current=null] : iv_ruleColumnValue= ruleColumnValue EOF ;
    public final EObject entryRuleColumnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnValue = null;


        try {
            // InternalSqlDsl.g:1505:52: (iv_ruleColumnValue= ruleColumnValue EOF )
            // InternalSqlDsl.g:1506:2: iv_ruleColumnValue= ruleColumnValue EOF
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
    // InternalSqlDsl.g:1512:1: ruleColumnValue returns [EObject current=null] : ( () otherlv_1= 'ColumnValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleColumnValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSqlDsl.g:1518:2: ( ( () otherlv_1= 'ColumnValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalSqlDsl.g:1519:2: ( () otherlv_1= 'ColumnValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalSqlDsl.g:1519:2: ( () otherlv_1= 'ColumnValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalSqlDsl.g:1520:3: () otherlv_1= 'ColumnValue' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalSqlDsl.g:1520:3: ()
            // InternalSqlDsl.g:1521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnValueAccess().getColumnValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnValueAccess().getColumnValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnValueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSqlDsl.g:1535:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSqlDsl.g:1536:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnValueAccess().getValueKeyword_3_0());
                    			
                    // InternalSqlDsl.g:1540:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalSqlDsl.g:1541:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalSqlDsl.g:1541:5: (lv_value_4_0= ruleEString )
                    // InternalSqlDsl.g:1542:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnValueAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"sqlProgram.SqlDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getColumnValueAccess().getRightCurlyBracketKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002C90000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000328000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000228000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001028000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800008000L});

}
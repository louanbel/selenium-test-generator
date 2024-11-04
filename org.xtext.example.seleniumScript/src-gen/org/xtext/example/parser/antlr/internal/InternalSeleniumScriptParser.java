package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SeleniumScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "':'", "'goto'", "'click'", "'assert'", "'write'", "'in'", "'uncheck_all'", "'select'", "'from'", "'with'", "'and'", "'has'", "'let'", "'as'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int RULE_URL=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSeleniumScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleniumScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleniumScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeleniumScript.g"; }



     	private SeleniumScriptGrammarAccess grammarAccess;

        public InternalSeleniumScriptParser(TokenStream input, SeleniumScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SeleniumScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSeleniumScript.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSeleniumScript.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSeleniumScript.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSeleniumScript.g:71:1: ruleModel returns [EObject current=null] : ( (lv_tests_0_0= ruleTest ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tests_0_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:77:2: ( ( (lv_tests_0_0= ruleTest ) )* )
            // InternalSeleniumScript.g:78:2: ( (lv_tests_0_0= ruleTest ) )*
            {
            // InternalSeleniumScript.g:78:2: ( (lv_tests_0_0= ruleTest ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumScript.g:79:3: (lv_tests_0_0= ruleTest )
            	    {
            	    // InternalSeleniumScript.g:79:3: (lv_tests_0_0= ruleTest )
            	    // InternalSeleniumScript.g:80:4: lv_tests_0_0= ruleTest
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tests_0_0=ruleTest();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tests",
            	    					lv_tests_0_0,
            	    					"org.xtext.example.SeleniumScript.Test");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTest"
    // InternalSeleniumScript.g:100:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalSeleniumScript.g:100:45: (iv_ruleTest= ruleTest EOF )
            // InternalSeleniumScript.g:101:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalSeleniumScript.g:107:1: ruleTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:113:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ ) )
            // InternalSeleniumScript.g:114:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ )
            {
            // InternalSeleniumScript.g:114:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+ )
            // InternalSeleniumScript.g:115:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_actions_3_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalSeleniumScript.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSeleniumScript.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSeleniumScript.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalSeleniumScript.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getColonKeyword_2());
            		
            // InternalSeleniumScript.g:141:3: ( (lv_actions_3_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=17)||(LA2_0>=19 && LA2_0<=20)||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeleniumScript.g:142:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalSeleniumScript.g:142:4: (lv_actions_3_0= ruleAction )
            	    // InternalSeleniumScript.g:143:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"org.xtext.example.SeleniumScript.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleAction"
    // InternalSeleniumScript.g:164:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSeleniumScript.g:164:47: (iv_ruleAction= ruleAction EOF )
            // InternalSeleniumScript.g:165:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSeleniumScript.g:171:1: ruleAction returns [EObject current=null] : (this_GotoAction_0= ruleGotoAction | this_ClickAction_1= ruleClickAction | this_AssertAction_2= ruleAssertAction | this_WriteAction_3= ruleWriteAction | ( () ruleUncheckAllAction ) | this_SelectAction_6= ruleSelectAction | this_VariableAction_7= ruleVariableAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_GotoAction_0 = null;

        EObject this_ClickAction_1 = null;

        EObject this_AssertAction_2 = null;

        EObject this_WriteAction_3 = null;

        EObject this_SelectAction_6 = null;

        EObject this_VariableAction_7 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:177:2: ( (this_GotoAction_0= ruleGotoAction | this_ClickAction_1= ruleClickAction | this_AssertAction_2= ruleAssertAction | this_WriteAction_3= ruleWriteAction | ( () ruleUncheckAllAction ) | this_SelectAction_6= ruleSelectAction | this_VariableAction_7= ruleVariableAction ) )
            // InternalSeleniumScript.g:178:2: (this_GotoAction_0= ruleGotoAction | this_ClickAction_1= ruleClickAction | this_AssertAction_2= ruleAssertAction | this_WriteAction_3= ruleWriteAction | ( () ruleUncheckAllAction ) | this_SelectAction_6= ruleSelectAction | this_VariableAction_7= ruleVariableAction )
            {
            // InternalSeleniumScript.g:178:2: (this_GotoAction_0= ruleGotoAction | this_ClickAction_1= ruleClickAction | this_AssertAction_2= ruleAssertAction | this_WriteAction_3= ruleWriteAction | ( () ruleUncheckAllAction ) | this_SelectAction_6= ruleSelectAction | this_VariableAction_7= ruleVariableAction )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSeleniumScript.g:179:3: this_GotoAction_0= ruleGotoAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGotoActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GotoAction_0=ruleGotoAction();

                    state._fsp--;


                    			current = this_GotoAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:188:3: this_ClickAction_1= ruleClickAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickAction_1=ruleClickAction();

                    state._fsp--;


                    			current = this_ClickAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:197:3: this_AssertAction_2= ruleAssertAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAssertActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssertAction_2=ruleAssertAction();

                    state._fsp--;


                    			current = this_AssertAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:206:3: this_WriteAction_3= ruleWriteAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getWriteActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WriteAction_3=ruleWriteAction();

                    state._fsp--;


                    			current = this_WriteAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:215:3: ( () ruleUncheckAllAction )
                    {
                    // InternalSeleniumScript.g:215:3: ( () ruleUncheckAllAction )
                    // InternalSeleniumScript.g:216:4: () ruleUncheckAllAction
                    {
                    // InternalSeleniumScript.g:216:4: ()
                    // InternalSeleniumScript.g:217:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActionAccess().getActionAction_4_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getActionAccess().getUncheckAllActionParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleUncheckAllAction();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumScript.g:232:3: this_SelectAction_6= ruleSelectAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSelectActionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectAction_6=ruleSelectAction();

                    state._fsp--;


                    			current = this_SelectAction_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleniumScript.g:241:3: this_VariableAction_7= ruleVariableAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getVariableActionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableAction_7=ruleVariableAction();

                    state._fsp--;


                    			current = this_VariableAction_7;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGotoAction"
    // InternalSeleniumScript.g:253:1: entryRuleGotoAction returns [EObject current=null] : iv_ruleGotoAction= ruleGotoAction EOF ;
    public final EObject entryRuleGotoAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGotoAction = null;


        try {
            // InternalSeleniumScript.g:253:51: (iv_ruleGotoAction= ruleGotoAction EOF )
            // InternalSeleniumScript.g:254:2: iv_ruleGotoAction= ruleGotoAction EOF
            {
             newCompositeNode(grammarAccess.getGotoActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGotoAction=ruleGotoAction();

            state._fsp--;

             current =iv_ruleGotoAction; 
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
    // $ANTLR end "entryRuleGotoAction"


    // $ANTLR start "ruleGotoAction"
    // InternalSeleniumScript.g:260:1: ruleGotoAction returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_url_1_0= RULE_URL ) ) ) ;
    public final EObject ruleGotoAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:266:2: ( (otherlv_0= 'goto' ( (lv_url_1_0= RULE_URL ) ) ) )
            // InternalSeleniumScript.g:267:2: (otherlv_0= 'goto' ( (lv_url_1_0= RULE_URL ) ) )
            {
            // InternalSeleniumScript.g:267:2: (otherlv_0= 'goto' ( (lv_url_1_0= RULE_URL ) ) )
            // InternalSeleniumScript.g:268:3: otherlv_0= 'goto' ( (lv_url_1_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGotoActionAccess().getGotoKeyword_0());
            		
            // InternalSeleniumScript.g:272:3: ( (lv_url_1_0= RULE_URL ) )
            // InternalSeleniumScript.g:273:4: (lv_url_1_0= RULE_URL )
            {
            // InternalSeleniumScript.g:273:4: (lv_url_1_0= RULE_URL )
            // InternalSeleniumScript.g:274:5: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGotoActionAccess().getUrlURLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGotoActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.xtext.example.SeleniumScript.URL");
            				

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
    // $ANTLR end "ruleGotoAction"


    // $ANTLR start "entryRuleClickAction"
    // InternalSeleniumScript.g:294:1: entryRuleClickAction returns [EObject current=null] : iv_ruleClickAction= ruleClickAction EOF ;
    public final EObject entryRuleClickAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickAction = null;


        try {
            // InternalSeleniumScript.g:294:52: (iv_ruleClickAction= ruleClickAction EOF )
            // InternalSeleniumScript.g:295:2: iv_ruleClickAction= ruleClickAction EOF
            {
             newCompositeNode(grammarAccess.getClickActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickAction=ruleClickAction();

            state._fsp--;

             current =iv_ruleClickAction; 
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
    // $ANTLR end "entryRuleClickAction"


    // $ANTLR start "ruleClickAction"
    // InternalSeleniumScript.g:301:1: ruleClickAction returns [EObject current=null] : (otherlv_0= 'click' ( (lv_selector_1_0= ruleSelectorWith ) ) ) ;
    public final EObject ruleClickAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:307:2: ( (otherlv_0= 'click' ( (lv_selector_1_0= ruleSelectorWith ) ) ) )
            // InternalSeleniumScript.g:308:2: (otherlv_0= 'click' ( (lv_selector_1_0= ruleSelectorWith ) ) )
            {
            // InternalSeleniumScript.g:308:2: (otherlv_0= 'click' ( (lv_selector_1_0= ruleSelectorWith ) ) )
            // InternalSeleniumScript.g:309:3: otherlv_0= 'click' ( (lv_selector_1_0= ruleSelectorWith ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClickActionAccess().getClickKeyword_0());
            		
            // InternalSeleniumScript.g:313:3: ( (lv_selector_1_0= ruleSelectorWith ) )
            // InternalSeleniumScript.g:314:4: (lv_selector_1_0= ruleSelectorWith )
            {
            // InternalSeleniumScript.g:314:4: (lv_selector_1_0= ruleSelectorWith )
            // InternalSeleniumScript.g:315:5: lv_selector_1_0= ruleSelectorWith
            {

            					newCompositeNode(grammarAccess.getClickActionAccess().getSelectorSelectorWithParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_1_0=ruleSelectorWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.xtext.example.SeleniumScript.SelectorWith");
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
    // $ANTLR end "ruleClickAction"


    // $ANTLR start "entryRuleAssertAction"
    // InternalSeleniumScript.g:336:1: entryRuleAssertAction returns [EObject current=null] : iv_ruleAssertAction= ruleAssertAction EOF ;
    public final EObject entryRuleAssertAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertAction = null;


        try {
            // InternalSeleniumScript.g:336:53: (iv_ruleAssertAction= ruleAssertAction EOF )
            // InternalSeleniumScript.g:337:2: iv_ruleAssertAction= ruleAssertAction EOF
            {
             newCompositeNode(grammarAccess.getAssertActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertAction=ruleAssertAction();

            state._fsp--;

             current =iv_ruleAssertAction; 
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
    // $ANTLR end "entryRuleAssertAction"


    // $ANTLR start "ruleAssertAction"
    // InternalSeleniumScript.g:343:1: ruleAssertAction returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_selector_1_0= ruleSelectorHas ) ) ) ;
    public final EObject ruleAssertAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:349:2: ( (otherlv_0= 'assert' ( (lv_selector_1_0= ruleSelectorHas ) ) ) )
            // InternalSeleniumScript.g:350:2: (otherlv_0= 'assert' ( (lv_selector_1_0= ruleSelectorHas ) ) )
            {
            // InternalSeleniumScript.g:350:2: (otherlv_0= 'assert' ( (lv_selector_1_0= ruleSelectorHas ) ) )
            // InternalSeleniumScript.g:351:3: otherlv_0= 'assert' ( (lv_selector_1_0= ruleSelectorHas ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertActionAccess().getAssertKeyword_0());
            		
            // InternalSeleniumScript.g:355:3: ( (lv_selector_1_0= ruleSelectorHas ) )
            // InternalSeleniumScript.g:356:4: (lv_selector_1_0= ruleSelectorHas )
            {
            // InternalSeleniumScript.g:356:4: (lv_selector_1_0= ruleSelectorHas )
            // InternalSeleniumScript.g:357:5: lv_selector_1_0= ruleSelectorHas
            {

            					newCompositeNode(grammarAccess.getAssertActionAccess().getSelectorSelectorHasParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_1_0=ruleSelectorHas();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_1_0,
            						"org.xtext.example.SeleniumScript.SelectorHas");
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
    // $ANTLR end "ruleAssertAction"


    // $ANTLR start "entryRuleWriteAction"
    // InternalSeleniumScript.g:378:1: entryRuleWriteAction returns [EObject current=null] : iv_ruleWriteAction= ruleWriteAction EOF ;
    public final EObject entryRuleWriteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteAction = null;


        try {
            // InternalSeleniumScript.g:378:52: (iv_ruleWriteAction= ruleWriteAction EOF )
            // InternalSeleniumScript.g:379:2: iv_ruleWriteAction= ruleWriteAction EOF
            {
             newCompositeNode(grammarAccess.getWriteActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWriteAction=ruleWriteAction();

            state._fsp--;

             current =iv_ruleWriteAction; 
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
    // $ANTLR end "entryRuleWriteAction"


    // $ANTLR start "ruleWriteAction"
    // InternalSeleniumScript.g:385:1: ruleWriteAction returns [EObject current=null] : (otherlv_0= 'write' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_selector_3_0= ruleSelectorWith ) ) ) ;
    public final EObject ruleWriteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_selector_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:391:2: ( (otherlv_0= 'write' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_selector_3_0= ruleSelectorWith ) ) ) )
            // InternalSeleniumScript.g:392:2: (otherlv_0= 'write' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_selector_3_0= ruleSelectorWith ) ) )
            {
            // InternalSeleniumScript.g:392:2: (otherlv_0= 'write' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_selector_3_0= ruleSelectorWith ) ) )
            // InternalSeleniumScript.g:393:3: otherlv_0= 'write' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'in' ( (lv_selector_3_0= ruleSelectorWith ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWriteActionAccess().getWriteKeyword_0());
            		
            // InternalSeleniumScript.g:397:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSeleniumScript.g:398:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSeleniumScript.g:398:4: (lv_value_1_0= RULE_STRING )
            // InternalSeleniumScript.g:399:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_1_0, grammarAccess.getWriteActionAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWriteActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWriteActionAccess().getInKeyword_2());
            		
            // InternalSeleniumScript.g:419:3: ( (lv_selector_3_0= ruleSelectorWith ) )
            // InternalSeleniumScript.g:420:4: (lv_selector_3_0= ruleSelectorWith )
            {
            // InternalSeleniumScript.g:420:4: (lv_selector_3_0= ruleSelectorWith )
            // InternalSeleniumScript.g:421:5: lv_selector_3_0= ruleSelectorWith
            {

            					newCompositeNode(grammarAccess.getWriteActionAccess().getSelectorSelectorWithParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_3_0=ruleSelectorWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWriteActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_3_0,
            						"org.xtext.example.SeleniumScript.SelectorWith");
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
    // $ANTLR end "ruleWriteAction"


    // $ANTLR start "entryRuleUncheckAllAction"
    // InternalSeleniumScript.g:442:1: entryRuleUncheckAllAction returns [String current=null] : iv_ruleUncheckAllAction= ruleUncheckAllAction EOF ;
    public final String entryRuleUncheckAllAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUncheckAllAction = null;


        try {
            // InternalSeleniumScript.g:442:56: (iv_ruleUncheckAllAction= ruleUncheckAllAction EOF )
            // InternalSeleniumScript.g:443:2: iv_ruleUncheckAllAction= ruleUncheckAllAction EOF
            {
             newCompositeNode(grammarAccess.getUncheckAllActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheckAllAction=ruleUncheckAllAction();

            state._fsp--;

             current =iv_ruleUncheckAllAction.getText(); 
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
    // $ANTLR end "entryRuleUncheckAllAction"


    // $ANTLR start "ruleUncheckAllAction"
    // InternalSeleniumScript.g:449:1: ruleUncheckAllAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'uncheck_all' ;
    public final AntlrDatatypeRuleToken ruleUncheckAllAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:455:2: (kw= 'uncheck_all' )
            // InternalSeleniumScript.g:456:2: kw= 'uncheck_all'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUncheckAllActionAccess().getUncheck_allKeyword());
            	

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
    // $ANTLR end "ruleUncheckAllAction"


    // $ANTLR start "entryRuleSelectAction"
    // InternalSeleniumScript.g:464:1: entryRuleSelectAction returns [EObject current=null] : iv_ruleSelectAction= ruleSelectAction EOF ;
    public final EObject entryRuleSelectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAction = null;


        try {
            // InternalSeleniumScript.g:464:53: (iv_ruleSelectAction= ruleSelectAction EOF )
            // InternalSeleniumScript.g:465:2: iv_ruleSelectAction= ruleSelectAction EOF
            {
             newCompositeNode(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectAction=ruleSelectAction();

            state._fsp--;

             current =iv_ruleSelectAction; 
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
    // $ANTLR end "entryRuleSelectAction"


    // $ANTLR start "ruleSelectAction"
    // InternalSeleniumScript.g:471:1: ruleSelectAction returns [EObject current=null] : (otherlv_0= 'select' ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )? otherlv_4= 'from' ( (lv_selector_5_0= ruleSelectorWith ) ) ) ;
    public final EObject ruleSelectAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_optionSelector_1_0 = null;

        EObject lv_and_3_0 = null;

        EObject lv_selector_5_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:477:2: ( (otherlv_0= 'select' ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )? otherlv_4= 'from' ( (lv_selector_5_0= ruleSelectorWith ) ) ) )
            // InternalSeleniumScript.g:478:2: (otherlv_0= 'select' ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )? otherlv_4= 'from' ( (lv_selector_5_0= ruleSelectorWith ) ) )
            {
            // InternalSeleniumScript.g:478:2: (otherlv_0= 'select' ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )? otherlv_4= 'from' ( (lv_selector_5_0= ruleSelectorWith ) ) )
            // InternalSeleniumScript.g:479:3: otherlv_0= 'select' ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )? otherlv_4= 'from' ( (lv_selector_5_0= ruleSelectorWith ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectActionAccess().getSelectKeyword_0());
            		
            // InternalSeleniumScript.g:483:3: ( ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumScript.g:484:4: ( (lv_optionSelector_1_0= ruleWithAttribute ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_and_3_0= ruleAnd ) )*
                    {
                    // InternalSeleniumScript.g:484:4: ( (lv_optionSelector_1_0= ruleWithAttribute ) )
                    // InternalSeleniumScript.g:485:5: (lv_optionSelector_1_0= ruleWithAttribute )
                    {
                    // InternalSeleniumScript.g:485:5: (lv_optionSelector_1_0= ruleWithAttribute )
                    // InternalSeleniumScript.g:486:6: lv_optionSelector_1_0= ruleWithAttribute
                    {

                    						newCompositeNode(grammarAccess.getSelectActionAccess().getOptionSelectorWithAttributeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_optionSelector_1_0=ruleWithAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectActionRule());
                    						}
                    						set(
                    							current,
                    							"optionSelector",
                    							lv_optionSelector_1_0 != null,
                    							"org.xtext.example.SeleniumScript.WithAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSeleniumScript.g:503:4: ( (lv_value_2_0= RULE_STRING ) )
                    // InternalSeleniumScript.g:504:5: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalSeleniumScript.g:504:5: (lv_value_2_0= RULE_STRING )
                    // InternalSeleniumScript.g:505:6: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getSelectActionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSeleniumScript.g:521:4: ( (lv_and_3_0= ruleAnd ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:522:5: (lv_and_3_0= ruleAnd )
                    	    {
                    	    // InternalSeleniumScript.g:522:5: (lv_and_3_0= ruleAnd )
                    	    // InternalSeleniumScript.g:523:6: lv_and_3_0= ruleAnd
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectActionAccess().getAndAndParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_and_3_0=ruleAnd();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelectActionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"and",
                    	    							lv_and_3_0,
                    	    							"org.xtext.example.SeleniumScript.And");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectActionAccess().getFromKeyword_2());
            		
            // InternalSeleniumScript.g:545:3: ( (lv_selector_5_0= ruleSelectorWith ) )
            // InternalSeleniumScript.g:546:4: (lv_selector_5_0= ruleSelectorWith )
            {
            // InternalSeleniumScript.g:546:4: (lv_selector_5_0= ruleSelectorWith )
            // InternalSeleniumScript.g:547:5: lv_selector_5_0= ruleSelectorWith
            {

            					newCompositeNode(grammarAccess.getSelectActionAccess().getSelectorSelectorWithParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_5_0=ruleSelectorWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectActionRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_5_0,
            						"org.xtext.example.SeleniumScript.SelectorWith");
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
    // $ANTLR end "ruleSelectAction"


    // $ANTLR start "entryRuleSelectorWith"
    // InternalSeleniumScript.g:568:1: entryRuleSelectorWith returns [EObject current=null] : iv_ruleSelectorWith= ruleSelectorWith EOF ;
    public final EObject entryRuleSelectorWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorWith = null;


        try {
            // InternalSeleniumScript.g:568:53: (iv_ruleSelectorWith= ruleSelectorWith EOF )
            // InternalSeleniumScript.g:569:2: iv_ruleSelectorWith= ruleSelectorWith EOF
            {
             newCompositeNode(grammarAccess.getSelectorWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorWith=ruleSelectorWith();

            state._fsp--;

             current =iv_ruleSelectorWith; 
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
    // $ANTLR end "entryRuleSelectorWith"


    // $ANTLR start "ruleSelectorWith"
    // InternalSeleniumScript.g:575:1: ruleSelectorWith returns [EObject current=null] : ( ( (lv_base_selector_0_0= RULE_STRING ) ) ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )? ) ;
    public final EObject ruleSelectorWith() throws RecognitionException {
        EObject current = null;

        Token lv_base_selector_0_0=null;
        EObject lv_w_1_0 = null;

        EObject lv_and_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:581:2: ( ( ( (lv_base_selector_0_0= RULE_STRING ) ) ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )? ) )
            // InternalSeleniumScript.g:582:2: ( ( (lv_base_selector_0_0= RULE_STRING ) ) ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )? )
            {
            // InternalSeleniumScript.g:582:2: ( ( (lv_base_selector_0_0= RULE_STRING ) ) ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )? )
            // InternalSeleniumScript.g:583:3: ( (lv_base_selector_0_0= RULE_STRING ) ) ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )?
            {
            // InternalSeleniumScript.g:583:3: ( (lv_base_selector_0_0= RULE_STRING ) )
            // InternalSeleniumScript.g:584:4: (lv_base_selector_0_0= RULE_STRING )
            {
            // InternalSeleniumScript.g:584:4: (lv_base_selector_0_0= RULE_STRING )
            // InternalSeleniumScript.g:585:5: lv_base_selector_0_0= RULE_STRING
            {
            lv_base_selector_0_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_base_selector_0_0, grammarAccess.getSelectorWithAccess().getBase_selectorSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorWithRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base_selector",
            						lv_base_selector_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSeleniumScript.g:601:3: ( ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumScript.g:602:4: ( (lv_w_1_0= ruleWith ) ) ( (lv_and_2_0= ruleAnd ) )*
                    {
                    // InternalSeleniumScript.g:602:4: ( (lv_w_1_0= ruleWith ) )
                    // InternalSeleniumScript.g:603:5: (lv_w_1_0= ruleWith )
                    {
                    // InternalSeleniumScript.g:603:5: (lv_w_1_0= ruleWith )
                    // InternalSeleniumScript.g:604:6: lv_w_1_0= ruleWith
                    {

                    						newCompositeNode(grammarAccess.getSelectorWithAccess().getWWithParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_w_1_0=ruleWith();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorWithRule());
                    						}
                    						set(
                    							current,
                    							"w",
                    							lv_w_1_0,
                    							"org.xtext.example.SeleniumScript.With");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSeleniumScript.g:621:4: ( (lv_and_2_0= ruleAnd ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:622:5: (lv_and_2_0= ruleAnd )
                    	    {
                    	    // InternalSeleniumScript.g:622:5: (lv_and_2_0= ruleAnd )
                    	    // InternalSeleniumScript.g:623:6: lv_and_2_0= ruleAnd
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectorWithAccess().getAndAndParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_and_2_0=ruleAnd();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelectorWithRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"and",
                    	    							lv_and_2_0,
                    	    							"org.xtext.example.SeleniumScript.And");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // $ANTLR end "ruleSelectorWith"


    // $ANTLR start "entryRuleWith"
    // InternalSeleniumScript.g:645:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalSeleniumScript.g:645:45: (iv_ruleWith= ruleWith EOF )
            // InternalSeleniumScript.g:646:2: iv_ruleWith= ruleWith EOF
            {
             newCompositeNode(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWith=ruleWith();

            state._fsp--;

             current =iv_ruleWith; 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalSeleniumScript.g:652:1: ruleWith returns [EObject current=null] : ( ( (lv_withAttribute_0_0= ruleWithAttribute ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleWith() throws RecognitionException {
        EObject current = null;

        EObject lv_withAttribute_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:658:2: ( ( ( (lv_withAttribute_0_0= ruleWithAttribute ) ) ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalSeleniumScript.g:659:2: ( ( (lv_withAttribute_0_0= ruleWithAttribute ) ) ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalSeleniumScript.g:659:2: ( ( (lv_withAttribute_0_0= ruleWithAttribute ) ) ( (lv_value_1_0= ruleValue ) ) )
            // InternalSeleniumScript.g:660:3: ( (lv_withAttribute_0_0= ruleWithAttribute ) ) ( (lv_value_1_0= ruleValue ) )
            {
            // InternalSeleniumScript.g:660:3: ( (lv_withAttribute_0_0= ruleWithAttribute ) )
            // InternalSeleniumScript.g:661:4: (lv_withAttribute_0_0= ruleWithAttribute )
            {
            // InternalSeleniumScript.g:661:4: (lv_withAttribute_0_0= ruleWithAttribute )
            // InternalSeleniumScript.g:662:5: lv_withAttribute_0_0= ruleWithAttribute
            {

            					newCompositeNode(grammarAccess.getWithAccess().getWithAttributeWithAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_withAttribute_0_0=ruleWithAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithRule());
            					}
            					set(
            						current,
            						"withAttribute",
            						lv_withAttribute_0_0,
            						"org.xtext.example.SeleniumScript.WithAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumScript.g:679:3: ( (lv_value_1_0= ruleValue ) )
            // InternalSeleniumScript.g:680:4: (lv_value_1_0= ruleValue )
            {
            // InternalSeleniumScript.g:680:4: (lv_value_1_0= ruleValue )
            // InternalSeleniumScript.g:681:5: lv_value_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getWithAccess().getValueValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWithRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.SeleniumScript.Value");
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
    // $ANTLR end "ruleWith"


    // $ANTLR start "entryRuleWithAttribute"
    // InternalSeleniumScript.g:702:1: entryRuleWithAttribute returns [EObject current=null] : iv_ruleWithAttribute= ruleWithAttribute EOF ;
    public final EObject entryRuleWithAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithAttribute = null;


        try {
            // InternalSeleniumScript.g:702:54: (iv_ruleWithAttribute= ruleWithAttribute EOF )
            // InternalSeleniumScript.g:703:2: iv_ruleWithAttribute= ruleWithAttribute EOF
            {
             newCompositeNode(grammarAccess.getWithAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWithAttribute=ruleWithAttribute();

            state._fsp--;

             current =iv_ruleWithAttribute; 
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
    // $ANTLR end "entryRuleWithAttribute"


    // $ANTLR start "ruleWithAttribute"
    // InternalSeleniumScript.g:709:1: ruleWithAttribute returns [EObject current=null] : (otherlv_0= 'with' ( (lv_attribute_1_0= RULE_ID ) ) ) ;
    public final EObject ruleWithAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:715:2: ( (otherlv_0= 'with' ( (lv_attribute_1_0= RULE_ID ) ) ) )
            // InternalSeleniumScript.g:716:2: (otherlv_0= 'with' ( (lv_attribute_1_0= RULE_ID ) ) )
            {
            // InternalSeleniumScript.g:716:2: (otherlv_0= 'with' ( (lv_attribute_1_0= RULE_ID ) ) )
            // InternalSeleniumScript.g:717:3: otherlv_0= 'with' ( (lv_attribute_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWithAttributeAccess().getWithKeyword_0());
            		
            // InternalSeleniumScript.g:721:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalSeleniumScript.g:722:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalSeleniumScript.g:722:4: (lv_attribute_1_0= RULE_ID )
            // InternalSeleniumScript.g:723:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_attribute_1_0, grammarAccess.getWithAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWithAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleWithAttribute"


    // $ANTLR start "entryRuleAnd"
    // InternalSeleniumScript.g:743:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSeleniumScript.g:743:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSeleniumScript.g:744:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSeleniumScript.g:750:1: ruleAnd returns [EObject current=null] : ( ( (lv_andAttribute_0_0= ruleAndAttribute ) ) ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject lv_andAttribute_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:756:2: ( ( ( (lv_andAttribute_0_0= ruleAndAttribute ) ) ( (lv_value_1_0= ruleValue ) ) ) )
            // InternalSeleniumScript.g:757:2: ( ( (lv_andAttribute_0_0= ruleAndAttribute ) ) ( (lv_value_1_0= ruleValue ) ) )
            {
            // InternalSeleniumScript.g:757:2: ( ( (lv_andAttribute_0_0= ruleAndAttribute ) ) ( (lv_value_1_0= ruleValue ) ) )
            // InternalSeleniumScript.g:758:3: ( (lv_andAttribute_0_0= ruleAndAttribute ) ) ( (lv_value_1_0= ruleValue ) )
            {
            // InternalSeleniumScript.g:758:3: ( (lv_andAttribute_0_0= ruleAndAttribute ) )
            // InternalSeleniumScript.g:759:4: (lv_andAttribute_0_0= ruleAndAttribute )
            {
            // InternalSeleniumScript.g:759:4: (lv_andAttribute_0_0= ruleAndAttribute )
            // InternalSeleniumScript.g:760:5: lv_andAttribute_0_0= ruleAndAttribute
            {

            					newCompositeNode(grammarAccess.getAndAccess().getAndAttributeAndAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_andAttribute_0_0=ruleAndAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"andAttribute",
            						lv_andAttribute_0_0,
            						"org.xtext.example.SeleniumScript.AndAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSeleniumScript.g:777:3: ( (lv_value_1_0= ruleValue ) )
            // InternalSeleniumScript.g:778:4: (lv_value_1_0= ruleValue )
            {
            // InternalSeleniumScript.g:778:4: (lv_value_1_0= ruleValue )
            // InternalSeleniumScript.g:779:5: lv_value_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAndAccess().getValueValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.SeleniumScript.Value");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAndAttribute"
    // InternalSeleniumScript.g:800:1: entryRuleAndAttribute returns [EObject current=null] : iv_ruleAndAttribute= ruleAndAttribute EOF ;
    public final EObject entryRuleAndAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttribute = null;


        try {
            // InternalSeleniumScript.g:800:53: (iv_ruleAndAttribute= ruleAndAttribute EOF )
            // InternalSeleniumScript.g:801:2: iv_ruleAndAttribute= ruleAndAttribute EOF
            {
             newCompositeNode(grammarAccess.getAndAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndAttribute=ruleAndAttribute();

            state._fsp--;

             current =iv_ruleAndAttribute; 
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
    // $ANTLR end "entryRuleAndAttribute"


    // $ANTLR start "ruleAndAttribute"
    // InternalSeleniumScript.g:807:1: ruleAndAttribute returns [EObject current=null] : (otherlv_0= 'and' ( (lv_attribute_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAndAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:813:2: ( (otherlv_0= 'and' ( (lv_attribute_1_0= RULE_ID ) ) ) )
            // InternalSeleniumScript.g:814:2: (otherlv_0= 'and' ( (lv_attribute_1_0= RULE_ID ) ) )
            {
            // InternalSeleniumScript.g:814:2: (otherlv_0= 'and' ( (lv_attribute_1_0= RULE_ID ) ) )
            // InternalSeleniumScript.g:815:3: otherlv_0= 'and' ( (lv_attribute_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAttributeAccess().getAndKeyword_0());
            		
            // InternalSeleniumScript.g:819:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalSeleniumScript.g:820:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalSeleniumScript.g:820:4: (lv_attribute_1_0= RULE_ID )
            // InternalSeleniumScript.g:821:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_attribute_1_0, grammarAccess.getAndAttributeAccess().getAttributeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAndAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAndAttribute"


    // $ANTLR start "entryRuleSelectorHas"
    // InternalSeleniumScript.g:841:1: entryRuleSelectorHas returns [EObject current=null] : iv_ruleSelectorHas= ruleSelectorHas EOF ;
    public final EObject entryRuleSelectorHas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorHas = null;


        try {
            // InternalSeleniumScript.g:841:52: (iv_ruleSelectorHas= ruleSelectorHas EOF )
            // InternalSeleniumScript.g:842:2: iv_ruleSelectorHas= ruleSelectorHas EOF
            {
             newCompositeNode(grammarAccess.getSelectorHasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectorHas=ruleSelectorHas();

            state._fsp--;

             current =iv_ruleSelectorHas; 
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
    // $ANTLR end "entryRuleSelectorHas"


    // $ANTLR start "ruleSelectorHas"
    // InternalSeleniumScript.g:848:1: ruleSelectorHas returns [EObject current=null] : ( ( (lv_base_selector_0_0= RULE_STRING ) ) otherlv_1= 'has' ( (lv_attribute_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleSelectorHas() throws RecognitionException {
        EObject current = null;

        Token lv_base_selector_0_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:854:2: ( ( ( (lv_base_selector_0_0= RULE_STRING ) ) otherlv_1= 'has' ( (lv_attribute_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalSeleniumScript.g:855:2: ( ( (lv_base_selector_0_0= RULE_STRING ) ) otherlv_1= 'has' ( (lv_attribute_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalSeleniumScript.g:855:2: ( ( (lv_base_selector_0_0= RULE_STRING ) ) otherlv_1= 'has' ( (lv_attribute_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleValue ) ) )
            // InternalSeleniumScript.g:856:3: ( (lv_base_selector_0_0= RULE_STRING ) ) otherlv_1= 'has' ( (lv_attribute_2_0= RULE_ID ) ) ( (lv_value_3_0= ruleValue ) )
            {
            // InternalSeleniumScript.g:856:3: ( (lv_base_selector_0_0= RULE_STRING ) )
            // InternalSeleniumScript.g:857:4: (lv_base_selector_0_0= RULE_STRING )
            {
            // InternalSeleniumScript.g:857:4: (lv_base_selector_0_0= RULE_STRING )
            // InternalSeleniumScript.g:858:5: lv_base_selector_0_0= RULE_STRING
            {
            lv_base_selector_0_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_base_selector_0_0, grammarAccess.getSelectorHasAccess().getBase_selectorSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorHasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"base_selector",
            						lv_base_selector_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorHasAccess().getHasKeyword_1());
            		
            // InternalSeleniumScript.g:878:3: ( (lv_attribute_2_0= RULE_ID ) )
            // InternalSeleniumScript.g:879:4: (lv_attribute_2_0= RULE_ID )
            {
            // InternalSeleniumScript.g:879:4: (lv_attribute_2_0= RULE_ID )
            // InternalSeleniumScript.g:880:5: lv_attribute_2_0= RULE_ID
            {
            lv_attribute_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_attribute_2_0, grammarAccess.getSelectorHasAccess().getAttributeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectorHasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSeleniumScript.g:896:3: ( (lv_value_3_0= ruleValue ) )
            // InternalSeleniumScript.g:897:4: (lv_value_3_0= ruleValue )
            {
            // InternalSeleniumScript.g:897:4: (lv_value_3_0= ruleValue )
            // InternalSeleniumScript.g:898:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getSelectorHasAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorHasRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.SeleniumScript.Value");
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
    // $ANTLR end "ruleSelectorHas"


    // $ANTLR start "entryRuleVariableAction"
    // InternalSeleniumScript.g:919:1: entryRuleVariableAction returns [EObject current=null] : iv_ruleVariableAction= ruleVariableAction EOF ;
    public final EObject entryRuleVariableAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAction = null;


        try {
            // InternalSeleniumScript.g:919:55: (iv_ruleVariableAction= ruleVariableAction EOF )
            // InternalSeleniumScript.g:920:2: iv_ruleVariableAction= ruleVariableAction EOF
            {
             newCompositeNode(grammarAccess.getVariableActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAction=ruleVariableAction();

            state._fsp--;

             current =iv_ruleVariableAction; 
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
    // $ANTLR end "entryRuleVariableAction"


    // $ANTLR start "ruleVariableAction"
    // InternalSeleniumScript.g:926:1: ruleVariableAction returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) ( (lv_assignation_2_0= ruleVariableAssignation ) ) ) ;
    public final EObject ruleVariableAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_assignation_2_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:932:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) ( (lv_assignation_2_0= ruleVariableAssignation ) ) ) )
            // InternalSeleniumScript.g:933:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) ( (lv_assignation_2_0= ruleVariableAssignation ) ) )
            {
            // InternalSeleniumScript.g:933:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) ( (lv_assignation_2_0= ruleVariableAssignation ) ) )
            // InternalSeleniumScript.g:934:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) ( (lv_assignation_2_0= ruleVariableAssignation ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableActionAccess().getLetKeyword_0());
            		
            // InternalSeleniumScript.g:938:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSeleniumScript.g:939:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSeleniumScript.g:939:4: (lv_name_1_0= RULE_ID )
            // InternalSeleniumScript.g:940:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSeleniumScript.g:956:3: ( (lv_assignation_2_0= ruleVariableAssignation ) )
            // InternalSeleniumScript.g:957:4: (lv_assignation_2_0= ruleVariableAssignation )
            {
            // InternalSeleniumScript.g:957:4: (lv_assignation_2_0= ruleVariableAssignation )
            // InternalSeleniumScript.g:958:5: lv_assignation_2_0= ruleVariableAssignation
            {

            					newCompositeNode(grammarAccess.getVariableActionAccess().getAssignationVariableAssignationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_assignation_2_0=ruleVariableAssignation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableActionRule());
            					}
            					set(
            						current,
            						"assignation",
            						lv_assignation_2_0,
            						"org.xtext.example.SeleniumScript.VariableAssignation");
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
    // $ANTLR end "ruleVariableAction"


    // $ANTLR start "entryRuleVariableAssignation"
    // InternalSeleniumScript.g:979:1: entryRuleVariableAssignation returns [EObject current=null] : iv_ruleVariableAssignation= ruleVariableAssignation EOF ;
    public final EObject entryRuleVariableAssignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignation = null;


        try {
            // InternalSeleniumScript.g:979:60: (iv_ruleVariableAssignation= ruleVariableAssignation EOF )
            // InternalSeleniumScript.g:980:2: iv_ruleVariableAssignation= ruleVariableAssignation EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignation=ruleVariableAssignation();

            state._fsp--;

             current =iv_ruleVariableAssignation; 
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
    // $ANTLR end "entryRuleVariableAssignation"


    // $ANTLR start "ruleVariableAssignation"
    // InternalSeleniumScript.g:986:1: ruleVariableAssignation returns [EObject current=null] : (otherlv_0= 'as' ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_selector_3_0= ruleSelectorWith ) ) ) ;
    public final EObject ruleVariableAssignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attribute_1_0=null;
        Token otherlv_2=null;
        EObject lv_selector_3_0 = null;



        	enterRule();

        try {
            // InternalSeleniumScript.g:992:2: ( (otherlv_0= 'as' ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_selector_3_0= ruleSelectorWith ) ) ) )
            // InternalSeleniumScript.g:993:2: (otherlv_0= 'as' ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_selector_3_0= ruleSelectorWith ) ) )
            {
            // InternalSeleniumScript.g:993:2: (otherlv_0= 'as' ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_selector_3_0= ruleSelectorWith ) ) )
            // InternalSeleniumScript.g:994:3: otherlv_0= 'as' ( (lv_attribute_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_selector_3_0= ruleSelectorWith ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAssignationAccess().getAsKeyword_0());
            		
            // InternalSeleniumScript.g:998:3: ( (lv_attribute_1_0= RULE_ID ) )
            // InternalSeleniumScript.g:999:4: (lv_attribute_1_0= RULE_ID )
            {
            // InternalSeleniumScript.g:999:4: (lv_attribute_1_0= RULE_ID )
            // InternalSeleniumScript.g:1000:5: lv_attribute_1_0= RULE_ID
            {
            lv_attribute_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_attribute_1_0, grammarAccess.getVariableAssignationAccess().getAttributeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableAssignationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAssignationAccess().getFromKeyword_2());
            		
            // InternalSeleniumScript.g:1020:3: ( (lv_selector_3_0= ruleSelectorWith ) )
            // InternalSeleniumScript.g:1021:4: (lv_selector_3_0= ruleSelectorWith )
            {
            // InternalSeleniumScript.g:1021:4: (lv_selector_3_0= ruleSelectorWith )
            // InternalSeleniumScript.g:1022:5: lv_selector_3_0= ruleSelectorWith
            {

            					newCompositeNode(grammarAccess.getVariableAssignationAccess().getSelectorSelectorWithParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_selector_3_0=ruleSelectorWith();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableAssignationRule());
            					}
            					set(
            						current,
            						"selector",
            						lv_selector_3_0,
            						"org.xtext.example.SeleniumScript.SelectorWith");
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
    // $ANTLR end "ruleVariableAssignation"


    // $ANTLR start "entryRuleValue"
    // InternalSeleniumScript.g:1043:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalSeleniumScript.g:1043:46: (iv_ruleValue= ruleValue EOF )
            // InternalSeleniumScript.g:1044:2: iv_ruleValue= ruleValue EOF
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
    // InternalSeleniumScript.g:1050:1: ruleValue returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalSeleniumScript.g:1056:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING ) )
            // InternalSeleniumScript.g:1057:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            {
            // InternalSeleniumScript.g:1057:2: ( ( (otherlv_0= RULE_ID ) ) | this_STRING_1= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumScript.g:1058:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalSeleniumScript.g:1058:3: ( (otherlv_0= RULE_ID ) )
                    // InternalSeleniumScript.g:1059:4: (otherlv_0= RULE_ID )
                    {
                    // InternalSeleniumScript.g:1059:4: (otherlv_0= RULE_ID )
                    // InternalSeleniumScript.g:1060:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getValueAccess().getValueVariableActionCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:1072:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000021BC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000021BC002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});

}
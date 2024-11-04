package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.SeleniumScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'uncheck_all'", "'test'", "':'", "'goto'", "'click'", "'assert'", "'write'", "'in'", "'select'", "'from'", "'with'", "'and'", "'has'", "'let'", "'as'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int RULE_URL=6;
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

    	public void setGrammarAccess(SeleniumScriptGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSeleniumScript.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:54:1: ( ruleModel EOF )
            // InternalSeleniumScript.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSeleniumScript.g:62:1: ruleModel : ( ( rule__Model__TestsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:66:2: ( ( ( rule__Model__TestsAssignment )* ) )
            // InternalSeleniumScript.g:67:2: ( ( rule__Model__TestsAssignment )* )
            {
            // InternalSeleniumScript.g:67:2: ( ( rule__Model__TestsAssignment )* )
            // InternalSeleniumScript.g:68:3: ( rule__Model__TestsAssignment )*
            {
             before(grammarAccess.getModelAccess().getTestsAssignment()); 
            // InternalSeleniumScript.g:69:3: ( rule__Model__TestsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumScript.g:69:4: rule__Model__TestsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TestsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTestsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTest"
    // InternalSeleniumScript.g:78:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:79:1: ( ruleTest EOF )
            // InternalSeleniumScript.g:80:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalSeleniumScript.g:87:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:91:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalSeleniumScript.g:92:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalSeleniumScript.g:92:2: ( ( rule__Test__Group__0 ) )
            // InternalSeleniumScript.g:93:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalSeleniumScript.g:94:3: ( rule__Test__Group__0 )
            // InternalSeleniumScript.g:94:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleAction"
    // InternalSeleniumScript.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:104:1: ( ruleAction EOF )
            // InternalSeleniumScript.g:105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSeleniumScript.g:112:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:116:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalSeleniumScript.g:117:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalSeleniumScript.g:117:2: ( ( rule__Action__Alternatives ) )
            // InternalSeleniumScript.g:118:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalSeleniumScript.g:119:3: ( rule__Action__Alternatives )
            // InternalSeleniumScript.g:119:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGotoAction"
    // InternalSeleniumScript.g:128:1: entryRuleGotoAction : ruleGotoAction EOF ;
    public final void entryRuleGotoAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:129:1: ( ruleGotoAction EOF )
            // InternalSeleniumScript.g:130:1: ruleGotoAction EOF
            {
             before(grammarAccess.getGotoActionRule()); 
            pushFollow(FOLLOW_1);
            ruleGotoAction();

            state._fsp--;

             after(grammarAccess.getGotoActionRule()); 
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
    // $ANTLR end "entryRuleGotoAction"


    // $ANTLR start "ruleGotoAction"
    // InternalSeleniumScript.g:137:1: ruleGotoAction : ( ( rule__GotoAction__Group__0 ) ) ;
    public final void ruleGotoAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:141:2: ( ( ( rule__GotoAction__Group__0 ) ) )
            // InternalSeleniumScript.g:142:2: ( ( rule__GotoAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:142:2: ( ( rule__GotoAction__Group__0 ) )
            // InternalSeleniumScript.g:143:3: ( rule__GotoAction__Group__0 )
            {
             before(grammarAccess.getGotoActionAccess().getGroup()); 
            // InternalSeleniumScript.g:144:3: ( rule__GotoAction__Group__0 )
            // InternalSeleniumScript.g:144:4: rule__GotoAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GotoAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGotoActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGotoAction"


    // $ANTLR start "entryRuleClickAction"
    // InternalSeleniumScript.g:153:1: entryRuleClickAction : ruleClickAction EOF ;
    public final void entryRuleClickAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:154:1: ( ruleClickAction EOF )
            // InternalSeleniumScript.g:155:1: ruleClickAction EOF
            {
             before(grammarAccess.getClickActionRule()); 
            pushFollow(FOLLOW_1);
            ruleClickAction();

            state._fsp--;

             after(grammarAccess.getClickActionRule()); 
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
    // $ANTLR end "entryRuleClickAction"


    // $ANTLR start "ruleClickAction"
    // InternalSeleniumScript.g:162:1: ruleClickAction : ( ( rule__ClickAction__Group__0 ) ) ;
    public final void ruleClickAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:166:2: ( ( ( rule__ClickAction__Group__0 ) ) )
            // InternalSeleniumScript.g:167:2: ( ( rule__ClickAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:167:2: ( ( rule__ClickAction__Group__0 ) )
            // InternalSeleniumScript.g:168:3: ( rule__ClickAction__Group__0 )
            {
             before(grammarAccess.getClickActionAccess().getGroup()); 
            // InternalSeleniumScript.g:169:3: ( rule__ClickAction__Group__0 )
            // InternalSeleniumScript.g:169:4: rule__ClickAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClickAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickAction"


    // $ANTLR start "entryRuleAssertAction"
    // InternalSeleniumScript.g:178:1: entryRuleAssertAction : ruleAssertAction EOF ;
    public final void entryRuleAssertAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:179:1: ( ruleAssertAction EOF )
            // InternalSeleniumScript.g:180:1: ruleAssertAction EOF
            {
             before(grammarAccess.getAssertActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertAction();

            state._fsp--;

             after(grammarAccess.getAssertActionRule()); 
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
    // $ANTLR end "entryRuleAssertAction"


    // $ANTLR start "ruleAssertAction"
    // InternalSeleniumScript.g:187:1: ruleAssertAction : ( ( rule__AssertAction__Group__0 ) ) ;
    public final void ruleAssertAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:191:2: ( ( ( rule__AssertAction__Group__0 ) ) )
            // InternalSeleniumScript.g:192:2: ( ( rule__AssertAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:192:2: ( ( rule__AssertAction__Group__0 ) )
            // InternalSeleniumScript.g:193:3: ( rule__AssertAction__Group__0 )
            {
             before(grammarAccess.getAssertActionAccess().getGroup()); 
            // InternalSeleniumScript.g:194:3: ( rule__AssertAction__Group__0 )
            // InternalSeleniumScript.g:194:4: rule__AssertAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertAction"


    // $ANTLR start "entryRuleWriteAction"
    // InternalSeleniumScript.g:203:1: entryRuleWriteAction : ruleWriteAction EOF ;
    public final void entryRuleWriteAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:204:1: ( ruleWriteAction EOF )
            // InternalSeleniumScript.g:205:1: ruleWriteAction EOF
            {
             before(grammarAccess.getWriteActionRule()); 
            pushFollow(FOLLOW_1);
            ruleWriteAction();

            state._fsp--;

             after(grammarAccess.getWriteActionRule()); 
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
    // $ANTLR end "entryRuleWriteAction"


    // $ANTLR start "ruleWriteAction"
    // InternalSeleniumScript.g:212:1: ruleWriteAction : ( ( rule__WriteAction__Group__0 ) ) ;
    public final void ruleWriteAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:216:2: ( ( ( rule__WriteAction__Group__0 ) ) )
            // InternalSeleniumScript.g:217:2: ( ( rule__WriteAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:217:2: ( ( rule__WriteAction__Group__0 ) )
            // InternalSeleniumScript.g:218:3: ( rule__WriteAction__Group__0 )
            {
             before(grammarAccess.getWriteActionAccess().getGroup()); 
            // InternalSeleniumScript.g:219:3: ( rule__WriteAction__Group__0 )
            // InternalSeleniumScript.g:219:4: rule__WriteAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WriteAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWriteAction"


    // $ANTLR start "entryRuleUncheckAllAction"
    // InternalSeleniumScript.g:228:1: entryRuleUncheckAllAction : ruleUncheckAllAction EOF ;
    public final void entryRuleUncheckAllAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:229:1: ( ruleUncheckAllAction EOF )
            // InternalSeleniumScript.g:230:1: ruleUncheckAllAction EOF
            {
             before(grammarAccess.getUncheckAllActionRule()); 
            pushFollow(FOLLOW_1);
            ruleUncheckAllAction();

            state._fsp--;

             after(grammarAccess.getUncheckAllActionRule()); 
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
    // $ANTLR end "entryRuleUncheckAllAction"


    // $ANTLR start "ruleUncheckAllAction"
    // InternalSeleniumScript.g:237:1: ruleUncheckAllAction : ( 'uncheck_all' ) ;
    public final void ruleUncheckAllAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:241:2: ( ( 'uncheck_all' ) )
            // InternalSeleniumScript.g:242:2: ( 'uncheck_all' )
            {
            // InternalSeleniumScript.g:242:2: ( 'uncheck_all' )
            // InternalSeleniumScript.g:243:3: 'uncheck_all'
            {
             before(grammarAccess.getUncheckAllActionAccess().getUncheck_allKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUncheckAllActionAccess().getUncheck_allKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUncheckAllAction"


    // $ANTLR start "entryRuleSelectAction"
    // InternalSeleniumScript.g:253:1: entryRuleSelectAction : ruleSelectAction EOF ;
    public final void entryRuleSelectAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:254:1: ( ruleSelectAction EOF )
            // InternalSeleniumScript.g:255:1: ruleSelectAction EOF
            {
             before(grammarAccess.getSelectActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectAction();

            state._fsp--;

             after(grammarAccess.getSelectActionRule()); 
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
    // $ANTLR end "entryRuleSelectAction"


    // $ANTLR start "ruleSelectAction"
    // InternalSeleniumScript.g:262:1: ruleSelectAction : ( ( rule__SelectAction__Group__0 ) ) ;
    public final void ruleSelectAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:266:2: ( ( ( rule__SelectAction__Group__0 ) ) )
            // InternalSeleniumScript.g:267:2: ( ( rule__SelectAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:267:2: ( ( rule__SelectAction__Group__0 ) )
            // InternalSeleniumScript.g:268:3: ( rule__SelectAction__Group__0 )
            {
             before(grammarAccess.getSelectActionAccess().getGroup()); 
            // InternalSeleniumScript.g:269:3: ( rule__SelectAction__Group__0 )
            // InternalSeleniumScript.g:269:4: rule__SelectAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectAction"


    // $ANTLR start "entryRuleSelectorWith"
    // InternalSeleniumScript.g:278:1: entryRuleSelectorWith : ruleSelectorWith EOF ;
    public final void entryRuleSelectorWith() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:279:1: ( ruleSelectorWith EOF )
            // InternalSeleniumScript.g:280:1: ruleSelectorWith EOF
            {
             before(grammarAccess.getSelectorWithRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorWith();

            state._fsp--;

             after(grammarAccess.getSelectorWithRule()); 
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
    // $ANTLR end "entryRuleSelectorWith"


    // $ANTLR start "ruleSelectorWith"
    // InternalSeleniumScript.g:287:1: ruleSelectorWith : ( ( rule__SelectorWith__Group__0 ) ) ;
    public final void ruleSelectorWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:291:2: ( ( ( rule__SelectorWith__Group__0 ) ) )
            // InternalSeleniumScript.g:292:2: ( ( rule__SelectorWith__Group__0 ) )
            {
            // InternalSeleniumScript.g:292:2: ( ( rule__SelectorWith__Group__0 ) )
            // InternalSeleniumScript.g:293:3: ( rule__SelectorWith__Group__0 )
            {
             before(grammarAccess.getSelectorWithAccess().getGroup()); 
            // InternalSeleniumScript.g:294:3: ( rule__SelectorWith__Group__0 )
            // InternalSeleniumScript.g:294:4: rule__SelectorWith__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorWith__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorWithAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorWith"


    // $ANTLR start "entryRuleWith"
    // InternalSeleniumScript.g:303:1: entryRuleWith : ruleWith EOF ;
    public final void entryRuleWith() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:304:1: ( ruleWith EOF )
            // InternalSeleniumScript.g:305:1: ruleWith EOF
            {
             before(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            ruleWith();

            state._fsp--;

             after(grammarAccess.getWithRule()); 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalSeleniumScript.g:312:1: ruleWith : ( ( rule__With__Group__0 ) ) ;
    public final void ruleWith() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:316:2: ( ( ( rule__With__Group__0 ) ) )
            // InternalSeleniumScript.g:317:2: ( ( rule__With__Group__0 ) )
            {
            // InternalSeleniumScript.g:317:2: ( ( rule__With__Group__0 ) )
            // InternalSeleniumScript.g:318:3: ( rule__With__Group__0 )
            {
             before(grammarAccess.getWithAccess().getGroup()); 
            // InternalSeleniumScript.g:319:3: ( rule__With__Group__0 )
            // InternalSeleniumScript.g:319:4: rule__With__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__With__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWith"


    // $ANTLR start "entryRuleWithAttribute"
    // InternalSeleniumScript.g:328:1: entryRuleWithAttribute : ruleWithAttribute EOF ;
    public final void entryRuleWithAttribute() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:329:1: ( ruleWithAttribute EOF )
            // InternalSeleniumScript.g:330:1: ruleWithAttribute EOF
            {
             before(grammarAccess.getWithAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleWithAttribute();

            state._fsp--;

             after(grammarAccess.getWithAttributeRule()); 
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
    // $ANTLR end "entryRuleWithAttribute"


    // $ANTLR start "ruleWithAttribute"
    // InternalSeleniumScript.g:337:1: ruleWithAttribute : ( ( rule__WithAttribute__Group__0 ) ) ;
    public final void ruleWithAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:341:2: ( ( ( rule__WithAttribute__Group__0 ) ) )
            // InternalSeleniumScript.g:342:2: ( ( rule__WithAttribute__Group__0 ) )
            {
            // InternalSeleniumScript.g:342:2: ( ( rule__WithAttribute__Group__0 ) )
            // InternalSeleniumScript.g:343:3: ( rule__WithAttribute__Group__0 )
            {
             before(grammarAccess.getWithAttributeAccess().getGroup()); 
            // InternalSeleniumScript.g:344:3: ( rule__WithAttribute__Group__0 )
            // InternalSeleniumScript.g:344:4: rule__WithAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WithAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWithAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWithAttribute"


    // $ANTLR start "entryRuleAnd"
    // InternalSeleniumScript.g:353:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:354:1: ( ruleAnd EOF )
            // InternalSeleniumScript.g:355:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSeleniumScript.g:362:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:366:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSeleniumScript.g:367:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSeleniumScript.g:367:2: ( ( rule__And__Group__0 ) )
            // InternalSeleniumScript.g:368:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSeleniumScript.g:369:3: ( rule__And__Group__0 )
            // InternalSeleniumScript.g:369:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleAndAttribute"
    // InternalSeleniumScript.g:378:1: entryRuleAndAttribute : ruleAndAttribute EOF ;
    public final void entryRuleAndAttribute() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:379:1: ( ruleAndAttribute EOF )
            // InternalSeleniumScript.g:380:1: ruleAndAttribute EOF
            {
             before(grammarAccess.getAndAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAndAttribute();

            state._fsp--;

             after(grammarAccess.getAndAttributeRule()); 
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
    // $ANTLR end "entryRuleAndAttribute"


    // $ANTLR start "ruleAndAttribute"
    // InternalSeleniumScript.g:387:1: ruleAndAttribute : ( ( rule__AndAttribute__Group__0 ) ) ;
    public final void ruleAndAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:391:2: ( ( ( rule__AndAttribute__Group__0 ) ) )
            // InternalSeleniumScript.g:392:2: ( ( rule__AndAttribute__Group__0 ) )
            {
            // InternalSeleniumScript.g:392:2: ( ( rule__AndAttribute__Group__0 ) )
            // InternalSeleniumScript.g:393:3: ( rule__AndAttribute__Group__0 )
            {
             before(grammarAccess.getAndAttributeAccess().getGroup()); 
            // InternalSeleniumScript.g:394:3: ( rule__AndAttribute__Group__0 )
            // InternalSeleniumScript.g:394:4: rule__AndAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndAttribute"


    // $ANTLR start "entryRuleSelectorHas"
    // InternalSeleniumScript.g:403:1: entryRuleSelectorHas : ruleSelectorHas EOF ;
    public final void entryRuleSelectorHas() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:404:1: ( ruleSelectorHas EOF )
            // InternalSeleniumScript.g:405:1: ruleSelectorHas EOF
            {
             before(grammarAccess.getSelectorHasRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectorHas();

            state._fsp--;

             after(grammarAccess.getSelectorHasRule()); 
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
    // $ANTLR end "entryRuleSelectorHas"


    // $ANTLR start "ruleSelectorHas"
    // InternalSeleniumScript.g:412:1: ruleSelectorHas : ( ( rule__SelectorHas__Group__0 ) ) ;
    public final void ruleSelectorHas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:416:2: ( ( ( rule__SelectorHas__Group__0 ) ) )
            // InternalSeleniumScript.g:417:2: ( ( rule__SelectorHas__Group__0 ) )
            {
            // InternalSeleniumScript.g:417:2: ( ( rule__SelectorHas__Group__0 ) )
            // InternalSeleniumScript.g:418:3: ( rule__SelectorHas__Group__0 )
            {
             before(grammarAccess.getSelectorHasAccess().getGroup()); 
            // InternalSeleniumScript.g:419:3: ( rule__SelectorHas__Group__0 )
            // InternalSeleniumScript.g:419:4: rule__SelectorHas__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorHas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorHasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectorHas"


    // $ANTLR start "entryRuleVariableAction"
    // InternalSeleniumScript.g:428:1: entryRuleVariableAction : ruleVariableAction EOF ;
    public final void entryRuleVariableAction() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:429:1: ( ruleVariableAction EOF )
            // InternalSeleniumScript.g:430:1: ruleVariableAction EOF
            {
             before(grammarAccess.getVariableActionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAction();

            state._fsp--;

             after(grammarAccess.getVariableActionRule()); 
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
    // $ANTLR end "entryRuleVariableAction"


    // $ANTLR start "ruleVariableAction"
    // InternalSeleniumScript.g:437:1: ruleVariableAction : ( ( rule__VariableAction__Group__0 ) ) ;
    public final void ruleVariableAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:441:2: ( ( ( rule__VariableAction__Group__0 ) ) )
            // InternalSeleniumScript.g:442:2: ( ( rule__VariableAction__Group__0 ) )
            {
            // InternalSeleniumScript.g:442:2: ( ( rule__VariableAction__Group__0 ) )
            // InternalSeleniumScript.g:443:3: ( rule__VariableAction__Group__0 )
            {
             before(grammarAccess.getVariableActionAccess().getGroup()); 
            // InternalSeleniumScript.g:444:3: ( rule__VariableAction__Group__0 )
            // InternalSeleniumScript.g:444:4: rule__VariableAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAction"


    // $ANTLR start "entryRuleVariableAssignation"
    // InternalSeleniumScript.g:453:1: entryRuleVariableAssignation : ruleVariableAssignation EOF ;
    public final void entryRuleVariableAssignation() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:454:1: ( ruleVariableAssignation EOF )
            // InternalSeleniumScript.g:455:1: ruleVariableAssignation EOF
            {
             before(grammarAccess.getVariableAssignationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableAssignation();

            state._fsp--;

             after(grammarAccess.getVariableAssignationRule()); 
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
    // $ANTLR end "entryRuleVariableAssignation"


    // $ANTLR start "ruleVariableAssignation"
    // InternalSeleniumScript.g:462:1: ruleVariableAssignation : ( ( rule__VariableAssignation__Group__0 ) ) ;
    public final void ruleVariableAssignation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:466:2: ( ( ( rule__VariableAssignation__Group__0 ) ) )
            // InternalSeleniumScript.g:467:2: ( ( rule__VariableAssignation__Group__0 ) )
            {
            // InternalSeleniumScript.g:467:2: ( ( rule__VariableAssignation__Group__0 ) )
            // InternalSeleniumScript.g:468:3: ( rule__VariableAssignation__Group__0 )
            {
             before(grammarAccess.getVariableAssignationAccess().getGroup()); 
            // InternalSeleniumScript.g:469:3: ( rule__VariableAssignation__Group__0 )
            // InternalSeleniumScript.g:469:4: rule__VariableAssignation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableAssignation"


    // $ANTLR start "entryRuleValue"
    // InternalSeleniumScript.g:478:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalSeleniumScript.g:479:1: ( ruleValue EOF )
            // InternalSeleniumScript.g:480:1: ruleValue EOF
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
    // InternalSeleniumScript.g:487:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:491:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalSeleniumScript.g:492:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalSeleniumScript.g:492:2: ( ( rule__Value__Alternatives ) )
            // InternalSeleniumScript.g:493:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalSeleniumScript.g:494:3: ( rule__Value__Alternatives )
            // InternalSeleniumScript.g:494:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalSeleniumScript.g:502:1: rule__Action__Alternatives : ( ( ruleGotoAction ) | ( ruleClickAction ) | ( ruleAssertAction ) | ( ruleWriteAction ) | ( ( rule__Action__Group_4__0 ) ) | ( ruleSelectAction ) | ( ruleVariableAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:506:1: ( ( ruleGotoAction ) | ( ruleClickAction ) | ( ruleAssertAction ) | ( ruleWriteAction ) | ( ( rule__Action__Group_4__0 ) ) | ( ruleSelectAction ) | ( ruleVariableAction ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 12:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 25:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSeleniumScript.g:507:2: ( ruleGotoAction )
                    {
                    // InternalSeleniumScript.g:507:2: ( ruleGotoAction )
                    // InternalSeleniumScript.g:508:3: ruleGotoAction
                    {
                     before(grammarAccess.getActionAccess().getGotoActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGotoAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGotoActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:513:2: ( ruleClickAction )
                    {
                    // InternalSeleniumScript.g:513:2: ( ruleClickAction )
                    // InternalSeleniumScript.g:514:3: ruleClickAction
                    {
                     before(grammarAccess.getActionAccess().getClickActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClickAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getClickActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumScript.g:519:2: ( ruleAssertAction )
                    {
                    // InternalSeleniumScript.g:519:2: ( ruleAssertAction )
                    // InternalSeleniumScript.g:520:3: ruleAssertAction
                    {
                     before(grammarAccess.getActionAccess().getAssertActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssertAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getAssertActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumScript.g:525:2: ( ruleWriteAction )
                    {
                    // InternalSeleniumScript.g:525:2: ( ruleWriteAction )
                    // InternalSeleniumScript.g:526:3: ruleWriteAction
                    {
                     before(grammarAccess.getActionAccess().getWriteActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWriteAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getWriteActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumScript.g:531:2: ( ( rule__Action__Group_4__0 ) )
                    {
                    // InternalSeleniumScript.g:531:2: ( ( rule__Action__Group_4__0 ) )
                    // InternalSeleniumScript.g:532:3: ( rule__Action__Group_4__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_4()); 
                    // InternalSeleniumScript.g:533:3: ( rule__Action__Group_4__0 )
                    // InternalSeleniumScript.g:533:4: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumScript.g:537:2: ( ruleSelectAction )
                    {
                    // InternalSeleniumScript.g:537:2: ( ruleSelectAction )
                    // InternalSeleniumScript.g:538:3: ruleSelectAction
                    {
                     before(grammarAccess.getActionAccess().getSelectActionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSelectActionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSeleniumScript.g:543:2: ( ruleVariableAction )
                    {
                    // InternalSeleniumScript.g:543:2: ( ruleVariableAction )
                    // InternalSeleniumScript.g:544:3: ruleVariableAction
                    {
                     before(grammarAccess.getActionAccess().getVariableActionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getVariableActionParserRuleCall_6()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalSeleniumScript.g:553:1: rule__Value__Alternatives : ( ( ( rule__Value__ValueAssignment_0 ) ) | ( RULE_STRING ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:557:1: ( ( ( rule__Value__ValueAssignment_0 ) ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumScript.g:558:2: ( ( rule__Value__ValueAssignment_0 ) )
                    {
                    // InternalSeleniumScript.g:558:2: ( ( rule__Value__ValueAssignment_0 ) )
                    // InternalSeleniumScript.g:559:3: ( rule__Value__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValueAssignment_0()); 
                    // InternalSeleniumScript.g:560:3: ( rule__Value__ValueAssignment_0 )
                    // InternalSeleniumScript.g:560:4: rule__Value__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:564:2: ( RULE_STRING )
                    {
                    // InternalSeleniumScript.g:564:2: ( RULE_STRING )
                    // InternalSeleniumScript.g:565:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // InternalSeleniumScript.g:574:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:578:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalSeleniumScript.g:579:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalSeleniumScript.g:586:1: rule__Test__Group__0__Impl : ( 'test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:590:1: ( ( 'test' ) )
            // InternalSeleniumScript.g:591:1: ( 'test' )
            {
            // InternalSeleniumScript.g:591:1: ( 'test' )
            // InternalSeleniumScript.g:592:2: 'test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalSeleniumScript.g:601:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:605:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalSeleniumScript.g:606:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalSeleniumScript.g:613:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:617:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalSeleniumScript.g:618:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalSeleniumScript.g:618:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalSeleniumScript.g:619:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalSeleniumScript.g:620:2: ( rule__Test__NameAssignment_1 )
            // InternalSeleniumScript.g:620:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalSeleniumScript.g:628:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:632:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalSeleniumScript.g:633:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalSeleniumScript.g:640:1: rule__Test__Group__2__Impl : ( ':' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:644:1: ( ( ':' ) )
            // InternalSeleniumScript.g:645:1: ( ':' )
            {
            // InternalSeleniumScript.g:645:1: ( ':' )
            // InternalSeleniumScript.g:646:2: ':'
            {
             before(grammarAccess.getTestAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalSeleniumScript.g:655:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:659:1: ( rule__Test__Group__3__Impl )
            // InternalSeleniumScript.g:660:2: rule__Test__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalSeleniumScript.g:666:1: rule__Test__Group__3__Impl : ( ( ( rule__Test__ActionsAssignment_3 ) ) ( ( rule__Test__ActionsAssignment_3 )* ) ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:670:1: ( ( ( ( rule__Test__ActionsAssignment_3 ) ) ( ( rule__Test__ActionsAssignment_3 )* ) ) )
            // InternalSeleniumScript.g:671:1: ( ( ( rule__Test__ActionsAssignment_3 ) ) ( ( rule__Test__ActionsAssignment_3 )* ) )
            {
            // InternalSeleniumScript.g:671:1: ( ( ( rule__Test__ActionsAssignment_3 ) ) ( ( rule__Test__ActionsAssignment_3 )* ) )
            // InternalSeleniumScript.g:672:2: ( ( rule__Test__ActionsAssignment_3 ) ) ( ( rule__Test__ActionsAssignment_3 )* )
            {
            // InternalSeleniumScript.g:672:2: ( ( rule__Test__ActionsAssignment_3 ) )
            // InternalSeleniumScript.g:673:3: ( rule__Test__ActionsAssignment_3 )
            {
             before(grammarAccess.getTestAccess().getActionsAssignment_3()); 
            // InternalSeleniumScript.g:674:3: ( rule__Test__ActionsAssignment_3 )
            // InternalSeleniumScript.g:674:4: rule__Test__ActionsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Test__ActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getActionsAssignment_3()); 

            }

            // InternalSeleniumScript.g:677:2: ( ( rule__Test__ActionsAssignment_3 )* )
            // InternalSeleniumScript.g:678:3: ( rule__Test__ActionsAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getActionsAssignment_3()); 
            // InternalSeleniumScript.g:679:3: ( rule__Test__ActionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=15 && LA4_0<=18)||LA4_0==20||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeleniumScript.g:679:4: rule__Test__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Test__ActionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getActionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalSeleniumScript.g:689:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:693:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalSeleniumScript.g:694:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalSeleniumScript.g:701:1: rule__Action__Group_4__0__Impl : ( () ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:705:1: ( ( () ) )
            // InternalSeleniumScript.g:706:1: ( () )
            {
            // InternalSeleniumScript.g:706:1: ( () )
            // InternalSeleniumScript.g:707:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_4_0()); 
            // InternalSeleniumScript.g:708:2: ()
            // InternalSeleniumScript.g:708:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalSeleniumScript.g:716:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:720:1: ( rule__Action__Group_4__1__Impl )
            // InternalSeleniumScript.g:721:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalSeleniumScript.g:727:1: rule__Action__Group_4__1__Impl : ( ruleUncheckAllAction ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:731:1: ( ( ruleUncheckAllAction ) )
            // InternalSeleniumScript.g:732:1: ( ruleUncheckAllAction )
            {
            // InternalSeleniumScript.g:732:1: ( ruleUncheckAllAction )
            // InternalSeleniumScript.g:733:2: ruleUncheckAllAction
            {
             before(grammarAccess.getActionAccess().getUncheckAllActionParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleUncheckAllAction();

            state._fsp--;

             after(grammarAccess.getActionAccess().getUncheckAllActionParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__GotoAction__Group__0"
    // InternalSeleniumScript.g:743:1: rule__GotoAction__Group__0 : rule__GotoAction__Group__0__Impl rule__GotoAction__Group__1 ;
    public final void rule__GotoAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:747:1: ( rule__GotoAction__Group__0__Impl rule__GotoAction__Group__1 )
            // InternalSeleniumScript.g:748:2: rule__GotoAction__Group__0__Impl rule__GotoAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GotoAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GotoAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GotoAction__Group__0"


    // $ANTLR start "rule__GotoAction__Group__0__Impl"
    // InternalSeleniumScript.g:755:1: rule__GotoAction__Group__0__Impl : ( 'goto' ) ;
    public final void rule__GotoAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:759:1: ( ( 'goto' ) )
            // InternalSeleniumScript.g:760:1: ( 'goto' )
            {
            // InternalSeleniumScript.g:760:1: ( 'goto' )
            // InternalSeleniumScript.g:761:2: 'goto'
            {
             before(grammarAccess.getGotoActionAccess().getGotoKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGotoActionAccess().getGotoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GotoAction__Group__0__Impl"


    // $ANTLR start "rule__GotoAction__Group__1"
    // InternalSeleniumScript.g:770:1: rule__GotoAction__Group__1 : rule__GotoAction__Group__1__Impl ;
    public final void rule__GotoAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:774:1: ( rule__GotoAction__Group__1__Impl )
            // InternalSeleniumScript.g:775:2: rule__GotoAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GotoAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GotoAction__Group__1"


    // $ANTLR start "rule__GotoAction__Group__1__Impl"
    // InternalSeleniumScript.g:781:1: rule__GotoAction__Group__1__Impl : ( ( rule__GotoAction__UrlAssignment_1 ) ) ;
    public final void rule__GotoAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:785:1: ( ( ( rule__GotoAction__UrlAssignment_1 ) ) )
            // InternalSeleniumScript.g:786:1: ( ( rule__GotoAction__UrlAssignment_1 ) )
            {
            // InternalSeleniumScript.g:786:1: ( ( rule__GotoAction__UrlAssignment_1 ) )
            // InternalSeleniumScript.g:787:2: ( rule__GotoAction__UrlAssignment_1 )
            {
             before(grammarAccess.getGotoActionAccess().getUrlAssignment_1()); 
            // InternalSeleniumScript.g:788:2: ( rule__GotoAction__UrlAssignment_1 )
            // InternalSeleniumScript.g:788:3: rule__GotoAction__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GotoAction__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGotoActionAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GotoAction__Group__1__Impl"


    // $ANTLR start "rule__ClickAction__Group__0"
    // InternalSeleniumScript.g:797:1: rule__ClickAction__Group__0 : rule__ClickAction__Group__0__Impl rule__ClickAction__Group__1 ;
    public final void rule__ClickAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:801:1: ( rule__ClickAction__Group__0__Impl rule__ClickAction__Group__1 )
            // InternalSeleniumScript.g:802:2: rule__ClickAction__Group__0__Impl rule__ClickAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ClickAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickAction__Group__0"


    // $ANTLR start "rule__ClickAction__Group__0__Impl"
    // InternalSeleniumScript.g:809:1: rule__ClickAction__Group__0__Impl : ( 'click' ) ;
    public final void rule__ClickAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:813:1: ( ( 'click' ) )
            // InternalSeleniumScript.g:814:1: ( 'click' )
            {
            // InternalSeleniumScript.g:814:1: ( 'click' )
            // InternalSeleniumScript.g:815:2: 'click'
            {
             before(grammarAccess.getClickActionAccess().getClickKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClickActionAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickAction__Group__0__Impl"


    // $ANTLR start "rule__ClickAction__Group__1"
    // InternalSeleniumScript.g:824:1: rule__ClickAction__Group__1 : rule__ClickAction__Group__1__Impl ;
    public final void rule__ClickAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:828:1: ( rule__ClickAction__Group__1__Impl )
            // InternalSeleniumScript.g:829:2: rule__ClickAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickAction__Group__1"


    // $ANTLR start "rule__ClickAction__Group__1__Impl"
    // InternalSeleniumScript.g:835:1: rule__ClickAction__Group__1__Impl : ( ( rule__ClickAction__SelectorAssignment_1 ) ) ;
    public final void rule__ClickAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:839:1: ( ( ( rule__ClickAction__SelectorAssignment_1 ) ) )
            // InternalSeleniumScript.g:840:1: ( ( rule__ClickAction__SelectorAssignment_1 ) )
            {
            // InternalSeleniumScript.g:840:1: ( ( rule__ClickAction__SelectorAssignment_1 ) )
            // InternalSeleniumScript.g:841:2: ( rule__ClickAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getClickActionAccess().getSelectorAssignment_1()); 
            // InternalSeleniumScript.g:842:2: ( rule__ClickAction__SelectorAssignment_1 )
            // InternalSeleniumScript.g:842:3: rule__ClickAction__SelectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickAction__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickActionAccess().getSelectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickAction__Group__1__Impl"


    // $ANTLR start "rule__AssertAction__Group__0"
    // InternalSeleniumScript.g:851:1: rule__AssertAction__Group__0 : rule__AssertAction__Group__0__Impl rule__AssertAction__Group__1 ;
    public final void rule__AssertAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:855:1: ( rule__AssertAction__Group__0__Impl rule__AssertAction__Group__1 )
            // InternalSeleniumScript.g:856:2: rule__AssertAction__Group__0__Impl rule__AssertAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AssertAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertAction__Group__0"


    // $ANTLR start "rule__AssertAction__Group__0__Impl"
    // InternalSeleniumScript.g:863:1: rule__AssertAction__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:867:1: ( ( 'assert' ) )
            // InternalSeleniumScript.g:868:1: ( 'assert' )
            {
            // InternalSeleniumScript.g:868:1: ( 'assert' )
            // InternalSeleniumScript.g:869:2: 'assert'
            {
             before(grammarAccess.getAssertActionAccess().getAssertKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssertActionAccess().getAssertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertAction__Group__0__Impl"


    // $ANTLR start "rule__AssertAction__Group__1"
    // InternalSeleniumScript.g:878:1: rule__AssertAction__Group__1 : rule__AssertAction__Group__1__Impl ;
    public final void rule__AssertAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:882:1: ( rule__AssertAction__Group__1__Impl )
            // InternalSeleniumScript.g:883:2: rule__AssertAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertAction__Group__1"


    // $ANTLR start "rule__AssertAction__Group__1__Impl"
    // InternalSeleniumScript.g:889:1: rule__AssertAction__Group__1__Impl : ( ( rule__AssertAction__SelectorAssignment_1 ) ) ;
    public final void rule__AssertAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:893:1: ( ( ( rule__AssertAction__SelectorAssignment_1 ) ) )
            // InternalSeleniumScript.g:894:1: ( ( rule__AssertAction__SelectorAssignment_1 ) )
            {
            // InternalSeleniumScript.g:894:1: ( ( rule__AssertAction__SelectorAssignment_1 ) )
            // InternalSeleniumScript.g:895:2: ( rule__AssertAction__SelectorAssignment_1 )
            {
             before(grammarAccess.getAssertActionAccess().getSelectorAssignment_1()); 
            // InternalSeleniumScript.g:896:2: ( rule__AssertAction__SelectorAssignment_1 )
            // InternalSeleniumScript.g:896:3: rule__AssertAction__SelectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertAction__SelectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertActionAccess().getSelectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertAction__Group__1__Impl"


    // $ANTLR start "rule__WriteAction__Group__0"
    // InternalSeleniumScript.g:905:1: rule__WriteAction__Group__0 : rule__WriteAction__Group__0__Impl rule__WriteAction__Group__1 ;
    public final void rule__WriteAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:909:1: ( rule__WriteAction__Group__0__Impl rule__WriteAction__Group__1 )
            // InternalSeleniumScript.g:910:2: rule__WriteAction__Group__0__Impl rule__WriteAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__WriteAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__0"


    // $ANTLR start "rule__WriteAction__Group__0__Impl"
    // InternalSeleniumScript.g:917:1: rule__WriteAction__Group__0__Impl : ( 'write' ) ;
    public final void rule__WriteAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:921:1: ( ( 'write' ) )
            // InternalSeleniumScript.g:922:1: ( 'write' )
            {
            // InternalSeleniumScript.g:922:1: ( 'write' )
            // InternalSeleniumScript.g:923:2: 'write'
            {
             before(grammarAccess.getWriteActionAccess().getWriteKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWriteActionAccess().getWriteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__0__Impl"


    // $ANTLR start "rule__WriteAction__Group__1"
    // InternalSeleniumScript.g:932:1: rule__WriteAction__Group__1 : rule__WriteAction__Group__1__Impl rule__WriteAction__Group__2 ;
    public final void rule__WriteAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:936:1: ( rule__WriteAction__Group__1__Impl rule__WriteAction__Group__2 )
            // InternalSeleniumScript.g:937:2: rule__WriteAction__Group__1__Impl rule__WriteAction__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__WriteAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__1"


    // $ANTLR start "rule__WriteAction__Group__1__Impl"
    // InternalSeleniumScript.g:944:1: rule__WriteAction__Group__1__Impl : ( ( rule__WriteAction__ValueAssignment_1 ) ) ;
    public final void rule__WriteAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:948:1: ( ( ( rule__WriteAction__ValueAssignment_1 ) ) )
            // InternalSeleniumScript.g:949:1: ( ( rule__WriteAction__ValueAssignment_1 ) )
            {
            // InternalSeleniumScript.g:949:1: ( ( rule__WriteAction__ValueAssignment_1 ) )
            // InternalSeleniumScript.g:950:2: ( rule__WriteAction__ValueAssignment_1 )
            {
             before(grammarAccess.getWriteActionAccess().getValueAssignment_1()); 
            // InternalSeleniumScript.g:951:2: ( rule__WriteAction__ValueAssignment_1 )
            // InternalSeleniumScript.g:951:3: rule__WriteAction__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WriteAction__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWriteActionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__1__Impl"


    // $ANTLR start "rule__WriteAction__Group__2"
    // InternalSeleniumScript.g:959:1: rule__WriteAction__Group__2 : rule__WriteAction__Group__2__Impl rule__WriteAction__Group__3 ;
    public final void rule__WriteAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:963:1: ( rule__WriteAction__Group__2__Impl rule__WriteAction__Group__3 )
            // InternalSeleniumScript.g:964:2: rule__WriteAction__Group__2__Impl rule__WriteAction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__WriteAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WriteAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__2"


    // $ANTLR start "rule__WriteAction__Group__2__Impl"
    // InternalSeleniumScript.g:971:1: rule__WriteAction__Group__2__Impl : ( 'in' ) ;
    public final void rule__WriteAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:975:1: ( ( 'in' ) )
            // InternalSeleniumScript.g:976:1: ( 'in' )
            {
            // InternalSeleniumScript.g:976:1: ( 'in' )
            // InternalSeleniumScript.g:977:2: 'in'
            {
             before(grammarAccess.getWriteActionAccess().getInKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWriteActionAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__2__Impl"


    // $ANTLR start "rule__WriteAction__Group__3"
    // InternalSeleniumScript.g:986:1: rule__WriteAction__Group__3 : rule__WriteAction__Group__3__Impl ;
    public final void rule__WriteAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:990:1: ( rule__WriteAction__Group__3__Impl )
            // InternalSeleniumScript.g:991:2: rule__WriteAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WriteAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__3"


    // $ANTLR start "rule__WriteAction__Group__3__Impl"
    // InternalSeleniumScript.g:997:1: rule__WriteAction__Group__3__Impl : ( ( rule__WriteAction__SelectorAssignment_3 ) ) ;
    public final void rule__WriteAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1001:1: ( ( ( rule__WriteAction__SelectorAssignment_3 ) ) )
            // InternalSeleniumScript.g:1002:1: ( ( rule__WriteAction__SelectorAssignment_3 ) )
            {
            // InternalSeleniumScript.g:1002:1: ( ( rule__WriteAction__SelectorAssignment_3 ) )
            // InternalSeleniumScript.g:1003:2: ( rule__WriteAction__SelectorAssignment_3 )
            {
             before(grammarAccess.getWriteActionAccess().getSelectorAssignment_3()); 
            // InternalSeleniumScript.g:1004:2: ( rule__WriteAction__SelectorAssignment_3 )
            // InternalSeleniumScript.g:1004:3: rule__WriteAction__SelectorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WriteAction__SelectorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWriteActionAccess().getSelectorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__Group__3__Impl"


    // $ANTLR start "rule__SelectAction__Group__0"
    // InternalSeleniumScript.g:1013:1: rule__SelectAction__Group__0 : rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 ;
    public final void rule__SelectAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1017:1: ( rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1 )
            // InternalSeleniumScript.g:1018:2: rule__SelectAction__Group__0__Impl rule__SelectAction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SelectAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__0"


    // $ANTLR start "rule__SelectAction__Group__0__Impl"
    // InternalSeleniumScript.g:1025:1: rule__SelectAction__Group__0__Impl : ( 'select' ) ;
    public final void rule__SelectAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1029:1: ( ( 'select' ) )
            // InternalSeleniumScript.g:1030:1: ( 'select' )
            {
            // InternalSeleniumScript.g:1030:1: ( 'select' )
            // InternalSeleniumScript.g:1031:2: 'select'
            {
             before(grammarAccess.getSelectActionAccess().getSelectKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectActionAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__0__Impl"


    // $ANTLR start "rule__SelectAction__Group__1"
    // InternalSeleniumScript.g:1040:1: rule__SelectAction__Group__1 : rule__SelectAction__Group__1__Impl rule__SelectAction__Group__2 ;
    public final void rule__SelectAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1044:1: ( rule__SelectAction__Group__1__Impl rule__SelectAction__Group__2 )
            // InternalSeleniumScript.g:1045:2: rule__SelectAction__Group__1__Impl rule__SelectAction__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SelectAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__1"


    // $ANTLR start "rule__SelectAction__Group__1__Impl"
    // InternalSeleniumScript.g:1052:1: rule__SelectAction__Group__1__Impl : ( ( rule__SelectAction__Group_1__0 )? ) ;
    public final void rule__SelectAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1056:1: ( ( ( rule__SelectAction__Group_1__0 )? ) )
            // InternalSeleniumScript.g:1057:1: ( ( rule__SelectAction__Group_1__0 )? )
            {
            // InternalSeleniumScript.g:1057:1: ( ( rule__SelectAction__Group_1__0 )? )
            // InternalSeleniumScript.g:1058:2: ( rule__SelectAction__Group_1__0 )?
            {
             before(grammarAccess.getSelectActionAccess().getGroup_1()); 
            // InternalSeleniumScript.g:1059:2: ( rule__SelectAction__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumScript.g:1059:3: rule__SelectAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectAction__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectActionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__1__Impl"


    // $ANTLR start "rule__SelectAction__Group__2"
    // InternalSeleniumScript.g:1067:1: rule__SelectAction__Group__2 : rule__SelectAction__Group__2__Impl rule__SelectAction__Group__3 ;
    public final void rule__SelectAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1071:1: ( rule__SelectAction__Group__2__Impl rule__SelectAction__Group__3 )
            // InternalSeleniumScript.g:1072:2: rule__SelectAction__Group__2__Impl rule__SelectAction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SelectAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__2"


    // $ANTLR start "rule__SelectAction__Group__2__Impl"
    // InternalSeleniumScript.g:1079:1: rule__SelectAction__Group__2__Impl : ( 'from' ) ;
    public final void rule__SelectAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1083:1: ( ( 'from' ) )
            // InternalSeleniumScript.g:1084:1: ( 'from' )
            {
            // InternalSeleniumScript.g:1084:1: ( 'from' )
            // InternalSeleniumScript.g:1085:2: 'from'
            {
             before(grammarAccess.getSelectActionAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectActionAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__2__Impl"


    // $ANTLR start "rule__SelectAction__Group__3"
    // InternalSeleniumScript.g:1094:1: rule__SelectAction__Group__3 : rule__SelectAction__Group__3__Impl ;
    public final void rule__SelectAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1098:1: ( rule__SelectAction__Group__3__Impl )
            // InternalSeleniumScript.g:1099:2: rule__SelectAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__3"


    // $ANTLR start "rule__SelectAction__Group__3__Impl"
    // InternalSeleniumScript.g:1105:1: rule__SelectAction__Group__3__Impl : ( ( rule__SelectAction__SelectorAssignment_3 ) ) ;
    public final void rule__SelectAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1109:1: ( ( ( rule__SelectAction__SelectorAssignment_3 ) ) )
            // InternalSeleniumScript.g:1110:1: ( ( rule__SelectAction__SelectorAssignment_3 ) )
            {
            // InternalSeleniumScript.g:1110:1: ( ( rule__SelectAction__SelectorAssignment_3 ) )
            // InternalSeleniumScript.g:1111:2: ( rule__SelectAction__SelectorAssignment_3 )
            {
             before(grammarAccess.getSelectActionAccess().getSelectorAssignment_3()); 
            // InternalSeleniumScript.g:1112:2: ( rule__SelectAction__SelectorAssignment_3 )
            // InternalSeleniumScript.g:1112:3: rule__SelectAction__SelectorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__SelectorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getSelectorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group__3__Impl"


    // $ANTLR start "rule__SelectAction__Group_1__0"
    // InternalSeleniumScript.g:1121:1: rule__SelectAction__Group_1__0 : rule__SelectAction__Group_1__0__Impl rule__SelectAction__Group_1__1 ;
    public final void rule__SelectAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1125:1: ( rule__SelectAction__Group_1__0__Impl rule__SelectAction__Group_1__1 )
            // InternalSeleniumScript.g:1126:2: rule__SelectAction__Group_1__0__Impl rule__SelectAction__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__SelectAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectAction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__0"


    // $ANTLR start "rule__SelectAction__Group_1__0__Impl"
    // InternalSeleniumScript.g:1133:1: rule__SelectAction__Group_1__0__Impl : ( ( rule__SelectAction__OptionSelectorAssignment_1_0 ) ) ;
    public final void rule__SelectAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1137:1: ( ( ( rule__SelectAction__OptionSelectorAssignment_1_0 ) ) )
            // InternalSeleniumScript.g:1138:1: ( ( rule__SelectAction__OptionSelectorAssignment_1_0 ) )
            {
            // InternalSeleniumScript.g:1138:1: ( ( rule__SelectAction__OptionSelectorAssignment_1_0 ) )
            // InternalSeleniumScript.g:1139:2: ( rule__SelectAction__OptionSelectorAssignment_1_0 )
            {
             before(grammarAccess.getSelectActionAccess().getOptionSelectorAssignment_1_0()); 
            // InternalSeleniumScript.g:1140:2: ( rule__SelectAction__OptionSelectorAssignment_1_0 )
            // InternalSeleniumScript.g:1140:3: rule__SelectAction__OptionSelectorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__OptionSelectorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getOptionSelectorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__0__Impl"


    // $ANTLR start "rule__SelectAction__Group_1__1"
    // InternalSeleniumScript.g:1148:1: rule__SelectAction__Group_1__1 : rule__SelectAction__Group_1__1__Impl rule__SelectAction__Group_1__2 ;
    public final void rule__SelectAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1152:1: ( rule__SelectAction__Group_1__1__Impl rule__SelectAction__Group_1__2 )
            // InternalSeleniumScript.g:1153:2: rule__SelectAction__Group_1__1__Impl rule__SelectAction__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__SelectAction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectAction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__1"


    // $ANTLR start "rule__SelectAction__Group_1__1__Impl"
    // InternalSeleniumScript.g:1160:1: rule__SelectAction__Group_1__1__Impl : ( ( rule__SelectAction__ValueAssignment_1_1 ) ) ;
    public final void rule__SelectAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1164:1: ( ( ( rule__SelectAction__ValueAssignment_1_1 ) ) )
            // InternalSeleniumScript.g:1165:1: ( ( rule__SelectAction__ValueAssignment_1_1 ) )
            {
            // InternalSeleniumScript.g:1165:1: ( ( rule__SelectAction__ValueAssignment_1_1 ) )
            // InternalSeleniumScript.g:1166:2: ( rule__SelectAction__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSelectActionAccess().getValueAssignment_1_1()); 
            // InternalSeleniumScript.g:1167:2: ( rule__SelectAction__ValueAssignment_1_1 )
            // InternalSeleniumScript.g:1167:3: rule__SelectAction__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectActionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__1__Impl"


    // $ANTLR start "rule__SelectAction__Group_1__2"
    // InternalSeleniumScript.g:1175:1: rule__SelectAction__Group_1__2 : rule__SelectAction__Group_1__2__Impl ;
    public final void rule__SelectAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1179:1: ( rule__SelectAction__Group_1__2__Impl )
            // InternalSeleniumScript.g:1180:2: rule__SelectAction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectAction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__2"


    // $ANTLR start "rule__SelectAction__Group_1__2__Impl"
    // InternalSeleniumScript.g:1186:1: rule__SelectAction__Group_1__2__Impl : ( ( rule__SelectAction__AndAssignment_1_2 )* ) ;
    public final void rule__SelectAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1190:1: ( ( ( rule__SelectAction__AndAssignment_1_2 )* ) )
            // InternalSeleniumScript.g:1191:1: ( ( rule__SelectAction__AndAssignment_1_2 )* )
            {
            // InternalSeleniumScript.g:1191:1: ( ( rule__SelectAction__AndAssignment_1_2 )* )
            // InternalSeleniumScript.g:1192:2: ( rule__SelectAction__AndAssignment_1_2 )*
            {
             before(grammarAccess.getSelectActionAccess().getAndAssignment_1_2()); 
            // InternalSeleniumScript.g:1193:2: ( rule__SelectAction__AndAssignment_1_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeleniumScript.g:1193:3: rule__SelectAction__AndAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SelectAction__AndAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSelectActionAccess().getAndAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__Group_1__2__Impl"


    // $ANTLR start "rule__SelectorWith__Group__0"
    // InternalSeleniumScript.g:1202:1: rule__SelectorWith__Group__0 : rule__SelectorWith__Group__0__Impl rule__SelectorWith__Group__1 ;
    public final void rule__SelectorWith__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1206:1: ( rule__SelectorWith__Group__0__Impl rule__SelectorWith__Group__1 )
            // InternalSeleniumScript.g:1207:2: rule__SelectorWith__Group__0__Impl rule__SelectorWith__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SelectorWith__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorWith__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group__0"


    // $ANTLR start "rule__SelectorWith__Group__0__Impl"
    // InternalSeleniumScript.g:1214:1: rule__SelectorWith__Group__0__Impl : ( ( rule__SelectorWith__Base_selectorAssignment_0 ) ) ;
    public final void rule__SelectorWith__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1218:1: ( ( ( rule__SelectorWith__Base_selectorAssignment_0 ) ) )
            // InternalSeleniumScript.g:1219:1: ( ( rule__SelectorWith__Base_selectorAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1219:1: ( ( rule__SelectorWith__Base_selectorAssignment_0 ) )
            // InternalSeleniumScript.g:1220:2: ( rule__SelectorWith__Base_selectorAssignment_0 )
            {
             before(grammarAccess.getSelectorWithAccess().getBase_selectorAssignment_0()); 
            // InternalSeleniumScript.g:1221:2: ( rule__SelectorWith__Base_selectorAssignment_0 )
            // InternalSeleniumScript.g:1221:3: rule__SelectorWith__Base_selectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorWith__Base_selectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorWithAccess().getBase_selectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group__0__Impl"


    // $ANTLR start "rule__SelectorWith__Group__1"
    // InternalSeleniumScript.g:1229:1: rule__SelectorWith__Group__1 : rule__SelectorWith__Group__1__Impl ;
    public final void rule__SelectorWith__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1233:1: ( rule__SelectorWith__Group__1__Impl )
            // InternalSeleniumScript.g:1234:2: rule__SelectorWith__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorWith__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group__1"


    // $ANTLR start "rule__SelectorWith__Group__1__Impl"
    // InternalSeleniumScript.g:1240:1: rule__SelectorWith__Group__1__Impl : ( ( rule__SelectorWith__Group_1__0 )? ) ;
    public final void rule__SelectorWith__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1244:1: ( ( ( rule__SelectorWith__Group_1__0 )? ) )
            // InternalSeleniumScript.g:1245:1: ( ( rule__SelectorWith__Group_1__0 )? )
            {
            // InternalSeleniumScript.g:1245:1: ( ( rule__SelectorWith__Group_1__0 )? )
            // InternalSeleniumScript.g:1246:2: ( rule__SelectorWith__Group_1__0 )?
            {
             before(grammarAccess.getSelectorWithAccess().getGroup_1()); 
            // InternalSeleniumScript.g:1247:2: ( rule__SelectorWith__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumScript.g:1247:3: rule__SelectorWith__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectorWith__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectorWithAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group__1__Impl"


    // $ANTLR start "rule__SelectorWith__Group_1__0"
    // InternalSeleniumScript.g:1256:1: rule__SelectorWith__Group_1__0 : rule__SelectorWith__Group_1__0__Impl rule__SelectorWith__Group_1__1 ;
    public final void rule__SelectorWith__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1260:1: ( rule__SelectorWith__Group_1__0__Impl rule__SelectorWith__Group_1__1 )
            // InternalSeleniumScript.g:1261:2: rule__SelectorWith__Group_1__0__Impl rule__SelectorWith__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__SelectorWith__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorWith__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group_1__0"


    // $ANTLR start "rule__SelectorWith__Group_1__0__Impl"
    // InternalSeleniumScript.g:1268:1: rule__SelectorWith__Group_1__0__Impl : ( ( rule__SelectorWith__WAssignment_1_0 ) ) ;
    public final void rule__SelectorWith__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1272:1: ( ( ( rule__SelectorWith__WAssignment_1_0 ) ) )
            // InternalSeleniumScript.g:1273:1: ( ( rule__SelectorWith__WAssignment_1_0 ) )
            {
            // InternalSeleniumScript.g:1273:1: ( ( rule__SelectorWith__WAssignment_1_0 ) )
            // InternalSeleniumScript.g:1274:2: ( rule__SelectorWith__WAssignment_1_0 )
            {
             before(grammarAccess.getSelectorWithAccess().getWAssignment_1_0()); 
            // InternalSeleniumScript.g:1275:2: ( rule__SelectorWith__WAssignment_1_0 )
            // InternalSeleniumScript.g:1275:3: rule__SelectorWith__WAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorWith__WAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorWithAccess().getWAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group_1__0__Impl"


    // $ANTLR start "rule__SelectorWith__Group_1__1"
    // InternalSeleniumScript.g:1283:1: rule__SelectorWith__Group_1__1 : rule__SelectorWith__Group_1__1__Impl ;
    public final void rule__SelectorWith__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1287:1: ( rule__SelectorWith__Group_1__1__Impl )
            // InternalSeleniumScript.g:1288:2: rule__SelectorWith__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorWith__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group_1__1"


    // $ANTLR start "rule__SelectorWith__Group_1__1__Impl"
    // InternalSeleniumScript.g:1294:1: rule__SelectorWith__Group_1__1__Impl : ( ( rule__SelectorWith__AndAssignment_1_1 )* ) ;
    public final void rule__SelectorWith__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1298:1: ( ( ( rule__SelectorWith__AndAssignment_1_1 )* ) )
            // InternalSeleniumScript.g:1299:1: ( ( rule__SelectorWith__AndAssignment_1_1 )* )
            {
            // InternalSeleniumScript.g:1299:1: ( ( rule__SelectorWith__AndAssignment_1_1 )* )
            // InternalSeleniumScript.g:1300:2: ( rule__SelectorWith__AndAssignment_1_1 )*
            {
             before(grammarAccess.getSelectorWithAccess().getAndAssignment_1_1()); 
            // InternalSeleniumScript.g:1301:2: ( rule__SelectorWith__AndAssignment_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeleniumScript.g:1301:3: rule__SelectorWith__AndAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SelectorWith__AndAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSelectorWithAccess().getAndAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Group_1__1__Impl"


    // $ANTLR start "rule__With__Group__0"
    // InternalSeleniumScript.g:1310:1: rule__With__Group__0 : rule__With__Group__0__Impl rule__With__Group__1 ;
    public final void rule__With__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1314:1: ( rule__With__Group__0__Impl rule__With__Group__1 )
            // InternalSeleniumScript.g:1315:2: rule__With__Group__0__Impl rule__With__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__With__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__With__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__Group__0"


    // $ANTLR start "rule__With__Group__0__Impl"
    // InternalSeleniumScript.g:1322:1: rule__With__Group__0__Impl : ( ( rule__With__WithAttributeAssignment_0 ) ) ;
    public final void rule__With__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1326:1: ( ( ( rule__With__WithAttributeAssignment_0 ) ) )
            // InternalSeleniumScript.g:1327:1: ( ( rule__With__WithAttributeAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1327:1: ( ( rule__With__WithAttributeAssignment_0 ) )
            // InternalSeleniumScript.g:1328:2: ( rule__With__WithAttributeAssignment_0 )
            {
             before(grammarAccess.getWithAccess().getWithAttributeAssignment_0()); 
            // InternalSeleniumScript.g:1329:2: ( rule__With__WithAttributeAssignment_0 )
            // InternalSeleniumScript.g:1329:3: rule__With__WithAttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__With__WithAttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWithAccess().getWithAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__Group__0__Impl"


    // $ANTLR start "rule__With__Group__1"
    // InternalSeleniumScript.g:1337:1: rule__With__Group__1 : rule__With__Group__1__Impl ;
    public final void rule__With__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1341:1: ( rule__With__Group__1__Impl )
            // InternalSeleniumScript.g:1342:2: rule__With__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__With__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__Group__1"


    // $ANTLR start "rule__With__Group__1__Impl"
    // InternalSeleniumScript.g:1348:1: rule__With__Group__1__Impl : ( ( rule__With__ValueAssignment_1 ) ) ;
    public final void rule__With__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1352:1: ( ( ( rule__With__ValueAssignment_1 ) ) )
            // InternalSeleniumScript.g:1353:1: ( ( rule__With__ValueAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1353:1: ( ( rule__With__ValueAssignment_1 ) )
            // InternalSeleniumScript.g:1354:2: ( rule__With__ValueAssignment_1 )
            {
             before(grammarAccess.getWithAccess().getValueAssignment_1()); 
            // InternalSeleniumScript.g:1355:2: ( rule__With__ValueAssignment_1 )
            // InternalSeleniumScript.g:1355:3: rule__With__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__With__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWithAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__Group__1__Impl"


    // $ANTLR start "rule__WithAttribute__Group__0"
    // InternalSeleniumScript.g:1364:1: rule__WithAttribute__Group__0 : rule__WithAttribute__Group__0__Impl rule__WithAttribute__Group__1 ;
    public final void rule__WithAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1368:1: ( rule__WithAttribute__Group__0__Impl rule__WithAttribute__Group__1 )
            // InternalSeleniumScript.g:1369:2: rule__WithAttribute__Group__0__Impl rule__WithAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WithAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WithAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithAttribute__Group__0"


    // $ANTLR start "rule__WithAttribute__Group__0__Impl"
    // InternalSeleniumScript.g:1376:1: rule__WithAttribute__Group__0__Impl : ( 'with' ) ;
    public final void rule__WithAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1380:1: ( ( 'with' ) )
            // InternalSeleniumScript.g:1381:1: ( 'with' )
            {
            // InternalSeleniumScript.g:1381:1: ( 'with' )
            // InternalSeleniumScript.g:1382:2: 'with'
            {
             before(grammarAccess.getWithAttributeAccess().getWithKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWithAttributeAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithAttribute__Group__0__Impl"


    // $ANTLR start "rule__WithAttribute__Group__1"
    // InternalSeleniumScript.g:1391:1: rule__WithAttribute__Group__1 : rule__WithAttribute__Group__1__Impl ;
    public final void rule__WithAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1395:1: ( rule__WithAttribute__Group__1__Impl )
            // InternalSeleniumScript.g:1396:2: rule__WithAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WithAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithAttribute__Group__1"


    // $ANTLR start "rule__WithAttribute__Group__1__Impl"
    // InternalSeleniumScript.g:1402:1: rule__WithAttribute__Group__1__Impl : ( ( rule__WithAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__WithAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1406:1: ( ( ( rule__WithAttribute__AttributeAssignment_1 ) ) )
            // InternalSeleniumScript.g:1407:1: ( ( rule__WithAttribute__AttributeAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1407:1: ( ( rule__WithAttribute__AttributeAssignment_1 ) )
            // InternalSeleniumScript.g:1408:2: ( rule__WithAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getWithAttributeAccess().getAttributeAssignment_1()); 
            // InternalSeleniumScript.g:1409:2: ( rule__WithAttribute__AttributeAssignment_1 )
            // InternalSeleniumScript.g:1409:3: rule__WithAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WithAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWithAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithAttribute__Group__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalSeleniumScript.g:1418:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1422:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSeleniumScript.g:1423:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalSeleniumScript.g:1430:1: rule__And__Group__0__Impl : ( ( rule__And__AndAttributeAssignment_0 ) ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1434:1: ( ( ( rule__And__AndAttributeAssignment_0 ) ) )
            // InternalSeleniumScript.g:1435:1: ( ( rule__And__AndAttributeAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1435:1: ( ( rule__And__AndAttributeAssignment_0 ) )
            // InternalSeleniumScript.g:1436:2: ( rule__And__AndAttributeAssignment_0 )
            {
             before(grammarAccess.getAndAccess().getAndAttributeAssignment_0()); 
            // InternalSeleniumScript.g:1437:2: ( rule__And__AndAttributeAssignment_0 )
            // InternalSeleniumScript.g:1437:3: rule__And__AndAttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__And__AndAttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getAndAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalSeleniumScript.g:1445:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1449:1: ( rule__And__Group__1__Impl )
            // InternalSeleniumScript.g:1450:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalSeleniumScript.g:1456:1: rule__And__Group__1__Impl : ( ( rule__And__ValueAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1460:1: ( ( ( rule__And__ValueAssignment_1 ) ) )
            // InternalSeleniumScript.g:1461:1: ( ( rule__And__ValueAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1461:1: ( ( rule__And__ValueAssignment_1 ) )
            // InternalSeleniumScript.g:1462:2: ( rule__And__ValueAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getValueAssignment_1()); 
            // InternalSeleniumScript.g:1463:2: ( rule__And__ValueAssignment_1 )
            // InternalSeleniumScript.g:1463:3: rule__And__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__And__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__AndAttribute__Group__0"
    // InternalSeleniumScript.g:1472:1: rule__AndAttribute__Group__0 : rule__AndAttribute__Group__0__Impl rule__AndAttribute__Group__1 ;
    public final void rule__AndAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1476:1: ( rule__AndAttribute__Group__0__Impl rule__AndAttribute__Group__1 )
            // InternalSeleniumScript.g:1477:2: rule__AndAttribute__Group__0__Impl rule__AndAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AndAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttribute__Group__0"


    // $ANTLR start "rule__AndAttribute__Group__0__Impl"
    // InternalSeleniumScript.g:1484:1: rule__AndAttribute__Group__0__Impl : ( 'and' ) ;
    public final void rule__AndAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1488:1: ( ( 'and' ) )
            // InternalSeleniumScript.g:1489:1: ( 'and' )
            {
            // InternalSeleniumScript.g:1489:1: ( 'and' )
            // InternalSeleniumScript.g:1490:2: 'and'
            {
             before(grammarAccess.getAndAttributeAccess().getAndKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAndAttributeAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttribute__Group__0__Impl"


    // $ANTLR start "rule__AndAttribute__Group__1"
    // InternalSeleniumScript.g:1499:1: rule__AndAttribute__Group__1 : rule__AndAttribute__Group__1__Impl ;
    public final void rule__AndAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1503:1: ( rule__AndAttribute__Group__1__Impl )
            // InternalSeleniumScript.g:1504:2: rule__AndAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttribute__Group__1"


    // $ANTLR start "rule__AndAttribute__Group__1__Impl"
    // InternalSeleniumScript.g:1510:1: rule__AndAttribute__Group__1__Impl : ( ( rule__AndAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__AndAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1514:1: ( ( ( rule__AndAttribute__AttributeAssignment_1 ) ) )
            // InternalSeleniumScript.g:1515:1: ( ( rule__AndAttribute__AttributeAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1515:1: ( ( rule__AndAttribute__AttributeAssignment_1 ) )
            // InternalSeleniumScript.g:1516:2: ( rule__AndAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAndAttributeAccess().getAttributeAssignment_1()); 
            // InternalSeleniumScript.g:1517:2: ( rule__AndAttribute__AttributeAssignment_1 )
            // InternalSeleniumScript.g:1517:3: rule__AndAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AndAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttribute__Group__1__Impl"


    // $ANTLR start "rule__SelectorHas__Group__0"
    // InternalSeleniumScript.g:1526:1: rule__SelectorHas__Group__0 : rule__SelectorHas__Group__0__Impl rule__SelectorHas__Group__1 ;
    public final void rule__SelectorHas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1530:1: ( rule__SelectorHas__Group__0__Impl rule__SelectorHas__Group__1 )
            // InternalSeleniumScript.g:1531:2: rule__SelectorHas__Group__0__Impl rule__SelectorHas__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SelectorHas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorHas__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__0"


    // $ANTLR start "rule__SelectorHas__Group__0__Impl"
    // InternalSeleniumScript.g:1538:1: rule__SelectorHas__Group__0__Impl : ( ( rule__SelectorHas__Base_selectorAssignment_0 ) ) ;
    public final void rule__SelectorHas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1542:1: ( ( ( rule__SelectorHas__Base_selectorAssignment_0 ) ) )
            // InternalSeleniumScript.g:1543:1: ( ( rule__SelectorHas__Base_selectorAssignment_0 ) )
            {
            // InternalSeleniumScript.g:1543:1: ( ( rule__SelectorHas__Base_selectorAssignment_0 ) )
            // InternalSeleniumScript.g:1544:2: ( rule__SelectorHas__Base_selectorAssignment_0 )
            {
             before(grammarAccess.getSelectorHasAccess().getBase_selectorAssignment_0()); 
            // InternalSeleniumScript.g:1545:2: ( rule__SelectorHas__Base_selectorAssignment_0 )
            // InternalSeleniumScript.g:1545:3: rule__SelectorHas__Base_selectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectorHas__Base_selectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorHasAccess().getBase_selectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__0__Impl"


    // $ANTLR start "rule__SelectorHas__Group__1"
    // InternalSeleniumScript.g:1553:1: rule__SelectorHas__Group__1 : rule__SelectorHas__Group__1__Impl rule__SelectorHas__Group__2 ;
    public final void rule__SelectorHas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1557:1: ( rule__SelectorHas__Group__1__Impl rule__SelectorHas__Group__2 )
            // InternalSeleniumScript.g:1558:2: rule__SelectorHas__Group__1__Impl rule__SelectorHas__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SelectorHas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorHas__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__1"


    // $ANTLR start "rule__SelectorHas__Group__1__Impl"
    // InternalSeleniumScript.g:1565:1: rule__SelectorHas__Group__1__Impl : ( 'has' ) ;
    public final void rule__SelectorHas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1569:1: ( ( 'has' ) )
            // InternalSeleniumScript.g:1570:1: ( 'has' )
            {
            // InternalSeleniumScript.g:1570:1: ( 'has' )
            // InternalSeleniumScript.g:1571:2: 'has'
            {
             before(grammarAccess.getSelectorHasAccess().getHasKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectorHasAccess().getHasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__1__Impl"


    // $ANTLR start "rule__SelectorHas__Group__2"
    // InternalSeleniumScript.g:1580:1: rule__SelectorHas__Group__2 : rule__SelectorHas__Group__2__Impl rule__SelectorHas__Group__3 ;
    public final void rule__SelectorHas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1584:1: ( rule__SelectorHas__Group__2__Impl rule__SelectorHas__Group__3 )
            // InternalSeleniumScript.g:1585:2: rule__SelectorHas__Group__2__Impl rule__SelectorHas__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SelectorHas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectorHas__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__2"


    // $ANTLR start "rule__SelectorHas__Group__2__Impl"
    // InternalSeleniumScript.g:1592:1: rule__SelectorHas__Group__2__Impl : ( ( rule__SelectorHas__AttributeAssignment_2 ) ) ;
    public final void rule__SelectorHas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1596:1: ( ( ( rule__SelectorHas__AttributeAssignment_2 ) ) )
            // InternalSeleniumScript.g:1597:1: ( ( rule__SelectorHas__AttributeAssignment_2 ) )
            {
            // InternalSeleniumScript.g:1597:1: ( ( rule__SelectorHas__AttributeAssignment_2 ) )
            // InternalSeleniumScript.g:1598:2: ( rule__SelectorHas__AttributeAssignment_2 )
            {
             before(grammarAccess.getSelectorHasAccess().getAttributeAssignment_2()); 
            // InternalSeleniumScript.g:1599:2: ( rule__SelectorHas__AttributeAssignment_2 )
            // InternalSeleniumScript.g:1599:3: rule__SelectorHas__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectorHas__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectorHasAccess().getAttributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__2__Impl"


    // $ANTLR start "rule__SelectorHas__Group__3"
    // InternalSeleniumScript.g:1607:1: rule__SelectorHas__Group__3 : rule__SelectorHas__Group__3__Impl ;
    public final void rule__SelectorHas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1611:1: ( rule__SelectorHas__Group__3__Impl )
            // InternalSeleniumScript.g:1612:2: rule__SelectorHas__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectorHas__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__3"


    // $ANTLR start "rule__SelectorHas__Group__3__Impl"
    // InternalSeleniumScript.g:1618:1: rule__SelectorHas__Group__3__Impl : ( ( rule__SelectorHas__ValueAssignment_3 ) ) ;
    public final void rule__SelectorHas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1622:1: ( ( ( rule__SelectorHas__ValueAssignment_3 ) ) )
            // InternalSeleniumScript.g:1623:1: ( ( rule__SelectorHas__ValueAssignment_3 ) )
            {
            // InternalSeleniumScript.g:1623:1: ( ( rule__SelectorHas__ValueAssignment_3 ) )
            // InternalSeleniumScript.g:1624:2: ( rule__SelectorHas__ValueAssignment_3 )
            {
             before(grammarAccess.getSelectorHasAccess().getValueAssignment_3()); 
            // InternalSeleniumScript.g:1625:2: ( rule__SelectorHas__ValueAssignment_3 )
            // InternalSeleniumScript.g:1625:3: rule__SelectorHas__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectorHas__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectorHasAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Group__3__Impl"


    // $ANTLR start "rule__VariableAction__Group__0"
    // InternalSeleniumScript.g:1634:1: rule__VariableAction__Group__0 : rule__VariableAction__Group__0__Impl rule__VariableAction__Group__1 ;
    public final void rule__VariableAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1638:1: ( rule__VariableAction__Group__0__Impl rule__VariableAction__Group__1 )
            // InternalSeleniumScript.g:1639:2: rule__VariableAction__Group__0__Impl rule__VariableAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__0"


    // $ANTLR start "rule__VariableAction__Group__0__Impl"
    // InternalSeleniumScript.g:1646:1: rule__VariableAction__Group__0__Impl : ( 'let' ) ;
    public final void rule__VariableAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1650:1: ( ( 'let' ) )
            // InternalSeleniumScript.g:1651:1: ( 'let' )
            {
            // InternalSeleniumScript.g:1651:1: ( 'let' )
            // InternalSeleniumScript.g:1652:2: 'let'
            {
             before(grammarAccess.getVariableActionAccess().getLetKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableActionAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__0__Impl"


    // $ANTLR start "rule__VariableAction__Group__1"
    // InternalSeleniumScript.g:1661:1: rule__VariableAction__Group__1 : rule__VariableAction__Group__1__Impl rule__VariableAction__Group__2 ;
    public final void rule__VariableAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1665:1: ( rule__VariableAction__Group__1__Impl rule__VariableAction__Group__2 )
            // InternalSeleniumScript.g:1666:2: rule__VariableAction__Group__1__Impl rule__VariableAction__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__VariableAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__1"


    // $ANTLR start "rule__VariableAction__Group__1__Impl"
    // InternalSeleniumScript.g:1673:1: rule__VariableAction__Group__1__Impl : ( ( rule__VariableAction__NameAssignment_1 ) ) ;
    public final void rule__VariableAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1677:1: ( ( ( rule__VariableAction__NameAssignment_1 ) ) )
            // InternalSeleniumScript.g:1678:1: ( ( rule__VariableAction__NameAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1678:1: ( ( rule__VariableAction__NameAssignment_1 ) )
            // InternalSeleniumScript.g:1679:2: ( rule__VariableAction__NameAssignment_1 )
            {
             before(grammarAccess.getVariableActionAccess().getNameAssignment_1()); 
            // InternalSeleniumScript.g:1680:2: ( rule__VariableAction__NameAssignment_1 )
            // InternalSeleniumScript.g:1680:3: rule__VariableAction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableAction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__1__Impl"


    // $ANTLR start "rule__VariableAction__Group__2"
    // InternalSeleniumScript.g:1688:1: rule__VariableAction__Group__2 : rule__VariableAction__Group__2__Impl ;
    public final void rule__VariableAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1692:1: ( rule__VariableAction__Group__2__Impl )
            // InternalSeleniumScript.g:1693:2: rule__VariableAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__2"


    // $ANTLR start "rule__VariableAction__Group__2__Impl"
    // InternalSeleniumScript.g:1699:1: rule__VariableAction__Group__2__Impl : ( ( rule__VariableAction__AssignationAssignment_2 ) ) ;
    public final void rule__VariableAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1703:1: ( ( ( rule__VariableAction__AssignationAssignment_2 ) ) )
            // InternalSeleniumScript.g:1704:1: ( ( rule__VariableAction__AssignationAssignment_2 ) )
            {
            // InternalSeleniumScript.g:1704:1: ( ( rule__VariableAction__AssignationAssignment_2 ) )
            // InternalSeleniumScript.g:1705:2: ( rule__VariableAction__AssignationAssignment_2 )
            {
             before(grammarAccess.getVariableActionAccess().getAssignationAssignment_2()); 
            // InternalSeleniumScript.g:1706:2: ( rule__VariableAction__AssignationAssignment_2 )
            // InternalSeleniumScript.g:1706:3: rule__VariableAction__AssignationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableAction__AssignationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableActionAccess().getAssignationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__Group__2__Impl"


    // $ANTLR start "rule__VariableAssignation__Group__0"
    // InternalSeleniumScript.g:1715:1: rule__VariableAssignation__Group__0 : rule__VariableAssignation__Group__0__Impl rule__VariableAssignation__Group__1 ;
    public final void rule__VariableAssignation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1719:1: ( rule__VariableAssignation__Group__0__Impl rule__VariableAssignation__Group__1 )
            // InternalSeleniumScript.g:1720:2: rule__VariableAssignation__Group__0__Impl rule__VariableAssignation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableAssignation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__0"


    // $ANTLR start "rule__VariableAssignation__Group__0__Impl"
    // InternalSeleniumScript.g:1727:1: rule__VariableAssignation__Group__0__Impl : ( 'as' ) ;
    public final void rule__VariableAssignation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1731:1: ( ( 'as' ) )
            // InternalSeleniumScript.g:1732:1: ( 'as' )
            {
            // InternalSeleniumScript.g:1732:1: ( 'as' )
            // InternalSeleniumScript.g:1733:2: 'as'
            {
             before(grammarAccess.getVariableAssignationAccess().getAsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVariableAssignationAccess().getAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignation__Group__1"
    // InternalSeleniumScript.g:1742:1: rule__VariableAssignation__Group__1 : rule__VariableAssignation__Group__1__Impl rule__VariableAssignation__Group__2 ;
    public final void rule__VariableAssignation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1746:1: ( rule__VariableAssignation__Group__1__Impl rule__VariableAssignation__Group__2 )
            // InternalSeleniumScript.g:1747:2: rule__VariableAssignation__Group__1__Impl rule__VariableAssignation__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__VariableAssignation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__1"


    // $ANTLR start "rule__VariableAssignation__Group__1__Impl"
    // InternalSeleniumScript.g:1754:1: rule__VariableAssignation__Group__1__Impl : ( ( rule__VariableAssignation__AttributeAssignment_1 ) ) ;
    public final void rule__VariableAssignation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1758:1: ( ( ( rule__VariableAssignation__AttributeAssignment_1 ) ) )
            // InternalSeleniumScript.g:1759:1: ( ( rule__VariableAssignation__AttributeAssignment_1 ) )
            {
            // InternalSeleniumScript.g:1759:1: ( ( rule__VariableAssignation__AttributeAssignment_1 ) )
            // InternalSeleniumScript.g:1760:2: ( rule__VariableAssignation__AttributeAssignment_1 )
            {
             before(grammarAccess.getVariableAssignationAccess().getAttributeAssignment_1()); 
            // InternalSeleniumScript.g:1761:2: ( rule__VariableAssignation__AttributeAssignment_1 )
            // InternalSeleniumScript.g:1761:3: rule__VariableAssignation__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignation__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignationAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignation__Group__2"
    // InternalSeleniumScript.g:1769:1: rule__VariableAssignation__Group__2 : rule__VariableAssignation__Group__2__Impl rule__VariableAssignation__Group__3 ;
    public final void rule__VariableAssignation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1773:1: ( rule__VariableAssignation__Group__2__Impl rule__VariableAssignation__Group__3 )
            // InternalSeleniumScript.g:1774:2: rule__VariableAssignation__Group__2__Impl rule__VariableAssignation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__VariableAssignation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableAssignation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__2"


    // $ANTLR start "rule__VariableAssignation__Group__2__Impl"
    // InternalSeleniumScript.g:1781:1: rule__VariableAssignation__Group__2__Impl : ( 'from' ) ;
    public final void rule__VariableAssignation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1785:1: ( ( 'from' ) )
            // InternalSeleniumScript.g:1786:1: ( 'from' )
            {
            // InternalSeleniumScript.g:1786:1: ( 'from' )
            // InternalSeleniumScript.g:1787:2: 'from'
            {
             before(grammarAccess.getVariableAssignationAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableAssignationAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__2__Impl"


    // $ANTLR start "rule__VariableAssignation__Group__3"
    // InternalSeleniumScript.g:1796:1: rule__VariableAssignation__Group__3 : rule__VariableAssignation__Group__3__Impl ;
    public final void rule__VariableAssignation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1800:1: ( rule__VariableAssignation__Group__3__Impl )
            // InternalSeleniumScript.g:1801:2: rule__VariableAssignation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__3"


    // $ANTLR start "rule__VariableAssignation__Group__3__Impl"
    // InternalSeleniumScript.g:1807:1: rule__VariableAssignation__Group__3__Impl : ( ( rule__VariableAssignation__SelectorAssignment_3 ) ) ;
    public final void rule__VariableAssignation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1811:1: ( ( ( rule__VariableAssignation__SelectorAssignment_3 ) ) )
            // InternalSeleniumScript.g:1812:1: ( ( rule__VariableAssignation__SelectorAssignment_3 ) )
            {
            // InternalSeleniumScript.g:1812:1: ( ( rule__VariableAssignation__SelectorAssignment_3 ) )
            // InternalSeleniumScript.g:1813:2: ( rule__VariableAssignation__SelectorAssignment_3 )
            {
             before(grammarAccess.getVariableAssignationAccess().getSelectorAssignment_3()); 
            // InternalSeleniumScript.g:1814:2: ( rule__VariableAssignation__SelectorAssignment_3 )
            // InternalSeleniumScript.g:1814:3: rule__VariableAssignation__SelectorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableAssignation__SelectorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignationAccess().getSelectorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__Group__3__Impl"


    // $ANTLR start "rule__Model__TestsAssignment"
    // InternalSeleniumScript.g:1823:1: rule__Model__TestsAssignment : ( ruleTest ) ;
    public final void rule__Model__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1827:1: ( ( ruleTest ) )
            // InternalSeleniumScript.g:1828:2: ( ruleTest )
            {
            // InternalSeleniumScript.g:1828:2: ( ruleTest )
            // InternalSeleniumScript.g:1829:3: ruleTest
            {
             before(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TestsAssignment"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalSeleniumScript.g:1838:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1842:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:1843:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:1843:2: ( RULE_ID )
            // InternalSeleniumScript.g:1844:3: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__ActionsAssignment_3"
    // InternalSeleniumScript.g:1853:1: rule__Test__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Test__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1857:1: ( ( ruleAction ) )
            // InternalSeleniumScript.g:1858:2: ( ruleAction )
            {
            // InternalSeleniumScript.g:1858:2: ( ruleAction )
            // InternalSeleniumScript.g:1859:3: ruleAction
            {
             before(grammarAccess.getTestAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTestAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ActionsAssignment_3"


    // $ANTLR start "rule__GotoAction__UrlAssignment_1"
    // InternalSeleniumScript.g:1868:1: rule__GotoAction__UrlAssignment_1 : ( RULE_URL ) ;
    public final void rule__GotoAction__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1872:1: ( ( RULE_URL ) )
            // InternalSeleniumScript.g:1873:2: ( RULE_URL )
            {
            // InternalSeleniumScript.g:1873:2: ( RULE_URL )
            // InternalSeleniumScript.g:1874:3: RULE_URL
            {
             before(grammarAccess.getGotoActionAccess().getUrlURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getGotoActionAccess().getUrlURLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GotoAction__UrlAssignment_1"


    // $ANTLR start "rule__ClickAction__SelectorAssignment_1"
    // InternalSeleniumScript.g:1883:1: rule__ClickAction__SelectorAssignment_1 : ( ruleSelectorWith ) ;
    public final void rule__ClickAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1887:1: ( ( ruleSelectorWith ) )
            // InternalSeleniumScript.g:1888:2: ( ruleSelectorWith )
            {
            // InternalSeleniumScript.g:1888:2: ( ruleSelectorWith )
            // InternalSeleniumScript.g:1889:3: ruleSelectorWith
            {
             before(grammarAccess.getClickActionAccess().getSelectorSelectorWithParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorWith();

            state._fsp--;

             after(grammarAccess.getClickActionAccess().getSelectorSelectorWithParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickAction__SelectorAssignment_1"


    // $ANTLR start "rule__AssertAction__SelectorAssignment_1"
    // InternalSeleniumScript.g:1898:1: rule__AssertAction__SelectorAssignment_1 : ( ruleSelectorHas ) ;
    public final void rule__AssertAction__SelectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1902:1: ( ( ruleSelectorHas ) )
            // InternalSeleniumScript.g:1903:2: ( ruleSelectorHas )
            {
            // InternalSeleniumScript.g:1903:2: ( ruleSelectorHas )
            // InternalSeleniumScript.g:1904:3: ruleSelectorHas
            {
             before(grammarAccess.getAssertActionAccess().getSelectorSelectorHasParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorHas();

            state._fsp--;

             after(grammarAccess.getAssertActionAccess().getSelectorSelectorHasParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssertAction__SelectorAssignment_1"


    // $ANTLR start "rule__WriteAction__ValueAssignment_1"
    // InternalSeleniumScript.g:1913:1: rule__WriteAction__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WriteAction__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1917:1: ( ( RULE_STRING ) )
            // InternalSeleniumScript.g:1918:2: ( RULE_STRING )
            {
            // InternalSeleniumScript.g:1918:2: ( RULE_STRING )
            // InternalSeleniumScript.g:1919:3: RULE_STRING
            {
             before(grammarAccess.getWriteActionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWriteActionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__ValueAssignment_1"


    // $ANTLR start "rule__WriteAction__SelectorAssignment_3"
    // InternalSeleniumScript.g:1928:1: rule__WriteAction__SelectorAssignment_3 : ( ruleSelectorWith ) ;
    public final void rule__WriteAction__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1932:1: ( ( ruleSelectorWith ) )
            // InternalSeleniumScript.g:1933:2: ( ruleSelectorWith )
            {
            // InternalSeleniumScript.g:1933:2: ( ruleSelectorWith )
            // InternalSeleniumScript.g:1934:3: ruleSelectorWith
            {
             before(grammarAccess.getWriteActionAccess().getSelectorSelectorWithParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorWith();

            state._fsp--;

             after(grammarAccess.getWriteActionAccess().getSelectorSelectorWithParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WriteAction__SelectorAssignment_3"


    // $ANTLR start "rule__SelectAction__OptionSelectorAssignment_1_0"
    // InternalSeleniumScript.g:1943:1: rule__SelectAction__OptionSelectorAssignment_1_0 : ( ruleWithAttribute ) ;
    public final void rule__SelectAction__OptionSelectorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1947:1: ( ( ruleWithAttribute ) )
            // InternalSeleniumScript.g:1948:2: ( ruleWithAttribute )
            {
            // InternalSeleniumScript.g:1948:2: ( ruleWithAttribute )
            // InternalSeleniumScript.g:1949:3: ruleWithAttribute
            {
             before(grammarAccess.getSelectActionAccess().getOptionSelectorWithAttributeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWithAttribute();

            state._fsp--;

             after(grammarAccess.getSelectActionAccess().getOptionSelectorWithAttributeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__OptionSelectorAssignment_1_0"


    // $ANTLR start "rule__SelectAction__ValueAssignment_1_1"
    // InternalSeleniumScript.g:1958:1: rule__SelectAction__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__SelectAction__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1962:1: ( ( RULE_STRING ) )
            // InternalSeleniumScript.g:1963:2: ( RULE_STRING )
            {
            // InternalSeleniumScript.g:1963:2: ( RULE_STRING )
            // InternalSeleniumScript.g:1964:3: RULE_STRING
            {
             before(grammarAccess.getSelectActionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectActionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__ValueAssignment_1_1"


    // $ANTLR start "rule__SelectAction__AndAssignment_1_2"
    // InternalSeleniumScript.g:1973:1: rule__SelectAction__AndAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__SelectAction__AndAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1977:1: ( ( ruleAnd ) )
            // InternalSeleniumScript.g:1978:2: ( ruleAnd )
            {
            // InternalSeleniumScript.g:1978:2: ( ruleAnd )
            // InternalSeleniumScript.g:1979:3: ruleAnd
            {
             before(grammarAccess.getSelectActionAccess().getAndAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getSelectActionAccess().getAndAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__AndAssignment_1_2"


    // $ANTLR start "rule__SelectAction__SelectorAssignment_3"
    // InternalSeleniumScript.g:1988:1: rule__SelectAction__SelectorAssignment_3 : ( ruleSelectorWith ) ;
    public final void rule__SelectAction__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:1992:1: ( ( ruleSelectorWith ) )
            // InternalSeleniumScript.g:1993:2: ( ruleSelectorWith )
            {
            // InternalSeleniumScript.g:1993:2: ( ruleSelectorWith )
            // InternalSeleniumScript.g:1994:3: ruleSelectorWith
            {
             before(grammarAccess.getSelectActionAccess().getSelectorSelectorWithParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorWith();

            state._fsp--;

             after(grammarAccess.getSelectActionAccess().getSelectorSelectorWithParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectAction__SelectorAssignment_3"


    // $ANTLR start "rule__SelectorWith__Base_selectorAssignment_0"
    // InternalSeleniumScript.g:2003:1: rule__SelectorWith__Base_selectorAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SelectorWith__Base_selectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2007:1: ( ( RULE_STRING ) )
            // InternalSeleniumScript.g:2008:2: ( RULE_STRING )
            {
            // InternalSeleniumScript.g:2008:2: ( RULE_STRING )
            // InternalSeleniumScript.g:2009:3: RULE_STRING
            {
             before(grammarAccess.getSelectorWithAccess().getBase_selectorSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorWithAccess().getBase_selectorSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__Base_selectorAssignment_0"


    // $ANTLR start "rule__SelectorWith__WAssignment_1_0"
    // InternalSeleniumScript.g:2018:1: rule__SelectorWith__WAssignment_1_0 : ( ruleWith ) ;
    public final void rule__SelectorWith__WAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2022:1: ( ( ruleWith ) )
            // InternalSeleniumScript.g:2023:2: ( ruleWith )
            {
            // InternalSeleniumScript.g:2023:2: ( ruleWith )
            // InternalSeleniumScript.g:2024:3: ruleWith
            {
             before(grammarAccess.getSelectorWithAccess().getWWithParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWith();

            state._fsp--;

             after(grammarAccess.getSelectorWithAccess().getWWithParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__WAssignment_1_0"


    // $ANTLR start "rule__SelectorWith__AndAssignment_1_1"
    // InternalSeleniumScript.g:2033:1: rule__SelectorWith__AndAssignment_1_1 : ( ruleAnd ) ;
    public final void rule__SelectorWith__AndAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2037:1: ( ( ruleAnd ) )
            // InternalSeleniumScript.g:2038:2: ( ruleAnd )
            {
            // InternalSeleniumScript.g:2038:2: ( ruleAnd )
            // InternalSeleniumScript.g:2039:3: ruleAnd
            {
             before(grammarAccess.getSelectorWithAccess().getAndAndParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getSelectorWithAccess().getAndAndParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorWith__AndAssignment_1_1"


    // $ANTLR start "rule__With__WithAttributeAssignment_0"
    // InternalSeleniumScript.g:2048:1: rule__With__WithAttributeAssignment_0 : ( ruleWithAttribute ) ;
    public final void rule__With__WithAttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2052:1: ( ( ruleWithAttribute ) )
            // InternalSeleniumScript.g:2053:2: ( ruleWithAttribute )
            {
            // InternalSeleniumScript.g:2053:2: ( ruleWithAttribute )
            // InternalSeleniumScript.g:2054:3: ruleWithAttribute
            {
             before(grammarAccess.getWithAccess().getWithAttributeWithAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWithAttribute();

            state._fsp--;

             after(grammarAccess.getWithAccess().getWithAttributeWithAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__WithAttributeAssignment_0"


    // $ANTLR start "rule__With__ValueAssignment_1"
    // InternalSeleniumScript.g:2063:1: rule__With__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__With__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2067:1: ( ( ruleValue ) )
            // InternalSeleniumScript.g:2068:2: ( ruleValue )
            {
            // InternalSeleniumScript.g:2068:2: ( ruleValue )
            // InternalSeleniumScript.g:2069:3: ruleValue
            {
             before(grammarAccess.getWithAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getWithAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__With__ValueAssignment_1"


    // $ANTLR start "rule__WithAttribute__AttributeAssignment_1"
    // InternalSeleniumScript.g:2078:1: rule__WithAttribute__AttributeAssignment_1 : ( RULE_ID ) ;
    public final void rule__WithAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2082:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2083:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:2083:2: ( RULE_ID )
            // InternalSeleniumScript.g:2084:3: RULE_ID
            {
             before(grammarAccess.getWithAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWithAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WithAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__And__AndAttributeAssignment_0"
    // InternalSeleniumScript.g:2093:1: rule__And__AndAttributeAssignment_0 : ( ruleAndAttribute ) ;
    public final void rule__And__AndAttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2097:1: ( ( ruleAndAttribute ) )
            // InternalSeleniumScript.g:2098:2: ( ruleAndAttribute )
            {
            // InternalSeleniumScript.g:2098:2: ( ruleAndAttribute )
            // InternalSeleniumScript.g:2099:3: ruleAndAttribute
            {
             before(grammarAccess.getAndAccess().getAndAttributeAndAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAndAttribute();

            state._fsp--;

             after(grammarAccess.getAndAccess().getAndAttributeAndAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__AndAttributeAssignment_0"


    // $ANTLR start "rule__And__ValueAssignment_1"
    // InternalSeleniumScript.g:2108:1: rule__And__ValueAssignment_1 : ( ruleValue ) ;
    public final void rule__And__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2112:1: ( ( ruleValue ) )
            // InternalSeleniumScript.g:2113:2: ( ruleValue )
            {
            // InternalSeleniumScript.g:2113:2: ( ruleValue )
            // InternalSeleniumScript.g:2114:3: ruleValue
            {
             before(grammarAccess.getAndAccess().getValueValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAndAccess().getValueValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ValueAssignment_1"


    // $ANTLR start "rule__AndAttribute__AttributeAssignment_1"
    // InternalSeleniumScript.g:2123:1: rule__AndAttribute__AttributeAssignment_1 : ( RULE_ID ) ;
    public final void rule__AndAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2127:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2128:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:2128:2: ( RULE_ID )
            // InternalSeleniumScript.g:2129:3: RULE_ID
            {
             before(grammarAccess.getAndAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAndAttributeAccess().getAttributeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__SelectorHas__Base_selectorAssignment_0"
    // InternalSeleniumScript.g:2138:1: rule__SelectorHas__Base_selectorAssignment_0 : ( RULE_STRING ) ;
    public final void rule__SelectorHas__Base_selectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2142:1: ( ( RULE_STRING ) )
            // InternalSeleniumScript.g:2143:2: ( RULE_STRING )
            {
            // InternalSeleniumScript.g:2143:2: ( RULE_STRING )
            // InternalSeleniumScript.g:2144:3: RULE_STRING
            {
             before(grammarAccess.getSelectorHasAccess().getBase_selectorSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectorHasAccess().getBase_selectorSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__Base_selectorAssignment_0"


    // $ANTLR start "rule__SelectorHas__AttributeAssignment_2"
    // InternalSeleniumScript.g:2153:1: rule__SelectorHas__AttributeAssignment_2 : ( RULE_ID ) ;
    public final void rule__SelectorHas__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2157:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2158:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:2158:2: ( RULE_ID )
            // InternalSeleniumScript.g:2159:3: RULE_ID
            {
             before(grammarAccess.getSelectorHasAccess().getAttributeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectorHasAccess().getAttributeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__AttributeAssignment_2"


    // $ANTLR start "rule__SelectorHas__ValueAssignment_3"
    // InternalSeleniumScript.g:2168:1: rule__SelectorHas__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__SelectorHas__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2172:1: ( ( ruleValue ) )
            // InternalSeleniumScript.g:2173:2: ( ruleValue )
            {
            // InternalSeleniumScript.g:2173:2: ( ruleValue )
            // InternalSeleniumScript.g:2174:3: ruleValue
            {
             before(grammarAccess.getSelectorHasAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSelectorHasAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectorHas__ValueAssignment_3"


    // $ANTLR start "rule__VariableAction__NameAssignment_1"
    // InternalSeleniumScript.g:2183:1: rule__VariableAction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableAction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2187:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2188:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:2188:2: ( RULE_ID )
            // InternalSeleniumScript.g:2189:3: RULE_ID
            {
             before(grammarAccess.getVariableActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__NameAssignment_1"


    // $ANTLR start "rule__VariableAction__AssignationAssignment_2"
    // InternalSeleniumScript.g:2198:1: rule__VariableAction__AssignationAssignment_2 : ( ruleVariableAssignation ) ;
    public final void rule__VariableAction__AssignationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2202:1: ( ( ruleVariableAssignation ) )
            // InternalSeleniumScript.g:2203:2: ( ruleVariableAssignation )
            {
            // InternalSeleniumScript.g:2203:2: ( ruleVariableAssignation )
            // InternalSeleniumScript.g:2204:3: ruleVariableAssignation
            {
             before(grammarAccess.getVariableActionAccess().getAssignationVariableAssignationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableAssignation();

            state._fsp--;

             after(grammarAccess.getVariableActionAccess().getAssignationVariableAssignationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAction__AssignationAssignment_2"


    // $ANTLR start "rule__VariableAssignation__AttributeAssignment_1"
    // InternalSeleniumScript.g:2213:1: rule__VariableAssignation__AttributeAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableAssignation__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2217:1: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2218:2: ( RULE_ID )
            {
            // InternalSeleniumScript.g:2218:2: ( RULE_ID )
            // InternalSeleniumScript.g:2219:3: RULE_ID
            {
             before(grammarAccess.getVariableAssignationAccess().getAttributeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAssignationAccess().getAttributeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__AttributeAssignment_1"


    // $ANTLR start "rule__VariableAssignation__SelectorAssignment_3"
    // InternalSeleniumScript.g:2228:1: rule__VariableAssignation__SelectorAssignment_3 : ( ruleSelectorWith ) ;
    public final void rule__VariableAssignation__SelectorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2232:1: ( ( ruleSelectorWith ) )
            // InternalSeleniumScript.g:2233:2: ( ruleSelectorWith )
            {
            // InternalSeleniumScript.g:2233:2: ( ruleSelectorWith )
            // InternalSeleniumScript.g:2234:3: ruleSelectorWith
            {
             before(grammarAccess.getVariableAssignationAccess().getSelectorSelectorWithParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectorWith();

            state._fsp--;

             after(grammarAccess.getVariableAssignationAccess().getSelectorSelectorWithParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableAssignation__SelectorAssignment_3"


    // $ANTLR start "rule__Value__ValueAssignment_0"
    // InternalSeleniumScript.g:2243:1: rule__Value__ValueAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Value__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumScript.g:2247:1: ( ( ( RULE_ID ) ) )
            // InternalSeleniumScript.g:2248:2: ( ( RULE_ID ) )
            {
            // InternalSeleniumScript.g:2248:2: ( ( RULE_ID ) )
            // InternalSeleniumScript.g:2249:3: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getValueVariableActionCrossReference_0_0()); 
            // InternalSeleniumScript.g:2250:3: ( RULE_ID )
            // InternalSeleniumScript.g:2251:4: RULE_ID
            {
             before(grammarAccess.getValueAccess().getValueVariableActionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueVariableActionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getValueAccess().getValueVariableActionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002179000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002179002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});

}
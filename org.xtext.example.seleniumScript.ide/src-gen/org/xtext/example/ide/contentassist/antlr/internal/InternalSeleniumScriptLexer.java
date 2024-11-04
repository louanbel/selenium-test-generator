package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumScriptLexer extends Lexer {
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

    public InternalSeleniumScriptLexer() {;} 
    public InternalSeleniumScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSeleniumScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSeleniumScript.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:11:7: ( 'uncheck_all' )
            // InternalSeleniumScript.g:11:9: 'uncheck_all'
            {
            match("uncheck_all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:12:7: ( 'test' )
            // InternalSeleniumScript.g:12:9: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:13:7: ( ':' )
            // InternalSeleniumScript.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:14:7: ( 'goto' )
            // InternalSeleniumScript.g:14:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:15:7: ( 'click' )
            // InternalSeleniumScript.g:15:9: 'click'
            {
            match("click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:16:7: ( 'assert' )
            // InternalSeleniumScript.g:16:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:17:7: ( 'write' )
            // InternalSeleniumScript.g:17:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:18:7: ( 'in' )
            // InternalSeleniumScript.g:18:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:19:7: ( 'select' )
            // InternalSeleniumScript.g:19:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:20:7: ( 'from' )
            // InternalSeleniumScript.g:20:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:21:7: ( 'with' )
            // InternalSeleniumScript.g:21:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:22:7: ( 'and' )
            // InternalSeleniumScript.g:22:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:23:7: ( 'has' )
            // InternalSeleniumScript.g:23:9: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:24:7: ( 'let' )
            // InternalSeleniumScript.g:24:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:25:7: ( 'as' )
            // InternalSeleniumScript.g:25:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2262:10: ( 'http' ( 's' )? '://' ( 'www.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | '~' | '?' | '&' | '=' | '%' )* )? )
            // InternalSeleniumScript.g:2262:12: 'http' ( 's' )? '://' ( 'www.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+ ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | '~' | '?' | '&' | '=' | '%' )* )?
            {
            match("http"); 

            // InternalSeleniumScript.g:2262:19: ( 's' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='s') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSeleniumScript.g:2262:19: 's'
                    {
                    match('s'); 

                    }
                    break;

            }

            match("://"); 

            // InternalSeleniumScript.g:2262:30: ( 'www.' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='w') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='w') ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3=='w') ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4=='.') ) {
                            alt2=1;
                        }
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalSeleniumScript.g:2262:30: 'www.'
                    {
                    match("www."); 


                    }
                    break;

            }

            // InternalSeleniumScript.g:2262:38: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '.' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='-' && LA3_0<='.')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeleniumScript.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalSeleniumScript.g:2262:76: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | '~' | '?' | '&' | '=' | '%' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumScript.g:2262:77: '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | '~' | '?' | '&' | '=' | '%' )*
                    {
                    match('/'); 
                    // InternalSeleniumScript.g:2262:81: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '.' | '~' | '?' | '&' | '=' | '%' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='%' && LA4_0<='&')||(LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||LA4_0=='='||LA4_0=='?'||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='~') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:
                    	    {
                    	    if ( (input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2264:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSeleniumScript.g:2264:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSeleniumScript.g:2264:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumScript.g:2264:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSeleniumScript.g:2264:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeleniumScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2266:10: ( ( '0' .. '9' )+ )
            // InternalSeleniumScript.g:2266:12: ( '0' .. '9' )+
            {
            // InternalSeleniumScript.g:2266:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSeleniumScript.g:2266:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2268:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSeleniumScript.g:2268:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSeleniumScript.g:2268:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumScript.g:2268:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSeleniumScript.g:2268:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:2268:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeleniumScript.g:2268:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSeleniumScript.g:2268:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSeleniumScript.g:2268:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSeleniumScript.g:2268:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeleniumScript.g:2268:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2270:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSeleniumScript.g:2270:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSeleniumScript.g:2270:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSeleniumScript.g:2270:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2272:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSeleniumScript.g:2272:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSeleniumScript.g:2272:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeleniumScript.g:2272:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalSeleniumScript.g:2272:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleniumScript.g:2272:41: ( '\\r' )? '\\n'
                    {
                    // InternalSeleniumScript.g:2272:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSeleniumScript.g:2272:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2274:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSeleniumScript.g:2274:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSeleniumScript.g:2274:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeleniumScript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumScript.g:2276:16: ( . )
            // InternalSeleniumScript.g:2276:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSeleniumScript.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=23;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalSeleniumScript.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSeleniumScript.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSeleniumScript.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSeleniumScript.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSeleniumScript.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSeleniumScript.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSeleniumScript.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSeleniumScript.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSeleniumScript.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSeleniumScript.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSeleniumScript.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSeleniumScript.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSeleniumScript.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSeleniumScript.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSeleniumScript.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSeleniumScript.g:1:100: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 17 :
                // InternalSeleniumScript.g:1:109: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalSeleniumScript.g:1:117: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalSeleniumScript.g:1:126: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalSeleniumScript.g:1:138: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalSeleniumScript.g:1:154: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalSeleniumScript.g:1:170: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalSeleniumScript.g:1:178: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\26\1\uffff\11\26\1\24\2\uffff\3\24\2\uffff\1\26\1\uffff\1\26\1\uffff\2\26\1\57\3\26\1\63\5\26\5\uffff\5\26\1\uffff\1\76\2\26\1\uffff\2\26\1\103\1\26\1\105\1\26\1\107\1\110\2\26\1\uffff\1\26\1\114\1\26\1\116\1\uffff\1\26\1\uffff\1\26\2\uffff\1\122\1\26\1\124\1\uffff\1\26\1\uffff\1\26\1\uffff\1\26\1\uffff\1\127\1\uffff\1\130\1\26\2\uffff\3\26\1\135\1\uffff";
    static final String DFA17_eofS =
        "\136\uffff";
    static final String DFA17_minS =
        "\1\0\1\156\1\145\1\uffff\1\157\1\154\1\156\1\151\1\156\1\145\1\162\1\141\1\145\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\uffff\1\163\1\uffff\1\164\1\151\1\60\1\144\1\151\1\164\1\60\1\154\1\157\1\163\2\164\5\uffff\1\150\1\164\1\157\1\143\1\145\1\uffff\1\60\1\164\1\150\1\uffff\1\145\1\155\1\60\1\160\1\60\1\145\2\60\1\153\1\162\1\uffff\1\145\1\60\1\143\1\60\1\uffff\1\72\1\uffff\1\143\2\uffff\1\60\1\164\1\60\1\uffff\1\164\1\uffff\1\72\1\uffff\1\153\1\uffff\1\60\1\uffff\1\60\1\137\2\uffff\1\141\2\154\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\156\1\145\1\uffff\1\157\1\154\1\163\1\162\1\156\1\145\1\162\1\164\1\145\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\uffff\1\163\1\uffff\1\164\1\151\1\172\1\144\1\151\1\164\1\172\1\154\1\157\1\163\2\164\5\uffff\1\150\1\164\1\157\1\143\1\145\1\uffff\1\172\1\164\1\150\1\uffff\1\145\1\155\1\172\1\160\1\172\1\145\2\172\1\153\1\162\1\uffff\1\145\1\172\1\143\1\172\1\uffff\1\163\1\uffff\1\143\2\uffff\1\172\1\164\1\172\1\uffff\1\164\1\uffff\1\72\1\uffff\1\153\1\uffff\1\172\1\uffff\1\172\1\137\2\uffff\1\141\2\154\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\12\uffff\1\21\1\22\3\uffff\1\26\1\27\1\uffff\1\21\1\uffff\1\3\14\uffff\1\22\1\23\1\24\1\25\1\26\5\uffff\1\17\3\uffff\1\10\12\uffff\1\14\4\uffff\1\15\1\uffff\1\16\1\uffff\1\2\1\4\3\uffff\1\13\1\uffff\1\12\1\uffff\1\20\1\uffff\1\5\1\uffff\1\7\2\uffff\1\6\1\11\4\uffff\1\1";
    static final String DFA17_specialS =
        "\1\0\17\uffff\1\1\1\2\114\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\7\24\1\22\12\17\1\3\6\24\32\16\3\24\1\15\1\16\1\24\1\6\1\16\1\5\2\16\1\12\1\4\1\13\1\10\2\16\1\14\6\16\1\11\1\2\1\1\1\16\1\7\3\16\uff85\24",
            "\1\25",
            "\1\27",
            "",
            "\1\31",
            "\1\32",
            "\1\34\4\uffff\1\33",
            "\1\36\10\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42\22\uffff\1\43",
            "\1\44",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\46",
            "\0\46",
            "\1\47\4\uffff\1\50",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "",
            "\1\54",
            "\1\55",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22\26\1\56\7\26",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\104",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\106",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\111",
            "\1\112",
            "",
            "\1\113",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\115",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\120\70\uffff\1\117",
            "",
            "\1\121",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\123",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\125",
            "",
            "\1\120",
            "",
            "\1\126",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='u') ) {s = 1;}

                        else if ( (LA17_0=='t') ) {s = 2;}

                        else if ( (LA17_0==':') ) {s = 3;}

                        else if ( (LA17_0=='g') ) {s = 4;}

                        else if ( (LA17_0=='c') ) {s = 5;}

                        else if ( (LA17_0=='a') ) {s = 6;}

                        else if ( (LA17_0=='w') ) {s = 7;}

                        else if ( (LA17_0=='i') ) {s = 8;}

                        else if ( (LA17_0=='s') ) {s = 9;}

                        else if ( (LA17_0=='f') ) {s = 10;}

                        else if ( (LA17_0=='h') ) {s = 11;}

                        else if ( (LA17_0=='l') ) {s = 12;}

                        else if ( (LA17_0=='^') ) {s = 13;}

                        else if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='b'||(LA17_0>='d' && LA17_0<='e')||(LA17_0>='j' && LA17_0<='k')||(LA17_0>='m' && LA17_0<='r')||LA17_0=='v'||(LA17_0>='x' && LA17_0<='z')) ) {s = 14;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 15;}

                        else if ( (LA17_0=='\"') ) {s = 16;}

                        else if ( (LA17_0=='\'') ) {s = 17;}

                        else if ( (LA17_0=='/') ) {s = 18;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 19;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='.')||(LA17_0>=';' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_16 = input.LA(1);

                        s = -1;
                        if ( ((LA17_16>='\u0000' && LA17_16<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_17 = input.LA(1);

                        s = -1;
                        if ( ((LA17_17>='\u0000' && LA17_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
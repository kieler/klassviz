package de.cau.cs.kieler.klassviz.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassDataLexer extends Lexer {
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TFLOAT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_NATURAL=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalClassDataLexer() {;} 
    public InternalClassDataLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalClassDataLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalClassData.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:11:7: ( 'import' )
            // InternalClassData.g:11:9: 'import'
            {
            match("import"); 


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
            // InternalClassData.g:12:7: ( 'project' )
            // InternalClassData.g:12:9: 'project'
            {
            match("project"); 


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
            // InternalClassData.g:13:7: ( 'bundle' )
            // InternalClassData.g:13:9: 'bundle'
            {
            match("bundle"); 


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
            // InternalClassData.g:14:7: ( '=' )
            // InternalClassData.g:14:9: '='
            {
            match('='); 

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
            // InternalClassData.g:15:7: ( 'package' )
            // InternalClassData.g:15:9: 'package'
            {
            match("package"); 


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
            // InternalClassData.g:16:7: ( '{' )
            // InternalClassData.g:16:9: '{'
            {
            match('{'); 

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
            // InternalClassData.g:17:7: ( '}' )
            // InternalClassData.g:17:9: '}'
            {
            match('}'); 

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
            // InternalClassData.g:18:7: ( 'class' )
            // InternalClassData.g:18:9: 'class'
            {
            match("class"); 


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
            // InternalClassData.g:19:7: ( 'interface' )
            // InternalClassData.g:19:9: 'interface'
            {
            match("interface"); 


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
            // InternalClassData.g:20:7: ( 'enum' )
            // InternalClassData.g:20:9: 'enum'
            {
            match("enum"); 


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
            // InternalClassData.g:21:7: ( 'depend' )
            // InternalClassData.g:21:9: 'depend'
            {
            match("depend"); 


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
            // InternalClassData.g:22:7: ( '(' )
            // InternalClassData.g:22:9: '('
            {
            match('('); 

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
            // InternalClassData.g:23:7: ( ',' )
            // InternalClassData.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:24:7: ( ')' )
            // InternalClassData.g:24:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:25:7: ( '.' )
            // InternalClassData.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:919:14: ( ( 'true' | 'false' ) )
            // InternalClassData.g:919:16: ( 'true' | 'false' )
            {
            // InternalClassData.g:919:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalClassData.g:919:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalClassData.g:919:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_TFLOAT"
    public final void mRULE_TFLOAT() throws RecognitionException {
        try {
            int _type = RULE_TFLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:921:13: ( ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // InternalClassData.g:921:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // InternalClassData.g:921:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalClassData.g:921:16: ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalClassData.g:921:26: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0=='.') ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalClassData.g:921:27: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            {
                            // InternalClassData.g:921:27: ( '0' .. '9' )+
                            int cnt2=0;
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalClassData.g:921:28: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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

                            // InternalClassData.g:921:39: ( '.' ( '0' .. '9' )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='.') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // InternalClassData.g:921:40: '.' ( '0' .. '9' )*
                                    {
                                    match('.'); 
                                    // InternalClassData.g:921:44: ( '0' .. '9' )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                    	case 1 :
                                    	    // InternalClassData.g:921:45: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop3;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            // InternalClassData.g:921:58: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='E'||LA7_0=='e') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalClassData.g:921:59: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                                    {
                                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // InternalClassData.g:921:69: ( '+' | '-' )?
                                    int alt5=2;
                                    int LA5_0 = input.LA(1);

                                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                                        alt5=1;
                                    }
                                    switch (alt5) {
                                        case 1 :
                                            // InternalClassData.g:
                                            {
                                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                                input.consume();

                                            }
                                            else {
                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                recover(mse);
                                                throw mse;}


                                            }
                                            break;

                                    }

                                    // InternalClassData.g:921:80: ( '0' .. '9' )+
                                    int cnt6=0;
                                    loop6:
                                    do {
                                        int alt6=2;
                                        int LA6_0 = input.LA(1);

                                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                            alt6=1;
                                        }


                                        switch (alt6) {
                                    	case 1 :
                                    	    // InternalClassData.g:921:81: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt6 >= 1 ) break loop6;
                                                EarlyExitException eee =
                                                    new EarlyExitException(6, input);
                                                throw eee;
                                        }
                                        cnt6++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalClassData.g:921:94: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            {
                            match('.'); 
                            // InternalClassData.g:921:98: ( '0' .. '9' )+
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
                            	    // InternalClassData.g:921:99: '0' .. '9'
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

                            // InternalClassData.g:921:110: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='E'||LA11_0=='e') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalClassData.g:921:111: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                                    {
                                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // InternalClassData.g:921:121: ( '+' | '-' )?
                                    int alt9=2;
                                    int LA9_0 = input.LA(1);

                                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                                        alt9=1;
                                    }
                                    switch (alt9) {
                                        case 1 :
                                            // InternalClassData.g:
                                            {
                                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                                input.consume();

                                            }
                                            else {
                                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                                recover(mse);
                                                throw mse;}


                                            }
                                            break;

                                    }

                                    // InternalClassData.g:921:132: ( '0' .. '9' )+
                                    int cnt10=0;
                                    loop10:
                                    do {
                                        int alt10=2;
                                        int LA10_0 = input.LA(1);

                                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                                            alt10=1;
                                        }


                                        switch (alt10) {
                                    	case 1 :
                                    	    // InternalClassData.g:921:133: '0' .. '9'
                                    	    {
                                    	    matchRange('0','9'); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt10 >= 1 ) break loop10;
                                                EarlyExitException eee =
                                                    new EarlyExitException(10, input);
                                                throw eee;
                                        }
                                        cnt10++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalClassData.g:921:147: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    // InternalClassData.g:921:147: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalClassData.g:921:148: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    match('.'); 
                    // InternalClassData.g:921:163: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalClassData.g:921:164: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // InternalClassData.g:921:175: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalClassData.g:921:176: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalClassData.g:921:186: ( '+' | '-' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='+'||LA15_0=='-') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalClassData.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalClassData.g:921:197: ( '0' .. '9' )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalClassData.g:921:198: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalClassData.g:921:211: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    match('.'); 
                    // InternalClassData.g:921:215: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalClassData.g:921:216: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // InternalClassData.g:921:227: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalClassData.g:921:228: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalClassData.g:921:238: ( '+' | '-' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='+'||LA19_0=='-') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // InternalClassData.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalClassData.g:921:249: ( '0' .. '9' )+
                            int cnt20=0;
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalClassData.g:921:250: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt20 >= 1 ) break loop20;
                                        EarlyExitException eee =
                                            new EarlyExitException(20, input);
                                        throw eee;
                                }
                                cnt20++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalClassData.g:921:263: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // InternalClassData.g:921:263: ( '0' .. '9' )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalClassData.g:921:264: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalClassData.g:921:285: ( '+' | '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='+'||LA23_0=='-') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalClassData.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalClassData.g:921:296: ( '0' .. '9' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalClassData.g:921:297: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // $ANTLR end "RULE_TFLOAT"

    // $ANTLR start "RULE_NATURAL"
    public final void mRULE_NATURAL() throws RecognitionException {
        try {
            int _type = RULE_NATURAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:923:14: ( ( '0' .. '9' )+ )
            // InternalClassData.g:923:16: ( '0' .. '9' )+
            {
            // InternalClassData.g:923:16: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalClassData.g:923:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NATURAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalClassData.g:925:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalClassData.g:925:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalClassData.g:925:11: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='^') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalClassData.g:925:11: '^'
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

            // InternalClassData.g:925:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalClassData.g:
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
            	    break loop28;
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
            // InternalClassData.g:927:10: ( ( '0' .. '9' )+ )
            // InternalClassData.g:927:12: ( '0' .. '9' )+
            {
            // InternalClassData.g:927:12: ( '0' .. '9' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalClassData.g:927:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // InternalClassData.g:929:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalClassData.g:929:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalClassData.g:929:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\"') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\'') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalClassData.g:929:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalClassData.g:929:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\\') ) {
                            alt30=1;
                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalClassData.g:929:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalClassData.g:929:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop30;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalClassData.g:929:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalClassData.g:929:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalClassData.g:929:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalClassData.g:929:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop31;
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
            // InternalClassData.g:931:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalClassData.g:931:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalClassData.g:931:24: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1=='/') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_1>='\u0000' && LA33_1<='.')||(LA33_1>='0' && LA33_1<='\uFFFF')) ) {
                        alt33=1;
                    }


                }
                else if ( ((LA33_0>='\u0000' && LA33_0<=')')||(LA33_0>='+' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalClassData.g:931:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // InternalClassData.g:933:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalClassData.g:933:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalClassData.g:933:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalClassData.g:933:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop34;
                }
            } while (true);

            // InternalClassData.g:933:40: ( ( '\\r' )? '\\n' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalClassData.g:933:41: ( '\\r' )? '\\n'
                    {
                    // InternalClassData.g:933:41: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\r') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalClassData.g:933:41: '\\r'
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
            // InternalClassData.g:935:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalClassData.g:935:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalClassData.g:935:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalClassData.g:
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
            // InternalClassData.g:937:16: ( . )
            // InternalClassData.g:937:18: .
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
        // InternalClassData.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BOOLEAN | RULE_TFLOAT | RULE_NATURAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt38=25;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // InternalClassData.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalClassData.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalClassData.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalClassData.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalClassData.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalClassData.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalClassData.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalClassData.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalClassData.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalClassData.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalClassData.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalClassData.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalClassData.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalClassData.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalClassData.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalClassData.g:1:100: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 17 :
                // InternalClassData.g:1:113: RULE_TFLOAT
                {
                mRULE_TFLOAT(); 

                }
                break;
            case 18 :
                // InternalClassData.g:1:125: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 19 :
                // InternalClassData.g:1:138: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalClassData.g:1:146: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalClassData.g:1:155: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalClassData.g:1:167: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalClassData.g:1:183: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalClassData.g:1:199: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalClassData.g:1:207: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\6\uffff";
    static final String DFA25_minS =
        "\1\53\1\uffff\1\56\3\uffff";
    static final String DFA25_maxS =
        "\1\71\1\uffff\1\145\3\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2\1\4";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "921:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA38_eotS =
        "\1\uffff\3\33\3\uffff\3\33\3\uffff\1\51\2\33\1\30\1\54\1\30\1\uffff\3\30\2\uffff\2\33\1\uffff\3\33\3\uffff\3\33\5\uffff\2\33\1\uffff\1\54\4\uffff\20\33\1\114\1\33\1\116\6\33\1\125\1\uffff\1\33\1\uffff\1\116\1\127\3\33\1\133\1\uffff\1\134\1\uffff\1\33\1\136\1\137\2\uffff\1\33\2\uffff\1\141\1\uffff";
    static final String DFA38_eofS =
        "\142\uffff";
    static final String DFA38_minS =
        "\1\0\1\155\1\141\1\165\3\uffff\1\154\1\156\1\145\3\uffff\1\60\1\162\1\141\2\56\1\101\1\uffff\2\0\1\52\2\uffff\1\160\1\164\1\uffff\1\157\1\143\1\156\3\uffff\1\141\1\165\1\160\5\uffff\1\165\1\154\1\uffff\1\56\4\uffff\1\157\1\145\1\152\1\153\1\144\1\163\1\155\2\145\1\163\2\162\1\145\1\141\1\154\1\163\1\60\1\156\1\60\1\145\1\164\1\146\1\143\1\147\1\145\1\60\1\uffff\1\144\1\uffff\2\60\1\141\1\164\1\145\1\60\1\uffff\1\60\1\uffff\1\143\2\60\2\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA38_maxS =
        "\1\uffff\1\156\1\162\1\165\3\uffff\1\154\1\156\1\145\3\uffff\1\71\1\162\1\141\1\71\1\145\1\172\1\uffff\2\uffff\1\57\2\uffff\1\160\1\164\1\uffff\1\157\1\143\1\156\3\uffff\1\141\1\165\1\160\5\uffff\1\165\1\154\1\uffff\1\145\4\uffff\1\157\1\145\1\152\1\153\1\144\1\163\1\155\2\145\1\163\2\162\1\145\1\141\1\154\1\163\1\172\1\156\1\172\1\145\1\164\1\146\1\143\1\147\1\145\1\172\1\uffff\1\144\1\uffff\2\172\1\141\1\164\1\145\1\172\1\uffff\1\172\1\uffff\1\143\2\172\2\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA38_acceptS =
        "\4\uffff\1\4\1\6\1\7\3\uffff\1\14\1\15\1\16\6\uffff\1\23\3\uffff\1\30\1\31\2\uffff\1\23\3\uffff\1\4\1\6\1\7\3\uffff\1\14\1\15\1\16\1\21\1\17\2\uffff\1\22\1\uffff\1\25\1\26\1\27\1\30\32\uffff\1\12\1\uffff\1\20\6\uffff\1\10\1\uffff\1\1\3\uffff\1\3\1\13\1\uffff\1\2\1\5\1\uffff\1\11";
    static final String DFA38_specialS =
        "\1\2\23\uffff\1\1\1\0\114\uffff}>";
    static final String[] DFA38_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\1\12\1\14\1\30\1\20\1\13\1\20\1\15\1\26\12\21\3\30\1\4\3\30\32\23\3\30\1\22\1\23\1\30\1\23\1\3\1\7\1\11\1\10\1\17\2\23\1\1\6\23\1\2\3\23\1\16\6\23\1\5\1\30\1\6\uff82\30",
            "\1\31\1\32",
            "\1\35\20\uffff\1\34",
            "\1\36",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "\12\50",
            "\1\52",
            "\1\53",
            "\1\50\1\uffff\12\50",
            "\1\50\1\uffff\12\55\13\uffff\1\50\37\uffff\1\50",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "\1\50\1\uffff\12\55\13\uffff\1\50\37\uffff\1\50",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\115",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\126",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\135",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\140",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_BOOLEAN | RULE_TFLOAT | RULE_NATURAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_21 = input.LA(1);

                        s = -1;
                        if ( ((LA38_21>='\u0000' && LA38_21<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_20 = input.LA(1);

                        s = -1;
                        if ( ((LA38_20>='\u0000' && LA38_20<='\uFFFF')) ) {s = 46;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_0 = input.LA(1);

                        s = -1;
                        if ( (LA38_0=='i') ) {s = 1;}

                        else if ( (LA38_0=='p') ) {s = 2;}

                        else if ( (LA38_0=='b') ) {s = 3;}

                        else if ( (LA38_0=='=') ) {s = 4;}

                        else if ( (LA38_0=='{') ) {s = 5;}

                        else if ( (LA38_0=='}') ) {s = 6;}

                        else if ( (LA38_0=='c') ) {s = 7;}

                        else if ( (LA38_0=='e') ) {s = 8;}

                        else if ( (LA38_0=='d') ) {s = 9;}

                        else if ( (LA38_0=='(') ) {s = 10;}

                        else if ( (LA38_0==',') ) {s = 11;}

                        else if ( (LA38_0==')') ) {s = 12;}

                        else if ( (LA38_0=='.') ) {s = 13;}

                        else if ( (LA38_0=='t') ) {s = 14;}

                        else if ( (LA38_0=='f') ) {s = 15;}

                        else if ( (LA38_0=='+'||LA38_0=='-') ) {s = 16;}

                        else if ( ((LA38_0>='0' && LA38_0<='9')) ) {s = 17;}

                        else if ( (LA38_0=='^') ) {s = 18;}

                        else if ( ((LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||LA38_0=='a'||(LA38_0>='g' && LA38_0<='h')||(LA38_0>='j' && LA38_0<='o')||(LA38_0>='q' && LA38_0<='s')||(LA38_0>='u' && LA38_0<='z')) ) {s = 19;}

                        else if ( (LA38_0=='\"') ) {s = 20;}

                        else if ( (LA38_0=='\'') ) {s = 21;}

                        else if ( (LA38_0=='/') ) {s = 22;}

                        else if ( ((LA38_0>='\t' && LA38_0<='\n')||LA38_0=='\r'||LA38_0==' ') ) {s = 23;}

                        else if ( ((LA38_0>='\u0000' && LA38_0<='\b')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\u001F')||LA38_0=='!'||(LA38_0>='#' && LA38_0<='&')||LA38_0=='*'||(LA38_0>=':' && LA38_0<='<')||(LA38_0>='>' && LA38_0<='@')||(LA38_0>='[' && LA38_0<=']')||LA38_0=='`'||LA38_0=='|'||(LA38_0>='~' && LA38_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
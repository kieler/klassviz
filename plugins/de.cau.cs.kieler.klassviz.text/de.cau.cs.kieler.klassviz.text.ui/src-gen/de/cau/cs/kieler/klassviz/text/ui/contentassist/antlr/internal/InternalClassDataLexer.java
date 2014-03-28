package de.cau.cs.kieler.klassviz.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalClassDataLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=6;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_NATURAL=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_TFLOAT=4;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators

    public InternalClassDataLexer() {;} 
    public InternalClassDataLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalClassDataLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:11:7: ( 'type' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:11:9: 'type'
            {
            match("type"); 


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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:12:7: ( '{' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:12:9: '{'
            {
            match('{'); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:13:7: ( '}' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:13:9: '}'
            {
            match('}'); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:14:7: ( '(' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:14:9: '('
            {
            match('('); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:15:7: ( ')' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:15:9: ')'
            {
            match(')'); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:16:7: ( ',' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:16:9: ','
            {
            match(','); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:17:7: ( '.' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:14: ( ( 'true' | 'false' ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:16: ( 'true' | 'false' )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:16: ( 'true' | 'false' )
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1103:24: 'false'
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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:13: ( ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:16: ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:26: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
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
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:27: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            {
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:27: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:28: '0' .. '9'
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

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:39: ( '.' ( '0' .. '9' )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='.') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:40: '.' ( '0' .. '9' )*
                                    {
                                    match('.'); 
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:44: ( '0' .. '9' )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:45: '0' .. '9'
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

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:58: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='E'||LA7_0=='e') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:59: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                                    {
                                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:69: ( '+' | '-' )?
                                    int alt5=2;
                                    int LA5_0 = input.LA(1);

                                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                                        alt5=1;
                                    }
                                    switch (alt5) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:80: ( '0' .. '9' )+
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
                                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:81: '0' .. '9'
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
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:94: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            {
                            match('.'); 
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:98: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:99: '0' .. '9'
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

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:110: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='E'||LA11_0=='e') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:111: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                                    {
                                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}

                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:121: ( '+' | '-' )?
                                    int alt9=2;
                                    int LA9_0 = input.LA(1);

                                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                                        alt9=1;
                                    }
                                    switch (alt9) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:132: ( '0' .. '9' )+
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
                                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:133: '0' .. '9'
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:147: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:147: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:148: '0' .. '9'
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:163: ( '0' .. '9' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:164: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:175: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:176: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:186: ( '+' | '-' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='+'||LA15_0=='-') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:197: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:198: '0' .. '9'
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:211: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    match('.'); 
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:215: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:216: '0' .. '9'
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

                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:227: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:228: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:238: ( '+' | '-' )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0=='+'||LA19_0=='-') ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:249: ( '0' .. '9' )+
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
                            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:250: '0' .. '9'
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
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:263: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:263: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:264: '0' .. '9'
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

                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:285: ( '+' | '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='+'||LA23_0=='-') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:296: ( '0' .. '9' )+
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
                    	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1105:297: '0' .. '9'
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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:14: ( ( '0' .. '9' )+ )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:16: ( '0' .. '9' )+
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:16: ( '0' .. '9' )+
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
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1107:17: '0' .. '9'
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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1109:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1109:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1109:11: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='^') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1109:11: '^'
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

            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1109:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='\\') ) {
                    alt29=1;
                }
                else if ( ((LA29_0>='\u0000' && LA29_0<='!')||(LA29_0>='#' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1111:65: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop29;
                }
            } while (true);

            match('\"'); 

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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1113:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1113:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1113:24: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1113:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop31;
                }
            } while (true);

            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:40: ( ( '\\r' )? '\\n' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\n'||LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:41: ( '\\r' )? '\\n'
                    {
                    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:41: ( '\\r' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='\r') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1115:41: '\\r'
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
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1117:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1117:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1117:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_BOOLEAN | RULE_TFLOAT | RULE_NATURAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt35=15;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:52: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 9 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:65: RULE_TFLOAT
                {
                mRULE_TFLOAT(); 

                }
                break;
            case 10 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:77: RULE_NATURAL
                {
                mRULE_NATURAL(); 

                }
                break;
            case 11 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:90: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:98: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:110: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:126: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../de.cau.cs.kieler.klassviz.text.ui/src-gen/de/cau/cs/kieler/klassviz/text/ui/contentassist/antlr/internal/InternalClassData.g:1:142: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\6\uffff";
    static final String DFA25_minS =
        "\1\53\1\uffff\1\56\3\uffff";
    static final String DFA25_maxS =
        "\1\71\1\uffff\1\145\3\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\2";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "",
            "\1\5\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
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
            return "1105:15: ( ( '+' | '-' ) ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ) | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA35_eotS =
        "\1\uffff\1\13\5\uffff\1\21\1\13\1\uffff\1\23\4\uffff\2\13\1\uffff"+
        "\1\13\3\uffff\3\13\1\34\1\35\1\13\2\uffff\1\35";
    static final String DFA35_eofS =
        "\37\uffff";
    static final String DFA35_minS =
        "\1\11\1\162\5\uffff\1\60\1\141\1\uffff\1\56\2\uffff\1\52\1\uffff"+
        "\1\160\1\165\1\uffff\1\154\3\uffff\2\145\1\163\2\60\1\145\2\uffff"+
        "\1\60";
    static final String DFA35_maxS =
        "\1\175\1\171\5\uffff\1\71\1\141\1\uffff\1\145\2\uffff\1\57\1\uffff"+
        "\1\160\1\165\1\uffff\1\154\3\uffff\2\145\1\163\2\172\1\145\2\uffff"+
        "\1\172";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\1\uffff\1\13\1\14\1\uffff"+
        "\1\17\2\uffff\1\7\1\uffff\1\12\1\15\1\16\6\uffff\1\1\1\10\1\uffff";
    static final String DFA35_specialS =
        "\37\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\16\2\uffff\1\16\22\uffff\1\16\1\uffff\1\14\5\uffff\1\4\1"+
            "\5\1\uffff\1\11\1\6\1\11\1\7\1\15\12\12\7\uffff\32\13\3\uffff"+
            "\2\13\1\uffff\5\13\1\10\15\13\1\1\6\13\1\2\1\uffff\1\3",
            "\1\20\6\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "\12\11",
            "\1\22",
            "",
            "\1\11\1\uffff\12\12\13\uffff\1\11\37\uffff\1\11",
            "",
            "",
            "\1\24\4\uffff\1\25",
            "",
            "\1\26",
            "\1\27",
            "",
            "\1\30",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "\1\33",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\36",
            "",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_BOOLEAN | RULE_TFLOAT | RULE_NATURAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}
// $ANTLR 3.4 F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g 2013-06-09 23:03:31

package eu.reitmayer.schemagen.lang;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Stack;
import org.antlr.stringtemplate.StringTemplateGroup;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SchemaLangLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int AND=4;
    public static final int ATTR=5;
    public static final int BETWEEN=6;
    public static final int DOMAIN=7;
    public static final int Digit=8;
    public static final int ELEMENT=9;
    public static final int ENTITY=10;
    public static final int FROM=11;
    public static final int ID=12;
    public static final int INT=13;
    public static final int KEY=14;
    public static final int LENGTH=15;
    public static final int LINK=16;
    public static final int LTEXT=17;
    public static final int Letter=18;
    public static final int MANY=19;
    public static final int ML=20;
    public static final int MTEXT=21;
    public static final int NL=22;
    public static final int ONE=23;
    public static final int PRECISION=24;
    public static final int SCHEMA=25;
    public static final int SEMI=26;
    public static final int SET=27;
    public static final int SL=28;
    public static final int STEXT=29;
    public static final int STRING=30;
    public static final int TO=31;
    public static final int TYPE=32;
    public static final int TYPE_DATE=33;
    public static final int TYPE_INT=34;
    public static final int TYPE_NUMBER=35;
    public static final int TYPE_STRING=36;
    public static final int TYPE_TIMESTAMP=37;
    public static final int WS=38;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SchemaLangLexer() {} 
    public SchemaLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemaLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:15:7: ( '(' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:16:7: ( ')' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:17:7: ( ',' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:18:7: ( '=' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:136:4: ( ( ' ' | '\\t' | '\\f' )+ )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:137:3: ( ' ' | '\\t' | '\\f' )+
            {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:137:3: ( ' ' | '\\t' | '\\f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0=='\f'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:139:4: ( ( '\\r' '\\n' | '\\r' | '\\n' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:140:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:140:4: ( '\\r' '\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') ) {
                    alt2=1;
                }
                else {
                    alt2=2;
                }
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:140:5: '\\r' '\\n'
                    {
                    match('\r'); 

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:140:17: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:140:24: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "ML"
    public final void mML() throws RecognitionException {
        try {
            int _type = ML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:142:4: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:143:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:143:8: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:143:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:145:4: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
            {
            match("//"); 



            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:8: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:24: ( '\\n' | '\\r' ( '\\n' )? )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\r') ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:25: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:30: '\\r' ( '\\n' )?
                    {
                    match('\r'); 

                    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:34: ( '\\n' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\n') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:146:35: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:149:7: ( ( 'S' | 's' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:149:9: ( 'S' | 's' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "ATTR"
    public final void mATTR() throws RecognitionException {
        try {
            int _type = ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:151:5: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:151:7: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATTR"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:153:5: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:153:7: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:155:4: ( ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:155:6: ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "LENGTH"
    public final void mLENGTH() throws RecognitionException {
        try {
            int _type = LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:157:7: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:157:9: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LENGTH"

    // $ANTLR start "PRECISION"
    public final void mPRECISION() throws RecognitionException {
        try {
            int _type = PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:159:10: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:159:12: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRECISION"

    // $ANTLR start "ENTITY"
    public final void mENTITY() throws RecognitionException {
        try {
            int _type = ENTITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:161:7: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:161:9: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENTITY"

    // $ANTLR start "DOMAIN"
    public final void mDOMAIN() throws RecognitionException {
        try {
            int _type = DOMAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:163:7: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:163:9: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOMAIN"

    // $ANTLR start "ELEMENT"
    public final void mELEMENT() throws RecognitionException {
        try {
            int _type = ELEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:165:8: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:165:10: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELEMENT"

    // $ANTLR start "MTEXT"
    public final void mMTEXT() throws RecognitionException {
        try {
            int _type = MTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:167:6: ( ( 'M' | 'm' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:167:8: ( 'M' | 'm' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MTEXT"

    // $ANTLR start "LTEXT"
    public final void mLTEXT() throws RecognitionException {
        try {
            int _type = LTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:169:6: ( ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:169:8: ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTEXT"

    // $ANTLR start "STEXT"
    public final void mSTEXT() throws RecognitionException {
        try {
            int _type = STEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:171:6: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:171:8: ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STEXT"

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:173:9: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:173:11: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "TYPE_DATE"
    public final void mTYPE_DATE() throws RecognitionException {
        try {
            int _type = TYPE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:175:10: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:175:12: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_DATE"

    // $ANTLR start "TYPE_TIMESTAMP"
    public final void mTYPE_TIMESTAMP() throws RecognitionException {
        try {
            int _type = TYPE_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:177:15: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:177:17: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_TIMESTAMP"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:179:4: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:179:6: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "TYPE_STRING"
    public final void mTYPE_STRING() throws RecognitionException {
        try {
            int _type = TYPE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:181:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:181:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_STRING"

    // $ANTLR start "TYPE_NUMBER"
    public final void mTYPE_NUMBER() throws RecognitionException {
        try {
            int _type = TYPE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:183:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:183:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_NUMBER"

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:185:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:185:6: ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ONE"

    // $ANTLR start "MANY"
    public final void mMANY() throws RecognitionException {
        try {
            int _type = MANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:187:5: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:187:7: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MANY"

    // $ANTLR start "LINK"
    public final void mLINK() throws RecognitionException {
        try {
            int _type = LINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:189:5: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:189:7: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINK"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:191:5: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:191:7: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:193:3: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:193:5: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:195:4: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:195:6: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:197:8: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:197:10: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:202:8: ( 'a' .. 'z' | 'A' .. 'Z' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:207:7: ( '0' .. '9' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:209:4: ( Letter ( Letter | Digit | '_' )* )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:210:3: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:210:10: ( Letter | Digit | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:212:5: ( ';' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:212:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:216:8: ( '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:217:3: '\"' (~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 

            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:217:7: (~ ( '\"' | '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:220:5: ( Digit ( Digit )* )
            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:221:3: Digit ( Digit )*
            {
            mDigit(); 


            // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:221:9: ( Digit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    public void mTokens() throws RecognitionException {
        // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:8: ( T__39 | T__40 | T__41 | T__42 | WS | NL | ML | SL | SCHEMA | ATTR | TYPE | KEY | LENGTH | PRECISION | ENTITY | DOMAIN | ELEMENT | MTEXT | LTEXT | STEXT | TYPE_INT | TYPE_DATE | TYPE_TIMESTAMP | SET | TYPE_STRING | TYPE_NUMBER | ONE | MANY | LINK | FROM | TO | AND | BETWEEN | ID | SEMI | STRING | INT )
        int alt10=37;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:10: T__39
                {
                mT__39(); 


                }
                break;
            case 2 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:16: T__40
                {
                mT__40(); 


                }
                break;
            case 3 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:22: T__41
                {
                mT__41(); 


                }
                break;
            case 4 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:28: T__42
                {
                mT__42(); 


                }
                break;
            case 5 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:34: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:37: NL
                {
                mNL(); 


                }
                break;
            case 7 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:40: ML
                {
                mML(); 


                }
                break;
            case 8 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:43: SL
                {
                mSL(); 


                }
                break;
            case 9 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:46: SCHEMA
                {
                mSCHEMA(); 


                }
                break;
            case 10 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:53: ATTR
                {
                mATTR(); 


                }
                break;
            case 11 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:58: TYPE
                {
                mTYPE(); 


                }
                break;
            case 12 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:63: KEY
                {
                mKEY(); 


                }
                break;
            case 13 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:67: LENGTH
                {
                mLENGTH(); 


                }
                break;
            case 14 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:74: PRECISION
                {
                mPRECISION(); 


                }
                break;
            case 15 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:84: ENTITY
                {
                mENTITY(); 


                }
                break;
            case 16 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:91: DOMAIN
                {
                mDOMAIN(); 


                }
                break;
            case 17 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:98: ELEMENT
                {
                mELEMENT(); 


                }
                break;
            case 18 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:106: MTEXT
                {
                mMTEXT(); 


                }
                break;
            case 19 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:112: LTEXT
                {
                mLTEXT(); 


                }
                break;
            case 20 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:118: STEXT
                {
                mSTEXT(); 


                }
                break;
            case 21 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:124: TYPE_INT
                {
                mTYPE_INT(); 


                }
                break;
            case 22 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:133: TYPE_DATE
                {
                mTYPE_DATE(); 


                }
                break;
            case 23 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:143: TYPE_TIMESTAMP
                {
                mTYPE_TIMESTAMP(); 


                }
                break;
            case 24 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:158: SET
                {
                mSET(); 


                }
                break;
            case 25 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:162: TYPE_STRING
                {
                mTYPE_STRING(); 


                }
                break;
            case 26 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:174: TYPE_NUMBER
                {
                mTYPE_NUMBER(); 


                }
                break;
            case 27 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:186: ONE
                {
                mONE(); 


                }
                break;
            case 28 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:190: MANY
                {
                mMANY(); 


                }
                break;
            case 29 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:195: LINK
                {
                mLINK(); 


                }
                break;
            case 30 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:200: FROM
                {
                mFROM(); 


                }
                break;
            case 31 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:205: TO
                {
                mTO(); 


                }
                break;
            case 32 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:208: AND
                {
                mAND(); 


                }
                break;
            case 33 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:212: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 34 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:220: ID
                {
                mID(); 


                }
                break;
            case 35 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:223: SEMI
                {
                mSEMI(); 


                }
                break;
            case 36 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:228: STRING
                {
                mSTRING(); 


                }
                break;
            case 37 :
                // F:\\usr\\franz\\data\\workspace\\SchemaGenerator\\src\\eu\\reitmayer\\schemagen\\lang\\SchemaLang.g:1:235: INT
                {
                mINT(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\10\uffff\16\26\6\uffff\7\26\1\74\23\26\1\120\1\26\1\122\2\26\1"+
        "\uffff\1\125\12\26\1\140\1\26\1\142\5\26\1\uffff\1\150\1\uffff\1"+
        "\151\1\26\1\uffff\2\26\1\155\4\26\1\162\1\26\1\164\1\uffff\1\26"+
        "\1\uffff\1\166\2\26\1\171\1\26\2\uffff\2\26\1\175\1\uffff\4\26\1"+
        "\uffff\1\u0082\1\uffff\1\26\1\uffff\1\26\1\u0085\1\uffff\1\u0086"+
        "\1\26\1\u0088\1\uffff\1\26\1\u008a\1\26\1\u008c\1\uffff\1\u008d"+
        "\1\26\2\uffff\1\26\1\uffff\1\26\1\uffff\1\u0091\2\uffff\1\u0092"+
        "\2\26\2\uffff\1\u0095\1\u0096\2\uffff";
    static final String DFA10_eofS =
        "\u0097\uffff";
    static final String DFA10_minS =
        "\1\11\6\uffff\1\52\1\103\1\116\1\111\2\105\1\122\1\114\2\101\1\116"+
        "\1\125\1\116\1\122\1\105\6\uffff\1\110\1\105\2\124\1\104\1\120\1"+
        "\115\1\60\1\131\1\116\1\105\1\116\1\105\1\124\1\105\1\115\1\124"+
        "\1\105\1\116\1\124\1\115\1\105\1\117\1\124\1\105\1\130\1\111\1\60"+
        "\1\122\1\60\2\105\1\uffff\1\60\1\107\1\130\1\113\1\103\1\111\1\115"+
        "\1\101\1\105\1\130\1\131\1\60\1\102\1\60\1\115\1\127\1\115\1\124"+
        "\1\116\1\uffff\1\60\1\uffff\1\60\1\123\1\uffff\2\124\1\60\1\111"+
        "\1\124\1\105\1\111\1\60\1\124\1\60\1\uffff\1\105\1\uffff\1\60\1"+
        "\105\1\101\1\60\1\107\2\uffff\1\124\1\110\1\60\1\uffff\1\123\1\131"+
        "\2\116\1\uffff\1\60\1\uffff\1\122\1\uffff\1\105\1\60\1\uffff\1\60"+
        "\1\101\1\60\1\uffff\1\111\1\60\1\124\1\60\1\uffff\1\60\1\116\2\uffff"+
        "\1\115\1\uffff\1\117\1\uffff\1\60\2\uffff\1\60\1\120\1\116\2\uffff"+
        "\2\60\2\uffff";
    static final String DFA10_maxS =
        "\1\172\6\uffff\1\57\2\164\1\171\1\145\1\164\1\162\1\156\1\157\1"+
        "\164\1\156\1\165\1\156\1\162\1\145\6\uffff\1\150\1\162\2\164\1\144"+
        "\1\160\1\155\1\172\1\171\1\156\1\145\1\156\1\145\1\164\1\145\1\155"+
        "\1\164\1\145\1\156\1\164\1\155\1\145\1\157\1\164\1\145\1\170\1\151"+
        "\1\172\1\162\1\172\2\145\1\uffff\1\172\1\147\1\170\1\153\1\143\1"+
        "\151\1\155\1\141\1\145\1\170\1\171\1\172\1\142\1\172\1\155\1\167"+
        "\1\155\1\164\1\156\1\uffff\1\172\1\uffff\1\172\1\163\1\uffff\2\164"+
        "\1\172\1\151\1\164\1\145\1\151\1\172\1\164\1\172\1\uffff\1\145\1"+
        "\uffff\1\172\1\145\1\141\1\172\1\147\2\uffff\1\164\1\150\1\172\1"+
        "\uffff\1\163\1\171\2\156\1\uffff\1\172\1\uffff\1\162\1\uffff\1\145"+
        "\1\172\1\uffff\1\172\1\141\1\172\1\uffff\1\151\1\172\1\164\1\172"+
        "\1\uffff\1\172\1\156\2\uffff\1\155\1\uffff\1\157\1\uffff\1\172\2"+
        "\uffff\1\172\1\160\1\156\2\uffff\2\172\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\17\uffff\1\42\1\43\1\44\1\45\1"+
        "\7\1\10\40\uffff\1\37\23\uffff\1\30\1\uffff\1\40\2\uffff\1\14\12"+
        "\uffff\1\25\1\uffff\1\33\5\uffff\1\12\1\13\3\uffff\1\35\4\uffff"+
        "\1\26\1\uffff\1\34\1\uffff\1\36\2\uffff\1\24\3\uffff\1\23\4\uffff"+
        "\1\22\2\uffff\1\11\1\31\1\uffff\1\15\1\uffff\1\17\1\uffff\1\20\1"+
        "\32\3\uffff\1\21\1\41\2\uffff\1\27\1\16";
    static final String DFA10_specialS =
        "\u0097\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\1\6\1\uffff\1\5\1\6\22\uffff\1\5\1\uffff\1\30\5\uffff\1"+
            "\1\1\2\2\uffff\1\3\2\uffff\1\7\12\31\1\uffff\1\27\1\uffff\1"+
            "\4\3\uffff\1\11\1\25\1\26\1\17\1\16\1\24\2\26\1\21\1\26\1\13"+
            "\1\14\1\20\1\22\1\23\1\15\2\26\1\10\1\12\6\26\6\uffff\1\11\1"+
            "\25\1\26\1\17\1\16\1\24\2\26\1\21\1\26\1\13\1\14\1\20\1\22\1"+
            "\23\1\15\2\26\1\10\1\12\6\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32\4\uffff\1\33",
            "\1\34\1\uffff\1\36\16\uffff\1\35\16\uffff\1\34\1\uffff\1\36"+
            "\16\uffff\1\35",
            "\1\40\5\uffff\1\37\31\uffff\1\40\5\uffff\1\37",
            "\1\42\5\uffff\1\43\11\uffff\1\41\17\uffff\1\42\5\uffff\1\43"+
            "\11\uffff\1\41",
            "\1\44\37\uffff\1\44",
            "\1\45\3\uffff\1\47\12\uffff\1\46\20\uffff\1\45\3\uffff\1\47"+
            "\12\uffff\1\46",
            "\1\50\37\uffff\1\50",
            "\1\52\1\uffff\1\51\35\uffff\1\52\1\uffff\1\51",
            "\1\54\15\uffff\1\53\21\uffff\1\54\15\uffff\1\53",
            "\1\56\22\uffff\1\55\14\uffff\1\56\22\uffff\1\55",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\37\uffff\1\64",
            "\1\65\14\uffff\1\66\22\uffff\1\65\14\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\121\37\uffff\1\121",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\123\37\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\130\37\uffff\1\130",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\1\137\37\uffff\1\137",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\141\37\uffff\1\141",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\37\uffff\1\147",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\152\37\uffff\1\152",
            "",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\1\161\37\uffff\1\161",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\163\37\uffff\1\163",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\165\37\uffff\1\165",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\172\37\uffff\1\172",
            "",
            "",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0083\37\uffff\1\u0083",
            "",
            "\1\u0084\37\uffff\1\u0084",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0087\37\uffff\1\u0087",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0089\37\uffff\1\u0089",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008b\37\uffff\1\u008b",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008e\37\uffff\1\u008e",
            "",
            "",
            "\1\u008f\37\uffff\1\u008f",
            "",
            "\1\u0090\37\uffff\1\u0090",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | WS | NL | ML | SL | SCHEMA | ATTR | TYPE | KEY | LENGTH | PRECISION | ENTITY | DOMAIN | ELEMENT | MTEXT | LTEXT | STEXT | TYPE_INT | TYPE_DATE | TYPE_TIMESTAMP | SET | TYPE_STRING | TYPE_NUMBER | ONE | MANY | LINK | FROM | TO | AND | BETWEEN | ID | SEMI | STRING | INT );";
        }
    }
 

}
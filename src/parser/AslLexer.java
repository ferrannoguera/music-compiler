// $ANTLR 3.4 /home2/users/alumnes/1184002/Asl/src/parser/Asl.g 2017-05-26 17:54:22

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARMOR=6;
    public static final int ASSIGN=7;
    public static final int BEAT=8;
    public static final int BECUADRO=9;
    public static final int BEMOL=10;
    public static final int BOOLEAN=11;
    public static final int CHORUS=12;
    public static final int COMBO=13;
    public static final int COMMENT=14;
    public static final int DEQUAL=15;
    public static final int DIV=16;
    public static final int DMINUS=17;
    public static final int DO=18;
    public static final int DPLUS=19;
    public static final int ELSE=20;
    public static final int EQUAL=21;
    public static final int ESC_SEQ=22;
    public static final int FA=23;
    public static final int FALL=24;
    public static final int FALSE=25;
    public static final int FCONDS=26;
    public static final int FLAUTA=27;
    public static final int FOR=28;
    public static final int FUNC=29;
    public static final int FUNCALL=30;
    public static final int GE=31;
    public static final int GT=32;
    public static final int HALF=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int INT=36;
    public static final int LA=37;
    public static final int LE=38;
    public static final int LIST_FUNCTIONS=39;
    public static final int LIST_INSTR=40;
    public static final int LNOTAS=41;
    public static final int LT=42;
    public static final int MEQUAL=43;
    public static final int MI=44;
    public static final int MINUS=45;
    public static final int MOD=46;
    public static final int MUL=47;
    public static final int MULTINOTA=48;
    public static final int NOT=49;
    public static final int NOT_EQUAL=50;
    public static final int NURAN=51;
    public static final int OCT=52;
    public static final int OR=53;
    public static final int PARAMS=54;
    public static final int PARTITURA=55;
    public static final int PEQUAL=56;
    public static final int PIANO=57;
    public static final int PLUS=58;
    public static final int PREF=59;
    public static final int PVALUE=60;
    public static final int QUIET=61;
    public static final int RAISE=62;
    public static final int RE=63;
    public static final int READ=64;
    public static final int REPEAT=65;
    public static final int REQUAL=66;
    public static final int RETURN=67;
    public static final int SI=68;
    public static final int SOL=69;
    public static final int SOSTENIDO=70;
    public static final int SPEED=71;
    public static final int STRING=72;
    public static final int TRANSPORT=73;
    public static final int TRI=74;
    public static final int TRUE=75;
    public static final int TWICE=76;
    public static final int VOICE=77;
    public static final int WHILE=78;
    public static final int WRITE=79;
    public static final int WS=80;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home2/users/alumnes/1184002/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:10:7: ( '.' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:11:7: ( ':' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:12:7: ( ':||' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:12:9: ':||'
            {
            match(":||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:13:7: ( ';' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:13:9: ';'
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:14:7: ( '[' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:15:7: ( ']' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:16:7: ( 'b' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:16:9: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:17:7: ( 'b*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:17:9: 'b*'
            {
            match("b*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:18:7: ( 'c' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:18:9: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:19:7: ( 'c*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:19:9: 'c*'
            {
            match("c*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:20:7: ( 'f' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:20:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:21:7: ( 'f*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:21:9: 'f*'
            {
            match("f*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:22:7: ( 'n' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:22:9: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:23:7: ( 'n*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:23:9: 'n*'
            {
            match("n*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:24:7: ( 'r' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:24:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:25:8: ( 'r*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:25:10: 'r*'
            {
            match("r*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:26:8: ( 'sc' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:26:10: 'sc'
            {
            match("sc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:27:8: ( 'sc*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:27:10: 'sc*'
            {
            match("sc*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:28:8: ( 'sf' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:28:10: 'sf'
            {
            match("sf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:29:8: ( 'sf*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:29:10: 'sf*'
            {
            match("sf*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:30:8: ( 'z||:' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:30:10: 'z||:'
            {
            match("z||:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:31:8: ( '{' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:31:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:32:8: ( '|' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:32:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:33:8: ( '}' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:33:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:34:8: ( '~' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:34:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "BEMOL"
    public final void mBEMOL() throws RecognitionException {
        try {
            int _type = BEMOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:249:7: ( '$' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:249:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEMOL"

    // $ANTLR start "SOSTENIDO"
    public final void mSOSTENIDO() throws RecognitionException {
        try {
            int _type = SOSTENIDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:250:11: ( '#' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:250:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOSTENIDO"

    // $ANTLR start "BECUADRO"
    public final void mBECUADRO() throws RecognitionException {
        try {
            int _type = BECUADRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:251:10: ( '¬' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:251:12: '¬'
            {
            match('\u00AC'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BECUADRO"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:252:5: ( 'for' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:252:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:253:4: ( 'Do' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:253:6: 'Do'
            {
            match("Do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "RE"
    public final void mRE() throws RecognitionException {
        try {
            int _type = RE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:254:4: ( 'Re' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:254:6: 'Re'
            {
            match("Re"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RE"

    // $ANTLR start "MI"
    public final void mMI() throws RecognitionException {
        try {
            int _type = MI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:255:4: ( 'Mi' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:255:6: 'Mi'
            {
            match("Mi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MI"

    // $ANTLR start "FA"
    public final void mFA() throws RecognitionException {
        try {
            int _type = FA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:256:4: ( 'Fa' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:256:6: 'Fa'
            {
            match("Fa"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FA"

    // $ANTLR start "SOL"
    public final void mSOL() throws RecognitionException {
        try {
            int _type = SOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:257:5: ( 'Sol' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:257:7: 'Sol'
            {
            match("Sol"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOL"

    // $ANTLR start "LA"
    public final void mLA() throws RecognitionException {
        try {
            int _type = LA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:258:4: ( 'La' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:258:6: 'La'
            {
            match("La"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LA"

    // $ANTLR start "SI"
    public final void mSI() throws RecognitionException {
        try {
            int _type = SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:259:4: ( 'Si' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:259:6: 'Si'
            {
            match("Si"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SI"

    // $ANTLR start "QUIET"
    public final void mQUIET() throws RecognitionException {
        try {
            int _type = QUIET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:260:7: ( 'Quiet' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:260:9: 'Quiet'
            {
            match("Quiet"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUIET"

    // $ANTLR start "ARMOR"
    public final void mARMOR() throws RecognitionException {
        try {
            int _type = ARMOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:261:7: ( 'Armor' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:261:9: 'Armor'
            {
            match("Armor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARMOR"

    // $ANTLR start "BEAT"
    public final void mBEAT() throws RecognitionException {
        try {
            int _type = BEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:262:6: ( 'Beat' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:262:8: 'Beat'
            {
            match("Beat"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEAT"

    // $ANTLR start "SPEED"
    public final void mSPEED() throws RecognitionException {
        try {
            int _type = SPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:263:7: ( 'Speed' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:263:9: 'Speed'
            {
            match("Speed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPEED"

    // $ANTLR start "CHORUS"
    public final void mCHORUS() throws RecognitionException {
        try {
            int _type = CHORUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:264:8: ( 'Chorus' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:264:10: 'Chorus'
            {
            match("Chorus"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHORUS"

    // $ANTLR start "VOICE"
    public final void mVOICE() throws RecognitionException {
        try {
            int _type = VOICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:265:7: ( 'Voice' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:265:9: 'Voice'
            {
            match("Voice"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOICE"

    // $ANTLR start "PIANO"
    public final void mPIANO() throws RecognitionException {
        try {
            int _type = PIANO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:266:7: ( 'Piano' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:266:9: 'Piano'
            {
            match("Piano"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIANO"

    // $ANTLR start "FLAUTA"
    public final void mFLAUTA() throws RecognitionException {
        try {
            int _type = FLAUTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:267:8: ( 'Flauta' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:267:10: 'Flauta'
            {
            match("Flauta"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLAUTA"

    // $ANTLR start "TWICE"
    public final void mTWICE() throws RecognitionException {
        try {
            int _type = TWICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:268:7: ( 'Twice' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:268:9: 'Twice'
            {
            match("Twice"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TWICE"

    // $ANTLR start "HALF"
    public final void mHALF() throws RecognitionException {
        try {
            int _type = HALF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:269:6: ( 'Half' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:269:8: 'Half'
            {
            match("Half"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HALF"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:270:7: ( 'Raise' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:270:9: 'Raise'
            {
            match("Raise"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "FALL"
    public final void mFALL() throws RecognitionException {
        try {
            int _type = FALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:271:6: ( 'Fall' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:271:8: 'Fall'
            {
            match("Fall"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALL"

    // $ANTLR start "PEQUAL"
    public final void mPEQUAL() throws RecognitionException {
        try {
            int _type = PEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:272:8: ( '+=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:272:10: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PEQUAL"

    // $ANTLR start "REQUAL"
    public final void mREQUAL() throws RecognitionException {
        try {
            int _type = REQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:273:8: ( '-=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:273:10: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REQUAL"

    // $ANTLR start "MEQUAL"
    public final void mMEQUAL() throws RecognitionException {
        try {
            int _type = MEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:274:8: ( '*=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:274:10: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MEQUAL"

    // $ANTLR start "DEQUAL"
    public final void mDEQUAL() throws RecognitionException {
        try {
            int _type = DEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:275:8: ( '/=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:275:10: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEQUAL"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:276:7: ( '=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:276:9: '='
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
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:277:10: ( '!=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:277:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:278:8: ( '<' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:278:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:279:8: ( '<=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:279:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:280:8: ( '>' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:280:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:281:8: ( '>=' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:281:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "DPLUS"
    public final void mDPLUS() throws RecognitionException {
        try {
            int _type = DPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:282:7: ( '++' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:282:8: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DPLUS"

    // $ANTLR start "DMINUS"
    public final void mDMINUS() throws RecognitionException {
        try {
            int _type = DMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:283:8: ( '--' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:283:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DMINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:284:6: ( '+' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:284:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:285:7: ( '-' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:285:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:286:9: ( '*' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:286:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:287:9: ( '/' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:287:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:288:9: ( '%' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:288:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:289:9: ( 'not' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:289:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:290:9: ( 'and' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:290:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:291:8: ( 'or' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:291:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:292:6: ( 'if' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:292:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:293:6: ( 'else' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:293:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:294:7: ( 'while' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:294:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:295:6: ( 'func' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:295:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:296:8: ( 'return' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:296:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:297:6: ( 'read' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:297:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:298:7: ( 'write' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:298:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:299:9: ( 'true' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:299:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:300:9: ( 'false' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:300:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRANSPORT"
    public final void mTRANSPORT() throws RecognitionException {
        try {
            int _type = TRANSPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:301:10: ( 'Transport' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:301:12: 'Transport'
            {
            match("Transport"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSPORT"

    // $ANTLR start "OCT"
    public final void mOCT() throws RecognitionException {
        try {
            int _type = OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:302:5: ( '0' .. '8' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '8') ) {
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
    // $ANTLR end "OCT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:303:6: ( ( '0' .. '9' )+ )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:303:8: ( '0' .. '9' )+
            {
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:303:8: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:304:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:304:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:304:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop2;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:309:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:309:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:309:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:309:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:309:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:310:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:310:13: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:310:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:314:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:314:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:314:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:314:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:314:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:320:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:320:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:323:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:323:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:8: ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | BEMOL | SOSTENIDO | BECUADRO | FOR | DO | RE | MI | FA | SOL | LA | SI | QUIET | ARMOR | BEAT | SPEED | CHORUS | VOICE | PIANO | FLAUTA | TWICE | HALF | RAISE | FALL | PEQUAL | REQUAL | MEQUAL | DEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | DPLUS | DMINUS | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FUNC | RETURN | READ | WRITE | TRUE | FALSE | TRANSPORT | OCT | INT | ID | COMMENT | STRING | WS )
        int alt8=88;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:10: T__81
                {
                mT__81(); 


                }
                break;
            case 2 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:16: T__82
                {
                mT__82(); 


                }
                break;
            case 3 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:22: T__83
                {
                mT__83(); 


                }
                break;
            case 4 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:28: T__84
                {
                mT__84(); 


                }
                break;
            case 5 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:34: T__85
                {
                mT__85(); 


                }
                break;
            case 6 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:40: T__86
                {
                mT__86(); 


                }
                break;
            case 7 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:46: T__87
                {
                mT__87(); 


                }
                break;
            case 8 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:52: T__88
                {
                mT__88(); 


                }
                break;
            case 9 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:58: T__89
                {
                mT__89(); 


                }
                break;
            case 10 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:64: T__90
                {
                mT__90(); 


                }
                break;
            case 11 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:70: T__91
                {
                mT__91(); 


                }
                break;
            case 12 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:76: T__92
                {
                mT__92(); 


                }
                break;
            case 13 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:82: T__93
                {
                mT__93(); 


                }
                break;
            case 14 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:88: T__94
                {
                mT__94(); 


                }
                break;
            case 15 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:94: T__95
                {
                mT__95(); 


                }
                break;
            case 16 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:100: T__96
                {
                mT__96(); 


                }
                break;
            case 17 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:106: T__97
                {
                mT__97(); 


                }
                break;
            case 18 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:112: T__98
                {
                mT__98(); 


                }
                break;
            case 19 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:118: T__99
                {
                mT__99(); 


                }
                break;
            case 20 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:124: T__100
                {
                mT__100(); 


                }
                break;
            case 21 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:131: T__101
                {
                mT__101(); 


                }
                break;
            case 22 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:138: T__102
                {
                mT__102(); 


                }
                break;
            case 23 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:145: T__103
                {
                mT__103(); 


                }
                break;
            case 24 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:152: T__104
                {
                mT__104(); 


                }
                break;
            case 25 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:159: T__105
                {
                mT__105(); 


                }
                break;
            case 26 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:166: T__106
                {
                mT__106(); 


                }
                break;
            case 27 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:173: T__107
                {
                mT__107(); 


                }
                break;
            case 28 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:180: T__108
                {
                mT__108(); 


                }
                break;
            case 29 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:187: T__109
                {
                mT__109(); 


                }
                break;
            case 30 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:194: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 31 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:200: SOSTENIDO
                {
                mSOSTENIDO(); 


                }
                break;
            case 32 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:210: BECUADRO
                {
                mBECUADRO(); 


                }
                break;
            case 33 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:219: FOR
                {
                mFOR(); 


                }
                break;
            case 34 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:223: DO
                {
                mDO(); 


                }
                break;
            case 35 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:226: RE
                {
                mRE(); 


                }
                break;
            case 36 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:229: MI
                {
                mMI(); 


                }
                break;
            case 37 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:232: FA
                {
                mFA(); 


                }
                break;
            case 38 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:235: SOL
                {
                mSOL(); 


                }
                break;
            case 39 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:239: LA
                {
                mLA(); 


                }
                break;
            case 40 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:242: SI
                {
                mSI(); 


                }
                break;
            case 41 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:245: QUIET
                {
                mQUIET(); 


                }
                break;
            case 42 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:251: ARMOR
                {
                mARMOR(); 


                }
                break;
            case 43 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:257: BEAT
                {
                mBEAT(); 


                }
                break;
            case 44 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:262: SPEED
                {
                mSPEED(); 


                }
                break;
            case 45 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:268: CHORUS
                {
                mCHORUS(); 


                }
                break;
            case 46 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:275: VOICE
                {
                mVOICE(); 


                }
                break;
            case 47 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:281: PIANO
                {
                mPIANO(); 


                }
                break;
            case 48 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:287: FLAUTA
                {
                mFLAUTA(); 


                }
                break;
            case 49 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:294: TWICE
                {
                mTWICE(); 


                }
                break;
            case 50 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:300: HALF
                {
                mHALF(); 


                }
                break;
            case 51 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:305: RAISE
                {
                mRAISE(); 


                }
                break;
            case 52 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:311: FALL
                {
                mFALL(); 


                }
                break;
            case 53 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:316: PEQUAL
                {
                mPEQUAL(); 


                }
                break;
            case 54 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:323: REQUAL
                {
                mREQUAL(); 


                }
                break;
            case 55 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:330: MEQUAL
                {
                mMEQUAL(); 


                }
                break;
            case 56 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:337: DEQUAL
                {
                mDEQUAL(); 


                }
                break;
            case 57 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:344: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 58 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:350: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 59 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:360: LT
                {
                mLT(); 


                }
                break;
            case 60 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:363: LE
                {
                mLE(); 


                }
                break;
            case 61 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:366: GT
                {
                mGT(); 


                }
                break;
            case 62 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:369: GE
                {
                mGE(); 


                }
                break;
            case 63 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:372: DPLUS
                {
                mDPLUS(); 


                }
                break;
            case 64 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:378: DMINUS
                {
                mDMINUS(); 


                }
                break;
            case 65 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:385: PLUS
                {
                mPLUS(); 


                }
                break;
            case 66 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:390: MINUS
                {
                mMINUS(); 


                }
                break;
            case 67 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:396: MUL
                {
                mMUL(); 


                }
                break;
            case 68 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:400: DIV
                {
                mDIV(); 


                }
                break;
            case 69 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:404: MOD
                {
                mMOD(); 


                }
                break;
            case 70 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:408: NOT
                {
                mNOT(); 


                }
                break;
            case 71 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:412: AND
                {
                mAND(); 


                }
                break;
            case 72 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:416: OR
                {
                mOR(); 


                }
                break;
            case 73 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:419: IF
                {
                mIF(); 


                }
                break;
            case 74 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:422: ELSE
                {
                mELSE(); 


                }
                break;
            case 75 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:427: WHILE
                {
                mWHILE(); 


                }
                break;
            case 76 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:433: FUNC
                {
                mFUNC(); 


                }
                break;
            case 77 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:438: RETURN
                {
                mRETURN(); 


                }
                break;
            case 78 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:445: READ
                {
                mREAD(); 


                }
                break;
            case 79 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:450: WRITE
                {
                mWRITE(); 


                }
                break;
            case 80 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:456: TRUE
                {
                mTRUE(); 


                }
                break;
            case 81 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:461: FALSE
                {
                mFALSE(); 


                }
                break;
            case 82 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:467: TRANSPORT
                {
                mTRANSPORT(); 


                }
                break;
            case 83 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:477: OCT
                {
                mOCT(); 


                }
                break;
            case 84 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:481: INT
                {
                mINT(); 


                }
                break;
            case 85 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:485: ID
                {
                mID(); 


                }
                break;
            case 86 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:488: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 87 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:496: STRING
                {
                mSTRING(); 


                }
                break;
            case 88 :
                // /home2/users/alumnes/1184002/Asl/src/parser/Asl.g:1:503: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\6\uffff\1\73\3\uffff\1\75\1\77\1\104\1\107\1\112\2\67\7\uffff\16"+
        "\67\1\143\1\146\1\150\1\153\2\uffff\1\155\1\157\1\uffff\6\67\1\167"+
        "\13\uffff\3\67\2\uffff\1\67\2\uffff\1\67\1\uffff\1\177\1\u0081\1"+
        "\uffff\1\u0082\1\u0083\1\67\1\u0085\1\u0087\2\67\1\u008a\1\67\1"+
        "\u008c\11\67\17\uffff\1\67\1\u0097\1\u0098\4\67\1\uffff\1\u009d"+
        "\2\67\1\u00a0\2\67\6\uffff\1\67\1\uffff\1\67\1\uffff\1\67\1\u00a6"+
        "\1\uffff\1\67\1\uffff\11\67\1\u00b1\2\uffff\4\67\1\uffff\1\u00b6"+
        "\1\67\1\uffff\1\67\1\u00b9\1\67\1\u00bb\1\67\1\uffff\3\67\1\u00c0"+
        "\5\67\1\u00c6\1\uffff\1\u00c7\2\67\1\u00ca\1\uffff\1\u00cb\1\67"+
        "\1\uffff\1\u00cd\1\uffff\1\67\1\u00cf\1\u00d0\1\u00d1\1\uffff\1"+
        "\67\1\u00d3\1\u00d4\1\u00d5\1\67\2\uffff\1\u00d7\1\u00d8\2\uffff"+
        "\1\u00d9\1\uffff\1\u00da\3\uffff\1\u00db\3\uffff\1\67\5\uffff\2"+
        "\67\1\u00df\1\uffff";
    static final String DFA8_eofS =
        "\u00e0\uffff";
    static final String DFA8_minS =
        "\1\11\5\uffff\1\174\3\uffff\5\52\1\143\1\174\7\uffff\1\157\1\141"+
        "\1\151\1\141\1\151\1\141\1\165\1\162\1\145\1\150\1\157\1\151\1\162"+
        "\1\141\1\53\1\55\1\75\1\52\2\uffff\2\75\1\uffff\1\156\1\162\1\146"+
        "\1\154\1\150\1\162\1\60\13\uffff\1\162\1\156\1\154\2\uffff\1\164"+
        "\2\uffff\1\141\1\uffff\2\52\1\uffff\2\101\1\151\2\101\1\141\1\154"+
        "\1\101\1\145\1\101\1\151\1\155\1\141\1\157\1\151\1\141\1\151\1\141"+
        "\1\154\17\uffff\1\144\2\101\1\163\2\151\1\165\1\uffff\1\101\1\143"+
        "\1\163\1\101\1\165\1\144\6\uffff\1\163\1\uffff\1\154\1\uffff\1\165"+
        "\1\101\1\uffff\1\145\1\uffff\1\145\1\157\1\164\1\162\1\143\1\156"+
        "\1\143\1\156\1\146\1\101\2\uffff\1\145\1\154\1\164\1\145\1\uffff"+
        "\1\101\1\145\1\uffff\1\162\1\101\1\145\1\101\1\164\1\uffff\1\144"+
        "\1\164\1\162\1\101\1\165\1\145\1\157\1\145\1\163\1\101\1\uffff\1"+
        "\101\2\145\1\101\1\uffff\1\101\1\156\1\uffff\1\101\1\uffff\1\141"+
        "\3\101\1\uffff\1\163\3\101\1\160\2\uffff\2\101\2\uffff\1\101\1\uffff"+
        "\1\101\3\uffff\1\101\3\uffff\1\157\5\uffff\1\162\1\164\1\101\1\uffff";
    static final String DFA8_maxS =
        "\1\u00ac\5\uffff\1\174\3\uffff\5\172\1\146\1\174\7\uffff\1\157\1"+
        "\145\1\151\1\154\1\160\1\141\1\165\1\162\1\145\1\150\1\157\1\151"+
        "\1\167\1\141\4\75\2\uffff\2\75\1\uffff\1\156\1\162\1\146\1\154\2"+
        "\162\1\71\13\uffff\1\162\1\156\1\154\2\uffff\1\164\2\uffff\1\164"+
        "\1\uffff\2\172\1\uffff\2\172\1\151\2\172\1\141\1\154\1\172\1\145"+
        "\1\172\1\151\1\155\1\141\1\157\1\151\1\141\1\151\1\141\1\154\17"+
        "\uffff\1\144\2\172\1\163\2\151\1\165\1\uffff\1\172\1\143\1\163\1"+
        "\172\1\165\1\144\6\uffff\1\163\1\uffff\1\154\1\uffff\1\165\1\172"+
        "\1\uffff\1\145\1\uffff\1\145\1\157\1\164\1\162\1\143\1\156\1\143"+
        "\1\156\1\146\1\172\2\uffff\1\145\1\154\1\164\1\145\1\uffff\1\172"+
        "\1\145\1\uffff\1\162\1\172\1\145\1\172\1\164\1\uffff\1\144\1\164"+
        "\1\162\1\172\1\165\1\145\1\157\1\145\1\163\1\172\1\uffff\1\172\2"+
        "\145\1\172\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\141\3\172"+
        "\1\uffff\1\163\3\172\1\160\2\uffff\2\172\2\uffff\1\172\1\uffff\1"+
        "\172\3\uffff\1\172\3\uffff\1\157\5\uffff\1\162\1\164\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\12\7\uffff\1\32"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\22\uffff\1\71\1\72\2\uffff\1\105"+
        "\7\uffff\1\124\1\125\1\127\1\130\1\7\1\6\1\14\1\13\1\16\1\15\1\20"+
        "\3\uffff\1\17\1\22\1\uffff\1\21\1\24\1\uffff\1\23\2\uffff\1\31\23"+
        "\uffff\1\65\1\77\1\101\1\66\1\100\1\102\1\67\1\103\1\70\1\126\1"+
        "\104\1\74\1\73\1\76\1\75\7\uffff\1\123\6\uffff\1\26\1\25\1\30\1"+
        "\27\1\42\1\43\1\uffff\1\44\1\uffff\1\45\2\uffff\1\50\1\uffff\1\47"+
        "\12\uffff\1\110\1\111\4\uffff\1\41\2\uffff\1\106\5\uffff\1\46\12"+
        "\uffff\1\107\4\uffff\1\114\2\uffff\1\116\1\uffff\1\64\4\uffff\1"+
        "\53\5\uffff\1\62\1\112\2\uffff\1\120\1\121\1\uffff\1\63\1\uffff"+
        "\1\54\1\51\1\52\1\uffff\1\56\1\57\1\61\1\uffff\1\113\1\117\1\115"+
        "\1\60\1\55\3\uffff\1\122";
    static final String DFA8_specialS =
        "\u00e0\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\71\2\uffff\1\71\22\uffff\1\71\1\53\1\70\1\26\1\25\1\56\1"+
            "\1\1\uffff\1\2\1\3\1\50\1\46\1\4\1\47\1\5\1\51\11\65\1\66\1"+
            "\6\1\7\1\54\1\52\1\55\2\uffff\1\37\1\40\1\41\1\30\1\67\1\33"+
            "\1\67\1\45\3\67\1\35\1\32\2\67\1\43\1\36\1\31\1\34\1\44\1\67"+
            "\1\42\4\67\1\10\1\uffff\1\11\1\uffff\1\67\1\uffff\1\57\1\12"+
            "\1\13\1\67\1\62\1\14\2\67\1\61\4\67\1\15\1\60\2\67\1\16\1\17"+
            "\1\64\2\67\1\63\2\67\1\20\1\21\1\22\1\23\1\24\55\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "\1\74\26\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\76\26\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\100\26\uffff\32\67\4\uffff\1\67\1\uffff\1\103\15\67\1\101"+
            "\5\67\1\102\5\67",
            "\1\105\26\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\106\13\67",
            "\1\110\26\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\111\25\67",
            "\1\113\2\uffff\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\120\3\uffff\1\117",
            "\1\121",
            "\1\122\12\uffff\1\123",
            "\1\125\5\uffff\1\124\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\4\uffff\1\136",
            "\1\140",
            "\1\142\21\uffff\1\141",
            "\1\145\17\uffff\1\144",
            "\1\147",
            "\1\152\4\uffff\1\152\15\uffff\1\151",
            "",
            "",
            "\1\154",
            "\1\156",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164\11\uffff\1\165",
            "\1\166",
            "\12\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "",
            "",
            "\1\175\22\uffff\1\174",
            "",
            "\1\176\26\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0080\26\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0084",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\13\67\1\u0086\16\67",
            "\1\u0088",
            "\1\u0089",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008b",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0096",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009e",
            "\1\u009f",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00ba",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c8",
            "\1\u00c9",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00cc",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00ce",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\u00d2",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00d6",
            "",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "\1\u00dc",
            "",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\32\67\4\uffff\1\67\1\uffff\32\67",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | BEMOL | SOSTENIDO | BECUADRO | FOR | DO | RE | MI | FA | SOL | LA | SI | QUIET | ARMOR | BEAT | SPEED | CHORUS | VOICE | PIANO | FLAUTA | TWICE | HALF | RAISE | FALL | PEQUAL | REQUAL | MEQUAL | DEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | DPLUS | DMINUS | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FUNC | RETURN | READ | WRITE | TRUE | FALSE | TRANSPORT | OCT | INT | ID | COMMENT | STRING | WS );";
        }
    }
 

}
// $ANTLR 3.4 /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g 2017-06-02 12:38:52

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
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
    public static final int GUITARRA=33;
    public static final int HALF=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int INT=37;
    public static final int LA=38;
    public static final int LE=39;
    public static final int LIST_FUNCTIONS=40;
    public static final int LIST_INSTR=41;
    public static final int LNOTAS=42;
    public static final int LT=43;
    public static final int MEQUAL=44;
    public static final int MI=45;
    public static final int MINUS=46;
    public static final int MOD=47;
    public static final int MUL=48;
    public static final int MULTINOTA=49;
    public static final int NOT=50;
    public static final int NOT_EQUAL=51;
    public static final int NURAN=52;
    public static final int OCT=53;
    public static final int OR=54;
    public static final int ORGANO=55;
    public static final int PARAMS=56;
    public static final int PARTITURA=57;
    public static final int PEQUAL=58;
    public static final int PERCUSION=59;
    public static final int PIANO=60;
    public static final int PLUS=61;
    public static final int PREF=62;
    public static final int PVALUE=63;
    public static final int QUIET=64;
    public static final int RAISE=65;
    public static final int RE=66;
    public static final int READ=67;
    public static final int REPEAT=68;
    public static final int REQUAL=69;
    public static final int RETURN=70;
    public static final int SAXO=71;
    public static final int SHOT=72;
    public static final int SI=73;
    public static final int SOL=74;
    public static final int SOSTENIDO=75;
    public static final int SPEED=76;
    public static final int STRING=77;
    public static final int TRANSPORT=78;
    public static final int TRI=79;
    public static final int TROMPA=80;
    public static final int TRUE=81;
    public static final int TWICE=82;
    public static final int VIOLA=83;
    public static final int VOICE=84;
    public static final int WHILE=85;
    public static final int WRITE=86;
    public static final int WS=87;
    public static final int XILOFONO=88;

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
    public String getGrammarFileName() { return "/dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g"; }

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:6:7: ( '&' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:6:9: '&'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:7:7: ( '(' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:8:7: ( ')' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:9:7: ( ',' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:10:7: ( '.' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:10:9: '.'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:11:7: ( ':' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:11:9: ':'
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:12:7: ( ':||' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:12:9: ':||'
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:13:7: ( ';' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:13:9: ';'
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:14:7: ( '[' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:14:9: '['
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
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:15:7: ( ']' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:15:9: ']'
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
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:16:7: ( 'b' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:16:9: 'b'
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
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:17:8: ( 'b*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:17:10: 'b*'
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
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:18:8: ( 'c' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:18:10: 'c'
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:19:8: ( 'c*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:19:10: 'c*'
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
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:20:8: ( 'f' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:20:10: 'f'
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
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:21:8: ( 'f*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:21:10: 'f*'
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
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:22:8: ( 'n' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:22:10: 'n'
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
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:23:8: ( 'n*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:23:10: 'n*'
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
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:24:8: ( 'r' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:24:10: 'r'
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
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:25:8: ( 'r*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:25:10: 'r*'
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
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:26:8: ( 'sc' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:26:10: 'sc'
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
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:27:8: ( 'sc*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:27:10: 'sc*'
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
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:28:8: ( 'sf' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:28:10: 'sf'
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
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:29:8: ( 'sf*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:29:10: 'sf*'
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
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:30:8: ( 'z||:' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:30:10: 'z||:'
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
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:31:8: ( '{' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:31:10: '{'
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
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:32:8: ( '|' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:32:10: '|'
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
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:33:8: ( '}' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:33:10: '}'
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
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:34:8: ( '~' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:34:10: '~'
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
    // $ANTLR end "T__117"

    // $ANTLR start "BEMOL"
    public final void mBEMOL() throws RecognitionException {
        try {
            int _type = BEMOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:249:7: ( '$' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:249:9: '$'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:250:11: ( '#' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:250:13: '#'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:251:10: ( '¬' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:251:12: '¬'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:252:5: ( 'for' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:252:7: 'for'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:253:4: ( 'Do' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:253:6: 'Do'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:254:4: ( 'Re' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:254:6: 'Re'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:255:4: ( 'Mi' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:255:6: 'Mi'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:256:4: ( 'Fa' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:256:6: 'Fa'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:257:5: ( 'Sol' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:257:7: 'Sol'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:258:4: ( 'La' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:258:6: 'La'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:259:4: ( 'Si' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:259:6: 'Si'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:260:7: ( 'Quiet' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:260:9: 'Quiet'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:261:7: ( 'Armor' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:261:9: 'Armor'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:262:6: ( 'Beat' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:262:8: 'Beat'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:263:7: ( 'Speed' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:263:9: 'Speed'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:264:8: ( 'Chorus' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:264:10: 'Chorus'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:265:7: ( 'Voice' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:265:9: 'Voice'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:266:7: ( 'Piano' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:266:9: 'Piano'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:267:8: ( 'Flauta' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:267:10: 'Flauta'
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

    // $ANTLR start "SAXO"
    public final void mSAXO() throws RecognitionException {
        try {
            int _type = SAXO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:268:6: ( 'Saxo' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:268:9: 'Saxo'
            {
            match("Saxo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAXO"

    // $ANTLR start "SHOT"
    public final void mSHOT() throws RecognitionException {
        try {
            int _type = SHOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:269:6: ( 'Shot' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:269:8: 'Shot'
            {
            match("Shot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHOT"

    // $ANTLR start "ORGANO"
    public final void mORGANO() throws RecognitionException {
        try {
            int _type = ORGANO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:270:8: ( 'Organo' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:270:10: 'Organo'
            {
            match("Organo"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORGANO"

    // $ANTLR start "TROMPA"
    public final void mTROMPA() throws RecognitionException {
        try {
            int _type = TROMPA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:271:9: ( 'Trompa' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:271:11: 'Trompa'
            {
            match("Trompa"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TROMPA"

    // $ANTLR start "XILOFONO"
    public final void mXILOFONO() throws RecognitionException {
        try {
            int _type = XILOFONO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:272:10: ( 'Xilofono' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:272:12: 'Xilofono'
            {
            match("Xilofono"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XILOFONO"

    // $ANTLR start "PERCUSION"
    public final void mPERCUSION() throws RecognitionException {
        try {
            int _type = PERCUSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:273:11: ( 'Percusion' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:273:13: 'Percusion'
            {
            match("Percusion"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCUSION"

    // $ANTLR start "VIOLA"
    public final void mVIOLA() throws RecognitionException {
        try {
            int _type = VIOLA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:274:7: ( 'Viola' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:274:9: 'Viola'
            {
            match("Viola"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VIOLA"

    // $ANTLR start "GUITARRA"
    public final void mGUITARRA() throws RecognitionException {
        try {
            int _type = GUITARRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:275:10: ( 'Guitarra' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:275:12: 'Guitarra'
            {
            match("Guitarra"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GUITARRA"

    // $ANTLR start "TWICE"
    public final void mTWICE() throws RecognitionException {
        try {
            int _type = TWICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:276:7: ( 'Twice' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:276:9: 'Twice'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:277:6: ( 'Half' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:277:8: 'Half'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:278:7: ( 'Raise' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:278:9: 'Raise'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:279:6: ( 'Fall' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:279:8: 'Fall'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:280:8: ( '+=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:280:10: '+='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:281:8: ( '-=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:281:10: '-='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:282:8: ( '*=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:282:10: '*='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:283:8: ( '/=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:283:10: '/='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:284:7: ( '=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:284:9: '='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:285:10: ( '!=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:285:12: '!='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:286:8: ( '<' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:286:10: '<'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:287:8: ( '<=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:287:10: '<='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:288:8: ( '>' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:288:10: '>'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:289:8: ( '>=' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:289:10: '>='
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:290:7: ( '++' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:290:8: '++'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:291:8: ( '--' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:291:9: '--'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:292:6: ( '+' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:292:8: '+'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:293:7: ( '-' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:293:9: '-'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:294:9: ( '*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:294:11: '*'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:295:9: ( '/' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:295:11: '/'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:296:9: ( '%' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:296:11: '%'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:297:9: ( 'not' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:297:11: 'not'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:298:9: ( 'and' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:298:11: 'and'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:299:8: ( 'or' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:299:10: 'or'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:300:6: ( 'if' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:300:8: 'if'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:301:6: ( 'else' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:301:8: 'else'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:302:7: ( 'while' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:302:9: 'while'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:303:6: ( 'func' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:303:8: 'func'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:304:8: ( 'return' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:304:10: 'return'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:305:6: ( 'read' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:305:8: 'read'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:306:7: ( 'write' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:306:9: 'write'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:307:9: ( 'true' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:307:11: 'true'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:308:9: ( 'false' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:308:11: 'false'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:309:10: ( 'Transport' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:309:12: 'Transport'
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:310:5: ( '0' .. '8' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:311:6: ( ( '0' .. '9' )+ )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:311:8: ( '0' .. '9' )+
            {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:311:8: ( '0' .. '9' )+
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
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:312:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:312:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:312:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:317:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:317:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:317:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
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


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:317:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:317:30: '\\r'
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
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:318:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:318:13: ( options {greedy=false; } : . )*
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
                    	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:318:41: .
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:322:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:322:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:322:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:322:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:322:28: ~ ( '\\\\' | '\"' )
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:328:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:328:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:331:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:331:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:8: ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | BEMOL | SOSTENIDO | BECUADRO | FOR | DO | RE | MI | FA | SOL | LA | SI | QUIET | ARMOR | BEAT | SPEED | CHORUS | VOICE | PIANO | FLAUTA | SAXO | SHOT | ORGANO | TROMPA | XILOFONO | PERCUSION | VIOLA | GUITARRA | TWICE | HALF | RAISE | FALL | PEQUAL | REQUAL | MEQUAL | DEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | DPLUS | DMINUS | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FUNC | RETURN | READ | WRITE | TRUE | FALSE | TRANSPORT | OCT | INT | ID | COMMENT | STRING | WS )
        int alt8=96;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:10: T__89
                {
                mT__89(); 


                }
                break;
            case 2 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:16: T__90
                {
                mT__90(); 


                }
                break;
            case 3 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:22: T__91
                {
                mT__91(); 


                }
                break;
            case 4 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:28: T__92
                {
                mT__92(); 


                }
                break;
            case 5 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:34: T__93
                {
                mT__93(); 


                }
                break;
            case 6 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:40: T__94
                {
                mT__94(); 


                }
                break;
            case 7 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:46: T__95
                {
                mT__95(); 


                }
                break;
            case 8 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:52: T__96
                {
                mT__96(); 


                }
                break;
            case 9 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:58: T__97
                {
                mT__97(); 


                }
                break;
            case 10 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:64: T__98
                {
                mT__98(); 


                }
                break;
            case 11 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:70: T__99
                {
                mT__99(); 


                }
                break;
            case 12 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:76: T__100
                {
                mT__100(); 


                }
                break;
            case 13 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:83: T__101
                {
                mT__101(); 


                }
                break;
            case 14 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:90: T__102
                {
                mT__102(); 


                }
                break;
            case 15 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:97: T__103
                {
                mT__103(); 


                }
                break;
            case 16 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:104: T__104
                {
                mT__104(); 


                }
                break;
            case 17 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:111: T__105
                {
                mT__105(); 


                }
                break;
            case 18 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:118: T__106
                {
                mT__106(); 


                }
                break;
            case 19 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:125: T__107
                {
                mT__107(); 


                }
                break;
            case 20 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:132: T__108
                {
                mT__108(); 


                }
                break;
            case 21 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:139: T__109
                {
                mT__109(); 


                }
                break;
            case 22 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:146: T__110
                {
                mT__110(); 


                }
                break;
            case 23 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:153: T__111
                {
                mT__111(); 


                }
                break;
            case 24 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:160: T__112
                {
                mT__112(); 


                }
                break;
            case 25 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:167: T__113
                {
                mT__113(); 


                }
                break;
            case 26 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:174: T__114
                {
                mT__114(); 


                }
                break;
            case 27 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:181: T__115
                {
                mT__115(); 


                }
                break;
            case 28 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:188: T__116
                {
                mT__116(); 


                }
                break;
            case 29 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:195: T__117
                {
                mT__117(); 


                }
                break;
            case 30 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:202: BEMOL
                {
                mBEMOL(); 


                }
                break;
            case 31 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:208: SOSTENIDO
                {
                mSOSTENIDO(); 


                }
                break;
            case 32 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:218: BECUADRO
                {
                mBECUADRO(); 


                }
                break;
            case 33 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:227: FOR
                {
                mFOR(); 


                }
                break;
            case 34 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:231: DO
                {
                mDO(); 


                }
                break;
            case 35 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:234: RE
                {
                mRE(); 


                }
                break;
            case 36 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:237: MI
                {
                mMI(); 


                }
                break;
            case 37 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:240: FA
                {
                mFA(); 


                }
                break;
            case 38 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:243: SOL
                {
                mSOL(); 


                }
                break;
            case 39 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:247: LA
                {
                mLA(); 


                }
                break;
            case 40 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:250: SI
                {
                mSI(); 


                }
                break;
            case 41 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:253: QUIET
                {
                mQUIET(); 


                }
                break;
            case 42 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:259: ARMOR
                {
                mARMOR(); 


                }
                break;
            case 43 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:265: BEAT
                {
                mBEAT(); 


                }
                break;
            case 44 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:270: SPEED
                {
                mSPEED(); 


                }
                break;
            case 45 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:276: CHORUS
                {
                mCHORUS(); 


                }
                break;
            case 46 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:283: VOICE
                {
                mVOICE(); 


                }
                break;
            case 47 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:289: PIANO
                {
                mPIANO(); 


                }
                break;
            case 48 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:295: FLAUTA
                {
                mFLAUTA(); 


                }
                break;
            case 49 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:302: SAXO
                {
                mSAXO(); 


                }
                break;
            case 50 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:307: SHOT
                {
                mSHOT(); 


                }
                break;
            case 51 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:312: ORGANO
                {
                mORGANO(); 


                }
                break;
            case 52 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:319: TROMPA
                {
                mTROMPA(); 


                }
                break;
            case 53 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:326: XILOFONO
                {
                mXILOFONO(); 


                }
                break;
            case 54 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:335: PERCUSION
                {
                mPERCUSION(); 


                }
                break;
            case 55 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:345: VIOLA
                {
                mVIOLA(); 


                }
                break;
            case 56 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:351: GUITARRA
                {
                mGUITARRA(); 


                }
                break;
            case 57 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:360: TWICE
                {
                mTWICE(); 


                }
                break;
            case 58 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:366: HALF
                {
                mHALF(); 


                }
                break;
            case 59 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:371: RAISE
                {
                mRAISE(); 


                }
                break;
            case 60 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:377: FALL
                {
                mFALL(); 


                }
                break;
            case 61 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:382: PEQUAL
                {
                mPEQUAL(); 


                }
                break;
            case 62 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:389: REQUAL
                {
                mREQUAL(); 


                }
                break;
            case 63 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:396: MEQUAL
                {
                mMEQUAL(); 


                }
                break;
            case 64 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:403: DEQUAL
                {
                mDEQUAL(); 


                }
                break;
            case 65 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:410: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 66 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:416: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 67 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:426: LT
                {
                mLT(); 


                }
                break;
            case 68 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:429: LE
                {
                mLE(); 


                }
                break;
            case 69 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:432: GT
                {
                mGT(); 


                }
                break;
            case 70 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:435: GE
                {
                mGE(); 


                }
                break;
            case 71 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:438: DPLUS
                {
                mDPLUS(); 


                }
                break;
            case 72 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:444: DMINUS
                {
                mDMINUS(); 


                }
                break;
            case 73 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:451: PLUS
                {
                mPLUS(); 


                }
                break;
            case 74 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:456: MINUS
                {
                mMINUS(); 


                }
                break;
            case 75 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:462: MUL
                {
                mMUL(); 


                }
                break;
            case 76 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:466: DIV
                {
                mDIV(); 


                }
                break;
            case 77 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:470: MOD
                {
                mMOD(); 


                }
                break;
            case 78 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:474: NOT
                {
                mNOT(); 


                }
                break;
            case 79 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:478: AND
                {
                mAND(); 


                }
                break;
            case 80 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:482: OR
                {
                mOR(); 


                }
                break;
            case 81 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:485: IF
                {
                mIF(); 


                }
                break;
            case 82 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:488: ELSE
                {
                mELSE(); 


                }
                break;
            case 83 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:493: WHILE
                {
                mWHILE(); 


                }
                break;
            case 84 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:499: FUNC
                {
                mFUNC(); 


                }
                break;
            case 85 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:504: RETURN
                {
                mRETURN(); 


                }
                break;
            case 86 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:511: READ
                {
                mREAD(); 


                }
                break;
            case 87 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:516: WRITE
                {
                mWRITE(); 


                }
                break;
            case 88 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:522: TRUE
                {
                mTRUE(); 


                }
                break;
            case 89 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:527: FALSE
                {
                mFALSE(); 


                }
                break;
            case 90 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:533: TRANSPORT
                {
                mTRANSPORT(); 


                }
                break;
            case 91 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:543: OCT
                {
                mOCT(); 


                }
                break;
            case 92 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:547: INT
                {
                mINT(); 


                }
                break;
            case 93 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:551: ID
                {
                mID(); 


                }
                break;
            case 94 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:554: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 95 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:562: STRING
                {
                mSTRING(); 


                }
                break;
            case 96 :
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:1:569: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\6\uffff\1\76\3\uffff\1\100\1\102\1\107\1\112\1\115\2\72\7\uffff"+
        "\21\72\1\155\1\160\1\162\1\165\2\uffff\1\167\1\171\1\uffff\6\72"+
        "\1\u0081\13\uffff\3\72\2\uffff\1\72\2\uffff\1\72\1\uffff\1\u0089"+
        "\1\u008b\1\uffff\1\u008c\1\u008d\1\72\1\u008f\1\u0091\2\72\1\u0094"+
        "\3\72\1\u0098\16\72\17\uffff\1\72\1\u00a9\1\u00aa\4\72\1\uffff\1"+
        "\u00af\2\72\1\u00b2\2\72\6\uffff\1\72\1\uffff\1\72\1\uffff\1\72"+
        "\1\u00b8\1\uffff\3\72\1\uffff\17\72\1\u00cb\2\uffff\4\72\1\uffff"+
        "\1\u00d0\1\72\1\uffff\1\72\1\u00d3\1\72\1\u00d5\1\72\1\uffff\1\72"+
        "\1\u00d8\1\u00d9\2\72\1\u00dc\13\72\1\u00e8\1\uffff\1\u00e9\2\72"+
        "\1\u00ec\1\uffff\1\u00ed\1\72\1\uffff\1\u00ef\1\uffff\1\72\1\u00f1"+
        "\2\uffff\1\u00f2\1\u00f3\1\uffff\1\72\1\u00f5\1\u00f6\1\u00f7\4"+
        "\72\1\u00fc\2\72\2\uffff\1\u00ff\1\u0100\2\uffff\1\u0101\1\uffff"+
        "\1\u0102\3\uffff\1\u0103\3\uffff\1\72\1\u0105\1\u0106\1\72\1\uffff"+
        "\2\72\5\uffff\1\72\2\uffff\5\72\1\u0110\1\u0111\1\u0112\1\u0113"+
        "\4\uffff";
    static final String DFA8_eofS =
        "\u0114\uffff";
    static final String DFA8_minS =
        "\1\11\5\uffff\1\174\3\uffff\5\52\1\143\1\174\7\uffff\1\157\1\141"+
        "\1\151\3\141\1\165\1\162\1\145\1\150\1\151\1\145\2\162\1\151\1\165"+
        "\1\141\1\53\1\55\1\75\1\52\2\uffff\2\75\1\uffff\1\156\1\162\1\146"+
        "\1\154\1\150\1\162\1\60\13\uffff\1\162\1\156\1\154\2\uffff\1\164"+
        "\2\uffff\1\141\1\uffff\2\52\1\uffff\2\101\1\151\2\101\1\141\1\154"+
        "\1\101\1\145\1\170\1\157\1\101\1\151\1\155\1\141\1\157\1\151\1\157"+
        "\1\141\1\162\1\147\1\141\1\151\1\154\1\151\1\154\17\uffff\1\144"+
        "\2\101\1\163\2\151\1\165\1\uffff\1\101\1\143\1\163\1\101\1\165\1"+
        "\144\6\uffff\1\163\1\uffff\1\154\1\uffff\1\165\1\101\1\uffff\1\145"+
        "\1\157\1\164\1\uffff\1\145\1\157\1\164\1\162\1\143\1\154\1\156\1"+
        "\143\1\141\1\155\1\156\1\143\1\157\1\164\1\146\1\101\2\uffff\1\145"+
        "\1\154\1\164\1\145\1\uffff\1\101\1\145\1\uffff\1\162\1\101\1\145"+
        "\1\101\1\164\1\uffff\1\144\2\101\1\164\1\162\1\101\1\165\1\145\1"+
        "\141\1\157\1\165\1\156\1\160\1\163\1\145\1\146\1\141\1\101\1\uffff"+
        "\1\101\2\145\1\101\1\uffff\1\101\1\156\1\uffff\1\101\1\uffff\1\141"+
        "\1\101\2\uffff\2\101\1\uffff\1\163\3\101\1\163\1\157\1\141\1\160"+
        "\1\101\1\157\1\162\2\uffff\2\101\2\uffff\1\101\1\uffff\1\101\3\uffff"+
        "\1\101\3\uffff\1\151\2\101\1\157\1\uffff\1\156\1\162\5\uffff\1\157"+
        "\2\uffff\1\162\1\157\1\141\1\156\1\164\4\101\4\uffff";
    static final String DFA8_maxS =
        "\1\u00ac\5\uffff\1\174\3\uffff\5\172\1\146\1\174\7\uffff\1\157\1"+
        "\145\1\151\1\154\1\160\1\141\1\165\1\162\1\145\1\150\1\157\1\151"+
        "\1\162\1\167\1\151\1\165\1\141\4\75\2\uffff\2\75\1\uffff\1\156\1"+
        "\162\1\146\1\154\2\162\1\71\13\uffff\1\162\1\156\1\154\2\uffff\1"+
        "\164\2\uffff\1\164\1\uffff\2\172\1\uffff\2\172\1\151\2\172\1\141"+
        "\1\154\1\172\1\145\1\170\1\157\1\172\1\151\1\155\1\141\1\157\1\151"+
        "\1\157\1\141\1\162\1\147\1\157\1\151\1\154\1\151\1\154\17\uffff"+
        "\1\144\2\172\1\163\2\151\1\165\1\uffff\1\172\1\143\1\163\1\172\1"+
        "\165\1\144\6\uffff\1\163\1\uffff\1\154\1\uffff\1\165\1\172\1\uffff"+
        "\1\145\1\157\1\164\1\uffff\1\145\1\157\1\164\1\162\1\143\1\154\1"+
        "\156\1\143\1\141\1\155\1\156\1\143\1\157\1\164\1\146\1\172\2\uffff"+
        "\1\145\1\154\1\164\1\145\1\uffff\1\172\1\145\1\uffff\1\162\1\172"+
        "\1\145\1\172\1\164\1\uffff\1\144\2\172\1\164\1\162\1\172\1\165\1"+
        "\145\1\141\1\157\1\165\1\156\1\160\1\163\1\145\1\146\1\141\1\172"+
        "\1\uffff\1\172\2\145\1\172\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff"+
        "\1\141\1\172\2\uffff\2\172\1\uffff\1\163\3\172\1\163\1\157\1\141"+
        "\1\160\1\172\1\157\1\162\2\uffff\2\172\2\uffff\1\172\1\uffff\1\172"+
        "\3\uffff\1\172\3\uffff\1\151\2\172\1\157\1\uffff\1\156\1\162\5\uffff"+
        "\1\157\2\uffff\1\162\1\157\1\141\1\156\1\164\4\172\4\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\11\1\12\7\uffff\1\32"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\25\uffff\1\101\1\102\2\uffff\1\115"+
        "\7\uffff\1\134\1\135\1\137\1\140\1\7\1\6\1\14\1\13\1\16\1\15\1\20"+
        "\3\uffff\1\17\1\22\1\uffff\1\21\1\24\1\uffff\1\23\2\uffff\1\31\32"+
        "\uffff\1\75\1\107\1\111\1\76\1\110\1\112\1\77\1\113\1\100\1\136"+
        "\1\114\1\104\1\103\1\106\1\105\7\uffff\1\133\6\uffff\1\26\1\25\1"+
        "\30\1\27\1\42\1\43\1\uffff\1\44\1\uffff\1\45\2\uffff\1\50\3\uffff"+
        "\1\47\20\uffff\1\120\1\121\4\uffff\1\41\2\uffff\1\116\5\uffff\1"+
        "\46\22\uffff\1\117\4\uffff\1\124\2\uffff\1\126\1\uffff\1\74\2\uffff"+
        "\1\61\1\62\2\uffff\1\53\13\uffff\1\72\1\122\2\uffff\1\130\1\131"+
        "\1\uffff\1\73\1\uffff\1\54\1\51\1\52\1\uffff\1\56\1\67\1\57\4\uffff"+
        "\1\71\2\uffff\1\123\1\127\1\125\1\60\1\55\1\uffff\1\63\1\64\11\uffff"+
        "\1\65\1\70\1\66\1\132";
    static final String DFA8_specialS =
        "\u0114\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\74\2\uffff\1\74\22\uffff\1\74\1\56\1\73\1\26\1\25\1\61\1"+
            "\1\1\uffff\1\2\1\3\1\53\1\51\1\4\1\52\1\5\1\54\11\70\1\71\1"+
            "\6\1\7\1\57\1\55\1\60\2\uffff\1\37\1\40\1\41\1\30\1\72\1\33"+
            "\1\47\1\50\3\72\1\35\1\32\1\72\1\44\1\43\1\36\1\31\1\34\1\45"+
            "\1\72\1\42\1\72\1\46\2\72\1\10\1\uffff\1\11\1\uffff\1\72\1\uffff"+
            "\1\62\1\12\1\13\1\72\1\65\1\14\2\72\1\64\4\72\1\15\1\63\2\72"+
            "\1\16\1\17\1\67\2\72\1\66\2\72\1\20\1\21\1\22\1\23\1\24\55\uffff"+
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "",
            "",
            "\1\77\26\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\101\26\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\103\26\uffff\32\72\4\uffff\1\72\1\uffff\1\106\15\72\1\104"+
            "\5\72\1\105\5\72",
            "\1\110\26\uffff\32\72\4\uffff\1\72\1\uffff\16\72\1\111\13\72",
            "\1\113\26\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\114\25\72",
            "\1\116\2\uffff\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\123\3\uffff\1\122",
            "\1\124",
            "\1\125\12\uffff\1\126",
            "\1\132\6\uffff\1\133\1\130\5\uffff\1\127\1\131",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\142\5\uffff\1\141",
            "\1\144\3\uffff\1\143",
            "\1\145",
            "\1\146\4\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\154\21\uffff\1\153",
            "\1\157\17\uffff\1\156",
            "\1\161",
            "\1\164\4\uffff\1\164\15\uffff\1\163",
            "",
            "",
            "\1\166",
            "\1\170",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\11\uffff\1\177",
            "\1\u0080",
            "\12\71",
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
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "\1\u0087\22\uffff\1\u0086",
            "",
            "\1\u0088\26\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u008a\26\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u008e",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\13\72\1\u0090\16\72",
            "\1\u0092",
            "\1\u0093",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\15\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
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
            "\1\u00a8",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b0",
            "\1\u00b1",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d4",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00da",
            "\1\u00db",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ea",
            "\1\u00eb",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00ee",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00f0",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\1\u00f4",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "\1\u0104",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "",
            "",
            "",
            "\1\u010a",
            "",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | BEMOL | SOSTENIDO | BECUADRO | FOR | DO | RE | MI | FA | SOL | LA | SI | QUIET | ARMOR | BEAT | SPEED | CHORUS | VOICE | PIANO | FLAUTA | SAXO | SHOT | ORGANO | TROMPA | XILOFONO | PERCUSION | VIOLA | GUITARRA | TWICE | HALF | RAISE | FALL | PEQUAL | REQUAL | MEQUAL | DEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | DPLUS | DMINUS | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | ELSE | WHILE | FUNC | RETURN | READ | WRITE | TRUE | FALSE | TRANSPORT | OCT | INT | ID | COMMENT | STRING | WS );";
        }
    }
 

}
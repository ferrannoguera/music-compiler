// $ANTLR 3.4 /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g 2017-06-02 12:38:51

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARMOR", "ASSIGN", "BEAT", "BECUADRO", "BEMOL", "BOOLEAN", "CHORUS", "COMBO", "COMMENT", "DEQUAL", "DIV", "DMINUS", "DO", "DPLUS", "ELSE", "EQUAL", "ESC_SEQ", "FA", "FALL", "FALSE", "FCONDS", "FLAUTA", "FOR", "FUNC", "FUNCALL", "GE", "GT", "GUITARRA", "HALF", "ID", "IF", "INT", "LA", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LNOTAS", "LT", "MEQUAL", "MI", "MINUS", "MOD", "MUL", "MULTINOTA", "NOT", "NOT_EQUAL", "NURAN", "OCT", "OR", "ORGANO", "PARAMS", "PARTITURA", "PEQUAL", "PERCUSION", "PIANO", "PLUS", "PREF", "PVALUE", "QUIET", "RAISE", "RE", "READ", "REPEAT", "REQUAL", "RETURN", "SAXO", "SHOT", "SI", "SOL", "SOSTENIDO", "SPEED", "STRING", "TRANSPORT", "TRI", "TROMPA", "TRUE", "TWICE", "VIOLA", "VOICE", "WHILE", "WRITE", "WS", "XILOFONO", "'&'", "'('", "')'", "','", "'.'", "':'", "':||'", "';'", "'['", "']'", "'b'", "'b*'", "'c'", "'c*'", "'f'", "'f*'", "'n'", "'n*'", "'r'", "'r*'", "'sc'", "'sc*'", "'sf'", "'sf*'", "'z||:'", "'{'", "'|'", "'}'", "'~'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:8: ( func )+ EOF
            {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog219);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog222);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 68:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:68:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:72:1: func : FUNC ^ ID params '{' ! block_instructions '}' !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions7 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree char_literal6_tree=null;
        AslTree char_literal8_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:72:6: ( FUNC ^ ID params '{' ! block_instructions '}' !)
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:72:8: FUNC ^ ID params '{' ! block_instructions '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func261); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func264); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func266);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            char_literal6=(Token)match(input,114,FOLLOW_114_in_func268); 

            pushFollow(FOLLOW_block_instructions_in_func271);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            char_literal8=(Token)match(input,116,FOLLOW_116_in_func273); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        AslParser.paramlist_return paramlist10 =null;


        AslTree char_literal9_tree=null;
        AslTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:10: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,90,FOLLOW_90_in_params292);  
            stream_90.add(char_literal9);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==89) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params294);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,91,FOLLOW_91_in_params297);  
            stream_91.add(char_literal11);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 76:29: -> ^( PARAMS ( paramlist )? )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:76:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:80:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal13=null;
        AslParser.param_return param12 =null;

        AslParser.param_return param14 =null;


        AslTree char_literal13_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:80:10: ( param ( ',' ! param )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:80:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist323);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:80:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==92) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:80:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,92,FOLLOW_92_in_paramlist326); 

            	    pushFollow(FOLLOW_param_in_paramlist329);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:85:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal15=null;

        AslTree id_tree=null;
        AslTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:85:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==89) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:85:13: '&' id= ID
                    {
                    char_literal15=(Token)match(input,89,FOLLOW_89_in_param354);  
                    stream_89.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param358);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 85:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:85:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:86:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param381);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 86:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:86:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:90:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal17=null;
        AslParser.instruction_return instruction16 =null;

        AslParser.instruction_return instruction18 =null;


        AslTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:91:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:91:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions415);
            instruction16=instruction();

            state._fsp--;

            stream_instruction.add(instruction16.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:91:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==96) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:91:25: ';' instruction
            	    {
            	    char_literal17=(Token)match(input,96,FOLLOW_96_in_block_instructions418);  
            	    stream_96.add(char_literal17);


            	    pushFollow(FOLLOW_instruction_in_block_instructions420);
            	    instruction18=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 92:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:92:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:96:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | for_stmt | partitura |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign19 =null;

        AslParser.ite_stmt_return ite_stmt20 =null;

        AslParser.while_stmt_return while_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.read_return read24 =null;

        AslParser.write_return write25 =null;

        AslParser.for_stmt_return for_stmt26 =null;

        AslParser.partitura_return partitura27 =null;



        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:97:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | for_stmt | partitura |)
            int alt6=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==90) ) {
                    alt6=4;
                }
                else if ( (LA6_1==DEQUAL||LA6_1==EQUAL||LA6_1==MEQUAL||LA6_1==PEQUAL||LA6_1==REQUAL) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case DMINUS:
            case DPLUS:
                {
                alt6=1;
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case FOR:
                {
                alt6=8;
                }
                break;
            case BEAT:
                {
                alt6=9;
                }
                break;
            case 96:
            case 116:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:97:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction469);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:98:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction491);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:99:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction511);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:100:14: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction532);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:101:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction553);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:102:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction570);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 7 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:103:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction595);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 8 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:104:11: for_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction618);
                    for_stmt26=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt26.getTree());

                    }
                    break;
                case 9 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:105:11: partitura
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_partitura_in_instruction630);
                    partitura27=partitura();

                    state._fsp--;

                    adaptor.addChild(root_0, partitura27.getTree());

                    }
                    break;
                case 10 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:107:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:1: assign : ( ID (eq= EQUAL ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) ) |eq= PEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) ) |eq= REQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) ) |eq= MEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) ) |eq= DEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) ) ) |eq= DPLUS ID -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID INT[\"1\"] ) ) |eq= DMINUS ID -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID INT[\"1\"] ) ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID28=null;
        Token ID35=null;
        Token ID36=null;
        AslParser.expr_return expr29 =null;

        AslParser.nmusiop_return nmusiop30 =null;

        AslParser.expr_return expr31 =null;

        AslParser.expr_return expr32 =null;

        AslParser.expr_return expr33 =null;

        AslParser.expr_return expr34 =null;


        AslTree eq_tree=null;
        AslTree ID28_tree=null;
        AslTree ID35_tree=null;
        AslTree ID36_tree=null;
        RewriteRuleTokenStream stream_MEQUAL=new RewriteRuleTokenStream(adaptor,"token MEQUAL");
        RewriteRuleTokenStream stream_PEQUAL=new RewriteRuleTokenStream(adaptor,"token PEQUAL");
        RewriteRuleTokenStream stream_DMINUS=new RewriteRuleTokenStream(adaptor,"token DMINUS");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DEQUAL=new RewriteRuleTokenStream(adaptor,"token DEQUAL");
        RewriteRuleTokenStream stream_REQUAL=new RewriteRuleTokenStream(adaptor,"token REQUAL");
        RewriteRuleTokenStream stream_DPLUS=new RewriteRuleTokenStream(adaptor,"token DPLUS");
        RewriteRuleSubtreeStream stream_nmusiop=new RewriteRuleSubtreeStream(adaptor,"rule nmusiop");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:8: ( ID (eq= EQUAL ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) ) |eq= PEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) ) |eq= REQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) ) |eq= MEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) ) |eq= DEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) ) ) |eq= DPLUS ID -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID INT[\"1\"] ) ) |eq= DMINUS ID -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID INT[\"1\"] ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case DPLUS:
                {
                alt9=2;
                }
                break;
            case DMINUS:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:10: ID (eq= EQUAL ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) ) |eq= PEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) ) |eq= REQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) ) |eq= MEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) ) |eq= DEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) ) )
                    {
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_assign676);  
                    stream_ID.add(ID28);


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:13: (eq= EQUAL ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) ) |eq= PEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) ) |eq= REQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) ) |eq= MEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) ) |eq= DEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) ) )
                    int alt8=5;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt8=1;
                        }
                        break;
                    case PEQUAL:
                        {
                        alt8=2;
                        }
                        break;
                    case REQUAL:
                        {
                        alt8=3;
                        }
                        break;
                    case MEQUAL:
                        {
                        alt8=4;
                        }
                        break;
                    case DEQUAL:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }

                    switch (alt8) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:14: eq= EQUAL ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) )
                            {
                            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign681);  
                            stream_EQUAL.add(eq);


                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:23: ( expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | nmusiop -> ^( ASSIGN[$eq, \":=\"] ID nmusiop ) )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==FALSE||LA7_0==ID||LA7_0==INT||LA7_0==MINUS||LA7_0==NOT||LA7_0==OCT||LA7_0==PLUS||LA7_0==TRUE||LA7_0==90) ) {
                                alt7=1;
                            }
                            else if ( ((LA7_0 >= BECUADRO && LA7_0 <= BEMOL)||LA7_0==DO||(LA7_0 >= FA && LA7_0 <= FALL)||LA7_0==HALF||LA7_0==LA||LA7_0==MI||(LA7_0 >= QUIET && LA7_0 <= RE)||(LA7_0 >= SI && LA7_0 <= SOSTENIDO)||LA7_0==TWICE) ) {
                                alt7=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 0, input);

                                throw nvae;

                            }
                            switch (alt7) {
                                case 1 :
                                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:24: expr
                                    {
                                    pushFollow(FOLLOW_expr_in_assign684);
                                    expr29=expr();

                                    state._fsp--;

                                    stream_expr.add(expr29.getTree());

                                    // AST REWRITE
                                    // elements: expr, ID
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (AslTree)adaptor.nil();
                                    // 109:29: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                                    {
                                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:109:32: ^( ASSIGN[$eq,\":=\"] ID expr )
                                        {
                                        AslTree root_1 = (AslTree)adaptor.nil();
                                        root_1 = (AslTree)adaptor.becomeRoot(
                                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                        , root_1);

                                        adaptor.addChild(root_1, 
                                        stream_ID.nextNode()
                                        );

                                        adaptor.addChild(root_1, stream_expr.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }


                                    retval.tree = root_0;

                                    }
                                    break;
                                case 2 :
                                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:110:6: nmusiop
                                    {
                                    pushFollow(FOLLOW_nmusiop_in_assign702);
                                    nmusiop30=nmusiop();

                                    state._fsp--;

                                    stream_nmusiop.add(nmusiop30.getTree());

                                    // AST REWRITE
                                    // elements: nmusiop, ID
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (AslTree)adaptor.nil();
                                    // 110:14: -> ^( ASSIGN[$eq, \":=\"] ID nmusiop )
                                    {
                                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:110:17: ^( ASSIGN[$eq, \":=\"] ID nmusiop )
                                        {
                                        AslTree root_1 = (AslTree)adaptor.nil();
                                        root_1 = (AslTree)adaptor.becomeRoot(
                                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                        , root_1);

                                        adaptor.addChild(root_1, 
                                        stream_ID.nextNode()
                                        );

                                        adaptor.addChild(root_1, stream_nmusiop.nextTree());

                                        adaptor.addChild(root_0, root_1);
                                        }

                                    }


                                    retval.tree = root_0;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:111:4: eq= PEQUAL expr
                            {
                            eq=(Token)match(input,PEQUAL,FOLLOW_PEQUAL_in_assign723);  
                            stream_PEQUAL.add(eq);


                            pushFollow(FOLLOW_expr_in_assign725);
                            expr31=expr();

                            state._fsp--;

                            stream_expr.add(expr31.getTree());

                            // AST REWRITE
                            // elements: ID, ID, expr
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 111:21: -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:111:24: ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID expr ) )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_ID.nextNode()
                                );

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:111:46: ^( PLUS ID expr )
                                {
                                AslTree root_2 = (AslTree)adaptor.nil();
                                root_2 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(PLUS, "PLUS")
                                , root_2);

                                adaptor.addChild(root_2, 
                                stream_ID.nextNode()
                                );

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 3 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:112:4: eq= REQUAL expr
                            {
                            eq=(Token)match(input,REQUAL,FOLLOW_REQUAL_in_assign751);  
                            stream_REQUAL.add(eq);


                            pushFollow(FOLLOW_expr_in_assign753);
                            expr32=expr();

                            state._fsp--;

                            stream_expr.add(expr32.getTree());

                            // AST REWRITE
                            // elements: expr, ID, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 112:21: -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:112:24: ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID expr ) )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_ID.nextNode()
                                );

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:112:46: ^( MINUS ID expr )
                                {
                                AslTree root_2 = (AslTree)adaptor.nil();
                                root_2 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(MINUS, "MINUS")
                                , root_2);

                                adaptor.addChild(root_2, 
                                stream_ID.nextNode()
                                );

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 4 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:113:4: eq= MEQUAL expr
                            {
                            eq=(Token)match(input,MEQUAL,FOLLOW_MEQUAL_in_assign779);  
                            stream_MEQUAL.add(eq);


                            pushFollow(FOLLOW_expr_in_assign781);
                            expr33=expr();

                            state._fsp--;

                            stream_expr.add(expr33.getTree());

                            // AST REWRITE
                            // elements: ID, expr, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 113:21: -> ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:113:24: ^( ASSIGN[$eq,\":=\"] ID ^( MUL ID expr ) )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_ID.nextNode()
                                );

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:113:46: ^( MUL ID expr )
                                {
                                AslTree root_2 = (AslTree)adaptor.nil();
                                root_2 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(MUL, "MUL")
                                , root_2);

                                adaptor.addChild(root_2, 
                                stream_ID.nextNode()
                                );

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 5 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:114:4: eq= DEQUAL expr
                            {
                            eq=(Token)match(input,DEQUAL,FOLLOW_DEQUAL_in_assign807);  
                            stream_DEQUAL.add(eq);


                            pushFollow(FOLLOW_expr_in_assign809);
                            expr34=expr();

                            state._fsp--;

                            stream_expr.add(expr34.getTree());

                            // AST REWRITE
                            // elements: expr, ID, ID
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 114:21: -> ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:114:24: ^( ASSIGN[$eq,\":=\"] ID ^( DIV ID expr ) )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                                , root_1);

                                adaptor.addChild(root_1, 
                                stream_ID.nextNode()
                                );

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:114:46: ^( DIV ID expr )
                                {
                                AslTree root_2 = (AslTree)adaptor.nil();
                                root_2 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(DIV, "DIV")
                                , root_2);

                                adaptor.addChild(root_2, 
                                stream_ID.nextNode()
                                );

                                adaptor.addChild(root_2, stream_expr.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:115:4: eq= DPLUS ID
                    {
                    eq=(Token)match(input,DPLUS,FOLLOW_DPLUS_in_assign835);  
                    stream_DPLUS.add(eq);


                    ID35=(Token)match(input,ID,FOLLOW_ID_in_assign837);  
                    stream_ID.add(ID35);


                    // AST REWRITE
                    // elements: ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 115:17: -> ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID INT[\"1\"] ) )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:115:20: ^( ASSIGN[$eq,\":=\"] ID ^( PLUS ID INT[\"1\"] ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:115:42: ^( PLUS ID INT[\"1\"] )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        (AslTree)adaptor.create(INT, "1")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:116:4: eq= DMINUS ID
                    {
                    eq=(Token)match(input,DMINUS,FOLLOW_DMINUS_in_assign864);  
                    stream_DMINUS.add(eq);


                    ID36=(Token)match(input,ID,FOLLOW_ID_in_assign866);  
                    stream_ID.add(ID36);


                    // AST REWRITE
                    // elements: ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 116:18: -> ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID INT[\"1\"] ) )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:116:21: ^( ASSIGN[$eq,\":=\"] ID ^( MINUS ID INT[\"1\"] ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:116:43: ^( MINUS ID INT[\"1\"] )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(MINUS, "MINUS")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_2, 
                        (AslTree)adaptor.create(INT, "1")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:120:1: ite_stmt : IF ^ '(' ! expr ')' ! '{' ! block_instructions '}' ! ( ELSE ! '{' ! block_instructions '}' !)? ;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token ELSE44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        AslParser.expr_return expr39 =null;

        AslParser.block_instructions_return block_instructions42 =null;

        AslParser.block_instructions_return block_instructions46 =null;


        AslTree IF37_tree=null;
        AslTree char_literal38_tree=null;
        AslTree char_literal40_tree=null;
        AslTree char_literal41_tree=null;
        AslTree char_literal43_tree=null;
        AslTree ELSE44_tree=null;
        AslTree char_literal45_tree=null;
        AslTree char_literal47_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:120:10: ( IF ^ '(' ! expr ')' ! '{' ! block_instructions '}' ! ( ELSE ! '{' ! block_instructions '}' !)? )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:120:12: IF ^ '(' ! expr ')' ! '{' ! block_instructions '}' ! ( ELSE ! '{' ! block_instructions '}' !)?
            {
            root_0 = (AslTree)adaptor.nil();


            IF37=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt904); 
            IF37_tree = 
            (AslTree)adaptor.create(IF37)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF37_tree, root_0);


            char_literal38=(Token)match(input,90,FOLLOW_90_in_ite_stmt907); 

            pushFollow(FOLLOW_expr_in_ite_stmt909);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            char_literal40=(Token)match(input,91,FOLLOW_91_in_ite_stmt910); 

            char_literal41=(Token)match(input,114,FOLLOW_114_in_ite_stmt913); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt916);
            block_instructions42=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions42.getTree());

            char_literal43=(Token)match(input,116,FOLLOW_116_in_ite_stmt918); 

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:120:58: ( ELSE ! '{' ! block_instructions '}' !)?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:120:59: ELSE ! '{' ! block_instructions '}' !
                    {
                    ELSE44=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt922); 

                    char_literal45=(Token)match(input,114,FOLLOW_114_in_ite_stmt925); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt928);
                    block_instructions46=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions46.getTree());

                    char_literal47=(Token)match(input,116,FOLLOW_116_in_ite_stmt931); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class beatbox_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beatbox"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:123:1: beatbox : BEAT ^ expr ':' ! expr ;
    public final AslParser.beatbox_return beatbox() throws RecognitionException {
        AslParser.beatbox_return retval = new AslParser.beatbox_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token BEAT48=null;
        Token char_literal50=null;
        AslParser.expr_return expr49 =null;

        AslParser.expr_return expr51 =null;


        AslTree BEAT48_tree=null;
        AslTree char_literal50_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:123:9: ( BEAT ^ expr ':' ! expr )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:123:11: BEAT ^ expr ':' ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            BEAT48=(Token)match(input,BEAT,FOLLOW_BEAT_in_beatbox956); 
            BEAT48_tree = 
            (AslTree)adaptor.create(BEAT48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(BEAT48_tree, root_0);


            pushFollow(FOLLOW_expr_in_beatbox959);
            expr49=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr49.getTree());

            char_literal50=(Token)match(input,94,FOLLOW_94_in_beatbox961); 

            pushFollow(FOLLOW_expr_in_beatbox964);
            expr51=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr51.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beatbox"


    public static class speederman_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speederman"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:125:1: speederman : SPEED ^ dur2 ':' ! expr ;
    public final AslParser.speederman_return speederman() throws RecognitionException {
        AslParser.speederman_return retval = new AslParser.speederman_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SPEED52=null;
        Token char_literal54=null;
        AslParser.dur2_return dur253 =null;

        AslParser.expr_return expr55 =null;


        AslTree SPEED52_tree=null;
        AslTree char_literal54_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:125:12: ( SPEED ^ dur2 ':' ! expr )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:125:14: SPEED ^ dur2 ':' ! expr
            {
            root_0 = (AslTree)adaptor.nil();


            SPEED52=(Token)match(input,SPEED,FOLLOW_SPEED_in_speederman972); 
            SPEED52_tree = 
            (AslTree)adaptor.create(SPEED52)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SPEED52_tree, root_0);


            pushFollow(FOLLOW_dur2_in_speederman975);
            dur253=dur2();

            state._fsp--;

            adaptor.addChild(root_0, dur253.getTree());

            char_literal54=(Token)match(input,94,FOLLOW_94_in_speederman977); 

            pushFollow(FOLLOW_expr_in_speederman980);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speederman"


    public static class trans_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trans"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:127:1: trans : TRANSPORT ^ expr ;
    public final AslParser.trans_return trans() throws RecognitionException {
        AslParser.trans_return retval = new AslParser.trans_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TRANSPORT56=null;
        AslParser.expr_return expr57 =null;


        AslTree TRANSPORT56_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:127:8: ( TRANSPORT ^ expr )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:127:10: TRANSPORT ^ expr
            {
            root_0 = (AslTree)adaptor.nil();


            TRANSPORT56=(Token)match(input,TRANSPORT,FOLLOW_TRANSPORT_in_trans989); 
            TRANSPORT56_tree = 
            (AslTree)adaptor.create(TRANSPORT56)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(TRANSPORT56_tree, root_0);


            pushFollow(FOLLOW_expr_in_trans992);
            expr57=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr57.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "trans"


    public static class armour_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "armour"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:1: armour : ARMOR '{' ( alter nota OCT )+ '}' -> ^( ARMOR ( ^( nota alter OCT ) )+ ) ;
    public final AslParser.armour_return armour() throws RecognitionException {
        AslParser.armour_return retval = new AslParser.armour_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ARMOR58=null;
        Token char_literal59=null;
        Token OCT62=null;
        Token char_literal63=null;
        AslParser.alter_return alter60 =null;

        AslParser.nota_return nota61 =null;


        AslTree ARMOR58_tree=null;
        AslTree char_literal59_tree=null;
        AslTree OCT62_tree=null;
        AslTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_OCT=new RewriteRuleTokenStream(adaptor,"token OCT");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_ARMOR=new RewriteRuleTokenStream(adaptor,"token ARMOR");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleSubtreeStream stream_nota=new RewriteRuleSubtreeStream(adaptor,"rule nota");
        RewriteRuleSubtreeStream stream_alter=new RewriteRuleSubtreeStream(adaptor,"rule alter");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:9: ( ARMOR '{' ( alter nota OCT )+ '}' -> ^( ARMOR ( ^( nota alter OCT ) )+ ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:11: ARMOR '{' ( alter nota OCT )+ '}'
            {
            ARMOR58=(Token)match(input,ARMOR,FOLLOW_ARMOR_in_armour1001);  
            stream_ARMOR.add(ARMOR58);


            char_literal59=(Token)match(input,114,FOLLOW_114_in_armour1003);  
            stream_114.add(char_literal59);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:21: ( alter nota OCT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= BECUADRO && LA11_0 <= BEMOL)||LA11_0==SOSTENIDO) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:22: alter nota OCT
            	    {
            	    pushFollow(FOLLOW_alter_in_armour1006);
            	    alter60=alter();

            	    state._fsp--;

            	    stream_alter.add(alter60.getTree());

            	    pushFollow(FOLLOW_nota_in_armour1008);
            	    nota61=nota();

            	    state._fsp--;

            	    stream_nota.add(nota61.getTree());

            	    OCT62=(Token)match(input,OCT,FOLLOW_OCT_in_armour1010);  
            	    stream_OCT.add(OCT62);


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            char_literal63=(Token)match(input,116,FOLLOW_116_in_armour1014);  
            stream_116.add(char_literal63);


            // AST REWRITE
            // elements: alter, OCT, ARMOR, nota
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 129:42: -> ^( ARMOR ( ^( nota alter OCT ) )+ )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:45: ^( ARMOR ( ^( nota alter OCT ) )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_ARMOR.nextNode()
                , root_1);

                if ( !(stream_alter.hasNext()||stream_OCT.hasNext()||stream_nota.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_alter.hasNext()||stream_OCT.hasNext()||stream_nota.hasNext() ) {
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:129:53: ^( nota alter OCT )
                    {
                    AslTree root_2 = (AslTree)adaptor.nil();
                    root_2 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_alter.nextTree());

                    adaptor.addChild(root_2, 
                    stream_OCT.nextNode()
                    );

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_alter.reset();
                stream_OCT.reset();
                stream_nota.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "armour"


    public static class instrumento_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrumento"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:131:1: instrumento : ( PIANO | FLAUTA | SAXO | SHOT | GUITARRA | VIOLA | XILOFONO | ORGANO | TROMPA | PERCUSION );
    public final AslParser.instrumento_return instrumento() throws RecognitionException {
        AslParser.instrumento_return retval = new AslParser.instrumento_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set64=null;

        AslTree set64_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:131:12: ( PIANO | FLAUTA | SAXO | SHOT | GUITARRA | VIOLA | XILOFONO | ORGANO | TROMPA | PERCUSION )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set64=(Token)input.LT(1);

            if ( input.LA(1)==FLAUTA||input.LA(1)==GUITARRA||input.LA(1)==ORGANO||(input.LA(1) >= PERCUSION && input.LA(1) <= PIANO)||(input.LA(1) >= SAXO && input.LA(1) <= SHOT)||input.LA(1)==TROMPA||input.LA(1)==VIOLA||input.LA(1)==XILOFONO ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set64)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrumento"


    public static class alter_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alter"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:1: alter : ( BEMOL ^| BECUADRO ^| SOSTENIDO ^)+ ;
    public final AslParser.alter_return alter() throws RecognitionException {
        AslParser.alter_return retval = new AslParser.alter_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token BEMOL65=null;
        Token BECUADRO66=null;
        Token SOSTENIDO67=null;

        AslTree BEMOL65_tree=null;
        AslTree BECUADRO66_tree=null;
        AslTree SOSTENIDO67_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:7: ( ( BEMOL ^| BECUADRO ^| SOSTENIDO ^)+ )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:9: ( BEMOL ^| BECUADRO ^| SOSTENIDO ^)+
            {
            root_0 = (AslTree)adaptor.nil();


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:9: ( BEMOL ^| BECUADRO ^| SOSTENIDO ^)+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case BEMOL:
                    {
                    alt12=1;
                    }
                    break;
                case BECUADRO:
                    {
                    alt12=2;
                    }
                    break;
                case SOSTENIDO:
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:10: BEMOL ^
            	    {
            	    BEMOL65=(Token)match(input,BEMOL,FOLLOW_BEMOL_in_alter1065); 
            	    BEMOL65_tree = 
            	    (AslTree)adaptor.create(BEMOL65)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(BEMOL65_tree, root_0);


            	    }
            	    break;
            	case 2 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:17: BECUADRO ^
            	    {
            	    BECUADRO66=(Token)match(input,BECUADRO,FOLLOW_BECUADRO_in_alter1068); 
            	    BECUADRO66_tree = 
            	    (AslTree)adaptor.create(BECUADRO66)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(BECUADRO66_tree, root_0);


            	    }
            	    break;
            	case 3 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:133:27: SOSTENIDO ^
            	    {
            	    SOSTENIDO67=(Token)match(input,SOSTENIDO,FOLLOW_SOSTENIDO_in_alter1071); 
            	    SOSTENIDO67_tree = 
            	    (AslTree)adaptor.create(SOSTENIDO67)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(SOSTENIDO67_tree, root_0);


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alter"


    public static class nota_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nota"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:135:1: nota : ( nota2 | QUIET );
    public final AslParser.nota_return nota() throws RecognitionException {
        AslParser.nota_return retval = new AslParser.nota_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token QUIET69=null;
        AslParser.nota2_return nota268 =null;


        AslTree QUIET69_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:135:6: ( nota2 | QUIET )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DO||LA13_0==FA||LA13_0==LA||LA13_0==MI||LA13_0==RE||(LA13_0 >= SI && LA13_0 <= SOL)) ) {
                alt13=1;
            }
            else if ( (LA13_0==QUIET) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:135:8: nota2
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_nota2_in_nota1082);
                    nota268=nota2();

                    state._fsp--;

                    adaptor.addChild(root_0, nota268.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:135:14: QUIET
                    {
                    root_0 = (AslTree)adaptor.nil();


                    QUIET69=(Token)match(input,QUIET,FOLLOW_QUIET_in_nota1084); 
                    QUIET69_tree = 
                    (AslTree)adaptor.create(QUIET69)
                    ;
                    adaptor.addChild(root_0, QUIET69_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nota"


    public static class nota2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nota2"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:137:1: nota2 : ( DO | RE | MI | FA | SOL | LA | SI );
    public final AslParser.nota2_return nota2() throws RecognitionException {
        AslParser.nota2_return retval = new AslParser.nota2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set70=null;

        AslTree set70_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:137:7: ( DO | RE | MI | FA | SOL | LA | SI )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set70=(Token)input.LT(1);

            if ( input.LA(1)==DO||input.LA(1)==FA||input.LA(1)==LA||input.LA(1)==MI||input.LA(1)==RE||(input.LA(1) >= SI && input.LA(1) <= SOL) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set70)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nota2"


    public static class dur_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dur"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:139:1: dur : dur2 ^ ( '~' )? ;
    public final AslParser.dur_return dur() throws RecognitionException {
        AslParser.dur_return retval = new AslParser.dur_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal72=null;
        AslParser.dur2_return dur271 =null;


        AslTree char_literal72_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:139:5: ( dur2 ^ ( '~' )? )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:139:7: dur2 ^ ( '~' )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_dur2_in_dur1112);
            dur271=dur2();

            state._fsp--;

            root_0 = (AslTree)adaptor.becomeRoot(dur271.getTree(), root_0);

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:139:13: ( '~' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==117) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:139:13: '~'
                    {
                    char_literal72=(Token)match(input,117,FOLLOW_117_in_dur1115); 
                    char_literal72_tree = 
                    (AslTree)adaptor.create(char_literal72)
                    ;
                    adaptor.addChild(root_0, char_literal72_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dur"


    public static class dur2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dur2"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:141:1: dur2 : ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' | 'r*' | 'b*' | 'n*' | 'c*' | 'sc*' | 'f*' | 'sf*' );
    public final AslParser.dur2_return dur2() throws RecognitionException {
        AslParser.dur2_return retval = new AslParser.dur2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set73=null;

        AslTree set73_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:141:6: ( 'r' | 'b' | 'n' | 'c' | 'sc' | 'f' | 'sf' | 'r*' | 'b*' | 'n*' | 'c*' | 'sc*' | 'f*' | 'sf*' )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set73=(Token)input.LT(1);

            if ( (input.LA(1) >= 99 && input.LA(1) <= 112) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set73)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dur2"


    public static class octal_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "octal"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:143:1: octal : ( OCT | -> OCT[\"3\"] );
    public final AslParser.octal_return octal() throws RecognitionException {
        AslParser.octal_return retval = new AslParser.octal_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OCT74=null;

        AslTree OCT74_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:143:7: ( OCT | -> OCT[\"3\"] )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OCT) ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= 91 && LA15_0 <= 92)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:143:9: OCT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    OCT74=(Token)match(input,OCT,FOLLOW_OCT_in_octal1159); 
                    OCT74_tree = 
                    (AslTree)adaptor.create(OCT74)
                    ;
                    adaptor.addChild(root_0, OCT74_tree);


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:144:5: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 144:5: -> OCT[\"3\"]
                    {
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(OCT, "3")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "octal"


    public static class acion_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "acion"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:145:1: acion : ( alter | -> NURAN );
    public final AslParser.acion_return acion() throws RecognitionException {
        AslParser.acion_return retval = new AslParser.acion_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.alter_return alter75 =null;



        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:145:7: ( alter | -> NURAN )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= BECUADRO && LA16_0 <= BEMOL)||LA16_0==SOSTENIDO) ) {
                alt16=1;
            }
            else if ( (LA16_0==DO||LA16_0==FA||LA16_0==LA||LA16_0==MI||LA16_0==RE||(LA16_0 >= SI && LA16_0 <= SOL)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:145:9: alter
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_in_acion1175);
                    alter75=alter();

                    state._fsp--;

                    adaptor.addChild(root_0, alter75.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:146:5: 
                    {
                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 146:5: -> NURAN
                    {
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "acion"


    public static class music_atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "music_atom"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:1: music_atom : ( nmusiop2 | multinota | ite_stmt_part | triet )+ ;
    public final AslParser.music_atom_return music_atom() throws RecognitionException {
        AslParser.music_atom_return retval = new AslParser.music_atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.nmusiop2_return nmusiop276 =null;

        AslParser.multinota_return multinota77 =null;

        AslParser.ite_stmt_part_return ite_stmt_part78 =null;

        AslParser.triet_return triet79 =null;



        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:12: ( ( nmusiop2 | multinota | ite_stmt_part | triet )+ )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:14: ( nmusiop2 | multinota | ite_stmt_part | triet )+
            {
            root_0 = (AslTree)adaptor.nil();


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:14: ( nmusiop2 | multinota | ite_stmt_part | triet )+
            int cnt17=0;
            loop17:
            do {
                int alt17=5;
                switch ( input.LA(1) ) {
                case BECUADRO:
                case BEMOL:
                case DO:
                case FA:
                case FALL:
                case HALF:
                case ID:
                case LA:
                case MI:
                case QUIET:
                case RAISE:
                case RE:
                case SI:
                case SOL:
                case SOSTENIDO:
                case TWICE:
                    {
                    alt17=1;
                    }
                    break;
                case 90:
                    {
                    alt17=2;
                    }
                    break;
                case IF:
                    {
                    alt17=3;
                    }
                    break;
                case 97:
                    {
                    alt17=4;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:15: nmusiop2
            	    {
            	    pushFollow(FOLLOW_nmusiop2_in_music_atom1192);
            	    nmusiop276=nmusiop2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nmusiop276.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:24: multinota
            	    {
            	    pushFollow(FOLLOW_multinota_in_music_atom1194);
            	    multinota77=multinota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multinota77.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:34: ite_stmt_part
            	    {
            	    pushFollow(FOLLOW_ite_stmt_part_in_music_atom1196);
            	    ite_stmt_part78=ite_stmt_part();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ite_stmt_part78.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:148:48: triet
            	    {
            	    pushFollow(FOLLOW_triet_in_music_atom1198);
            	    triet79=triet();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triet79.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "music_atom"


    public static class music_atom2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "music_atom2"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:150:1: music_atom2 : music_atom -> ^( LNOTAS music_atom ) ;
    public final AslParser.music_atom2_return music_atom2() throws RecognitionException {
        AslParser.music_atom2_return retval = new AslParser.music_atom2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.music_atom_return music_atom80 =null;


        RewriteRuleSubtreeStream stream_music_atom=new RewriteRuleSubtreeStream(adaptor,"rule music_atom");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:150:13: ( music_atom -> ^( LNOTAS music_atom ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:150:15: music_atom
            {
            pushFollow(FOLLOW_music_atom_in_music_atom21210);
            music_atom80=music_atom();

            state._fsp--;

            stream_music_atom.add(music_atom80.getTree());

            // AST REWRITE
            // elements: music_atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 150:26: -> ^( LNOTAS music_atom )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:150:29: ^( LNOTAS music_atom )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LNOTAS, "LNOTAS")
                , root_1);

                adaptor.addChild(root_1, stream_music_atom.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "music_atom2"


    public static class nmusi_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nmusi"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:152:1: nmusi : ( alter nota ^ OCT ( '.' ! dur ) | alter nota OCT -> ^( nota alter OCT NURAN ) | alter nota '.' dur -> ^( nota alter OCT[\"3\"] dur ) | alter nota -> ^( nota alter OCT[\"3\"] NURAN ) | nota OCT '.' dur -> ^( nota NURAN OCT dur ) | nota OCT -> ^( nota NURAN OCT NURAN ) | nota '.' dur -> ^( nota NURAN OCT[\"3\"] dur ) | nota -> ^( nota NURAN OCT[\"3\"] NURAN ) );
    public final AslParser.nmusi_return nmusi() throws RecognitionException {
        AslParser.nmusi_return retval = new AslParser.nmusi_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OCT83=null;
        Token char_literal84=null;
        Token OCT88=null;
        Token char_literal91=null;
        Token OCT96=null;
        Token char_literal97=null;
        Token OCT100=null;
        Token char_literal102=null;
        AslParser.alter_return alter81 =null;

        AslParser.nota_return nota82 =null;

        AslParser.dur_return dur85 =null;

        AslParser.alter_return alter86 =null;

        AslParser.nota_return nota87 =null;

        AslParser.alter_return alter89 =null;

        AslParser.nota_return nota90 =null;

        AslParser.dur_return dur92 =null;

        AslParser.alter_return alter93 =null;

        AslParser.nota_return nota94 =null;

        AslParser.nota_return nota95 =null;

        AslParser.dur_return dur98 =null;

        AslParser.nota_return nota99 =null;

        AslParser.nota_return nota101 =null;

        AslParser.dur_return dur103 =null;

        AslParser.nota_return nota104 =null;


        AslTree OCT83_tree=null;
        AslTree char_literal84_tree=null;
        AslTree OCT88_tree=null;
        AslTree char_literal91_tree=null;
        AslTree OCT96_tree=null;
        AslTree char_literal97_tree=null;
        AslTree OCT100_tree=null;
        AslTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_OCT=new RewriteRuleTokenStream(adaptor,"token OCT");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_dur=new RewriteRuleSubtreeStream(adaptor,"rule dur");
        RewriteRuleSubtreeStream stream_nota=new RewriteRuleSubtreeStream(adaptor,"rule nota");
        RewriteRuleSubtreeStream stream_alter=new RewriteRuleSubtreeStream(adaptor,"rule alter");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:152:7: ( alter nota ^ OCT ( '.' ! dur ) | alter nota OCT -> ^( nota alter OCT NURAN ) | alter nota '.' dur -> ^( nota alter OCT[\"3\"] dur ) | alter nota -> ^( nota alter OCT[\"3\"] NURAN ) | nota OCT '.' dur -> ^( nota NURAN OCT dur ) | nota OCT -> ^( nota NURAN OCT NURAN ) | nota '.' dur -> ^( nota NURAN OCT[\"3\"] dur ) | nota -> ^( nota NURAN OCT[\"3\"] NURAN ) )
            int alt18=8;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:152:9: alter nota ^ OCT ( '.' ! dur )
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_alter_in_nmusi1228);
                    alter81=alter();

                    state._fsp--;

                    adaptor.addChild(root_0, alter81.getTree());

                    pushFollow(FOLLOW_nota_in_nmusi1230);
                    nota82=nota();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(nota82.getTree(), root_0);

                    OCT83=(Token)match(input,OCT,FOLLOW_OCT_in_nmusi1233); 
                    OCT83_tree = 
                    (AslTree)adaptor.create(OCT83)
                    ;
                    adaptor.addChild(root_0, OCT83_tree);


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:152:25: ( '.' ! dur )
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:152:26: '.' ! dur
                    {
                    char_literal84=(Token)match(input,93,FOLLOW_93_in_nmusi1236); 

                    pushFollow(FOLLOW_dur_in_nmusi1239);
                    dur85=dur();

                    state._fsp--;

                    adaptor.addChild(root_0, dur85.getTree());

                    }


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:153:4: alter nota OCT
                    {
                    pushFollow(FOLLOW_alter_in_nmusi1245);
                    alter86=alter();

                    state._fsp--;

                    stream_alter.add(alter86.getTree());

                    pushFollow(FOLLOW_nota_in_nmusi1247);
                    nota87=nota();

                    state._fsp--;

                    stream_nota.add(nota87.getTree());

                    OCT88=(Token)match(input,OCT,FOLLOW_OCT_in_nmusi1249);  
                    stream_OCT.add(OCT88);


                    // AST REWRITE
                    // elements: OCT, nota, alter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 153:19: -> ^( nota alter OCT NURAN )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:153:22: ^( nota alter OCT NURAN )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_alter.nextTree());

                        adaptor.addChild(root_1, 
                        stream_OCT.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:154:4: alter nota '.' dur
                    {
                    pushFollow(FOLLOW_alter_in_nmusi1267);
                    alter89=alter();

                    state._fsp--;

                    stream_alter.add(alter89.getTree());

                    pushFollow(FOLLOW_nota_in_nmusi1269);
                    nota90=nota();

                    state._fsp--;

                    stream_nota.add(nota90.getTree());

                    char_literal91=(Token)match(input,93,FOLLOW_93_in_nmusi1271);  
                    stream_93.add(char_literal91);


                    pushFollow(FOLLOW_dur_in_nmusi1273);
                    dur92=dur();

                    state._fsp--;

                    stream_dur.add(dur92.getTree());

                    // AST REWRITE
                    // elements: nota, alter, dur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 154:23: -> ^( nota alter OCT[\"3\"] dur )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:154:26: ^( nota alter OCT[\"3\"] dur )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_alter.nextTree());

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(OCT, "3")
                        );

                        adaptor.addChild(root_1, stream_dur.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:155:4: alter nota
                    {
                    pushFollow(FOLLOW_alter_in_nmusi1291);
                    alter93=alter();

                    state._fsp--;

                    stream_alter.add(alter93.getTree());

                    pushFollow(FOLLOW_nota_in_nmusi1293);
                    nota94=nota();

                    state._fsp--;

                    stream_nota.add(nota94.getTree());

                    // AST REWRITE
                    // elements: nota, alter
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 155:14: -> ^( nota alter OCT[\"3\"] NURAN )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:155:17: ^( nota alter OCT[\"3\"] NURAN )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_alter.nextTree());

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(OCT, "3")
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:156:4: nota OCT '.' dur
                    {
                    pushFollow(FOLLOW_nota_in_nmusi1310);
                    nota95=nota();

                    state._fsp--;

                    stream_nota.add(nota95.getTree());

                    OCT96=(Token)match(input,OCT,FOLLOW_OCT_in_nmusi1313);  
                    stream_OCT.add(OCT96);


                    char_literal97=(Token)match(input,93,FOLLOW_93_in_nmusi1315);  
                    stream_93.add(char_literal97);


                    pushFollow(FOLLOW_dur_in_nmusi1317);
                    dur98=dur();

                    state._fsp--;

                    stream_dur.add(dur98.getTree());

                    // AST REWRITE
                    // elements: nota, OCT, dur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 156:22: -> ^( nota NURAN OCT dur )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:156:25: ^( nota NURAN OCT dur )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_1, 
                        stream_OCT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_dur.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:157:4: nota OCT
                    {
                    pushFollow(FOLLOW_nota_in_nmusi1334);
                    nota99=nota();

                    state._fsp--;

                    stream_nota.add(nota99.getTree());

                    OCT100=(Token)match(input,OCT,FOLLOW_OCT_in_nmusi1336);  
                    stream_OCT.add(OCT100);


                    // AST REWRITE
                    // elements: OCT, nota
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 157:13: -> ^( nota NURAN OCT NURAN )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:157:16: ^( nota NURAN OCT NURAN )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_1, 
                        stream_OCT.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:158:4: nota '.' dur
                    {
                    pushFollow(FOLLOW_nota_in_nmusi1353);
                    nota101=nota();

                    state._fsp--;

                    stream_nota.add(nota101.getTree());

                    char_literal102=(Token)match(input,93,FOLLOW_93_in_nmusi1355);  
                    stream_93.add(char_literal102);


                    pushFollow(FOLLOW_dur_in_nmusi1357);
                    dur103=dur();

                    state._fsp--;

                    stream_dur.add(dur103.getTree());

                    // AST REWRITE
                    // elements: dur, nota
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 158:17: -> ^( nota NURAN OCT[\"3\"] dur )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:158:20: ^( nota NURAN OCT[\"3\"] dur )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(OCT, "3")
                        );

                        adaptor.addChild(root_1, stream_dur.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:159:4: nota
                    {
                    pushFollow(FOLLOW_nota_in_nmusi1375);
                    nota104=nota();

                    state._fsp--;

                    stream_nota.add(nota104.getTree());

                    // AST REWRITE
                    // elements: nota
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 159:9: -> ^( nota NURAN OCT[\"3\"] NURAN )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:159:12: ^( nota NURAN OCT[\"3\"] NURAN )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_nota.nextNode(), root_1);

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(OCT, "3")
                        );

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nmusi"


    public static class nmusiop_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nmusiop"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:1: nmusiop : ( ( TWICE ^| HALF ^| RAISE ^| FALL ^) ( nmusiop | ID ) | nmusi );
    public final AslParser.nmusiop_return nmusiop() throws RecognitionException {
        AslParser.nmusiop_return retval = new AslParser.nmusiop_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token TWICE105=null;
        Token HALF106=null;
        Token RAISE107=null;
        Token FALL108=null;
        Token ID110=null;
        AslParser.nmusiop_return nmusiop109 =null;

        AslParser.nmusi_return nmusi111 =null;


        AslTree TWICE105_tree=null;
        AslTree HALF106_tree=null;
        AslTree RAISE107_tree=null;
        AslTree FALL108_tree=null;
        AslTree ID110_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:9: ( ( TWICE ^| HALF ^| RAISE ^| FALL ^) ( nmusiop | ID ) | nmusi )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FALL||LA21_0==HALF||LA21_0==RAISE||LA21_0==TWICE) ) {
                alt21=1;
            }
            else if ( ((LA21_0 >= BECUADRO && LA21_0 <= BEMOL)||LA21_0==DO||LA21_0==FA||LA21_0==LA||LA21_0==MI||LA21_0==QUIET||LA21_0==RE||(LA21_0 >= SI && LA21_0 <= SOSTENIDO)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:11: ( TWICE ^| HALF ^| RAISE ^| FALL ^) ( nmusiop | ID )
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:11: ( TWICE ^| HALF ^| RAISE ^| FALL ^)
                    int alt19=4;
                    switch ( input.LA(1) ) {
                    case TWICE:
                        {
                        alt19=1;
                        }
                        break;
                    case HALF:
                        {
                        alt19=2;
                        }
                        break;
                    case RAISE:
                        {
                        alt19=3;
                        }
                        break;
                    case FALL:
                        {
                        alt19=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }

                    switch (alt19) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:12: TWICE ^
                            {
                            TWICE105=(Token)match(input,TWICE,FOLLOW_TWICE_in_nmusiop1398); 
                            TWICE105_tree = 
                            (AslTree)adaptor.create(TWICE105)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(TWICE105_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:19: HALF ^
                            {
                            HALF106=(Token)match(input,HALF,FOLLOW_HALF_in_nmusiop1401); 
                            HALF106_tree = 
                            (AslTree)adaptor.create(HALF106)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(HALF106_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:25: RAISE ^
                            {
                            RAISE107=(Token)match(input,RAISE,FOLLOW_RAISE_in_nmusiop1404); 
                            RAISE107_tree = 
                            (AslTree)adaptor.create(RAISE107)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(RAISE107_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:32: FALL ^
                            {
                            FALL108=(Token)match(input,FALL,FOLLOW_FALL_in_nmusiop1407); 
                            FALL108_tree = 
                            (AslTree)adaptor.create(FALL108)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(FALL108_tree, root_0);


                            }
                            break;

                    }


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:39: ( nmusiop | ID )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0 >= BECUADRO && LA20_0 <= BEMOL)||LA20_0==DO||(LA20_0 >= FA && LA20_0 <= FALL)||LA20_0==HALF||LA20_0==LA||LA20_0==MI||(LA20_0 >= QUIET && LA20_0 <= RE)||(LA20_0 >= SI && LA20_0 <= SOSTENIDO)||LA20_0==TWICE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==ID) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:40: nmusiop
                            {
                            pushFollow(FOLLOW_nmusiop_in_nmusiop1412);
                            nmusiop109=nmusiop();

                            state._fsp--;

                            adaptor.addChild(root_0, nmusiop109.getTree());

                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:161:48: ID
                            {
                            ID110=(Token)match(input,ID,FOLLOW_ID_in_nmusiop1414); 
                            ID110_tree = 
                            (AslTree)adaptor.create(ID110)
                            ;
                            adaptor.addChild(root_0, ID110_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:162:5: nmusi
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_nmusi_in_nmusiop1421);
                    nmusi111=nmusi();

                    state._fsp--;

                    adaptor.addChild(root_0, nmusi111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nmusiop"


    public static class nmusiop2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nmusiop2"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:164:1: nmusiop2 : ( nmusiop | ID );
    public final AslParser.nmusiop2_return nmusiop2() throws RecognitionException {
        AslParser.nmusiop2_return retval = new AslParser.nmusiop2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID113=null;
        AslParser.nmusiop_return nmusiop112 =null;


        AslTree ID113_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:164:9: ( nmusiop | ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0 >= BECUADRO && LA22_0 <= BEMOL)||LA22_0==DO||(LA22_0 >= FA && LA22_0 <= FALL)||LA22_0==HALF||LA22_0==LA||LA22_0==MI||(LA22_0 >= QUIET && LA22_0 <= RE)||(LA22_0 >= SI && LA22_0 <= SOSTENIDO)||LA22_0==TWICE) ) {
                alt22=1;
            }
            else if ( (LA22_0==ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:164:12: nmusiop
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_nmusiop_in_nmusiop21429);
                    nmusiop112=nmusiop();

                    state._fsp--;

                    adaptor.addChild(root_0, nmusiop112.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:164:20: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID113=(Token)match(input,ID,FOLLOW_ID_in_nmusiop21431); 
                    ID113_tree = 
                    (AslTree)adaptor.create(ID113)
                    ;
                    adaptor.addChild(root_0, ID113_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nmusiop2"


    public static class multinota_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multinota"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:1: multinota : '(' ( acion nota2 octal ) ',' ( acion nota2 octal ) ( ',' acion nota2 octal )* ')' ( '.' dur -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur ) | -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN ) ) ;
    public final AslParser.multinota_return multinota() throws RecognitionException {
        AslParser.multinota_return retval = new AslParser.multinota_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal114=null;
        Token char_literal118=null;
        Token char_literal122=null;
        Token char_literal126=null;
        Token char_literal127=null;
        AslParser.acion_return acion115 =null;

        AslParser.nota2_return nota2116 =null;

        AslParser.octal_return octal117 =null;

        AslParser.acion_return acion119 =null;

        AslParser.nota2_return nota2120 =null;

        AslParser.octal_return octal121 =null;

        AslParser.acion_return acion123 =null;

        AslParser.nota2_return nota2124 =null;

        AslParser.octal_return octal125 =null;

        AslParser.dur_return dur128 =null;


        AslTree char_literal114_tree=null;
        AslTree char_literal118_tree=null;
        AslTree char_literal122_tree=null;
        AslTree char_literal126_tree=null;
        AslTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_dur=new RewriteRuleSubtreeStream(adaptor,"rule dur");
        RewriteRuleSubtreeStream stream_octal=new RewriteRuleSubtreeStream(adaptor,"rule octal");
        RewriteRuleSubtreeStream stream_acion=new RewriteRuleSubtreeStream(adaptor,"rule acion");
        RewriteRuleSubtreeStream stream_nota2=new RewriteRuleSubtreeStream(adaptor,"rule nota2");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:10: ( '(' ( acion nota2 octal ) ',' ( acion nota2 octal ) ( ',' acion nota2 octal )* ')' ( '.' dur -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur ) | -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN ) ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:12: '(' ( acion nota2 octal ) ',' ( acion nota2 octal ) ( ',' acion nota2 octal )* ')' ( '.' dur -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur ) | -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN ) )
            {
            char_literal114=(Token)match(input,90,FOLLOW_90_in_multinota1439);  
            stream_90.add(char_literal114);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:15: ( acion nota2 octal )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:16: acion nota2 octal
            {
            pushFollow(FOLLOW_acion_in_multinota1441);
            acion115=acion();

            state._fsp--;

            stream_acion.add(acion115.getTree());

            pushFollow(FOLLOW_nota2_in_multinota1443);
            nota2116=nota2();

            state._fsp--;

            stream_nota2.add(nota2116.getTree());

            pushFollow(FOLLOW_octal_in_multinota1445);
            octal117=octal();

            state._fsp--;

            stream_octal.add(octal117.getTree());

            }


            char_literal118=(Token)match(input,92,FOLLOW_92_in_multinota1447);  
            stream_92.add(char_literal118);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:38: ( acion nota2 octal )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:39: acion nota2 octal
            {
            pushFollow(FOLLOW_acion_in_multinota1450);
            acion119=acion();

            state._fsp--;

            stream_acion.add(acion119.getTree());

            pushFollow(FOLLOW_nota2_in_multinota1452);
            nota2120=nota2();

            state._fsp--;

            stream_nota2.add(nota2120.getTree());

            pushFollow(FOLLOW_octal_in_multinota1454);
            octal121=octal();

            state._fsp--;

            stream_octal.add(octal121.getTree());

            }


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:58: ( ',' acion nota2 octal )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==92) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:59: ',' acion nota2 octal
            	    {
            	    char_literal122=(Token)match(input,92,FOLLOW_92_in_multinota1458);  
            	    stream_92.add(char_literal122);


            	    pushFollow(FOLLOW_acion_in_multinota1460);
            	    acion123=acion();

            	    state._fsp--;

            	    stream_acion.add(acion123.getTree());

            	    pushFollow(FOLLOW_nota2_in_multinota1462);
            	    nota2124=nota2();

            	    state._fsp--;

            	    stream_nota2.add(nota2124.getTree());

            	    pushFollow(FOLLOW_octal_in_multinota1464);
            	    octal125=octal();

            	    state._fsp--;

            	    stream_octal.add(octal125.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            char_literal126=(Token)match(input,91,FOLLOW_91_in_multinota1467);  
            stream_91.add(char_literal126);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:85: ( '.' dur -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur ) | -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==93) ) {
                alt24=1;
            }
            else if ( ((LA24_0 >= BECUADRO && LA24_0 <= BEMOL)||LA24_0==DO||(LA24_0 >= FA && LA24_0 <= FALL)||(LA24_0 >= HALF && LA24_0 <= IF)||LA24_0==LA||LA24_0==MI||(LA24_0 >= QUIET && LA24_0 <= RE)||(LA24_0 >= SI && LA24_0 <= SOSTENIDO)||LA24_0==TWICE||LA24_0==90||LA24_0==95||(LA24_0 >= 97 && LA24_0 <= 98)||(LA24_0 >= 115 && LA24_0 <= 116)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:86: '.' dur
                    {
                    char_literal127=(Token)match(input,93,FOLLOW_93_in_multinota1469);  
                    stream_93.add(char_literal127);


                    pushFollow(FOLLOW_dur_in_multinota1471);
                    dur128=dur();

                    state._fsp--;

                    stream_dur.add(dur128.getTree());

                    // AST REWRITE
                    // elements: acion, nota2, nota2, octal, octal, nota2, octal, acion, acion, dur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 166:94: -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:97: ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) dur )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(MULTINOTA, "MULTINOTA")
                        , root_1);

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:109: ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(LNOTAS, "LNOTAS")
                        , root_2);

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:118: ^( nota2 acion octal )
                        {
                        AslTree root_3 = (AslTree)adaptor.nil();
                        root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_acion.nextTree());

                        adaptor.addChild(root_3, stream_octal.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:139: ^( nota2 acion octal )
                        {
                        AslTree root_3 = (AslTree)adaptor.nil();
                        root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_acion.nextTree());

                        adaptor.addChild(root_3, stream_octal.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:160: ( ^( nota2 acion octal ) )*
                        while ( stream_acion.hasNext()||stream_octal.hasNext()||stream_nota2.hasNext() ) {
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:166:160: ^( nota2 acion octal )
                            {
                            AslTree root_3 = (AslTree)adaptor.nil();
                            root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                            adaptor.addChild(root_3, stream_acion.nextTree());

                            adaptor.addChild(root_3, stream_octal.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_acion.reset();
                        stream_octal.reset();
                        stream_nota2.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_dur.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:7: 
                    {
                    // AST REWRITE
                    // elements: nota2, acion, octal, octal, octal, nota2, acion, acion, nota2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 167:7: -> ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:9: ^( MULTINOTA ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* ) NURAN )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(MULTINOTA, "MULTINOTA")
                        , root_1);

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:21: ^( LNOTAS ^( nota2 acion octal ) ^( nota2 acion octal ) ( ^( nota2 acion octal ) )* )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(LNOTAS, "LNOTAS")
                        , root_2);

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:30: ^( nota2 acion octal )
                        {
                        AslTree root_3 = (AslTree)adaptor.nil();
                        root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_acion.nextTree());

                        adaptor.addChild(root_3, stream_octal.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:51: ^( nota2 acion octal )
                        {
                        AslTree root_3 = (AslTree)adaptor.nil();
                        root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                        adaptor.addChild(root_3, stream_acion.nextTree());

                        adaptor.addChild(root_3, stream_octal.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:72: ( ^( nota2 acion octal ) )*
                        while ( stream_octal.hasNext()||stream_acion.hasNext()||stream_nota2.hasNext() ) {
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:167:72: ^( nota2 acion octal )
                            {
                            AslTree root_3 = (AslTree)adaptor.nil();
                            root_3 = (AslTree)adaptor.becomeRoot(stream_nota2.nextNode(), root_3);

                            adaptor.addChild(root_3, stream_acion.nextTree());

                            adaptor.addChild(root_3, stream_octal.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_octal.reset();
                        stream_acion.reset();
                        stream_nota2.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multinota"


    public static class ite_stmt_part_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt_part"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:169:1: ite_stmt_part : IF ^ '(' ! expr ')' ! '{' ! music_atom2 '}' ! ( ELSE ! '{' ! music_atom2 '}' !)? ;
    public final AslParser.ite_stmt_part_return ite_stmt_part() throws RecognitionException {
        AslParser.ite_stmt_part_return retval = new AslParser.ite_stmt_part_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Token ELSE136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        AslParser.expr_return expr131 =null;

        AslParser.music_atom2_return music_atom2134 =null;

        AslParser.music_atom2_return music_atom2138 =null;


        AslTree IF129_tree=null;
        AslTree char_literal130_tree=null;
        AslTree char_literal132_tree=null;
        AslTree char_literal133_tree=null;
        AslTree char_literal135_tree=null;
        AslTree ELSE136_tree=null;
        AslTree char_literal137_tree=null;
        AslTree char_literal139_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:169:14: ( IF ^ '(' ! expr ')' ! '{' ! music_atom2 '}' ! ( ELSE ! '{' ! music_atom2 '}' !)? )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:169:16: IF ^ '(' ! expr ')' ! '{' ! music_atom2 '}' ! ( ELSE ! '{' ! music_atom2 '}' !)?
            {
            root_0 = (AslTree)adaptor.nil();


            IF129=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt_part1563); 
            IF129_tree = 
            (AslTree)adaptor.create(IF129)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF129_tree, root_0);


            char_literal130=(Token)match(input,90,FOLLOW_90_in_ite_stmt_part1566); 

            pushFollow(FOLLOW_expr_in_ite_stmt_part1568);
            expr131=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr131.getTree());

            char_literal132=(Token)match(input,91,FOLLOW_91_in_ite_stmt_part1569); 

            char_literal133=(Token)match(input,114,FOLLOW_114_in_ite_stmt_part1572); 

            pushFollow(FOLLOW_music_atom2_in_ite_stmt_part1575);
            music_atom2134=music_atom2();

            state._fsp--;

            adaptor.addChild(root_0, music_atom2134.getTree());

            char_literal135=(Token)match(input,116,FOLLOW_116_in_ite_stmt_part1577); 

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:169:55: ( ELSE ! '{' ! music_atom2 '}' !)?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ELSE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:169:56: ELSE ! '{' ! music_atom2 '}' !
                    {
                    ELSE136=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt_part1581); 

                    char_literal137=(Token)match(input,114,FOLLOW_114_in_ite_stmt_part1584); 

                    pushFollow(FOLLOW_music_atom2_in_ite_stmt_part1587);
                    music_atom2138=music_atom2();

                    state._fsp--;

                    adaptor.addChild(root_0, music_atom2138.getTree());

                    char_literal139=(Token)match(input,116,FOLLOW_116_in_ite_stmt_part1590); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt_part"


    public static class triet_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triet"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:1: triet : '[' ( trietom )+ ']' -> ^( TRI ( trietom )+ ) ;
    public final AslParser.triet_return triet() throws RecognitionException {
        AslParser.triet_return retval = new AslParser.triet_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal140=null;
        Token char_literal142=null;
        AslParser.trietom_return trietom141 =null;


        AslTree char_literal140_tree=null;
        AslTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleSubtreeStream stream_trietom=new RewriteRuleSubtreeStream(adaptor,"rule trietom");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:7: ( '[' ( trietom )+ ']' -> ^( TRI ( trietom )+ ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:9: '[' ( trietom )+ ']'
            {
            char_literal140=(Token)match(input,97,FOLLOW_97_in_triet1626);  
            stream_97.add(char_literal140);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:13: ( trietom )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0 >= BECUADRO && LA26_0 <= BEMOL)||LA26_0==DO||(LA26_0 >= FA && LA26_0 <= FALL)||(LA26_0 >= HALF && LA26_0 <= ID)||LA26_0==LA||LA26_0==MI||(LA26_0 >= QUIET && LA26_0 <= RE)||(LA26_0 >= SI && LA26_0 <= SOSTENIDO)||LA26_0==TWICE||LA26_0==90) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:14: trietom
            	    {
            	    pushFollow(FOLLOW_trietom_in_triet1629);
            	    trietom141=trietom();

            	    state._fsp--;

            	    stream_trietom.add(trietom141.getTree());

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


            char_literal142=(Token)match(input,98,FOLLOW_98_in_triet1632);  
            stream_98.add(char_literal142);


            // AST REWRITE
            // elements: trietom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 172:27: -> ^( TRI ( trietom )+ )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:172:30: ^( TRI ( trietom )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(TRI, "TRI")
                , root_1);

                if ( !(stream_trietom.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_trietom.hasNext() ) {
                    adaptor.addChild(root_1, stream_trietom.nextTree());

                }
                stream_trietom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triet"


    public static class trietom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trietom"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:174:1: trietom : ( nmusiop2 | multinota );
    public final AslParser.trietom_return trietom() throws RecognitionException {
        AslParser.trietom_return retval = new AslParser.trietom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.nmusiop2_return nmusiop2143 =null;

        AslParser.multinota_return multinota144 =null;



        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:174:9: ( nmusiop2 | multinota )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0 >= BECUADRO && LA27_0 <= BEMOL)||LA27_0==DO||(LA27_0 >= FA && LA27_0 <= FALL)||(LA27_0 >= HALF && LA27_0 <= ID)||LA27_0==LA||LA27_0==MI||(LA27_0 >= QUIET && LA27_0 <= RE)||(LA27_0 >= SI && LA27_0 <= SOSTENIDO)||LA27_0==TWICE) ) {
                alt27=1;
            }
            else if ( (LA27_0==90) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:174:11: nmusiop2
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_nmusiop2_in_trietom1651);
                    nmusiop2143=nmusiop2();

                    state._fsp--;

                    adaptor.addChild(root_0, nmusiop2143.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:174:20: multinota
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_multinota_in_trietom1653);
                    multinota144=multinota();

                    state._fsp--;

                    adaptor.addChild(root_0, multinota144.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "trietom"


    public static class l_notas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "l_notas"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:1: l_notas : ( ( '|' ! music_atom2 )+ '|' !) ;
    public final AslParser.l_notas_return l_notas() throws RecognitionException {
        AslParser.l_notas_return retval = new AslParser.l_notas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        AslParser.music_atom2_return music_atom2146 =null;


        AslTree char_literal145_tree=null;
        AslTree char_literal147_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:9: ( ( ( '|' ! music_atom2 )+ '|' !) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:11: ( ( '|' ! music_atom2 )+ '|' !)
            {
            root_0 = (AslTree)adaptor.nil();


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:11: ( ( '|' ! music_atom2 )+ '|' !)
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:12: ( '|' ! music_atom2 )+ '|' !
            {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:12: ( '|' ! music_atom2 )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==115) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==ID) ) {
                        int LA28_3 = input.LA(3);

                        if ( ((LA28_3 >= BECUADRO && LA28_3 <= BEMOL)||LA28_3==DO||(LA28_3 >= FA && LA28_3 <= FALL)||(LA28_3 >= HALF && LA28_3 <= IF)||LA28_3==LA||LA28_3==MI||(LA28_3 >= QUIET && LA28_3 <= RE)||(LA28_3 >= SI && LA28_3 <= SOSTENIDO)||LA28_3==TWICE||LA28_3==90||LA28_3==97||LA28_3==115) ) {
                            alt28=1;
                        }


                    }
                    else if ( ((LA28_1 >= BECUADRO && LA28_1 <= BEMOL)||LA28_1==DO||(LA28_1 >= FA && LA28_1 <= FALL)||LA28_1==HALF||LA28_1==IF||LA28_1==LA||LA28_1==MI||(LA28_1 >= QUIET && LA28_1 <= RE)||(LA28_1 >= SI && LA28_1 <= SOSTENIDO)||LA28_1==TWICE||LA28_1==90||LA28_1==97) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:177:13: '|' ! music_atom2
            	    {
            	    char_literal145=(Token)match(input,115,FOLLOW_115_in_l_notas1664); 

            	    pushFollow(FOLLOW_music_atom2_in_l_notas1667);
            	    music_atom2146=music_atom2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, music_atom2146.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            char_literal147=(Token)match(input,115,FOLLOW_115_in_l_notas1670); 

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "l_notas"


    public static class l_notas2_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "l_notas2"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:1: l_notas2 : ( ( l_notas ) ( music_compjp )? | music_compjp );
    public final AslParser.l_notas2_return l_notas2() throws RecognitionException {
        AslParser.l_notas2_return retval = new AslParser.l_notas2_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.l_notas_return l_notas148 =null;

        AslParser.music_compjp_return music_compjp149 =null;

        AslParser.music_compjp_return music_compjp150 =null;



        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:9: ( ( l_notas ) ( music_compjp )? | music_compjp )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==115) ) {
                alt30=1;
            }
            else if ( (LA30_0==ID||LA30_0==INT||LA30_0==OCT) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:12: ( l_notas ) ( music_compjp )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:12: ( l_notas )
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:13: l_notas
                    {
                    pushFollow(FOLLOW_l_notas_in_l_notas21682);
                    l_notas148=l_notas();

                    state._fsp--;

                    adaptor.addChild(root_0, l_notas148.getTree());

                    }


                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:22: ( music_compjp )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ID||LA29_0==INT||LA29_0==OCT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:179:22: music_compjp
                            {
                            pushFollow(FOLLOW_music_compjp_in_l_notas21685);
                            music_compjp149=music_compjp();

                            state._fsp--;

                            adaptor.addChild(root_0, music_compjp149.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:180:5: music_compjp
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_music_compjp_in_l_notas21692);
                    music_compjp150=music_compjp();

                    state._fsp--;

                    adaptor.addChild(root_0, music_compjp150.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "l_notas2"


    public static class l_notas3_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "l_notas3"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:1: l_notas3 : VOICE ( instrumento l_notas2 -> ^( instrumento l_notas2 ) | l_notas2 -> ^( PIANO[\"Piano\"] l_notas2 ) ) ;
    public final AslParser.l_notas3_return l_notas3() throws RecognitionException {
        AslParser.l_notas3_return retval = new AslParser.l_notas3_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token VOICE151=null;
        AslParser.instrumento_return instrumento152 =null;

        AslParser.l_notas2_return l_notas2153 =null;

        AslParser.l_notas2_return l_notas2154 =null;


        AslTree VOICE151_tree=null;
        RewriteRuleTokenStream stream_VOICE=new RewriteRuleTokenStream(adaptor,"token VOICE");
        RewriteRuleSubtreeStream stream_l_notas2=new RewriteRuleSubtreeStream(adaptor,"rule l_notas2");
        RewriteRuleSubtreeStream stream_instrumento=new RewriteRuleSubtreeStream(adaptor,"rule instrumento");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:9: ( VOICE ( instrumento l_notas2 -> ^( instrumento l_notas2 ) | l_notas2 -> ^( PIANO[\"Piano\"] l_notas2 ) ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:12: VOICE ( instrumento l_notas2 -> ^( instrumento l_notas2 ) | l_notas2 -> ^( PIANO[\"Piano\"] l_notas2 ) )
            {
            VOICE151=(Token)match(input,VOICE,FOLLOW_VOICE_in_l_notas31703);  
            stream_VOICE.add(VOICE151);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:18: ( instrumento l_notas2 -> ^( instrumento l_notas2 ) | l_notas2 -> ^( PIANO[\"Piano\"] l_notas2 ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FLAUTA||LA31_0==GUITARRA||LA31_0==ORGANO||(LA31_0 >= PERCUSION && LA31_0 <= PIANO)||(LA31_0 >= SAXO && LA31_0 <= SHOT)||LA31_0==TROMPA||LA31_0==VIOLA||LA31_0==XILOFONO) ) {
                alt31=1;
            }
            else if ( (LA31_0==ID||LA31_0==INT||LA31_0==OCT||LA31_0==115) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:19: instrumento l_notas2
                    {
                    pushFollow(FOLLOW_instrumento_in_l_notas31706);
                    instrumento152=instrumento();

                    state._fsp--;

                    stream_instrumento.add(instrumento152.getTree());

                    pushFollow(FOLLOW_l_notas2_in_l_notas31708);
                    l_notas2153=l_notas2();

                    state._fsp--;

                    stream_l_notas2.add(l_notas2153.getTree());

                    // AST REWRITE
                    // elements: instrumento, l_notas2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 183:39: -> ^( instrumento l_notas2 )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:183:42: ^( instrumento l_notas2 )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(stream_instrumento.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_l_notas2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:184:4: l_notas2
                    {
                    pushFollow(FOLLOW_l_notas2_in_l_notas31720);
                    l_notas2154=l_notas2();

                    state._fsp--;

                    stream_l_notas2.add(l_notas2154.getTree());

                    // AST REWRITE
                    // elements: l_notas2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 184:13: -> ^( PIANO[\"Piano\"] l_notas2 )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:184:15: ^( PIANO[\"Piano\"] l_notas2 )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PIANO, "Piano")
                        , root_1);

                        adaptor.addChild(root_1, stream_l_notas2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "l_notas3"


    public static class l_notas4_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "l_notas4"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:185:1: l_notas4 : ( CHORUS ^ '{' ! l_notas3 ( l_notas3 )+ '}' !| l_notas3 );
    public final AslParser.l_notas4_return l_notas4() throws RecognitionException {
        AslParser.l_notas4_return retval = new AslParser.l_notas4_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CHORUS155=null;
        Token char_literal156=null;
        Token char_literal159=null;
        AslParser.l_notas3_return l_notas3157 =null;

        AslParser.l_notas3_return l_notas3158 =null;

        AslParser.l_notas3_return l_notas3160 =null;


        AslTree CHORUS155_tree=null;
        AslTree char_literal156_tree=null;
        AslTree char_literal159_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:185:9: ( CHORUS ^ '{' ! l_notas3 ( l_notas3 )+ '}' !| l_notas3 )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CHORUS) ) {
                alt33=1;
            }
            else if ( (LA33_0==VOICE) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:185:12: CHORUS ^ '{' ! l_notas3 ( l_notas3 )+ '}' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CHORUS155=(Token)match(input,CHORUS,FOLLOW_CHORUS_in_l_notas41736); 
                    CHORUS155_tree = 
                    (AslTree)adaptor.create(CHORUS155)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CHORUS155_tree, root_0);


                    char_literal156=(Token)match(input,114,FOLLOW_114_in_l_notas41739); 

                    pushFollow(FOLLOW_l_notas3_in_l_notas41742);
                    l_notas3157=l_notas3();

                    state._fsp--;

                    adaptor.addChild(root_0, l_notas3157.getTree());

                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:185:34: ( l_notas3 )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==VOICE) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:185:34: l_notas3
                    	    {
                    	    pushFollow(FOLLOW_l_notas3_in_l_notas41744);
                    	    l_notas3158=l_notas3();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, l_notas3158.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    char_literal159=(Token)match(input,116,FOLLOW_116_in_l_notas41747); 

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:186:4: l_notas3
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_l_notas3_in_l_notas41753);
                    l_notas3160=l_notas3();

                    state._fsp--;

                    adaptor.addChild(root_0, l_notas3160.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "l_notas4"


    public static class music_compjp_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "music_compjp"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:1: music_compjp : repit ( ( music_atom2 '|' !) | repit )* ;
    public final AslParser.music_compjp_return music_compjp() throws RecognitionException {
        AslParser.music_compjp_return retval = new AslParser.music_compjp_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal163=null;
        AslParser.repit_return repit161 =null;

        AslParser.music_atom2_return music_atom2162 =null;

        AslParser.repit_return repit164 =null;


        AslTree char_literal163_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:14: ( repit ( ( music_atom2 '|' !) | repit )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:16: repit ( ( music_atom2 '|' !) | repit )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_repit_in_music_compjp1761);
            repit161=repit();

            state._fsp--;

            adaptor.addChild(root_0, repit161.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:22: ( ( music_atom2 '|' !) | repit )*
            loop34:
            do {
                int alt34=3;
                switch ( input.LA(1) ) {
                case BECUADRO:
                case BEMOL:
                case DO:
                case FA:
                case FALL:
                case HALF:
                case IF:
                case LA:
                case MI:
                case QUIET:
                case RAISE:
                case RE:
                case SI:
                case SOL:
                case SOSTENIDO:
                case TWICE:
                case 90:
                case 97:
                    {
                    alt34=1;
                    }
                    break;
                case ID:
                    {
                    int LA34_3 = input.LA(2);

                    if ( ((LA34_3 >= BECUADRO && LA34_3 <= BEMOL)||LA34_3==DO||(LA34_3 >= FA && LA34_3 <= FALL)||(LA34_3 >= HALF && LA34_3 <= IF)||LA34_3==LA||LA34_3==MI||(LA34_3 >= QUIET && LA34_3 <= RE)||(LA34_3 >= SI && LA34_3 <= SOSTENIDO)||LA34_3==TWICE||LA34_3==90||LA34_3==97||LA34_3==115) ) {
                        alt34=1;
                    }
                    else if ( (LA34_3==113) ) {
                        alt34=2;
                    }


                    }
                    break;
                case INT:
                case OCT:
                    {
                    alt34=2;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:23: ( music_atom2 '|' !)
            	    {
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:23: ( music_atom2 '|' !)
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:24: music_atom2 '|' !
            	    {
            	    pushFollow(FOLLOW_music_atom2_in_music_compjp1765);
            	    music_atom2162=music_atom2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, music_atom2162.getTree());

            	    char_literal163=(Token)match(input,115,FOLLOW_115_in_music_compjp1767); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:188:42: repit
            	    {
            	    pushFollow(FOLLOW_repit_in_music_compjp1771);
            	    repit164=repit();

            	    state._fsp--;

            	    adaptor.addChild(root_0, repit164.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "music_compjp"


    public static class repit_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "repit"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:1: repit : numatom 'z||:' ( music_atom2 ) ( '|' music_atom2 )* ':||' -> ^( REPEAT numatom music_atom2 ( music_atom2 )* ) ;
    public final AslParser.repit_return repit() throws RecognitionException {
        AslParser.repit_return retval = new AslParser.repit_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token string_literal166=null;
        Token char_literal168=null;
        Token string_literal170=null;
        AslParser.numatom_return numatom165 =null;

        AslParser.music_atom2_return music_atom2167 =null;

        AslParser.music_atom2_return music_atom2169 =null;


        AslTree string_literal166_tree=null;
        AslTree char_literal168_tree=null;
        AslTree string_literal170_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_numatom=new RewriteRuleSubtreeStream(adaptor,"rule numatom");
        RewriteRuleSubtreeStream stream_music_atom2=new RewriteRuleSubtreeStream(adaptor,"rule music_atom2");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:7: ( numatom 'z||:' ( music_atom2 ) ( '|' music_atom2 )* ':||' -> ^( REPEAT numatom music_atom2 ( music_atom2 )* ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:9: numatom 'z||:' ( music_atom2 ) ( '|' music_atom2 )* ':||'
            {
            pushFollow(FOLLOW_numatom_in_repit1782);
            numatom165=numatom();

            state._fsp--;

            stream_numatom.add(numatom165.getTree());

            string_literal166=(Token)match(input,113,FOLLOW_113_in_repit1784);  
            stream_113.add(string_literal166);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:24: ( music_atom2 )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:25: music_atom2
            {
            pushFollow(FOLLOW_music_atom2_in_repit1787);
            music_atom2167=music_atom2();

            state._fsp--;

            stream_music_atom2.add(music_atom2167.getTree());

            }


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:38: ( '|' music_atom2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==115) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:39: '|' music_atom2
            	    {
            	    char_literal168=(Token)match(input,115,FOLLOW_115_in_repit1791);  
            	    stream_115.add(char_literal168);


            	    pushFollow(FOLLOW_music_atom2_in_repit1793);
            	    music_atom2169=music_atom2();

            	    state._fsp--;

            	    stream_music_atom2.add(music_atom2169.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            string_literal170=(Token)match(input,95,FOLLOW_95_in_repit1797);  
            stream_95.add(string_literal170);


            // AST REWRITE
            // elements: music_atom2, music_atom2, numatom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 190:63: -> ^( REPEAT numatom music_atom2 ( music_atom2 )* )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:66: ^( REPEAT numatom music_atom2 ( music_atom2 )* )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(REPEAT, "REPEAT")
                , root_1);

                adaptor.addChild(root_1, stream_numatom.nextTree());

                adaptor.addChild(root_1, stream_music_atom2.nextTree());

                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:190:96: ( music_atom2 )*
                while ( stream_music_atom2.hasNext() ) {
                    adaptor.addChild(root_1, stream_music_atom2.nextTree());

                }
                stream_music_atom2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "repit"


    public static class partitura_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitura"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:192:1: partitura : beatbox speederman ( trans ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) ) | armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* ) ) ;
    public final AslParser.partitura_return partitura() throws RecognitionException {
        AslParser.partitura_return retval = new AslParser.partitura_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.beatbox_return beatbox171 =null;

        AslParser.speederman_return speederman172 =null;

        AslParser.trans_return trans173 =null;

        AslParser.armour_return armour174 =null;

        AslParser.l_notas4_return l_notas4175 =null;

        AslParser.l_notas4_return l_notas4176 =null;

        AslParser.armour_return armour177 =null;

        AslParser.l_notas4_return l_notas4178 =null;

        AslParser.l_notas4_return l_notas4179 =null;


        RewriteRuleSubtreeStream stream_l_notas4=new RewriteRuleSubtreeStream(adaptor,"rule l_notas4");
        RewriteRuleSubtreeStream stream_speederman=new RewriteRuleSubtreeStream(adaptor,"rule speederman");
        RewriteRuleSubtreeStream stream_beatbox=new RewriteRuleSubtreeStream(adaptor,"rule beatbox");
        RewriteRuleSubtreeStream stream_trans=new RewriteRuleSubtreeStream(adaptor,"rule trans");
        RewriteRuleSubtreeStream stream_armour=new RewriteRuleSubtreeStream(adaptor,"rule armour");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:192:11: ( beatbox speederman ( trans ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) ) | armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* ) ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:192:13: beatbox speederman ( trans ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) ) | armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* ) )
            {
            pushFollow(FOLLOW_beatbox_in_partitura1820);
            beatbox171=beatbox();

            state._fsp--;

            stream_beatbox.add(beatbox171.getTree());

            pushFollow(FOLLOW_speederman_in_partitura1822);
            speederman172=speederman();

            state._fsp--;

            stream_speederman.add(speederman172.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:3: ( trans ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) ) | armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case TRANSPORT:
                {
                alt41=1;
                }
                break;
            case ARMOR:
                {
                alt41=2;
                }
                break;
            case CHORUS:
            case VOICE:
            case 96:
            case 116:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:4: trans ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) )
                    {
                    pushFollow(FOLLOW_trans_in_partitura1828);
                    trans173=trans();

                    state._fsp--;

                    stream_trans.add(trans173.getTree());

                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:10: ( armour ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* ) | ( l_notas4 )* -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ARMOR) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==CHORUS||LA38_0==VOICE||LA38_0==96||LA38_0==116) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:11: armour ( l_notas4 )*
                            {
                            pushFollow(FOLLOW_armour_in_partitura1831);
                            armour174=armour();

                            state._fsp--;

                            stream_armour.add(armour174.getTree());

                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:18: ( l_notas4 )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==CHORUS||LA36_0==VOICE) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:18: l_notas4
                            	    {
                            	    pushFollow(FOLLOW_l_notas4_in_partitura1833);
                            	    l_notas4175=l_notas4();

                            	    state._fsp--;

                            	    stream_l_notas4.add(l_notas4175.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            // AST REWRITE
                            // elements: trans, armour, speederman, beatbox, l_notas4
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 193:28: -> ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:31: ^( PARTITURA beatbox speederman trans armour ( l_notas4 )* )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(PARTITURA, "PARTITURA")
                                , root_1);

                                adaptor.addChild(root_1, stream_beatbox.nextTree());

                                adaptor.addChild(root_1, stream_speederman.nextTree());

                                adaptor.addChild(root_1, stream_trans.nextTree());

                                adaptor.addChild(root_1, stream_armour.nextTree());

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:193:75: ( l_notas4 )*
                                while ( stream_l_notas4.hasNext() ) {
                                    adaptor.addChild(root_1, stream_l_notas4.nextTree());

                                }
                                stream_l_notas4.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:6: ( l_notas4 )*
                            {
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:6: ( l_notas4 )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==CHORUS||LA37_0==VOICE) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:6: l_notas4
                            	    {
                            	    pushFollow(FOLLOW_l_notas4_in_partitura1858);
                            	    l_notas4176=l_notas4();

                            	    state._fsp--;

                            	    stream_l_notas4.add(l_notas4176.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            // AST REWRITE
                            // elements: l_notas4, speederman, trans, beatbox
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (AslTree)adaptor.nil();
                            // 194:15: -> ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* )
                            {
                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:17: ^( PARTITURA beatbox speederman trans ^( ARMOR NURAN ) ( l_notas4 )* )
                                {
                                AslTree root_1 = (AslTree)adaptor.nil();
                                root_1 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(PARTITURA, "PARTITURA")
                                , root_1);

                                adaptor.addChild(root_1, stream_beatbox.nextTree());

                                adaptor.addChild(root_1, stream_speederman.nextTree());

                                adaptor.addChild(root_1, stream_trans.nextTree());

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:54: ^( ARMOR NURAN )
                                {
                                AslTree root_2 = (AslTree)adaptor.nil();
                                root_2 = (AslTree)adaptor.becomeRoot(
                                (AslTree)adaptor.create(ARMOR, "ARMOR")
                                , root_2);

                                adaptor.addChild(root_2, 
                                (AslTree)adaptor.create(NURAN, "NURAN")
                                );

                                adaptor.addChild(root_1, root_2);
                                }

                                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:194:69: ( l_notas4 )*
                                while ( stream_l_notas4.hasNext() ) {
                                    adaptor.addChild(root_1, stream_l_notas4.nextTree());

                                }
                                stream_l_notas4.reset();

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:5: armour ( l_notas4 )*
                    {
                    pushFollow(FOLLOW_armour_in_partitura1885);
                    armour177=armour();

                    state._fsp--;

                    stream_armour.add(armour177.getTree());

                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:12: ( l_notas4 )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==CHORUS||LA39_0==VOICE) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:12: l_notas4
                    	    {
                    	    pushFollow(FOLLOW_l_notas4_in_partitura1887);
                    	    l_notas4178=l_notas4();

                    	    state._fsp--;

                    	    stream_l_notas4.add(l_notas4178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: l_notas4, beatbox, speederman, armour
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 195:21: -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:23: ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) armour ( l_notas4 )* )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PARTITURA, "PARTITURA")
                        , root_1);

                        adaptor.addChild(root_1, stream_beatbox.nextTree());

                        adaptor.addChild(root_1, stream_speederman.nextTree());

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:54: ^( TRANSPORT INT[\"0\"] )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(TRANSPORT, "TRANSPORT")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (AslTree)adaptor.create(INT, "0")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_armour.nextTree());

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:195:83: ( l_notas4 )*
                        while ( stream_l_notas4.hasNext() ) {
                            adaptor.addChild(root_1, stream_l_notas4.nextTree());

                        }
                        stream_l_notas4.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:5: ( l_notas4 )*
                    {
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:5: ( l_notas4 )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==CHORUS||LA40_0==VOICE) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:5: l_notas4
                    	    {
                    	    pushFollow(FOLLOW_l_notas4_in_partitura1914);
                    	    l_notas4179=l_notas4();

                    	    state._fsp--;

                    	    stream_l_notas4.add(l_notas4179.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: beatbox, speederman, l_notas4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 196:14: -> ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:16: ^( PARTITURA beatbox speederman ^( TRANSPORT INT[\"0\"] ) ^( ARMOR NURAN ) ( l_notas4 )* )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PARTITURA, "PARTITURA")
                        , root_1);

                        adaptor.addChild(root_1, stream_beatbox.nextTree());

                        adaptor.addChild(root_1, stream_speederman.nextTree());

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:47: ^( TRANSPORT INT[\"0\"] )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(TRANSPORT, "TRANSPORT")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (AslTree)adaptor.create(INT, "0")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:69: ^( ARMOR NURAN )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARMOR, "ARMOR")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (AslTree)adaptor.create(NURAN, "NURAN")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:196:84: ( l_notas4 )*
                        while ( stream_l_notas4.hasNext() ) {
                            adaptor.addChild(root_1, stream_l_notas4.nextTree());

                        }
                        stream_l_notas4.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "partitura"


    public static class for_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:199:1: for_stmt : FOR '(' assign ';' expr ';' assign ')' '{' block_instructions '}' -> ^( FOR ^( FCONDS assign expr assign ) block_instructions ) ;
    public final AslParser.for_stmt_return for_stmt() throws RecognitionException {
        AslParser.for_stmt_return retval = new AslParser.for_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FOR180=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal185=null;
        Token char_literal187=null;
        Token char_literal188=null;
        Token char_literal190=null;
        AslParser.assign_return assign182 =null;

        AslParser.expr_return expr184 =null;

        AslParser.assign_return assign186 =null;

        AslParser.block_instructions_return block_instructions189 =null;


        AslTree FOR180_tree=null;
        AslTree char_literal181_tree=null;
        AslTree char_literal183_tree=null;
        AslTree char_literal185_tree=null;
        AslTree char_literal187_tree=null;
        AslTree char_literal188_tree=null;
        AslTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_block_instructions=new RewriteRuleSubtreeStream(adaptor,"rule block_instructions");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:199:10: ( FOR '(' assign ';' expr ';' assign ')' '{' block_instructions '}' -> ^( FOR ^( FCONDS assign expr assign ) block_instructions ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:199:12: FOR '(' assign ';' expr ';' assign ')' '{' block_instructions '}'
            {
            FOR180=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1951);  
            stream_FOR.add(FOR180);


            char_literal181=(Token)match(input,90,FOLLOW_90_in_for_stmt1953);  
            stream_90.add(char_literal181);


            pushFollow(FOLLOW_assign_in_for_stmt1955);
            assign182=assign();

            state._fsp--;

            stream_assign.add(assign182.getTree());

            char_literal183=(Token)match(input,96,FOLLOW_96_in_for_stmt1957);  
            stream_96.add(char_literal183);


            pushFollow(FOLLOW_expr_in_for_stmt1959);
            expr184=expr();

            state._fsp--;

            stream_expr.add(expr184.getTree());

            char_literal185=(Token)match(input,96,FOLLOW_96_in_for_stmt1961);  
            stream_96.add(char_literal185);


            pushFollow(FOLLOW_assign_in_for_stmt1963);
            assign186=assign();

            state._fsp--;

            stream_assign.add(assign186.getTree());

            char_literal187=(Token)match(input,91,FOLLOW_91_in_for_stmt1965);  
            stream_91.add(char_literal187);


            char_literal188=(Token)match(input,114,FOLLOW_114_in_for_stmt1967);  
            stream_114.add(char_literal188);


            pushFollow(FOLLOW_block_instructions_in_for_stmt1969);
            block_instructions189=block_instructions();

            state._fsp--;

            stream_block_instructions.add(block_instructions189.getTree());

            char_literal190=(Token)match(input,116,FOLLOW_116_in_for_stmt1971);  
            stream_116.add(char_literal190);


            // AST REWRITE
            // elements: assign, FOR, expr, block_instructions, assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 199:78: -> ^( FOR ^( FCONDS assign expr assign ) block_instructions )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:199:81: ^( FOR ^( FCONDS assign expr assign ) block_instructions )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                stream_FOR.nextNode()
                , root_1);

                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:199:88: ^( FCONDS assign expr assign )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FCONDS, "FCONDS")
                , root_2);

                adaptor.addChild(root_2, stream_assign.nextTree());

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_2, stream_assign.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_block_instructions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:201:1: while_stmt : WHILE ^ expr '{' block_instructions '}' !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE191=null;
        Token char_literal193=null;
        Token char_literal195=null;
        AslParser.expr_return expr192 =null;

        AslParser.block_instructions_return block_instructions194 =null;


        AslTree WHILE191_tree=null;
        AslTree char_literal193_tree=null;
        AslTree char_literal195_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:201:12: ( WHILE ^ expr '{' block_instructions '}' !)
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:201:14: WHILE ^ expr '{' block_instructions '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE191=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1998); 
            WHILE191_tree = 
            (AslTree)adaptor.create(WHILE191)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE191_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt2001);
            expr192=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr192.getTree());

            char_literal193=(Token)match(input,114,FOLLOW_114_in_while_stmt2003); 
            char_literal193_tree = 
            (AslTree)adaptor.create(char_literal193)
            ;
            adaptor.addChild(root_0, char_literal193_tree);


            pushFollow(FOLLOW_block_instructions_in_while_stmt2005);
            block_instructions194=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions194.getTree());

            char_literal195=(Token)match(input,116,FOLLOW_116_in_while_stmt2007); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:204:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN196=null;
        AslParser.expr_return expr197 =null;


        AslTree RETURN196_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:204:13: ( RETURN ^ ( expr )? )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:204:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN196=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt2029); 
            RETURN196_tree = 
            (AslTree)adaptor.create(RETURN196)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN196_tree, root_0);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:204:23: ( expr )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==FALSE||LA42_0==ID||LA42_0==INT||LA42_0==MINUS||LA42_0==NOT||LA42_0==OCT||LA42_0==PLUS||LA42_0==TRUE||LA42_0==90) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:204:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt2032);
                    expr197=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr197.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:207:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ198=null;
        Token ID199=null;

        AslTree READ198_tree=null;
        AslTree ID199_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:207:6: ( READ ^ ID )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:207:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ198=(Token)match(input,READ,FOLLOW_READ_in_read2050); 
            READ198_tree = 
            (AslTree)adaptor.create(READ198)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ198_tree, root_0);


            ID199=(Token)match(input,ID,FOLLOW_ID_in_read2053); 
            ID199_tree = 
            (AslTree)adaptor.create(ID199)
            ;
            adaptor.addChild(root_0, ID199_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE200=null;
        Token STRING202=null;
        AslParser.expr_return expr201 =null;


        AslTree WRITE200_tree=null;
        AslTree STRING202_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:7: ( WRITE ^ ( expr | STRING ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE200=(Token)match(input,WRITE,FOLLOW_WRITE_in_write2072); 
            WRITE200_tree = 
            (AslTree)adaptor.create(WRITE200)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE200_tree, root_0);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:18: ( expr | STRING )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==FALSE||LA43_0==ID||LA43_0==INT||LA43_0==MINUS||LA43_0==NOT||LA43_0==OCT||LA43_0==PLUS||LA43_0==TRUE||LA43_0==90) ) {
                alt43=1;
            }
            else if ( (LA43_0==STRING) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write2076);
                    expr201=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr201.getTree());

                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:210:26: STRING
                    {
                    STRING202=(Token)match(input,STRING,FOLLOW_STRING_in_write2080); 
                    STRING202_tree = 
                    (AslTree)adaptor.create(STRING202)
                    ;
                    adaptor.addChild(root_0, STRING202_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:213:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR204=null;
        AslParser.boolterm_return boolterm203 =null;

        AslParser.boolterm_return boolterm205 =null;


        AslTree OR204_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:213:9: ( boolterm ( OR ^ boolterm )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:213:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2104);
            boolterm203=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm203.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:213:22: ( OR ^ boolterm )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==OR) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:213:23: OR ^ boolterm
            	    {
            	    OR204=(Token)match(input,OR,FOLLOW_OR_in_expr2107); 
            	    OR204_tree = 
            	    (AslTree)adaptor.create(OR204)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR204_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2110);
            	    boolterm205=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm205.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:216:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND207=null;
        AslParser.boolfact_return boolfact206 =null;

        AslParser.boolfact_return boolfact208 =null;


        AslTree AND207_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:216:9: ( boolfact ( AND ^ boolfact )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:216:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2130);
            boolfact206=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact206.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:216:22: ( AND ^ boolfact )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==AND) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:216:23: AND ^ boolfact
            	    {
            	    AND207=(Token)match(input,AND,FOLLOW_AND_in_boolterm2133); 
            	    AND207_tree = 
            	    (AslTree)adaptor.create(AND207)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND207_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2136);
            	    boolfact208=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact208.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL210=null;
        Token NOT_EQUAL211=null;
        Token LT212=null;
        Token LE213=null;
        Token GT214=null;
        Token GE215=null;
        AslParser.num_expr_return num_expr209 =null;

        AslParser.num_expr_return num_expr216 =null;


        AslTree EQUAL210_tree=null;
        AslTree NOT_EQUAL211_tree=null;
        AslTree LT212_tree=null;
        AslTree LE213_tree=null;
        AslTree GT214_tree=null;
        AslTree GE215_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2156);
            num_expr209=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr209.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==EQUAL||(LA47_0 >= GE && LA47_0 <= GT)||LA47_0==LE||LA47_0==LT||LA47_0==NOT_EQUAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt46=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt46=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt46=2;
                        }
                        break;
                    case LT:
                        {
                        alt46=3;
                        }
                        break;
                    case LE:
                        {
                        alt46=4;
                        }
                        break;
                    case GT:
                        {
                        alt46=5;
                        }
                        break;
                    case GE:
                        {
                        alt46=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }

                    switch (alt46) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:24: EQUAL ^
                            {
                            EQUAL210=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2160); 
                            EQUAL210_tree = 
                            (AslTree)adaptor.create(EQUAL210)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL210_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL211=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2165); 
                            NOT_EQUAL211_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL211)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL211_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:46: LT ^
                            {
                            LT212=(Token)match(input,LT,FOLLOW_LT_in_boolfact2170); 
                            LT212_tree = 
                            (AslTree)adaptor.create(LT212)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT212_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:52: LE ^
                            {
                            LE213=(Token)match(input,LE,FOLLOW_LE_in_boolfact2175); 
                            LE213_tree = 
                            (AslTree)adaptor.create(LE213)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE213_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:58: GT ^
                            {
                            GT214=(Token)match(input,GT,FOLLOW_GT_in_boolfact2180); 
                            GT214_tree = 
                            (AslTree)adaptor.create(GT214)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT214_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:219:64: GE ^
                            {
                            GE215=(Token)match(input,GE,FOLLOW_GE_in_boolfact2185); 
                            GE215_tree = 
                            (AslTree)adaptor.create(GE215)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE215_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2189);
                    num_expr216=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr216.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS218=null;
        Token MINUS219=null;
        AslParser.term_return term217 =null;

        AslParser.term_return term220 =null;


        AslTree PLUS218_tree=null;
        AslTree MINUS219_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2209);
            term217=term();

            state._fsp--;

            adaptor.addChild(root_0, term217.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:18: ( ( PLUS ^| MINUS ^) term )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==MINUS||LA49_0==PLUS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:20: ( PLUS ^| MINUS ^)
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==PLUS) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==MINUS) ) {
            	        alt48=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:21: PLUS ^
            	            {
            	            PLUS218=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2214); 
            	            PLUS218_tree = 
            	            (AslTree)adaptor.create(PLUS218)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS218_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:222:29: MINUS ^
            	            {
            	            MINUS219=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2219); 
            	            MINUS219_tree = 
            	            (AslTree)adaptor.create(MINUS219)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS219_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2223);
            	    term220=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term220.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL222=null;
        Token DIV223=null;
        Token MOD224=null;
        AslParser.factor_return factor221 =null;

        AslParser.factor_return factor225 =null;


        AslTree MUL222_tree=null;
        AslTree DIV223_tree=null;
        AslTree MOD224_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2247);
            factor221=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor221.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==DIV||(LA51_0 >= MOD && LA51_0 <= MUL)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt50=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:23: MUL ^
            	            {
            	            MUL222=(Token)match(input,MUL,FOLLOW_MUL_in_term2252); 
            	            MUL222_tree = 
            	            (AslTree)adaptor.create(MUL222)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL222_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:30: DIV ^
            	            {
            	            DIV223=(Token)match(input,DIV,FOLLOW_DIV_in_term2257); 
            	            DIV223_tree = 
            	            (AslTree)adaptor.create(DIV223)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV223_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:225:37: MOD ^
            	            {
            	            MOD224=(Token)match(input,MOD,FOLLOW_MOD_in_term2262); 
            	            MOD224_tree = 
            	            (AslTree)adaptor.create(MOD224)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD224_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2266);
            	    factor225=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor225.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT226=null;
        Token PLUS227=null;
        Token MINUS228=null;
        AslParser.atom_return atom229 =null;


        AslTree NOT226_tree=null;
        AslTree PLUS227_tree=null;
        AslTree MINUS228_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt52=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt52=1;
                    }
                    break;
                case PLUS:
                    {
                    alt52=2;
                    }
                    break;
                case MINUS:
                    {
                    alt52=3;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:14: NOT ^
                    {
                    NOT226=(Token)match(input,NOT,FOLLOW_NOT_in_factor2289); 
                    NOT226_tree = 
                    (AslTree)adaptor.create(NOT226)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT226_tree, root_0);


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:21: PLUS ^
                    {
                    PLUS227=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2294); 
                    PLUS227_tree = 
                    (AslTree)adaptor.create(PLUS227)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS227_tree, root_0);


                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:228:29: MINUS ^
                    {
                    MINUS228=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2299); 
                    MINUS228_tree = 
                    (AslTree)adaptor.create(MINUS228)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS228_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2304);
            atom229=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom229.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:231:1: atom : ( ID | INT |eq= OCT -> INT[$eq,$eq.text] | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token b=null;
        Token ID230=null;
        Token INT231=null;
        Token char_literal233=null;
        Token char_literal235=null;
        AslParser.funcall_return funcall232 =null;

        AslParser.expr_return expr234 =null;


        AslTree eq_tree=null;
        AslTree b_tree=null;
        AslTree ID230_tree=null;
        AslTree INT231_tree=null;
        AslTree char_literal233_tree=null;
        AslTree char_literal235_tree=null;
        RewriteRuleTokenStream stream_OCT=new RewriteRuleTokenStream(adaptor,"token OCT");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:231:9: ( ID | INT |eq= OCT -> INT[$eq,$eq.text] | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt54=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==90) ) {
                    alt54=5;
                }
                else if ( (LA54_1==AND||LA54_1==ARMOR||LA54_1==CHORUS||LA54_1==DIV||LA54_1==EQUAL||(LA54_1 >= GE && LA54_1 <= GT)||LA54_1==LE||LA54_1==LT||(LA54_1 >= MINUS && LA54_1 <= MUL)||LA54_1==NOT_EQUAL||LA54_1==OR||LA54_1==PLUS||LA54_1==SPEED||LA54_1==TRANSPORT||LA54_1==VOICE||(LA54_1 >= 91 && LA54_1 <= 92)||LA54_1==94||LA54_1==96||LA54_1==114||LA54_1==116) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt54=2;
                }
                break;
            case OCT:
                {
                alt54=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt54=4;
                }
                break;
            case 90:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }

            switch (alt54) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:231:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID230=(Token)match(input,ID,FOLLOW_ID_in_atom2326); 
                    ID230_tree = 
                    (AslTree)adaptor.create(ID230)
                    ;
                    adaptor.addChild(root_0, ID230_tree);


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:232:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT231=(Token)match(input,INT,FOLLOW_INT_in_atom2341); 
                    INT231_tree = 
                    (AslTree)adaptor.create(INT231)
                    ;
                    adaptor.addChild(root_0, INT231_tree);


                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:233:10: eq= OCT
                    {
                    eq=(Token)match(input,OCT,FOLLOW_OCT_in_atom2356);  
                    stream_OCT.add(eq);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 233:18: -> INT[$eq,$eq.text]
                    {
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(INT, eq, (eq!=null?eq.getText():null))
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:234:13: (b= TRUE |b= FALSE )
                    {
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:234:13: (b= TRUE |b= FALSE )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==TRUE) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==FALSE) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;

                    }
                    switch (alt53) {
                        case 1 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:234:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2377);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:234:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2383);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 234:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:234:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:235:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2406);
                    funcall232=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall232.getTree());

                    }
                    break;
                case 6 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:236:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal233=(Token)match(input,90,FOLLOW_90_in_atom2420); 

                    pushFollow(FOLLOW_expr_in_atom2423);
                    expr234=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr234.getTree());

                    char_literal235=(Token)match(input,91,FOLLOW_91_in_atom2425); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        AslParser.expr_list_return expr_list238 =null;


        AslTree ID236_tree=null;
        AslTree char_literal237_tree=null;
        AslTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:13: ID '(' ( expr_list )? ')'
            {
            ID236=(Token)match(input,ID,FOLLOW_ID_in_funcall2445);  
            stream_ID.add(ID236);


            char_literal237=(Token)match(input,90,FOLLOW_90_in_funcall2447);  
            stream_90.add(char_literal237);


            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:20: ( expr_list )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==FALSE||LA55_0==ID||LA55_0==INT||LA55_0==MINUS||LA55_0==NOT||LA55_0==OCT||LA55_0==PLUS||LA55_0==TRUE||LA55_0==90) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2449);
                    expr_list238=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list238.getTree());

                    }
                    break;

            }


            char_literal239=(Token)match(input,91,FOLLOW_91_in_funcall2452);  
            stream_91.add(char_literal239);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 239:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:239:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class numatom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numatom"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:241:1: numatom : ( INT |eq= OCT -> INT[$eq,$eq.text] | ID );
    public final AslParser.numatom_return numatom() throws RecognitionException {
        AslParser.numatom_return retval = new AslParser.numatom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token INT240=null;
        Token ID241=null;

        AslTree eq_tree=null;
        AslTree INT240_tree=null;
        AslTree ID241_tree=null;
        RewriteRuleTokenStream stream_OCT=new RewriteRuleTokenStream(adaptor,"token OCT");

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:241:9: ( INT |eq= OCT -> INT[$eq,$eq.text] | ID )
            int alt56=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt56=1;
                }
                break;
            case OCT:
                {
                alt56=2;
                }
                break;
            case ID:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:241:11: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT240=(Token)match(input,INT,FOLLOW_INT_in_numatom2483); 
                    INT240_tree = 
                    (AslTree)adaptor.create(INT240)
                    ;
                    adaptor.addChild(root_0, INT240_tree);


                    }
                    break;
                case 2 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:242:5: eq= OCT
                    {
                    eq=(Token)match(input,OCT,FOLLOW_OCT_in_numatom2493);  
                    stream_OCT.add(eq);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 242:13: -> INT[$eq,$eq.text]
                    {
                        adaptor.addChild(root_0, 
                        (AslTree)adaptor.create(INT, eq, (eq!=null?eq.getText():null))
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:243:5: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID241=(Token)match(input,ID,FOLLOW_ID_in_numatom2503); 
                    ID241_tree = 
                    (AslTree)adaptor.create(ID241)
                    ;
                    adaptor.addChild(root_0, ID241_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numatom"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:245:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal243=null;
        AslParser.expr_return expr242 =null;

        AslParser.expr_return expr244 =null;


        AslTree char_literal243_tree=null;

        try {
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:245:10: ( expr ( ',' ! expr )* )
            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:245:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2514);
            expr242=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr242.getTree());

            // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:245:18: ( ',' ! expr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==92) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /dades/ferran.noguera/linux/CL/Practica/src/parser/Asl.g:245:19: ',' ! expr
            	    {
            	    char_literal243=(Token)match(input,92,FOLLOW_92_in_expr_list2517); 

            	    pushFollow(FOLLOW_expr_in_expr_list2520);
            	    expr244=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr244.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\22\uffff";
    static final String DFA18_eofS =
        "\22\uffff";
    static final String DFA18_minS =
        "\11\11\2\uffff\1\11\6\uffff";
    static final String DFA18_maxS =
        "\4\113\5\164\2\uffff\1\164\6\uffff";
    static final String DFA18_acceptS =
        "\11\uffff\1\7\1\10\1\uffff\1\3\1\4\1\5\1\6\1\1\1\2";
    static final String DFA18_specialS =
        "\22\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\1\7\uffff\1\4\4\uffff\1\4\16\uffff\1\4\6\uffff\1\4\22"+
            "\uffff\1\5\1\uffff\1\4\6\uffff\2\4\1\3",
            "\1\2\1\1\7\uffff\1\6\4\uffff\1\6\16\uffff\1\6\6\uffff\1\6\22"+
            "\uffff\1\7\1\uffff\1\6\6\uffff\2\6\1\3",
            "\1\2\1\1\7\uffff\1\6\4\uffff\1\6\16\uffff\1\6\6\uffff\1\6\22"+
            "\uffff\1\7\1\uffff\1\6\6\uffff\2\6\1\3",
            "\1\2\1\1\7\uffff\1\6\4\uffff\1\6\16\uffff\1\6\6\uffff\1\6\22"+
            "\uffff\1\7\1\uffff\1\6\6\uffff\2\6\1\3",
            "\2\12\7\uffff\1\12\4\uffff\2\12\11\uffff\3\12\1\uffff\1\12"+
            "\6\uffff\1\12\7\uffff\1\10\12\uffff\3\12\6\uffff\3\12\6\uffff"+
            "\1\12\7\uffff\2\12\1\uffff\1\11\1\uffff\4\12\20\uffff\2\12",
            "\2\12\7\uffff\1\12\4\uffff\2\12\11\uffff\3\12\1\uffff\1\12"+
            "\6\uffff\1\12\7\uffff\1\10\12\uffff\3\12\6\uffff\3\12\6\uffff"+
            "\1\12\7\uffff\2\12\1\uffff\1\11\1\uffff\4\12\20\uffff\2\12",
            "\2\15\7\uffff\1\15\4\uffff\2\15\11\uffff\3\15\1\uffff\1\15"+
            "\6\uffff\1\15\7\uffff\1\13\12\uffff\3\15\6\uffff\3\15\6\uffff"+
            "\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\4\15\20\uffff\2\15",
            "\2\15\7\uffff\1\15\4\uffff\2\15\11\uffff\3\15\1\uffff\1\15"+
            "\6\uffff\1\15\7\uffff\1\13\12\uffff\3\15\6\uffff\3\15\6\uffff"+
            "\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\4\15\20\uffff\2\15",
            "\2\17\7\uffff\1\17\4\uffff\2\17\11\uffff\3\17\1\uffff\1\17"+
            "\6\uffff\1\17\22\uffff\3\17\6\uffff\3\17\6\uffff\1\17\7\uffff"+
            "\2\17\1\uffff\1\16\1\uffff\4\17\20\uffff\2\17",
            "",
            "",
            "\2\21\7\uffff\1\21\4\uffff\2\21\11\uffff\3\21\1\uffff\1\21"+
            "\6\uffff\1\21\22\uffff\3\21\6\uffff\3\21\6\uffff\1\21\7\uffff"+
            "\2\21\1\uffff\1\20\1\uffff\4\21\20\uffff\2\21",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "152:1: nmusi : ( alter nota ^ OCT ( '.' ! dur ) | alter nota OCT -> ^( nota alter OCT NURAN ) | alter nota '.' dur -> ^( nota alter OCT[\"3\"] dur ) | alter nota -> ^( nota alter OCT[\"3\"] NURAN ) | nota OCT '.' dur -> ^( nota NURAN OCT dur ) | nota OCT -> ^( nota NURAN OCT NURAN ) | nota '.' dur -> ^( nota NURAN OCT[\"3\"] dur ) | nota -> ^( nota NURAN OCT[\"3\"] NURAN ) );";
        }
    }
 

    public static final BitSet FOLLOW_func_in_prog219 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_prog222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func261 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_func264 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_params_in_func266 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_func268 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_block_instructions_in_func271 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_func273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_params292 = new BitSet(new long[]{0x0000000800000000L,0x000000000A000000L});
    public static final BitSet FOLLOW_paramlist_in_params294 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_params297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist323 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_paramlist326 = new BitSet(new long[]{0x0000000800000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_param_in_paramlist329 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_89_in_param354 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_param358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions415 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_block_instructions418 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_instruction_in_block_instructions420 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_assign_in_instruction469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitura_in_instruction630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign676 = new BitSet(new long[]{0x0400100000208000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_assign681 = new BitSet(new long[]{0x2024606C03840600L,0x0000000004060E07L});
    public static final BitSet FOLLOW_expr_in_assign684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nmusiop_in_assign702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PEQUAL_in_assign723 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_assign725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUAL_in_assign751 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_assign753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEQUAL_in_assign779 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_assign781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEQUAL_in_assign807 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_assign809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DPLUS_in_assign835 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_assign837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DMINUS_in_assign864 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_assign866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt904 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ite_stmt907 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt909 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ite_stmt910 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ite_stmt913 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt916 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ite_stmt918 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt922 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ite_stmt925 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt928 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ite_stmt931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEAT_in_beatbox956 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_beatbox959 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_beatbox961 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_beatbox964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speederman972 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur2_in_speederman975 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_speederman977 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_speederman980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSPORT_in_trans989 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_trans992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARMOR_in_armour1001 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_armour1003 = new BitSet(new long[]{0x0000000000000600L,0x0000000000000800L});
    public static final BitSet FOLLOW_alter_in_armour1006 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000605L});
    public static final BitSet FOLLOW_nota_in_armour1008 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OCT_in_armour1010 = new BitSet(new long[]{0x0000000000000600L,0x0010000000000800L});
    public static final BitSet FOLLOW_116_in_armour1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEMOL_in_alter1065 = new BitSet(new long[]{0x0000000000000602L,0x0000000000000800L});
    public static final BitSet FOLLOW_BECUADRO_in_alter1068 = new BitSet(new long[]{0x0000000000000602L,0x0000000000000800L});
    public static final BitSet FOLLOW_SOSTENIDO_in_alter1071 = new BitSet(new long[]{0x0000000000000602L,0x0000000000000800L});
    public static final BitSet FOLLOW_nota2_in_nota1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIET_in_nota1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dur2_in_dur1112 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_dur1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_in_octal1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_in_acion1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nmusiop2_in_music_atom1192 = new BitSet(new long[]{0x0000205C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_multinota_in_music_atom1194 = new BitSet(new long[]{0x0000205C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_ite_stmt_part_in_music_atom1196 = new BitSet(new long[]{0x0000205C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_triet_in_music_atom1198 = new BitSet(new long[]{0x0000205C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom_in_music_atom21210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_in_nmusi1228 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000605L});
    public static final BitSet FOLLOW_nota_in_nmusi1230 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OCT_in_nmusi1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_nmusi1236 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur_in_nmusi1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_in_nmusi1245 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000605L});
    public static final BitSet FOLLOW_nota_in_nmusi1247 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OCT_in_nmusi1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_in_nmusi1267 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000605L});
    public static final BitSet FOLLOW_nota_in_nmusi1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_nmusi1271 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur_in_nmusi1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_in_nmusi1291 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000605L});
    public static final BitSet FOLLOW_nota_in_nmusi1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_nmusi1310 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OCT_in_nmusi1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_nmusi1315 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur_in_nmusi1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_nmusi1334 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OCT_in_nmusi1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_nmusi1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_nmusi1355 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur_in_nmusi1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_nmusi1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TWICE_in_nmusiop1398 = new BitSet(new long[]{0x0000204C01840600L,0x0000000000040E07L});
    public static final BitSet FOLLOW_HALF_in_nmusiop1401 = new BitSet(new long[]{0x0000204C01840600L,0x0000000000040E07L});
    public static final BitSet FOLLOW_RAISE_in_nmusiop1404 = new BitSet(new long[]{0x0000204C01840600L,0x0000000000040E07L});
    public static final BitSet FOLLOW_FALL_in_nmusiop1407 = new BitSet(new long[]{0x0000204C01840600L,0x0000000000040E07L});
    public static final BitSet FOLLOW_nmusiop_in_nmusiop1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_nmusiop1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nmusi_in_nmusiop1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nmusiop_in_nmusiop21429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_nmusiop21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_multinota1439 = new BitSet(new long[]{0x0000204000840600L,0x0000000000000E04L});
    public static final BitSet FOLLOW_acion_in_multinota1441 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000604L});
    public static final BitSet FOLLOW_nota2_in_multinota1443 = new BitSet(new long[]{0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_octal_in_multinota1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_multinota1447 = new BitSet(new long[]{0x0000204000840600L,0x0000000000000E04L});
    public static final BitSet FOLLOW_acion_in_multinota1450 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000604L});
    public static final BitSet FOLLOW_nota2_in_multinota1452 = new BitSet(new long[]{0x0020000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_octal_in_multinota1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_92_in_multinota1458 = new BitSet(new long[]{0x0000204000840600L,0x0000000000000E04L});
    public static final BitSet FOLLOW_acion_in_multinota1460 = new BitSet(new long[]{0x0000204000840000L,0x0000000000000604L});
    public static final BitSet FOLLOW_nota2_in_multinota1462 = new BitSet(new long[]{0x0020000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_octal_in_multinota1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_91_in_multinota1467 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_multinota1469 = new BitSet(new long[]{0x0000000000000000L,0x0001FFF800000000L});
    public static final BitSet FOLLOW_dur_in_multinota1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt_part1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ite_stmt_part1566 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt_part1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ite_stmt_part1569 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ite_stmt_part1572 = new BitSet(new long[]{0x0000205C01840600L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_ite_stmt_part1575 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ite_stmt_part1577 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt_part1581 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ite_stmt_part1584 = new BitSet(new long[]{0x0000205C01840600L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_ite_stmt_part1587 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ite_stmt_part1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_triet1626 = new BitSet(new long[]{0x0000204C01840600L,0x0000000004040E07L});
    public static final BitSet FOLLOW_trietom_in_triet1629 = new BitSet(new long[]{0x0000204C01840600L,0x0000000404040E07L});
    public static final BitSet FOLLOW_98_in_triet1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nmusiop2_in_trietom1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multinota_in_trietom1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_l_notas1664 = new BitSet(new long[]{0x0000205C01840600L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_l_notas1667 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_l_notas1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_l_notas_in_l_notas21682 = new BitSet(new long[]{0x0020002800000002L});
    public static final BitSet FOLLOW_music_compjp_in_l_notas21685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_music_compjp_in_l_notas21692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOICE_in_l_notas31703 = new BitSet(new long[]{0x18A0002A08000000L,0x0008000001090180L});
    public static final BitSet FOLLOW_instrumento_in_l_notas31706 = new BitSet(new long[]{0x0020002800000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_l_notas2_in_l_notas31708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_l_notas2_in_l_notas31720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHORUS_in_l_notas41736 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_l_notas41739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas3_in_l_notas41742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas3_in_l_notas41744 = new BitSet(new long[]{0x0000000000000000L,0x0010000000100000L});
    public static final BitSet FOLLOW_116_in_l_notas41747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_l_notas3_in_l_notas41753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repit_in_music_compjp1761 = new BitSet(new long[]{0x0020207C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_music_compjp1765 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_music_compjp1767 = new BitSet(new long[]{0x0020207C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_repit_in_music_compjp1771 = new BitSet(new long[]{0x0020207C01840602L,0x0000000204040E07L});
    public static final BitSet FOLLOW_numatom_in_repit1782 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_repit1784 = new BitSet(new long[]{0x0000205C01840600L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_repit1787 = new BitSet(new long[]{0x0000000000000000L,0x0008000080000000L});
    public static final BitSet FOLLOW_115_in_repit1791 = new BitSet(new long[]{0x0000205C01840600L,0x0000000204040E07L});
    public static final BitSet FOLLOW_music_atom2_in_repit1793 = new BitSet(new long[]{0x0000000000000000L,0x0008000080000000L});
    public static final BitSet FOLLOW_95_in_repit1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beatbox_in_partitura1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_speederman_in_partitura1822 = new BitSet(new long[]{0x0000000000001042L,0x0000000000104000L});
    public static final BitSet FOLLOW_trans_in_partitura1828 = new BitSet(new long[]{0x0000000000001042L,0x0000000000100000L});
    public static final BitSet FOLLOW_armour_in_partitura1831 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas4_in_partitura1833 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas4_in_partitura1858 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_armour_in_partitura1885 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas4_in_partitura1887 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_l_notas4_in_partitura1914 = new BitSet(new long[]{0x0000000000001002L,0x0000000000100000L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1951 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_for_stmt1953 = new BitSet(new long[]{0x00000008000A0000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1955 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt1957 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_for_stmt1961 = new BitSet(new long[]{0x00000008000A0000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_for_stmt1965 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_for_stmt1967 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1969 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_for_stmt1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1998 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_while_stmt2001 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_while_stmt2003 = new BitSet(new long[]{0x00000018100A0100L,0x0000000100600048L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt2005 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_while_stmt2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt2029 = new BitSet(new long[]{0x2024402802000002L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_return_stmt2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read2050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_read2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write2072 = new BitSet(new long[]{0x2024402802000000L,0x0000000004022000L});
    public static final BitSet FOLLOW_expr_in_write2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2104 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2107 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_boolterm_in_expr2110 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2133 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2136 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2156 = new BitSet(new long[]{0x0008088180200002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2160 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2165 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_LT_in_boolfact2170 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_LE_in_boolfact2175 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_GT_in_boolfact2180 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_GE_in_boolfact2185 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2209 = new BitSet(new long[]{0x2000400000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2214 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2219 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_term_in_num_expr2223 = new BitSet(new long[]{0x2000400000000002L});
    public static final BitSet FOLLOW_factor_in_term2247 = new BitSet(new long[]{0x0001800000010002L});
    public static final BitSet FOLLOW_MUL_in_term2252 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_DIV_in_term2257 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_MOD_in_term2262 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_factor_in_term2266 = new BitSet(new long[]{0x0001800000010002L});
    public static final BitSet FOLLOW_NOT_in_factor2289 = new BitSet(new long[]{0x0020002802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_PLUS_in_factor2294 = new BitSet(new long[]{0x0020002802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_MINUS_in_factor2299 = new BitSet(new long[]{0x0020002802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_atom_in_factor2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_in_atom2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_atom2420 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_atom2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_atom2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_funcall2447 = new BitSet(new long[]{0x2024402802000000L,0x000000000C020000L});
    public static final BitSet FOLLOW_expr_list_in_funcall2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_funcall2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_numatom2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCT_in_numatom2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_numatom2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2514 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_expr_list2517 = new BitSet(new long[]{0x2024402802000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_expr_in_expr_list2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});

}
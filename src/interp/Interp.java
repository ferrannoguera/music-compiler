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

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;

import org.jfugue.rhythm.Rhythm;
import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;


/** Class that implements the interpreter of the language. */


public class Interp {
    
   //NUESTRAS VARIABLES GLOBALES, QUE BONITAS JODER! 
    Pattern patterns_musicote = new Pattern();
   
    private int beat;
    private int [][] armor = new int[8][9];
    private boolean becu = false;
    private boolean esp = false;
    private int compnumber = 0;
	private int partnumber = 0;
    private int ekkodur;
    private boolean trie = false;
    private boolean fromID = false;
	private boolean fromIf = false;
    
    
    private String ant_duracion = ""; //SU PUTA MADRE ME CAGO EN SU PUTA VIDA DESGRACIADA DE MIERDA QUE TE JODAN I TE MUERAS DE UN PUTO CANCER HIJO DE PUTA TE DESEO LA PEOR DE LAS MUERTES QUE SUICIDARTE SEA TU UNICA OPCION Y YO TE PARTA LAS PUTAS PIERNAS ANTES DE HACERLO IMBEIL TE BVOY A MATAR IHJOAFNDKASLPSX
    
    
    private long[] voces = new long[16];
    
    
    boolean puentecito = false; //Es nota puente(?)

    
    /**Diccionario con las equivalencias nota duracion (by yeray, esta orgulloso)*/
    private HashMap<String,Integer> Note2Dur;
    
    
    /** Que yeray sepa, puede ir aqui */
    //C5sf D8sf E1sf F6sf G3sf A4sf B2sf
    private String givememahnote(String s) {
        if (s.equals("Do")) return "C";
        else if (s.equals("Re")) return "D";
        else if (s.equals("Mi")) return "E";
        else if (s.equals("Fa")) return "F";
        else if (s.equals("Sol")) return "G";
        else if (s.equals("La")) return "A";
        else if (s.equals("Si")) return "B";
        else if (s.equals("Quiet")) return "R";
        else return "IMBECIL";
    }
    
   private String damemiduracion(String s) {
       if (s.equals("r")) return "w"; //4
       else if (s.equals("r*")) return "w."; //6
       else if (s.equals("b")) return "h"; //2
       else if (s.equals("b*")) return "h."; //3
       else if (s.equals("n")) return "q"; //1
       else if (s.equals("n*")) return "q."; //1.5
       else if (s.equals("c")) return "i"; //0.5
       else if (s.equals("c*")) return "i."; //0.75
       else if (s.equals("sc")) return "s"; //0.25
       else if (s.equals("sc*")) return "s."; //0.375
       else if (s.equals("f")) return "t"; //0.125
       else if (s.equals("f*")) return "t."; //0.1875
       else if (s.equals("sf")) return "x"; //0.0625
       else if (s.equals("sf*")) return "x."; //0.09375
       else return "IMBECIL";
    }
    
    
    private double quemedesmitempo(String s) {
       if (s.equals("r")) return 4.0;
       else if (s.equals("r*")) return 6.0;
       else if (s.equals("b")) return 2.0;
       else if (s.equals("b*")) return 3.0;
       else if (s.equals("n")) return 1.0;
       else if (s.equals("n*")) return 1.5;
       else if (s.equals("c")) return 0.5;
       else if (s.equals("c*")) return 0.75;
       else if (s.equals("sc")) return 0.25;
       else if (s.equals("sc*")) return 0.375;
       else if (s.equals("f")) return 0.125;
       else if (s.equals("f*")) return 0.1875;
       else if (s.equals("sf")) return 0.0625;
       else if (s.equals("sf*")) return 0.09375;
       else return 0.0;
    }
    
    
    private String getInsrumento(String s) {
        if (s.equals("Flauta")) return "Flute";
        else if (s.equals("Piano")) return "Piano";
        else return "IMBECIL";
    }
    
    private void cargaNote(){
        Note2Dur.put("sf", 2);		Note2Dur.put("c", 16);
        Note2Dur.put("sf*", 3);		Note2Dur.put("c*", 24);
        Note2Dur.put("f", 4);	Note2Dur.put("n", 32);
        Note2Dur.put("f*", 6);	Note2Dur.put("n*", 48);
        Note2Dur.put("sc", 8);		Note2Dur.put("b", 64);
        Note2Dur.put("b*", 96);		Note2Dur.put("r", 128);
        Note2Dur.put("r*", 192);Note2Dur.put("sc*", 12);
        
        Note2Dur.put("NURAN", -1);
    }
    
    
    /** Memory of the virtual machine. */
    private Stack Stack;
    
    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        //carga las notas, todos lo hacemos con if's pero el no, el con un hashmap, anda ya...
        Note2Dur = new HashMap<String,Integer> ();
        cargaNote();
        executeFunction ("main", null);
        Player player = new Player();
        player.play(patterns_musicote);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {
        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }
    
    
    private int calculaAlter (AslTree t) {
        int val = 0;
        becu = false;
        switch (t.getType()) {
        
            case AslLexer.NURAN:
                break;
            case AslLexer.BEMOL:
                val -= 2;
                if(t.getChildCount() == 1) val += calculaAlter(t.getChild(0));
                break;
                
            case AslLexer.SOSTENIDO:
                val += 2;
                if(t.getChildCount() == 1) val += calculaAlter(t.getChild(0));
                break;
            
            case AslLexer.BECUADRO:
                becu = true;
                break;
            
            
            default: break;
        }
        return val;
    }

    
    private void cargaArmor(AslTree t){
        
        for (int i = 0; i<t.getChildCount(); ++i){
            AslTree f = t.getChild(i);
            switch (f.getType()) {
            
                case AslLexer.DO:
                    armor[1][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.RE:
                    armor[2][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.MI:
                    armor[3][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.FA:  
                    armor[4][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.SOL:
                    armor[5][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.LA:
                    armor[6][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.SI:
                    armor[7][Integer.parseInt(f.getChild(1).toString())] = calculaAlter(f.getChild(0));
                    break;
                case AslLexer.QUIET:
                    break;
                
            
                default: break;
            }
        }
    }
    
    private void cargaTransport(AslTree t){
        int cuantas = 4*evaluateExpression(t.getChild(0)).getIntegerValue();
        for(int i = 1; i<8; ++i){
            for(int j = 0; j<9;++j){
                armor[i][j] += cuantas;
            }
        }
    }
    
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case AslLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case AslLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }
                
            //For
            case AslLexer.FOR:
				executeInstruction(t.getChild(0).getChild(0));
				while(true){
					value = evaluateExpression(t.getChild(0).getChild(1));
					checkBoolean(value);
					if(!value.getBooleanValue()) return null;
					Data r = executeListInstructions(t.getChild(1));
					if(r != null) return r;
					executeInstruction(t.getChild(0).getChild(2));
				}

            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case AslLexer.READ:
                String token = null;
                Data val = new Data(0);
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case AslLexer.WRITE:
                AslTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == AslLexer.STRING) {
                    /*System.out.format(v.getStringValue());
                    return null;*/
                    Pattern roun1 = new Pattern("G5wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww").setInstrument("Flute");
                    Player player = new Player();
                    player.play(roun1);
//                     Pattern round1 = new Pattern("V0 ");
//                     round1.add("I[Flute] G5-hq | E5h D5q | C5hq | G5q E5qi D5i | C5q E5 G5q | C6q B5qi A5i | B5q A5qi G5i | A5hq | G5hq | D6q C6h |");
// 
//                     // Create the second voice
//                     Pattern round2 = new Pattern("V1 ");
//                     round2.add("I[Piano] G5-hq | E5h D5q | C5hq | G5q E5qi D5i | C5q E5 G5q | C6q B5qi A5i | B5q A5qi G5i | A5hq | G5hq | D6q C6h |");
//                     Pattern xd = new Pattern();
//                     xd.add(round1);
//                     xd.add(round2);
//                     Player player = new Player();
//                     player.play(xd);
                }

                // Write an expression
                /*System.out.print(evaluateExpression(v).toString());*/
                return null;

            // Function call
            case AslLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;
            //el follon
            case AslLexer.PARTITURA:  
                becu = false;
				esp = false;
				compnumber = 0;
				++partnumber;
				trie = false;
				fromID = false;
				fromIf = false;
				int yerayless = metrica(t);// LO SIENTO PERO PARA TESTEAR DA SIDA
                AslTree temposito = t.getChild(1); //Tempo => MINE
                double tempo = quemedesmitempo(temposito.getChild(0).toString())*evaluateExpression(temposito.getChild(1)).getIntegerValue();
 				int tempox = (int)tempo;
 				//A TEMPOX ESTA EL TEMPO DE LA PARTITURA
                AslTree transp = t.getChild(2); //transport Tranqui que ya llegara => MINE
                //
                armor=new int[8][9];
                cargaArmor(t.getChild(3)); //EN TEORIA FUNCIONA HEHE HIHI HAHA => SI NO FUNCIONA MIRA A LA IZQUIERDA, YERAY NO ME SEAS DISLEXICO (YERAY)
                cargaTransport(t.getChild(2));
                //
                for (int j = 4; j<t.getChildCount(); ++j) {
                    gintonicysantascrismas(t.getChild(j),0,tempox,false);
                }
                armor = new int[8][9];
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }
    
    
    
   private void gintonicysantascrismas(AslTree t, int x,int tempox,boolean coro) {
        if (t.getType() == AslLexer.CHORUS) {
            //tractar i recorrer recursivament els instruments que estaran al else
            String s = "";
            long max = voces[0];
            System.out.println("max top: "+max);
            for (int i = 1; i<t.getChildCount(); ++i) if (voces[i] > max) max = voces[i];
            System.out.println("max top f1: "+max);
            for (int i = 0; i<t.getChildCount(); ++i) {
                if ((long)max-voces[i]>0) {
                    System.out.println("max-voces[i] top: "+((long)max-voces[i]));
                    Pattern absurdo = new Pattern("R"+Dur2String((long) max-voces[i])).setTempo(tempox).setVoice(i);
                    voces[i] = max;
                    patterns_musicote.add(absurdo);
                }
            }
            System.out.println("max top f2: "+max);
            for (int i = 0; i<t.getChildCount();++i) {
                //recorrer tots els instruments i guardarho en strings o patterns o basures d'aquestes
                gintonicysantascrismas(t.getChild(i),i,tempox,true);
            }
            
            max = voces[0];
            System.out.println("max topqq: "+max);
            for (int i = 1; i<t.getChildCount(); ++i) if (voces[i] > max) max = voces[i];
            System.out.println("max top f1qq: "+max);
            for (int i = 0; i<1; ++i) {
                if ((long)max-voces[i]>0 && voces[i]!=0) {
                    System.out.println("max-voces[i] topqq: "+((long)max-voces[i]));
                    Pattern absurdo = new Pattern("R"+Dur2String((long) max-voces[i])).setTempo(tempox).setVoice(i);
                    voces[i] = max;
                    patterns_musicote.add(absurdo);
                }
            }
        }
        //sino seran instruments que tractarem per aqui
        else {
            AslTree instrumento = t; //instrumento => Falta funcion para saber cual toca, de momento flauta y piano.
                                                //PUEDE HABER COROS PERO DE MOMENTO NOPE, DE MOMENTO SOLO UNI Y AUN GRACIAS
            // A PARTIR DE AQUI SUENA LO QUE TOCA EL INSTRUMENTO DES DE INSTRUMENTO.
            String musicamaestro = "";
            for (int i = 0; i<instrumento.getChildCount();++i) {
                musicamaestro = musicamaestro+executeMusic(instrumento.getChild(i), x);
            }
            System.out.println(musicamaestro);
            Pattern pattern = new Pattern(musicamaestro).setInstrument(getInsrumento(instrumento.toString())).setTempo(tempox).setVoice(x);
            patterns_musicote.add(pattern);
        }
    
    }
    
    
    /**
     * Reproduce la musica que esta en l_notas
     */
    
    
    private String executeMusic (AslTree l_notas, int x) {
        assert l_notas != null;
        String a_reproducir = ""; //Lo que va a sonar
        switch (l_notas.getType()) {
            case AslLexer.LNOTAS:
                for (int i = 0; i<l_notas.getChildCount(); ++i) {
                    Data nota;
                    int notayoctava;
                    int duracion;
                    int octava;
                    AslTree notita = l_notas.getChild(i);
                    switch (notita.getType()) {
                        case AslLexer.TRI:
                            a_reproducir = a_reproducir+evaluateTri(notita);
                            break;
                    
                        case AslLexer.HALF:
                        case AslLexer.TWICE:
                        case AslLexer.FALL:
                        case AslLexer.RAISE:
                            Data qsth = new Data(evaluateExpression(l_notas.getChild(i)));
                            String zzz = Not2String(qsth.getNote()); //te da la nota y la octava
                            boolean detras = qsth.getDuracion() == -1; //seria como un nuran pero cosecha propia
                            String yyy = zzz+Dur2String((long)qsth.getDuracion()); //todo
                            if (!puentecito) {
                                if(notita.getChildCount() != 0){
                                    if (esp) {
                                        puentecito = true;
                                        if (detras) {
                                            a_reproducir = a_reproducir+zzz+ant_duracion+"- ";
                                            voces[x] += String2Dur(ant_duracion);
                                        }
                                        else {
                                            a_reproducir = a_reproducir+yyy+"- ";
                                            ant_duracion = Dur2String((long)qsth.getDuracion());
                                            voces[x] += (long)qsth.getDuracion(); //google, imbecil
                                        }
                                    }
                                    else {
                                        if (detras) {
                                            a_reproducir = a_reproducir+zzz+ant_duracion+" ";
                                            voces[x] += String2Dur(ant_duracion);
                                            
                                        }
                                        else {
                                            a_reproducir = a_reproducir+yyy+" ";
                                            ant_duracion =  Dur2String((long)qsth.getDuracion());
                                            voces[x] += (long)qsth.getDuracion();
                                        }
                                    }
                                }
                                else {
                                    if (detras)  {
                                        a_reproducir = a_reproducir+zzz+ant_duracion+" ";
                                        voces[x] += String2Dur(ant_duracion);
                                    }
                                    else {
                                        a_reproducir = a_reproducir+yyy+" ";
                                        ant_duracion = Dur2String((long)qsth.getDuracion());
                                        voces[x] += (long)qsth.getDuracion();
                                    }
                                }
                            }
                            else {
                                if (notita.getChildCount() != 0) {
                                    if (esp) {
                                        if (detras) {
                                            a_reproducir = a_reproducir+zzz+"-"+ant_duracion+"- ";
                                            voces[x] += String2Dur(ant_duracion);
                                        }
                                        else {
                                            a_reproducir = a_reproducir+zzz+"-"+Dur2String((long)qsth.getDuracion())+"- ";
                                            ant_duracion = Dur2String((long)qsth.getDuracion());
                                            voces[x] += (long)qsth.getDuracion();
                                        }
                                    }
                                    else { 
                                        puentecito = false;
                                        if (detras) {
                                            a_reproducir = a_reproducir+zzz+"-"+ant_duracion+" ";
                                            voces[x] += String2Dur(ant_duracion);
                                        }
                                        else {
                                            a_reproducir = a_reproducir+zzz+"-"+Dur2String((long)qsth.getDuracion())+" ";
                                            ant_duracion = Dur2String((long)qsth.getDuracion());
                                            voces[x] += (long)qsth.getDuracion();
                                        }
                                    }
                                }
                                else {
                                    puentecito = false;
                                    if (detras) {
                                        a_reproducir = a_reproducir+zzz+"-"+ant_duracion+" ";
                                        voces[x] += String2Dur(ant_duracion);
                                    }
                                    else {
                                        a_reproducir = a_reproducir+zzz+"-"+Dur2String((long)qsth.getDuracion())+" ";
                                        ant_duracion = Dur2String((long)qsth.getDuracion());
                                        voces[x] += (long)qsth.getDuracion();;
                                    }
                                }
                            }
                            break;
                            
                            
                        case AslLexer.IF:
                            Data value = evaluateExpression(l_notas.getChild(0).getChild(0));
                            checkBoolean(value);
                            if (value.getBooleanValue()) return executeMusic(l_notas.getChild(0).getChild(1),x);
                            // Is there else statement ?
                            if (l_notas.getChild(0).getChildCount() == 3) return executeMusic(l_notas.getChild(0).getChild(2),x);
                            break;
                        
                        
                        case AslLexer.ID:
                            nota = new Data(Stack.getVariable(notita.toString())); //lo tiene todo almacenado papi
                            notayoctava = nota.getNote(); //te da la nota y la octava
                            duracion = nota.getDuracion(); //todo
                            if (!nota.getBecu()){
                                int oc = (notayoctava-1)/24+1;
                                int cual = (notayoctava-1)%24+1;
                                if(cual < 4) cual = 1;
                                else if(cual < 8) cual = 2;
                                else if(cual < 11) cual = 3;
                                else if(cual < 14) cual = 4;
                                else if(cual < 18) cual = 5;
                                else if(cual < 22) cual = 6;
                                else if(cual < 25) cual = 7;
                                else assert false;
                                notayoctava += armor[cual][oc];
                            }
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava,duracion,notita,x);
                            break;
                        
                        case AslLexer.DO:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[1][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.RE:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[2][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.MI:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[3][octava];
                            }*/
                             a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.FA:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[4][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.SOL:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[5][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.LA:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[6][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.SI:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            /*if (!becu) {
                                octava = (Integer.parseInt(notita.getChild(1).toString()));
                                notayoctava = notayoctava+armor[7][octava];
                            }*/
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                        case AslLexer.QUIET:
                            nota = new Data(evaluateExpression(notita));
                            notayoctava = nota.getNote();
                            duracion = nota.getDuracion();
                            a_reproducir = a_reproducir+tratapuenteyponlenota(notayoctava, duracion,notita,x);
                            break;
                            
                            
                        case AslLexer.MULTINOTA:
                            a_reproducir = a_reproducir+(evaluateNmulti(notita))+" ";
                            break;
                        
                        default: break;
                            
                        
                    }
                }
                return (a_reproducir+"| ");
                    
            case AslLexer.REPEAT:
                a_reproducir = "";
                int times = evaluateExpression(l_notas.getChild(0)).getIntegerValue();
                Stack.defineVariable ("Time", new Data (times)); //ponemos times en pila
                while (Stack.getVariable("Time").getIntegerValue() != 0) {
                    for (int i = 1; i<l_notas.getChildCount(); ++i) {
                        a_reproducir = a_reproducir+executeMusic(l_notas.getChild(i),x);
                    }
                Stack.defineVariable ("Time", new Data (Stack.getVariable("Time").getIntegerValue()-1));
                }
                return a_reproducir;
                
                
                
                ////////////////////////////////////
            default: assert false;
        }
        assert false;
        return null;
    }
    



/*TE DA LA STRING Q JFUGUE COME PARA REPRODUCIR LA MULTINOTA DE L ARBOL T(q apunta a MULTINOTA TOKEN)*/
    


    private String evaluateNmulti(AslTree t){
        String res = "";
        System.out.println(t.toString());
        for(int i = 0; i<t.getChild(0).getChildCount(); ++i){
            AslTree n = t.getChild(0).getChild(i);
            System.out.println(t.getChild(0));
            System.out.println(t.getChild(i));
            Data value = new Data();
            System.out.println(n.toString());
            int eger;
            int rigante;
            switch(n.getType()){
                case AslLexer.DO:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[1][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(1+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.RE:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[2][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(5+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.MI:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[3][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(9+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.FA:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[4][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(11+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.SOL:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[5][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(15+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.LA:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[6][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(19+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
                case AslLexer.SI:
                    rigante = Integer.parseInt(n.getChild(1).toString());
                    eger = calculaAlter(n.getChild(0));
                    if(!becu) eger += +armor[7][rigante];
                    if(eger < 0) eger += 1;
                    value = new Data(23+24*rigante + eger, Note2Dur.get(t.getChild(1).getText()), becu);
                    break;
            }
            int nota = value.getNote();
            /*if (!value.getBecu()){
                int oc = (nota-1)/24+1;
                int cual = (nota-1)%24+1;
                if(cual < 4) cual = 1;
                else if(cual < 8) cual = 2;
                else if(cual < 11) cual = 3;
                else if(cual < 14) cual = 4;
                else if(cual < 18) cual = 5;
                else if(cual < 22) cual = 6;
                else if(cual < 25) cual = 7;
                else assert false;
                nota += armor[cual][oc];
            }*/
            res += Not2String(nota);
            if(puentecito) res +="-";
            res += Dur2String( (long) value.getDuracion());
            if(t.getChild(1).getChildCount() == 1) res+= "-";
            if(trie) res += "*";
            if (i+1 < t.getChild(0).getChildCount()) res += "+";
        }
        if(t.getChild(1).getChildCount() == 1) puentecito = true;
        else puentecito = false;
        ant_duracion = t.getChild(1).getText();
        return res;
    }

    
    
    
    
    
    
    private String tratapuenteyponlenota(int nyo, int d, AslTree notita, int x) {    
        String notyoct = Not2String(nyo);
        String dur = Dur2String((long)d);
        String a_ret = "";
        //trata puentecito
        boolean detras = d==-1;
        if (!puentecito) {
            if(notita.getChildCount() != 0){
                if (notita.getChild(2).getChildCount() != 0) {
                    puentecito = true;
                    if (detras) {
                        a_ret = notyoct+ant_duracion+"- ";
                        voces[x] += String2Dur(ant_duracion);
                    }
                    else {
                        a_ret = notyoct+dur+"- ";
                        ant_duracion = dur;
                        voces[x] += d; //google, imbecil
                    }
                }
                else {
                    if (detras) {
                        a_ret = notyoct+ant_duracion+" ";
                        voces[x] += String2Dur(ant_duracion);
                        
                    }
                    else {
                        a_ret = notyoct+dur+" ";
                        ant_duracion = dur;
                        voces[x] += d;
                    }
                }
            }
            else {
                if (detras)  {
                    a_ret = notyoct+ant_duracion+" ";
                    voces[x] += String2Dur(ant_duracion);
                }
                else {
                    a_ret = notyoct+dur+" ";
                    ant_duracion = dur;
                    voces[x] += d;
                }
            }
        }
        else {
            if (notita.getChildCount() != 0) {
                if (notita.getChild(2).getChildCount() != 0) {
                    if (detras) {
                        a_ret = notyoct+"-"+ant_duracion+"- ";
                        voces[x] += String2Dur(ant_duracion);
                    }
                    else {
                        a_ret = notyoct+"-"+dur+"- ";
                        ant_duracion = dur;
                        voces[x] += d;
                    }
                }
                else { 
                    puentecito = false;
                    if (detras) {
                        a_ret = notyoct+"-"+ant_duracion+" ";
                        voces[x] += String2Dur(ant_duracion);
                    }
                    else {
                        a_ret = notyoct+"-"+dur+" ";
                        ant_duracion = dur;
                        voces[x] += d;
                    }
                }
            }
            else {
                puentecito = false;
                if (detras) {
                    a_ret = notyoct+"-"+ant_duracion+" ";
                    voces[x] += String2Dur(ant_duracion);
                }
                else {
                    a_ret = notyoct+"-"+dur+" ";
                    ant_duracion = dur;
                    voces[x] += d;
                }
            }
        }
        return a_ret;
    }
    

    
    
    
    /** le entra una duracion en formato 192 y la pasa a String
    r-w,b-h,n-q,c-i,sc-s,f-t,sf-x,
    */
    private String Dur2String(long d){
        String res = "";
        while(d>=128){
            res += "w";
            d -= 128;
        }
        while(d>=64){
            res += "h";
            d -= 64;
        }
        while(d>=32){
            res += "q";
            d -= 32;
        }
        while(d>=16){
            res += "i";
            d -= 16;
        }
        while(d>=8){
            res += "s";
            d -= 8;
        }
        while(d>=4){
            res += "t";
            d -= 8;
        }
        while(d>=2){
            res += "x";
            d -= 8;
        }
        while(d>=1){
            res += "o";
            d -= 1;
        }
        return res;
    }
    
    private int String2Dur(String d){
        char[] res = d.toCharArray();
        int v = 0;
        int auc = 0;
        for(int i = 0; i< d.length(); ++i){
        
            if(res[i] == 'w'){ v+= 128;auc = 128;
            }if(res[i] == 'h'){ v+= 64;auc = 64;
            }if(res[i] == 'q'){ v+= 32;auc = 32;
            }if(res[i] == 'i'){ v+= 16;auc = 16;
            }if(res[i] == 's'){ v+= 8;auc = 8;
            }if(res[i] == 't'){ v+= 4;auc = 4;
            }if(res[i] == 'x'){ v+= 2;auc = 2;
            }if(res[i] == 'o'){ v+= 1;auc = 1;
            }if(res[i] == '.'){ v+= auc;}
        }
        return v;
    }
    
    private String Not2String(int n){
        String res = "";
        if (n == 0) return "R";
        else{
            int octava = (n-1)/24 +2;
            int nota = (n-1)%24;
            /**C, D, E, F, G, A, B, or R
            do re mi fa sol la si quiet
            d   d#   r  r#   m   f  f#   s  s#   l  l#   si
            */
            
            switch(nota){
                case 0:
                case 1:
                    res += "C";
                    break;
                case 2: res += "C#";
                break;
                case 3: res += "Db";
                break;
                case 4:
                case 5:
                    res += "D";
                    break;
                case 6: res += "D#";
                break;
                case 7: res += "Eb";
                break;
                case 8:
                case 9: 
                    res += "E";
                    break;
                case 10:
                case 11:
                    res += "F";
                    break;
                case 12: res += "F#";
                break;
                case 13: res += "Gb";
                break;
                case 14:
                case 15:
                    res += "G";
                    break;
                case 16: res += "G#";//si
                break;
                case 17: res += "Ab";
                break;
                case 18:
                case 19:
                    res += "A";
                    break;
                case 20: res += "A#";
                break;
                case 21: res += "Bb";
                break;
                case 22:
                case 23:
                    res += "B";
                    break;
            }
            res += Integer.toString(octava);
        }
        return res;
    }
    
    
    
    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();
        becu = false;
        int rigante;
        int eger;

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                esp = false;
                fromID = true;
                break;
            // An integer literal
            case AslLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
                
                
            // A Note
            /** tabla:
                    d   d#   r  r#   m   f  f#   s  s#   l  l#   si
                1 
            */
            case AslLexer.DO:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[1][rigante];
                if(eger < 0) eger += 1;
                value = new Data(1+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.RE:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[2][rigante];
                if(eger < 0) eger += 1;
                value = new Data(5+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.MI:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[3][rigante];
                if(eger < 0) eger += 1;
                value = new Data(9+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.FA:  
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[4][rigante];
                if(eger < 0) eger += 1;
                value = new Data(11+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.SOL:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[5][rigante];
                if(eger < 0) eger += 1;
                value = new Data(15+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.LA:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[6][rigante];
                if(eger < 0) eger += 1;
                value = new Data(19+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.SI:
                rigante = Integer.parseInt(t.getChild(1).toString());
                eger = calculaAlter(t.getChild(0));
                if(!becu) eger += +armor[7][rigante];
                if(eger < 0) eger += 1;
                value = new Data(23+24*rigante + eger, Note2Dur.get(t.getChild(2).getText()), becu);
                esp = t.getChild(2).getChildCount() ==1;
                fromID = false;
                break;
            case AslLexer.QUIET:
                value = new Data(0, Note2Dur.get(t.getChild(2).getText()), false);
                fromID = false;
                break;
            
            case AslLexer.HALF:
//             System.out.println(t.getChild(0).getText());
                value = new Data(evaluateExpression(t.getChild(0)));
                assert value.isNote();
                value.setDur(value.getDuracion()/2);
                break;
            case AslLexer.TWICE:
//             System.out.println(t.getChild(0).getText());
                value = new Data(evaluateExpression(t.getChild(0)));
                assert value.isNote();
                value.setDur(value.getDuracion()*2);
                break;
            case AslLexer.RAISE:
//             System.out.println(t.getChild(0).getText());
                value = new Data(evaluateExpression(t.getChild(0)));
                assert value.isNote();
                eger =value.getNote();
                if(eger % 2 == 0) eger += 1;
                else eger += 2;
                value.setNote(eger);
                break;
            case AslLexer.FALL:
//             System.out.println(t.getChild(0).getText());
                value = new Data(evaluateExpression(t.getChild(0)));
                eger =value.getNote();
                if(eger % 2 == 0) eger -= 2;
                else eger -= 1;
                value.setNote(eger);
                break;
                
                
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case AslLexer.PLUS:
                    checkInteger(value);
                    break;
                case AslLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case AslLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == AslLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != AslLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
    
    
    /***
    sf  sf* f   f*  sc  sc* c   c*  n   n*  b   b*  r   r*
    2   3   4   6   8   12  16  24  32  48  64  96  128 192
    beat = num*redondas/num2
    */
    
    private int metrica(AslTree f){
    
        switch (f.getType()) {
                case AslLexer.PARTITURA:
                    beat = evaluateExpression(f.getChild(0).getChild(0)).getIntegerValue() * 128/evaluateExpression(f.getChild(0).getChild(1)).getIntegerValue();
                    for(int i = 4; i<f.getChildCount(); ++i){
                        metrica(f.getChild(i));
                    }
                    break;
                
                case AslLexer.CHORUS:
                case AslLexer.FLAUTA:
                case AslLexer.PIANO:
                    for(int i = 0; i<f.getChildCount(); ++i){
                        System.out.println(f.getText());
                        metrica(f.getChild(i));
                    }
                    break;
                    
                case AslLexer.REPEAT:
                    for(int i = 1; i<f.getChildCount(); ++i){
                        System.out.println(f.getText());
                        metrica(f.getChild(i));
                    }
                    break;
                
                case AslLexer.LNOTAS:
                    if(!fromIf)++compnumber;
                    int maux = metrica(f.getChild(0));
                     System.out.println(maux);
                    for(int i = 1; i<f.getChildCount(); ++i){
                        System.out.println(f.getText());
                        maux += metrica(f.getChild(i));
                    }
                    System.out.println(maux);
                    System.out.println("KKK");
                    if(!fromIf){
                        if(maux != beat){
                            System.out.println(beat);
                            System.out.println(maux);
                            throw new RuntimeException("El fragmento " + compnumber + " de la partitura " + partnumber + " no cumple el beat");
                        }
                    }else{
                        fromIf = false;
                        return maux;
                    }
                    break;
                    
                case AslLexer.DO:
                case AslLexer.RE:
                case AslLexer.MI:
                case AslLexer.FA:
                case AslLexer.SOL:
                case AslLexer.LA:
                case AslLexer.SI:
                case AslLexer.QUIET:
                    int aux = Note2Dur.get(f.getChild(2).getText());
                        System.out.println(f.getText());
                    if(aux == -1) return ekkodur;
                    else ekkodur = aux;
                    return aux;
                    
                case AslLexer.IF:
                    fromIf = true;
                    int ret = metrica(f.getChild(1));
                    for(int i = 2; i<f.getChildCount(); ++i){
                        fromIf = true;
                        System.out.println(f.getText());
                        if(ret != metrica(f.getChild(i))){
                            throw new RuntimeException("La metrica del if/else del fragmento" + compnumber + " de la partitura " + partnumber + " no coincide.");
                        }
                    }
                    return ret;
                   //yeray lo quiere asi, he intentado explicarle que no era asi, pero no me escucha, vamos a hacerle caso...
                    
                case AslLexer.TRI:
                int auxf = 0;
                    for(int i = 0; i < f.getChildCount(); ++i){
                        System.out.println(f.getText());
                        auxf += metrica(f.getChild(i));
                    }
                    auxf = 2*auxf;
                    return auxf/3;
                    
                case AslLexer.MULTINOTA:
                    System.out.println(f.getText());
                    return Note2Dur.get(f.getChild(1).getText());
                    
                    
                case AslLexer.FALL:
                case AslLexer.RAISE:
                System.out.println(f.getText());
                    return metrica(f.getChild(0));
                    
                case AslLexer.TWICE:
                System.out.println(f.getText());
                    return 2*metrica(f.getChild(0));
                    
                case AslLexer.HALF:
                System.out.println(f.getText());
                    return metrica(f.getChild(0))/2;
                
                case AslLexer.ID:
                System.out.println(f.getText());
                        if(Stack.getVariable(f.getText()).getDuracion() != -1) ekkodur = Stack.getVariable(f.getText()).getDuracion();
                        return ekkodur;
                
                default: assert false;
            }
            return 0;
    }
    
    private String evaluateTri(AslTree t){
        String res = "";
        trie = true;
        Data valistica;
        int nota;
        System.out.println(t.getText());
        for(int i = 0; i<t.getChildCount(); i++){
            AslTree n = t.getChild(i);
            System.out.println(n.getText());
            switch(n.getType()){
                case AslLexer.DO:
                case AslLexer.RE:
                case AslLexer.MI:
                case AslLexer.FA:
                case AslLexer.SOL:
                case AslLexer.LA:
                case AslLexer.SI:
                case AslLexer.QUIET:
                    valistica = evaluateExpression(n);
                    nota = valistica.getNote();
                    /*if (!valistica.getBecu()){
                        int oc = (nota-1)/24+1;
                        int cual = (nota-1)%24+1;
                        if(cual < 4) cual = 1;
                        else if(cual < 8) cual = 2;
                        else if(cual < 11) cual = 3;
                        else if(cual < 14) cual = 4;
                        else if(cual < 18) cual = 5;
                        else if(cual < 22) cual = 6;
                        else if(cual < 25) cual = 7;
                        else assert false;
                        nota += armor[cual][oc];
                    }*/
                    res += Not2String(nota);
                    if(puentecito) res +="-";
                    ant_duracion = Dur2String(valistica.getDuracion());
                    res += ant_duracion;
                    if(n.getChild(2).getChildCount() == 1){
                        res+= "-";
                        puentecito = true;
                    }else puentecito = false;
                    res += "* ";
                    break;
                case AslLexer.RAISE:
                case AslLexer.HALF:
                case AslLexer.TWICE:
                case AslLexer.FALL:
                case AslLexer.ID:
                    valistica = evaluateExpression(n);
                    System.out.println("ES AL ACABAR NO TIENE QUE VER CON EL RAIS RIMA HEHEHAHEHA");
                    nota = valistica.getNote();
                    if (fromID){
                        if (!valistica.getBecu()){
                            int oc = (nota-1)/24+1;
                            int cual = (nota-1)%24+1;
                            if(cual < 4) cual = 1;
                            else if(cual < 8) cual = 2;
                            else if(cual < 11) cual = 3;
                            else if(cual < 14) cual = 4;
                            else if(cual < 18) cual = 5;
                            else if(cual < 22) cual = 6;
                            else if(cual < 25) cual = 7;
                            else assert false;
                            nota += armor[cual][oc];
                        }
                    }
                    res += Not2String(nota);
                    if(puentecito) res +="-";
                    res += Dur2String(valistica.getDuracion());
                    if(esp){
                        res+= "-";
                        puentecito = true;
                    }else puentecito = false;
                    res += "* ";
                    break;
                case AslLexer.MULTINOTA:
                    res+= evaluateNmulti(n);
                    res += " ";
                    break;
                default: assert false;
            }
        }
    trie = false;
    return res;
    }

}

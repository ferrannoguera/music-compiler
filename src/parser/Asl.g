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

grammar Asl;

options {
    output = AST;
    ASTLabelType = AslTree;
}

// Imaginary tokens to create some AST nodes

tokens {
    LIST_FUNCTIONS; // List of functions (the root of the tree)
    ASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
    FCONDS;
    NURAN;
    PARTITURA;
    LNOTAS;
    MULTINOTA;
    REPEAT;
    COMBO;
    TRI;
}

@header {
package parser;
import interp.AslTree;
}

@lexer::header {
package parser;
}


// A program is a list of functions
prog	: func+ EOF -> ^(LIST_FUNCTIONS func+)
        ;
            
// A function has a name, a list of parameters and a block of instructions	
func	: FUNC^ ID params '{'! block_instructions '}'!
        ;

// The list of parameters grouped in a subtree (it can be empty)
params	: '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
        ;

// A list of instructions, all of them gouped in a subtree
block_instructions
        :	 instruction (';' instruction)*
            -> ^(LIST_INSTR instruction+)
        ;

// The different types of instructions
instruction
        :	assign          // Assignment
        |	ite_stmt        // if-then-else
        |	while_stmt      // while statement
        |   	funcall         // Call to a procedure (no result produced)
        |	return_stmt     // Return statement
        |	read            // Read a variable
        | 	write           // Write a string or an expression
        |	for_stmt
        |	partitura
        |                   // Everything
        ;
//////////////////////////////////////////////////////////////////////////////////
assign	:	ID (eq=EQUAL (expr -> ^(ASSIGN[$eq,":="] ID expr)
			| nmusiop -> ^(ASSIGN[$eq, ":="] ID nmusiop))
	|	eq = PEQUAL expr -> ^(ASSIGN[$eq,":="] ID ^(PLUS ID expr))
	|	eq = REQUAL expr -> ^(ASSIGN[$eq,":="] ID ^(MINUS ID expr))
	|	eq = MEQUAL expr -> ^(ASSIGN[$eq,":="] ID ^(MUL ID expr))
	|	eq = DEQUAL expr -> ^(ASSIGN[$eq,":="] ID ^(DIV ID expr)))
	|	eq =DPLUS ID -> ^(ASSIGN[$eq,":="] ID ^(PLUS ID  INT["1"]))
	|	eq= DMINUS ID -> ^(ASSIGN[$eq,":="] ID ^(MINUS  ID INT["1"]))
	
        ;
//////////////////////////////////////////////////////////////////////////////////
ite_stmt	:	IF^ '('!expr')'! '{'! block_instructions '}'! (ELSE! '{'! block_instructions  '}'!)?
            ;
 //////////////////////////////////////////////////////////////////////////////////           
beatbox	:	BEAT^ expr ':'! expr;

speederman	:	SPEED^ dur2 ':'! expr;

trans 	:	TRANSPORT^ expr;

armour 	:	ARMOR '{' (alter nota OCT)+ '}'-> ^(ARMOR ^(nota alter OCT)+);

instrumento:		 PIANO|FLAUTA|SAXO|SHOT|GUITARRA|VIOLA|XILOFONO|ORGANO|TROMPA|PERCUSION;	

alter	:	(BEMOL^|BECUADRO^|SOSTENIDO^)+;
//////////////////////////////////////////////////////////////////////////////////
nota	:	nota2|QUIET;

nota2	:	DO|RE|MI|FA|SOL|LA|SI;
//////////////////////////////////////////////////////////////////////////////////
dur	:	dur2^ '~'? ;

dur2	:	'r'|'b'|'n'|'c'|'sc'|'f'|'sf'|'r*'|'b*'|'n*'|'c*'|'sc*'|'f*'|'sf*';
//////////////////////////////////////////////////////////////////////////////////
octal	:	OCT
		| -> OCT["3"];
acion	:	alter
		| -> NURAN;
//////////////////////////////////////////////////////////////////////////////////	
music_atom	:	(nmusiop2|multinota|ite_stmt_part|triet )+ ;

music_atom2	:	music_atom -> ^(LNOTAS music_atom ) ;
//////////////////////////////////////////////////////////////////////////////////	
nmusi	:	alter nota^ OCT ('.'! dur)
		|alter nota OCT -> ^(nota alter OCT NURAN)	
		|alter nota '.' dur -> ^(nota alter OCT["3"] dur)
		|alter nota-> ^(nota alter OCT["3"] NURAN)
		|nota  OCT '.' dur -> ^(nota NURAN OCT dur)
		|nota OCT -> ^(nota NURAN OCT NURAN)
		|nota '.' dur -> ^(nota NURAN OCT["3"] dur)
		|nota -> ^(nota NURAN OCT["3"] NURAN)
	;
nmusiop	:	(TWICE^|HALF^|RAISE^|FALL^) (nmusiop|ID)
		| nmusi;

nmusiop2:		nmusiop|ID;
	
multinota:	'('(acion nota2 octal)',' (acion nota2 octal) (',' acion nota2 octal)*')'('.' dur -> ^(MULTINOTA ^(LNOTAS ^(nota2 acion octal) ^(nota2 acion octal) ^(nota2 acion octal)*) dur)
					|->^(MULTINOTA ^(LNOTAS ^(nota2 acion octal) ^(nota2 acion octal) ^(nota2 acion octal)*) NURAN));
					
ite_stmt_part:	IF^ '('!expr')'! '{'! music_atom2 '}'! (ELSE! '{'! music_atom2  '}'!)?
            ;
            
triet	:	'[' (trietom)+']' -> ^(TRI (trietom)+);

trietom	:	nmusiop2|multinota;
//////////////////////////////////////////////////////////////////////////////////

l_notas	:	(('|'! music_atom2)+'|'!) ;

l_notas2:		(l_notas) music_compjp?
		| music_compjp
		;

l_notas3:		VOICE (instrumento l_notas2-> ^(instrumento l_notas2)
		|l_notas2 ->^(PIANO["Piano"] l_notas2));
l_notas4:		CHORUS^ '{'! l_notas3 l_notas3+ '}'!
		|l_notas3;
//////////////////////////////////////////////////////////////////////////////////
music_compjp	:	repit ((music_atom2 '|'!)|repit)* ;
//////////////////////////////////////////////////////////////////////////////////
repit	:	numatom 'z||:' (music_atom2) ('|' music_atom2)* ':||' -> ^( REPEAT numatom music_atom2 music_atom2*);	
//////////////////////////////////////////////////////////////////////////////////
partitura	:	beatbox speederman 
		(trans (armour l_notas4* -> ^(PARTITURA beatbox speederman trans armour l_notas4*)
	|	  l_notas4*->^(PARTITURA beatbox speederman trans ^(ARMOR NURAN) l_notas4*))
	|	 armour l_notas4*->^(PARTITURA beatbox speederman ^(TRANSPORT INT["0"]) armour l_notas4*)
	|	 l_notas4*->^(PARTITURA beatbox speederman ^(TRANSPORT INT["0"]) ^(ARMOR NURAN) l_notas4*))
	;	
//////////////////////////////////////////////////////////////////////////////////
for_stmt : FOR '(' assign ';' expr ';' assign ')' '{' block_instructions '}' -> ^(FOR  ^(FCONDS assign expr assign) block_instructions);

while_stmt	:	WHILE^ expr '{' block_instructions '}'!
            ;
//////////////////////////////////////////////////////////////////////////////////
return_stmt	:	RETURN^ expr?
        ;

read	:	READ^ ID
        ;

write	:   WRITE^ (expr | STRING )
        ;
//////////////////////////////////////////////////////////////////////////////////
expr    :   boolterm (OR^ boolterm)*
        ;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
        ;

num_expr:   term ( (PLUS^ | MINUS^) term)*
        ;

term    :   factor ( (MUL^ | DIV^ | MOD^) factor)*
        ;

factor  :   (NOT^ | PLUS^ | MINUS^)? atom
        ;

atom    :   ID 
        |   INT
        |eq = OCT-> INT[$eq,$eq.text]
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |   funcall
        |   '('! expr ')'!
        ;
//////////////////////////////////////////////////////////////////////////////////
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;
numatom	:	INT
	  |eq = OCT-> INT[$eq,$eq.text]
	  |ID;
	  
expr_list:  expr (','! expr)*
        ;
//////////////////////////////////////////////////////////////////////////////////

BEMOL	:	'$';
SOSTENIDO	:	'#';
BECUADRO	:	'¬';	
FOR	:	'for';
DO	:	'Do';
RE	:	'Re';
MI	:	'Mi';
FA	:	'Fa';
SOL	:	'Sol';
LA	:	'La';
SI	:	'Si';
QUIET	:	'Quiet';
ARMOR	:	'Armor';
BEAT	:	'Beat';
SPEED	:	'Speed';
CHORUS	:	'Chorus';
VOICE	:	'Voice';
PIANO	:	'Piano';
FLAUTA	:	'Flauta';
SAXO	: 	'Saxo';
SHOT	:	'Shot';
ORGANO	:	'Organo';
TROMPA 	:	'Trompa';
XILOFONO	:	'Xilofono';
PERCUSION	:	'Percusion';
VIOLA	:	'Viola';	
GUITARRA	:	'Guitarra';
TWICE	:	'Twice';
HALF	:	'Half';
RAISE	:	'Raise';
FALL	:	'Fall';
PEQUAL	:	'+=';
REQUAL	:	'-=';
MEQUAL	:	'*=';
DEQUAL	:	'/=';
EQUAL	: '=' ;
NOT_EQUAL: '!=' ;
LT	    : '<' ;
LE	    : '<=';
GT	    : '>';
GE	    : '>=';
DPLUS	:'++';
DMINUS	:'--';
PLUS	: '+' ;
MINUS	: '-' ;
MUL	    : '*';
DIV	    : '/';
MOD	    : '%' ;
NOT	    : 'not';
AND	    : 'and' ;
OR	    : 'or' ;	
IF  	: 'if' ;
ELSE	: 'else' ;
WHILE	: 'while' ;
FUNC	: 'func' ;
RETURN	: 'return' ;
READ	: 'read' ;
WRITE	: 'write' ;
TRUE    : 'true' ;
FALSE   : 'false';
TRANSPORT:	'Transport';
OCT	:	'0'..'8';
INT 	:	'0'..'9'+ ;
ID  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_')* ;



// C-style comments
COMMENT	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS  	: ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    	;



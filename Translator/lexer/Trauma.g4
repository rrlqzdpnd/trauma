grammar Trauma;

program
    :   declarationlist
    ;

declarationlist
    :   declarationlist declaration
    |   declaration
    ;

declaration
    :   vardeclaration
    |   funcdeclaration
    ;

vardeclaration
    :   typespecifier vardeclist Semicolon 
    ;

typespecifier
    :   'bool'
    |   'int'
    |   'float'
    |   'char'
    |   'string'
    |   'void'
    ;

vardeclist
    :   vardeclist Comma vardeclinit
    |   vardeclinit
    ;

vardeclinit
    :   Id
    |   Id Equal simpleexpression
    ;

simpleexpression
    :   simpleexpression Or andexpression
    |   andexpression
    ;

andexpression
    :   andexpression And unaryrelexpression
    |   unaryrelexpression
    ;

unaryrelexpression
    :   Not unaryrelexpression
    |   relexpression
    ;

relexpression
    :   relexpression Relop sumexpression
    |   sumexpression
    ;

sumexpression
    :   sumexpression Sumop multexpression
    |   multexpression
    ;

multexpression
    :   multexpression Multop unaryexpression
    |   unaryexpression
    ;

unaryexpression
    :   Unaryop unaryexpression
    |   factor
    ;

factor
    :   mutable
    |   immutable
    ;

mutable
    :   Id
    ;

immutable
    :   LeftParen expression RightParen
    |   call
    |   constant
    ;

call
    :   Id LeftParen args RightParen
    ;

args
    :   arglist
    |
    ;

arglist
    :   arglist Comma expression
    |   expression
    ;

constant
    :   INTCONST
    |   FLOATCONST
    |   CHARCONST
    |   STRINGCONST
    |   True
    |   False
    |   NEWLINE
    |   TAB
    ;

expression
    :   mutable Equal expression
    |   simpleexpression
    ;

funcdeclaration
    :   typespecifier Id LeftParen params RightParen statement
    ;

params
    :   paramlist
    |
    ;

paramlist
    :   paramlist Comma typespecifier Id
    |   typespecifier Id
    ;

statement
    :   breakstmt
    |   returnstmt
    |   iterationstmt
    |   selectionstmt
    |   compoundstmt
    |   expressionstmt
    |   printstmt
    ;

breakstmt
    :   'break' Semicolon
    ;

returnstmt
    :   'return' Semicolon
    |   'return' simpleexpression Semicolon
    ;

iterationstmt
    :   'while' LeftParen simpleexpression RightParen statement
    ;

selectionstmt
    :   'if' LeftParen simpleexpression RightParen statement
    |   'if' LeftParen simpleexpression RightParen statement 'else' statement
    ;

compoundstmt
    :   LeftBrace localdeclarations statementlist RightBrace
    ;

localdeclarations
    :   localdeclarations vardeclaration
    |
    ;

statementlist
    :   statementlist statement
    |
    ;

expressionstmt
    :   expression Semicolon
    |   Semicolon
    ;

printstmt
    :   'echo' simpleexpression Semicolon
    ;



Whitespace  :   [ \t]+ -> skip ;
Newline :   ( '\r' '\n'? | '\n' ) -> skip ;
BlockComment    :   '/*' .*? '*/' -> skip ;
LineComment :   '//' ~[\r\n]* -> skip ;

INTCONST    :   Unaryop? [0-9]+ ;
FLOATCONST  :   Unaryop? [0-9]+ Period [0-9]+ ;
CHARCONST   :   '\'' ~['\\\r\n] '\'' ;
STRINGCONST :   '"' [a-zA-Z0-9!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/? ]* '"';
NEWLINE     :   [\n];
TAB         :   [\t];

Semicolon   :   ';' ;
Comma   :   ',' ;
Period  :   '.' ;
Id  :   [a-zA-Z_]+  ;
Or  :   '||'    ;
And :   '&&'    ;
Not :   '!' ;
Relop   :   '<=' | '<' | '==' | '>' | '>=' | '!=' ;
Sumop   :   '+' | '-' ;
Multop  :   '*' | '/' | '%' ;
LeftParen   : '(' ;
RightParen  : ')' ;
LeftBrace   : '{';
RightBrace  : '}';
Unaryop :   '-' ;
True    :   'true' ;
False   :   'false' ;
Equal   :   ':=' ;

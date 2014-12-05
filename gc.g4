grammar gc;

init: statements;

statements: statement (NEWLINE statement)*;

statement:
     lvalue ASSIGN expression                           # Assign
     | expression                                       # Print
     |                                                  # Emp
     ;

lvalue: STRING;
expression: '(' expression ',' expression ')'            # Pair
     | STRING                                            # Var
     | INT                                               # Int
     | 'first' '(' expression ')'                        # First
     | 'second' '(' expression ')'                       # Second
     ;

INT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT*;
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EXP: '^';
WHITESPACE: [ \t] -> skip;
NEWLINE: '\n';
ASSIGN: '=';
BLOCK_START: '{';
BLOCK_END: '}';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
AND: 'and';
OR: 'or';
NOT: 'not';
PAREN_OPEN: '(';
PAREN_CLOSE: ')';
STRING: [a-zA-Z][a-zA-Z0-9]*;

fragment DIGIT: [0-9];

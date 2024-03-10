grammar soprano;
// rule: childrens
root: procedimiento* EOF; // cualquier procedimiento cero o más veces y End Of File

// REGLAS
inss: ins*;

ins: (condicion | iteracion) 
    | (lectura | escritura | llamada_procedimiento | asignacion | reproduccion)
    | (push | cut)
    ;

lectura: '<?>' VAR;
escritura: '<w>' expr+;
condicion: 'if' expr LB inss RB ('else' LB inss RB)?; // 1 o ningun else
iteracion: 'while' expr LB inss RB;

procedimiento: PROCNAME paramsId LB inss RB;
llamada_procedimiento: PROCNAME paramsExpr;

paramsId: (VAR)*;
paramsExpr: (expr)*;

asignacion: VAR ASSIGN expr;
reproduccion: REPROD expr;
lista: LC expr* RC;
lista_size: SIZE VAR;
consult: VAR LS expr RS;
cut: CORTA VAR LS expr RS;
push: VAR AGREGA expr;

expr: expr MUL expr     # Mult
    | expr DIV expr     # Divide
    | expr MOD expr     # Mod
    | expr SUM expr     # Suma
    | expr RESTA expr   # Resta
    | expr GT expr      # Gt
    | expr GET expr     # Get
    | expr LT expr      # Lt
    | expr LET expr     # Let
    | expr EQ expr      # Eq
    | expr NEQ expr     # Neq
    | VAR               # Var
    | STRING            # String
    | NUM               # Num
    | lista             # List
    | lista_size        # Size
    | consult           # Consulta
    | NOTA              # Nota
    | LP expr RP        # Parents
    ;


// TOKENS
LB: '|:';
RB: ':|';
LS: '[';
RS: ']';
LC: '{';
RC: '}';
LP: '(';
RP: ')';

ASSIGN: '<-';
SIZE: '#';
CORTA: '8<';
AGREGA: '<<';
REPROD: '(:)';

MUL: '*';
DIV: '/';
MOD: '%';
SUM: '+';
RESTA: '-';
EQ: '=';
NEQ: '/=';
GT: '>';
LT: '<';
GET: '>=';
LET: '<=';


PROCNAME: [A-Z][a-zA-Z0-9]*;
NOTA: [A-G][0-9]?;
VAR: [a-zA-Z][a-zA-Z0-9]*;
NUM: '-'? [0-9]+('.'[0-9]+)?;
STRING: '"' ('\\' . | ~ ('\\'|'"'))* '"';
COMMENT: '###' ~[\r\n]* -> skip;
WS: [\t\r\n]+ -> skip;      // omitir espacios en blanco

grammar soprano;
// rule: childrens
root: procedimiento* EOF; // cualquier procedimiento cero o más veces y End Of File

// REGLAS
inss: ins*;

ins: (condicion | iteracion) 
    | (lectura | escritura | llamadaProcedimiento | asignacion | reproduccion)
    | (push | cut)
    ;

lectura: '<?>' VAR;
escritura: '<w>' expr+;
condicion: 'if' expr LB inss RB ('else' LB inss RB)?; // 1 o ningun else
iteracion: 'while' expr LB inss RB;

procedimiento: PROCNAME paramsId LB inss RB;
llamadaProcedimiento: PROCNAME paramsExpr;

paramsId: (VAR)*;
paramsExpr: (expr)*;

asignacion: VAR ASSIGN expr;
reproduccion: REPROD expr;
lista: LC expr* RC;
listaSize: SIZE VAR;
consult: VAR LS expr RS;
cut: CORTA VAR LS expr RS;
push: VAR AGREGA expr;

expr: expr MUL expr     # Mult
    | expr DIV expr     # Divide
    | expr MOD expr     # Modulo
    | expr SUM expr     # Suma
    | expr RESTA expr   # Resta
    | expr GT expr      # GreaterThan
    | expr GET expr     # GreaterOrEqualThan
    | expr LT expr      # LessThan
    | expr LET expr     # LessOrEqualThan
    | expr EQ expr      # Equal
    | expr NEQ expr     # NotEqual
    | VAR               # Variable
    | STRING            # String
    | NUM               # Number
    | lista             # List
    | listaSize         # SizeList
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

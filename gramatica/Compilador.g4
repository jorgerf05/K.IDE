grammar Compilador;

compilador: cuerpo;

cuerpo: ENDL* VOID PRINCIPAL '(' args ')' '{' ENDL*contenido* fin;
fin:'}';
args: ARG*;

contenido:
assign ENDL*
|declaration ENDL*
|impresion ENDL*
|if ENDL*
|for ENDL*
;

if: IF '('condicion')' '{'ENDL* contenido*ENDL*'}' ENDL* else?;

condicion:
   expr op =(MAYOR|MAYORIGUAL|MENOR|MENORIGUAL|IGUALQUE|DIFERENTEDE) expr
   |condicion opLog=(OR|AND) condicion | '('condicion')' opLog=(OR|AND) '('condicion')'
   |BOOL
   ;

else: ELSE ('{' ENDL* contenido* ENDL* '}'|if);

for: FOR '('declaration', ' condicion', 'assign')''{'ENDL* contenido* ENDL*'}';

declaration:  TYPE ID (EQUALS expr)?;

assign: ID EQUALS expr #assignment;

impresion: PRINT '('expr')'|PRINT'('STRING')';

expr:
  expr POTENCIA expr #potencia
| expr op=(POR|ENTRE) expr #multiplicacion_o_division
| expr op=(MAS|MENOS) expr #suma_o_resta
| '('expr')' #pare
| NUM #numero
| ID #variable
;

VOID: 'void';
PRINCIPAL: 'principal';
NUM: [0-9]+(.[0-9]+)*;
POTENCIA:'^';
MAS: '+';
POR: '*';
MENOS: '-';
ENTRE:'/';
EQUALS: '=';
FOR:'for';
OR:'or';
AND:'and';
BOOL:'true'|'false';
IF: 'if';
ELSE:'else';
TYPE:'int'|'float';
MAYOR: '>';
MAYORIGUAL:'>=';
MENOR: '<';
MENORIGUAL:'<=';
DIFERENTEDE:'!=';
IGUALQUE:'==';
PRINT:'console.print';
ID: [a-zA-Z]+;
STRING:'"'[a-zA-Z ]+'"';
ARG: [a-zA-Z0-9]+;
ENDL:[\n];
IGNORE: [ \t\r] ->skip;
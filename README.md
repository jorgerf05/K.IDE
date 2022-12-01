# Kiwi-lang
Lenguaje, compilador y transpilador para Lenguajes y Autómatas II. Escrito en Java, ANTLR4, Python y un poco de CSS. 
Inspirado en el estilo de Python y ciertas referencias a JavaScript

### Dependencias
- Python 3.11
- Java 19
- JavaFX
- Kitty terminal
- NeoVim
- IntelliJ Idea* (para el build, es posible utilizar otras herramientas o hacerlo a mano)

### Instalación

```
git clone https://github.com/jorgerf05/Compilador.git
cd Compilador
idea .
```


### Gramática de lenguaje

```java

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
ID: [a-zA-Z0-9_]+;
STRING:'"'[a-zA-Z. ]+'"';
ARG: [a-zA-Z0-9]+;
ENDL:[\n];
IGNORE: [ \t\r] ->skip;

```

### Interfaz gráfica con declaración, asignación e impresión
La interfaz gráfica fue creada usando JavaFX en conjunto con SceneBuilder. Adem´as, se opt´o por usar un
Stylesheet de CSS para darle un estilo sencillo pero elegante al entorno de desarrollo. La interfaz es invocada desde
la clase Main de la siguiente manera:

```java
public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("IDE.fxml")));
        Scene scene = new Scene(root);
        String css_theme = Objects.requireNonNull(this.getClass().getResource("bootstrap3.css")).toExternalForm();
        scene.getStylesheets().add(css_theme);
        primaryStage.setScene(scene);
        primaryStage.setTitle("IDE");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
```



package compilador.principal;

import compilador.parser.CompiladorBaseVisitor;
import compilador.parser.CompiladorParser;

import java.util.*;

public class MyVisitor extends CompiladorBaseVisitor<Object> {
    Map<String, Object> memtest = new HashMap<String, Object>();
    private List<Map<String, Object>> mem = new ArrayList<Map<String, Object>>();
    private List<String> jasminRelation = new ArrayList<String>();
    int level = 0;
    int methods = 0;
    boolean writing = true;
    boolean needsIf = false;

    /*crear una lista de hashmaps. accedemos a ella mediante algo como
    * lista.get(nivel) -> un hashmap de todas las variables de ese nivel
    *
    * */
    public static List<String> translation = new ArrayList<String>();
    public static List<String> jasmin = new ArrayList<String>();

    @Override
    public Object visitCuerpo(CompiladorParser.CuerpoContext ctx) {
        // INICIALIZACIÓN DE VARIABLES
        Map<String, Object> memtest = new HashMap<String, Object>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> dummy = new LinkedHashMap<>(memtest);
            mem.add(dummy);
            jasminRelation.add(null);
        }
        jasmin.add(";------AUTO-GENERATED JASMIN JVM CODE------\n");
        jasmin.add(".class public "+ctx.PRINCIPAL().getText());
        jasmin.add("\n.super java/lang/Object");
        jasmin.add("\n.method public static main([Ljava/lang/String;)V");
        jasmin.add("\n\t.limit stack 10");
        jasmin.add("\n\t.limit locals 40\n\n");

        return visitChildren(ctx);
    }
    @Override public Object visitFin(CompiladorParser.FinContext ctx) {
        jasmin.add("\n\treturn");
        jasmin.add("\n.end method");
        return visitChildren(ctx);
    }
    @Override
    public Object visitImpresion(CompiladorParser.ImpresionContext ctx) {
        Object test = null;
        String out;
        if (ctx.STRING() != null) {//si hay un string literal
            out = ctx.STRING().toString();
            System.out.println(out);
            Controller.static_lbl.setText(out);
            writeJasmin("\ngetstatic java/lang/System/out Ljava/io/PrintStream;");
            writeJasmin("\nldc "+out);
            writeJasmin("\ninvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        } else {//si hay variable

            //out = String.valueOf(this.visit(ctx.expr()));
            double out_real = (double)visit(ctx.expr());
            int out_int = (int)out_real;
            out = String.valueOf(out_real);
            String variable = ctx.expr().getText();

            System.out.println(out);
            Controller.static_lbl.setText(out);

            translation.add("printf(\"%i\"," + variable + ");");
            writeJasmin("\ngetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            findJasmin(ctx.expr().getText());
            //writeJasmin("\nldc "+out_int+"\n");
            writeJasmin("\ninvokevirtual java/io/PrintStream/println(I)V\n");
        }

        return null;

    }
    @Override
    public Object visitNumero(CompiladorParser.NumeroContext ctx) {

        double num = Double.parseDouble(ctx.NUM().getText());
        int num_i =(int)num;
        writeJasmin("ldc "+num_i+"\n");
        //jasmin.add("\tldc "+num+"\n\tistore "+mem.get(level).size()+"\n");
        return num;

    }
    @Override
    public Object visitPotencia(CompiladorParser.PotenciaContext ctx) {

        double a = (double) visit(ctx.expr(0));
        double b = (double) visit(ctx.expr(1));

        return Math.pow(a, b);
    }
    @Override
    public Object visitMultiplicacion_o_division(CompiladorParser.Multiplicacion_o_divisionContext ctx) {

        double a = (double) visit(ctx.expr(0));
        double b = (double) visit(ctx.expr(1));

        if (Objects.equals(ctx.op.getText(), "*")) {
            return a * b;
        } else {
            return a / b;
        }
    }
    @Override
    public Object visitSuma_o_resta(CompiladorParser.Suma_o_restaContext ctx) {

        double a = (double) visit(ctx.expr(0));
        double b = (double) visit(ctx.expr(1));

        if (Objects.equals(ctx.op.getText(), "+")) {
            return a + b;
        } else {
            return a - b;
        }
    }
    @Override
    public Object visitAssignment(CompiladorParser.AssignmentContext ctx) {

        String id = ctx.ID().toString();
        Object obj = visit(ctx.expr());

        double dummy = (double) obj;
        int entero_jasmin = (int) dummy;

        if (!mem.get(level).containsKey(id)) {
            writeJasmin("ldc "+entero_jasmin+"\nistore "+mem.get(level).size()+"\n");
            mem.get(level).put(id, obj);
            jasminRelation.set(mem.get(level).size(), id);
        } else {
            if (obj != null) {
                mem.get(level).replace(id, obj);
            }
        }
        translation.add(id + " = " + obj.toString() + ";");
        return null;
    }
    @Override
    public Object visitVariable(CompiladorParser.VariableContext ctx) {

        String id = ctx.ID().toString();
        int i = 0;
        boolean found = false;

        if (mem.get(level).containsKey(id)){

            //return (mem.get(id));
            return mem.get(level).get(id);
        } else {
            Controller.static_lbl.setText("La variable " + id + " no existe!");
            System.out.println("La variable " +id + " no existe!!");
            return null; //de mientras
        }
    }
    @Override
    public Object visitDeclaration(CompiladorParser.DeclarationContext ctx) {
        String id = ctx.ID().toString();
        Object obj = visit(ctx.expr());

        double dummy = (double) obj;
        int entero_jasmin = (int) dummy;

        if (!mem.get(level).containsKey(id)){
            if (ctx.EQUALS() != null) { //Si hay asignacion
                writeJasmin("ldc "+entero_jasmin+"\nistore "+mem.get(level).size()+"\n");
                mem.get(level).put(id, obj);
                jasminRelation.set(mem.get(level).size(), id);
                translation.add(ctx.TYPE().toString() + " " + id + " = " + obj + ";");
            } else { //Si no hay asignacion
                mem.get(level).put(id, null);
                translation.add(ctx.TYPE().toString() + " " + id + ";");
            }
        } else {
            Controller.static_lbl.setText("La variable " + id + " ya existe!");
            System.out.println("La variable " + id + " ya existe!");
        }
        return visitChildren(ctx);
    }
    @Override
    public Object visitCondicion(CompiladorParser.CondicionContext ctx) {
        boolean bool, bool2;

        if(ctx.opLog!=null) { //si tenemos AND o OR
            switch (ctx.opLog.getText()) {
                case "and" -> {
                    bool = (boolean) visit(ctx.condicion(0));
                    bool2 = (boolean) visit(ctx.condicion(1));
                    if (bool && bool2) {
                        return true;
                    }
                }
                case "or" -> {
                    bool = (boolean) visit(ctx.condicion(0));
                    bool2 = (boolean) visit(ctx.condicion(1));
                    if (bool || bool2) {
                        return true;
                    }
                }
                default -> {
                    Controller.static_lbl.setText("Operador inválido");
                    System.out.println("Operador logico no valido");
                }
            }
        }
        else if (ctx.BOOL() != null) { //si presentamos booleanos literales
            bool = Boolean.parseBoolean(ctx.BOOL().getText());
            return bool;

        } else{ //si hay que resolver con lógica numerica
            String operator = ctx.op.getText();
            double a = (double) visit(ctx.expr(0));
            double b = (double) visit(ctx.expr(1));

            bool = switch (operator) {
                case ">" -> a > b;
                case ">=" -> a >= b;
                case "<" -> a < b;
                case "<=" -> a <= b;
                case "!=" -> a != b;
                case "==" -> a == b;
                default -> false;
            };

            if (needsIf) {
                switch (operator) {
                    case ">" -> jasmin.add("if_icmpgt ");
                    case ">=" -> jasmin.add("if_icmpge ");
                    case "<" -> jasmin.add("if_icmplt ");
                    case "<=" -> jasmin.add("if_icmple ");
                    case "!=" -> jasmin.add("if_icmpnq ");
                    case "==" -> jasmin.add("if_icmpeq ");
                }
            }
            return bool;
        }
        return false;
    }
    @Override
    public Object visitIf(CompiladorParser.IfContext ctx) {
        findJasmin(ctx.condicion().expr(0).getText());
        findJasmin(ctx.condicion().expr(1).getText());
        needsIf = true;
        boolean key = (boolean) visit(ctx.condicion()); //resolvemos la lógica de la condición
        needsIf = false;

        jasmin.add("if"+"\ngoto else\n");

        jasmin.add("if"+":\n");

        if (key) {//si se cumple la condición
            changeLevel("up");

            for (int i = 0; i <= ctx.contenido().size()-1 ; i++) {//visitamos a los hijos, menos al último (porque es else)
                System.out.println(ctx.contenido().get(i).getText());
                visit(ctx.contenido().get(i));
            }
            jasmin.add("\nelse:\nldc 0");//dummy code
            jasmin.add("\ngoto fin\n");

        } else {//si no, visitamos el else, que es el último hijo de la estructura if
                //si no hay else, esto simplemente visitará un newline y no hará nada
            changeLevel("up");
            jasmin.add("else:\n");

            for (int i = 0; i <= ctx.else_().children.size() -1 ; i++) {
                visit(ctx.else_().children.get(i));
            }
        }
        changeLevel("down");
        writeJasmin("\nfin:\n");
        return null;
    }
    @Override
    public Object visitFor(CompiladorParser.ForContext ctx) {

        visit(ctx.declaration()); //primero validamos la declaracion
        boolean cond = (boolean) visit(ctx.condicion()); //resolvemos la condición+
        int to = (int) (Math.round((Double) visit(ctx.condicion().expr(1))));
        writeJasmin("\nldc "+to);
        writeJasmin("\nistore 10"); //la posicion 10 está reservada para variables de loop

        if (cond) {//si se cumple la condición de buenas a primeras
            writeJasmin("\nLoop:");
            changeLevel("up");

            while (true) {
                for (int j = 0; j < ctx.contenido().size(); j++) {//ciclo para visitar los hijos
                    visit(ctx.contenido(j));
                }

                findJasmin(ctx.condicion().expr(0).getText()); //iload x
                writeJasmin("\nldc 1");
                writeJasmin("\niadd");
                writeJasmin("\nistore "+loadJasmin(ctx.condicion().expr(0).getText()));
                writeJasmin("\niload 10");//cargamos el tope
                writeJasmin("\niload "+loadJasmin(ctx.condicion().expr(0).getText()));//cargamos i
                writeJasmin("\nif_icmpeq fin_loop"); //si son iguales, llegamos al tope
                writeJasmin("\ngoto Loop\n");

                visit(ctx.assign()); //i = i+1
                if (!(boolean) visit(ctx.condicion())) { //si la condición es falsa, hemos llegado al tope.
                    changeLevel("down");
                    writing = true;
                    writeJasmin("\nfin_loop:\n");
                    return null;
                }
                writing = false;
            }
        }
        return null;
    }
    void changeLevel(String str) {
        switch (str) {
            case "up":
                System.out.println("Subiendo nivel...");
                level++; //subimos el nivel
                Map<String, Object> tmp = new HashMap<>(mem.get(level - 1)); //hacemos una copia temporal del nivel abajo
                mem.set(level, tmp);//copiamos el contenido de tmp al nivel actual
                break;

            case "down":
                System.out.println("Bajando nivel...");
                Map<String, Object> memtest = new HashMap<String, Object>();//Mapa vacío
                mem.set(level, memtest); //Vaciamos el nivel
                level--; //bajamos de nivel
                break;
        }
    }
    void addJasminVariables(){
        /*
        * Traduce todas las variables en la memoria a jasmin. No reconoce variables de scope, ni variables
        * de ciclos.
        * */
        List<Object> values = new ArrayList<>(mem.get(level).values());
        for (int i = 0; i <= values.size() ; i++) {
            double num = (double) values.get(i);
            jasmin.add("ldc "+(int)num+"\nistore "+i);

        }
    }
    void writeJasmin(String line){
        if (writing){
            jasmin.add(line);
        }
    }

    void findJasmin(String id){
        System.out.println("Buscando variable... "+id);
        List<String> keys = new ArrayList<>(mem.get(level).keySet());

        System.out.println("-------VARIABLES EN MEMORIA-------");
        for (String str:keys
             ) {
            System.out.println(str);

        }
        System.out.println("----------------------------------");

        int i = 0;
        boolean found = false;
        try {
            do {
                if (Objects.equals(keys.get(i), id)) { //si encontramos el nombre

                    System.out.print("VARIABLE ENCONTRADA: ");
                    System.out.println("pos -> "+i+" var -> "+keys.get(i));
                    writeJasmin("\niload " + i+"\n"); //cargamos la variable i
                    found = true;
                }
                i++;
            }while (!found);
        }catch (Exception e){
            System.out.println("No se encontró");
        }
    }
    Object loadJasmin(String id){
        System.out.println("Buscando variable... "+id);
        List<String> keys = new ArrayList<>(mem.get(level).keySet());

        System.out.println("-------VARIABLES EN MEMORIA-------");
        for (String str:keys
        ) {
            System.out.println(str);

        }
        System.out.println("----------------------------------");

        int i = 0;
        boolean found = false;
        try {
            do {
                if (Objects.equals(keys.get(i), id)) { //si encontramos el nombre

                    System.out.print("VARIABLE ENCONTRADA: ");
                    System.out.println("pos -> "+i+" var -> "+keys.get(i));
                    found = true;
                    return i; //cargamos la variable i

                }
                i++;
            }while (!found);
        }catch (Exception e){
            System.out.println("No se encontró");
        }
        return null;
    }
}
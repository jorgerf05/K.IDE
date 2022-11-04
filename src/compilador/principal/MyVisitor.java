package compilador.principal;

import compilador.parser.CompiladorBaseVisitor;
import compilador.parser.CompiladorParser;

import java.util.*;


public class MyVisitor extends CompiladorBaseVisitor<Object> {
    Map<String, Object> memtest = new HashMap<String, Object>();
    private List<Map<String, Object>> mem = new ArrayList<Map<String, Object>>();
    int level = 0;

    /*crear una lista de hashmaps. accedemos a ella mediante algo como
    * lista.get(nivel) -> un hashmap de todos las variables de ese nivel
    *
    * */

    public static List<String> translation = new ArrayList<String>();
    public static List<String> jasmin = new ArrayList<String>();


    @Override
    public Object visitCuerpo(CompiladorParser.CuerpoContext ctx) {
        // INICIALIZACIÓN DE VARIABLES
        Map<String, Object> memtest = new HashMap<String, Object>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> dummy = new HashMap(memtest);
            mem.add(dummy);
        }

        jasmin.add(".class public "+ctx.PRINCIPAL().getText());
        jasmin.add("\n.super java/lang/object");
        jasmin.add("\n.method public static main([Ljava/lang/String;)V");
        jasmin.add("\n\t.limit stack 10");
        jasmin.add("\n\t.limit locals 40");

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
        if (ctx.STRING() != null) {
            out = ctx.STRING().toString();
            System.out.println(out);
            Controller.static_lbl.setText(out);
        } else {
            out = String.valueOf(this.visit(ctx.expr()));
            String variable = ctx.expr().getText();
            System.out.println(out);
            Controller.static_lbl.setText(out);
            translation.add("printf(\"%i\"," + variable + ");");
        }

        return null;

    }
    @Override
    public Object visitNumero(CompiladorParser.NumeroContext ctx) {

        return Double.parseDouble(ctx.NUM().getText());
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
        if (!mem.get(level).containsKey(id)) {
            mem.get(level).put(id, obj);
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
        //if (mem.containsKey(id)) {
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

        if (!mem.get(level).containsKey(id)){
            if (ctx.EQUALS() != null) { //Si hay asignacion
                mem.get(level).put(id, obj);
                translation.add(ctx.TYPE().toString() + " " + id + " = " + visit(ctx.expr()) + ";");
            } else { //Si no asignacion
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
            return bool;
        }
        return false;
    }
    @Override
    public Object visitIf(CompiladorParser.IfContext ctx) {

        boolean key = (boolean) visit(ctx.condicion()); //resolvemos la lógica de la condición

        if (key) {//si se cumple la condición
            changeLevel("up");
            for (int i = 0; i < ctx.children.size() - 1; i++) {//visitamos a los hijos, menos al último (porque es else)
                visit(ctx.children.get(i));
            }

        } else {//si no, visitamos el else, que es el último hijo de la estructura if
                //si no hay else, esto simplemente visitará un newline y no hará nada
            changeLevel("up");
            visit(ctx.children.get(ctx.children.size() - 1));
        }
        changeLevel("down");
        return null;
    }
    @Override
    public Object visitFor(CompiladorParser.ForContext ctx) {

        visit(ctx.declaration()); //primero validamos la declaracion
        boolean cond = (boolean) visit(ctx.condicion()); //resolvemos la condición

        if (cond) {//si se cumple la condición de buenas a primeras
            changeLevel("up");
            while (true) {
                for (int j = 0; j < ctx.contenido().size(); j++) {//ciclo para visitar los hijos
                    visit(ctx.contenido(j));
                }
                visit(ctx.assign()); //i = i+1
                if (!(boolean) visit(ctx.condicion())) { //si la condición es falsa, hemos llegado al tope.
                    changeLevel("down");
                    return null;
                }
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
}
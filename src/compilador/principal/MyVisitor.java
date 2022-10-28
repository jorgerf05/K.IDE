package compilador.principal;

import compilador.parser.CompiladorBaseVisitor;
import compilador.parser.CompiladorParser;

import java.util.*;


public class MyVisitor extends CompiladorBaseVisitor<Object> {
    Map<String, Object> mem = new HashMap<String, Object>();
    public static List<String> translation = new ArrayList<String>();
    @Override
    public Object visitImpresion(CompiladorParser.ImpresionContext ctx) {

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

        //System.out.println(ctx.NUM().getText());
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
        if (!mem.containsKey(id)) {
            mem.put(id, obj);
        } else {
            //Controller.static_lbl.setText("La variable ya existe!!");
            if (obj != null) {
                mem.replace(id, obj);
            }
        }
        translation.add(id + " = " + obj.toString() + ";");

        return null;
    }
    @Override
    public Object visitVariable(CompiladorParser.VariableContext ctx) {

        String id = ctx.ID().toString();
        if (mem.containsKey(id)) {
            return (mem.get(id));
        } else {
            Controller.static_lbl.setText("La variable " + id + " no existe!");
            System.out.println("La variable no existe!!");
            return null; //de mientras
        }
    }
    @Override
    public Object visitDeclaration(CompiladorParser.DeclarationContext ctx) {
        String id = ctx.ID().toString();
        Object obj = visit(ctx.expr());

        if (!mem.containsKey(id)) {
            if (ctx.EQUALS() != null) { //Si hay asignacion
                mem.put(id, obj);
                translation.add(ctx.TYPE().toString() + " " + id + " = " + visit(ctx.expr()) + ";");
            } else { //Si no asignacion
                mem.put(id, null);
                translation.add(ctx.TYPE().toString() + " " + id + ";");
            }
        } else {
            Controller.static_lbl.setText("La variable " + id + " ya existe!");
            System.out.println("La variable ya existe!");
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
            for (int i = 0; i < ctx.children.size() - 1; i++) {//visitamos a los hijos, menos al último (porque es else)
                visit(ctx.children.get(i));
            }

        } else {//si no, visitamos el else, que es el último hijo de la estructura if
                //si no hay else, esto simplemente visitará un newline y no hará nada
            visit(ctx.children.get(ctx.children.size() - 1));
        }
        return null;
    }
    @Override
    public Object visitFor(CompiladorParser.ForContext ctx) {

        visit(ctx.declaration()); //primero validamos la declaracion
        boolean cond = (boolean) visit(ctx.condicion()); //resolvemos la condición

        if (cond) {//si se cumple la condición de buenas a primeras
            while (true) {
                for (int j = 0; j < ctx.contenido().size(); j++) {//ciclo para visitar los hijos
                    visit(ctx.contenido(j));
                }
                visit(ctx.assign()); //i = i+1
                if (!(boolean) visit(ctx.condicion())) { //si la condición es falsa, hemos llegado al tope.
                    return null;
                }
            }
        }
        return null;
    }
}

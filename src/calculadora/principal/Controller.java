package calculadora.principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import calculadora.parser.CalculadoraLexer;
import calculadora.parser.CalculadoraParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private TextArea txt_codigo;
    @FXML private Label lbl_output;
    public static Label static_lbl;


    public void run(ActionEvent event)throws IOException {
        lbl_output.setText(null);
        String codigo = txt_codigo.getText();
        CharStream input = CharStreams.fromString(codigo);
        CalculadoraLexer lexico = new CalculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        CalculadoraParser sintactico = new CalculadoraParser(tokens);
        ParseTree arbol = sintactico.cuerpo();
        MyVisitor visitas = new MyVisitor();
        visitas.visit(arbol);
    }

    public void fromC(ActionEvent e){
        translateFromC(txt_codigo.getText());
    }
    public void toC(ActionEvent e){
        translateToC(MyVisitor.translation);
    }
    public void translateToC(List<String> in){
        List<String> out = new ArrayList<>();

        out.add("void main (){\n");
        for (String line:in) {
            out.add(line+"\n");
        }
        out.add("}");

        txt_codigo.clear();

        for (String line:out) { //mostramos la lista
            txt_codigo.appendText(line);
        }
    }

    public void translateFromC(String in){ //reemplazamos con expresiones regulares
        in = in.replaceAll("(#include <[a-zA-Z.]+>)", "");
        in = in.replaceAll("main", "principal");
        in = in.replaceAll(",", "");
        in = in.replaceAll(";", "");
        //in = in.replaceAll("\n", "");
        in = in.replaceAll("&&","and");
        in = in.replaceAll("(\\/[a-zA-Z0-9 ]*)","");
        in = in.replaceAll("printf", "console.print");
        in = in.replaceAll("(%.)", "");

        System.out.println(in);
        txt_codigo.setText(in);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        static_lbl = lbl_output;
    }
}

package compilador.principal;

import compilador.principal.Caller;
import compilador.parser.CompiladorLexer;
import compilador.parser.CompiladorParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
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
        CompiladorLexer lexico = new CompiladorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        CompiladorParser sintactico = new CompiladorParser(tokens);
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
        in = in.replaceAll("&&","and");
        in = in.replaceAll("(\\/[a-zA-Z0-9 ]*)","");
        in = in.replaceAll("printf", "console.print");
        in = in.replaceAll("(%.)", "");

        System.out.println(in);
        txt_codigo.setText(in);
    }
    @FXML
    public void writeToTxt() throws IOException {
        MyVisitor.jasmin.clear();
        run(null); //Llenamos la lista de traduccion. CAMBIAR A METODO ADDJASMINVARIABLES
        try{
            FileWriter myWriter = new FileWriter("Principal.j");
            for (String str: MyVisitor.jasmin
            ) {
                myWriter.write(str);
            }
            myWriter.close();

            ArrayList<String> commands = new ArrayList<String>();
            commands.add("python");
            commands.add("Main.py");
            Caller caller = new Caller(commands);
            caller.execute();
        }catch (IOException ex){
            System.out.println("error "+ex);
        }


    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        static_lbl = lbl_output;
    }
}

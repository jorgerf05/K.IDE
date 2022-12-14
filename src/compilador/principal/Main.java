package compilador.principal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("IDE.fxml")));
        Scene scene = new Scene(root);
        String css_theme = Objects.requireNonNull(this.getClass().getResource("bootstrap3.css")).toExternalForm();
        scene.getStylesheets().add(css_theme);
        primaryStage.setScene(scene);
        primaryStage.setTitle("K.IDE");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
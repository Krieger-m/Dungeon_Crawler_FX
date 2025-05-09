package tests.testSandbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SandboxTwo extends Application {

    public void start(Stage stage) {

        NewBtn click = new NewBtn("Example Button One");
            click.btnHandler();
        NewBtn details = new NewBtn("CLICK!");
            details.btnHandler();
        VBox root = new VBox();
            root.setAlignment(Pos.CENTER);
            root.setSpacing(40);
            root.getChildren().addAll(click.getBtn(),details.getBtn());

        Scene scene2 = new NewScene(root).getScene();

        stage.setTitle("SandboxTwo - 1st stage");
        stage.setScene(scene2 );
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

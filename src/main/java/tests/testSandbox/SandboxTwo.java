package tests.testSandbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SandboxTwo extends Application {

    public void start(Stage stage) {


        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(40);

        Scene scene = new Scene(root,340,240);

        NewBtn click = new NewBtn("Example Button One");
        NewBtn details = new NewBtn("CLICK!");

        click.btnHandler();
        details.btnHandler();
        root.getChildren().addAll(click.getBtn(),details.getBtn());

        scene.setRoot(root);

        stage.setTitle("SandboxTwo - 1st stage");
        stage.setScene(scene);
        stage.show();


    }
}

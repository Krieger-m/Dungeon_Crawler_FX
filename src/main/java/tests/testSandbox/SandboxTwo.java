package tests.testSandbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SandboxTwo extends Application {


    public void start(Stage stage) {

        Button click = new NewBtn("Example Button One").getBtn();

        Button details = new NewBtn("CLICK!").getBtn();
        VBox root = new VBox();
            root.setAlignment(Pos.CENTER);
            root.setSpacing(40);
            root.getChildren().addAll(click,details);

        Scene scene1 = new Scene(root,500,300);

        stage.setTitle("SandboxTwo - 1st stage");
        stage.setScene(scene1 );
        stage.show();


        click.setOnAction(a->{

        });

    }

    public static void main(String[] args) {
        launch();
    }



}

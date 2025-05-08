package tests.testSandbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SandboxTwo extends Application {

    public void start(Stage stage) {

        NewBtn newBtn2 = new NewBtn("Action");



        StackPane root = new StackPane();
        Scene scene = new Scene(root,340,240);
        root.getChildren().add(newBtn2.btn);
        scene.setRoot(root);




        NewBtn newBtn = new NewBtn();



        System.out.println(newBtn);

        System.out.println(newBtn2.btnText);
        System.out.println(newBtn2.id);

        newBtn2.setBtn();

        stage.setScene(scene);
        stage.show();





    }
}

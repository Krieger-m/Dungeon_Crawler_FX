package tests.testSandbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SandboxOne extends Application {



    public void btnHandler(Button btn, Stage stage, Scene scene){
        btn.setOnAction(actionEvent -> {
            System.out.println("btn-test check");

            SandboxTwo st = new SandboxTwo();
            st.setSandboxTwo(stage, scene);

        });
    }

    @Override
    public void start(Stage stage) throws Exception {

        StackPane root = new StackPane();
        VBox container = new VBox();
        container.setAlignment(Pos.CENTER);
        Button btn = new Button("Click!");

        Label lbl = new Label("first-tage test");

        container.getChildren().addAll(lbl,btn);
        root.getChildren().add(container);

        Scene sceneOne = new Scene(root,350,250);

        btn.setOnAction(actionEvent -> {
            System.out.println("btn-test check");

            SandboxTwo st = new SandboxTwo();
            st.setSandboxTwo(stage, sceneOne);

        });
        stage.setScene(sceneOne);

        stage.setTitle("SandboxWindow - SceneOne");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
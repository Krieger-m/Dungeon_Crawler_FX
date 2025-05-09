package tests.testSandbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SandboxOne extends Application {
        //NOTE Variables


        //NOTE Constructors
    //

        //NOTE Methods


    public void setAndShowStage(Stage x, Scene y, String title){
        x.setScene(y);
        x.setTitle(title);
        x.show();
    }

    public Scene prepareNewScene(){

        System.out.println("prepareNewScene - check");

        StackPane root = new StackPane();
        VBox container = new VBox();
        container.setAlignment(Pos.CENTER);
        Button btn = new Button("PrepButton!");
        Label lbl = new Label("prep-stage test check");
        Scene preparedScene = new NewScene(root).getScene();

        container.getChildren().addAll(lbl,btn);
        root.getChildren().add(container);

        btn.setOnAction(actionEvent -> {
            System.out.println("prepBtn-test check");

        });

        return preparedScene;
    }

    public void setNextScene(Stage stage, Scene previousScene){

        System.out.println("setNewScene - check");

        StackPane root = new StackPane();
        VBox container = new VBox();
        container.setAlignment(Pos.CENTER);
        Button btn = new Button("Back!");
        Label lbl = new Label("second-stage test");
        Scene nextScene = new NewScene(root).getScene();

        container.getChildren().addAll(lbl,btn);
        root.getChildren().add(container);

        btn.setOnAction(actionEvent -> {
            System.out.println("btn-test check");

            stage.setScene(previousScene);
        });
        setAndShowStage(stage, nextScene, "SandboxWindow - SceneTwo");
    }

    @Override
    public void start(Stage stage) throws Exception {


        Scene sceneOne  = prepareNewScene();

        StackPane root = (StackPane) sceneOne.getRoot();







        setAndShowStage(stage, sceneOne, "SandboxWindow - SceneOne");

    }

    public static void main(String[] args) {
        launch(args);
    }


}
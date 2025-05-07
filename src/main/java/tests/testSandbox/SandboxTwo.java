package tests.testSandbox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SandboxTwo extends SandboxOne{
    public void setSandboxTwo(Stage stage, Scene previousScene){
    StackPane root = new StackPane();
    VBox container = new VBox();
    container.setAlignment(Pos.CENTER);
    Button btn = new Button("Back!");
    Label lbl = new Label("second-stage test");




    container.getChildren().addAll(lbl,btn);
    root.getChildren().add(container);

    btnHandler(btn,stage,previousScene);
    
    Scene scene = new Scene(root,350,250);
    stage.setTitle("SandboxWindow - SceneTwo");
    stage.setScene(scene);

}
}

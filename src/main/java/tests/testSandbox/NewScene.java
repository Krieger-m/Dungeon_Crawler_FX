package tests.testSandbox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class NewScene{

        //NOTE Variables
    Scene scene;
    ArrayList<Scene> sceneList = new ArrayList<>();


        //NOTE Constructors
    public NewScene() {

        Label lbl = new Label("Congratulations, this is the second Scene!!!!");
        Button click = new NewBtn("Example Button Two").getBtn();

        Button details = new NewBtn("Back!").getBtn();
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(40);
        root.getChildren().addAll(lbl,click,details);


        this.scene = new Scene(root,500,300);
        addSceneToList();
    }

        //NOTE Methods
    public Scene getScene(){
        return this.scene;
    }

    public void addSceneToList(){
        this.sceneList.add(this.scene);
    }



}

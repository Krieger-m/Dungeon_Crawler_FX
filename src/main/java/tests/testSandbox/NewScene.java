package tests.testSandbox;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class NewScene{

        //NOTE Variables
    Scene scene;
    ArrayList<Scene> sceneList = new ArrayList<>();


        //NOTE Constructors
    public NewScene(Pane root) {
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

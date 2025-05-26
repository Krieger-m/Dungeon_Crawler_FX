
package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.RootAssembler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tests.testSandbox.NewRoot;

public class StageController extends Stage{

        //NOTE variables
    Stage stage ;
    Scene scene;

        //NOTE constructor
    public StageController(Stage stage, String[] arr, String imgPath) {
        this.stage=stage;
        updateStage(stage, arr,  imgPath);
    }

        //NOTE methods
    public void updateStage(Stage stage, String[] arr, String imgPath){

        StackPane root = new RootAssembler(arr, imgPath).getRoot();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("stage 2");
        stage.show();

    }

}

package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SceneFactory {

    //CHECK partly implemented for now


        //NOTE Variables

    ArrayList<Scene> sceneList = new ArrayList<>();

    Scene currentScene;

            //sizes     Height / Width
    double[] sizes ={   1020,   800};


        //NOTE Constructors
            //


    public SceneFactory() {
    }

    //NOTE Methods
    public void setStageStuff(Stage stage){

        stage.setMinHeight(sizes[0]);
        stage.setMinWidth(sizes[1]);
        stage.setMaxHeight(stage.getMinHeight());
        stage.setMaxWidth(stage.getMinWidth());

        stage.setTitle("Dungeon_Adventure_V0.1.9.2");
    };


}

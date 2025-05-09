package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SceneFactory {

        //NOTE partly implemented for now


        //NOTE Variables

    ArrayList<Scene> sceneList = new ArrayList<>();
    PaneFactory pf = new PaneFactory();

            //sizes     Height / Width
    double[] sizes ={   1080,   800};


        //NOTE Constructors
            //


        //NOTE Methods
    public void setStageStuff(Stage stage){

        stage.setMinHeight(sizes[0]);
        stage.setMinWidth(sizes[1]);
        stage.setMaxHeight(stage.getMinHeight());
        stage.setMaxWidth(stage.getMinWidth());

        stage.setTitle("Dungeon_Adventure_V0.1.9.1");
    };


}

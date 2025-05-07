package com.krieger.dungeon_crawler_fx._drop.factories;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SceneFactory {
        //NOTE implement later since it will be the last assembly-step


        //NOTE Variables

    ArrayList<Scene> sceneList = new ArrayList<>();


    PaneFactory pf = new PaneFactory();


            //sizes     Height / Width
    double[] sizes ={
            1080,
            800

    };


    //Scene currentScene = new Scene(pf.root,PaneFactory.colorCode.get(3));


        //NOTE Constructors
            //

        //NOTE Methods

    public void setStageStuff(Stage stage){


        stage.setMinHeight(sizes[0]);
        stage.setMinWidth(sizes[1]);//ib.img.getWidth());
        stage.setMaxHeight(stage.getMinHeight());
        stage.setMaxWidth(stage.getMinWidth());

        stage.setTitle("Dungeon_Adventure_V0.1.3");


    };


}

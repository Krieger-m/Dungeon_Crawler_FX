package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class StageFactory extends Stage{

    //CHECK partly implemented for now


        //NOTE Variables

    ArrayList<Scene> sceneList = new ArrayList<>();

    Stage stage;

            //sizes     Height / Width
    double[] sizes ={   1020,   800};


        //NOTE Constructors
            //

    public StageFactory() {
        this.stage = new Stage();
        setStageStuff();
    }



        //NOTE Methods


    public void setStageStuff(){

        this.stage.setMinHeight(sizes[0]);
        this.stage.setMinWidth(sizes[1]);
        this.stage.setMaxHeight(this.stage.getMinHeight());
        this.stage.setMaxWidth(this.stage.getMinWidth());

        this.stage.setTitle("Dungeon_Adventure_V0.1.9.5");
    };

        //NOTE Getters / Setters

    public Stage getStage() {
        return this.stage;
    }

}

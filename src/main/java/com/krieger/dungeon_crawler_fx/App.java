package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

        //NOTE Elements

    public static StackPane root;
    //public static Stage stage;
    public static Scene currentScene;

    private static Stage cStage;

    public static Stage getcStage(){
        return cStage;
    }

    //NOTE start()-method

    @Override
    public void start(Stage stage) {

        try{
                //NOTE new RootFactory to supply a new root, that already contains all
                // styled and positioned items from the other factories
                    // RootAssembler is provided with String-Arrays of the Scene-corresponding buttons and images
                // will move all the style stuff to a styles.css file but need to use VSCode for that since intelliJ
                // does not support .css files. guess what... you need the ultimate version of course!
            
    //CHECK -------------------------------------------->>>>>>>>
    //NOTE -------------------------------------------->>>>>>>>
            //CHECK continue here --------<<<<<<<<<<<
            // take a closer look into that:
            //NOTE https://www.pragmaticcoding.ca/javafx/swap-scenes
    //CHECK -------------------------------------------->>>>>>>>
    //NOTE -------------------------------------------->>>>>>>>

            cStage = stage;

            root = new RootAssembler(
                ButtonFactory.startScreenButtons,
                ImageFactory.startScreenPath
            ).getRoot();

           // stage = new StageFactory().getStage();

            currentScene = new Scene(root,PaneFactory.colorCode.get(3));


                //NOTE trying out a new approach on all the stage-stuff here

            for (Node p :root.getChildren()){
                System.out.println(p.getId());
            }
            System.out.println("--\troot ID: "+root.getId());


            stage.setScene(currentScene);
            stage.show();




        } catch(Exception e){
                    // Exception not thrown for now
        }

    }


    public static void main(String[] args) {
        launch(args);
    }


}


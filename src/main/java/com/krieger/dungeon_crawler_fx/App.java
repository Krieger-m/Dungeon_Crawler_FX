package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import com.krieger.dungeon_crawler_fx.factories.SceneFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

        //NOTE Elements



        //NOTE start()-method

    @Override
    public void start(Stage stage) {

        try{
                //NOTE new RootFactory implemented and put to use to
                // supply a new root, that already contains all
                // styled and positioned items from the other factories
                    // RootBuilder is provided with String-Arrays of the Scene-corresponding buttons and images
    //CHECK continue here --------<<<<<<<<<<<
            StackPane root = new RootBuilder(
                "mainRoot",
                ButtonFactory.inventoryButtons,
                ImageFactory.inventoryImgPath
            ).getRoot();

            Scene currentScene = new Scene(root,PaneFactory.colorCode.get(3));

            System.out.println("\troot.getUserData:" + root.getUserData());

                //NOTE trying out a new approach on all the stage-stuff here

            System.out.println("root.getParent(): "+root.getParent());


            SceneFactory sf = new SceneFactory();
            sf.setStageStuff(stage);

            stage.setScene(currentScene);
            stage.show();

        } catch(Exception e){
                    // Exception not thrown for now
        }

    }


    public static void main(String[] args) {
        launch();
    }


}


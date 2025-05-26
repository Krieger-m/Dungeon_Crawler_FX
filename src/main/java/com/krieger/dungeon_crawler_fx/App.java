package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;

import com.krieger.dungeon_crawler_fx.factories.StageController;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

        //NOTE Elements

    public static StackPane root;
    //public static Stage stage;
    public static Scene currentScene;

    private Stage stage;


    //NOTE start()-method

    @Override
    public void start(Stage primaryStage) {
        stage = new Stage();

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


            root = new RootAssembler(
                ButtonFactory.startScreenButtons,
                ImageFactory.startScreenPath
            ).getRoot();

           // stage = new StageFactory().getStage();

            currentScene = new Scene(root);


                //NOTE trying out a new approach on all the stage-stuff here

            for (Node p :root.getChildren()){
                System.out.println(p.getId());
            }
            System.out.println("--\troot ID: "+root.getId());


            stage.setScene(currentScene);
            stage.show();

            menuActions(stage);



        } catch(Exception e){
                    // Exception not thrown for now
        }



    }
    void switchToScene2 () {

        Scene scene2 = new Scene(
                new RootAssembler(ButtonFactory.mainSceneButtons,ImageFactory.mainImgPath).getRoot());

        this.stage.setScene(scene2);
    }


    public void menuActions(Stage stage1){

        for (Button b: ButtonFactory.btnList){
            System.out.println("\t\t\t\t"+b.getId());

            switch(b.getId().toLowerCase()){

                case "newadventurebtn" :

                    b.setOnAction(e-> {
                        System.out.println("\n\t\t //-- adventureBtn works!1");
                        System.out.println(RootAssembler.rootList.size());

                        StageController s = new StageController(stage1,ButtonFactory.mainSceneButtons, ImageFactory.mainImgPath);

                    }
                ); break;

                case "inventorybtn" :

                    b.setOnAction(e-> {
                                System.out.println("\n\t\t //-- inventory works!1");
                                System.out.println(RootAssembler.rootList.size());

                                StageController s = new StageController(stage1,ButtonFactory.inventoryButtons,
                                        ImageFactory.inventoryImgPath);

                            }
                    );break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}


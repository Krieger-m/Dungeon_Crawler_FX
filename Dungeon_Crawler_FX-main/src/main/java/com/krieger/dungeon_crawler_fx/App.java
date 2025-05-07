package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import com.krieger.dungeon_crawler_fx.factories.SceneFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class App extends Application {



    @Override
    public void start(Stage stage) throws Exception {


        try{

                    //NOTE Elements
                        // elements for later use in the code are created here, but as always I might find a better solution on the way and will be changing this :)

            ImageBuilder ib = new ImageBuilder();
            ib.setImgPath("file:./images/start_scene.jpg");


            ImageView iv = ib.imageViewBuilder("imageView");

            PaneFactory pf = new PaneFactory();

                        // create HBox for buttons
            pf.newPane("btnBox");

                        // creates VBox for image-container and button-box
            pf.newPane("mainContainer");

            pf.newPane("root");


                    //NOTE Assembling-zone here....
                        //is constantly under construction since I am still experimenting with the process.....



                    //generalAssembler for the buttons!
            pf.hBox.getChildren().addAll(PaneFactory.btnList);
            pf.vBox.getChildren().addAll(iv, pf.hBox);
            pf.root.getChildren().add(pf.vBox);




                    //CHECK will need to move the scene relate code in a later update to a separate class

            Scene currentScene = new Scene(pf.root,PaneFactory.colorCode.get(3));

                //NOTE Stage-stuff


                        //Set-Sizes //NOTE thanks Ulrich ;*
            //stage.setMinHeight((ib.img.getHeight()+pf.hBox.getHeight()));
            //stage.setMinWidth(800);//ib.img.getWidth());
            //stage.setMaxHeight(stage.getMinHeight());
            //stage.setMaxWidth(stage.getMinWidth());

            SceneFactory sf = new SceneFactory();
            sf.setStageStuff(stage);

            stage.setTitle("Dungeon_Adventure_V0.1.3");
            stage.setScene(currentScene);
            stage.show();

            Button cBtn = null;
            for (Button btn : PaneFactory.btnList) {
                switch (btn.getId()){
                    case "inventoryBtn": {
                        btn.setOnAction(a->{
                            System.out.println("\t - inventory-button works!");
                            ib.updateImage("file:./images/inventory_bg.jpg");
                            pf.bb.btnNames.add("Back");
                            pf.bb.createNewButtons();
                            /*
                            pf.hBox.getChildren().addAll(PaneFactory.btnList);
                            pf.vBox.getChildren().addAll(iv, pf.hBox);
                            pf.root.getChildren().add(pf.vBox);

                             */


                        });
                    }break;
                    case "actionBtn": {
                        btn.setOnAction(a->{
                            System.out.println("\t - action-button works!");
                        });
                    }break;
                    case "searchBtn": {
                        btn.setOnAction(a->{
                            System.out.println("\t - search-button works!");
                        });
                    }break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + btn.getId());

                }

            }




        } catch(Exception e){
                    // Exception not thrown for now
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        launch();
    }

}

package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.controllers.MainController;
import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import com.krieger.dungeon_crawler_fx.factories.SceneFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {


                //NOTE Elements
                    // elements for later use in the code are created here, but as always I might find a better solution on the way and will be changing this :)
/*
    ImageFactory ib = new ImageFactory();

    ImageView iv = ib.imageViewBuilder("imageView");

    PaneFactory pf = new PaneFactory();

 */

        //NOTE Handlers
    private void handleInventoryButton(ImageFactory ib, PaneFactory pf, ImageView iv) {

        ib.updateImage("file:./images/inventory_bg.jpg");

        List<Button> inventoryButtons = ButtonFactory.createNewButtons(MainController.inventoryButtons);

        updatePaneContent(pf, iv, inventoryButtons);
    }

    private void handleBackButton(ImageFactory ib, PaneFactory pf, ImageView iv,List<Button>btnList) {
        ib.updateImage("file:./images/start_scene.jpg");

        updatePaneContent(pf, iv,btnList);
    }

    private void handleSearchButton(PaneFactory pf) {
        Label messageOutput = new Label("Test Text!!!!");
        messageOutput.setFont(new Font(28));
        messageOutput.setTextFill(PaneFactory.colorCode.get(4));
        messageOutput.setLayoutY(-200);
        messageOutput.setLayoutX(0);
        messageOutput.setTranslateX(0);
        messageOutput.setTranslateY(920);
        messageOutput.setText(String.valueOf(messageOutput.getAlignment() + " " + " " + messageOutput.getLayoutX() + " " + messageOutput.getLayoutY()));
        pf.root.getChildren().add(messageOutput);
    }
    private void updatePaneContent(PaneFactory pf, ImageView iv, List<Button> btnList) {
        pf.hBox.getChildren().clear();
        pf.hBox.getChildren().addAll(btnList);
        pf.vBox.getChildren().clear();
        pf.vBox.getChildren().addAll(iv, pf.hBox);
        pf.root.getChildren().clear();
        pf.root.getChildren().add(pf.vBox);
    }


        //NOTE start()-method
    @Override
    public void start(Stage stage) throws Exception {


        try{
                        // image-stuff happens here for now
            ImageFactory ib = new ImageFactory();
            ib.setImgPath("file:./images/start_scene.jpg");
            ImageView iv = ib.imageViewBuilder("imageView");


                        // create PaneFactory instance and the panes
            PaneFactory pf = new PaneFactory();
            pf.newPane("btnBox");
            pf.newPane("mainContainer");
            pf.newPane("root");

                        // create buttons, local-btnList and assign them to the btnBox


            List<Button> mainbuttons = ButtonFactory.createNewButtons(MainController.mainSceneButtons);

            List<Button> currentButtons;
            currentButtons = mainbuttons;

            updatePaneContent(pf,iv,mainbuttons);

                        // inventory-buttons. might move that elsewhere later, just to see if it works with my action handler in the lower section
            List<Button> inventoryButtons = ButtonFactory.createNewButtons(MainController.inventoryButtons);


                    //CHECK will need to move the scene related code in a later update to a separate class

            Scene currentScene = new Scene(pf.root,PaneFactory.colorCode.get(3));

                    //NOTE trying out a new approach on all the stage-stuff here

            SceneFactory sf = new SceneFactory();
            sf.setStageStuff(stage);

            stage.setTitle("Dungeon_Adventure_V0.1.4");
            stage.setScene(currentScene);
            stage.show();


                    //CHECK ButtonList too short.... check what's up with that later

            for (Button btn : currentButtons) {
                switch (btn.getId()){
                    case "inventoryBtn": {
                        btn.setOnAction(a->{
                            System.out.println("\t - inventory-button works!");

                            handleInventoryButton(ib,pf,iv);
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

                            handleSearchButton(pf);
                        });
                    }break;
                    case "backBtn": {
                        btn.setOnAction(a->{
                            System.out.println("\t - back-button works!");

                            handleBackButton(ib,pf,iv,mainbuttons);
                        });
                    }break;
                    default:
                        throw new IllegalStateException("Unexpected value exception maybe? " + btn.getId()
                    );


                }
            }


        } catch(Exception e){
                    // Exception not thrown for now
            System.out.println(String.valueOf(e));
        }


    }


    public static void main(String[] args) {
        launch();
    }

}

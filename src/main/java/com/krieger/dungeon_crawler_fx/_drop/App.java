package com.krieger.dungeon_crawler_fx._drop;

import com.krieger.dungeon_crawler_fx.controllers.MainController;
import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import com.krieger.dungeon_crawler_fx.factories.SceneFactory;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

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
                // handler methods are created here for now, will move them elsewhere too later in the process
        private void handleInventoryButton(ImageFactory ib, PaneFactory pf, ImageView iv, List<Button> mainButtons, List<Button> inventoryButtons) {
            ib.updateImage("file:./images/inventory_bg.jpg");

            updatePaneContent(pf, iv, inventoryButtons);
            setButtonEventHandlers(inventoryButtons, ib, pf, iv, mainButtons, inventoryButtons);
        }

    private void handleBackButton(ImageFactory ib, PaneFactory pf, ImageView iv, List<Button> mainButtons, List<Button> inventoryButtons) {
        ib.updateImage("file:./images/start_scene.jpg");
        updatePaneContent(pf, iv, mainButtons);
        setButtonEventHandlers(mainButtons, ib, pf, iv, mainButtons, inventoryButtons);
    }

    public void clearOutput(PaneFactory pf){
            for (Node l:pf.root.getChildren()){
                if (l.getClass().equals(Label.class)){

                    pf.root.getChildren().remove(l);
                } else{continue;}
            }
    }
    private void handleSearchButton(PaneFactory pf, String btnId) {
        clearOutput(pf);
        Label messageOutput = new Label(" ");
        messageOutput.setFont(new Font(28));
        messageOutput.setTextFill(PaneFactory.colorCode.get(4));
        messageOutput.setLayoutY(-200);
        messageOutput.setLayoutX(0);
        messageOutput.setTranslateX(0);
        messageOutput.setTranslateY(920);
        messageOutput.setText(String.valueOf(btnId+" " +messageOutput.getAlignment() + " " + " " + messageOutput.getLayoutX() + " " + messageOutput.getLayoutY()));
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

            // new button-handler test, previous version was not successful
    private void setButtonEventHandlers(List<Button> buttons, ImageFactory ib, PaneFactory pf, ImageView iv, List<Button> mainButtons, List<Button> inventoryButtons) {
        for (Button btn : buttons) {
            switch (btn.getId()){
                case "inventoryBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - inventory-button works!");

                        handleInventoryButton(ib,pf,iv,mainButtons,inventoryButtons);
                    });
                }break;
                case "actionBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - action-button works!");

                        handleSearchButton(pf,btn.getId());
                    });
                }break;
                case "searchBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - search-button works!");

                            // just for testing, will get an own method soon :
                        handleSearchButton(pf,btn.getId());

                    });
                }break;
                case "backBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - back-button works!");

                        handleBackButton(ib, pf, iv, mainButtons, inventoryButtons);
                    });
                }break;
                case "useBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - use-button works!");

                        handleSearchButton(pf,btn.getId());
                    });
                }break;
                case "equipBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - equip-button works!");

                    });
                }break;
                case "combineBtn": {
                    btn.setOnAction(a->{
                        System.out.println("\t - combine-button works!");

                    });
                }break;
                default:
                    try {
                        throw new IllegalStateException("Unexpected value exception at:  " + btn.getId());
                    } catch (IllegalStateException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
    }


        //NOTE start()-method
    @Override
    public void start(Stage stage) throws Exception {

        try{
                        // image-stuff happens here for now
            ImageFactory iF = new ImageFactory();
            iF.setImgPath("file:./images/start_scene.jpg");
            ImageView iV = iF.imageViewBuilder("imageView");

                        // create PaneFactory instance and the panes
            PaneFactory pF = new PaneFactory();
            pF.newPane("btnBox");
            pF.newPane("mainContainer");
            pF.newPane("root");

                        // create buttons, local-btnList and assign them to the btnBox
            List<Button> mainButtons = ButtonFactory.createNewButtons(MainController.mainSceneButtons);

                    // inventory-buttons. might move that elsewhere later, just to see if it works with my action handler in the lower section
            List<Button> inventoryButtons = ButtonFactory.createNewButtons(MainController.inventoryButtons);

            updatePaneContent(pF,iV,mainButtons);




                    //CHECK will need to move the scene related code in a later update to a separate class

            Scene currentScene = new Scene(pF.root,PaneFactory.colorCode.get(3));

                    //NOTE trying out a new approach on all the stage-stuff here

            SceneFactory sf = new SceneFactory();
            sf.setStageStuff(stage);

            stage.setTitle("Dungeon_Adventure_V0.1.5");
            stage.setScene(currentScene);
            stage.show();


                    //CHECK ButtonList too short.... check what's up with that later

           setButtonEventHandlers(mainButtons,iF,pF, iV,mainButtons, inventoryButtons);

        } catch(Exception e){
                    // Exception not thrown for now
            System.out.println(String.valueOf(e));
        }


    }


    public static void main(String[] args) {
        launch();
    }

}

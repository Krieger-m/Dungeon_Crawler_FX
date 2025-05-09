package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import com.krieger.dungeon_crawler_fx.factories.SceneFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

        //NOTE Elements
    public String[] mainSceneButtons = {"Search","Action","Inventory"};


        //NOTE start()-method

    @Override
    public void start(Stage stage) throws Exception {

        try{
                //NOTE new ButtonFactory
            for (String s:mainSceneButtons) {
                ButtonFactory newBtn = new ButtonFactory(s);
                newBtn.setHoverAction();
                ButtonFactory.btnList.add(newBtn.getBtn());
            }

                        // image-stuff happens here for now
            ImageFactory iF = new ImageFactory();
            iF.setImgPath("file:./images/start_scene.jpg");
            ImageView iV = iF.imageViewBuilder("imageView");


                //NOTE new PaneFactory-process implemented
                        // create PaneFactory instance and the panes
            HBox btnBox =  new PaneFactory().createHBox("btnBox");
                System.out.println(">>>>>>>>>>> "+btnBox.getId());

            VBox mainContainer = new PaneFactory().createVBox("mainContainer");
                System.out.println(">>>>>>>>>>> "+btnBox.getId());

            StackPane root = new PaneFactory().createStackPane("root");
                System.out.println(">>>>>>>>>>> "+btnBox.getId());


            btnBox.getChildren().addAll(ButtonFactory.btnList);
            mainContainer.getChildren().addAll(iV, btnBox);
            root.getChildren().add(mainContainer);

            Scene currentScene = new Scene(root,PaneFactory.colorCode.get(3));


                //NOTE trying out a new approach on all the stage-stuff here

            SceneFactory sf = new SceneFactory();
            sf.setStageStuff(stage);

            stage.setScene(currentScene);
            stage.show();

        } catch(Exception e){
                    // Exception not thrown for now
            System.out.println(String.valueOf(e));
        }


    }
    public static void main(String[] args) {
        launch();
    }


}


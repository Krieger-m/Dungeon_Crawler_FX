package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;

import javafx.application.Application;
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
        SceneManager sceneManager = new SceneManager(primaryStage);

        StackPane root = new RootAssembler(
            ButtonFactory.startScreenButtons,
            ImageFactory.startScreenPath
        ).getRoot();

        Scene startScene = new Scene(root);
        sceneManager.switchScene(startScene);

        setupButtonActions(sceneManager);
    }

    private void setupButtonActions(SceneManager sceneManager) {
        for (Button b : ButtonFactory.btnList) {
            switch (b.getId().toLowerCase()) {
                case "newadventurebtn":
                    b.setOnAction(e -> {
                        StackPane newRoot = new RootAssembler(
                            ButtonFactory.mainSceneButtons,
                            ImageFactory.mainImgPath
                        ).getRoot();
                        Scene newScene = new Scene(newRoot);
                        sceneManager.switchScene(newScene);
                    });
                    break;

                case "inventorybtn":
                    b.setOnAction(e -> {
                        StackPane inventoryRoot = new RootAssembler(
                            ButtonFactory.inventoryButtons,
                            ImageFactory.inventoryImgPath
                        ).getRoot();
                        Scene inventoryScene = new Scene(inventoryRoot);
                        sceneManager.switchScene(inventoryScene);
                    });
                    break;

                case "exitbtn":
                    b.setOnAction(e -> {
                        sceneManager.switchScene(null); // Close the stage
                    });
                    break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}


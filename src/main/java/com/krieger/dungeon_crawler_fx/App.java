package com.krieger.dungeon_crawler_fx;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static StackPane root;
    public static Scene currentScene;

    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        SceneManager sceneManager = new SceneManager(primaryStage);

        this.root = new RootAssembler(
            Paths.getStartButtons(),
            Paths.getStartBg()
        ).getRoot();

        Scene startScene = new Scene(root);
        sceneManager.switchScene(startScene);

        setupButtonActions(sceneManager);
    }

    private void setupButtonActions(SceneManager sceneManager) {
        List<Button> buttons = getBtnList();
        for (Button b : buttons) {
            assignButtonAction(b, sceneManager);
        }
    }

    private void assignButtonAction(Button button, SceneManager sceneManager) {
        switch (button.getId().toLowerCase()) {
            case "newadventurebtn":
                button.setOnAction(e -> {
                    StackPane newRoot = new RootAssembler(
                        Paths.getMainButtons(),
                        Paths.getMainBg()
                    ).getRoot();
                    root = newRoot;
                    Scene newScene = new Scene(root);
                    sceneManager.switchScene(newScene);
                    setupButtonActions(sceneManager);
                });
                break;

            case "inventorybtn":
                button.setOnAction(e -> {
                    StackPane inventoryRoot = new RootAssembler(
                        Paths.getInventoryButtons(),
                        Paths.getInventoryBg()
                    ).getRoot();
                    root = inventoryRoot;
                    Scene inventoryScene = new Scene(root);
                    sceneManager.switchScene(inventoryScene);
                    setupButtonActions(sceneManager);
                });
                break;

            case "exitbtn":
                button.setOnAction(e -> {
                    System.exit(0);
                });
                break;

            default:
                System.out.println("No action assigned for button ID: " + button.getId());
        }
    }

    private List<Button> getBtnList() {
        List<Button> btnList = new ArrayList<>();
        findButtonsRecursively(root, btnList);
        return btnList;
    }

    private void findButtonsRecursively(Parent parent, List<Button> btnList) {
        for (Node node : parent.getChildrenUnmodifiable()) {
            if (node instanceof Button) {
                btnList.add((Button) node);
            } else if (node instanceof Parent) {
                findButtonsRecursively((Parent) node, btnList);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}


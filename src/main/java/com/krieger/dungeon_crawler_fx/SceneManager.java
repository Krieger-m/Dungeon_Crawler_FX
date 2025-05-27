package com.krieger.dungeon_crawler_fx;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    private final Stage stage;

    public SceneManager(Stage stage) {
        this.stage = stage;
    }

    public void switchScene(Scene newScene) {
        stage.setScene(newScene);
        stage.show();
    }
}
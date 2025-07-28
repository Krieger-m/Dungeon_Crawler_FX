package com.krieger.dungeon_adventure;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
    // This class is responsible for managing the user interface and switching scenes.
    // It will contain methods to load FXML files, set up the stage, and handle scene transitions.

    private FXMLLoader loader;
    private Stage stage;
    private Scene scene;
    private String fxmlPath;

    public View(String fxmlPath) {
        this.fxmlPath = fxmlPath;
        this.loader = new FXMLLoader(getClass().getResource(this.fxmlPath));
    }

    public void switchScene() throws IOException {
        FXMLLoader newLoader = new FXMLLoader(getClass().getResource(this.fxmlPath));
        Scene newScene = new Scene(newLoader.load());
        this.stage.setScene(newScene);
        this.stage.show();
    }

    public void show(Stage stage) throws IOException {
        this.stage = stage;
        this.stage.setTitle("Dungeon Adventure");
        this.scene = new Scene(this.loader.load());
        this.stage.setScene(this.scene);
        this.stage.show();
    }
}


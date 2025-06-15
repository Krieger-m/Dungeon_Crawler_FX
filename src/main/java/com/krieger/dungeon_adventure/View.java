package com.krieger.dungeon_adventure;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class View {
    // This class is responsible for managing the user interface and switching scenes.
    // It will contain methods to load FXML files, set up the stage, and handle scene transitions.

    public void loadInitialScene(Stage primaryStage) {
        // Load the initial scene (e.g., start-view.fxml)
        // This method will be implemented to set up the initial user interface.
        FXMLLoader loader = new FXMLLoader("src/main/resources/com/krieger/dungeon_crawler_fx/start-view.fxml");
    }

    public void switchScene(String fxmlFile) {
        // This method will handle switching to a different scene based on the provided FXML file.
    }
}

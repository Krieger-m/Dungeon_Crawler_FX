package com.krieger.dungeon_adventure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
    // This class is responsible for managing the user interface and switching scenes.
    // It will contain methods to load FXML files, set up the stage, and handle scene transitions.

    public FXMLLoader loadInitialScene() {
        // Load the initial scene (e.g., start-view.fxml)
        // This method will be implemented to set up the initial user interface.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("com/krieger/dungeon_adventure/images/start_screen_bg_neu" +
                ".jpg"));
        return loader;
    }
    public void show(){

        Stage newStage = new Stage();
        newStage.setTitle("Dungeon Adventure");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/krieger/dungeon_adventure/start-view.fxml"));
            Scene scene = new Scene(loader.load());
            newStage.setScene(scene);
            newStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchScene(String fxmlFile) {
        // This method will handle switching to a different scene based on the provided FXML file.
    }
}

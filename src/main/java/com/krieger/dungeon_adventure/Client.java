package com.krieger.dungeon_adventure;

import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize the main application window
        primaryStage.setTitle("Dungeon Adventure");

        // Load the initial scene (e.g., start-view.fxml)
        View view = new View();
        view.loadInitialScene(primaryStage);

        // Show the primary stage
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}

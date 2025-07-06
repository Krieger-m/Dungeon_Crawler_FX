package com.krieger.dungeon_adventure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartScreenController {

        // start-view.fxml
    @FXML
    private HBox button_container;

    @FXML
    private Button exitButton;

    @FXML
    private ImageView image_container;

    @FXML
    private Button loadGameButton;

    @FXML
    private VBox main_container;

    @FXML
    private Button newGameButton;

    @FXML
    private Button optionsButton;

    public static List<Button> buttonList = new ArrayList<>();

    public static Stage currentStage;


    @FXML
    private void initialize() {
        // This will be called after FXML loading
        newGameAction(newGameButton);
        placeholderAction(optionsButton);
        placeholderAction(loadGameButton);
        exitAction(exitButton);

    }


    @FXML
    public void placeholderAction(Button b) {
        b.setOnMouseClicked(e -> {
            System.out.println("\t- Button clicked: " + b.getText());
            try {
                // Get the current stage
                currentStage = (Stage) b.getScene().getWindow();

                // Create a new View instance and set the stage
                View view = new View();
                view.show(currentStage); // This initializes newStage in the View class

                // Switch the scene
                view.switchScene("/views/not-yet-implemented.fxml");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void newGameAction(Button b){
        b.setOnMouseClicked(e -> {
            System.out.println("\t- Button clicked: " + b.getText());
            try {
                // Get the current stage
                currentStage = (Stage) b.getScene().getWindow();

                // Create a new View instance and set the stage
                View view = new View();
                view.show(currentStage); // This initializes newStage in the View class
                NotImplementedController.previous = "/views/start-view.fxml"; // Set the previous view path

                // Switch the scene to the new game screen
                view.switchScene("/views/new-game-view.fxml");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void exitAction(Button b){
        b.setOnMouseClicked(e ->{
            System.out.println("\t- Button clicked: " + b.getText());
            // Close the application
            Stage stage = (Stage) b.getScene().getWindow();
            stage.close();
        });
    }


}

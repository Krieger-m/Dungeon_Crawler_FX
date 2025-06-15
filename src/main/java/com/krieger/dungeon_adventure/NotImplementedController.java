package com.krieger.dungeon_adventure;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotImplementedController {

    public static String previous;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox main_container;

    @FXML
    private Button backButton;

    @FXML
    void initialize() {
        assert main_container != null : "fx:id=\"main_container\" was not injected: check your FXML file 'not-yet-implemented.fxml'.";

    }


     @FXML
    public void placeholderActionBack() {
        backButton.setOnMouseClicked(e -> {
            System.out.println("\t- Button clicked: " + backButton.getText());
            try {
                // Get the current stage
                Stage currentStage = (Stage) backButton.getScene().getWindow();

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

}

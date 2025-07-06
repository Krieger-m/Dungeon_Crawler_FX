package com.krieger.dungeon_adventure;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NewGameController {

    // start-view.fxml

    @FXML
    private ImageView image_container;
    @FXML
    private VBox main_container;


    @FXML
    private Button action_btn;

    @FXML
    private Button search_btn;

    @FXML
    private Button inventory_btn;

    @FXML
    private Button menu_btn;



    public static Stage currentStage;


    @FXML
    private void initialize() {
        // This will be called after FXML loading
        placeholderAction(action_btn);
        placeholderAction(search_btn);
        placeholderAction(inventory_btn);
        menuAction(menu_btn);

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
                NotImplementedController.previous = "/views/new-game.fxml"; // Set the previous view path


                // Switch the scene
                view.switchScene("/views/not-yet-implemented.fxml");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void menuAction(Button b){
        b.setOnMouseClicked(e ->{
            System.out.println("\t- Button clicked: " + b.getText());
            // Close the application
            Stage stage = (Stage) b.getScene().getWindow();
            stage.close();
        });
    }


}

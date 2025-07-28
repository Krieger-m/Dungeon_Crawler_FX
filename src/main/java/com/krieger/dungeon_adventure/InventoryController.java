package com.krieger.dungeon_adventure;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InventoryController {

    @FXML private Button useButton;
    @FXML private Button equipButton;
    @FXML private Button combineButton;
    @FXML private Button inspectButton;
    @FXML private Button backButton;

    @FXML
    private void initialize() {
        placeholderAction(useButton);
        placeholderAction(equipButton);
        placeholderAction(combineButton);
        placeholderAction(inspectButton);
        backAction(backButton);
    }

    @FXML
    public void placeholderAction(Button b) {
        b.setOnMouseClicked(e -> {
            try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/not-yet-implemented.fxml");
                view.show(stage);
                NotImplementedController.previous = "/views/inventory-view.fxml";
                // view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void backAction(Button b) {
        b.setOnMouseClicked(e -> {
              try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/new-game-view.fxml");
                view.show(stage);
                
                // view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void inventoryAction(Button b) {
        b.setOnMouseClicked(e -> {
            try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/inventory-view.fxml");
                view.show(stage);
                NotImplementedController.previous = "/views/new-game-view.fxml";
                // view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

}

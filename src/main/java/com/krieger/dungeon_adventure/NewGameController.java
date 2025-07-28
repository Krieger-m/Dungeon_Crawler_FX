package com.krieger.dungeon_adventure;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NewGameController {

    @FXML private Button action_btn;
    @FXML private Button search_btn;
    @FXML private Button inventory_btn;
    @FXML private Button menu_btn;

    @FXML
    private void initialize() {
        placeholderAction(action_btn);
        placeholderAction(search_btn);
        placeholderAction(inventory_btn);
        menuAction(menu_btn);
    }

    @FXML
    public void placeholderAction(Button b) {
        b.setOnMouseClicked(e -> {
            try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/not-yet-implemented.fxml");
                view.show(stage);
                NotImplementedController.previous = "/views/new-game-view.fxml";
                // view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void menuAction(Button b) {
        b.setOnMouseClicked(e -> {
              try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/start-view.fxml");
                view.show(stage);
                NotImplementedController.previous = "/views/new-game-view.fxml";
                // view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}

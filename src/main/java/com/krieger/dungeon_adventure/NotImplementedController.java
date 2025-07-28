package com.krieger.dungeon_adventure;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NotImplementedController {

    public static String previous;

    @FXML private Button backButton;

    @FXML
    void initialize() {
    }

    @FXML
    public void placeholderActionBack() {
        backButton.setOnMouseClicked(e -> {
            try {
                View view = new View(previous);
                view.show((Stage) backButton.getScene().getWindow());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}

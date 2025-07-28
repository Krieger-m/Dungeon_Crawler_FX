package com.krieger.dungeon_adventure;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartScreenController {

    @FXML private Button newGameButton;
    @FXML private Button loadGameButton;
    @FXML private Button optionsButton;
    @FXML private Button exitButton;

    @FXML
    private void initialize() {
        newGameAction(newGameButton);
        placeholderAction(optionsButton);
        placeholderAction(loadGameButton);
        exitAction(exitButton);
    }

    @FXML
    public void placeholderAction(Button b) {
        b.setOnMouseClicked(e -> {
            try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/not-yet-implemented.fxml");
                view.show(stage);
                view.switchScene();
                NotImplementedController.previous = "/views/start-view.fxml";
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void newGameAction(Button b) {
        b.setOnMouseClicked(e -> {
            try {
                Stage stage = (Stage) b.getScene().getWindow();
                View view = new View("/views/new-game-view.fxml");
                view.show(stage);
                NotImplementedController.previous = "/views/start-view.fxml";
                view.switchScene();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void exitAction(Button b) {
        b.setOnMouseClicked(e -> {
            Stage stage = (Stage) b.getScene().getWindow();
            stage.close();
        });
    }
}

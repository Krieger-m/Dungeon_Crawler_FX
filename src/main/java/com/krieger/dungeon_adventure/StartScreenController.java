package com.krieger.dungeon_adventure;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

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



    @FXML
    private void initialize() {
        // This will be called after FXML loading
        buttonList.clear();
        for (Node b : button_container.getChildren()) {
            if (b instanceof Button) {
                buttonList.add((Button) b);
                System.out.println("\t-> Button added: " + ((Button) b).getText());
                placeholderAction((Button)b);
            }
        }
    }

    @FXML
    public void placeholderAction(Button b){

        b.setOnMouseClicked(e->{
            System.out.println("\t- Button clicked: " + b.getText());
            try {
                new View().switchScene("/views/not-yet-implemented.fxml");
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

    }

}

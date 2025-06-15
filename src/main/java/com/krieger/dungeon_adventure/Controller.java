package com.krieger.dungeon_adventure;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class Controller {

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

    List<Button> buttonList = new ArrayList<>();

        //CHECK - continue here
        // hier weiter machen
        // ---------------------------vv
    public void addButtonsToList() {
        for(Node n : button_container.getChildren()){
            Button b = (Button) n;
            System.out.println(b.getText());
            buttonList.add(b);
        }
    }

}

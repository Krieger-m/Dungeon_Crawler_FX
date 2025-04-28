package com.krieger.dungeon_crawler_fx;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainScene {

    public static Scene getMainScene(Stage stage) {
        // Image setup
        String imgPath = "file:./images/start_scene.jpg";
        Image img = new Image(imgPath);
        ImageView imageView = new ImageView(img);
        imageView.setFitHeight(800);
        imageView.setPreserveRatio(true);

        // Layout setup
        StackPane root = new StackPane();
        VBox vBox = new VBox();
        HBox btnBox = new HBox();

        // Buttons
        Button actionBtn = new Button("Action!");
        Button inventoryBtn = new Button("Inventory!");

        btnBox.getChildren().addAll(actionBtn, inventoryBtn);
        btnBox.setSpacing(20);

        // Add elements to layout
        vBox.getChildren().addAll(imageView, btnBox);
        root.getChildren().add(vBox);

        return new Scene(root, 1024, 1000);
    }
}

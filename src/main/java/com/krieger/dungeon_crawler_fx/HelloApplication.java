package com.krieger.dungeon_crawler_fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public String imgPath = "file:X:/JFX/Dungeon_Crawler_FX/images/start_scene.jpg";

    public Image img = new Image(imgPath);


    public StackPane root = new StackPane();
    public VBox vBox = new VBox();
    public Button actionBtn = new Button("Action!");
    public Button inventoryBtn = new Button("Inventory!");

    public ImageView imageView = new ImageView(img);

    public HBox btnBox = new HBox();

    Insets inset = new Insets(20);




    @Override
    public void start(Stage stage) throws IOException {

                // Root-background setting
        root.setBackground(new Background(new BackgroundFill(Color.web("#4d4d4d"),null,null)));

                // Button-Box settings
        btnBox.setPadding(inset);
        btnBox.setSpacing(20);


                // Assembly
        btnBox.getChildren().addAll(actionBtn,inventoryBtn);

        vBox.getChildren().addAll(imageView,btnBox);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(vBox);

                // TODO Inventory stuff here...






                // Scene-assembly
        Scene scene = new Scene(root, 1024, 1174);

        String size = String.valueOf(scene.getWidth()+" "+scene.getHeight());

        stage.setTitle(size);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

import static com.krieger.dungeon_crawler_fx.HelloController.*;


public class App extends Application {

    Insets inset = new Insets(20);
    public String imgPath = "file:./images/start_scene.jpg";
    public Image img = new Image(imgPath);
    public ImageView imageView = new ImageView(img);


    public StackPane root = new StackPane();
    public VBox vBox = new VBox();
    public HBox btnBox = new HBox();

    public StackPane stack = new StackPane();

    public static Button actionBtn = new Button("Action!");
    public Button inventoryBtn = new Button("Inventory!");


    @Override
    public void start(Stage stage) throws IOException {

                // Root-background setting
        root.setBackground(new Background(new BackgroundFill(Color.web("#4d4d4d"),null,null)));

                // Button-Box settings
        btnBox.setPadding(inset);
        btnBox.setSpacing(20);

                // image-settings
        imageView.setFitHeight(800);

        Text beginning = textAnimation();



                // Assembly
        btnBox.getChildren().addAll(actionBtn,inventoryBtn);

        stack.getChildren().addAll(imageView,beginning);

        vBox.getChildren().addAll(stack,btnBox);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(vBox);

                // TODO Inventory stuff here...



        actionBtn.setOnAction(actionEvent  -> {

        });


                // Scene-assembly
        Scene scene = new Scene(root, 1024, 1000);


                // Stage-assembly
        stage.setTitle("Dungeon_Adventure+");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
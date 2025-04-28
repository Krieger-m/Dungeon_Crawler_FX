package com.krieger.dungeon_crawler_fx;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.List;

public class IntroController {

    // Prepare text segments
    private static final List<String> textSegments = List.of(
            "You wake up inside a cave...",
            "Neither can you recall how and why you ended up down here...",
            "Nor can you remember your own name..."
    );

    public static Text createText(String content) {
        Text storyText = new Text(content);
        storyText.setFont(Font.font("Yu Mincho", 36));
        storyText.setFill(Color.web("#BFC7D0"));
        storyText.setOpacity(0); // Start invisible
        return storyText;
    }


    public static Scene getIntroScene(Stage stage) {
        // Image setup
        String imgPath = "file:./images/start_scene.jpg";
        Image img = new Image(imgPath);
        ImageView imageView = new ImageView(img);
        imageView.setFitHeight(800);
        imageView.setPreserveRatio(true);

        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Create the initial text node
        Text storyText = createText("");
        root.getChildren().add(storyText);

        // Sequential animation for the text segments
        SequentialTransition sequentialTransition = new SequentialTransition();
        for (String segment : textSegments) {
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), storyText);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);

            PauseTransition pause = new PauseTransition(Duration.seconds(3));

            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), storyText);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);

            fadeIn.setOnFinished(event -> storyText.setText(segment)); // Update text content
            sequentialTransition.getChildren().addAll(fadeIn, pause, fadeOut);
        }

        sequentialTransition.setOnFinished(event -> stage.setScene(MainScene.getMainScene(stage)));        sequentialTransition.play();

        return new Scene(root, 1024, 1000);
    }
}
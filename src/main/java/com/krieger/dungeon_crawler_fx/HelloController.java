package com.krieger.dungeon_crawler_fx;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class HelloController {

    public Scene textAnimation(){
                // Create the text node
        Text storyText = new Text("Once upon a time...");
        storyText.setFont(Font.font("Verdana", 24));
        storyText.setFill(Color.WHITE);
        storyText.setOpacity(0); // Start invisible

                // Fade in transition
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), storyText);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

                // Pause transition (keep text visible)
        PauseTransition pause = new PauseTransition(Duration.seconds(3));

                // Fade out transition
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), storyText);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);

                // Add and combine transitions - but i don't know yet if i will do it this way... we'll see
        SequentialTransition sequentialTransition = new SequentialTransition(fadeIn, pause, fadeOut);
        sequentialTransition.setCycleCount(SequentialTransition.INDEFINITE);            // Repeat indefinitely
        sequentialTransition.play();

                // Add text to the scene
        StackPane root = new StackPane(storyText);
        root.setStyle("-fx-background-color: #4d4d4d;"); // Background color

        Scene scene = new Scene(root, 800, 600);
        return scene;
    }
    }


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

import java.util.ArrayList;

public class HelloController extends App {
    public static ArrayList<String> textSegments = new ArrayList<>();

    public static void addTexts(){
        textSegments.add( "You wake up inside a cave ...");
        textSegments.add("neither can you recall how and why you ended up down here ... or the way out of this " +
                "godforsaken place ...");
        textSegments.add("Nor can you remember your own name ...");
    }

    public static Text textAnimation(){


        // Create the text node
        Text storyText = new Text();
        storyText.setFont(Font.font("Yu Mincho", 36));
        storyText.setFill(Color.web("#BFC7D0"));
        storyText.setOpacity(0); // Start invisible

        addTexts();




        for (String segment : textSegments) {


            storyText.setText(segment);


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
            sequentialTransition.setCycleCount(1); //SequentialTransition.INDEFINITE);            // Repeat indefinitely
            sequentialTransition.play();


            // Add text to the scene
            // StackPane root = new StackPane(storyText);
            // root.setStyle("-fx-background-color: #4d4d4d;"); // Background color


        return storyText;

        }

        return storyText;
    }
}


package com.krieger.dungeon_crawler_fx.drop;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {


                    // Set the intro scene
        stage.setScene(IntroController.getIntroScene(stage));
        stage.setTitle("Dungeon Adventure");
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
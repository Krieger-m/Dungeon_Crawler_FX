package com.krieger.dungeon_adventure;

import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        new View().show(primaryStage);


    }


    public static void main(String[] args) {
        launch(args);
    }


}

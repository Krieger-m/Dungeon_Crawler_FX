package com.krieger.dungeon_adventure;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Client extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {



        new View().show();






    }


    public static void main(String[] args) {
        launch(args);
    }


}

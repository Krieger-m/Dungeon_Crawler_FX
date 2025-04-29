package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonBuilder;
import com.krieger.dungeon_crawler_fx.factories.ImageBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Map;

public class App extends Application {

                // Color Codes
    public final Map<Integer,String> colorCode= Map.of(
            1,"#121217",
            2,"#2E3339",
            3,"#112130",
            4,"#B6D0D1",
            5,"#DFF2EF"
    );

    @Override
    public void start(Stage stage) throws Exception {


                // Elements
        StackPane root = new StackPane();
        VBox mainContainer = new VBox();
        HBox btnBox = new HBox();

                // Background Color
        root.setBackground(new Background(new BackgroundFill(Color.web(colorCode.get(3)),null,null)));

                // ImageBuilder-test
                    // will move it to the SceneFactory or SceneHandler or
                    // whatever I will call it later
        ImageBuilder ib = new ImageBuilder("file:./images/start_scene.jpg");

        ImageView imageView = ib.ImageViewBuilder();



                // ButtonBuilder-test
                    // same as the other 2 tests
        ButtonBuilder bb = new ButtonBuilder();

                // Button-names stored in a String array
        String[] btnNameArr= {"Search", "Action", "Inventory"};


        bb.addBtnsToList(btnNameArr);

                // Scene-assembly or SceneAssembly-test

                    // will move this one too later in the process.
                    // structure is still developing on the go and
                    // as far as I explore designPatterns :)

        bb.btnList.forEach(Button -> {
            btnBox.getChildren().add(Button);
        });

        btnBox.setSpacing(20);btnBox.setPadding(new Insets(20));
        mainContainer.getChildren().addAll(imageView,btnBox);

        root.getChildren().add(mainContainer);

        root.setAlignment(Pos.TOP_CENTER);
        Scene currentScene = new Scene(root,1024,1024);

                // Stage-stuff
        stage.setTitle("Dungeon_Adventure_V0.1.1");
        stage.setScene(currentScene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}

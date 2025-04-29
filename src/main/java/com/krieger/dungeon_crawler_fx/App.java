package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ImageBuilder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

                // Elements
        StackPane root = new StackPane();
        VBox mainContainer = new VBox();

                // ImageBuilder-test
                    // will move it to the SceneFactory or SceneHandler or
                    // whatever I will call it later
        ImageBuilder ib = new ImageBuilder("file:./images/start_scene.jpg");

        ImageView img1 = ib.ImageViewBuilder();

        root.getChildren().add(img1);

                // Scene-assembly or SceneAssembly-test
                    // will move this one too later in the process.
                    // structure is still developing on the go and
                    // as far as I explore designPatterns :)
        Scene currentScene = new Scene(root,1000,1000);

                // Stage-stuff
        stage.setTitle("Dungeon_Adventure_V0.1.1");
        stage.setScene(currentScene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}

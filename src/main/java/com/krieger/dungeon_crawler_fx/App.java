package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonBuilder;
import com.krieger.dungeon_crawler_fx.factories.ImageBuilder;
import com.krieger.dungeon_crawler_fx.factories.PaneBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import java.util.Map;

public class App extends Application {

                //NOTE Color Codes
    public final Map<Integer, Paint> colorCode= Map.of(
            1,Color.web("#121217"),
            2,Color.web("#2E3339"),
            3,Color.web("#112130"),
            4,Color.web("#B6D0D1"),
            5,Color.web("#DFF2EF")
    );

    @Override
    public void start(Stage stage) throws Exception {


        try{



                //NOTE Elements
            StackPane root = new StackPane();
            VBox mainContainer = new VBox();

                //NOTE Background Color
            root.setBackground(new Background(new BackgroundFill(colorCode.get(3),null,null)));

                //NOTE ImageBuilder-test
                    // will move it to the SceneFactory or SceneHandler or
                    // whatever I will call it later
            ImageBuilder ib = new ImageBuilder("file:./images/start_scene.jpg");

            ImageView imageView = ib.imageViewBuilder();



                //NOTE ButtonBuilder-test
                    // same as the other 2 tests
            ButtonBuilder bb = new ButtonBuilder();

                //NOTE Button-names stored in a String array for better access at the moment
            String[] btnNameArr= {"Search", "Action", "Inventory"};


            bb.addBtnsToList(btnNameArr);

                //CHECK PaneBuilder-TestArea
                //NOTE for testing purposes,
                //TODO will restructure that later!

            PaneBuilder pb = new PaneBuilder();
            pb.addToList(pb.btnBoxBuilder());
            pb.addToList(mainContainer);

            pb.btnBoxAssembler(bb.btnList);

                //NOTE Scene-assembly or SceneAssembly-test

                    // will move this one too later in the process.
                    // structure is still developing on the go and
                    // as far as I explore designPatterns :)

            /*      //CHECK currently out of service :)
            bb.btnList.forEach(Button -> {
                btnBox.getChildren().add(Button);
            });
            */


                                //TODO under construction, replace with other
                                // builder or assembler method later
                                // in the process
            mainContainer.getChildren().addAll(imageView,pb.getButtonBox());

            root.getChildren().add(mainContainer);

            root.setAlignment(Pos.TOP_CENTER);
            Scene currentScene = new Scene(root,imageView.getFitWidth(),954);

                //NOTE Stage-stuff

            stage.setTitle("Dungeon_Adventure_V0.1.1");
            stage.setScene(currentScene);
            stage.show();


        } catch(Exception e){
                    // Exception not thrown for now
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        launch();
    }

}

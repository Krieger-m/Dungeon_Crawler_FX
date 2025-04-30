package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonBuilder;
import com.krieger.dungeon_crawler_fx.factories.ImageBuilder;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
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
            ImageBuilder imageBuilder = new ImageBuilder("file:./images/start_scene.jpg");
            PaneFactory paneFactory = new PaneFactory();

                    //CHECK Buttons need to be improved later
                        //Fix name storage
            ButtonBuilder buttonBuilder = new ButtonBuilder();
                        // Button-names stored in a String array for better access at the moment
            String[] btnNameArr= {"Search", "Action", "Inventory"};

            StackPane root = new StackPane();

                    //NOTE Background Color
            root.setBackground(new Background(new BackgroundFill(colorCode.get(3),null,null)));

                    //NOTE Assembling-zone here....
                        // Methods from Builders and Factories get called
            ImageView iv = imageBuilder.imageViewBuilder("imageView");
            buttonBuilder.createNewButtons(btnNameArr);
            paneFactory.btnBoxAssembler(buttonBuilder.btnList);

            paneFactory.btnBoxBuilder("btnBox");
            paneFactory.mainContainerBuilder("mainContainer");


            paneFactory.addEvery(iv);
            paneFactory.addEvery(paneFactory.getButtonBox());


            //paneFactory.mainContainerAssembler(iv);
            root.getChildren().add(paneFactory.getMainContainer());
            root.setAlignment(Pos.TOP_CENTER);

                    //CHECK will need to move the root and scene relate code in a later update to separate classes

            Scene currentScene = new Scene(root,imageBuilder.getImageView().getFitWidth(),954);

                //NOTE Stage-stuff
                        //Set-Sizes //NOTE thanks Ulrich ;*
            stage.setMinHeight((imageBuilder.img.getHeight()+paneFactory.getButtonBox().getHeight()));
            stage.setMinWidth(800);//ib.img.getWidth());
            stage.setMaxHeight((imageBuilder.img.getHeight()+paneFactory.getButtonBox().getHeight()));
            stage.setMaxWidth(800);//ib.img.getWidth());

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

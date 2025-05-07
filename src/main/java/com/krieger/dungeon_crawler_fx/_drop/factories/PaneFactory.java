package com.krieger.dungeon_crawler_fx._drop.factories;

import com.krieger.dungeon_crawler_fx.controllers.MainController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Map;

public class PaneFactory {

            //NOTE Color Codes
    public static final Map<Integer, Paint> colorCode= Map.of(
            1, Color.web("#121217"),
            2,Color.web("#2E3339"),
            3,Color.web("#112130"),
            4,Color.web("#B6D0D1"),
            5,Color.web("#DFF2EF")
    );


            //NOTE Variables
    //
    // MainController mc = new MainController();




    String[] paneNames = {"root","btnBox","mainContainer"};

    public  HBox hBox;
    public  VBox vBox;
    public  StackPane root;



            //NOTE Constructor
    public PaneFactory(){

    }

    public PaneFactory(HBox hBox, VBox vBox, StackPane root) {
        this.hBox = hBox;
        this.vBox = vBox;
        this.root = root;
    }

    //NOTE Methods

                // creates and returns a new Pane depending on the input parameters

    public HBox createHBox(String id) {
        HBox hBox = new HBox();
        hBox.setId(id);
        hBox.setSpacing(20);
        ButtonFactory.createNewButtons(MainController.mainSceneButtons);
        hBox.setPadding(new Insets(40, 40, 40, 40));
        System.out.println(id+" added");
        return hBox;
    }

    public VBox createVBox(String id) {
        VBox vBox = new VBox();
        vBox.setId(id);
        vBox.setMaxHeight(980);
        vBox.setMinHeight(980);
        System.out.println(id+" added");
        return vBox;
    }

    public StackPane createStackPane(String id) {
        StackPane root = new StackPane();
        root.setAlignment(Pos.TOP_CENTER);
        root.setBackground(new Background(new BackgroundFill(colorCode.get(3), null, null)));
        System.out.println(id+" added");
        return root;
    }
    public Pane newPane(String id){
        switch (id){
            case "HBox","buttonBox","btnBox":{
                this.hBox = createHBox(id);
            }
            case "VBox","mainContainer","mainBox": {
                this.vBox= createVBox(id);
            }
            case "root","StackPane":{
                this.root = createStackPane(id);
            }
            default: {
                System.out.println("ERROR: Compatible types are: \"VBox, btnBox\", \"HBox, mainContainer\", \"root, StackPane\" ");
            }break;
        }
        return null;
    }




}

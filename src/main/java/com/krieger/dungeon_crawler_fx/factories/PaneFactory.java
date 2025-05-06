package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.controllers.MainController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
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
    public Pane newPane(String id){
        switch (id){
            case "HBox","buttonBox","btnBox":{
                this.hBox = new HBox();
                this.hBox.setId(id);
                this.hBox.setSpacing(20);
                ButtonFactory.createNewButtons(MainController.mainSceneButtons);
                this.hBox.setPadding(new Insets(40,40,40,40));
                System.out.println("btnBox added");
                return hBox;
            }
            case "VBox","mainContainer","mainBox": {
                this.vBox= new VBox();
                this.vBox.setId(id);
                this.vBox.setMaxHeight(980);this.vBox.setMinHeight(980);
                System.out.println("mainContainer added");
                return vBox;
            }
            case "root","StackPane":{
                this.root =new StackPane();
                root.setAlignment(Pos.TOP_CENTER);
                root.setBackground(new Background(new BackgroundFill(colorCode.get(3),null,null)));
                System.out.println("StackPane added");
                return root;
            }
            default: {
                System.out.println("ERROR: Compatible types are: \"VBox, btnBox\", \"HBox, mainContainer\", \"root, StackPane\" ");
            }break;
        }
        return null;
    }




}

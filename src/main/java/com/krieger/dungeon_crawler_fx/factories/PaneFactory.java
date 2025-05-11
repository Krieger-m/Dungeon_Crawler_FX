package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.Map;

public class PaneFactory {

        //NOTE Color Codes
            // Map of the colors stored directly
    public static final Map<Integer, Paint> colorCode= Map.of(
            1, Color.web("#121217"),
            2,Color.web("#2E3339"),
            3,Color.web("#112130"),
            4,Color.web("#B6D0D1"),
            5,Color.web("#DFF2EF")
    );


        //NOTE Variables
    String id;



        //NOTE Constructor

    /**
     * No-argument constructor for the PaneFactory
     */
    public PaneFactory(){
    }


        //NOTE Methods

        /**
         * Create and return a new HBox providing its ID
         * @param id HBox(btnBox) ID
         * @return HBox this.hBox
         */
    public HBox createHBox(String id) {
        this.id=id;
        HBox hBox = new HBox();
        hBox.setId(this.id);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(40, 40, 40, 40));
        System.out.println(" -- createHBox: "+this.id+" added");
        System.out.println("this.hBox name?: "+ hBox.getAccessibleRole().name());
        return hBox;
    }

        /**
         * Create and return a new VBox providing its ID
         * @param id VBox(mainContainer) ID
         * @return VBox this.vBox
         */
    public VBox createVBox(String id) {
        this.id=id;
        VBox vBox = new VBox();
        vBox.setId(this.id);
        vBox.setPrefHeight(980);
        vBox.setMinHeight(vBox.getPrefHeight());vBox.setMinHeight(vBox.getPrefHeight());
        System.out.println(" -- createVBox: "+this.id+" added");
        return vBox;
    }

        /**
         * Create and return a new StackPane providing its ID
         * @param id StackPane(root) ID
         * @return StackPane this.root
         */
    public StackPane createStackPane(String id) {
        this.id=id;
        StackPane root = new StackPane();
        root.setId(this.id);
        root.setAlignment(Pos.TOP_CENTER);
        root.setBackground(new Background(new BackgroundFill(colorCode.get(3), null, null)));
        System.out.println(" -- createStackPane: "+this.id+" added");
        return root;
    }





}

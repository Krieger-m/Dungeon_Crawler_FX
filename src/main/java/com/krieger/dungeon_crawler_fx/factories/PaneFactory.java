package com.krieger.dungeon_crawler_fx.factories;


import java.util.Map;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class PaneFactory implements IFactory {

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
    private HBox hBox;
    private VBox vBox;
    private StackPane root;
    private Pane pane;
    String id;
    String type;



        //NOTE Constructor

    /**
     * constructor for the PaneFactory
     */
    public PaneFactory(String type, String id) {
        this.type = type.toLowerCase();
        this.id = id;
        System.out.println(" -- PaneFactory: "+this.type+" created with ID: "+this.id);
         check();
        
      
    }

        //NOTE Methods

        private void check(){
            switch (this.type) {
            case "hbox": 
                this.hBox = createHBox();
                break;
            case "vbox": 
                this.vBox = createVBox();
                break;
            case "root": 
                this.root = createStackPane();
                break;
            default:
                throw new AssertionError( "Unknown type: " + this.type);
        }
        }

        /**
         * Create and return a new HBox
         * @return HBox this.hBox
         */
    private HBox createHBox( ){
        this.hBox = new HBox();
        hBox.setId(this.id);
        this.hBox.setSpacing(20);
        this.hBox.setPadding(new Insets(40, 40, 40, 40));
        System.out.println(" -- createHBox: "+this.id+" added");
        System.out.println("this.hBox name?: "+ hBox.getAccessibleRole().name());
        return this.hBox;
    }

        /**
         * Create and return a new VBox
         * @return VBox this.vBox
         */
    private VBox createVBox() {
        this.vBox = new VBox();
        this.vBox.setId(this.id);
        this.vBox.setPrefHeight(980);
        this.vBox.setMinHeight(this.vBox.getPrefHeight());
        this.vBox.setMinHeight(this.vBox.getPrefHeight());
        System.out.println(" -- createVBox: "+this.id+" added");
        return this.vBox;
    }

        /**
         * Create and return a new StackPane providing its ID
         * @return StackPane this.root
         */
    private StackPane createStackPane() {
        root = new StackPane();
        root.setId(this.id);
        root.setAlignment(Pos.TOP_CENTER);
        root.setBackground(new Background(new BackgroundFill(colorCode.get(3), null, null)));
        System.out.println(" -- createStackPane: "+this.id+" added");
        return root;
    }

    


    public Pane getPane() {
        switch (this.type) {
            case "hbox": 
                return this.hBox;
            case "vbox": 
                return this.vBox;
            case "root": 
                return this.root;
            default:
                throw new AssertionError( "Unknown type: " + this.type);
        }
    }

    @Override
    public Pane getElement() {
        return this.getPane();
    }


}

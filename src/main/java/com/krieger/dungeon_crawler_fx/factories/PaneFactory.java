package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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
                // MainController mc = new MainController();
    String id;
    public   HBox hBox;
    public  VBox vBox;
    public  StackPane root;


        //NOTE Constructor
    public PaneFactory(){
    }


        //NOTE Methods
                // creates and returns a new Pane subclass
    public HBox createHBox(String id) {
        this.id=id;
        this.hBox = new HBox();
        this.hBox.setId(this.id);
        this.hBox.setSpacing(20);
        this.hBox.setPadding(new Insets(40, 40, 40, 40));
        System.out.println(" -- createHBox: "+this.id+" added");
        return this.hBox;
    }

    public VBox createVBox(String id) {
        this.id=id;
        this.vBox = new VBox();
        this.vBox.setId(this.id);
        this.vBox.setMaxHeight(980);
        this.vBox.setMinHeight(this.vBox.getMaxHeight());
        System.out.println(" -- createVBox: "+this.id+" added");
        return this.vBox;
    }

    public StackPane createStackPane(String id) {
        this.id=id;
        this.root = new StackPane();
        this.root.setId(this.id);
        this.root.setAlignment(Pos.TOP_CENTER);
        this.root.setBackground(new Background(new BackgroundFill(colorCode.get(3), null, null)));
        System.out.println(" -- createStackPane: "+this.id+" added");
        return this.root;
    }


}

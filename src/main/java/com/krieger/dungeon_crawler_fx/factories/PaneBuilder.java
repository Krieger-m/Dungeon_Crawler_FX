package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PaneBuilder {

        //NOTE Variables

    ArrayList<Pane> paneList = new ArrayList<>();
    String name;
    String type;


        //NOTE Contructor

    public PaneBuilder() {
    }


        //NOTE Methods
            // adds element to list
    public void addToList(Pane p){
        this.paneList.add(p);
    }

            // Main Container
    public VBox mainContainerBuilder(){
        this.name="mainContainer";
        this.type="vBox";
        VBox vBox = new VBox();
        return vBox;
    }
    public void vBoxAssembler(){

    }
            // Button Box
    public HBox btnBoxBuilder(){
        this.name="btnBox";
        this.type="hBox";
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(20));
        return hBox;
    }
    public void btnBoxAssembler(ArrayList<Button> btnList){
        btnList.forEach(Button -> {
            for (Pane p : this.paneList) {
                if (p.getClass().equals(HBox.class)) {
                    p.getChildren().add(Button);
                }
            }
        });
    }
    public Pane getButtonBox(){
        for (Pane p : this.paneList) {
            if (p.getClass().isInstance(HBox.class)) {
                return p;
            }
            return p;
        }
        return null;
    }



}

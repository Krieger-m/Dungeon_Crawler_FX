package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import com.krieger.dungeon_crawler_fx.App;

import com.krieger.dungeon_crawler_fx.factories.ImageBuilder;

import java.util.ArrayList;



public class PaneFactory extends App{

        //NOTE Variables

    public static ArrayList<Pane> paneList = new ArrayList<>();




    //NOTE Contructor

    public PaneFactory() {

    }

        //NOTE Methods
            // adds element to list
    public void addToList(Pane p){
        this.paneList.add(p);
    }

            // Main Container
    public VBox mainContainerBuilder(String title){
        VBox vBox = new VBox();
        vBox.setId(title);
        addToList(vBox);
        return vBox;
    }

    public Pane getMainContainer(){
        for (Pane p : this.paneList) {
            if (p.getClass().equals(VBox.class)) {
                return p;
            }
        }
        return null;
    }
            // Add ImageView
    public void addImageView(ImageView view){
        getMainContainer().getChildren().add(view);
    }

            // Button Box
    public HBox btnBoxBuilder(String title){
        HBox hBox = new HBox();
        hBox.setId(title);
        hBox.setSpacing(20);
        hBox.setPadding(new Insets(40,40,40,40));
        addToList(hBox);
        return hBox;
    }

    public void btnBoxAssembler(ArrayList<Button> btnList){
        for (Button btn : btnList){
            for (Pane pane : this.paneList) {
                if (pane.getId().equals("btnBox")) {
                    pane.getChildren().add(btn);
                }
            }
        }
    }
    public Pane getButtonBox(){
        for (Pane p : this.paneList) {
            if (p.getClass().equals(HBox.class)) {
                return p;
            }
        }
        return null;
    }

    public void addButtonBox(HBox hBox){
        getMainContainer().getChildren().add(hBox);
    }

    public void addEvery(Node o){
        getMainContainer().getChildren().add(o);
    }



}

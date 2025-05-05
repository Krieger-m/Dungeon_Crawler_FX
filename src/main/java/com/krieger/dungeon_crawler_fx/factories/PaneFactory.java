package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;
import com.krieger.dungeon_crawler_fx.App;

import java.util.ArrayList;



public class PaneFactory extends App{

        //NOTE Variables

    PaneBuilder pb = new PaneBuilder();





    //NOTE Constructor

    public PaneFactory() {

    }

        //NOTE Methods
    public void newPane(String type,String id){
        pb.newPane(type,id);
    }

    public Pane getPaneById(String id){
        return pb.getPaneById(id);
    }

    public Pane getPaneByClass(String cls){
        return pb.getPaneByClass(cls);
    }

            // adds element to list
    public void addToList(Pane p){
        pb.panes.add(p);
    }




                //CHECK new approach at adding the buttons
                    // lets see if it works better if I generalize the functions so it won't be that confusing
    public void generalAssembler(Pane parent, Node child){
        parent.getChildren().add(child);
    }



}

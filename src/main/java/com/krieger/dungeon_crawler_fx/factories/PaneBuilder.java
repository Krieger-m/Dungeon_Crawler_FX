package com.krieger.dungeon_crawler_fx.factories;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.layout.Pane;

import java.lang.invoke.TypeDescriptor;
import java.util.ArrayList;

public class PaneBuilder {

    public ArrayList<Pane> panes = new ArrayList<>();

    public void newPane(String type, String id){
        switch (type){
            case "HBox","buttonBox","btnBox":{
                HBox hBox = new HBox();
                hBox.setId(id);
                hBox.setSpacing(20);
                hBox.setPadding(new Insets(40,40,40,40));
                this.panes.add(hBox);
            }break;
            case "VBox","mainContainer","mainBox": {
                VBox vBox = new VBox();
                vBox.setId(id);
                this.panes.add(vBox);
            }break;
            default: {
                System.out.println("Compatible types: \"VBox\" \"HBox\" ");
            }
        }
    }

    public Pane getPaneById(String id){
        boolean check = false;
        for (Pane p : this.panes) {
            if (p.getId().equals(id)) {
                System.out.println("getElementByID: "+id);
                check = true;
                return p;
            }
        }
        if(!check) {
            System.out.println("ERROR: ID - "+id+" not found!");
        }
        return null;
    }

    public Pane getPaneByClass(String cls){
        boolean check = false;
        for (Pane p : this.panes) {
            if (p.getClass().toString().equals(cls)) {
                System.out.println("getElementByClass: "+cls);
                check = true;
                return p;
            }
        }
        if(!check) {
            System.out.println("ERROR: ID - "+cls+" not found!");
        }
        return null;
    }



}

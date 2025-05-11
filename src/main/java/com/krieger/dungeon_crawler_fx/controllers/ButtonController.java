package com.krieger.dungeon_crawler_fx.controllers;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import javafx.scene.control.Button;

public class ButtonController extends ButtonFactory {



    int a = 4;


    public ButtonController() {

        for (Button b : ButtonFactory.btnList){
            if(b.getId().contains("inventory")){
                // to be continued ...
            }
        }

    }



}

package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ButtonBuilder extends App {

            // Variables

    public ArrayList<Button> btnList = new ArrayList<>();
    private String btnText;
    String type;


            // Constructor


    public ButtonBuilder() {

    }

            //Methods

                // adding buttons to the btnList
    public void addBtnsToList(String[] arr){
        for (String s : arr) {
            this.btnList.add(returnNewBtn(s));
        }
    }

                // returns a new button and sets String type to "actionBtn" for example
    public Button returnNewBtn(String text){
        setBtnText(text);
        this.type=text.toLowerCase()+"Btn";
        Button newBtn = new Button(getBtnText());
        newBtn.setBorder(new Border(
                new BorderStroke(
                        Color.ANTIQUEWHITE,
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(2),
                        new BorderWidths(1),null)
        ));
        newBtn.setBackground(new Background(new BackgroundFill(Color.web(colorCode.get(2)),null,null)));
        newBtn.setTextFill(Color.web(colorCode.get(5)));

        return newBtn;
    }


    // Getters/Setters
                // - btnText - but I guess they just sit here in their corner unused for now ...
    public String getBtnText() {
        return btnText;
    }
    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }
}

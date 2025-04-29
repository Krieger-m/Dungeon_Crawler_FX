package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.App;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class ButtonBuilder extends App {

            //NOTE Variables

    public ArrayList<Button> btnList = new ArrayList<>();
    private String btnText;
    String type;


            //NOTE Constructor


    public ButtonBuilder() {

    }

            //NOTE Methods

                // adding buttons to the btnList
    public void addBtnsToList(String[] arr){
        for (String s : arr) {
            this.btnList.add(returnNewBtn(s));
        }
    }

                // Button color: Standard dark-settings
    public void colorSettingsDark(Button btn){
        btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(4),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(1),null)
        ));
        btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(2),
                        new CornerRadii(3),
                        null)));
        btn.setTextFill(colorCode.get(5));

    }

                // Button color: Standard hover-light-settings
    public void colorSettingsLight(Button btn){
        btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(1),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(1),null)
        ));
        btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(4),
                        new CornerRadii(3),
                        null)
        ));
        btn.setTextFill(colorCode.get(3));

    }

                // returns a new button and sets String type to "actionBtn" for example
    public Button returnNewBtn(String text){
        setBtnText(text);
        this.type=text.toLowerCase()+"Btn";
        Button newBtn = new Button(getBtnText());
        newBtn.setFont(Font.font(16));
            //newBtn.setPrefSize(80,40);
        colorSettingsDark(newBtn);
        newBtn.setOnMouseEntered(mouseEvent ->{
            colorSettingsLight(newBtn);
        });
        newBtn.setOnMouseExited(mouseEvent -> {
            colorSettingsDark(newBtn);
        });

        return newBtn;
    }


        //NOTE Getters/Setters
                // - btnText - but I guess they just sit here in their corner unused for now ...
    public String getBtnText() {
        return btnText;
    }
    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }
}

package com.krieger.dungeon_crawler_fx._drop.factories;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.List;

import static com.krieger.dungeon_crawler_fx.factories.PaneFactory.colorCode;

public class ButtonFactory  {

            //NOTE Variables

    private static String btnText;

    public static ArrayList<String> btnNames= new ArrayList<>();

    public static ArrayList<Button> btnList = new ArrayList<>();


            //NOTE Constructor

    public ButtonFactory(){
    }

    public static void updateButtonNames(String[] arr) {
        btnNames.clear();
        btnList.clear();
        btnNames.addAll(List.of(arr));
    }

            //NOTE Methods

                // returns a new button and sets String type to "actionBtn" for example
    public static Button newButton(String text) {
        Button newBtn = new Button(text);
        newBtn.setId(text.toLowerCase() + "Btn");
        newBtn.setFont(Font.font(16));
        colorSettingsDark(newBtn);
        newBtn.setOnMouseEntered(mouseEvent -> colorSettingsLight(newBtn));
        newBtn.setOnMouseExited(mouseEvent -> colorSettingsDark(newBtn));
        return newBtn;
    }

                // adding buttons to the btnList
    public static List<Button> createNewButtons(String[] arr){
        List<Button> btnList = new ArrayList<>();
        //updateButtonNames(arr);
        System.out.println("___________\n");
        for (String s : arr) {
            System.out.println(s.toLowerCase()+"Btn  - added");
            btnList.add(newButton(s));
        }
        System.out.println("___________\n");
        return btnList;
    }


                // Button color: Standard dark-settings (normal mode)
    public static void colorSettingsDark(Button btn){
        btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(4),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(2),null)
        ));
        btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(2),
                        new CornerRadii(3),
                        null)));
        btn.setTextFill(colorCode.get(5));

    }


                // Button color: Standard hover-light-settings (hover mode)
    public static void colorSettingsLight(Button btn){
        btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(1),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(2),null)
        ));
        btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(4),
                        new CornerRadii(3),
                        null)
        ));
        btn.setTextFill(colorCode.get(3));
    }


        //NOTE Getters/Setters
                // - btnText - but I guess they just sit here in their corner unused for now ...

    public static String getBtnText() {
        return btnText;
    }
    public static void setBtnText(String btnText) {
        ButtonFactory.btnText = btnText;
    }






}

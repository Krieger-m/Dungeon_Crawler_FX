package com.krieger.dungeon_crawler_fx.factories;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.util.ArrayList;
import java.util.List;

import static com.krieger.dungeon_crawler_fx.factories.PaneFactory.colorCode;

public class ButtonFactory  {

    //CHECK - new process implemented!
    // --------------------------------->>>

        //NOTE Variables
            // Button-params
    private String btnText;
    private String id;
    Button btn = new Button();

            // Lists
    public static ArrayList<String> btnNames= new ArrayList<>();
    public static ArrayList<Button> btnList = new ArrayList<>();


        //NOTE Constructor
            // no-args-constructor
    public ButtonFactory(){
        System.out.println("\n - NewBtn no-args-constructor check!");
    }

            // argument-constructor
    public ButtonFactory(String btnText){
        this.btnText=btnText;

        btnIdConverter();
        setBtnTextAndId();
        colorSettingsDark();

        System.out.println("- 03 - NewBtn: "+ this.btn.getId() +" btnText argument-constructor - check!"+"\n" +"---------------------------\n\n");
    }


        //NOTE Methods
            // set btn id and text
    public void setBtnTextAndId(){
        this.btn.setId(this.id);
        this.btn.setText(this.btnText);
        System.out.println("- 02 - setBtn @"+ this.btn.getText() +" (id: "+ this.btn.getId() +") - check!");
    }

            // converts the given btnName string to a valid button-id
    public void btnIdConverter(){
        System.out.println("---------------------------\n- 01 - btnIdConverter: "+ this.btn.getText() +" - check!");
        String[] strings = this.btnText.replaceFirst("^\\d+", "").split("\\s+");
        StringBuilder result = new StringBuilder(strings[0].toLowerCase());
        System.out.println("\t"+this.btnText+"\n\t\tstrings[0] = "+ strings[0]);
        if(strings.length >1){
            for(int i=1; i< strings.length; i++){
                System.out.println("\t\tstrings["+i+"] = "+ strings[i]);
                result.append(Character.toUpperCase(strings[i].charAt(0))).append(strings[i].substring(1));
            }
            result.append("Btn");
        }
        this.id=result.toString().replaceAll("[^a-zA-Z0-9_]", "");
        System.out.println("\tresult of btnId: "+this.id);
    }

            // returns the button
    public Button getBtn(){
        return this.btn;
    }

            // btn actionHandler method
    public void setHoverAction(){
        this.btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                colorSettingsLight();
            }
        });
        this.btn.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                colorSettingsDark();
            }
        });
    }

        // Button color: Standard dark-settings (normal mode)
    public void colorSettingsDark(){
        this.btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(4),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(2),null)
        ));
        this.btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(2),
                        new CornerRadii(3),
                        null)));
        this.btn.setTextFill(colorCode.get(5));

    }

        // Button color: Standard hover-light-settings (hover mode)
    public void colorSettingsLight(){
        this.btn.setBorder(new Border(
                new BorderStroke(
                        colorCode.get(1),
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(3),
                        new BorderWidths(2),null)
        ));
        this.btn.setBackground(new Background(
                new BackgroundFill(
                        colorCode.get(4),
                        new CornerRadii(3),
                        null)
        ));
        this.btn.setTextFill(colorCode.get(3));
    }


        //NOTE Getters/Setters
            // - btnText - but I guess they just sit here in their corner unused for now ...
    public String getBtnText() {
        return this.btnText;
    }
    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }


}

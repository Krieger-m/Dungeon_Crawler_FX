package com.krieger.dungeon_crawler_fx.factories;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.krieger.dungeon_crawler_fx.factories.PaneFactory.colorCode;

public class ButtonFactory  {

    //CHECK -
    // --------------------------------->>>

        //NOTE Variables
            // Button-params
    private String btnText;
    private String[] btnTextArr;
    private String id;
    Button btn;

    private List<Button> btnList = new ArrayList<>();


        //NOTE Constructor

    /**
     * Argument constructor for the ButtonFactory
     * @param arr provides the text for the new button
     */
    public ButtonFactory(String[] arr) {
        this.btnTextArr = arr;

        for (String s : arr) {
            String btnText = s; // Local variable for button text
            Button btn = new Button(); // Local variable for the button

            btn.setText(btnText);
            btnIdConverter(btnText, btn); // Pass the button text and button to set the ID
            setHoverAction(btn); // Apply hover action to the current button
            colorSettingsDark(btn); // Apply dark theme to the current button

            this.btnList.add(btn); // Add the button to the list
            System.out.println("\t\t - buttonList.size(): " + this.btnList.size());
        }
    }


        //NOTE Methods
            // set btn id and text
    private void setBtnTextAndId(){
        this.btn.setId(this.id);
        this.btn.setText(this.btnText);

        System.out.println("- 02 - setBtn @"+ this.btn.getText() +" (id: "+ this.btn.getId() +") - check!");
    }

            // converts the given btnName string to a valid button-id
    private void btnIdConverter(String btnText, Button btn){
        System.out.println("---------------------------\n- 01 - btnIdConverter: "+ btnText +" - check!");
        String[] strings = btnText.replaceFirst("^\\d+", "").split("\\s+");
        StringBuilder result = new StringBuilder(strings[0].toLowerCase());

        System.out.println("\t"+btnText+"\n\t\tstrings[0] = "+ strings[0]);

        if(strings.length >1){
            for(int i=1; i< strings.length; i++){
                System.out.println("\t\tstrings["+i+"] = "+ strings[i]);
                result.append(Character.toUpperCase(strings[i].charAt(0))).append(strings[i].substring(1));
            }
        }
        result.append("Btn");
        this.id=result.toString().replaceAll("[^a-zA-Z0-9_]", "");
        System.out.println("\tresult of btnId: "+this.id);
        btn.setId(this.id); // Set the ID for the button
    }




        //NOTE Getters/Setters

    // returns the button
    public Button getBtn(){
        return this.btn;
    }
    
    public List<Button> getBtnList() {
        return btnList;
    }


        //NOTE color and style settings 
            // will be moved to stylesheet.css later

   


     /**
     * Sets the light/dark-theme change dynamics
     */
    private void setHoverAction(Button btn){
        btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                colorSettingsLight(btn);
            }
        });
        btn.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                colorSettingsDark(btn);
            }
        });
    }

    /**
     * Button color: Standard dark-settings (normal mode)
     */
    private void colorSettingsDark(Button btn){
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
                        null)
        ));
        btn.setTextFill(colorCode.get(5));

    }

    /**
     * Button color: Standard hover-light-settings (hover mode)
     * */
    private void colorSettingsLight(Button btn){
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
                        new CornerRadii(5),
                        null)
        ));
        btn.setTextFill(colorCode.get(3));
    }
}

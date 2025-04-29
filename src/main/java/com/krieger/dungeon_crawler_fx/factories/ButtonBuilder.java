package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.control.Button;

public class ButtonBuilder {

            // Variables
    private String btnText;

            // Constructor


    public ButtonBuilder(String text) {
        Button newBtn = new Button(text);

    }

            // Getters/Setters
                // - btnText - but I guess they just sit there unused for now ...
    public String getBtnText() {
        return btnText;
    }
    public void setBtnText(String btnText) {
        this.btnText = btnText;
    }
}

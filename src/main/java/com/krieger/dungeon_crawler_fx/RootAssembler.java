package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class RootAssembler extends App{

    //CHECK - partly improved.
    // ----------------------------->>>

        //NOTE Variables
            //
    private StackPane root;
    private VBox mainContainer;
    private HBox btnBox;
    private ImageView iV;


        //NOTE Constructor
    /**
     * RootAssembler constructor
     * @param btnNames String[] of button names
     * @param imgPath String containing image-path
     */
    public RootAssembler(String[] btnNames, String imgPath) {
        prepareRoot(btnNames, imgPath);

       

    }


        //NOTE Methods
    private void prepareRoot(String[] btnNames, String imgPath){
        ButtonFactory.updateButtonList(btnNames);

        this.iV = new ImageFactory(imgPath).getImageView();

        this.btnBox =  (HBox)new PaneFactory("hbox","buttonContainer").getElement();

        this.mainContainer = (VBox)new PaneFactory("vbox","mainContainer").getElement();

        this.root = (StackPane)new PaneFactory("root","rootContainer").getElement();

        updateElements();
    }

    public StackPane getRoot (){
        return this.root;
    }

    public static void updateBtnList(){

    }

    private void updateElements(){
        this.btnBox.getChildren().clear();
        this.btnBox.getChildren().addAll(ButtonFactory.btnList);
        this.mainContainer.getChildren().clear();
        this.mainContainer.getChildren().addAll(this.iV, this.btnBox);
        
        if (this.root != null) {
            this.root.getChildren().clear();
            this.root.getChildren().add(this.mainContainer);
        }

    }

}

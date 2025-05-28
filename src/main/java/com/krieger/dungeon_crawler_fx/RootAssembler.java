package com.krieger.dungeon_crawler_fx;

import java.util.List;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class RootAssembler{

    //CHECK - RootAssembly - partly improved.
    // ----------------------------->>>

        //NOTE Variables
            //
    private StackPane root;
    private VBox mainContainer;
    private HBox btnBox;
    private ImageView iV;
    private  List<Button> buttonList;

    String[] currentNames;
    String currentPath;


        //NOTE Constructor
    /**
     * RootAssembler constructor
     * @param btnNames String[] of button names
     * @param imgPath String containing image-path
     */
    public RootAssembler(String[] btnNames, String imgPath) {
        this.currentNames = btnNames;
        this.currentPath = imgPath;
        prepareRoot();

       

    }


        //NOTE Methods
    private void prepareRoot(){
        this.buttonList = new ButtonFactory(this.currentNames).getBtnList();        

        this.iV = new ImageFactory(this.currentPath).getImageView();

        this.btnBox =  (HBox)new PaneFactory("hbox","buttonContainer").getElement();

        this.mainContainer = (VBox)new PaneFactory("vbox","mainContainer").getElement();

        this.root = (StackPane)new PaneFactory("root","rootContainer").getElement();

        updateElements();
    }

    public StackPane getRoot (){
        return this.root;
    }


    private void updateElements(){
        this.btnBox.getChildren().clear();
        this.btnBox.getChildren().addAll(this.buttonList);
        this.mainContainer.getChildren().clear();
        this.mainContainer.getChildren().addAll(this.iV, this.btnBox);
        
        if (this.root != null) {
            this.root.getChildren().clear();
            this.root.getChildren().add(this.mainContainer);
        }

    }

}

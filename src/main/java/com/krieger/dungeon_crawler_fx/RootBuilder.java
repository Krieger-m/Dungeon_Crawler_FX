package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class RootBuilder {

    //CHECK - not yet implemented!
    // ----------------------------->>>

        //NOTE Variables
            //
    StackPane root;
    String id;


        //NOTE Constructor
    /**
     * RootBuilder constructor
     * @param id ID of the new root
     * @param btnNames String[] of button names
     * @param imgPath String containing image-path
     */
    public RootBuilder(String id, String[] btnNames, String imgPath) {
        makeNewRoot(btnNames, imgPath);
        this.id = id;
    }


        //NOTE Methods
    public void makeNewRoot(String[] btnNames, String imgPath){
        ButtonFactory.addButtonsToList(btnNames);

        ImageView iV = new ImageFactory(imgPath).getImageView();

        HBox btnBox =  new PaneFactory().createHBox("btnBox");

        VBox mainContainer = new PaneFactory().createVBox("mainContainer");

        StackPane root = new PaneFactory().createStackPane("root");

        btnBox.getChildren().clear();
        btnBox.getChildren().addAll(ButtonFactory.btnList);
        mainContainer.getChildren().addAll(iV, btnBox);
        root.getChildren().add(mainContainer);
        root.setId(this.id);
        this.root = root;
    }

    public StackPane getRoot (){
        return this.root;
    }


}

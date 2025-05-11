package com.krieger.dungeon_crawler_fx;

import com.krieger.dungeon_crawler_fx.factories.ButtonFactory;
import com.krieger.dungeon_crawler_fx.factories.ImageFactory;
import com.krieger.dungeon_crawler_fx.factories.PaneFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class RootAssembler {

    //CHECK - not yet implemented!
    // ----------------------------->>>

        //NOTE Variables
            //
    StackPane root;
    VBox mainContainer;
    HBox btnBox;
    ImageView iV;
    String id;


        //NOTE Constructor
    /**
     * RootAssembler constructor
     * @param id ID of the new root
     * @param btnNames String[] of button names
     * @param imgPath String containing image-path
     */
    public RootAssembler(String id, String[] btnNames, String imgPath) {
        this.id = id;
        makeNewRoot(btnNames, imgPath);

    }


        //NOTE Methods
    public void makeNewRoot(String[] btnNames, String imgPath){
        ButtonFactory.updateButtonList(btnNames);

        this.iV = new ImageFactory(imgPath).getImageView();

        this.btnBox =  new PaneFactory().createHBox("btnBox");

        this.mainContainer = new PaneFactory().createVBox("mainContainer");

        this.root = new PaneFactory().createStackPane("root");

        update();

        if (this.root != null) {
            this.root.setId(this.id);
            this.root.getChildren().clear();
            this.root.getChildren().add(this.mainContainer);
        }

    }

    public StackPane getRoot (){
        return this.root;
    }

    public void update(){
        this.btnBox.getChildren().clear();
        this.btnBox.getChildren().addAll(ButtonFactory.btnList);
        this.mainContainer.getChildren().clear();
        this.mainContainer.getChildren().addAll(iV, btnBox);
    }

}

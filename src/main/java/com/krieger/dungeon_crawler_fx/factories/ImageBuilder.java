package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.krieger.dungeon_crawler_fx.App;

public class ImageBuilder extends Node {

                //NOTE Variables
    private String imgPath = " ";

                // TODO ImageList will be added here
    //



                //NOTE Constructors
                    // ImageView Constructor, returns ImageView type for further
                    // use in SceneHandler or in Main App???
                    // we will see where the journey takes us (°͜°)
    public ImageBuilder(String path) {
        this.imgPath=path;
    }

                //NOTE Methods for returning elements
    public ImageView ImageViewBuilder() {
        Image img = new Image(this.imgPath);
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(800);
        imgView.setPreserveRatio(true);
        return imgView;
    }

                //NOTE getter/setter
                    // imgPath
    public String getImgPath() {
        return imgPath;
    }
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}

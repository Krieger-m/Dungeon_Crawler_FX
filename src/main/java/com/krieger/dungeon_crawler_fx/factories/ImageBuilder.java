package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageBuilder extends Node {
                // Variables
    private String imgPath = " ";



                // Constructors
                    // ImageView Constructor, returns ImageView type for further
                    // use in SceneHandler or in Main App???
                    // we will see where the journey takes us (°͜°)
    public ImageBuilder(String path) {
        this.imgPath=path;
    }

                // Methods for returning elements
    public ImageView ImageViewBuilder() {
        Image img = new Image(this.imgPath);
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(800);
        img.isPreserveRatio();

        return imgView;
    }

                // getter/setter
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

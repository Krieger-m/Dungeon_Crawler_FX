package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.App;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageBuilder extends App {

                //NOTE Variables
    private String imgPath = " ";
    public Image img;
    public ImageView imageView;

                // TODO ImageList will be added here
    //

                //NOTE Constructors
                    // ImageView Constructor, returns ImageView type for further
                    // use in SceneHandler or in Main App???
                    // we will see where the journey takes us (°͜°)
    public ImageBuilder(){}

                //NOTE Methods for returning elements
    public ImageView imageViewBuilder(String title) {
        this.img = new Image(this.imgPath);
        this.imageView = new ImageView(img);
        this.imageView.setId(title);
        this.imageView.setFitWidth(800);
        this.imageView.setPreserveRatio(true);
        return imageView;
    }

    public void updateImage(String path){
        this.imgPath= path;
        this.img = new Image(this.imgPath);
        this.imageView.setImage(this.img);
    }


    public ImageView getImageView(){
        return this.imageView;
    }

                //NOTE getter/setter
                    // imgPath
    public String getImgPath() {
        return imgPath;
    }
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

}

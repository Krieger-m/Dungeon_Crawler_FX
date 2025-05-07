package com.krieger.dungeon_crawler_fx.factories;

import com.krieger.dungeon_crawler_fx.App;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageFactory  {

                //NOTE Variables
    public String mainImgPath = "file:./images/start_scene.jpg";
    public String inventoryImgPath = "file:./images/inventory_bg.jpg";
    public Image img;
    public ImageView imageView;

                // TODO ImageList will be added here
    //

                //NOTE Constructors
                    // ImageView Constructor, returns ImageView type for further
                    // use in SceneHandler or in Main App???
                    // we will see where the journey takes us (°͜°)
    public ImageFactory(){}

                //NOTE Methods for returning elements
    public ImageView imageViewBuilder(String title) {
        this.img = new Image(this.mainImgPath);
        this.imageView = new ImageView(img);
        this.imageView.setId(title);
        this.imageView.setFitWidth(800);
        this.imageView.setPreserveRatio(true);
        return imageView;
    }

    public void updateImage(String path){
        this.mainImgPath= path;
        this.img = new Image(this.mainImgPath);
        this.imageView.setImage(this.img);
    }


    public ImageView getImageView(){
        return this.imageView;
    }

                //NOTE getter/setter
                    // imgPath
    public String getImgPath() {
        return mainImgPath;
    }
    public void setImgPath(String imgPath) {
        this.mainImgPath = imgPath;
    }

}

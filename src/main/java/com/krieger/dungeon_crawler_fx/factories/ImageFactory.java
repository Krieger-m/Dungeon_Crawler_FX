package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageFactory  {

    //CHECK - under construction!
    // ---------------------------->>>

                //NOTE Variables
    public static String startScreenPath = "images/start_screen.jpg";
    public static String mainImgPath = "file:./images/main_scene.jpg";
    public static String inventoryImgPath = "file:./images/inventory_bg.jpg";

    public Image image;
    public ImageView imageView;


        //NOTE Constructors
    /**
     * Constructor for the new ImageView
     * @param path provides the Image-path
     */
    public ImageFactory(String path){
        updateImageView(path);
    }


        //NOTE Methods
    /**
     * is updating the ImageView
     * @param  path is the path to the new Image
     */
    public void updateImageView(String path) {
        this.image = new Image(path);
        this.imageView = new ImageView(image);
        ImageViewSettings();
    }

    /**
     * sets the ImageView settings (height, width)
     * NO PARAMS
     */
    public void ImageViewSettings(){
        this.imageView.setFitWidth(800);
        this.imageView.setPreserveRatio(true);
    };


        //NOTE getter/setter
    /**
     * returns finished ImageView
     * @return this.imageView
     */
    public ImageView getImageView(){
        return this.imageView;
    }



}

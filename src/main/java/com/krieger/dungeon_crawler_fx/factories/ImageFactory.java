package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Map;

public class ImageFactory  {

    //CHECK - ImageFactory -
    // ---------------------------->>>

        //NOTE Variables

    public static String startScreenPath = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/start_screen.jpg";
    public static String mainImgPath = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/main_scene.jpg";
    public static String inventoryImgPath = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/inventory_bg.jpg";

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
        //this.imageView.setId();
    }

            //NOTE ----------------
            // Under Construction
            //CHECK ---------------
    public void setImgViewID(String path){
        String[] s = path.split("/");
        System.out.println(s[s.length-1]);
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

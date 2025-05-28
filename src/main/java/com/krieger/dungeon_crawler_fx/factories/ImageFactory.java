package com.krieger.dungeon_crawler_fx.factories;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ImageFactory  {

    //CHECK - ImageFactory -
    // ---------------------------->>>

    
        //NOTE Variables
    
    private Image image;
    private ImageView imageView;

    private String currentPath;


        //NOTE Constructors
    /**
     * Constructor for the new ImageView
     * @param path provides the Image-path
     */
    public ImageFactory(String path){
        this.currentPath = path;
        updateImageView();
    }


        //NOTE Methods
    /**
     * is updating the ImageView
     * NO PARAMS
     */
    private void updateImageView() {
        try {
            this.image = new Image(this.currentPath);
            this.imageView = new ImageView(image);
            ImageViewSettings();
            setImgViewID();
        } catch (Exception e) {
            System.err.println("Error loading image: " + this.currentPath);
            this.imageView = new ImageView(); // Fallback to an empty ImageView
        }
    }
    /**
     * sets the ImageView ID based on the image path
     * NO PARAMS
     */
    private void setImgViewID(){
        String[] s = this.currentPath.split("/");
        s=s[s.length-1].split("\\.");
        System.out.println("s0: -->> "+s[0]);
        this.imageView.setId(s[0]+"View");
        System.out.println("this.imageView.getId(): "+ this.imageView.getId());
    }

    /**
     * sets the ImageView settings (height, width)
     * NO PARAMS
     */
    private void ImageViewSettings(){
        this.imageView.setFitWidth(800);
        this.imageView.setPreserveRatio(true);
    };


        //NOTE getter/setter
    /**
     * returns finished ImageView
     * @return ImageView this.imageView
     */
    public ImageView getImageView(){
        return this.imageView;
    }



}

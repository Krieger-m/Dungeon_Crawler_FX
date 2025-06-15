package com.krieger.dungeon_adventure;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
    // This class is responsible for managing the user interface and switching scenes.
    // It will contain methods to load FXML files, set up the stage, and handle scene transitions.

    private FXMLLoader loader;
    private Stage newStage;
    private Scene scene;



    private String fxmlPath = "/views/start-view.fxml";

    public View() {
        loadFXML();

    }

    private void loadFXML() {
        // Load the initial scene (e.g., start-view.fxml)
        this.loader = new FXMLLoader(getClass().getResource(getFxmlPath()));
    }



    public void switchScene(String fxmlPath) throws IOException {
        // Update the FXML path
        setFxmlPath(fxmlPath);

        // Load the new FXML file
        FXMLLoader newLoader = new FXMLLoader(getClass().getResource(getFxmlPath()));
        Scene newScene = new Scene(newLoader.load());

        // Set the new scene on the stage
        this.newStage.setScene(newScene);
        this.newStage.show();
    }


    public void show(Stage s)throws IOException{
        this.newStage = s;
        this.newStage.setTitle("Dungeon Adventure");
        System.out.print("- getLoader() called in View.show(): ");
        this.loader = getLoader();
        this.scene = new Scene(this.loader.load());
        System.out.println(this.scene.getRoot().getChildrenUnmodifiable());
        this.newStage.setScene(this.scene);
        this.newStage.show();
    }

    public FXMLLoader getLoader(){

        if(this.loader!=null) {
            System.out.println("this.loader != null: "+this.loader);
            return this.loader;
        } else if(this.loader==null){
            System.out.println("this.loader == null, loading fxml again: "+this.loader);
            loadFXML();
            getLoader();
            return this.loader;
        };  return getLoader();
    }
    public String getFxmlPath() {return fxmlPath;}
    public void setFxmlPath(String fxmlPath) {this.fxmlPath = fxmlPath;}
}

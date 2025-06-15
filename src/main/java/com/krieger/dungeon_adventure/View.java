package com.krieger.dungeon_adventure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
        // Switch to a different scene by loading a new FXML file
        setFxmlPath(fxmlPath);
        loadFXML();
        show();
    }


    public void show()throws IOException{
        this.newStage = new Stage();
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

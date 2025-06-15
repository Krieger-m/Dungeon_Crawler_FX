package com.krieger.dungeon_adventure;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class View {
    // This class is responsible for managing the user interface and switching scenes.
    // It will contain methods to load FXML files, set up the stage, and handle scene transitions.

    private FXMLLoader loader;
    private Stage newStage;
    private Scene scene;

    private String fxmlPath = "/com/krieger/dungeon_adventure/start-view.fxml";

    public View() {

        loadView();
    }

    private void loadView() {
        // Load the initial scene (e.g., start-view.fxml)

        this.loader = new FXMLLoader(getClass().getResource(fxmlPath));
            //this.loader.load();


    }

    public void show()throws IOException{
        this.newStage = new Stage();
        this.newStage.setTitle("Dungeon Adventure");
        FXMLLoader loader = getLoader();
        this.scene = new Scene(loader.load());
        this.newStage.setScene(scene);
        this.newStage.show();
    }

    public FXMLLoader getLoader(){

        if(this.loader!=null) {
            return this.loader;
        } else if(this.loader==null){
            loadView();
            return this.loader;
        };
        return null;
    }
}

package tests.testSandbox;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class NewBtn{

        //NOTE Variables

    String btnText ;
    String id;

    Button btn = new Button();

        //NOTE Constructors
    public NewBtn(){
        System.out.println("NewBtn no-args check!");
    }
    public NewBtn(String btnText){
        System.out.println("NewBtn with args check!");
        this.btnText=btnText;
        this.id = btnText.toLowerCase()+"Btn";
        setBtn();
    }

        //NOTE Methods

    public void setBtn(){
        System.out.println("setBtn check!");
        this.btn.setId(this.id);
        this.btn.setText(this.btnText);

    }





}




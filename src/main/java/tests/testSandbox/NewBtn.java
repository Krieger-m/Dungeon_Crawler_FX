package tests.testSandbox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class NewBtn extends SandboxTwo{

    //CHECK - new process test for ButtonFactory
    // -------------------------------------------->>>

        //NOTE Variables
    String btnText ;
    String id;
    Button btn;


        //NOTE Constructors
    public NewBtn(){
        System.out.println("\n - NewBtn no-args-constructor check!");
    }

    public NewBtn(String btnText){
        this.btn = new Button();
        this.btnText=btnText;
        btnIdConverter();
        setBtnTextAndId();
        btnHandler();
        buttonAction();
        System.out.println("- 03 - NewBtn: "+ this.btn.getId() +" btnText argument-constructor - check!"+"\n" +"---------------------------\n\n");
    }


        //NOTE Methods

    public void buttonAction(){
        this.btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Scene scene2= new NewScene().getScene();
                Stage stage = new Stage();
                stage.setTitle("SandboxTwo - 2nd stage");
                stage.setScene(scene2);
                System.out.println(stage.getScene());
            }
        });
    }


            // set btn id and text
    public void setBtnTextAndId(){
        this.btn.setId(this.id);
        this.btn.setText(this.btnText);
        System.out.println("- 02 - setBtn @"+ this.btn.getText() +" (id: "+ this.btn.getId() +") - check!");
    }

            // converts the given btnName string to a valid button-id
    public void btnIdConverter(){
        System.out.println("---------------------------\n- 01 - btnIdConverter: "+ this.btn.getText() +" - check!");
        String[] strings = this.btnText.replaceFirst("^\\d+", "").split("\\s+");
        StringBuilder result = new StringBuilder(strings[0].toLowerCase());
        System.out.println("\t"+this.btnText+"\n\t\tstrings[0] = "+ strings[0]);
        if(strings.length >1){
            for(int i=1; i< strings.length; i++){
                System.out.println("\t\tstrings["+i+"] = "+ strings[i]);
                result.append(Character.toUpperCase(strings[i].charAt(0))).append(strings[i].substring(1));
            }
            result.append("Btn");
        }
        this.id=result.toString().replaceAll("[^a-zA-Z0-9_]", "");
        System.out.println("\tresult of btnId: "+this.id);
    }

            // returns the button
    public Button getBtn(){
        return this.btn;
    }

            // btn actionHandler method
    public void btnHandler (){
        this.btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("\n-04 - \t ->>> buttonHandler test: " + btn.getId()+" - check!");
            }
        });
    }


}




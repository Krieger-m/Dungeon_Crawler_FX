module com.krieger.dungeon_crawler_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jdi;


    opens com.krieger.dungeon_crawler_fx to javafx.graphics, javafx.fxml;//javafx.fxml;
    opens tests.testSandbox to javafx.graphics, javafx.fxml;//javafx.fxml;
    exports com.krieger.dungeon_crawler_fx;
    exports tests.testSandbox;
}
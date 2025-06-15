module com.krieger.dungeon_adventure {
        requires transitive javafx.graphics;

    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jdi;


    opens com.krieger.dungeon_adventure to javafx.graphics, javafx.fxml;//javafx.fxml;
    exports com.krieger.dungeon_adventure;
}
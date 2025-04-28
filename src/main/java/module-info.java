module com.krieger.dungeon_crawler_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.krieger.dungeon_crawler_fx to javafx.fxml;
    exports com.krieger.dungeon_crawler_fx;
}
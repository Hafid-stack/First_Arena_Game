module com.enset.first_arena_game {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.enset.first_arena_game to javafx.fxml;
    exports com.enset.first_arena_game;
}
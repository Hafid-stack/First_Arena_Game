package com.enset.first_arena_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        Group root = new Group();
        Region region = new Region();
        //WebView webView = new WebView();
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Arena Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
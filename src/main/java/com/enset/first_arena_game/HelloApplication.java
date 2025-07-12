package com.enset.first_arena_game;

import javafx.animation.AnimationTimer;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.scene.canvas.Canvas;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Creating a Pane that will hold the Canvas
        Pane root = new Pane();

        //Creating Canvas that hold the Components "make sure to import the right canvas"
        Canvas canvas = new Canvas(800,600);
        root.getChildren().add(canvas);
        //Passing the Pane to the scene
        Scene scene = new Scene(root,800,600);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {

            }
        };
        timer.start();

        //The next 3 lines are to test if an empty Window will appear
        stage.setScene(scene);
        stage.setTitle("Arena Game");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
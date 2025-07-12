package com.enset.first_arena_game;

import GameObjects.Player;
import javafx.animation.AnimationTimer;
import javafx.application.Application;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.scene.canvas.Canvas;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application {
   private Player player;

    @Override
    public void start(Stage stage) throws IOException {
        //Creating a Pane that will hold the Canvas
        Pane root = new Pane();
        Set<KeyCode> activeKeys = new HashSet<>(); // This set will hold all currently pressed keys

        //Creating Canvas that hold the Components "make sure to import the right canvas"
        Canvas canvas = new Canvas(800,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        //Passing the Pane to the scene
        player = new Player(20, 20, 50, 50);
        Scene scene = new Scene(root,800,600);
        //root.getChildren().add(Player);

        scene.setOnKeyPressed(event -> {
            activeKeys.add(event.getCode());
            System.out.println("testing if keypressed");

        });
        scene.setOnKeyReleased(event -> {
            activeKeys.remove(event.getCode());
            System.out.println("testing if keyreleased");
        });
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                // Clear the canvas for the next frame
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                // Update game objects (including player movement based on activeKeys)
                // Note: We're passing the activeKeys set to the player's update method
                player.update(activeKeys); // We're not using deltaTime yet, as per your preference

                // Render game objects
                player.render(gc); // Pass the GraphicsContext to the player to draw itself

                // You would typically update/render all other game objects here too
                // For example:
                // for (Enemy enemy : gameManager.getEnemies()) {
                //    enemy.update(deltaTime); // If you add deltaTime later
                //    enemy.render(gc);
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
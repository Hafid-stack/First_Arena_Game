package GameObjects;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.Set;

public class Player extends GameObjectPrint {
    private int health=100;
    private boolean dead=true;
    private int speed=10;
    Rectangle rectangle=new Rectangle();
    private Shape shape;
    @Override
    public void update(Set<KeyCode> activeKeys) { // Removed deltaTime as per your request
        // Check which keys are pressed and adjust player position
        if (activeKeys.contains(KeyCode.LEFT)) {
            setPosX(getPosX()-speed);// Move left
        }
        if (activeKeys.contains(KeyCode.RIGHT)) {
            setPosX(getPosX() + speed); // Move right
        }
        if (activeKeys.contains(KeyCode.UP)) {
            setPosY(getPosY() - speed); // Move up (Y-axis typically increases downwards in graphics)
        }
        if (activeKeys.contains(KeyCode.DOWN)) {
            setPosY(getPosY() + speed); // Move down
        }

        // Add boundary checks here later so player doesn't go off-screen
    }


    @Override
    public void render(GraphicsContext cg) {
rectangle.setX(200);
rectangle.setY(200);
rectangle.setHeight(20);
rectangle.setWidth(20);
rectangle.setFill(Color.WHITE);
    }

    @Override
    public void onCollision(GameObjectPrint otherObject) {
if (otherObject.getPosX()+5== getPosX()) {
    dead=false;
    //I will have this boolean getter in the animation time if its turn to false the game ends
}
    }

}

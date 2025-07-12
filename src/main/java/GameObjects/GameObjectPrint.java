package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;

import java.util.Set;


public abstract class GameObjectPrint {
private double posX, posY;
private double width, height;


    public GameObjectPrint() {
    }

    public GameObjectPrint(double height, double width, double posY, double posX) {
        this.height = height;
        this.width = width;
        this.posY = posY;
        this.posX = posX;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }




    public abstract void update(Set<KeyCode> activeKeys);

    public abstract void render(GraphicsContext cg);
    public abstract void onCollision(GameObjectPrint otherObject);
}

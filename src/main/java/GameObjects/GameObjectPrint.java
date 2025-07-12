package GameObjects;

import java.awt.*;

public abstract class GameObjectPrint {
private double posX, posY;
private double width, height;
private double movmentX, movmentY;

    public GameObjectPrint() {
    }

    public GameObjectPrint(double posX, double posY, double width, double height, double movmentX, double movmentY) {

        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.movmentX = movmentX;
        this.movmentY = movmentY;
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

    public double getMovmentX() {
        return movmentX;
    }

    public void setMovmentX(double movmentX) {
        this.movmentX = movmentX;
    }

    public double getMovmentY() {
        return movmentY;
    }

    public void setMovmentY(double movmentY) {
        this.movmentY = movmentY;
    }

    public abstract void upDate();
    public abstract void render();
    public abstract void onCollision(GameObjectPrint otherObject);
}

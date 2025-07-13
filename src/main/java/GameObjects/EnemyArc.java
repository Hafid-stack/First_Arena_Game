package GameObjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.util.Set;

public class EnemyArc extends GameObjectPrint{

    private boolean alive=true;

    @Override
    public void update(Set<KeyCode> activeKeys) {

    }

    @Override
    public void render(GraphicsContext cg) {
        cg.setFill(Color.BLACK);
        cg.fillOval(getPosX(), getPosY(), getWidth(), getHeight());
    }

    @Override
    public void onCollision(GameObjectPrint otherObject) {
        if (getPosX()+5== otherObject.getPosX() && getPosY()+5== otherObject.getPosY()) {
            alive = false;


        }
    }
    public void objectExecuted(GraphicsContext cg ) {
        if (isAlive()==false) {
            cg.fillOval(getPosX() * 0, getPosY() * 0, getWidth() * 0, getHeight() * 0);
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public EnemyArc() {
    }

    public EnemyArc(double height, double width, double posY, double posX) {
        super(height, width, posY, posX);
    }
}

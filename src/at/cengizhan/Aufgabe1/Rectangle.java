package at.cengizhan.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;
    private int direction;


    public Rectangle(int x, int y, float speed, boolean leftRight) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = leftRight ? 1 : -1;

    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y, 30, 10);
    }

    public void update(int delta){
        this.x += (float) delta / this.speed * direction;

        if (this.x > 800 - 30) {
            this.x = 800 - 30; // Sicherstellen, dass es nicht über den Rand geht
            direction = -1;
        }
        // Wenn der linke Rand erreicht wird, ändere die Richtung nach rechts
        else if (this.x < 0) {
            this.x = 0;
            direction = 1;
        }
    }
}

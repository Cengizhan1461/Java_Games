package at.cengizhan.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Ellipse  implements Actor {
    private float x,y;
    private float speed;
    private int direction;

    public Ellipse(int x, int y, boolean praller) {
        this.x = x;
        this.y = y;
        this.speed = 5;
        this.direction = praller ? 1 : -1;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y, 50,10);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed * direction;

        if (this.y > 600 - 30) {
            this.y = 600 - 30; // Sicherstellen, dass es nicht über den Rand geht
            direction = -1;
        }
        // Wenn der linke Rand erreicht wird, ändere die Richtung nach rechts
        else if (this.y < 0) {
            this.y = 0;
            direction = 1;
        }
    }
}

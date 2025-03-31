package at.cengizhan.games.firstgame;

import org.newdawn.slick.Graphics;

public class Rectangles {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;

    public Rectangles(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y, 90, 10);
    }

    public void update(int delta){
        this.x += (float) delta/this.speed;
        if(this.x > 1200 ){
            this.x = 0;
        }
    }
}

package at.cengizhan.Aufgabe1;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP}

    ;
    private float x, y;
    private float speed;
    private int size;
    private float growthRate;
    private static final int MAX_SIZE = 80;


    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(5) + 5;
        this.size = random.nextInt(20) + 20;
        this.size = random.nextInt(20) + 20;
        this.growthRate = 0.5f;
    }

    public void render(Graphics graphics) {
        graphics.drawOval((int) this.x, (int) this.y, this.size, this.size);
    }

    public void update(int delta) {
        this.y += (float) delta / this.speed;
        this.size += growthRate;

        this.size += growthRate * (delta / 16.0f);
        if (this.size > MAX_SIZE) {
            this.size = MAX_SIZE;
        }


        if (this.y > 600) {
            this.y = 0;
            this.size = new Random().nextInt(20) + 20;
        }
    }
}
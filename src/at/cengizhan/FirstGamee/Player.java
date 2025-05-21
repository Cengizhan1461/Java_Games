package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

public class Player implements Actor {
    private Image Mario;
    private float x, y;
    private float velocityY = 0;  // Vertikale Geschwindigkeit
    private boolean onGround = true;  // Ist Yoshi am Boden?
    private final float gravity = 0.001f;  // Schwerkraft
    private final float jumpStrength = -0.4f;  // Wie stark springt Yoshi

    public Player() throws SlickException {
        this.Mario = new Image("testdata/yoshi.png");
        this.x = 0;
        this.y = 400;  // Startposition leicht über dem Boden
    }

    @Override
    public void render(Graphics graphics) {
        Mario.draw(x, y, 100, 100);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Input input = gameContainer.getInput();

        // Links/rechts bewegen
        if (input.isKeyDown(Input.KEY_RIGHT)) x += 0.2f * delta;
        if (input.isKeyDown(Input.KEY_LEFT)) x -= 0.2f * delta;

        // Springen
        if (input.isKeyPressed(Input.KEY_UP) && onGround) {
            velocityY = jumpStrength;
            onGround = false;
        }

        // Schwerkraft anwenden
        velocityY += gravity * delta;
        y += velocityY * delta;

        // Boden-Kollision
        if (y >= 400) {
            y = 400;
            velocityY = 0;
            onGround = true;
        }

        // Bildschirmgrenzen
        if (x < 0) x = 0;
        if (x > 700) x = 700;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getWidth() { return 100; }
    public float getHeight() { return 100; }
}
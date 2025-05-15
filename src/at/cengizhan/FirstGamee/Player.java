package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

public class Player implements Actor {
    private Image yoshiImage;
    private float x, y;
    private float speed;

    private float velocityY = 0f; // vertikale Geschwindigkeit
    private final float gravity = 0.0015f; // Gravitation
    private final float jumpStrength = -0.5f;
    private final float groundY = 370f;

    public Player() throws SlickException {
        this.yoshiImage = new Image("testdata/yoshi.png");
        this.x = 10;
        this.y = groundY;
        this.speed = 0.3f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Input input = gameContainer.getInput();

        // Horizontale Bewegung
        if (input.isKeyDown(Input.KEY_RIGHT)) x += speed * delta;
        if (input.isKeyDown(Input.KEY_LEFT)) x -= speed * delta;

        // Springen nur wenn auf dem Boden
        if (input.isKeyPressed(Input.KEY_UP) && onGround()) {
            velocityY = jumpStrength;
        }

        // Gravitation anwenden
        velocityY += gravity * delta;
        y += velocityY * delta;

        // Unten auf dem Boden stoppen
        if (y >= groundY) {
            y = groundY;
            velocityY = 0;
        }
    }

    private boolean onGround() {
        return y >= groundY;
    }

    @Override
    public void render(Graphics graphics) {
        yoshiImage.draw(x, y, 150, 150);
    }
}

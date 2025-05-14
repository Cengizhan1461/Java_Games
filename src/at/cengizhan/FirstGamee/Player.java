package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

public class Player implements Actor {
    private Image Mario;
    private float x, y;
    private float speed;

    public Player() throws SlickException{
        this.Mario = new Image("testdata/");
        this.x = 160;
        this.y = 160;
    }

    @Override
    public void render(Graphics graphics) {
        Mario.draw(0,320);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }

        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y++;
        }
    }
}

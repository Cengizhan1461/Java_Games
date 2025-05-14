package at.cengizhan.List_Interfaces;


import org.newdawn.slick.*;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x,y;

    public Rocket() throws SlickException {
        this.rocketImage = new Image("testdata/Rocket.jpg");
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(100,100);
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

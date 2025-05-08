package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

import javax.swing.*;

public class Main extends BasicGame {

    private Player Mario;


    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        // Himmel
        graphics.setColor(new Color(135, 206, 235)); // Himmel
        graphics.fillRect(0, 0, 800, 600);


        // Boden
        graphics.setColor(new Color(34, 139, 34));
        graphics.fillRect(0, 500, 800, 100);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main(
                    "Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}


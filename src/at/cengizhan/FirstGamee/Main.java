package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    private List<Actor>actors;

    private Player Mario;


    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors=new ArrayList<>();
        Player mario = new Player();
        this.actors.add(mario);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : actors) {
            actor.update(gameContainer, delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {



        // Himmel
        graphics.setColor(new Color(135, 206, 235)); // Himmel
        graphics.fillRect(0, 0, 800, 600);


        // Boden
        graphics.setColor(new Color(34, 139, 34));
        graphics.fillRect(0, 500, 800, 100);

        for (Actor actor : actors) {
            actor.render(graphics);  // Actor rendern
        }

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


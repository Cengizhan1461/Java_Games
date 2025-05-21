package at.cengizhan.FirstGamee;

import org.newdawn.slick.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    private List<Actor> actors;
    private List<Hindernis> hindernis;

    private int spawnTimer = 0;
    private boolean gameOver = false;

    private Player Mario;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Player mario = new Player();
        this.actors.add(mario);

        hindernis = new ArrayList<>();
        hindernis.add(new Block(800, 450));
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (!gameOver) {
            for (Actor actor : actors) {
                actor.update(gameContainer, delta);
            }

            // Hindernisse updaten
            for (Hindernis ob : hindernis) {
                ob.update(gameContainer, delta);
            }

            // Alle 2 Sekunden neues Hindernis
            spawnTimer += delta;
            if (spawnTimer >= 2000) {
                hindernis.add(new Block(800, 450));
                spawnTimer = 0;
            }

            // Kollision prüfen
            Player player = (Player) actors.get(0);
            for (Hindernis ob : hindernis) {
                if (checkCollision(player, ob)) {
                    gameOver = true;
                    break;
                }
            }
        }

        // Neustart bei R
        if (gameOver && gameContainer.getInput().isKeyPressed(Input.KEY_R)) {
            restart();
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

        // Hindernisse rendern
        for (Hindernis ob : hindernis) {
            ob.render(graphics);
        }
        // Player rendern
        for (Actor actor : actors) {
            actor.render(graphics);
        }

        // Game Over Text
        if (gameOver) {
            graphics.setColor(Color.white);
            graphics.drawString("GAME OVER - Drücke R zum Neustarten", 250, 250);
        }


    }

    // Kollisionsprüfung Player Hindernis
    private boolean checkCollision(Player p, Hindernis ob) {
        return p.getX() < ob.getX() + ob.getWidth() &&
                p.getX() + p.getWidth() > ob.getX() &&
                p.getY() < ob.getY() + ob.getHeight() &&
                p.getY() + p.getHeight() > ob.getY();
    }

    // Spiel zurücksetzen
    private void restart() throws SlickException {
        this.actors.clear();
        this.hindernis.clear();
        this.spawnTimer = 0;
        this.gameOver = false;

        Player mario = new Player();
        this.actors.add(mario);
        this.hindernis.add(new Block(800, 450));
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


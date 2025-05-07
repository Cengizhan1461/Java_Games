package at.cengizhan.List_Interfaces;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGame extends BasicGame {
    private List<Actor>actors;



    public ObjectGame(String title) {
        super(title);

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors=new ArrayList<>();
        Random random = new Random();

        for (int i =0; i<100; i++){
            Rectangle rectangles1  = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(40));
            this.actors.add(rectangles1);
        }


        for (int i = 0; i < 50; i++){
            Circle circle = new Circle();
            this.actors.add(circle);
        }

        for (int i = 0; i < 50; i++){
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600));
            this.actors.add(ellipse);
        }

        Rocket rocket = new Rocket();
        this.actors.add(rocket);


    }


    @Override
    public void keyPressed(int key, char c) {
        super.keyPressed(key, c);
        System.out.println(key);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actors: this.actors){
            actors.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actors: this.actors){
            actors.render(graphics);
    }
}
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGame(
                    "Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

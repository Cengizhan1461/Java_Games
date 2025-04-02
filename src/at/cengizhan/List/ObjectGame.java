package at.cengizhan.List;

import at.cengizhan.games.firstgame.Analyse.ObjectsGame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGame extends BasicGame {
    private List<Rectangle>rectangles;
    private List<Circle> circles;


    public ObjectGame(String title) {
        super(title);

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles=new ArrayList<>();
        this.circles = new ArrayList<>();
        Random random = new Random();

        for (int i =0; i<100; i++){
            Rectangle rectangles1  = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(40));
            rectangles.add(rectangles1);
        }


        for (int i = 0; i < 50; i++){
            Circle circle = new Circle();
            this.circles.add(circle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangle rectangles: this.rectangles){
            rectangles.update(delta);
        }

        for (Circle circle: this.circles){
            circle.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangle rectangles: this.rectangles){
            rectangles.render(graphics);
    }
        for (Circle circle: this.circles){
            circle.render(graphics);
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

package at.cengizhan.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangles rectangle;
    private Rectangles rectangle2;
    private Rectangles rectangle3;


    public ObjectsGame(String title){
       super(title);
   }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangles(100, 100, 1);
        this.rectangle2 = new Rectangles(500, 500, 1);
        this.rectangle3 = new Rectangles(300, 300, 1);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

       this.rectangle.update(delta);
       this.rectangle2.update(delta);
        this.rectangle3.update(delta);
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
        this.rectangle3.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

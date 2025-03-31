package at.cengizhan.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangles rectangle;
    private Rectangles rectangle2;
    private Rectangles rectangle3;
    private Rectangles rectangle4;
    private Rectangles rectangle5;
    private Rectangles rectangle6;
    private Rectangles rectangle7;
    private Rectangles rectangle8;
    private Rectangles rectangle9;
    private Rectangles rectangle10;




    public ObjectsGame(String title){
       super(title);
   }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangles(100, 100, 0.3f);
        this.rectangle2 = new Rectangles(200, 200, 0.3f);
        this.rectangle3 = new Rectangles(300, 300, 0.3f);
        this.rectangle4 = new Rectangles(400, 400, 0.3f);
        this.rectangle5 = new Rectangles(500, 500, 0.3f);
        this.rectangle6 = new Rectangles(600, 100, 0.3f);
        this.rectangle7 = new Rectangles(700, 200, 0.3f);
        this.rectangle8 = new Rectangles(800, 300, 0.3f);
        this.rectangle9 = new Rectangles(900, 400, 0.3f);
        this.rectangle10 = new Rectangles(1000, 500, 0.3f);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

       this.rectangle.update(delta);
       this.rectangle2.update(delta);
       this.rectangle3.update(delta);
       this.rectangle4.update(delta);
       this.rectangle5.update(delta);
       this.rectangle6.update(delta);
       this.rectangle7.update(delta);
       this.rectangle8.update(delta);
       this.rectangle9.update(delta);
       this.rectangle10.update(delta);

    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        this.rectangle2.render(graphics);
        this.rectangle3.render(graphics);
        this.rectangle4.render(graphics);
        this.rectangle5.render(graphics);
        this.rectangle6.render(graphics);
        this.rectangle7.render(graphics);
        this.rectangle8.render(graphics);
        this.rectangle9.render(graphics);
        this.rectangle10.render(graphics);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Objects"));
            container.setDisplayMode(1200, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

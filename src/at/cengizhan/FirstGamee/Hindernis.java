package at.cengizhan.FirstGamee;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Hindernis {
    void render(Graphics g);
    void update(GameContainer gc, int delta) throws SlickException;

    float getX();
    float getY();
    float getWidth();
    float getHeight();
}

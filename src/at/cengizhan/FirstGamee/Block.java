package at.cengizhan.FirstGamee;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Color;

import org.newdawn.slick.Graphics;

public class Block implements Hindernis {
        private float x, y;
        private float width = 50;
        private float height = 50;
        private Color color = Color.darkGray;

        public Block(float startX, float startY) {
            this.x = startX;
            this.y = startY;
        }

        @Override
        public void render(Graphics g) {
            g.setColor(color);
            g.fillRect((int)x, (int)y, (int)width, (int)height);
        }

        @Override
        public void update(GameContainer gc, int delta) {
            // Beispiel: Block bewegt sich nach links
            x -= 0.3f * delta;
        }

        @Override
        public float getX() { return x; }

        @Override
        public float getY() { return y; }

        @Override
        public float getWidth() { return width; }

        @Override
        public float getHeight() { return height; }
    }

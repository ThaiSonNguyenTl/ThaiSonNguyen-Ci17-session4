package program;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {


    public Background() { // ham tao
        image = SpriteUtils.loadImage("assets/images/background/0.png");
        position.set(0, 600 - 3109);
        velocity.set(0,10);
    }

    public void render(Graphics g) {
        super.render(g);
    }

    public void run() {
        position.add(velocity.x,velocity.y);
        if(position.y >= 0) {
            position.setY(0);
        }
    }
}

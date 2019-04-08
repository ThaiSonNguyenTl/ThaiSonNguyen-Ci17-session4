package program.player;

import program.GameObject;
import program.Vector2D;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet extends GameObject {

    public PlayerBullet() {
        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        position = new Vector2D();
        velocity.set(0,-5);

    }

    public void render(Graphics g){
        super.render(g);
    }
    public void run(){
        super.run();
    }


}

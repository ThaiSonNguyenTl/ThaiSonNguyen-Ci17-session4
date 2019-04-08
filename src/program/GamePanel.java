package program;

import program.player.Player;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Background background;
    Player player; // image, x, y

    public GamePanel() {
        background = new Background();
        player = new Player(); // image, x, y
    }

    static Font font = new Font("Verdana",Font.ITALIC,40);
    @Override
    public void paint(Graphics g) { // tuong duong cai but ve de ve ra 1 cai j do o vitri nao do
        g.setColor(Color.RED);
        g.fillRect(0,0,800,600);

        g.setColor(Color.YELLOW);
        g.setFont(font);
        g.drawString("chao anh son",400,200);

        background.render(g);
        player.render(g); // draw playerImage
    }

    public void runAll() {
        background.run();
        player.run(); // player run
    }

    public void gameLoop() {
        long lastTime = 0;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= 1000 / 60) {
                this.repaint(); // render anh
                this.runAll(); // chay logic
                lastTime = currentTime;
            }
        }
    }
}

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame {

    GameCanvas gameCanvas;
    long lastTime = 0;

    public GameWindow() {
        this.setSize(1024, 600); // set size window


        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    gameCanvas.positionXPlayer -= 8;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    gameCanvas.positionXPlayer += 8;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });


        this.setVisible(true);
    }

    public void gameLoop() {
        while (true) {
            long currentTime = System.nanoTime();
            if (currentTime - this.lastTime >= 17_000_000) {
                this.gameCanvas.positionXStar -= 3;
                this.gameCanvas.positionYEnemy += 2;
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }


        }
    }

}

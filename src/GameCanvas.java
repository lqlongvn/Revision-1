import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {

    BufferedImage starImage;
    BufferedImage enemyImage;
    BufferedImage playerImage;
    BufferedImage backBuffered;
    Graphics graphics;

    public int positionXStar = 400;
    public int positionYStar = 300;

    public int positionXEnemy = 500;
    public int positionYEnemy = 0;

    public int positionXPlayer = 400;
    public int positionYPlayer = 200;

    public GameCanvas() {
        this.setSize(1024, 600);
        this.setupCharacter();
        this.setupBackBuffered();
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }

    private void setupCharacter(){
        this.starImage = loadImage("resources/images/star.png");
        this.enemyImage = loadImage("resources/images/circle.png");
        this.playerImage = loadImage("resources/images/circle.png");
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        this.rederBackground();
        this.graphics.drawImage(this.starImage, this.positionXStar, this.positionYStar, 5, 5, null);
        this.graphics.drawImage(this.enemyImage, this.positionXEnemy, this.positionYEnemy, 10, 10, null);
        this.graphics.drawImage(this.playerImage, this.positionXPlayer, this.positionYPlayer, null);
        this.repaint();
    }

    private void rederBackground(){
        this.graphics.setColor(Color.BLACK);
        this.graphics.fillRect(0, 0, 1024, 600);
    }

    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

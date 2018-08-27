import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {
    BufferedImage enemyImage;
    BufferedImage playerImage;
    BufferedImage backBuffered;
    Graphics graphics;
    Star star;

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
        this.enemyImage = loadImage("resources/images/circle.png");
        this.playerImage = loadImage("resources/images/circle.png");
        this.setupStar();
    }

    private void setupStar(){
        this.star = new Star(
                this.loadImage("resources/images/star.png"),
                1024,
                300,
                5,
                5,
                -3,
                0);

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        this.rederBackground();
        this.star.render(this.graphics);
        this.graphics.drawImage(this.enemyImage, this.positionXEnemy, this.positionYEnemy, 10, 10, null);
        this.graphics.drawImage(this.playerImage, this.positionXPlayer, this.positionYPlayer, null);
        this.repaint();
    }

    private void rederBackground(){
        this.graphics.setColor(Color.BLACK);
        this.graphics.fillRect(0, 0, 1024, 600);
    }

    public void runAll(){
        this.star.run();
        this.positionYEnemy += 2;
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

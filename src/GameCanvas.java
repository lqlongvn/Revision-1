import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCanvas extends JPanel {
    BufferedImage backBuffered;
    Graphics graphics;

    List<Star> stars;

    private Background background = new Background(0,0,1026,600,Color.BLACK);
    public Player player1 = new Player ();
    private Random random1 = new Random();
    private Random randomVelocityX = new Random();
    private Random randomVelocityY = new Random();
    private Enemy enemy1;
    private int countStar = 0;

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

    private void setupCharacter() {
        this.player1.image = loadImage("resources/images/circle.png");
        this.setupStar();
    }

    private void setupStar() {
        this.stars = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        background.render(graphics);
        this.stars.forEach(star -> star.render(graphics));
        this.enemy1.render(this.graphics);
        this.player1.render(this.graphics);
        this.repaint();
    }


    public void runAll() {
        this.createStar();
        this.stars.forEach(star -> star.run());
        createEnemy();
        this.enemy1.run();
    }

    private void createStar() {
        if (this.countStar == 30) {
            Star star = new Star(
                    this.loadImage("resources/images/star.png"),
                    1024,
                    this.random1.nextInt(600),
                    5,
                    5,
                    -(this.random1.nextInt(3) + 1),
                    0
            );
            this.stars.add(star);
            this.countStar = 0;
        } else {
            this.countStar += 1;
        }
    }

    private void createEnemy(){
        enemy1 = new Enemy(
                loadImage("resources/images/circle.png"),
                this.random1.nextInt(1024-15),
                10,
                15,
                15,
                this.randomVelocityX.nextInt(4)+1,
                this.randomVelocityY.nextInt(4)
        );

    }

    public BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

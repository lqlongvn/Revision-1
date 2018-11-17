import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy {
    public BufferedImage image;
    public int x;
    public int y;
    public int velocityX, velocityY;
    public int width;
    public int height;
    private Random random1 = new Random();


    public Enemy () {
        this.x = this.random1.nextInt(600);
        this.y = 10;
        this.velocityX = 2;
        this.velocityY = 3;
        this.width = 15;
        this.height = 15;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

    public void run() {
        this.x += this.velocityX;
        this.y += this.velocityY;
    }

}

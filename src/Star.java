import java.awt.*;
import java.awt.image.BufferedImage;

public class Star {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;
    public int veloityX;
    public int velocityY;

    public Star(BufferedImage image, int x, int y, int width, int height, int veloityX, int velocityY) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.veloityX = veloityX;
        this.velocityY = velocityY;
    }


    public void run() {
        this.x += this.veloityX;
        this.y += this.velocityY;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

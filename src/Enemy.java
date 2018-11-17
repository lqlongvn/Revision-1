import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;

    public Enemy () {
        this.x = 300;
        this.y = 10;
        this.width = 15;
        this.height = 15;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

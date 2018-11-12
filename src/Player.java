import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;


    public Player () {
        this.image = loadImage("resources/images/circle.png");
        this.x = 400;
        this.y = 200;
        this.width = 5;
        this.height = 5;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

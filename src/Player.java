import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;


    public Player (BufferedImage image, int x, int y, int width, int height){
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

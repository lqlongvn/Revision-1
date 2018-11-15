import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    public BufferedImage image;
    public int x;
    public int y;
    public int width;
    public int height;


    public Player () {
//        this.image = GameCanvas.loadImage("resources/images/circle.png");
        this.x = 200;
        this.y = 100;
        this.width = 20;
        this.height = 20;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

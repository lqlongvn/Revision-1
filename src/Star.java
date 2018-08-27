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

    public Star(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Star(){

    }


    public void run() {
        this.x += this.veloityX;
        this.y += this.velocityY;
    }

    public void render(Graphics graphics) {
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

}

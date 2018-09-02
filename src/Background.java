import java.awt.*;

public class Background {
    public int x;
    public int y;
    public int width;
    public int height;

    public void render(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 1024, 600);
    }

}

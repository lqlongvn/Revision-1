import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {

    BufferedImage starImage;

    public GameCanvas(){
        this.setSize(1024,600);
        this.setVisible(true);

//        Load image
        try {
            this.starImage = ImageIO.read(new File("resources/images/star.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//        End of Load image

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0,1024,600);
        g.drawImage(this.starImage,100,300,null);
    }
}

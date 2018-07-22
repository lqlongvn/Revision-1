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

//        Load image
        try {
            this.starImage = ImageIO.read(new File("resources/images/nose.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        End of Load image
        this.setVisible(true);
    }


    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(0,0,1024,600);
        g.drawImage(this.starImage,512-150,0,300,300,null);
    }
}

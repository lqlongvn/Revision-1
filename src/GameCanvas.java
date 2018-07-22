import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameCanvas extends JPanel {

    BufferedImage starImage;
    public int positionXStar = 400;
    public int positionYStar = 300;

    public GameCanvas(){
        this.setSize(1024,600);

//        Load image
        try {
            this.starImage = ImageIO.read(new File("resources/images/star.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        End of Load image
        this.setVisible(true);
    }


    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0,0,1024,600);
        g.drawImage(this.starImage,this.positionXStar,this.positionYStar,5,5,null);
    }
}

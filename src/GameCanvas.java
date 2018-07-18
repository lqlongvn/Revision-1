import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

    public GameCanvas(){
        this.setSize(1024,600);
        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
        g.setColor(Color.cyan;
        g.fillRect(0,0,40,50);
    }
}

import javax.swing.*;

public class GameWindow extends JFrame {

    GameCanvas gameCanvas;

    public GameWindow(){
        this.setSize(1024,600);
        this.setVisible(true);
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
    }
}

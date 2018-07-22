import javax.swing.*;

public class GameWindow extends JFrame {

    GameCanvas gameCanvas;

    public GameWindow(){
        this.setSize(1024,600);
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
        this.setVisible(true);
    }

    public void gameLoop (){
        while (true){
            this.gameCanvas.positionXStar -= 3;
        }
    }
}

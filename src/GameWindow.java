import javax.swing.*;

public class GameWindow extends JFrame {

    GameCanvas gameCanvas;
    long lastTime = 0;

    public GameWindow(){
        this.setSize(1024,600);
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
        this.setVisible(true);
    }

    public void gameLoop (){
        while (true){
            long currentTime = System.nanoTime();
            if (currentTime - this.lastTime >= 17_000_000){
                this.gameCanvas.positionXStar -= 3;
                this.gameCanvas.repaint();
                this.lastTime = currentTime;

            }


        }
    }
}

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        // this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}

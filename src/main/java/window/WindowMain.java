package window;

import javax.swing.*;

public class WindowMain extends JFrame {
    public WindowMain() {
        this.setTitle("Amazeing Generator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1380, 820);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.add(new MazeGraphicsPanel());
    }
}

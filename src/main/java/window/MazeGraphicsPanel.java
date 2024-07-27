package window;

import javax.swing.*;
import java.awt.*;

public class MazeGraphicsPanel extends JPanel{
    final int meshSpace = 40;
    final int screenH = 720;
    final int screenW = 1280;

    MazeGraphicsPanel(){
        setBackground(Color.BLACK);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        paintGrid(g, "#505050");

        createRoom(g, "#ff0000", 0, 2);
    }
    public void paintGrid(Graphics g, String color){
        g.setColor(Color.decode(color));
        for(int i = 0; i*meshSpace < screenW; i++){
            g.drawLine(i* meshSpace, 0, i* meshSpace, screenH); //X line
            if(i*meshSpace < screenH){
                g.drawLine(0, i* meshSpace, screenW, i* meshSpace); //Y line
            }
        }

        g.drawRect(0, 0, screenW, screenH);
    }
    public void createRoom(Graphics g, String color, int X, int Y){
        g.setColor(Color.decode(color));
        g.drawRect(X*meshSpace, Y*meshSpace, meshSpace, meshSpace);
        g.fillRect(X*meshSpace, Y*meshSpace, meshSpace, meshSpace);
    }
}

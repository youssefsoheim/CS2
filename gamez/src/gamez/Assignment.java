package gamez;

import javax.swing.*;
import java.awt.*;

public class Assignment extends JComponent {
    private boolean up;
    private int x, y, y1, y2;
    private Image ass;

    public Assignment(int X, int Y, int Y1, int Y2) {
        ass = new ImageIcon("a.png").getImage();
        up = true;
        x = X;
        y = Y;
        y1 = Y1;
        y2 = Y2;
    }

    public void paintComponent(Graphics g) {
        g.drawImage(ass, x, y, null);
    }

    public int getXP() {
        return x;
    }

    public int getYP() {
        return y;
    }

    public void moveAss() {
        if(up) {
            if(y != y1) {
                y--;
            }
            else {
                up = false;
            }
        }
        else {
            if(y != y2) {
                y++;
            }
            else {
                up = true;
            }
        }

    }
}


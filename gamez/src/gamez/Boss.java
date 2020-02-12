package gamez;

import javax.swing.*;
import java.awt.*;

public class Boss extends JComponent {
    private Image bo;
    private int x, y;

    public Boss(int X, int Y) {
        x = X;
        y = Y;
        bo =  new ImageIcon("b.png").getImage();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(bo, x, y, null);
    }
}

package gamez;

import javax.swing.*;
import java.awt.*;

public class BG extends JComponent {
    private Image bg;

    public BG() {
        bg = new ImageIcon("bg.png").getImage();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(bg,0,0,null);
    }
}


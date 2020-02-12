package gamez;
import javax.swing.*;
import java.awt.*;


// Made by Karim ElBowety & Youssef Soheim
// Consent was taken to use Hamdy's face

public class Starter {
    public static void main(String[] args) {
        JPanel panel = new Game();
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(450,750);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("hr.png"));
        frame.setTitle("Hamdy Kong");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

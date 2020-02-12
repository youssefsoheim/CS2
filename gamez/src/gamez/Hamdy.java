package gamez;

import javax.swing.*;
import java.awt.*;

public class Hamdy extends JComponent{
    private int x, y;
    private boolean life, right;
    private Image ham;

    public Hamdy(int X, int Y) {
        ham = new ImageIcon("hr.png").getImage();
        x = X;
        y = Y;
        life = true;
        right = true;
    }

    public void paintComponent(Graphics g) {
        g.drawImage(ham,x,y,null);
    }

    public void moveHamdy(int X, int Y) {
        x += X;
        y += Y;
    }

    public boolean checkLadder() {
        if(y>500 && x>330) { return true;}
        else if(y<510 && y>385 && x<30) { return true; }
        else if(y<400 && y>270 && x>310) { return true; }
        else if(y<290 && y>155 && x<110) { return true; }
        else if(y<180 && y>40 && x>380) { return true; }
        else { return false; }
    }

    public boolean checkWin() {
        if(y<45 && x<50) {
            return true;
        }
        else return false;
    }

    public boolean checkSecretWin() {
        if(y<45 && x>450) {
            return true;
        }
        return false;
    }

    public void setHam() {
        if(right) {
            ham = new ImageIcon("hr.png").getImage();
        }
        else {
            ham = new ImageIcon("hl.png").getImage();
        }
    }

    public Image getHam() {
        return ham;
    }

    public void setDead() {
        life = false;
    }

    public void setRight(boolean x) {
        right = x;
    }

    public boolean getRight() {
        return right;
    }

    public int getXP() {
        return x;
    }

    public int getYP() {
        return y;
    }

    public boolean getLife() {
        return life;
    }

}


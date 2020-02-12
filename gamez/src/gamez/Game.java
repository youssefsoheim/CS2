package gamez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel {
    private Hamdy hamdy;
    private Assignment a1, a2, a3;
    private Boss boss;
    private BG bg;
    private int speed;

    public Game() {
        speed = 10;
        setSize(450,750);
        hamdy = new Hamdy(0,650);
        a1 = new Assignment(150, 690, 580, 690);
        a2 = new Assignment(150, 425, 350, 425);
        a3 = new Assignment(150, 80, 0, 80);
        boss = new Boss(0,20);
        bg = new BG();
        add(bg);
        add(hamdy);
        add(a1);
        add(a2);
        add(a3);
        add(boss);
        setFocusable(true);
        requestFocusInWindow();
        KeyListener controls = new Controls();
        addKeyListener(controls);
        ActionListener time = new TimeListener();
        Timer t = new Timer(33, time);
        t.start();
    }

    public boolean checkCollision(Assignment a) {
        if(((hamdy.getXP()+50)>a.getXP() && hamdy.getXP()<(a.getXP()+85)) && ((a.getYP()+18)>hamdy.getYP() && a.getYP()<hamdy.getYP()+60)) {
            return true;
        }
        return false;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        bg.paint(g);
        drawLevel(g);
        a1.paint(g);
        a2.paint(g);
        a3.paint(g);
        boss.paint(g);
        hamdy.paint(g);
    }

    public void drawLevel(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 100, 450, 20);
        g.fillRect(0, 215, 450, 20);
        g.fillRect(0, 330, 450, 20);
        g.fillRect(0, 445, 450, 20);
        g.fillRect(0, 560, 450, 20);
        g.setColor(Color.RED);
        g.fillRect(350, 560, 15, 150);
        g.fillRect(50, 445, 15, 115);
        g.fillRect(325, 330, 15, 115);
        g.fillRect(130, 215, 15, 115);
        g.fillRect(400, 100, 15, 115);
    }

    class Controls implements KeyListener {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==39) {
                if(hamdy.checkWin()) {
                    JOptionPane.showMessageDialog(null,"Congrats, you won against the evil assignments!");
                    System.exit(0);
                }
                if(hamdy.checkSecretWin()) {
                    JOptionPane.showMessageDialog(null,"You ran away from the assignments alright :) !");
                    System.exit(0);
                }
                if(!hamdy.checkLadder()) {
                    hamdy.moveHamdy(speed, 0);
                    hamdy.setRight(true);
                    hamdy.setHam();
                    repaint();
                }
            }
            else if(e.getKeyCode()==37) {
                if(hamdy.checkWin()) {
                    JOptionPane.showMessageDialog(null,"Congrats, you won against the evil assignments!");
                    System.exit(0);
                }
                if(hamdy.checkSecretWin()) {
                    JOptionPane.showMessageDialog(null,"You ran away from the assignments alright :) !");
                    System.exit(0);
                }
                if(!hamdy.checkLadder()) {
                    hamdy.moveHamdy(-speed, 0);
                    hamdy.setRight(false);
                    hamdy.setHam();
                    repaint();
                }
            }
            else if(e.getKeyCode()==38) {
                if(hamdy.checkLadder()) {
                    hamdy.moveHamdy(0,-speed/2);
                    repaint();
                }
            }
            else if(e.getKeyCode()==40) {
                if(hamdy.checkLadder()) {
                    hamdy.moveHamdy(0,speed/2);
                    repaint();
                }
            }
        }
        public void keyReleased(KeyEvent e) {
            hamdy.moveHamdy(0,0);
        }
        public void keyTyped(KeyEvent e) {}
    }

    class TimeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a1.moveAss();
            a2.moveAss();
            a3.moveAss();
            if(checkCollision(a1)) {
                JOptionPane.showMessageDialog(null,"You Lose...");
                System.exit(0);
            }
            if(checkCollision(a2)) {
                JOptionPane.showMessageDialog(null,"You Lose...");
                System.exit(0);
            }
            if(checkCollision(a3)) {
                JOptionPane.showMessageDialog(null,"You Lose...");
                System.exit(0);
            }
            repaint();
        }
    }
}
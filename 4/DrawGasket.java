
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Point;


public class DrawGasket extends JFrame implements ChangeListener{
    private int level;
    public DrawGasket()
    {
        setTitle("Sierpinski Gasket");
        comps();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
    }

    private void comps()
    {
        setLayout(new BorderLayout());
        JSlider slide = new JSlider(JSlider.HORIZONTAL, 0, 7, 0);
        slide.addChangeListener(this);
        slide.setMajorTickSpacing(1);
        slide.setPaintLabels(true);
        slide.setPaintTicks(true);
        add(slide, BorderLayout.SOUTH);
    }

  
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        

        Point p1 = new Point(getWidth()/2, 30);
        Point p2 = new Point(10, getHeight() - 80);
        Point p3 = new Point(getWidth()-10, getHeight()- 80);
        drawGasket(g, level, p1, p2, p3);
    }
    
 @Override
    public void stateChanged(ChangeEvent e) {
        JSlider slider = (JSlider)e.getSource();
        level = slider.getValue();
        repaint();
    }

    private void drawGasket(Graphics g, int l, Point point1, Point point2, Point point3)
    {
        Graphics2D g2D = (Graphics2D)g;

        if(l > 0)
        {

            Point p4 = new Point((point1.x+point2.x)/2, (point1.y+point2.y)/2);
            Point p5 = new Point((point2.x+point3.x)/2, (point2.y+point3.y)/2);
            Point p6 = new Point((point3.x+point1.x)/2, (point3.y+point1.y)/2);


            
            drawGasket(g2D, l-1, point1, p4, p6);
            drawGasket(g2D, l-1, p4, point2, p5);
            drawGasket(g2D, l-1, p6, p5, point3);
        }
        g.setColor(Color.blue);
        g.drawLine(point1.x, point1.y, point2.x, point2.y);
        g.drawLine(point2.x, point2.y, point3.x, point3.y);
        g.drawLine(point3.x, point3.y, point1.x, point1.y);

    }
}
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Robot extends JComponent {

	
	protected int Rsize;
	protected Color c;
	protected int x_pos, y_pos, width,height;
	
	
	
	
	public Robot(int rsize,Color c, int x_pos, int y_pos) {
		super();
		Rsize = rsize;
		this.c = c;
		this.x_pos = x_pos;
		this.y_pos = y_pos;
		
	}

	
	public void paint(Graphics g) {
		draw(g,Rsize,c,x_pos,y_pos);
		draw(g,3,Color.green,40,50);
		draw(g,7,Color.blue, 150,175);
		draw(g,10,Color.orange,400,300);
		
	}
	
	
	
	public void draw(Graphics g, int Rsize,Color c, int x_pos, int y_pos) {
		 
		g.setColor(Color.black);
		g.fillOval(x_pos+(8*Rsize), y_pos+(19*Rsize), 18*Rsize, 18*Rsize); //tire
		g.setColor(c);
		g.fillRect(x_pos, y_pos, 4*Rsize, 2*Rsize); // L.H
		g.fillRect(x_pos+(30*Rsize), y_pos+(20*Rsize), 4*Rsize, 2*Rsize); // R.H
		g.fillRect(x_pos+(1*Rsize), y_pos+(2*Rsize), 2*Rsize, 8*Rsize); //L.F
		g.fillRect(x_pos+(31*Rsize), y_pos+(12*Rsize), 2*Rsize, 8*Rsize);//R.F
		g.fillRect(x_pos+(6*Rsize), y_pos+(8*Rsize), 22*Rsize, 20*Rsize);//Body
		g.fillRect(x_pos+(16*Rsize), y_pos+(5*Rsize), 2*Rsize, 3*Rsize); // Neck
		g.fillRect(x_pos+(8*Rsize), y_pos-(1*Rsize), 18*Rsize, 8*Rsize);// Head
		g.fillRect(x_pos+(1*Rsize), y_pos+(10*Rsize), 32*Rsize, 2*Rsize);// Shoulder
		g.setColor(Color.yellow);
		g.fillOval(x_pos+(9*Rsize), y_pos-(0*Rsize), 7*Rsize, 6*Rsize); // R.E
		g.fillOval(x_pos+(18*Rsize), y_pos-(0*Rsize), 7*Rsize, 6*Rsize);//L.E
		
		repaint();
	}
	
	

		
		
		
		
	
	
	
	
	
	
	
}

import java.awt.Color;

import javax.swing.JFrame;

public class draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Robot");
		frame.add(new Robot(1,Color.red,3,5));
		frame.setVisible(true);
		
	}

}

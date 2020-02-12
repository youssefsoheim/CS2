import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class DrawingPanel extends JComponent {

	@Override
	public void paint(Graphics g) {
		
		DrawingPanel(g, 0, getWidth(), getHeight() / 2);
	}
	private void DrawingPanel(Graphics g, int s, int w, int h) {
		if (h < 2)
			return;
		int mid = (s + w) / 2;
		g.setColor(Color.BLACK);
		g.drawLine(mid, 0, mid, h);
		DrawingPanel(g, s, mid - 1, h / 2);
		DrawingPanel(g, mid + 1, w, h / 2);
	}


	
	
}

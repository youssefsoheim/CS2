import javax.swing.JFrame;

public class RulerFrame extends JFrame {
	DrawingPanel test;

	public RulerFrame() {
		setSize(300, 250);
		test = new DrawingPanel();
		add(test);
		setVisible(true);
	}
}

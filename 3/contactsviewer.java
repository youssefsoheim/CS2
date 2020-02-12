import javax.swing.JFrame;

public class contactsviewer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		
		JFrame frame = new contactFrame(new contactlist("contacts.txt"));
		frame.setTitle("Contacts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}

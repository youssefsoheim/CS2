import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class contactFrame extends JFrame{

	 private JTextField searchTextField;
	 private JLabel searchL, nameL, numberL, emailL;
	 private JButton prev, next;
	 private JTextArea textArea;
	 private int c;
	 contactlist lists;
	 
	 
	 
	 public  contactFrame(contactlist r) throws Exception {
		 
		 c = 0;
		 setSize(300,200);
		 lists = r;
		 createComponents(r);
		
	 }
	 
	 
	 private void createComponents(contactlist s) 
	    {
		 JPanel cPanel = new JPanel();
		 searchL = new JLabel("Contact");
		 searchTextField = new JTextField(10);
		 nameL = new JLabel(s.getcont(c).getFirstName()+" "+s.getcont(c).getLastName());
		 numberL = new JLabel(s.getcont(c).getNumber());
		 emailL = new JLabel(s.getcont(c).getEmail());
	        cPanel.add(searchL);
	        cPanel.add(searchTextField);
	        cPanel.add(nameL);
	        cPanel.add(numberL);
	        cPanel.add(emailL);
	        
	       
	        searchTextField.addActionListener(new searchlistener());
	        
	        
	        next = new JButton("Next");
	        cPanel.add(next);
	        next.addActionListener(new ButtonListener());
	        
	        prev = new JButton("Prev");
	        cPanel.add(prev);
	        prev.addActionListener(new ButtonListener());

	        textArea = new JTextArea();
	        cPanel.add(textArea);

	        cPanel.setLayout (new BoxLayout (cPanel, BoxLayout.Y_AXIS));
	        add(cPanel);
	    }
	 protected class searchlistener implements ActionListener
	    {
	        @Override
	        public void actionPerformed(ActionEvent e)
	        {
	            String searchString = searchTextField.getText();

	          
	                contact contactsSearch = lists.search(searchString);

	                if(contactsSearch != null)
	                {
	               
	                        nameL.setText(contactsSearch.getFirstName() + " " + contactsSearch.getLastName());
	                        numberL.setText(contactsSearch.getNumber());
	                        emailL.setText(contactsSearch.getEmail());
	                    }
	          c = lists.contindex(contactsSearch.getLastName());      
	            }
	        
	        }
	 private class ButtonListener implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			
			 if (e.getSource()==next) {
				c++; 
				
				contact contactsSearch = lists.getcont(c);
				nameL.setText(contactsSearch.getFirstName() + " " + contactsSearch.getLastName());
                numberL.setText(contactsSearch.getNumber());
                emailL.setText(contactsSearch.getEmail());
			 }
			 else if (e.getSource()==prev) {
				 c--;
				 contact contactsSearch = lists.getcont(c);
					nameL.setText(contactsSearch.getFirstName() + " " + contactsSearch.getLastName());
	                numberL.setText(contactsSearch.getNumber());
	                emailL.setText(contactsSearch.getEmail());
			 }
		 }
	 }

	    }



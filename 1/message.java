

public class message {

	
	private String sender;
	private String recipient;
	private String text;
	
	
		
	
	
	
	public message(String sender, String recipient) {
		super();
		this.recipient = recipient;
		this.sender = sender;
		this.text ="";
	}
	
	
	public String toString() {
		 return "From: " + sender + "%n" + "To: "+ recipient + "%n" + "Text: "+ text;
	}
	
	
	
	public void append(String T) {
		
	 text = text + T;
	}
	
	
}

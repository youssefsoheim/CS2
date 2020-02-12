import java.util.ArrayList;


public final class mailbox {
ArrayList<message>body = new ArrayList<message>();
	

	
	public void addMessage(message m) {
		
		body.add(m);
		}
		
	
	
	public message getMessage(int i) {
			return body.get(i);
			
		}
		
	public void removeMessage(int i) {
		body.remove(i);
	}
	
	public ArrayList<message> listMessages(){
		return body;
	}
	
	
	
	
	
	
	
	
	

}

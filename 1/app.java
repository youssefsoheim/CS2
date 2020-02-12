import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		mailbox mail = new mailbox();
		boolean isRunning = true;
	while (isRunning) {

		System.out.println("To enter new message press 'N'"+"\n"+"To delete message press 'D'"+"\n" +"To view messages press 'V"+"\n"+"To list all messages press'L"+"\n"+"To quit program press any other button");
		String act= sc.next().toUpperCase(); 
		if(act.contentEquals("N")){
			System.out.println("please enter name of Sender");
			String S = sc.next();
			System.out.println("please enter name of Recipient");
			String R = sc.next();
			message mess = new message(S, R);
			
			System.out.println("please enter message");
			String T = sc.next();
			mess.append(T);
			
			mail.addMessage(mess);
					
			}
		else if (act.contentEquals("D")){
			System.out.println("please enter index of message that you wish to delete");
			int g = sc.nextInt();
			mail.removeMessage(g);
		
		}
		else if (act.contentEquals("V")) {
			System.out.println("please enter index of message that you wish to view");
			int g = sc.nextInt();
			System.out.println(mail.getMessage(g));
			
		}
		else if (act.contentEquals("L")) {
			for (message menu : mail.listMessages()) {
				System.out.println(menu);
				
			} 
			
			
			}
		else if(act.contentEquals("Q")) {
				System.out.println("goodbye"); 
				isRunning = false;
		}

	}		
	}

}

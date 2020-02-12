import java.util.ArrayList;

public class ballTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ball test = new ball();
		ball test2 = new ball(3.4,"Black");
		
		System.out.println(ball.Counter);
		
		
		System.out.println(test2);
		
		
		
		System.out.println(test2.compareTo(test));
		
		
		System.out.println(test2.equals(test));
		
		System.out.println(test2.circumference());
		
		System.out.println(test2.SArea());
		
		System.out.println(test2.volume());
		
		
		
	}

}

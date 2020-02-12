import java.util.Scanner;

public class MainDec extends Dec2Bin{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("please enter decimal");
		int inp = sc.nextInt();
	
		System.out.println("binary is " + Dec2Bin.dec2bin(inp) );
	}

}

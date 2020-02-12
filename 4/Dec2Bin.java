
public class Dec2Bin {

	
	public static String dec2bin(int n ) {
		if (n<2) {
			return n + "";
		}
		else {
			return (dec2bin(n/2)+n%2);
		}
	}
}

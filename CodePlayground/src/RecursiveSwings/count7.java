package RecursiveSwings;


/**
 * This code uses a recursive method to count the number of 7's in a number.
 * @author Mayuri
 *
 */
public class count7 {
	public static int count = 0;

	public static int count7(int n) {

		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return count;
		}

		if (n % 10 == 7) {
			count += 1;
		}

		count7(n / 10);

		return count;
	}
	
	public static int countX (int x, int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return count;
		}
		
		if(n % 10 == x) {
			count+= 1;
		}
		
		countX(x, n / 10);
		
		return count;
	}

	public static void main(String[] args) {

		int countX = countX(5, 55565);
		
		System.out.println(countX);

	}

}

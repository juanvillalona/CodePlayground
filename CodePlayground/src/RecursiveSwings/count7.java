package RecursiveSwings;


/**
 * This code uses a recursive method to count the number of 7's in a number, or count the number of occurrences of an x integer within a number.
 * @author Mayuri
 *
 */
public class count7 {
	public static int count = 0;

	/**
	 * Counts number of times 7 occurs within a number
	 * @param n: string of numbers we are checking
	 * @return: number of occurrences
	 */
	public static int count7(int n) {

		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return count;
		}

		if (n % 10 == 7) { // (%10) gives us the rightmost digit within a string of numbers
			count += 1;
		}

		count7(n / 10); // (/10) removes the rightmost digit within a string of numbers

		return count;
	}
	
	/**
	 * Counts number of occurrences of a single digit number within a string of numbers
	 * @param x: number we are checking for
	 * @param n: number we are checking
	 * @return: number of X occurrences
	 */
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

}

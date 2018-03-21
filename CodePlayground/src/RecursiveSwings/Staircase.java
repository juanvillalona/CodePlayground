package RecursiveSwings;

/**
 * This code uses the recursive technique called, Memoization, which speeds up the time that the code spends on doing
 * recursive calculations by storying redundant recursive calls into a cache array called 'memo'.
 * 		This code is used to count the number of combinations a child could go up N number of stairs, if he went up by either 1, 2, or 3 stairs at a time.
 * @author Juan Villalona
 *
 */
public class Staircase {
	
	/**
	 * Method is called from the main method and is used as a wrapper function
	 * @param steps passed in from main method
	 * @return call to countStairs which takes in an int and an array
	 */
	public static int countStairs(int steps) {
		 return countStairs(steps, new int [steps + 1]); // we add 1 to the array length because if we don't then there's a possibility 
		 													//that we fall out of bounds
	}
	
	
	/**
	 * Recursive method that uses Memoization to calculate the number of combinations that can be used to go up N number of stairs.
	 * @param steps: passed in from wrapper function
	 * @param memo: our cache array which we use to speed up the time in which the code takes to calculate redundant recursive calls.
	 * @return: number of combinations 
	 */
	public static int countStairs(int steps, int[] memo) {
		if(steps < 0) { //return 0 if we get a negative value for steps, or we run out of steps for our recursion
			return 0;
		}
		if(steps == 0) { //if steps are 0, then we are at the top of the stairs
			return 1;
		}
		
		if(memo[steps] == 0) { // checks to see if our cache has a value, if not then we go into the recursive call to set a value
			memo[steps] = countStairs(steps - 1, memo) + countStairs(steps - 2, memo) + countStairs(steps - 3, memo);
		}
		
		
		return memo[steps]; //accesses cached values and throws them back to recursive call
	
	}

}

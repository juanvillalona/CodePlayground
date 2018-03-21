package RecursiveSwings;

/**
 * A child is 
 * @author Juan Villalona
 *
 */
public class Staircase {
	
	
	public static int countStairs(int steps) {
		 return countStairs(steps, new int [steps + 1]);
	}
	
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
	
	public static void main(String[] args) {
		int count = countStairs(50);
		
		System.out.println(count);
		
		return;
	}

}

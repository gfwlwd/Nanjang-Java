public class Factorial1to10 {
	public static void main(String[] args) {
		/* The factorial of 1 is 1
		 * The factorial of 2 is 2
		 * ...
		 * The factorial of 10 is 3628800
		 * */
		createFactural(10);
	}
	public static void createFactural(int n) {

		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			System.out.println("The Factorial of " + i + " is " + factorial);
		}
	}
}

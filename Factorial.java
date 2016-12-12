public class Factorial {
	// Print factorial of n
	public static void main(String[] args) {  
		createFactorial(17);
		//becomes negative number as int when n = 17
		System.out.println(factorial(5));
		System.out.println(factorialShort(16));
	}
	public static void createFactorial(int n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}
	// Return the factorial of the given integer, recursively
	public static int factorial(int n) {
		if (n == 0) {
			return 1;   // base case
		} else {
			return n * factorial(n-1);  // call itself	
		}
	}

	public static int factorialShort(int n) {
		return (n == 0) ? 1 : n*factorialShort(n-1);
	}
}

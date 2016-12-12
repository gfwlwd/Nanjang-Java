
public class FactorialLong {

	public static void main(String[] args) {
		createFactural();
	}
	public static void createFactural() {
		long max = Long.MAX_VALUE;
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int n = 1; ; n++) {
			factorial = factorial * n;
			
			if (max / factorial < n+1 ) { // for F(n+1) if (Integer.MAX_VALUE / Factorial(n)) < (n+1)
				System.out.println("The Factorial of " + n + " is out of range. ");
				System.out.println();
				System.out.println("The max of long is: "+ max);
				break;
			} else {
				System.out.println("The Factorial of " + n + " is " + factorial);
			}
		}
	}
}

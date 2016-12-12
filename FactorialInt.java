
public class FactorialInt {

	public static void main(String[] args) {
		createFactural();
	}
	public static void createFactural() {
		int max = Integer.MAX_VALUE;
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; ; i++) {
			factorial = factorial * i;
			
			if (factorial > max ) { // for F(n+1) if (Integer.MAX_VALUE / Factorial(n)) < (n+1)
				System.out.println("The Factorial of " + i + " is out of range. ");
				break;
			} else {
				System.out.println("The Factorial of " + i + " is " + factorial);
			}
		}
	}
}

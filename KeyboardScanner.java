<<<<<<< HEAD
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		runScanner();
	}
	
	//Enter an integer: 12
	//Enter a floating point number: 33.44
	//Enter your name: Peter
	//Hi! Peter, the sum of 12 and 33.44 is 45.44

	private static void runScanner() {
		int    num1;
		double num2;
		double sum;
		String name;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		num1 = in.nextInt();

		System.out.print("Enter a floating point number: ");
		num2 = in.nextDouble();

		System.out.print("Enter your name: ");
		name = in.next();

		sum = num1 + num2;
		System.out.printf("Hi! " + name + ", the sum of %1$d and %2$.2f is %3$.2f \n"
				,  num1, num2, sum);
		
		in.close();
	}
=======
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		runScanner();
	}
	
	//Enter an integer: 12
	//Enter a floating point number: 33.44
	//Enter your name: Peter
	//Hi! Peter, the sum of 12 and 33.44 is 45.44

	private static void runScanner() {
		int    num1;
		double num2;
		double sum;
		String name;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		num1 = in.nextInt();

		System.out.print("Enter a floating point number: ");
		num2 = in.nextDouble();

		System.out.print("Enter your name: ");
		name = in.next();

		sum = num1 + num2;
		System.out.printf("Hi! " + name + ", the sum of %1$d and %2$.2f is %3$.2f \n"
				,  num1, num2, sum);
		
		in.close();
	}
>>>>>>> origin/java
}
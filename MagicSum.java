<<<<<<< HEAD
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int number;
		int sentinel = -1;
		int sum = 0;
		Scanner in = new Scanner(System.in);

		// Read first input
		System.out.print("Enter a positive integer or -1 to exit: ");
		number = in.nextInt();

		while (number != sentinel) {  // Read until input is -1
			if (EightTest.hasEight(number)==true) {
				sum += number;
			}

			// Read next input (Take note that you need to repeat these codes!)
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = in.nextInt();
		}
		System.out.println("The magic sum is: "+sum);
		in.close();
	}


}
=======
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int number;
		int sentinel = -1;
		int sum = 0;
		Scanner in = new Scanner(System.in);

		// Read first input
		System.out.print("Enter a positive integer or -1 to exit: ");
		number = in.nextInt();

		while (number != sentinel) {  // Read until input is -1
			if (EightTest.hasEight(number)==true) {
				sum += number;
			}

			// Read next input (Take note that you need to repeat these codes!)
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = in.nextInt();
		}
		System.out.println("The magic sum is: "+sum);
		in.close();
	}


}
>>>>>>> origin/java

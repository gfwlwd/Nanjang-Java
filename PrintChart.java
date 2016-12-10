<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

public class PrintChart {
	public static int[] numbers;
	public static void main(String[] args) {


		numInput();

	}
	public static void numInput() {
		int numInputs = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of bars: ");
		numInputs = in.nextInt();

		if (numInputs <= 0) {
			System.out.println("Invalid number of bars.");
			numInputs = in.nextInt();
		} 
		readInput(numInputs);
		in.close();	

	}
	public static void readInput(int numInputs) {
		Scanner in = new Scanner(System.in);

		numbers = new int[numInputs];

		int i = 0;
		while (i < numInputs)
		{
			System.out.printf("Enter the grade for student %1$d: ", (i+1));
			int grade = in.nextInt();
			numbers[i] = grade;
			i++;

		} 
		in.close();
		printChart();
	}
	public static void printChart() {
		//System.out.printf(Arrays.toString(numbers)+ "\n");
		System.out.println();
		int row = 0;
		for (row = 0; row < numbers.length; row++) {
			for(int star = 0; star < numbers[row]; star++) {  // each column is one star
				System.out.print("*");
			}
			System.out.print(" " + numbers[row]);


			System.out.print("\n");
		}
	}
}

/* Output:
 * Enter number of bars: 3
 * Enter the grade for student 1: 6
 * Enter the grade for student 2: 7
 * Enter the grade for student 3: 3
 * 
 * ****** 6
 * ******* 7
 * *** 3
 */
=======
import java.util.Arrays;
import java.util.Scanner;

public class PrintChart {
	public static int[] numbers;
	public static void main(String[] args) {


		numInput();

	}
	public static void numInput() {
		int numInputs = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of bars: ");
		numInputs = in.nextInt();

		if (numInputs <= 0) {
			System.out.println("Invalid number of bars.");
			numInputs = in.nextInt();
		} 
		readInput(numInputs);
		in.close();	

	}
	public static void readInput(int numInputs) {
		Scanner in = new Scanner(System.in);

		numbers = new int[numInputs];

		int i = 0;
		while (i < numInputs)
		{
			System.out.printf("Enter the grade for student %1$d: ", (i+1));
			int grade = in.nextInt();
			numbers[i] = grade;
			i++;

		} 
		in.close();
		printChart();
	}
	public static void printChart() {
		//System.out.printf(Arrays.toString(numbers)+ "\n");
		System.out.println();
		int row = 0;
		for (row = 0; row < numbers.length; row++) {
			for(int star = 0; star < numbers[row]; star++) {  // each column is one star
				System.out.print("*");
			}
			System.out.print(" " + numbers[row]);


			System.out.print("\n");
		}
	}
}

/* Output:
 * Enter number of bars: 3
 * Enter the grade for student 1: 6
 * Enter the grade for student 2: 7
 * Enter the grade for student 3: 3
 * 
 * ****** 6
 * ******* 7
 * *** 3
 */
>>>>>>> origin/java

import java.util.Scanner;


public class GradesAverage {

	private final static int LOWEST_GRADE  = 0;
	private final static int HIGHEST_GRADE = 100;


	public static void main(String[] args) {
		run();
	}

	private static void run() {
		int numStudents = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();

		if (numStudents <= 0) {
			System.out.println("Invalid number of students.");
			System.out.print("Enter the number of students: ");
			numStudents = in.nextInt();
		} 

		grades(numStudents);
		in.close();
	}
	private static void grades(int numStudents) {

		Scanner in = new Scanner(System.in);

		double sum = 0;
		int    i   = 0;
		while (i < numStudents) {
			System.out.printf("Enter the grade for student %1$d: ", (i+1));


			int grade = in.nextInt();

			if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {

				sum += grade;
				i++;

			}
			else {
				System.out.println("Invalid grade, try again...");
			}
		}
		in.close();
		System.out.printf("The average is %1$.2f \n", (sum / numStudents));
	}

}
/* Output:
 * Enter the number of students: 3
 * Enter the grade for student 1: 50
 * Enter the grade for student 2: 180
 * Invalid grade, try again...
 * Enter the grade for student 2: 60
 *  Enter the grade for student 3: 70
 *  The average is 60.00 
*/
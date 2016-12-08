/* Exercise PrintDayInWord (nested-if, switch-case):
 * Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "day" is 0, 1, ..., 6, respectively. 
 * Otherwise, it shall print “Not a valid day”. Use (a) a "nested-if" statement; (b) a "switch-case" statement 
 */

public class PrintDayInWord {  
	public static void main(String[] args) {
		int number = 6;  // Set the value of "number" here!
		nestedIf(number);
		switchCase(number);
		modulo(number);
	}

	public static void nestedIf(int number) {
		// Using nested-if
		if (number == 0) {
			System.out.println( "Sunday" );
		} else if (number == 1) {
			System.out.println( "Monday" );
		} else if (number == 2) {
			System.out.println( "Tuesday" );
		} else if (number == 3) {
			System.out.println( "Wednesday " );
		} else if (number == 4) {
			System.out.println( "Thursday" ); 
		} else if (number == 5) {
			System.out.println( "Friday" );
		} else if (number == 6) {
			System.out.println( "Saturday" );
		} else {
			System.out.println( "Not a valid day" );
		}
	}

	public static void switchCase(int number) {
		// Using switch-case
		switch(number) {

		case 0: System.out.println( "Sunday" ); break;
		case 1: System.out.println( "Monday" ); break;
		case 2: System.out.println( "Tuesday" ); break;
		case 3: System.out.println( "Wednesday" ); break;
		case 4: System.out.println( "Thursday" ); break; 
		case 5: System.out.println( "Friday" );break;
		case 6: System.out.println( "Saturday" );break;

		default: System.out.println( "Not a valid day"); 
		}
	}

	public static void modulo (int number) {
		int remainder = number % 7;
		if (remainder == 0) {
			System.out.println( "Sunday" );
		} else if (remainder == 1) {
			System.out.println( "Monday" );
		} else if (remainder == 2) {
			System.out.println( "Tuesday" );
		} else if (remainder == 3) {
			System.out.println( "Wednesday " );
		} else if (remainder == 4) {
			System.out.println( "Thursday" ); 
		} else if (remainder == 5) {
			System.out.println( "Friday" );
		} else if (remainder == 6) {
			System.out.println( "Saturday" );
		} else {
			System.out.println( "Not a valid day" );
		}
	}
}
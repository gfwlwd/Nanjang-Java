<<<<<<< HEAD
import java.util.Scanner;

public class ReverseString {



	public static void main(String[] args) {
		runScanner();
	}

	private static void runScanner()
	{
		Scanner in = new Scanner(System.in);

		String str;
		System.out.print("Enter a String: ");
		str = in.next();

		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		in.close();
	}

}

/* Output:
 * Enter a String: 12345
 * 54321
=======
import java.util.Scanner;

public class ReverseString {



	public static void main(String[] args) {
		runScanner();
	}

	private static void runScanner()
	{
		Scanner in = new Scanner(System.in);

		String str;
		System.out.print("Enter a String: ");
		str = in.next();

		for(int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		in.close();
	}

}

/* Output:
 * Enter a String: 12345
 * 54321
>>>>>>> origin/java
*/
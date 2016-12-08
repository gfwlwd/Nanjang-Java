import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		runScanner();
	}

	private static void runScanner()
	{
		Scanner in = new Scanner(System.in);

		String str;
		String reverseStr = "";
		String noSpace = "";
		System.out.print("Enter a string: ");
		str = in.nextLine();
		noSpace = str.replaceAll("\\s+", ""); //replaces space with nothing

		String newStr = noSpace.replaceAll("[,'\"!-]",""); //replaces , ' " ! - with nothing


		for(int i = newStr.length() - 1; i >= 0 ; i--) {

			reverseStr += newStr.toLowerCase().charAt(i);
		}

		if (newStr.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.printf("%1$s IS a palindrome.\n", str);

		} else {
			System.out.printf("%1$s is NOT a palindrome.\n", str);
		}
		in.close();
	}
}

/* Output:
 * Enter a String: Radar
 * radar is a palindrome.
 */
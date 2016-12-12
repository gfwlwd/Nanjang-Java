import java.util.Scanner;

public class Oct2Dec {
	// Octal  = 137
	// Decimal= 1×8^2+3×8^1+7×8^0 = 95
	// Binary = 1011111
	// Hex    = 5F

	private static final int OCT = 8; // Math.pow is to  the power of.

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Octal string: ");
		String oct = in.next();
		runTest(oct);    
		in.close();
	} 

	static void runTest(String octStr) {
		if ( ! isOct(octStr)) {
			System.out.printf("Error: Invalid octadecimal String \"%1$s\"\n", octStr);
			return;
		}        
		String str = "The equivalent decimal number for octadecimal "+octStr+" is "+convertOct2Dec(octStr)+"\n" ;
		System.out.print(str);
	}


	public static boolean isOct(String OctStr)	{
		for(int i = 0; i < OctStr.length(); i++)
		{
			if (Character.digit(OctStr.toLowerCase().charAt(i), OCT) > 0 ) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static long convertOct2Dec(String octStr) {
		long number = 0;
		int  digit;
		for(int i = 0; i < octStr.length(); i++) {
			digit = Character.digit(octStr.toLowerCase().charAt(i), OCT);
			number += digit * Math.pow(OCT, (octStr.length() - 1 - i));
		}
		return number;
		
	}
}

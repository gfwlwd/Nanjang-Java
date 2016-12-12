import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		/* Enter a number and radix: A1B2
		 * Enter the input radix: 16
		 * Enter the output radix: 2
		 * "A1B2" in radix 16 is "1010000110110010" in radix 2.
		 */
		System.out.println(toRadix("1011111",2,16)); // "1011111" in radix 2 is "5f" in radix 16.
		System.out.println(toRadix("1011111",2,10)); // "1011111" in radix 2 is "95" in radix 10.
		System.out.println(toRadix("1011111",2,8)); // "1011111" in radix 2 is "137" in radix 8.
		System.out.println(toRadix("1011111",2,2)); // "1011111" in radix 2 is "1011111" in radix 2.
		System.out.println(toRadix("95",10,16)); // "95" in radix 10 is "5f" in radix 16.
		System.out.println(toRadix("2.a",16,2)); // "Not a valid Hex input!
		System.out.println(toRadix("10",1,8)); // Not a valid Radix! 
		System.out.println(toRadix("10",2,16)); // "10" in radix 2 is "2" in radix 16.
		System.out.println(toRadix("137",8,2)); // "137" in radix 8 is "1011111" in radix 2.
		System.out.println(toRadix("A1B2",16,2)); // "A1B2" in radix 16 is "1010000110110010" in radix 2.
		System.out.println(toRadix("A1B2",16,21)); // Not a valid Radix! 

		scanner();
	}
	public static void scanner() {
		int inRadix = 0;
		int outRadix = 0;
		Scanner input = new Scanner(System.in);
		//input string
		System.out.print("Enter a number and radix:");
		String in = input.next();
		//check for input radix
		System.out.print("Enter the input radix: ");	
		//catch input errors, only allow int
		while (!input.hasNextInt()) {
			System.out.print("Invalid number try 2, 8, 10 or 16: ");
			input.next(); 
		}
		inRadix = input.nextInt();
		while ((inRadix != 2) && (inRadix != 8) && (inRadix != 10) && (inRadix != 16)) {
			System.out.print("Invalid number try 2, 8, 10 or 16: ");		
			inRadix = input.nextInt();
		}
		//check for output radix
		System.out.println("Enter the output radix:");
		//catch input errors, only allow int
		while (!input.hasNextInt()) {
			System.out.print("Invalid number try 2, 8, 10 or 16: ");
			input.next(); 
		}
		outRadix = input.nextInt();
		while ((outRadix != 2) && (outRadix != 8) && (outRadix != 10) && (outRadix != 16)) {
			System.out.print("Invalid number try 2, 8, 10 or 16: ");		
			outRadix = input.nextInt();
		}
		System.out.println(toRadix( in,  inRadix,  outRadix));
		// close Scanner
		input.close();
	}
	public static String toRadix(String in, int inRadix, int outRadix) {
		// The input and output are treated as String.
		int dec = 0;
		String out = "";
		String result = "";
		if (inRadix == 2) { // Bin input
			if (Bin2Dec.isBin(in)) {
				dec += (Bin2Dec.convertBin2Dec(in));
			} else {
				result = "Not a valid Bin input!";
				return result;
			}
		}
		else if (inRadix == 8) {
			if (Oct2Dec.isOct(in)) {
				dec += (Oct2Dec.convertOct2Dec(in));
			} else {
				result = "Not a valid Oct input!";
				return result;
			}
		}
		else if (inRadix == 10) {
			dec = Integer.parseInt(in);
		}
		else if (inRadix == 16) {
			if (Hex2Dec.isHex(in)) {
				dec += (Hex2Dec.convertHex2Dec(in));
			} else {
				result = "Not a valid Hex input!";
				return result;
			}
		}
		else {
			result = "Not a valid input Radix! ";
			return result;
		}

		// Output
		if (outRadix == 16) { // Hex output
			out += Integer.toHexString(dec);
		}
		else if (outRadix == 10) { // Dec output
			out += dec;
		}
		else if (outRadix == 8) { // Oct output
			out += Integer.toOctalString(dec);		
		}
		else if (outRadix == 2) { // Bin output
			out += Integer.toBinaryString(dec);
		}
		else {
			result = "Not a valid output Radix! ";
			return result;
		}

		//build result string
		result = "\""+in+"\" in radix "+inRadix+" is \""+out+"\" in radix "+outRadix+".";
		return result; 

	}
}

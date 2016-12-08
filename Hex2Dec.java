import java.util.Scanner;

public class Hex2Dec {

	private static final int HEX_RADIX = 16;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String hex = in.next();
		runTest(hex);    
		in.close();
	} 

	static void runTest(String hexStr) {
		if ( ! isHex(hexStr)) {
			System.out.printf("Error: Invalid Hexadecimal String \"%1$s\"\n", hexStr);
			return;
		}        
		System.out.printf("The equivalent decimal number for hexadecimal \"%1$s\" is %2$d\n"
				, hexStr, convertHex2Dec(hexStr));
	}


	private static boolean isHex(String hexStr)	{
		for(int i = 0; i < hexStr.length(); i++)
		{
			if (Character.digit(hexStr.toLowerCase().charAt(i), HEX_RADIX) > 0 ) {
				continue;
			}
			return false;
		}
		return true;
	}

	static long convertHex2Dec(String hexStr) {
		long number = 0;
		int  digit;
		for(int i = 0; i < hexStr.length(); i++) {
			digit = Character.digit(hexStr.toLowerCase().charAt(i), HEX_RADIX);
			number += digit * Math.pow(HEX_RADIX, (hexStr.length() - 1 - i));
		}
		return number;
		//0=0,1=1,...,9=9
		//a=10,b=11,...,z=25
		//1a=26...
		//2a=42...
	}
}
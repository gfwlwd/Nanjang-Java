
public class Radix2Dec {


	public static void main(String[] args) {
		getRadix(16,"1a"); // Hex
		getRadix(16,"2.a"); // invalid Hex
		getRadix(1,"10"); // invalid radix
		getRadix(2,"10"); // Bin
		getRadix(8,"137"); // Oct


	}

	private static void getRadix(int radix, String str){

		if (radix == 2) {

			Bin2Dec.runTest(str);  
		}
		else if (radix == 8) {

			Oct2Dec.runTest(str);
		}
		else if (radix == 16) {

			Hex2Dec.runTest(str);
		}
		else {
			System.out.println("Not a vaid Radix");
		}

		System.out.println();

	}

}

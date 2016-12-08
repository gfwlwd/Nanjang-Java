public class ExtractDigits {

	public static void main(String[] args) {
		extractDigits(123456);
	}
	public static void extractDigits(int n) {
		while (n > 0) {
		   int digit = n % 10;  // Extract the least-significant digit
		  System.out.print(digit+" ");
		  n = n / 10;  // Drop the least-significant digit and repeat the loop
		}

	}

}

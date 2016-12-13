
public class RecursiveGCD {

	public static void main(String[] args) {
		int a = 99;
		int b = 88;
		gcd(a,b);
		System.out.println("Result with recursion = "+rgcd(a,b));
	}
	public static void gcd(int a, int b) { 
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Result non recursive = "+a);
	}
	  // recursive 
    public static int rgcd(int a, int b) {
        if (b == 0) return a;
        return rgcd(b, a % b);
    }
}

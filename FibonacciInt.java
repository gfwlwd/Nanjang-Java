
public class FibonacciInt {

	public static void main(String[] args) {
		System.out.println("Integer.MAX_VALUE ="+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE ="+Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE + 1 ="+Integer.MAX_VALUE + 1);
		System.out.println();
		
		createFibonacci(5000);
		System.out.println();
		
		createTribonacci(50);     
	}
	public static void createFibonacci(int nMax) {
		System.out.println("Fibonacci:");

		int n = 2;          // the index n for F(n), starting from n=3
		int fn;             // F(n) to be computed
		int fnMinus1 = 1;   // F(n-1), init to F(2)
		int fnMinus2 = 1;   // F(n-2), init to F(1)
		int max = Integer.MAX_VALUE;
		int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
		double average;

		System.out.println("F(0) = "+ fnMinus1+" ");
		System.out.println("F(1) = "+ fnMinus2+" "); 
		while (n <= nMax) {  // n starts from 3
			
			fn = fnMinus1 + fnMinus2;
			if (max - fnMinus1 >= fnMinus2) {
				System.out.println("F("+n+") = "+fn+" ");
			} else {
				System.out.println("F("+n+") is out of the range of int ");	
				break;
			}
			sum += fn;
			++n;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
	}
	public static void createTribonacci(int nMax) {
		System.out.println("Tribonacci:");
		int n = 3;
		int fn = 0;             
		int fnMinus1 = 0;   
		int fnMinus2 = 0;  
		int fnMinus3 = 1;   
		int max = Integer.MAX_VALUE;

		int sum = 0;  // Need sum to compute average
		double average = 0.0; // double average;


		System.out.println("T(0) = "+ fnMinus1+" ");
		System.out.println("T(1) = "+ fnMinus2+" "); 

		while (n <= nMax) {  // n starts from 3

			fn = fnMinus1 + fnMinus2 + fnMinus3;

			if (max - fnMinus1 >= fnMinus2) {
				System.out.println("T("+n+") = "+fn+" ");
			} else {
				System.out.println("T("+n+") is out of the range of int ");	
				break;
			}
			sum += fn;
			n++;
			fnMinus3 = fnMinus2;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
	}
}

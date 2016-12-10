<<<<<<< HEAD

public class Fibonacci {

	public static void main(String[] args) {
		createFibonacci(20);   // maximum n, inclusive
	}

	public static void createFibonacci(int nMax) {
		int n = 3;          // the index n for F(n), starting from n=3
		int fn;             // F(n) to be computed
		int fnMinus1 = 1;   // F(n-1), init to F(2)
		int fnMinus2 = 1;   // F(n-2), init to F(1)

		int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
		double average;

		System.out.println("The first " + nMax + " Fibonacci numbers are:\n");
		System.out.print( fnMinus1+" ");
		System.out.print( fnMinus2+" "); 
		while (n <= nMax) {  // n starts from 3
			// Compute F(n), print it and add to sum
			fn = fnMinus1 + fnMinus2;
			System.out.print( fn+" ");
			sum += fn;
			// Increment the index n and shift the numbers for the next iteration
			++n;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}

		average = (double)sum / nMax;
		// Compute and display the average (=sum/nMax).
		// Beware that int/int give int.
		System.out.print("\nThe sum is "+sum );
		System.out.print("\nThe average is "+average);

	}

}
=======

public class Fibonacci {

	public static void main(String[] args) {
		createFibonacci(20);   // maximum n, inclusive
	}

	public static void createFibonacci(int nMax) {
		int n = 3;          // the index n for F(n), starting from n=3
		int fn;             // F(n) to be computed
		int fnMinus1 = 1;   // F(n-1), init to F(2)
		int fnMinus2 = 1;   // F(n-2), init to F(1)

		int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
		double average;

		System.out.println("The first " + nMax + " Fibonacci numbers are:\n");
		System.out.print( fnMinus1+" ");
		System.out.print( fnMinus2+" "); 
		while (n <= nMax) {  // n starts from 3
			// Compute F(n), print it and add to sum
			fn = fnMinus1 + fnMinus2;
			System.out.print( fn+" ");
			sum += fn;
			// Increment the index n and shift the numbers for the next iteration
			++n;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}

		average = (double)sum / nMax;
		// Compute and display the average (=sum/nMax).
		// Beware that int/int give int.
		System.out.print("\nThe sum is "+sum );
		System.out.print("\nThe average is "+average);

	}

}
>>>>>>> refs/remotes/origin/java

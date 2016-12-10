<<<<<<< HEAD
public class Tribonacci {
	public static void main(String[] args) {
		createTribonacci(20);      //Enter the amount you want to display
	}

	public static void createTribonacci(int nMax) {
		int n = 3;
		int fn;             
		int fnMinus1 = 0;   
		int fnMinus2 = 0;  
		int fnMinus3 = 1;   

		int sum = 0;  // Need sum to compute average
		double average = 0.0; // double average;

		System.out.println("The first " + nMax + " Fibonacci numbers are:\n");
		System.out.print(fnMinus1 +" "+ fnMinus2+" ");

		while (n <= nMax) {  // n starts from 3
			// Compute F(n), print it and add to sum
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			System.out.print( fn+" ");
			sum += fn;

			// Increment the index n and shift the numbers for the next iteration
			++n;
			fnMinus3 = fnMinus2;
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
public class Tribonacci {
	public static void main(String[] args) {
		createTribonacci(20);      //Enter the amount you want to display
	}

	public static void createTribonacci(int nMax) {
		int n = 3;
		int fn;             
		int fnMinus1 = 0;   
		int fnMinus2 = 0;  
		int fnMinus3 = 1;   

		int sum = 0;  // Need sum to compute average
		double average = 0.0; // double average;

		System.out.println("The first " + nMax + " Fibonacci numbers are:\n");
		System.out.print(fnMinus1 +" "+ fnMinus2+" ");

		while (n <= nMax) {  // n starts from 3
			// Compute F(n), print it and add to sum
			fn = fnMinus1 + fnMinus2 + fnMinus3;
			System.out.print( fn+" ");
			sum += fn;

			// Increment the index n and shift the numbers for the next iteration
			++n;
			fnMinus3 = fnMinus2;
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


public class SumAndAverageArnout {
	public static void main(String[] args) {
		sumAndAverage();
		sumAndAverage1();
		sumAndAverage2();
		sumAndAverage4(111, 8899);
		sumAndAverage5();
		sumAndAverage6();
		sumAndAverage7();
	}

	public static void sumAndAverage() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int/int produces int.
		average = (sum / 101);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}

	public static void sumAndAverage1() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int number = lowerbound;

		while (number <= upperbound) {
			sum += number;
			++number;
		}

		// Compute average in double. Beware that int/int produces int.
		average = (sum / 101);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}

	public static void sumAndAverage2() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int number = lowerbound;

		do {
			sum += number;
			++number;
		} while (number <= upperbound);

		// Compute average in double. Beware that int/int produces int.
		average = (sum / 101);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void sumAndAverage4(int lowerbound, int upperbound) {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int count = 0;
		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += number; // same as "sum = sum + number"
			count++;
		}
		// Compute average in double. Beware that int/int produces int.
		average = (sum / count);
		// Print sum and average.
		System.out.println("Count: " + count);

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void sumAndAverage5() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int count = 0;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			if(number % 2 == 0){
				sum += number; // same as "sum = sum + number"
				count++;
			}
		}
		// Compute average in double. Beware that int/int produces int.
		average = (sum / count);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void sumAndAverage6() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int count = 0;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			if(number % 7 == 0){
				sum += number; // same as "sum = sum + number"
				count++;
			}
		}
		// Compute average in double. Beware that int/int produces int.
		average = (sum / count);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
	public static void sumAndAverage7() {
		int sum = 0; // Store the accumulated sum, init to 0
		double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int count = 0;
		
		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += (number * number); // same as "sum = sum + number"
			count++;
		}
		// Compute average in double. Beware that int/int produces int.
		average = (sum / count);
		// Print sum and average.
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
	
}

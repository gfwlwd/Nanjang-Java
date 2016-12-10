class SumAndAverage {
	public static void main (String[] args) {
		int sum = 0;          // Store the accumulated sum, init to 0
		double average;       // average in double
		int lowerbound = 2;   // The lowerbound to sum
		int upperbound = 3; // The upperbound to sum

		
			// Use a for-loop to sum from lowerbound to upperbound
			for (int number = lowerbound; number <= upperbound; number++) {
				sum += number;     // same as "sum = sum + number"
			}
			// Compute average in double. Beware that int/int produces int.
			int count = upperbound - lowerbound +1;
			average = (double)sum / count;
			// Print sum and average.
			System.out.println("The sum is " +sum+ "\nThe Average is " +average);
	
	}
}
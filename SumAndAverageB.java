public class SumAndAverageB {   
	public static void main (String[] args) {
		int sum = 0;          
		double average;       
		int lowerbound = 1;   
		int upperbound = 100; 
		int number = lowerbound;

		while (number <= upperbound){
			sum += number;
			number++;
		} 

		int count = upperbound / lowerbound;
		average = (double)sum / count;
		// Print sum and average.
		System.out.println("The sum is " +sum+ "\nThe average is " +average);

	}
}
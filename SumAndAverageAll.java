public class SumAndAverageAll {

	public static void main(String[] args)
	{
		int upperbound = 100;
		int lowerbound = 2;

		
		forLoop(upperbound,lowerbound);
		whileLoop(upperbound,lowerbound);
		doWhileLoop(upperbound,lowerbound);        
		question();
		range(8899,111);
		oddNumbers(upperbound,lowerbound);
		divisibleBySeven(upperbound,lowerbound);
		squares(upperbound,lowerbound);
	}


	public static void forLoop(int upperbound, int lowerbound)
	{
		int sum = 0;
		int count = 0;
		for(int i = lowerbound; i <= upperbound; i++) {
			sum += i;
			count++;
		}
		//int count = ((upperbound- lowerbound)+1);
		System.out.println("A. \"for\" loop.");
				System.out.println("The sum is " + sum);
				System.out.println("The average is "+ (double) sum / count);
	}

	public static void whileLoop(int upperbound, int lowerbound)
	{
		int sum = 0;
		int  i   = lowerbound;
		while (i <= upperbound) {
			sum += i;
			i++;
		}
		int count = ((upperbound- lowerbound)+1);
		System.out.println("'\nB. \"while\" loop.");
		System.out.println("The sum is " + sum);
		System.out.println("The average is "+ (double) sum / count);
	}

	public static void doWhileLoop(int upperbound, int lowerbound)
	{
		int sum = 0;
		int  i   = lowerbound;
		do {
			sum += i;
			i++;
		} while (i <= upperbound);  
		int count = ((upperbound- lowerbound)+1);
		System.out.println("\nC. \"do-while\" loop.");
		System.out.println("The sum is " + sum);
		System.out.println("The average is "+ (double) sum / count);
	}

	public static void question() {
		System.out.println("'\nD. What is the difference between \"for\" and \"while-do\" loops? What is the difference between \"while-do\" and \"do-while\" loops?");
		System.out.println("Answer: The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top. "
				+ "\nTherefore, the statements within the do block are always executed at least once."
				+"\nFor loops through a block of code until the counter reaches a specified number.");
	}

	public static void range(int upperbound, int lowerbound)
	{
		int count = 0;
		int sum   = 0;
		for (int i = lowerbound; i <= upperbound; i++) {
			sum += i;
			count++;
		}
		System.out.println("\nE. Sum numbers from "+lowerbound+" to "+upperbound+", and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.printf ("The average is "+ (double) sum / count);
		System.out.println();
	}

	public static void oddNumbers(int upperbound, int lowerbound)
	{
		int count = 0;
		int sum   = 0;
		for (int i = lowerbound; i <= upperbound; i++) {
			if (i % 2 == 0) {
				sum += i;
				count++; 
			}
		}
		System.out.println("\nF. Sum only the odd numbers from "+lowerbound+" to "+upperbound+", and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.printf ("The average is "+ (double) sum / count);
		System.out.println();
	}

	public static void divisibleBySeven(int upperbound, int lowerbound)
	{
		int   count = 0;
		int   sum   = 0;

		for (int i = lowerbound; i <= upperbound; i++) {
			if (i % 7 == 0) {
				sum += i;
				count++;
			}

		}

		System.out.println("\nG. Modify the program to sum those numbers from "+lowerbound+" to "+upperbound+" that is divisible by 7, and compute the average.");
		System.out.println("The sum is " + sum);
		System.out.println ("The average is" + (double) sum / count);

	}

	public static void squares(int upperbound, int lowerbound)
	{
		int   count = 0;
		int   sum   = 0;
		System.out.println("\n7. Sum of the squares from "+lowerbound+" to "+upperbound+".");

		for (int i = lowerbound; i <= upperbound; i++) {
			sum += i*i;
			System.out.println("Square "+i+" = "+(i*i));
			count++;
		}
		System.out.println("\nThe sum is " + sum);
		System.out.println ("The average is " + (double) sum / count);

	}
}
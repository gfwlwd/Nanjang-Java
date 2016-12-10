<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;



public class GradesStatistics {
	private final static int LOWEST_GRADE  = 0;
	private final static int HIGHEST_GRADE = 100;

	public static int[] grades;  // Declare an int[], to be allocated later.
	private static int[] bins = new int[10];
	// This array is accessible by all the methods.

	public static void main(String[] args) {
		readGrades();  // Read and save the inputs in int[] grades
		printArray(grades);
		System.out.printf("The average is %1$.2f \n" , average(grades));
		System.out.printf("The median is %1$.2f \n" , median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
		System.out.printf("The standard deviation is %1$.2f \n" , stdDev(grades));
		printHistogramHorizontal();
		printHistogramVertical();
	}

	// Prompt user for the number of students and allocate the global "grades" array.
	// Then, prompt user for grade, check for valid grade, and store in "grades".
	public static void readGrades() {
		//grades = new int [] {50,51,56,53};
		int numStudents = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();

		if (numStudents <= 0) {
			System.out.println("Invalid number of students.");
			System.out.print("Enter the number of students: ");
			numStudents = in.nextInt();
		} 

		grades(numStudents);
		in.close();
	}
	private static void grades(int numStudents)     {
		Scanner in = new Scanner(System.in);

		grades = new int[numStudents];

		int i = 0;
		while (i < numStudents)
		{
			System.out.printf("Enter the grade for student %1$d: ", (i+1));
			int grade = in.nextInt();
			if (LOWEST_GRADE <= grade && grade <= HIGHEST_GRADE)
			{
				grades[i] = grade;
				i++;
			}
			else {
				System.out.println("Error! Grade must be integer between 0 and 100!");
			}
		} 
		in.close();
	} 


	// Print the given int array in the form of {x1, x2, x3,..., xn}.
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(grades));
	}

	// Return the average value of the given int[]
	public static double average(int[] array) {
		double average = 0.0;
		int sum = 0;
		int count = 0;
		if(array.length != 0) {
			for (int item : array) {
				sum += item;
				count++;
			}
			average = (double)sum / count;
		}
		return average; 
	}

	// Return the median value of the given int[]
	// Median is the center element for odd-number array, 
	// or average of the two center elements for even-number array.
	// Use Arrays.sort(anArray) to sort anArray in place.
	public static double median(int[] array) {
		Arrays.sort(array);
		double median;
		if (array.length % 2 == 0) {
			median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
		}
		else {
			median = (double) array[array.length/2]; 
		}
		return median;
	}

	// Return the maximum value of the given int[]
	public static int max(int[] array) {
		int max = array[0];   // Assume that max is the first element
		// From second element, if the element is more than max, set the max to this element.
		for (int item : array) {
			if(item > max ) {
				max = item;
			}
		}
		return max;

	}

	// Return the minimum value of the given int[]
	public static int min(int[] array) {
		int min = array[0];   
		for (int item : array) {
			if(min > item ) {
				min = item;
			}
		}
		return min;

	}

	// Return the standard deviation of the given int[]
	public static double stdDev(int[] array) {
		double sd = 0.00;
		double total = 0.00;

		for(int i = 0; i < array.length; i++){
			total += array[i]; // this is the calculation for summing up all the values
		}

		double mean = total / array.length;
		double squareSum = 0;

		for (int i = 0; i < array.length; i++) {

			squareSum += Math.pow(array[i] - mean, 2);

		}
		sd = Math.sqrt((squareSum) / (array.length));
		return sd;

	}
	public static void printHistogramHorizontal()
	{
		System.out.println();
		for(int i = 0; i < grades.length; i++) {  
			//create bins[] , binNum = 9 if grades[i]= 100 else grades[i] / 10
			int binNum = (grades[i] == 100) ? 9 : grades[i] / 10;
			bins[binNum] += 1;
		}
		for(int binNum = 0; binNum < bins.length; binNum++) // each row for one bin
		{
			int lastNum = (binNum == bins.length - 1) ? 10 : 9;
			// Print label for each row (row1 = 1*10, 1*10+9) || (10, 19))
			System.out.printf("%2d -%3d: ", (binNum*10), (binNum*10+lastNum));
			for(int star = 0; star < bins[binNum]; star++) {  // each column is one star
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printHistogramVertical()
	{
		// find out number of rows to output histogram
		int maxBin = bins[0];
		for(int i = 0; i < bins.length; i++) {
			maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
		}

		// print histogram
		System.out.println();
		for(int row = maxBin; row >= 0; row--)
		{
			if (row == 0)
			{ //if row= 0 print out range labels
				for(int col = 0; col < bins.length; col++)
				{
					int lastNum = (col == bins.length - 1) ? 10 : 9;
					System.out.printf("%2d-%-2d ", (col*10), (col*10+lastNum));
				}
			}
			else {
				for(int col = 0; col < bins.length; col++)
				{ //star = space if bins[col] < row else *
					String star = (bins[col] < row ) ? " " : "*"; 
					System.out.printf("%3s%-2s ", star, " ");
				}
			}
			System.out.println();
		}
	}

=======
import java.util.Arrays;
import java.util.Scanner;



public class GradesStatistics {
	private final static int LOWEST_GRADE  = 0;
	private final static int HIGHEST_GRADE = 100;

	public static int[] grades;  // Declare an int[], to be allocated later.
	private static int[] bins = new int[10];
	// This array is accessible by all the methods.

	public static void main(String[] args) {
		readGrades();  // Read and save the inputs in int[] grades
		printArray(grades);
		System.out.printf("The average is %1$.2f \n" , average(grades));
		System.out.printf("The median is %1$.2f \n" , median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
		System.out.printf("The standard deviation is %1$.2f \n" , stdDev(grades));
		printHistogramHorizontal();
		printHistogramVertical();
	}

	// Prompt user for the number of students and allocate the global "grades" array.
	// Then, prompt user for grade, check for valid grade, and store in "grades".
	public static void readGrades() {
		//grades = new int [] {50,51,56,53};
		int numStudents = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		numStudents = in.nextInt();

		if (numStudents <= 0) {
			System.out.println("Invalid number of students.");
			System.out.print("Enter the number of students: ");
			numStudents = in.nextInt();
		} 

		grades(numStudents);
		in.close();
	}
	private static void grades(int numStudents)     {
		Scanner in = new Scanner(System.in);

		grades = new int[numStudents];

		int i = 0;
		while (i < numStudents)
		{
			System.out.printf("Enter the grade for student %1$d: ", (i+1));
			int grade = in.nextInt();
			if (LOWEST_GRADE <= grade && grade <= HIGHEST_GRADE)
			{
				grades[i] = grade;
				i++;
			}
			else {
				System.out.println("Error! Grade must be integer between 0 and 100!");
			}
		} 
		in.close();
	} 


	// Print the given int array in the form of {x1, x2, x3,..., xn}.
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(grades));
	}

	// Return the average value of the given int[]
	public static double average(int[] array) {
		double average = 0.0;
		int sum = 0;
		int count = 0;
		if(array.length != 0) {
			for (int item : array) {
				sum += item;
				count++;
			}
			average = (double)sum / count;
		}
		return average; 
	}

	// Return the median value of the given int[]
	// Median is the center element for odd-number array, 
	// or average of the two center elements for even-number array.
	// Use Arrays.sort(anArray) to sort anArray in place.
	public static double median(int[] array) {
		Arrays.sort(array);
		double median;
		if (array.length % 2 == 0) {
			median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
		}
		else {
			median = array[array.length/2]; 
		}
		return median;
	}

	// Return the maximum value of the given int[]
	public static int max(int[] array) {
		int max = array[0];   // Assume that max is the first element
		// From second element, if the element is more than max, set the max to this element.
		for (int item : array) {
			if(item > max ) {
				max = item;
			}
		}
		return max;

	}

	// Return the minimum value of the given int[]
	public static int min(int[] array) {
		int min = array[0];   
		for (int item : array) {
			if(min > item ) {
				min = item;
			}
		}
		return min;

	}

	// Return the standard deviation of the given int[]
	public static double stdDev(int[] array) {
		double sd = 0.00;
		double total = 0.00;

		for(int i = 0; i < array.length; i++){
			total += array[i]; // this is the calculation for summing up all the values
		}

		double mean = total / array.length;
		double squareSum = 0;

		for (int i = 0; i < array.length; i++) {

			squareSum += Math.pow(array[i] - mean, 2);

		}
		sd = Math.sqrt((squareSum) / (array.length));
		return sd;

	}
	public static void printHistogramHorizontal()
	{
		System.out.println();
		for(int i = 0; i < grades.length; i++) {  
			//create bins[] , binNum = 9 if grades[i]= 100 else grades[i] / 10
			int binNum = (grades[i] == 100) ? 9 : grades[i] / 10;
			bins[binNum] += 1;
		}
		for(int binNum = 0; binNum < bins.length; binNum++) // each row for one bin
		{
			int lastNum = (binNum == bins.length - 1) ? 10 : 9;
			// Print label for each row (row1 = 1*10, 1*10+9) || (10, 19))
			System.out.printf("%2d -%3d: ", (binNum*10), (binNum*10+lastNum));
			for(int star = 0; star < bins[binNum]; star++) {  // each column is one star
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printHistogramVertical()
	{
		// find out number of rows to output histogram
		int maxBin = bins[0];
		for(int i = 0; i < bins.length; i++) {
			maxBin = (bins[i] > maxBin) ? bins[i] : maxBin;
		}

		// print histogram
		System.out.println();
		for(int row = maxBin; row >= 0; row--)
		{
			if (row == 0)
			{ //if row= 0 print out range labels
				for(int col = 0; col < bins.length; col++)
				{
					int lastNum = (col == bins.length - 1) ? 10 : 9;
					System.out.printf("%2d-%-2d ", (col*10), (col*10+lastNum));
				}
			}
			else {
				for(int col = 0; col < bins.length; col++)
				{ //star = space if bins[col] < row else *
					String star = (bins[col] < row ) ? " " : "*"; 
					System.out.printf("%3s%-2s ", star, " ");
				}
			}
			System.out.println();
		}
	}

>>>>>>> refs/remotes/origin/java
}
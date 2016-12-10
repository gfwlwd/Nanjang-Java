<<<<<<< HEAD

public class Exponential {

	public static void main(String[] args) {
		double x2 = Math.PI/2; // 1.5707963267948966 = 90 degrees
		double x3 = Math.PI/3; // 1.0471975511965976 = 60 degrees
		double x4 = Math.PI/4; // 0.7853981633974483 = 45 degrees
		double x6 = Math.PI/6; // 0.5235987755982988 = 30 degrees
		double x = 0 ; // 0.0 = 0 degrees

		int numTerms = 2;// at 2 precision get close when x = 0
		int numTerms2 = 9;
		int numTerms3 = 17;


		System.out.printf("Calcutated with "+numTerms2+" Terms:  %.12f%n\n",(exp(numTerms2)));

		System.out.printf("Calcutated with "+numTerms3+" Terms: %.12f%n\n",(exp(x2, numTerms3)));

	}
	
	public static long factorial(double n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
	
	public static double exp(int numTerms) {
		double result = 1.0;

		for (double i = 1; i < numTerms; i++) {
			result += (1.0/ (factorial(i)));
		}

		System.out.printf("The value of Math.E:      %.12f%n", Math.E);

		return result;

	}
	
	public static double exp(double x, int numTerms) {
		double result = 1.0;
		double n = 1.0;
		for (double i = 1; i < numTerms; i++) {
			result += (Math.pow(x, n) / (factorial(i)));
			n++;
		}

		System.out.printf("Value of Math.exp(%.3f): %.12f%n", x, Math.exp(x));  
		return result;
	}
	
	
}
=======

public class Exponential {

	public static void main(String[] args) {
		double x2 = Math.PI/2; // 1.5707963267948966 = 90 degrees
		double x3 = Math.PI/3; // 1.0471975511965976 = 60 degrees
		double x4 = Math.PI/4; // 0.7853981633974483 = 45 degrees
		double x6 = Math.PI/6; // 0.5235987755982988 = 30 degrees
		double x = 0 ; // 0.0 = 0 degrees

		int numTerms = 2;// at 2 precision get close when x = 0
		int numTerms2 = 9;
		int numTerms3 = 17;


		System.out.printf("Calcutated with "+numTerms2+" Terms:  %.12f%n\n",(exp(numTerms2)));

		System.out.printf("Calcutated with "+numTerms3+" Terms: %.12f%n\n",(exp(x2, numTerms3)));

	}
	public static long factorial(double n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
	public static double exp(int numTerms) {
		double result = 1.0;

		for (double i = 1; i < numTerms; i++) {
			result += (1.0/ (factorial(i)));
		}

		System.out.printf("The value of Math.E:      %.12f%n", Math.E);

		return result;

	}
	public static double exp(double x, int numTerms) {
		double result = 1.0;
		double n = 1.0;
		for (double i = 1; i < numTerms; i++) {
			result += (Math.pow(x, n) / (factorial(i)));
			n++;
		}

		System.out.printf("Value of Math.exp(%.3f): %.12f%n", x, Math.exp(x));  
		return result;


	}
}
>>>>>>> refs/remotes/origin/java

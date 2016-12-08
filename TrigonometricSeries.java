
public class TrigonometricSeries {

	public static void main(String[] args)
	{
		double x = Math.PI/6;
		//double x = 0 ;
		int numTerms = 13;

		System.out.println("Calculated values:");
		System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
				, sin(x, numTerms));        
		System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
				, cos(x, numTerms));

		System.out.println("java.lang.Math values:");
		System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
				, Math.sin(x));        
		System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
				, Math.cos(x));
	}

	private static double calculateTerm(double x, int numTerms)
	{
		double term = 1D;
		for (int i = numTerms; i > 0; i--) {
			term *= x/i;
		}        
		return term;
	}

	private static double sin(double x, int numTerms)
	{
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i%2 == 0 ? 1 : -1) * calculateTerm(x, (2*i+1));
		}
		return result;
	}

	private static double cos(double x, int numTerms)
	{
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i%2 == 0 ? 1 : -1) * calculateTerm(x, 2*i);
		}
		return result;
	}

	// Exercise Exponential Series:
	public static double exp(int numTerms) {
		return numTerms;
		// x in radians
	}  
	public static double exp(double x, int numTerms) {
		return x;

	}

	// Exercise SpecialSeries:
	public static double sumOfSeries(double x, int numTerms) {
		return x;
	}
}

public class HarmonicSum{


	public static void main(String[] args){

		int n = 50000;

		double sum1 = printLeftToRightSum(n);		
		double sum2 = printRightToLeftSum(n);

		System.out.printf("Difference:  %1$.16f ", (sum2 - sum1));
	}

	//Left to right
	public static double printLeftToRightSum(int n)
	{
		double sum1 = 0.0;
		for (int i = 1; i <= n; i++) {
			sum1 += (double) 1/i;
		}
		System.out.println("Left-to-right harmonic sum "+sum1);
		return sum1; 
	}
	//Right to left
	public static double printRightToLeftSum(int n)
	{
		double sum2 = 0.0;
		for (int i = n; i >= 1; i--) {
			sum2 += (double) 1/i;
		}
		System.out.println("Right-to-left harmonic sum " +sum2);

		return sum2;
	}
}
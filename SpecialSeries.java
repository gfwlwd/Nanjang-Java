
public class SpecialSeries {

	public static void main(String[] args) {
		// x + (1 / 2) * (Mtath.pow(x, 3) / 3 )+ ((1 * 3) / (2 * 4) * (Mtath.pow(x, 5)  ) 
		System.out.printf("= %1$.12f \n",sumOfSeries(0.6, 5));
		System.out.printf("= %1$.12f \n",sumOfSeries(1.6, 5));
		System.out.printf("= %1$.12f \n",sumOfSeries(0.7, 16));

	}
	public static double sumOfSeries(double x, int numTerms) {
		if (x < -1.0 || x > 1.0) { // check if x is betweeen -1 and 1
			System.out.print("Please enter a value between -1 and 1.");
			return 0.0;
		}
		double result = x;
		double oldSum = 1.0;
		double sum  = 0.0;
		System.out.print("x="+x+" ");
		for (int i=2;i<numTerms+1;i++){

			if (i%2==0) {
				//System.out.print("+ "+(i-1)+"/"+i+" "); //first setup

				sum = (((double)i-1)/i)*oldSum;
				//System.out.print("+ ("+sum+") "); //output check
				result += sum ; // add to reult

			} else { //* (Mtath.pow(x, 3) / 3 ) number3 == i
				double sum2 = Math.pow(x, i)/i ;
				//System.out.print("x ("+sum2+") "); //output check
				result *= sum2 ;
			}
			oldSum = sum; //store last sum value so we can use it in next loop

		}

		//System.out.println("\nresult1 "+ (((double)1*3*5)*((double)2*4*6))); //check if computations are same
		//System.out.println("result2 "+ ((double)1/2 *((double)3/4) *((double)5/6)));

		return Math.abs(result);
	}
}

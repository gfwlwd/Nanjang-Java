
public class TrigonometricSeries {

	public static void main(String[] args)
	{
		double x2 = Math.PI/2; // 1.5707963267948966 = 90 degrees
		double x3 = Math.PI/3; // 1.0471975511965976 = 60 degrees
		double x4 = Math.PI/4; // 0.7853981633974483 = 45 degrees
		double x6 = Math.PI/6; // 0.5235987755982988 = 30 degrees
		double x = 0 ; // 0.0 = 0 degrees

		int numTerms = 2;// at 2 precision get close when x = 0
		int numTerms2 = 9;
		int numTerms3 = 12;

		// x= Math.PI/2, numTerms = 12+ precision gets close
		System.out.println("Calculated values: x=Math.PI/2, numTerms = "+ numTerms3);
		System.out.printf("sin(%1$d) = %2$f = Math.sin = %3$f difference = %4$.12f \n", (int)Math.round(x2*180/Math.PI)
				, sin(x2, numTerms3), Math.sin(x2),  Math.abs(sin(x2, numTerms3)- Math.sin(x2)) );        
		System.out.printf("cos(%1$d) = %2$f = Math.cos = %3$f difference = %4$.12f \n\n", (int)Math.round(x2*180/Math.PI)
				, cos(x2, numTerms3), Math.cos(x2),  Math.abs(cos(x2, numTerms3)- Math.cos(x2)) );
		// x= Math.PI/3, numTerms = 9+ precision gets close
		System.out.println("Calculated values: x=Math.PI/3, numTerms = "+ numTerms2);
		System.out.printf("sin(%1$d) = %2$f = Math.sin = %3$f difference = %4$.12f \n", (int)Math.round(x3*180/Math.PI)
				, sin(x3, numTerms2), Math.sin(x3),  Math.abs(sin(x3, numTerms2)- Math.sin(x3)) );        
		System.out.printf("cos(%1$d) = %2$f = Math.cos = %3$f difference = %4$.12f \n\n", (int)Math.round(x3*180/Math.PI)
				, cos(x3, numTerms2), Math.cos(x3),  Math.abs(cos(x3, numTerms2)- Math.cos(x3)) );
		// x= Math.PI/4, numTerms = 8+ precision gets close
		System.out.println("Calculated values: x=Math.PI/4, numTerms = "+ numTerms2);
		System.out.printf("sin(%1$d) = %2$f = Math.sin = %3$f difference = %4$.12f \n", (int)Math.round(x4*180/Math.PI)
				, sin(x4, numTerms2), Math.sin(x4),  Math.abs(sin(x4, numTerms2)- Math.sin(x4)) );        
		System.out.printf("cos(%1$d) = %2$f = Math.cos = %3$f difference = %4$.12f \n\n", (int)Math.round(x4*180/Math.PI)
				, cos(x4, numTerms2), Math.cos(x4),  Math.abs(cos(x4, numTerms2)- Math.cos(x4)) );
		// x= Math.PI/6, numTerms = 8+ precision gets close
		System.out.println("Calculated values: x=Math.PI/6,, numTerms = "+ numTerms2);
		System.out.printf("sin(%1$d) = %2$f = Math.sin = %3$f difference = %4$.12f \n", (int)Math.round(x6*180/Math.PI)
				, sin(x6, numTerms2), Math.sin(x6),  Math.abs(sin(x6, numTerms2)- Math.sin(x6)) );        
		System.out.printf("cos(%1$d) , %2$f = Math.cos = %3$f difference = %4$.12f \n\n", (int)Math.round(x6*180/Math.PI)
				, cos(x6, numTerms2), Math.cos(x6),  Math.abs(cos(x6, numTerms2)- Math.cos(x6)) );
		// x= 0, numTerms = 2+ precision get close
		System.out.println("Calculated values: x="+ x +", numTerms = "+ numTerms);
		System.out.printf("sin(%1$d) = %2$f = Math.sin = %3$f difference = %4$.12f \n", (int)Math.round(x*180/Math.PI)
				, sin(x, numTerms), Math.sin(x),  Math.abs(sin(x, numTerms)- Math.sin(x)) );        
		System.out.printf("cos(%1$d) = %2$f = Math.cos = %3$f difference = %4$.12f \n\n", (int)Math.round(x*180/Math.PI)
				, cos(x, numTerms), Math.cos(x),  Math.abs(cos(x, numTerms)- Math.cos(x)) );
	}
	public static long factorial(int n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	private static double sin(double x, int numTerms)
	{
		double result = 0;
		int n = 1;

		for (int i = 1; i < numTerms; i++) {

			if (i%2 == 0 ) {
				//System.out.println(n+"-");
				result -= (Math.pow(x, n))/ (factorial(n));
			} else {
				//System.out.println(n+"+");
				result += (Math.pow(x, n))/ (factorial(n));
			}
			//System.out.println(result);
			n += 2;
		}
		return result;
	}

	private static double cos(double x, int numTerms)
	{
		double result = 0;
		/*for (int i = 0; i < numTerms; i++) {
			result += (i%2 == 0 ? 1 : -1) * calculateTerm(x, 2*i);
		}*/
		int n = 0;

		for (int i = 1; i < numTerms; i++) {

			if (i%2 == 0 ) {
				//System.out.println(n+"-");
				result -= (Math.pow(x, n))/ (factorial(n));
			} else {
				//System.out.println(n+"+");
				result += (Math.pow(x, n))/ (factorial(n));
			}
			//System.out.println(result);
			n += 2;
		}
		return result;
	}
}

<<<<<<< HEAD
public class ComputePI {

	public static void main(String[] args) {
		computePi(100000);
		computePi(1000000);
		computePi(20000001);

		getPrecision(0.0000001); //set precision Method 2


	}

	public static void computePi(int items){
		double sum =0.0;
		for (int i = 1; i < items; i+=2){
			if (i  % 4 == 1){
				sum += (double) 4 * 1 / i;

			} else if (i % 4 == 3) {
				sum -= (double) 4 / i;

			}else{
				System.out.println("The computer has gone crazy?!" + i);
			}
		} System.out.println(sum);
		System.out.println(Math.PI);
		System.out.printf("Difference between the values obtained and the Math.PI: %.20f \n\n", 
				((double)Math.PI - sum));
	}

	private static void getPrecision(double precision) {
		double sumOld;
		double sumNew = 0.0;
		long   i = 0;
		do {
			sumOld = sumNew;
			sumNew += ((i % 2 == 0) ? 1 : -1) * (double) 4/(2*i + 1); 
			++i;
		} while( (double) Math.abs(sumNew - sumOld) >= precision);
		System.out.println("Method 2");
		System.out.printf("Calculated items %d, PI = %.10f", i, sumOld);
		System.out.println();


		System.out.printf("Difference between the values obtained and the Math.PI: %.20f \n", 
				((double)Math.PI - sumOld));
	}

}
=======
public class ComputePI {

	public static void main(String[] args) {
		computePi(100000);
		computePi(1000000);
		computePi(20000001);

		getPrecision(0.0000001); //set precision Method 2


	}

	public static void computePi(int items){
		double sum =0.0;
		for (int i = 1; i < items; i+=2){
			if (i  % 4 == 1){
				sum += (double) 4 * 1 / i;

			} else if (i % 4 == 3) {
				sum -= (double) 4 / i;

			}else{
				System.out.println("The computer has gone crazy?!" + i);
			}
		} System.out.println(sum);
		System.out.println(Math.PI);
		System.out.printf("Difference between the values obtained and the Math.PI: %.20f \n\n", 
				(Math.PI - sum));
	}

	private static void getPrecision(double precision) {
		double sumOld;
		double sumNew = 0.0;
		long   i = 0;
		do {
			sumOld = sumNew;
			sumNew += ((i % 2 == 0) ? 1 : -1) * (double) 4/(2*i + 1); 
			++i;
		} while( Math.abs(sumNew - sumOld) >= precision);
		System.out.println("Method 2");
		System.out.printf("Calculated items %d, PI = %.10f", i, sumOld);
		System.out.println();


		System.out.printf("Difference between the values obtained and the Math.PI: %.20f \n", 
				(Math.PI - sumOld));
	}

}
>>>>>>> refs/remotes/origin/java

import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {  

		circleA(1.0);
		circleA(2.1);

		circleB(0.0); // input by scanner
	}

	private static void circleA(double radius) {
		//the radius: 1.2
		//The area is: 4.52
		//The circumference is: 7.5398
		double Pi = Math.PI;
		double diam = 2 * radius;

		System.out.println ("circleA");
		System.out.println ("Tthe radius is: " + radius);
		System.out.printf( "The area is: %.2f \n",((radius*radius)*Pi));
		System.out.printf( "The circumference is: %.2f \n\n",(diam*Pi));

	}

	private static void circleB(double radius) {
		System.out.println ("circleB");
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter the radius or -1 to exit: ");
		radius = in.nextDouble();

		double Pi = Math.PI;
		double diam = 2 * radius;
		if (radius != -1) {
			while (radius != -1) {  // Continue only if input is not -1
				// Process the number
				System.out.println ("Tthe radius is: " + radius);
				System.out.printf( "The area is: %.2f \n",((radius*radius)*Pi));
				System.out.printf( "The circumference is: %.2f \n\n",(diam*Pi));


				System.out.printf("Enter the new radius: ");
				radius = in.nextDouble();
			} 
		} else {
			System.out.printf("Exit!");
		}
		in.close();
	}

}

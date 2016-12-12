import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		guess();
	}

	public static void guess() {
		int number = 0;
		int count = 0;
		int secretNumber = (int)(Math.random()*100);
		//System.out.println(secretNumber);
		Scanner input = new Scanner(System.in);
		while (secretNumber != number) {
			count++ ;
			if (count == 1) {
				System.out.print("Key in your guess: ");	
			}
			else if (secretNumber > number) {
				System.out.print("Try higher: ");	
			}
			else if (secretNumber < number) {
				System.out.print("Try lower: ");	
			}
			//catch input errors, only allow int
			while (!input.hasNextInt()) {
				System.out.print("Invalid number try again: ");
				input.next(); 
			}
			number = input.nextInt();
		}

		System.out.println("You got it in "+count+" trials!");
		// close Scanner
		input.close();
	}

}

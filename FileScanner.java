import java.util.Scanner;
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileScanner {

	public static void main(String[] args)
	{
		FileScanner aFileScanner = new FileScanner();
		aFileScanner.runFileScanner("in.txt");
	}


	private void runFileScanner(String filePath)
	{

		try {
			Scanner file = new Scanner(new File(getClass().getResource(filePath).getPath().replaceFirst("/", "")));

			int num1 = 0;
			if (file.hasNextInt()) {
				num1 = file.nextInt();
			}

			double num2 = 0.00;
			if (file.hasNextDouble()) {
				num2 = file.nextDouble();
			}

			String name = "";
			if (file.hasNext()) {
				name = file.next();
			}
			double sum = (num1 + num2);
			System.out.printf("The integer read is %1$d \n", num1);
			System.out.printf("The floating point number read is %1$.2f \n", num2);
			System.out.printf("The String read is \"%1$s\" \n", name);
			System.out.printf("Hi! %1$s, the sum of %2$d and %3$.2f is %4$.2f \n"
					, name, num1, num2, sum);

			file.close();
		} catch (FileNotFoundException ex) {
			//Logger.getLogger(FileScanner.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Warning: File Not Found Exception");
		}
	}
}
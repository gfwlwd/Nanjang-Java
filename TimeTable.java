
public class TimeTable {
	public static void main(String[] args) {
		printTimeTable(9);
		printTimeTable(12);
		printTimeTable(250);
	}

	private static void printTimeTable(int n) {
		int lenght = String.valueOf(n*n).length(); //lengte berekenen van grootste getal
		String separator = "";
		for (int i = 0; i < lenght; i++ ) {
			separator += "-";
		}
		
		for (int row = -1; row <= n; row++) // begin row op -1 voor gemak
		{
			if (row == -1) {
				System.out.printf("%"+ lenght +"s |", "*");
			}
			else if (row == 0) {
				System.out.print(separator+"--");
			}
			else if (row > 0) {                    
				System.out.printf("%"+ lenght +"d |", row); 
				/* The %3d specifier means a minimum width of three spaces,
				 * which, by default, will be right-justified:   
				 * s = String
				 * d = decimal
				 * f = floating point */
			}

			for(int col = 1; col <= n; col++)
			{        
				if (row == -1) {
					System.out.printf("%"+ lenght +"d ", col);                    
				}
				else if (row == 0) {
					System.out.print(separator+"-");
				} else {

					System.out.printf("%"+ lenght +"d ", row * col);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}

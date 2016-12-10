<<<<<<< HEAD
public class TimeTableAll {
	public static void main(String[] args) {
		printTimeTable(9);
		printTimeTable(32);
	}

	private static void printTimeTable(int n)
	{
		for(int i = -1; i <= n; i++) 
		{
			if (i == -1) {
				System.out.print("   * |");
			}
			else if (i == 0) {
				System.out.print("------");
			}
			else if (i > 0) {                    
				System.out.printf("%1$4s |", i);    
			}

			for(int j = 1; j <= n; j++)
			{        
				if (i == -1) {
					System.out.printf("%1$4s", j);                    
				}
				else if (i == 0) {
					System.out.print("----");
				} else {

					System.out.printf("%1$4s", i * j);
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}
=======
public class TimeTableAll {
	public static void main(String[] args) {
		printTimeTable(9);
		printTimeTable(32);
	}

	private static void printTimeTable(int n)
	{
		for(int i = -1; i <= n; i++) 
		{
			if (i == -1) {
				System.out.print("   * |");
			}
			else if (i == 0) {
				System.out.print("------");
			}
			else if (i > 0) {                    
				System.out.printf("%1$4s |", i);    
			}

			for(int j = 1; j <= n; j++)
			{        
				if (i == -1) {
					System.out.printf("%1$4s", j);                    
				}
				else if (i == 0) {
					System.out.print("----");
				} else {

					System.out.printf("%1$4s", i * j);
				}
			}
			System.out.println();
		}
		System.out.println("\n");
	}

}
>>>>>>> refs/remotes/origin/java

public class PrintPattern {

	public static void main(String[] args)
	{
		int size = 7; //enter size here

		printPatternA(size);
		printPatternB(size);
		printPatternC(size);
		printPatternD(size);
		printPatternE(size);
		printPatternF(size);
		printPatternG(size);
		printPatternH(size);
		printPatternI(size);

	}


	private static void printPatternA(int size)
	{
		System.out.println("Pattern a");
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	private static void printPatternB(int size)
	{
		System.out.println("\nPattern b");
		for (int row = size; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	private static void printPatternC(int size)
	{
		System.out.println("\nPattern c");
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print(( col >= row ? "# " : "  "));
			}
			System.out.println();
		}
	}

	private static void printPatternD(int size)
	{
		System.out.println("\nPattern d");
		for (int row = size; row >= 1; row--) {
			for (int col = 1; col <= size; col++) {
				//every row print # if col >= row, else print space
				System.out.print(( col >= row ? "# " : "  "));
			}
			System.out.println();
		}
	}

	private static void printPatternE(int size)
	{
		System.out.println("\nPattern e");
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				//every row print # if col%size or row%size <=1, else print space
				System.out.print((row%size <= 1) || (col%size <= 1) ? "# " : "  ");
			}
			System.out.println();
		}
	}

	private static void printPatternF(int size)
	{
		System.out.println("\nPattern f");
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print((row%size <= 1) || (row == col) ? "# " : "  ");
			}
			System.out.println();
		}
	}

	private static void printPatternG(int size)
	{
		System.out.println("\nPattern g");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= size; col++)
			{
				if((row%size <= 1) || (row + col == size +1 )) {
					System.out.print("# ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static void printPatternH(int size)
	{
		System.out.println("\nPattern h");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= size; col++)
			{
				if((row%size <= 1) || (row == col) || (row + col == size + 1)) {
					System.out.print("# ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}

	private static void printPatternI(int size)
	{
		System.out.println("\nPattern i");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= size; col++)
			{
				if ((row%size <= 1) ||
						(col%size <= 1) ||
						(row == col) ||    
						(row + col == size + 1))
				{
					System.out.print("# ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
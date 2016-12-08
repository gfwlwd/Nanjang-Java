
public class PrintPatterns {

	public static void main(String[] args) {
		printA(6);
		printB(6);
		printC(6);
		printD(8);
		printE(8);
		printF(8);
		printG(8);
		printH(8);
		printI(8);
		printJ(8);
		printK(8);
		printL(8);

	}
	public static void printA(int size) {
		System.out.println("Pattern a");

		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size-1; col++) {
				System.out.print(( col >= row ? "# " : "  "));
			}
			for (int col = size; col >= row; col--) {

				System.out.print("# ");
			}System.out.println();

		}System.out.println();
	}

	public static void printB(int size) {
		System.out.println("Pattern b");

		for (int row = 1; row <= size; row++) {
			for (int col = size; col >= 1; col--) {

				System.out.print(( col <= row ? "# " : "  "));
			}
			for (int col = 1; col <= row-1; col++) {

				System.out.print("# ");
			}
			System.out.println();
		}System.out.println();
	}
	public static void printC(int size) {
		System.out.println("Pattern c");
		int count = 0;
		while (count <= 2*size)
		{
			int row = Math.abs(size - count);
			if (row == 0) {
				count+=2;
				continue;
			}
			for (int col = 1; col <= 2*size - row; col++) {
				if (col >= row) {
					System.out.print("# ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
			count++;
		}
		System.out.println();
	}
	public static void printD(int size)	{
		System.out.println("Pattern d");
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printE(int size)	{
		System.out.println("Pattern e");
		int count = 0;
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				System.out.print(( col >= row ? (col-count)+" " : "  "));

			}
			count++;
			System.out.println();
		}System.out.println();
	}
	public static void printF(int size)	{
		System.out.println("Pattern f");
		for (int row = size; row >= 1; row--) {
			int count = size;
			for (int col = 1; col <= size; col++) {
				//every row print # if col >= row, else print space
				System.out.print(( col >= row ? (count)+" " : "  "));
				count--;
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printG(int size)	{
		System.out.println("\nPattern g");
		int count = 0 ;
		for (int row = size; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print((row-count)+" ");
				count++;
			}
			System.out.println();
			count=0;
		}
	}
	public static void printH(int size)	{
		System.out.println("\nPattern h");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= 2*size; col++)
			{
				if (col > size + row - 1) {
					continue;
				}

				if (col <= size) {
					System.out.print((row + col >= size + 1 ? (row + col)%size : " ") + " ");
				}
				else {
					System.out.print((row + col >= size + 1 ? (row + size)%col : " ") + " ");
				}                
			}
			System.out.println();
		}
	}
	public static void printI(int size)	{
		System.out.println("\nPattern i");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= 2*size; col++)
			{
				if ( col <= size && col >= row) {
					System.out.print((col-row+1));
				}
				else if (col > size && col < 2*size - row +1 ) {
					System.out.print(size-(col+row-1)%size);
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void printJ(int size)	{
		System.out.println("\nPattern j");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= 2*size; col++)
			{
				if (col%(size+1) == 0) {
					continue;
				}
				else if ( (col <= size) && (col > row) ) {
					System.out.print(" ");
				}
				else if ( (col > size + 1) && (col < 2*size - row + 1) ) {
					System.out.print(" ");
				}                
				else if (col <= size) {
					System.out.print(col%(size+1));
				}
				else {
					System.out.print( 2*size-col + 1);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void printK(int size)	{
		System.out.println("\nPattern k");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= 2*size; col++)
			{                
				if (col == 2*size) {
					continue;
				}
				else if (col <= size - row + 1) {
					System.out.print(col);
				}
				else if ( (col > size - row + 1) && (col < size + row - 1) ) {
					System.out.print(" ");
				}
				else {
					System.out.print(2*size - col);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void printL(int size)	{
		System.out.println("\nPattern l");
		for (int row = 1; row <= size; row++) {
			for (int col = size; col >= 1; col--) {

				System.out.print(( col <= row ? ((row-col)+row)%10+" " : "  ") );

			}
			for (int col = 1; col <= row-1; col++) {

				System.out.print( ((row-col)+row-1)%10+" ");
			}
			System.out.println();
		}System.out.println();
	}
}


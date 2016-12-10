<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;

public class PrintTriangles {

	public static void main(String[] args) {
		int n = 14;
		printPowerOf2Triangle(n);
		printPascalTriangle1(n);
		printPascalTriangle2(n);
		System.out.println();

		List<Integer> list = getRow(n-1);
		System.out.println(list);
		List<Integer> list2 = getRow2(n-1);
		System.out.println(list2);

	}
	public static void printPowerOf2Triangle(int numRows) { 
		System.out.println("(a) PowerOf2Triangle");
		for (int row = 1; row <= numRows; row++)
		{
			for (int col = 1; col <= 2 * numRows; col++) 
			{
				if (col == numRows+1) {
					continue;
				}

				int k = (col < numRows+1) ? col : 2*numRows-col+1;
				if (k >= numRows+1-row) {
					int next = (int) Math.pow(2, (row+k-numRows - 1));
					System.out.printf("%3d", next);
				}
				else {
					System.out.print("   ");
				}
				System.out.print(" ");                
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printPascalTriangle1(int numRows)
	{
		System.out.println("(b) PascalTriangle1");
		// generate array for Pascal Triangle
		int[][] intArray = new int[numRows][numRows];
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numRows; col++) 
			{
				intArray[row][col] = 0;
				if (col == 0 || row == col) {
					intArray[row][col] = 1;
				}
				else if (col < row) {
					intArray[row][col] = intArray[row-1][col] + intArray[row-1][col-1];
				}
			}
		}

		// print Pascal Triangle's array
		for (int[] a : intArray)
		{
			for (int x : a)
			{
				if (x == 0) {
					System.out.printf("%5s", "");
					continue;
				}
				System.out.printf("%5d ", x);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static long factorial(int n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	private static void printPascalTriangle2(int numRows) {
		System.out.println("(c) PascalTriangle2");
		for (int row = 0; row <= numRows-1; row++)
		{
			for (int col = numRows; col >= 0; col--) {
				long k = factorial(col);
				long n = factorial(row);

				if ((row- col)>= 0)
					System.out.printf("%5d ",(n / ( k *factorial(row-col)))) ;
				else
					System.out.printf( "   ");

			}

			System.out.println();

		}
		System.out.println();
	}



	public static List<Integer> getRow(int rowIndex) {
		System.out.println("(d) PascalTriangleArrayList");
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (rowIndex < 0) {

			return result;
		}

		result.add(1);
		for (int row = 1; row <= rowIndex; row++) {
			for (int col = result.size() - 2; col >= 0; col--) {
				result.set(col + 1, result.get(col) + result.get(col + 1));

			}
			result.add(1);
			System.out.println(result);

		}System.out.println();
		return result;
	}
	public static List<Integer> getRow2(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		long col = 1;
		for (int row = 0; row <= rowIndex; row++) {
			result.add((int) col);
			col *= rowIndex - row;
			col /= row + 1;

		}
		return result;
	}
}
=======

import java.util.ArrayList;
import java.util.List;

public class PrintTriangles {

	public static void main(String[] args) {
		int n = 14;
		printPowerOf2Triangle(n);
		printPascalTriangle1(n);
		printPascalTriangle2(n);
		System.out.println();

		List<Integer> list = getRow(n-1);
		System.out.println(list);
		List<Integer> list2 = getRow2(n-1);
		System.out.println(list2);

	}
	public static void printPowerOf2Triangle(int numRows) { 
		System.out.println("(a) PowerOf2Triangle");
		for (int row = 1; row <= numRows; row++)
		{
			for (int col = 1; col <= 2 * numRows; col++) 
			{
				if (col == numRows+1) {
					continue;
				}

				int k = (col < numRows+1) ? col : 2*numRows-col+1;
				if (k >= numRows+1-row) {
					int next = (int) Math.pow(2, (row+k-numRows - 1));
					System.out.printf("%3d", next);
				}
				else {
					System.out.print("   ");
				}
				System.out.print(" ");                
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printPascalTriangle1(int numRows)
	{
		System.out.println("(b) PascalTriangle1");
		// generate array for Pascal Triangle
		int[][] intArray = new int[numRows][numRows];
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numRows; col++) 
			{
				intArray[row][col] = 0;
				if (col == 0 || row == col) {
					intArray[row][col] = 1;
				}
				else if (col < row) {
					intArray[row][col] = intArray[row-1][col] + intArray[row-1][col-1];
				}
			}
		}

		// print Pascal Triangle's array
		for (int[] a : intArray)
		{
			for (int x : a)
			{
				if (x == 0) {
					System.out.printf("%5s", "");
					continue;
				}
				System.out.printf("%5d ", x);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static long factorial(int n) {
		long factorial =  1;
		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	private static void printPascalTriangle2(int numRows) {
		System.out.println("(c) PascalTriangle2");
		for (int row = 0; row <= numRows-1; row++)
		{
			for (int col = numRows; col >= 0; col--) {
				long k = factorial(col);
				long n = factorial(row);

				if ((row- col)>= 0)
					System.out.printf("%5d ",(n / ( k *factorial(row-col)))) ;
				else
					System.out.printf( "   ");

			}

			System.out.println();

		}
		System.out.println();
	}



	public static List<Integer> getRow(int rowIndex) {
		System.out.println("(d) PascalTriangleArrayList");
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (rowIndex < 0) {

			return result;
		}

		result.add(1);
		for (int row = 1; row <= rowIndex; row++) {
			for (int col = result.size() - 2; col >= 0; col--) {
				result.set(col + 1, result.get(col) + result.get(col + 1));

			}
			result.add(1);
			System.out.println(result);

		}System.out.println();
		return result;
	}
	public static List<Integer> getRow2(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		long col = 1;
		for (int row = 0; row <= rowIndex; row++) {
			result.add((int) col);
			col *= rowIndex - row;
			col /= row + 1;

		}
		return result;
	}
}
>>>>>>> origin/java

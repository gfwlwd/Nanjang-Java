<<<<<<< HEAD

public class Matrix {

	public static void main(String[] args) {


		int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}};
		int[][] b = new int[][] {{0, 1}, {2, 3}, {3, 5}};
		double[][] c = new double[][] {{1.6, 2.5, 3.4}, {4.3, 5.2, 6.1}};
		double[][] d = new double[][] {{0, 1}, {2, 3}, {3, 5}};
		//
		System.out.println("Matrix A:");
		printMatrix(a);
		System.out.println();
		System.out.println("Matrix B:");
		printMatrix(b);
		System.out.println();
		System.out.println("Matrix C:");
		printMatrix(c);
		System.out.println();
		System.out.println("Matrix D:");
		printMatrix(d);
		System.out.println();

		if (haveSameDimension(a, a)) {
			System.out.println("Add matrix A to A:");
			printMatrix(add(a, a));
		}

		
			System.out.println();
		if (haveAllowedDimension(a, b)) {
		System.out.println("Multiply matrix A and B:");
		printMatrix(multiply(a, b));
			} 

	}

	public static void printMatrix(int[][] m) {
		for (int[] row : m)
		{
			for (int aInt: row) {
				System.out.printf("%4d ", aInt);
			}
			System.out.println();
		}
	}

	public static void printMatrix(double[][] m) { 
		for (double[] row : m)
		{
			for (double aDouble : row) {
				System.out.printf("%5.2f ", aDouble);
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] m1, int[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}        
		for(int i = 0; i < m1.length; i++) {
			if (m1[i].length == m2[i].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static boolean haveSameDimension(double[][] m1, double[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}        
		for(int i = 0; i < m1.length; i++) {
			if (m1[i].length == m2[i].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static int[][] add(int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][];
		for(int i = 0; i < result.length; i++) {
			result[i] = m1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += m2[i][j];
			}

		}
		return result;
	}

	public static double[][] add(double[][] m1, double[][] m2) {
		double[][] result = new double[m1.length][];
		for(int i = 0; i < result.length; i++) {
			result[i] = m1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += m2[i][j];
			}

		}
		return result;
	}


	public static boolean haveAllowedDimension(int[][] m1, int[][] m2)
	{
		// check first matrix dimension
		int maxLengthM1 = 0;
		for (int[] a : m1) {
			maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
		}
		for (int[] a : m1) {
			if (maxLengthM1 == a.length) {
				continue;
			}
			return false;
		}

		// check first matrix dimension
		int maxLengthM2 = 0;
		for (int[] b : m2) {
			maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
		}
		for (int[] b : m2) {
			if (maxLengthM2 == b.length) {
				continue;
			}
			return false;
		}

		// check dimension
		return m1[0].length == m2.length;
	}

	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return 
	 */
	public static int[][] multiply(int[][] m1, int[][] m2)
	{
		int[][] c = new int[m1.length][m2[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < m1[0].length; k++) {
					c[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return c;                
	}
}
=======

public class Matrix {

	public static void main(String[] args) {


		int[][] a = new int[][] {{1, 2, 3}, {4, 5, 6}};
		int[][] b = new int[][] {{0, 1}, {2, 3}, {3, 5}};
		double[][] c = new double[][] {{1.6, 2.5, 3.4}, {4.3, 5.2, 6.1}};
		double[][] d = new double[][] {{0, 1}, {2, 3}, {3, 5}};
		//
		System.out.println("Matrix A:");
		printMatrix(a);
		System.out.println();
		System.out.println("Matrix B:");
		printMatrix(b);
		System.out.println();
		System.out.println("Matrix C:");
		printMatrix(c);
		System.out.println();
		System.out.println("Matrix D:");
		printMatrix(d);
		System.out.println();

		if (haveSameDimension(a, a)) {
			System.out.println("Add matrix A to A:");
			printMatrix(add(a, a));
		}

		
			System.out.println();
		if (haveAllowedDimension(a, b)) {
		System.out.println("Multiply matrix A and B:");
		printMatrix(multiply(a, b));
			} 

	}

	public static void printMatrix(int[][] m) {
		for (int[] row : m)
		{
			for (int aInt: row) {
				System.out.printf("%4d ", aInt);
			}
			System.out.println();
		}
	}

	public static void printMatrix(double[][] m) { 
		for (double[] row : m)
		{
			for (double aDouble : row) {
				System.out.printf("%5.2f ", aDouble);
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] m1, int[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}        
		for(int i = 0; i < m1.length; i++) {
			if (m1[i].length == m2[i].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static boolean haveSameDimension(double[][] m1, double[][] m2) {
		if (m1.length != m2.length) {
			return false;
		}        
		for(int i = 0; i < m1.length; i++) {
			if (m1[i].length == m2[i].length) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static int[][] add(int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][];
		for(int i = 0; i < result.length; i++) {
			result[i] = m1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += m2[i][j];
			}

		}
		return result;
	}

	public static double[][] add(double[][] m1, double[][] m2) {
		double[][] result = new double[m1.length][];
		for(int i = 0; i < result.length; i++) {
			result[i] = m1[i].clone();
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] += m2[i][j];
			}

		}
		return result;
	}


	public static boolean haveAllowedDimension(int[][] m1, int[][] m2)
	{
		// check first matrix dimension
		int maxLengthM1 = 0;
		for (int[] a : m1) {
			maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
		}
		for (int[] a : m1) {
			if (maxLengthM1 == a.length) {
				continue;
			}
			return false;
		}

		// check first matrix dimension
		int maxLengthM2 = 0;
		for (int[] b : m2) {
			maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
		}
		for (int[] b : m2) {
			if (maxLengthM2 == b.length) {
				continue;
			}
			return false;
		}

		// check dimension
		return m1[0].length == m2.length;
	}

	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return 
	 */
	public static int[][] multiply(int[][] m1, int[][] m2)
	{
		int[][] c = new int[m1.length][m2[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < m1[0].length; k++) {
					c[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return c;                
	}
}
>>>>>>> refs/remotes/origin/java

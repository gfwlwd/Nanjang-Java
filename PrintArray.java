import java.lang.reflect.Array;

public class PrintArray {



	public static void main(String[] args) {
		System.out.println("IntArrays:");
		
		int[] emptyIntArray = new int[]{};
		int[] singleElementIntArray = new int[]{1};
		printArray(singleElementIntArray);
		int[] multiElementIntArray = new int[]{1,2,3,4};
		printArray(multiElementIntArray);
		System.out.println("DoubleArrays:");
		double[] emptyDoubleArray = new double[]{};
		double[] singleElementDoubleArray = new double[]{1.0};
		printArray(singleElementDoubleArray);
		double[] multiElementDoubleArray = new double[]{1.0,2.0,3.0,4.0};
		printArray(multiElementDoubleArray);
		System.out.println("FloatArrays:");
		float[] emptyFloatArray = new float[]{};
		float[] singleElementFloatArray = new float[]{1.0f};
		printArray(singleElementFloatArray);
		float[] multiElementFloatArray = new float[]{(float) 1.0,(float) 2.0,(float) 3.0,(float) 4.0};
		printArray(multiElementFloatArray);

		//Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		//Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4,	5.5, 6.6, 7.7 };
		//Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
		//System.out.println("Array integerArray contains:");
		//printArray(integerArray);
		//System.out.println("\nArray doubleArray contains:");
		//printArray(doubleArray);
		//System.out.println("\nArray characterArray contains:");
		//printArray(characterArray);
	}
	/*public static void printArray(Integer inputArray) {
		for (Integer element : inputArray){
			System.out.printf("%s ", element);
			
		}
	}
	public static void printArray(Double[] inputArray) {
		for (Double element : inputArray){
			System.out.printf("%s ", element);
			
		}
	}
	public static void printArray(Character[] inputArray) {
		for (Character element : inputArray){
			System.out.printf("%s ", element);
			
		}
	}*/
	public static void printArray(int[] array) { 
		for (Integer element : array){
			System.out.printf("a%s ", element);
			
		}
		System.out.println();
	}

	public static void printArray(double[] array) { 
		for (Double element : array){
			System.out.printf("a%s ", element);
			
		}
		System.out.println();
	}
	public static void printArray(float[] array) { 
		for (Float element : array){
			System.out.printf("a%s ", element);
			
		}
		System.out.println();
	}
}

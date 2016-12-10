import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4}; 
		//int[] arr2 = {3,4,4}; 
		//int[] arr3 = {5,4,6}; 
		//int[] arr4 = {5,4,6}; 
		System.out.println(copyOf(arr1)); //[1, 2, 4] 
		System.out.println(copyOf(arr1,7)); //[1, 2, 4, 0, 0, 0, 0] 
	}
	public static String copyOf(int[] array) {
		int[] copied = Arrays.copyOf(array, array.length); 
		String str = Arrays.toString(copied);
		return str;
		
	}
	public static String copyOf(int[] array, int newLength) {
		int[] copied = Arrays.copyOf(array, newLength); 
		String str = Arrays.toString(copied);
		return str;
		
	}

}

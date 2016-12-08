import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4}; 
		int[] arr2 = {3,4,4}; 
		int[] arr3 = {5,4,6}; 
		int[] arr4 = {5,4,6}; 
		System.out.println(equals(arr1,arr2)); //false 
		System.out.println(equals(arr3,arr4)); //true 

	}
	public static boolean equals(int[] array1, int[] array2) {
		if (array1.length == array2.length) {
			boolean areEqual = Arrays.equals((array1), (array2));
			return  areEqual;
		}
		return false;
	}
}

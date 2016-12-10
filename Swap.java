import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,4}; 
		int[] arr2 = {3,4,4}; 
		int[] arr3 = {4,5,6}; 
		int[] arr4 = {1,2,3}; 
		swap(arr1,arr2); //[3, 4, 4] [1, 2, 4, 4] 
		swap(arr3,arr4); //[5, 4, 6] [5, 4, 6] 
		swap2(arr1,arr2); //false
		swap2(arr3,arr4); //true [1, 4, 6] [5, 4, 6] 

	}
	public static void swap(int[] array1, int[] array2) {
		//simple swap of strings :P
		String str1 = Arrays.toString(array2);
		String str2 = Arrays.toString(array1);
		System.out.println(str1 +" "+ str2);


	}
	public static boolean swap2(int[] array1, int[] array2) {
		//swap their contents if they have the same length. 
		//It shall return true if the contents are successfully swapped. 
		if (array1.length == array2 .length) {
			System.out.println("Metod 2 with length check:");
			int [] org1 = array1;
			int [] org2 = array2;
			int[] temp = array1;
			array1 = array2;
			array2 = temp;

			String str1 = Arrays.toString(array1);
			String str2 = Arrays.toString(array2);
			System.out.println(Arrays.toString(org1) +" "+ Arrays.toString(org2) + " => " + str1 +" "+ str2);
			return true;
		}
		return false;


	}

}

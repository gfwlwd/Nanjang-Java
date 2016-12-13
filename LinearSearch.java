
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr1= {23,45,21,55,234,1,34,90};
		int searchKey = 34;
		System.out.println("Key "+searchKey+" found at index: "+linearSearch(arr1, searchKey)); // returns index of array

		int[] arr2= {123,234,345,456,567,678,789,34};
		searchKey = 321;
		System.out.println("Key "+searchKey+" found in array = "+linearSearchB(arr2, searchKey)); // returns true or false
	}
	// Return the array index, if key is found; or -1 otherwise
	public static int linearSearch(int[] array, int key) {
		int size = array.length;
		for(int i=0;i<size;i++){
			if(array[i] == key){
				return i;
			}
		}
		return -1;
	}
	// or
	// Return true if the key is found
	public static boolean linearSearchB(int[] array, int key) {
		int size = array.length;
		for(int i=0;i<size;i++){
			if(array[i] == key){
				return true;
			}
		}
		return false;

	}
}

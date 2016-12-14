import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		selectionSort(new int[] {0,2,4,1,3});
		selectionSort(new int[] {5,90,35,45,150,3});

	}
	public static void selectionSort(int[] array) {
		//prints array
		System.out.println("Array before Selection Sort");
		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int maxIndex = array.length;

		for (int i = 0; i < array.length; i++) {  	// loop form index 0 till end              

			int minIndex = i;

			for (int j = i + 1; j < maxIndex; j++) { 
				if (array[j] < array[minIndex]) { 
					//System.out.println(j);
					minIndex = j;
				}

			}
			 for (int m = maxIndex; m > minIndex; m--) {
				 System.out.println(array[m-1]);
				 
			 }
			System.out.println(Arrays.toString(array));
			System.out.println("minindex "+(minIndex)+" = " + array[minIndex]);
			System.out.println("maxindex "+(maxIndex)+" = " + array[maxIndex-1]);
			
			//Swap numbers in the given array
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;	
		}
		//prints array
		System.out.println("Array after Selection Sort");
		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
/*In pseudocode, the algorithm is the following:

    Initialize a minIndex index variable which points to the beginning of the array (where the minimum values will be placed).
    Initialize a min variable of the array item type with the value at minIndex. This variable will contain the minimum item value in the array (it may not contain it at first, but will eventually do so).
    Initialize a newMinIndex index variable with minIndex+1. This variable contains the location where the found minimum items will be placed during the pass.
    For each item in the array from the item at minIndex+1 to the end of the array, if the item is less or equal to min do:
        If the item is less than min, assign the item to min and assign minIndex to newMinIndex.
        Swap the item at the current location with the item at newMinIndex.
        Increase newMinIndex by one. 
    Assign newMinIndex to minIndex.
    If minIndex is still inside the array, jump to step 2. */
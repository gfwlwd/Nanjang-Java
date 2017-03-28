import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		selectionSort(new int[] {0,2,4,1,3});
		selectionSort(new int[] {5,90,35,45,150,3});
		selectionSort(new int[] {6,5,4,3,2,1});
		selectionSort(new int[] {1,2,3,4,5,6,7});


	}
	public static void selectionSort(int[] array) {
		//prints array
		System.out.println("Array before Selection Sort");
		/*for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();*/
		int maxIndex = array.length;

		for (int i = 0; i < array.length/2+1; i++) {  	// loop form index 0 till end              

			int minIndex = i;
			int max= 0;
			int maxIndexNo = 0;
			System.out.println(Arrays.toString(array));
			for (int j = i ; j < maxIndex; j++) { 
				if (array[j] < array[minIndex]) { 
					//System.out.println("min = " + array[j]);
					minIndex = j;
				}
				else if (array[j] > max) { 
					//System.out.println(" max = " + array[j]);
					max = array[j];
					maxIndexNo = j;
				}
			}

			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;	
			
			if (i != 0) { // wont work if i=0 and highest value is at 0
				int temp2 = array[maxIndex-1];
				array[maxIndex-1] = array[maxIndexNo];
				array[maxIndexNo]= temp2;
			}
		}
		//prints array as string
		System.out.println("Array after Selection Sort");
		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
}
// TODO:
// for (int i = 0; i < array.length/2+1; i++) { 
// int start = array.length;
//  for (start=i; start < end; start++ ) {
// check max and min
// } // end for
//
//} // end for


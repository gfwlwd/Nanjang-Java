
public class BubbleSort {

	public static void main(String[] args) {

		bubbleSort(new int[] {9,2,4,1,5});
		bubbleSort(new int[] {5,90,35,45,150,3});
	}
	public static void bubbleSort(int[] array) {
		int count = 0;
		// n = length(A)
		int n = array.length;
		System.out.println("Array before Bubble Sort");
		for(int i=0; i < n; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//  boolean swapped    /* boolean flag to indicate swapping occurred during a pass */
		boolean swapped;
		//  do  /* a pass */
		do {
			//   swapped = false  /* reset for each pass */
			swapped = false;
			//   for i = 1 to n-1
			for (int i = 1; i <= n-1; i++) {
				//  /* if this pair is out of order */
				// if A[i-1] > A[i] then
				if (array[i-1] > array[i]) {
					//  /* swap them and take note something changed */
					//swap( A[i-1], A[i] )
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					//  swapped = true
					swapped = true;

				} //  end if

			} //  end for
			//   n = n - 1  /* One item sorted after each pass */
			count++;
			for(int i=0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println("= Pass "+count);
			n = n - 1; 
		} // end do
		//  while (swapped)  /* repeat another pass if swapping occurred */
		while (swapped);
		// print result
		System.out.println("Array after Bubble Sort");
		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}

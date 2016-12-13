
public class BinarySearch {

	public static void main(String[] args) {
		// Method 1 returns true or false
		System.out.println(binarySearch1(new int[] {11,14,16,18,20,25,28,30,34,40,45},18));// true
		System.out.println(binarySearch1(new int[] {11,14,16,18,20,25,28,30,34,40,45},18, 0, 10));// true
		System.out.println(binarySearch1(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 },12));// true
		System.out.println(binarySearch1(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 },112));// false (not found)
		// Method 2 returns a int for position in array
		System.out.println(binarySearch2(new int[] {11,14,16,18,20,25,28,30,34,40,45},18));// position: 3
		System.out.println(binarySearch2(new int[] {11,14,16,18,20,25,28,30,34,40,45},18, 0 ,10));// position: 3
		System.out.println(binarySearch2(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 },12)); //position: 6
		System.out.println(binarySearch2(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 },112)); //position: -1 (not found)
	}
	public static boolean binarySearch1(int[] array, int key) {
		return binarySearch1(array, key, 0, array.length-1); //add fromIdx and toIdx if not submitted
	}
	// Return true if key is found in the array in the range of fromIdx (inclusive), toIdx (exclusive)
	public static boolean binarySearch1(int[] array, int key, int fromIdx, int toIdx) {
		// If fromIdx = toIdx - 1   /* one-element list */
		if (fromIdx == toIdx - 1) {
			// 	if key = A[fromIdx], return true
			if (key == array[fromIdx]) {
				return true;
			}
			//	 else, return false (not found)
			else {
				return false;
			}
		}
		// else
		else {
			//	 middleIdx = (fromIdx + toIdx) / 2
			int middleIdx = (fromIdx + toIdx) / 2;
			// 		if key = A[middleIdx], return true
			if (key == array[middleIdx]) {
				return true;
			} 
			//		 else if key < A[middleIdx], toIdx = middleIdx
			else if (key < array[middleIdx]) {
				toIdx = middleIdx;
			}
			// 		else firstIdx = middleIdx + 1
			else {
				fromIdx = middleIdx + 1;
			}
			// binarySearch(array, key, fromIdx, toIdx)
			return binarySearch1(array, key, fromIdx, toIdx);
		}
	}

	//Method 2
	public static int binarySearch2(int[] array, int key) {
		return binarySearch2(array, key, 0, array.length-1); //add fromIdx and toIdx if not submitted
	}
	public static int binarySearch2(int[] array, int key, int fromIdx, int toIdx) {
		int middle = (fromIdx + toIdx) / 2;
		if(toIdx < fromIdx) {
			return -1;
		} 

		if(key==array[middle]) {
			return middle;
		} else if(key<array[middle]) {
			return binarySearch2(array, key, fromIdx, middle - 1);
		} else {
			return binarySearch2(array, key, middle + 1, toIdx);
		}
	}
}

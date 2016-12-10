<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

public class Search {
	public static void main(String[] args) {
		//Integer[] array = new Integer[]{1, 2, 3, 4, 5};
		//int[] array = new int[]{9,6,3,6,4,5,5,7}; 
		//System.out.println(search(array,3)); //pos 3
		//System.out.println(search(array,12)); //pos -1
		//search(array,12);
		//search(array,23);
		//search(array,9);
		int index = search(new int[]{87,43,64,42,65,87,12}, 42);
		System.out.println(index);//Print 3
		index = search(new int[]{87,43,64,42,65,87,12}, 87);
		System.out.println(index);//print 0
		index = search(new int[]{87,43,64,42,65,87,12}, 99);
		System.out.println(index);//print -1


	}
	private static int search(int[] array, int number) {

		int index = -1;

		for(int i=0;i<array.length;i++)
		{
			if (array[i]== number) {
				//System.out.println("Index " + i + " = " + array[i]);
				index = i;

				break;
			} 
		}


		return index;
	}
	// final int index = Arrays.asList(array).indexOf(number+1); 
	// return index;
}

=======
import java.util.Arrays;
import java.util.List;

public class Search {
	public static void main(String[] args) {
		//Integer[] array = new Integer[]{1, 2, 3, 4, 5};
		//int[] array = new int[]{9,6,3,6,4,5,5,7}; 
		//System.out.println(search(array,3)); //pos 3
		//System.out.println(search(array,12)); //pos -1
		//search(array,12);
		//search(array,23);
		//search(array,9);
		int index = search(new int[]{87,43,64,42,65,87,12}, 42);
		System.out.println(index);//Print 3
		index = search(new int[]{87,43,64,42,65,87,12}, 87);
		System.out.println(index);//print 0
		index = search(new int[]{87,43,64,42,65,87,12}, 99);
		System.out.println(index);//print -1


	}
	private static int search(int[] array, int number) {

		int index = -1;

		for(int i=0;i<array.length;i++)
		{
			if (array[i]== number) {
				//System.out.println("Index " + i + " = " + array[i]);
				index = i;

				break;
			} 
		}


		return index;
	}
	// final int index = Arrays.asList(array).indexOf(number+1); 
	// return index;
}

>>>>>>> refs/remotes/origin/java

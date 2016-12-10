<<<<<<< HEAD
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Reverse {


	public static void main(String[] args) {
		Integer[] array = new Integer[]{1, 2, 3, 4, 5};
		reverse(array); 
	}
	public static void reverse(Integer[] array) {
		List<Integer> list = Arrays.asList(array);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		/* for(int i = 0; i < array.length / 2; i++) {
		 * int tmp     = array[i];
		 * array[i] = array[array.length - i -1];
		 * array[array.length - i - 1] = tmp;
		 * }
		 */
	}

}
=======
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Reverse {


	public static void main(String[] args) {
		Integer[] array = new Integer[]{1, 2, 3, 4, 5};
		reverse(array); 
	}
	public static void reverse(Integer[] array) {
		List<Integer> list = Arrays.asList(array);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		/* for(int i = 0; i < array.length / 2; i++) {
		 * int tmp     = array[i];
		 * array[i] = array[array.length - i -1];
		 * array[array.length - i - 1] = tmp;
		 * }
		 */
	}

}
>>>>>>> origin/java

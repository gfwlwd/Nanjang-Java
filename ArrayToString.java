
import java.util.Arrays;

public class ArrayToString {

	public static void main(String args[]){

		int[] array = new int[]{1, 2, 3, 4, 5};
		System.out.println(arrayToString(array));

	}
	public static String arrayToString(int[] array) {
		String str = Arrays.toString(array);
		String strFormat = str.replaceAll("\\d", "a$0").replace("[", "{").replace("]", "}");

		return strFormat;


	}
}

/* Output:
 * {a1, a2, a3, a4, a5}
 */

<<<<<<< HEAD

public class Contains {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5};
		System.out.println(contains(array,5)); //true
		System.out.println(contains(array,12)); //false

	}
	public static boolean contains(int[] array, int number) {
		
		for (int n : array) {
			if (number == n) {
				return true;
			};

		}
		return false;
	}
=======

public class Contains {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5};
		System.out.println(contains(array,5)); //true
		System.out.println(contains(array,12)); //false

	}
	public static boolean contains(int[] array, int number) {
		
		for (int n : array) {
			if (number == n) {
				return true;
			};

		}
		return false;
	}
>>>>>>> origin/java
}
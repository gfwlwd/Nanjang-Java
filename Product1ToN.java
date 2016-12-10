<<<<<<< HEAD
public class Product1ToN {

	public static void main(String[] args)
	{
		productInt(1, 10);
		productInt(1, 11);
		productInt(1, 12);
		productInt(1, 13);
		productInt(1, 14);

		productLong(1, 10);
		productLong(1, 11);
		productLong(1, 12);
		productLong(1, 13);
		productLong(1, 14);
	}

	private static void productInt(int low, int high)
	{
		int prod = low;
		for(int i=low; i <= high; i++) {
			prod *= i;
		}
		System.out.println("Product of " + low + " to " + high + " in int = " + prod + ".");
		//1932053504 @13

	}

	private static void productLong(int low, int high)
	{
		long prod = low;
		for(int i=low; i <= high; i++) {
			prod *= i;
		}
		System.out.println("Product of " + low + " to " + high + " in long = " + prod + ".");
		//6227020800 @13
	}
=======
public class Product1ToN {

	public static void main(String[] args)
	{
		productInt(1, 10);
		productInt(1, 11);
		productInt(1, 12);
		productInt(1, 13);
		productInt(1, 14);

		productLong(1, 10);
		productLong(1, 11);
		productLong(1, 12);
		productLong(1, 13);
		productLong(1, 14);
	}

	private static void productInt(int low, int high)
	{
		int prod = low;
		for(int i=low; i <= high; i++) {
			prod *= i;
		}
		System.out.println("Product of " + low + " to " + high + " in int = " + prod + ".");
		//1932053504 @13

	}

	private static void productLong(int low, int high)
	{
		long prod = low;
		for(int i=low; i <= high; i++) {
			prod *= i;
		}
		System.out.println("Product of " + low + " to " + high + " in long = " + prod + ".");
		//6227020800 @13
	}
>>>>>>> refs/remotes/origin/java
}
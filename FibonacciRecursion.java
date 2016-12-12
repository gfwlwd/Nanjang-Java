
public class FibonacciRecursion {

	public static void main(String[] args) {
		System.out.println(fibonacci(1)); // 1
		System.out.println(fibonacci(2)); // 1
		System.out.println(fibonacci(3)); // 2
		System.out.println(fibonacci(4)); // 3
		System.out.println(fibonacci(5)); // 5
		System.out.println(fibonacci(6)); // 8
		System.out.println(fibonacci(7)); // 13
		System.out.println(fibonacci(8)); // 21
		System.out.println(fibonacci(9)); // 34
	}
	public static long fibonacci (long n)
    {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        return (fibonacci(n - 1) + fibonacci(n - 2));
       
    }
}

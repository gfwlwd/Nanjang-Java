
public class OddTest {

	public static void main(String[] args) {
		System.out.println(isOdd(-1)?"TRUE":"FALSE");
	}
	public static boolean isOdd(int number) {
		if (number % 2 == 0) 
		{
			return false;
		}
		return true;
	}

}

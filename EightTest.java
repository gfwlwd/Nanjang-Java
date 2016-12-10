
public class EightTest {

	public static void main(String[] args) {
		System.out.println(hasEight(-808));

	}
	public static boolean hasEight(int number) {

		if (String.valueOf(number).contains("8")) {
			return true;
		}
		return false;
	}
}

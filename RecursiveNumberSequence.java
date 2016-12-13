
public class RecursiveNumberSequence {
	public static String s = "";
	public static void main(String[] args) {

		System.out.println(sequence(11));
		System.out.println(iterative(11));
	}
	public static int sequence (int n)
	{ 
		if (n ==0) {  
			System.out.print(s +" Length is ");
			int sLength = (s.length());;
			return sLength;
		}
		s = n + s;
		//System.out.println(s);
		return sequence ( n - 1) ;

	}
	public static int iterative (int n) {
		String str = "";
		for (int i = 1 ; i <= n ; i++) {
			str += i;

		}
		System.out.print(str +" Length is ");

		int strLength = (str.length());;
		return strLength;
	}
}

import java.io.*;

public class CheckVowelsDigits {

	public static void main(String args[]) throws IOException {
		String str;
		int vowels = 0, digits = 0, spaces = 0, others = 0;
		char ch;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String : ");
		str = br.readLine();

		for (int i = 0; i < str.length(); i ++) 		{
			ch = str.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
					ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else if (Character.isDigit(ch))
				digits ++;
			else if (Character.isWhitespace(ch)) {
				spaces ++; 
				}
			else { 
				others++;
				}
		}
		double total = vowels + digits + spaces + others;
		System.out.printf("Total : " + total + " (%1$.2f%%) \n", 100/total*total+0.00 );
		System.out.printf("Number of vowels : " + vowels + " (%1$.2f%%) \n", 100/total*vowels+0.00 );
		System.out.printf("Number of digits: : " + digits + " (%1$.2f%%) \n", 100/total*digits+0.00 );
		System.out.printf("Number of others: : " + others + " (%1$.2f%%) \n", 100/total*others+0.00 );
		System.out.printf("Number of spaces : " + spaces + " (%1$.2f%%) \n", 100/total*spaces+0.00 );
	}
}
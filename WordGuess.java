import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

	private final static String[] words = {
			"testing", "hello", "world", "template", "java"
			,   "maining", "computer", "processor", "univercity"
			,   "boolean", "string", "integer", "character"
			,   "indicator", "controller", "model", "view"
	};

	private static String secretWord;

	private static boolean[] secretWordMatches;

	public static void main(String[] args)
	{ 
		

		setSecretWord();
		runGame();
	}

	private static void setSecretWord(String word) {
		secretWord = word;
	}

	private static void setSecretWord() {
		Random rand = new Random();        
		secretWord = words[rand.nextInt(words.length-1)];
	}

	private String getSecretWord() {
		return secretWord;
	}

	private static String getTrialWordWithMatches()
	{
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < secretWord.length(); i++) {
			str.append( (secretWordMatches[i] ? secretWord.charAt(i) : '_') );
		}
		return str.toString();
	}


	private static void checkTrialWord(char ch)
	{
		for (int i = 0; i < secretWord.length(); i++)
		{
			if (secretWordMatches[i]) {
				continue;
			}
			secretWordMatches[i] = secretWord.charAt(i) == ch;
		}        
	}

	private static void runGame()
	{
		Scanner in = new Scanner(System.in);        
		secretWordMatches = new boolean[secretWord.length()];                
		int trials = 0;
		while (true) {
			System.out.print("Key in one character or your guess word: ");
			String trialWord = (in.hasNext()) ? in.next() : "";

			trials++;

			if (trialWord.length() < 1) {
				continue;
			}

			if (trialWord.length() == 1) {                
				checkTrialWord(trialWord.charAt(0));
				trialWord = getTrialWordWithMatches();
				System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);

			}

			if (trialWord.equals(secretWord)) {
				System.out.printf("Trail %d: Congratulation!\n", trials);
				break;
			}
		}
		System.out.printf("You got in %d trials\n", trials);
	}
}
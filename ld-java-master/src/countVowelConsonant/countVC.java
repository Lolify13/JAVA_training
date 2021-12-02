package countVowelConsonant;

import java.util.Scanner;

public class countVC {

	public static void main(String[] args) {

		int vCount = 0, cCount = 0, sCount = 0, spCount = 0, lcCount = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your word/s: ");
		String str = scanner.nextLine();
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			// Checks whether a character is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// Increments the vowel counter
				vCount++;
			}

			// Checks whether a character is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				// Increments the consonant counter
				cCount++;

			} // counts the white spaces
			else if (str.charAt(i) == ' ') {
				// increments white space counter
				sCount++;
			} // counts special characters
			else if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
				// Increments the special char counter
				spCount++;

			}
			


		}

		scanner.close();

		System.out.println("NUMBER OF VOWELS " + vCount);
		System.out.println("NUMBER OF CONSONANTS " + cCount);
		System.out.println("NUMBER OF SPECIAL CHARACTERS " + (spCount));
		System.out.println("NUMBER OF SPACES: " + (sCount));

	}

}

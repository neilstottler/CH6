import java.util.Scanner;
public class PROB20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();

		System.out.println("Number of letters in the string " + string + " is " + countLetters(string));
	}
	public static int countLetters(String s) {
		int numberOfLetters = 0; // Counts the number of letters
		for (int i = 0; i < s.length(); i++) {
			// Test if character is a letter
			if (Character.isLetter(s.charAt(i)))
				numberOfLetters++; // Increment the number of letters
		}
		return numberOfLetters;
	}
}
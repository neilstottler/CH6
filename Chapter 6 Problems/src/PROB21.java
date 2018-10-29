import java.util.Scanner;
public class PROB21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string = scanner.nextLine();

		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
			} else {
				System.out.print(string.charAt(i));
			}
			System.out.println();
		}

	}

	public static int getNumber(char uppercaseLetter) {
		// TODO Auto-generated method stub
		if (uppercaseLetter >= 'W')
			return 9;
		else if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'P')
			return 7;
		else if (uppercaseLetter >= 'M')
			return 6;
		else if (uppercaseLetter >= 'J')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}


}

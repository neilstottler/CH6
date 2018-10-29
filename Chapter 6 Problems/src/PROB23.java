import java.util.Scanner;
public class PROB23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scanner.nextLine();
		System.out.print("Enter a character: ");
		char ch = scanner.next().charAt(0);

		System.out.println("The number of occurrences of \'" + ch +"\' in \"" + s + "\" is " + count(s,ch));
	}
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) count++;
		}
		return count;
	}

}

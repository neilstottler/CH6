import java.util.Scanner;
public class PROB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		displayPattern(num);


	}

	private static void displayPattern(int n) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= n; row++) {
			for (int formatter = 1; formatter <= n - row; formatter++) {
				System.out.printf("%4s", "");
			}
			for (int column = row; column >= 1; column--) {
				System.out.printf("%4d", column);
			}
			System.out.println();
		}

	}

}

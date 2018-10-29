import java.util.Scanner;
public class PROB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Display an integer reversed: ");
		
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		
		reverse(number);
	}

	private static void reverse(int number) {
		// TODO Auto-generated method stub
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}

}

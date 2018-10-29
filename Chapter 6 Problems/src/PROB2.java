import java.util.Scanner;
public class PROB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an interger: ");
		long num = scanner.nextLong();
		
		System.out.println("The sum of DIGITS is " + sumDigits(num));
	}

	private static int sumDigits(long n) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		while (n != 0) {
			sum += n %10;
			n /= 10;
		}
		return sum;
	}

}

import java.util.Scanner;
public class PROB17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter n");
		int n = scanner.nextInt();
				
		printMatrix(3);
	}
	public static void printMatrix(int n) {
		for (int column = 0; column < n; column++) {
			for (int row = 0; row < n; row++) {
				System.out.printf("%1d ", (int)(Math.random() * 2));
			}
			System.out.println("");
		}
	}

}

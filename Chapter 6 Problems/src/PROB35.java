import java.util.Scanner;
public class PROB35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the side: ");

		double side = scanner.nextDouble();

		System.out.println("The area of the pentagon is " + area(side));
	}
	public static double area(double side) {
		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
	}
}

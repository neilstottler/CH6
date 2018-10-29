import java.util.Scanner;
public class PROB19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter 3 sides of a triangle: ");
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();

		System.out.println(isValid(side1, side2, side3) ? 
				"The area of the triangle is " + area(side1, side2, side3) :
				"Input is invalid");
	}
	public static boolean isValid(
			double side1, double side2, double side3) {
		boolean valid =
				side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
				return valid;
	}
	public static double area(
			double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
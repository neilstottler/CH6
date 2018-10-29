import java.util.Scanner;
public class PROB36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        System.out.println("The area of the pentagon is " + area(n, side));


    }

    public static double area(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
}
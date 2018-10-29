import java.util.Scanner;
public class PROB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three numbers");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();

		displaySortedNumbers(number1, number2, number3);
	}

	private static void displaySortedNumbers(double number1, double number2, double number3) {
		// TODO Auto-generated method stub

		double temp;

		if (number2 < number1 && number2 < number3){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		else if (number3 < number1 && number3 < number2) {
			temp = number1; 
			number1 = number3;
			number3 = temp;
		}
		if (number3 < number2) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}



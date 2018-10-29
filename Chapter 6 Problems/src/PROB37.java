import java.util.Scanner;
public class PROB37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number and its width: ");
		int number = scanner.nextInt();
		int width = scanner.nextInt();
		
		System.out.println(number + " formatted to width " + width + " : " + format(number, width));
	}
	public static String format(int number, int width) {
		String num = number + "";
		if (num.length() < width) {
			for(int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}

}

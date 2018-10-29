import java.util.Scanner;
public class PROB25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter milliseconds");
		long millis = scanner.nextLong();
		
		System.out.println("Hours:minutes:seconds: " + convertMillis(millis));
	}
	public static String convertMillis(long millis) {
		millis /= 1000;
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		return millis + currentMinuteAndSecond;
	}

}

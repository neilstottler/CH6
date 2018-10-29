
public class PROB13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%-10s%8s\n", "i", "m(i)");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-10d%10.4f\n", i, sumSeries(i));
		}
	}

	public static double sumSeries(int n) {
		// TODO Auto-generated method stub

		double sum = 0;

		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;		
	}

}

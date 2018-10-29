
public class PROB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 101; i++) {
			
			System.out.printf("%10s", (i % 8 != 0) ? getPentagonalNumber(i) + "  " : getPentagonalNumber(i) + "\n");
			
		}
	}

	public static int getPentagonalNumber(int n) {
		// TODO Auto-generated method stub
		return n * (3 * n - 1) / 2;
	}

}

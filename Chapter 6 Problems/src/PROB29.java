
public class PROB29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 1000; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
	}
	public static boolean isPrime(long n) {
		if (n < 2) return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}

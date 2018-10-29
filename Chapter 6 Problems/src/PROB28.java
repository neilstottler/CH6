
public class PROB28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.printf("%-10s%7s\n", "P", "2 * P -1");
	        for (int i = 2; i <= 31; i++) {
	            if (isPrime(i)) {
	                System.out.printf("%-10d%-10d\n", i, getMersennePrime(i));
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
	    public static int getMersennePrime(int p) {
	        return (int)Math.pow(2, p) - 1;
	    }
	}


public class PROB32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wins = 0;
		for (int i = 0; i < 10000; i++) {
			int roll1 = rollDie();
			int roll2 = rollDie();
			if (getStats(roll1 + roll2).equals("You win.")) {
				wins++;
			}
		}
		System.out.println("The total number of wins: " + wins);
	}
	public static String getStats(int n) {
		if (n == 7 || n == 11) return "You win.";
		if (n == 2 || n == 3 || n == 12) return "You lose.";
		
		return "point is" + n ;
	}
	
	public static int rollDie() {
		return (int) (Math.random() * 6 + 1);
	}

}

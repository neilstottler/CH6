
public class PROB11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%12s%15s\n", "Sales Amount", "Commission");
		for (int i = 10000; i <= 100000; i += 5000) {
			
				System.out.printf("%-6d%20.1f\n", i, computeCommission(i));
		}
	}

	public static double computeCommission(double salesAmount) {
		// TODO Auto-generated method stub
		double commission;
		if (salesAmount >= 10000.01) commission = 900.0 + (salesAmount - 10000.0) * 12.0;
		else if (salesAmount >= 5000.01) commission = 400.0 + (salesAmount - 5000.0) * 0.1;
		else commission = salesAmount * 0.08;
		
		return commission;
	}

}

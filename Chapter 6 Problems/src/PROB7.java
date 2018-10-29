import java.util.Scanner;
public class PROB7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        System.out.printf("%3s%20s\n", "Years", "Future Value");
        for (int i = 1; i <= years; i++) {

            System.out.printf("%-4d%20.2f\n", i, futureInvestmentValue(investmentAmount, annualInterestRate / 12, i));


        }

    }

    public static double futureInvestmentValue
            (double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount *  Math.pow((1 + monthlyInterestRate), (years * 12));
    }
}
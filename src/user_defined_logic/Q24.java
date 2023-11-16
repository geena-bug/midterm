package user_defined_logic;
import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for investment amount and interest rate
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Print table header
        System.out.println("Years\tFuture Value");
        System.out.println("------------------");

        // Calculate and display future value for years from 1 to 30
        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%-5d\t%.2f%n", years, futureValue);
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // Calculate future investment value using the formula
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}


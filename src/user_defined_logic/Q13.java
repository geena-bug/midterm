package user_defined_logic;
public class Q13 {

    public static void main(String[] args) {
        // declare loan amount
        double loanAmount = 20000.0;
        // declare the number of years for the loan
        int numberOfYears = 5;
        // declare value for annual interest rate (10% in this case)
        double annualInterestRate = 0.10;

        double monthlyPayment = calculateMonthlyPayment(loanAmount, numberOfYears, annualInterestRate);
        System.out.println("Monthly payment: $" + monthlyPayment);
    }

    public static double calculateMonthlyPayment(double loanAmount, int numberOfYears, double annualInterestRate) {
        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfPayments = numberOfYears * 12;

        double denominator = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / denominator;

        return monthlyPayment;
    }
}


package Midtermprep;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Create a QuadraticEquation object
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Display the result based on the discriminant
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            // Two real roots
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } else if (discriminant == 0) {
            // One real root
            System.out.println("Root: " + equation.getRoot1());
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }
    }
}

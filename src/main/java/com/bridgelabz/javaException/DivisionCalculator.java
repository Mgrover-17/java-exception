package com.bridgelabz.javaException;
import java.util.*;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");
        }
        finally {
            System.out.println("Program execution completed.");
        }
    }
}

package com.bridgelabz.javaException;
import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
        finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

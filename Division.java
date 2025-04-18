//Division.java

import java.util.Scanner;

public class Division {
      // Method to perform division of two numbers with divide-by-zero check
    public static void performDivision(Scanner sc) {
        try {
            System.out.print("Enter numerator: ");
            double a = sc.nextDouble();

            System.out.print("Enter denominator: ");
            double b = sc.nextDouble();

            // Prevent division by zero
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            double result = a / b;
            System.out.println("Result = " + result);
          } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in division: " + e.getMessage());
        }
    }
}





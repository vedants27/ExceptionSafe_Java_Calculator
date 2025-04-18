//SquareRoot.java

import java.util.Scanner;

public class SquareRoot {
      // Method to calculate square root with negative number check
    public static void performSquareRoot(Scanner sc) {
        try {
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();

            // Cannot calculate square root of negative number
            if (a < 0) {
                throw new ArithmeticException("Cannot compute square root of a negative number.");
            }

            double result = Math.sqrt(a);
            System.out.println("Square Root = " + result);
                      } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in calculating square root: " + e.getMessage());
        }
    }
}



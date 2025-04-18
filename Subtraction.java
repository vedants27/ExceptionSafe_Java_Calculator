import java.util.Scanner;

public class Subtraction {
    // Method to perform subtraction of two numbers
    public static void performSubtraction(Scanner sc) {
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = a - b;
            System.out.println("Result = " + result);
                    } catch (Exception e) {
            System.out.println("Error in subtraction: " + e.getMessage());
        }
    }
}



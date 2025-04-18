// Addition.java
import java.util.Scanner;

public class Addition { 
     // Method to perform addition of two numbers
    public static void performAddition(Scanner sc) {
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = a + b;
            System.out.println("Result = " + result);

 

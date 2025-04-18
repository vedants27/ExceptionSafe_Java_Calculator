//Multiplication.java
import java.util.Scanner;

public class Multiplication {
    // Method to perform multiplication of two numbers
    public static void performMultiplication(Scanner sc) {
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = a * b;
            System.out.println("Result = " + result);

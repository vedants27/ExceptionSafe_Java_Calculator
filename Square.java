//Square.java

import java.util.Scanner;

public class Square {
    // Method to calculate the square of a number
    public static void performSquare(Scanner sc) {
        try {
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();

            double result = a * a;
            System.out.println("Square = " + result);

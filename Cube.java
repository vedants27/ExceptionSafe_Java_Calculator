//Cube.java

import java.util.Scanner;

public class Cube {
    // Method to calculate the cube of a number
    public static void performCube(Scanner sc) {
        try {
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();

            double result = a * a * a;
            System.out.println("Cube = " + result);
            } catch (Exception e) {
            System.out.println("Error in calculating cube: " + e.getMessage());
        }
    }
}



// Name: Vedant Shitole
// PRN: 23070126143
// Batch: AIML B3

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to read user input
        int choice;

                // Menu loop: keep running until user selects Exit
        do {
            // Displaying menu options
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                // Reading user's choice
                choice = sc.nextInt();

                // Call appropriate class method based on user choice
                switch (choice) {
                    case 1:
                        Addition.performAddition(sc);
                        break;
                    case 2:
                        Subtraction.performSubtraction(sc);
                        break;
                    case 3:
                        Multiplication.performMultiplication(sc);
                        break;
                    case 4:
                        Division.performDivision(sc);
                        break;
                    case 5:
                        Square.performSquare(sc);
                        break;
                    case 6:
                        Cube.performCube(sc);
                        break;
                    case 7:
                        SquareRoot.performSquareRoot(sc);
                        break;
                    case 8:
                        System.out.println("Exiting the Calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please select from 1 to 8.");
                }
                            } catch (InputMismatchException e) {
                // Handles non-integer inputs
                System.out.println("Invalid input! Please enter numeric values.");
                sc.next(); // Clear invalid input
                choice = 0; // Reset choice to continue loop
            }





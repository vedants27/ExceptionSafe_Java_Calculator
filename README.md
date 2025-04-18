# ExceptionSafe_Java_Calculator

A Java-based calculator that performs basic and advanced mathematical operations such as Addition, Subtraction, Multiplication, Division, Square, Cube, and Square Root. The project demonstrates good software engineering practices including exception handling, modularization, and documentation.


##  Project Structure

Each arithmetic operation is implemented in a **separate Java file** and encapsulated within a **dedicated class**. This approach ensures clean separation of concerns and ease of maintainability.



##  Functionalities & Class Descriptions

| Functionality |  Class         |  Method Name                  |  Description |
|------------------|------------------|--------------------------------|----------------|
| Addition         | `Addition.java`  | `performAddition(Scanner sc)`  | Adds two numbers input by the user. Handles input exceptions. |
| Subtraction      | `Subtraction.java`| `performSubtraction(Scanner sc)` | Subtracts the second number from the first. |
| Multiplication   | `Multiplication.java` | `performMultiplication(Scanner sc)` | Multiplies two input numbers. |
| Division         | `Division.java`  | `performDivision(Scanner sc)`  | Divides two numbers with proper handling for divide-by-zero cases using `ArithmeticException`. |
| Square           | `Square.java`    | `performSquare(Scanner sc)`    | Calculates the square of a single number. |
| Cube             | `Cube.java`      | `performCube(Scanner sc)`      | Calculates the cube of a single number. |
| Square Root      | `SquareRoot.java`| `performSquareRoot(Scanner sc)`| Computes the square root of a number. Throws exception for negative inputs. |
| Main Driver      | `MainCalculator.java` | `main(String[] args)`         | Displays the menu, takes user input, and calls the relevant class method accordingly. It uses `InputMismatchException` to catch invalid inputs. |



##  Highlights

-  **Separation of Concerns**: Each functionality is separated into its own file and class.
- **Robust Input Handling**: Uses Java’s inbuilt exceptions like `ArithmeticException` and `InputMismatchException` to manage runtime errors gracefully.
- **Commented Code**: Each block of logic is commented for readability and maintainability.
- **Coding Guidelines**: Follows Java naming conventions, method structuring, and clean modular design.



##  Files Included

```
 Calculator/
├── MainCalculator.java     // Main class with menu and driver logic
├── Addition.java           // Class for addition logic
├── Subtraction.java        // Class for subtraction logic
├── Multiplication.java     // Class for multiplication logic
├── Division.java           // Class for division with exception
├── Square.java             // Class for calculating square
├── Cube.java               // Class for calculating cube
├── SquareRoot.java         // Class for calculating square root with error handling
```


##  How to Compile & Run

1. Clone the Repository
git clone https://github.com/vedants27/ExceptionSafe_Java_Calculator
cd ExceptionSafe_Java_Calculator
2. Compile all Java files:
   ```bash
   javac MainCalculator.java
   ```
3. Run the program:
   ```bash
   java MainCalculator
   ```




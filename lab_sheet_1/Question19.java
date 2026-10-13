import java.util.Scanner;

// Perform an arithmetic operation selected by the entered operator.
// Sample input:
// *
// 4 6
// Sample output:
// Result: 24.0
public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Enter two numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();

        if (operator == '+') {
            System.out.println("Result: " + (first + second));
        } else if (operator == '-') {
            System.out.println("Result: " + (first - second));
        } else if (operator == '*') {
            System.out.println("Result: " + (first * second));
        } else if (operator == '/') {
            if (second == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.println("Result: " + (first / second));
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}
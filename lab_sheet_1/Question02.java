import java.util.Scanner;

// Read two integers and display the basic arithmetic operations.
// Sample input:
// 17 5
// Sample output:
// Addition: 22
// Subtraction: 12
// Multiplication: 85
// Division: 3.4
// Modulus: 2
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        if (second != 0) {
            System.out.println("Division: " + ((double) first / second));
            System.out.println("Modulus: " + (first % second));
        } else {
            System.out.println("Division: undefined (cannot divide by zero)");
            System.out.println("Modulus: undefined (cannot divide by zero)");
        }
    }
}
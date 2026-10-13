import java.util.Scanner;

// Check marriage eligibility using nested if-else conditions.
// Sample input:
// 20 F
// Sample output:
// Eligible for marriage.
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age and gender (M/F): ");
        int age = input.nextInt();
        char gender = Character.toUpperCase(input.next().charAt(0));

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage.");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible for marriage.");
            }
        } else {
            System.out.println("Invalid gender. Enter M or F.");
        }
    }
}
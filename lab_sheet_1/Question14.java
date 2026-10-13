import java.util.Scanner;

// Classify a character as a digit, uppercase/lowercase letter, or special character.
// Sample input:
// G
// Sample output:
// Uppercase letter
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        if (Character.isDigit(character)) {
            System.out.println("Digit");
        } else if (Character.isUpperCase(character)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(character)) {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Special character");
        }
    }
}
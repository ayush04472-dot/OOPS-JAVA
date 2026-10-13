import java.util.Scanner;

// Display the ASCII value of an entered character.
// Sample input:
// A
// Sample output:
// ASCII value of A: 65
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        System.out.println("ASCII value of " + character + ": " + (int) character);
    }
}
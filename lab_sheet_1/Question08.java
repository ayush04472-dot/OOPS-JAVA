import java.util.Scanner;

// Check whether an entered English letter is a vowel or consonant.
// Sample input:
// e
// Sample output:
// e is a vowel.
public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabetic character: ");
        char character = Character.toLowerCase(input.next().charAt(0));

        if (character < 'a' || character > 'z') {
            System.out.println("The entered character is not an English letter.");
        } else if (character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u') {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }
    }
}
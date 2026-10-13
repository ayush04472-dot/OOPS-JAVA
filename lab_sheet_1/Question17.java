import java.util.Scanner;

// Check whether an integer is a palindrome using arithmetic and explicit casting.
// Sample input:
// 12321
// Sample output:
// 12321 is a palindrome.
public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        long number = input.nextLong();

        if (number < 0) {
            System.out.println("Negative numbers are not palindromes in this program.");
            return;
        }

        long original = number;
        long reversed = 0;
        while (number > 0) {
            int digit = (int) (number % 10);
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
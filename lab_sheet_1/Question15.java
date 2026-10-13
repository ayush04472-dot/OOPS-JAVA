import java.util.Scanner;

// Check whether a three-digit number is an Armstrong number.
// Sample input:
// 153
// Sample output:
// 153 is an Armstrong number.
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("The number must be between 100 and 999.");
            return;
        }

        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
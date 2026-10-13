import java.util.Scanner;

// Check divisibility by both 3 and 5 using the logical AND operator.
// Sample input:
// 45
// Sample output:
// 45 is divisible by both 3 and 5.
public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }
}
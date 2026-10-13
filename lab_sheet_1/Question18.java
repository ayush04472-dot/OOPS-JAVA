import java.util.Scanner;

// Check whether an integer is prime using if-else.
// Sample input:
// 29
// Sample output:
// 29 is a prime number.
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean isPrime = number >= 2;

        for (int divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
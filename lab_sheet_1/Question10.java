import java.util.Scanner;

// Find the greater of two numbers using if-else.
// Sample input:
// 14 9
// Sample output:
// Greatest number: 14
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        if (first > second) {
            System.out.println("Greatest number: " + first);
        } else if (second > first) {
            System.out.println("Greatest number: " + second);
        } else {
            System.out.println("Both numbers are equal: " + first);
        }
    }
}
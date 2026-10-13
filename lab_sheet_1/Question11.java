import java.util.Scanner;

// Find the largest of three numbers using nested if-else.
// Sample input:
// 12 27 19
// Sample output:
// Largest number: 27
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int largest;

        if (first >= second) {
            if (first >= third) {
                largest = first;
            } else {
                largest = third;
            }
        } else {
            if (second >= third) {
                largest = second;
            } else {
                largest = third;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
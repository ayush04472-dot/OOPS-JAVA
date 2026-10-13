import java.util.Scanner;

// Demonstrate relational operators by comparing two numbers.
// Sample input:
// 8 5
// Sample output:
// 8 > 5: true
// 8 < 5: false
// 8 >= 5: true
// 8 <= 5: false
// 8 == 5: false
// 8 != 5: true
public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        System.out.println(first + " > " + second + ": " + (first > second));
        System.out.println(first + " < " + second + ": " + (first < second));
        System.out.println(first + " >= " + second + ": " + (first >= second));
        System.out.println(first + " <= " + second + ": " + (first <= second));
        System.out.println(first + " == " + second + ": " + (first == second));
        System.out.println(first + " != " + second + ": " + (first != second));
    }
}
import java.util.Scanner;

// Explicitly convert a floating-point number to an integer.
// Sample input:
// 12.75
// Sample output:
// Original value: 12.75
// Integer value: 12
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double original = input.nextDouble();
        int converted = (int) original;

        System.out.println("Original value: " + original);
        System.out.println("Integer value: " + converted);
    }
}
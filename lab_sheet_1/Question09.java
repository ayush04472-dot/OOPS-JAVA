import java.util.Scanner;

// Calculate total and percentage; pass requires at least 40 marks in every subject.
// Each subject is assumed to be marked out of 100.
// Sample input:
// 75 62 80
// Sample output:
// Total: 217/300
// Percentage: 72.33%
// Result: Pass
public class Question09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for three subjects (out of 100): ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        int total = first + second + third;
        double percentage = total / 3.0;
        System.out.println("Total: " + total + "/300");
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (first >= 40 && second >= 40 && third >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
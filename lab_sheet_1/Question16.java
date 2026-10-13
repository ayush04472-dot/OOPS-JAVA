import java.util.Scanner;

// Calculate tax using the rate for the income slab containing the full income.
// Sample input:
// 400000
// Sample output:
// Tax rate: 5%
// Tax amount: 20000.00
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual income: ");
        double income = input.nextDouble();
        double taxRate;

        if (income <= 250000) {
            taxRate = 0.0;
        } else if (income <= 500000) {
            taxRate = 0.05;
        } else if (income <= 1000000) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double tax = income * taxRate;
        System.out.printf("Tax rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Tax amount: %.2f%n", tax);
    }
}
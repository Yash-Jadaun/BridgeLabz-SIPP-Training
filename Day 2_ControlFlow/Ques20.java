import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonusPercentage = 0.05; // 5%
            // Assuming bonus is calculated on a base salary, but the problem doesn't specify.
            // For simplicity, let's just print a message about the eligibility.
            System.out.println("Employee is eligible for a 5% bonus.");
            // If you had a salary input:
            // System.out.print("Enter annual salary: ");
            // double salary = input.nextDouble();
            // double bonusAmount = salary * bonusPercentage;
            // System.out.println("Bonus amount: " + bonusAmount);
        } else {
            System.out.println("Employee is not eligible for a bonus based on years of service.");
        }
        input.close();
    }
}
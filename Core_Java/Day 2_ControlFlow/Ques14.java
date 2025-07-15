import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        long result = 1;
        int tempPower = 0; // Initialize a temporary counter for the loop

        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
        } else if (power == 0) {
            System.out.println("Result: 1");
        } else {
            while (tempPower < power) {
                result *= number;
                tempPower++;
            }
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
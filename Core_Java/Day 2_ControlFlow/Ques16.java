import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        long result = 1;

        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
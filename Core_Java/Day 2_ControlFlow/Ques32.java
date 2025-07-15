import java.util.Scanner;

public class Ques32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int originalNumber = number;

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sumOfDigits = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                sumOfDigits += tempNumber % 10;
                tempNumber /= 10;
            }

            if (originalNumber % sumOfDigits == 0) {
                System.out.println(originalNumber + " is a Harshad Number.");
            } else {
                System.out.println(originalNumber + " is not a Harshad Number.");
            }
        }
        input.close();
    }
}
import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = input.nextInt();
        int number = originalNumber;

        int sumOfCubes = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sumOfCubes += (digit * digit * digit);
            number /= 10;
        }

        if (sumOfCubes == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        input.close();
    }
}
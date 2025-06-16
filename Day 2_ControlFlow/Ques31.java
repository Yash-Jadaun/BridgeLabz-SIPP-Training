import java.util.Scanner;

public class Ques31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) { // Sum of proper divisors (excluding the number itself)
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
        input.close();
    }
}
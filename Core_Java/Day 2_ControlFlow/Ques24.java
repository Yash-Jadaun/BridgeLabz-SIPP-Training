import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to get its multiplication table (between 6 and 9): ");
        int number = input.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } else {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) { // Typically, multiplication tables go up to 10
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
        input.close();
    }
}
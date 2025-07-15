import java.util.Scanner;

public class Ques5 {

    public static int checkNumberSign(int number) {
        if (number < 0) {
            return -1; 
        } else if (number > 0) {
            return 1; // Positive
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int result = checkNumberSign(num);

        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
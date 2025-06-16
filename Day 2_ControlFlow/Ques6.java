import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double userEnteredValue;

        do {
            System.out.print("Enter a double value (enter 0 to stop): ");
            userEnteredValue = input.nextDouble();

            if (userEnteredValue != 0) {
                total += userEnteredValue;
            }

        } while (userEnteredValue != 0);

        System.out.println("The total sum is: " + total);

        input.close();
    }
}
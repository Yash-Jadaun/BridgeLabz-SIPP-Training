import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Number of digits: 1");
        } else {
            int count = 0;
            // Handle negative numbers by converting to positive
            int tempNumber = Math.abs(number);

            while (tempNumber > 0) {
                tempNumber /= 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        }
        input.close();
    }
}
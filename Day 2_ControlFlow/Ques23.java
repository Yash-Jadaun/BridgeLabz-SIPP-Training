import java.util.Scanner;

public class Ques23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1;
            // Iterate downwards from number - 1 to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Found the greatest factor, break the loop
                }
            }
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }
        input.close();
    }
}
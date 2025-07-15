import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1;
            int counter = number - 1; // Start from number - 1

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Found the greatest factor, break the loop
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }
        input.close();
    }
}
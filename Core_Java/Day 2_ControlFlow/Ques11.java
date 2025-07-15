import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number (below 100): ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            int counter = number; // Start counter from the number itself
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter += number; // Increment by 'number' to get next multiple
            }
        }
        input.close();
    }
}
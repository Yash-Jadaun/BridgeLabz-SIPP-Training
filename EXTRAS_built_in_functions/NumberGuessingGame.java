package EXTRAS_built_in_functions;

// Problem 1: Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int userGuess;
        boolean guessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (!guessedCorrectly) {
            userGuess = scanner.nextInt();
            if (userGuess < targetNumber) {
                System.out.println("Low");
            } else if (userGuess > targetNumber) {
                System.out.println("High");
            } else {
                System.out.println("Correct!");
                guessedCorrectly = true;
            }
        }
        scanner.close();
    }
}
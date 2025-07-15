import java.util.Random;
import java.util.Scanner;

class Ques15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;
        int totalGames = 0;

        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();

        System.out.println("\n--- Rock-Paper-Scissors Game ---");
        for (int i = 0; i < numGames; i++) {
            totalGames++;
            System.out.print("Game " + (i + 1) + ": Enter your choice (1=Rock, 2=Paper, 3=Scissors): ");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                totalGames--; // Don't count invalid game
                i--; // Repeat current game
                continue;
            }

            int computerChoice = random.nextInt(3) + 1; // 1 for Rock, 2 for Paper, 3 for Scissors

            System.out.println("Player chooses: " + getChoiceName(playerChoice));
            System.out.println("Computer chooses: " + getChoiceName(computerChoice));

            int result = determineWinner(playerChoice, computerChoice);
            if (result == 1) {
                System.out.println("You win!");
                playerWins++;
            } else if (result == -1) {
                System.out.println("Computer wins!");
                computerWins++;
            } else {
                System.out.println("It's a tie!");
                ties++;
            }
            System.out.println("--------------------");
        }

        System.out.println("\n--- Game Summary ---");
        System.out.println("Total Games Played: " + totalGames);
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        double playerWinPercentage = (totalGames > 0) ? (double) playerWins / totalGames * 100 : 0;
        double computerWinPercentage = (totalGames > 0) ? (double) computerWins / totalGames * 100 : 0;

        System.out.printf("Player Win Percentage: %.2f%%\n", playerWinPercentage);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercentage);

        scanner.close();
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }

    // Returns 1 if player wins, -1 if computer wins, 0 if tie
    public static int determineWinner(int player, int computer) {
        if (player == computer) {
            return 0; // Tie
        }
        if ((player == 1 && computer == 3) || // Rock beats Scissors
            (player == 2 && computer == 1) || // Paper beats Rock
            (player == 3 && computer == 2)) { // Scissors beats Paper
            return 1; // Player wins
        } else {
            return -1; // Computer wins
        }
    }
}
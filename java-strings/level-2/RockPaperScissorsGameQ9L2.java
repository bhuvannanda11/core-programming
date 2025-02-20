import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameQ9L2 {

    // Method to get the computer's choice using Math.random()
    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);  // Generates a random number between 0 and 2
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return null;
        }
    }

    // Method to determine the winner of the game between the user and the computer
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        switch (userChoice) {
            case "Rock":
                return (computerChoice.equals("Scissors")) ? "User" : "Computer";
            case "Paper":
                return (computerChoice.equals("Rock")) ? "User" : "Computer";
            case "Scissors":
                return (computerChoice.equals("Paper")) ? "User" : "Computer";
            default:
                return "Invalid";
        }
    }

    // Method to find the average and percentage of wins for the user and the computer
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        String[][] stats = new String[2][3];
        stats[0][0] = "User Wins: " + userWins;
        stats[0][1] = "Computer Wins: " + computerWins;
        stats[0][2] = "Total Games: " + totalGames;

        stats[1][0] = "User Win Percentage: " + String.format("%.2f", userPercentage) + "%";
        stats[1][1] = "Computer Win Percentage: " + String.format("%.2f", computerPercentage) + "%";
        stats[1][2] = "Draws: " + (totalGames - userWins - computerWins);

        return stats;
    }

    // Method to display the results of each game and the stats
    public static void displayResults(int userWins, int computerWins, int totalGames) {
        String[][] stats = calculateStats(userWins, computerWins, totalGames);

        // Displaying the stats of each game
        System.out.println("\nGame Results:");
        System.out.printf("%-20s %-20s %-20s%n", "Player Choice", "Computer Choice", "Winner");
        System.out.println("---------------------------------------------------------");

        // Display the final stats
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games you want to play: ");
        int totalGames = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        // Loop for each game
        for (int i = 0; i < totalGames; i++) {
            sc.nextLine();  // To consume the newline after the integer input
            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();

            // Get the computer's choice
            String computerChoice = getComputerChoice();
            System.out.println("Computer chooses: " + computerChoice);

            // Determine the winner
            String winner = determineWinner(userChoice, computerChoice);
            System.out.println("Winner: " + winner);

            // Count wins
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        // Display the results and stats
        displayResults(userWins, computerWins, totalGames);


        sc.close();
    }
}

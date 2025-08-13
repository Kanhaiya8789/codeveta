import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear invalid input
                i--; // Don't count this attempt
                continue;
            }
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
                i--; // Don't count this attempt
                continue;
            }

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
    }
}
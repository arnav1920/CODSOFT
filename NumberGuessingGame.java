import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int rounds = 0;
        int wins = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 1;
            System.out.println("I'm going to pick a random number between 1 to 100. Try to guess it!");
            while (attempts <= maxAttempts) {
                System.out.print("Enter your guess (between 1 to 100): ");
                int guess = scanner.nextInt();
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number correctly!");
                    wins++;
                    break;
                }
                else if (guess < targetNumber) {
                    System.out.println("Too low..! Try a higher number.");
                }
                else {
                    System.out.println("Too high..! Try a lower number.");
                }
                attempts++;
                System.out.println("You have " + (maxAttempts - attempts + 1) + " attempts left.");
            }
            rounds++;
            System.out.println("Round " + rounds + " --> Score: " + wins + "/" + rounds);

            System.out.print("Want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("no")) {
                System.out.println("Thanks for playing..! Your final score is " + wins + "/" + rounds + ".");
                break;
            }
        }
        scanner.close();
    }
}

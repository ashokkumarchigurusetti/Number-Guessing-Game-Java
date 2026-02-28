import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean found = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (!found) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("The secret number is higher.");
            } else if (userGuess > secretNumber) {
                System.out.println("The secret number is lower.");
            } else {
                found = true;
                System.out.println("Congratulations! You guessed the secret number " + secretNumber + " in " + attempts
                        + " attempts.");
            }
        }

        scanner.close();
    }
}


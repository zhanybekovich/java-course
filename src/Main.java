import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Random Number Guessing Game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again!");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again!");
            } else {
                System.out.println("Congratulations! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != randomNumber);


        scanner.close();
    }
}
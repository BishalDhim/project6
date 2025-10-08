import java.util.Scanner;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int randomNum = rand.nextInt(10) + 1;
        int guess = 0;

        do {
            System.out.print("Guess a number (1-10): ");
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                if (guess >= 1 && guess <= 10) break;
                else System.out.println("Guess must be between 1 and 10.");
            } else {
                System.out.println("Invalid input. Enter a whole number.");
                scan.next();
            }
        } while (true);

        System.out.println("Random number: " + randomNum);
        if (guess == randomNum)
            System.out.println("Correct! You guessed the number!");
        else if (guess > randomNum)
            System.out.println("Too high!");
        else
            System.out.println("Too low!");

        scan.close();
    }
}

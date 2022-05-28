package recursion;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        guessNumberIterative(number);
        guessNumberRecursive(number);
    }

    private static void guessNumberIterative(int number) {
        while (true) {
            // read source data
            var userCase = new Scanner(System.in).nextInt();

            // processing
            if (number > userCase) {
                // display results
                System.out.println("number > " + userCase + ". Try again:");
            } else if (number < userCase) {
                // display results
                System.out.println("number < " + userCase + ". Try again:");
            } else {
                // display results
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }

    private static void guessNumberRecursive(int number) {
        // read source data
        var userCase = new Scanner(System.in).nextInt();

        // processing
        if (number > userCase) {
            // display results
            System.out.println("number > " + userCase + ". Try again:");
            guessNumberRecursive(number);
        } else if (number < userCase) {
            // display results
            System.out.println("number < " + userCase + ". Try again:");
            guessNumberRecursive(number);
        } else {
            // display results
            System.out.println("Congratulations, you guessed the number!");
        }
    }
}

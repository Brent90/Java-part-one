
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guessesMade = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int numberGussed = Integer.parseInt(reader.nextLine());

            if (numberGussed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct");
                break;
            } else if (numberGussed > numberDrawn) {
                guessesMade++;
                System.out.println("The number is lesser, guesses made " + guessesMade);
            } else {
                guessesMade++;
                System.out.println("The number is greater, guesses made " + guessesMade);
            }

        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

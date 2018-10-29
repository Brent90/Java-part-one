
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int howManyNumbers = 0;
        int howManyEvenNumbers = 0;
        int howManyOddNumbers = 0;

        System.out.println("Type numbers: ");

        while (true) {
            int number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                howManyEvenNumbers++;
            } else {
                howManyOddNumbers++;
            }

            sum += number;
            howManyNumbers++;

        }

        double average = (double) sum / howManyNumbers;

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + howManyNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers " + howManyEvenNumbers);
        System.out.println("Odd numbers " + howManyOddNumbers);

    }
}

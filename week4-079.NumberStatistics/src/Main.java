
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true) {

            int numberTyped = Integer.parseInt(reader.nextLine());
            if (numberTyped == -1) {
                break;
            } else {
                stats.addNumber(numberTyped);
                if (numberTyped % 2 == 0) {
                    even.addNumber(numberTyped);
                } else {
                    odd.addNumber(numberTyped);
                }

            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }

}

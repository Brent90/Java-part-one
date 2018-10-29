
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        int sumOfTwoNumbers = numberOne + numberTwo;
        
        System.out.println("Sum of the numbers: " + sumOfTwoNumbers);

    }
}

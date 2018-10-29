
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String personOne = reader.nextLine();
        System.out.print("Type your age: ");
        int personOnesAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");

        System.out.print("Type your name: ");
        String personTwo = reader.nextLine();
        System.out.print("Type your age: ");
        int personTwosAge = Integer.parseInt(reader.nextLine());
        
        int sumOfAges = personOnesAge + personTwosAge;
        
        System.out.println(personOne + " and " + personTwo + " are " + sumOfAges + " years old in total.");

    }
}

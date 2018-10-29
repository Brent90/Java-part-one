
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int pointTyped = Integer.parseInt(reader.nextLine());

        if (pointTyped <= 29) {
            System.out.println("failed");
        } else if (pointTyped <= 34) {
            System.out.println("1");
        } else if (pointTyped <= 39) {
            System.out.println("2");
        } else if (pointTyped <= 44) {
            System.out.println("3");
        } else if (pointTyped <= 49) {
            System.out.println("4");
        } else if (pointTyped <= 60) {
            System.out.println("5");
        }

    }
}

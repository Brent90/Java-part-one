
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String textReversed = "";
        for (int i = 1; i <= text.length(); i++) {
            textReversed += text.charAt(text.length() - i);
        }

        return textReversed.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

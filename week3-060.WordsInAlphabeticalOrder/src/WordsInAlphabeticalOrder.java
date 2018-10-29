
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String wordTyped = reader.nextLine();

            if (wordTyped.isEmpty()) {
                break;
            } else {
                words.add(wordTyped);
            }
        }

        Collections.sort(words);
        for (String s : words) {
            System.out.println(s);
        }

    }
}

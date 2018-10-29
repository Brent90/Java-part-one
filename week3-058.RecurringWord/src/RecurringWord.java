
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> word = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String wordTyped = reader.nextLine();
            
            if (word.contains(wordTyped)) {
                System.out.println("You gave the word " + wordTyped + " twice");
                break;
            } else {
                word.add(wordTyped);
            }
        }
        
    }
}

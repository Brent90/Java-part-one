
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
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
        
        System.out.println("You typed the following words: ");
        for(String s : words){
            System.out.println(s);
        }
        
        
    }
}

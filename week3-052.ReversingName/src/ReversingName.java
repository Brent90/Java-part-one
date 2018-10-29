import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        String nameReversed = "";
        int i = 1;
        
        while(i <= name.length()){
            nameReversed += name.charAt(name.length() - i);
            i++;
        }
        
        System.out.println("In reverse order: " + nameReversed);
        
    }
}

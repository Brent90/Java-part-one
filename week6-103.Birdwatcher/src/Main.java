
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Bird bird = new Bird();

        while (true) {
            System.out.print("? ");
            String userInput = reader.nextLine();

            if (userInput.equals("Add")) {
                System.out.print("Name: ");
                String birdName = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                Bird birdToAdd = new Bird(birdName, latinName);
                bird.addBird(birdToAdd);
                
            }else if(userInput.equals("Observation")){
                System.out.print("What was observed:? ");
                String observedBird = reader.nextLine();
                if(bird.containsBird(observedBird)){
                    //incerase observatin
                }else{
                    System.out.println("Is not a bird!");
                }
                
            } else if(userInput.equals("Statistics")){
                bird.printStats();
            } else if(userInput.equals("Show")) {
                System.out.print("What? ");
                String showBird = reader.nextLine();
                bird.printBird(showBird);
            }
            else if(userInput.equals("Quit")){
                break;
            }

        }

    }

}

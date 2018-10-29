import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scores scores = new Scores();
       
        System.out.println("Type exam scores, -1 completes: ");
        
        //get numbers
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            if(score == -1){
                break;
            }else{
                scores.add(score);
            }
        }
        
        //print grade distribution:
        scores.printGrades();
        
        //print accpetnace percentage
        System.out.println("Acceptance percentage: " + scores.getAcceptancePercentage());
        
    }
}
//34
//41
//53
//36
//55
//27
//43
//40
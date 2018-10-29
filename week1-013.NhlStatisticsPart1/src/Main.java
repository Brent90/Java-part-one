
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("");
        
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
                
    }
}

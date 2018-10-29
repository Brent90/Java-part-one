
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slinger
 */
public class Scores {

    private ArrayList<Integer> failedGrade = new ArrayList<Integer>();
    private ArrayList<Integer> gradeOne = new ArrayList<Integer>();
    private ArrayList<Integer> gradeTwo = new ArrayList<Integer>();
    private ArrayList<Integer> gradeThree = new ArrayList<Integer>();
    private ArrayList<Integer> gradeFour = new ArrayList<Integer>();
    private ArrayList<Integer> gradeFive = new ArrayList<Integer>();
    private int accpetedCounter;
    private int sumOfScores;

    public void add(int number) {
        if (number < -1) {
            return;
        } else if (number <= 29) {
            failedGrade.add(number);
            sumOfScores++;
        } else if (number <= 34) {
            gradeOne.add(number);
            accpetedCounter++;
            sumOfScores++;
        } else if (number <= 39) {
            gradeTwo.add(number);
            accpetedCounter++;
            sumOfScores++;

        } else if (number <= 44) {
            gradeThree.add(number);
            accpetedCounter++;
            sumOfScores++;

        } else if (number <= 49) {
            gradeFour.add(number);
            accpetedCounter++;
            sumOfScores++;

        } else if (number <= 60) {
            gradeFive.add(number);
            accpetedCounter++;
            sumOfScores++;

        } else {

        }

    }

    public String printStars(ArrayList list) {
        String stars = "";
        for (int i = 0; i < list.size(); i++) {
            stars += "*";
        }
        return stars;
    }

    public void printGrades() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + printStars(this.gradeFive));
        System.out.println("4: " + printStars(this.gradeFour));
        System.out.println("3: " + printStars(this.gradeThree));
        System.out.println("2: " + printStars(this.gradeTwo));
        System.out.println("1: " + printStars(this.gradeOne));
        System.out.println("0: " + printStars(this.failedGrade));

    }

    public double getAcceptancePercentage() {
        return (double) (100 * accpetedCounter) / sumOfScores;
    }
}

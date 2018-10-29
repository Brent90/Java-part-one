
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slinger
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            double number = random.nextDouble();
            if (this.density > number) {
                System.out.print(" * ");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println("");
        }

    }

    public int starsInLastPrint() {
        return starsInLastPrint;

    }

}

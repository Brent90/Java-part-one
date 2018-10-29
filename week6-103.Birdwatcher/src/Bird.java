
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
public class Bird {

    private String name;
    private String latinName;
    private int observations;
    private ArrayList<Bird> birds;

    public Bird() {
        this.birds = new ArrayList<Bird>();
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;

    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservations() {
        return this.observations;
    }

    public void increase() {
        this.observations++;
    }

    public Bird getBird(Bird bird) {
        return bird;
    }

    public boolean containsBird(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.increase();
                return true;
            }
        }
        return false;
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void printStats() {
        for (Bird b : this.birds) {
            System.out.println(b.getName() + " (" + b.getLatinName() + ") " + b.getObservations());
        }
    }

    public void printBird(String birdName) {
        for (Bird b : this.birds) {
            if (b.getName().equals(birdName)) {
                System.out.println(b.getName() + " (" + b.getLatinName() + ") " + b.getObservations());

            }
        }
    }

}

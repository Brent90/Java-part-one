/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slinger
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        if (check == true) {
            this.check = true;
        }
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);

    }

    public void increase(int number) {
        if (number > 0) {
            this.startingValue += number;
        }
    }

    public void decrease(int number) {
        if (number < 0) {
            return;
        }
        this.startingValue -= number;

        if (this.startingValue < 0 && this.check) {
            this.startingValue = 0;
        }

    }

}

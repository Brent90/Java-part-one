/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slinger
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount < 0) {
            //do nothing
        } else if (this.balance + amount <= 150) {
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

}

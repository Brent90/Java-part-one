/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slinger
 */
public class Product {

    final private String name;
    final private double price;
    final private int amountAtStart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amountAtStart = amountAtStart;

    }

    public void printProduct() {
        //Banana, price 1.1, amount 13
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amountAtStart);

    }

}

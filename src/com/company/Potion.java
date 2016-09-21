package com.company;

/**
 * Created by VeryBarry on 9/21/16.
 */
public class Potion extends Items {
    public Potion(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.type = "Potion";
    }
}

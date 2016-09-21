package com.company;

/**
 * Created by VeryBarry on 9/21/16.
 */
public class Weapon extends Items{
    public Weapon(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.type = "Weapon";
    }
}

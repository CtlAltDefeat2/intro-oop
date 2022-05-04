package com.xpanxion.myapp.student17;

import java.util.ArrayList;

public class Item {
    //
    //Data Members
    //
    private float price;
    private int quantity;

    private String description;

    public Item(float price, int quanity, String description){
    this.price = price;
    this.quantity = quanity;
    this.description = description;
    }
    public float getPrice() {
        return price;
    }

    public int getQuanity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }
    public String toString() {
        String s = this.description + ":";
        s = s + this.quantity + "\n";
        return s;}
}


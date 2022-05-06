package com.xpanxion.myapp.student26;

import java.util.ArrayList;

public class Item  {

    //Data

    private float price;
    private int quantity;
    private String description;

    private float total;

    public Item(){}


    public Item(float price,int quantity, String description) {
        this.price=price;
        this.quantity=quantity;
        this.description=description;
    }
    //Getters
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDescription() {
        return description;
    }

}

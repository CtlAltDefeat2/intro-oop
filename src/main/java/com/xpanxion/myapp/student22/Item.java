package com.xpanxion.myapp.student22;

import java.util.ArrayList;

public class Item {
    private float price;
    private int quantity;
    private String Description;

    public Item() {
    }

    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.Description = description;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return Description;
    }



}

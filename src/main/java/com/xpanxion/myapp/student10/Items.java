package com.xpanxion.myapp.student10;

import java.util.ArrayList;

public class Items {
    public float price;
    public int quantity;
    public String description;
    ArrayList<Object> items = new ArrayList<Object>();

    Items(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;

    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Object> getItems() {
        return items;
    }

}

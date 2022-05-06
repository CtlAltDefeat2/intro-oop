package com.xpanxion.myapp.student15;

public class Item {
    // Data members
    private float price;
    private int quantity;
    private String description;

//constructor
    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    public Item() {}
    // Methods
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



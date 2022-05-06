package com.xpanxion.myapp.student11;

public class Item {

    private float price;
    private int quantity;
    private String description;


    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Item() {

    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

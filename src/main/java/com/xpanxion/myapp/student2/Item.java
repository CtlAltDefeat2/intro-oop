package com.xpanxion.myapp.student2;

public class Item {
    private static float price;
    private int quantity;
    private String description;

    public static float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;

    }
}

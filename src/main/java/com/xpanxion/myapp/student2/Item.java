package com.xpanxion.myapp.student2;

public class Item {
    private float price;
    private int quantity;
    private String description;

    public Item() {

    }

    public void setPrice(float price) {
        this.price=price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
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
    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}

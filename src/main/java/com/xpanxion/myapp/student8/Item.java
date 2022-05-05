package com.xpanxion.myapp.student8;

public class Item {
    public float price;
    public int quantity;
    public String description;

    static float total;

    static float totalPrice;


    public Item() {

    }

    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public float total() {
        total = this.price * this.quantity;
        return total;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTotalItemPrice() {
        totalPrice = this.price * this.quantity;
        return totalPrice;
    }
}

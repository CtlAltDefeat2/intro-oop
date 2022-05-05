package com.xpanxion.myapp.student7;

import java.text.NumberFormat;

public class Item {
    protected float price;
    protected int quantity;
    protected String description;
    Item(){}

    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public float getTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return
                description + ' ' +
                currency.format(price) + ' ' +'('+ quantity +')'+ ' ' +
                currency.format(getTotal());
    }
}

package com.xpanxion.myapp.student13;

import java.util.ArrayList;

public class Item {

    // Data Members

    private Float price;
    private int quantity;
    private String description;

    // Constructor

    public Item(Float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    // Methods

    public Float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

}

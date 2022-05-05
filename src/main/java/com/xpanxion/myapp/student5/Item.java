package com.xpanxion.myapp.student5;

import java.util.ArrayList;

public class Item {
    // Variable Declarations
    private Float itemPrice;
    private int itemQuantity;
    private String itemName;
    // Constructors
    public Item (Float itemPrice, int itemQuantity, String itemName) {
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
    }
    // Methods
    public Float getItemPrice() {
        return itemPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public String getItemName() {
        return itemName;
    }
    // Accessors
    // Overrides
}

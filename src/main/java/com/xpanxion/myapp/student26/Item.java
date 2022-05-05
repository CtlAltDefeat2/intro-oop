package com.xpanxion.myapp.student26;

import java.util.ArrayList;

public class Item extends ShoppingCart {

    //Data

    Item(){}

    ArrayList list = new ArrayList<Item>();
    private float price;
    private int quantity;
    private String description;

    public float getPrice() {

        return price;
    }
    public int getQuantity() {

        return quantity;
    }
    public String getDescription() {

        return description;
    }

    public Item (float price, int quantity, String description) {
        this.price=price;
        this.quantity=quantity;
        this.description=description;


    }

    public void  calculateTotal(Float Price, int quantity) {

        Float sum= price * quantity;

    }





}

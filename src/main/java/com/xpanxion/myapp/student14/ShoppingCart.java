package com.xpanxion.myapp.student14;

import java.util.ArrayList;
import java.util.Collections;

class ShoppingCart {
    //
    //Data Members
    //
    private float price;
    private int quantity;
    private String description;
    private float total;
    private ArrayList<Item> itemsList;

    //
    //Constructors
    //
    public ShoppingCart() {
        this.itemsList = new ArrayList<Item>();
    }


    //    public ShoppingCart(shippingFees) {
//
//    }
    //
    //Methods
    //
    public void addItem(Item item) {
        this.itemsList.add(item);
    }

    public void calculateTotal() {
        //update: private float total;
        float calculate = 0;
        for (Item i : itemsList) {
            for (float j = i.getQuantity();
                 j > 0; j--) {
                total += i.getPrice();
            }

        }
    }

    public float getTotal() {
        return total;
    }

}

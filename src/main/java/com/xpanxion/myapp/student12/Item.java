package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class Item extends ShoppingCart{
    //
    //Data Members
    //
    public float price;
    public int quantity;
    public String description;
    ArrayList<Object> items = new ArrayList<Object>();

    //
    //Constructors
    //
    Item(){}
    Item(float price, int quantity, String description){
        this.price = price;
        this.quantity = quantity;
        this.description = description;


    }

    //
    //Accessors
    //

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Object> getItems() {
        return items;
    }


    //
    //Methods
    //


}

package com.xpanxion.myapp.student12;

public class Item extends ShoppingCart{
    //
    //Data Members
    //
    public float price;
    public int quantity;
    public String description;
    //private ArrayList item = new ArrayList();

    //
    //Constructors
    //

    Item(float price, int quantity, String description) {
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


    //
    //Methods
    //


}

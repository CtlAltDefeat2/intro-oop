package com.xpanxion.myapp.student24;

public class Item {

    private float price;
    private int quantity;
    private String description;


    public Item(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
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
    public float getTotal(){
        return price*quantity;
    }

    @Override
    public String toString() {
        return description +"  " + "$"+ price + " " + "("+ quantity + ")" + " " + getTotal() +"\n";
    }
}

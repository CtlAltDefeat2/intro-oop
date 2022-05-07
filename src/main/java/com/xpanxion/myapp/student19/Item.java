package com.xpanxion.myapp.student19;

public class Item {
public float price;
public int quantity;
public String description;
public Item(float price, int quantity, String description){
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
    @Override
    public String toString() {
        return description + " " + price + " " + quantity  + " " + price*quantity + '\n' ;
    }
}

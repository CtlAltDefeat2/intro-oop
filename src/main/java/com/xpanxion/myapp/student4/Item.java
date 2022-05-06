package com.xpanxion.myapp.student4;

public class Item {
private Float  price;
private int quantity;
private String description;

public Item(){

}

    public Item(Float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

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

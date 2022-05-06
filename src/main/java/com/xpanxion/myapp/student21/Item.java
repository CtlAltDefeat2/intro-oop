package com.xpanxion.myapp.student21;

public class Item extends ShoppingCart {
    Float price;
    int quantity;
    String description;

    public Item(Float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;


    }


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

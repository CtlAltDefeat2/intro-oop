package com.xpanxion.myapp.student1;

import java.util.ArrayList;

public class ShoppingCart {
private ArrayList<Item> itemList;
private float total;

    public ShoppingCart() {
        this.itemList = new ArrayList<Item>();
    }

    public void addItem (Item item){
        this.itemList.add(item);
    }
    public void calculateTotal() {
        for (Item i : itemList) {
            total = (total + (i.getPrice() * i.getQuantity()));
        }

    }
    public float getTotal() {
        return total;
    }
}

package com.xpanxion.myapp.student22;

import java.util.ArrayList;

public class ShoppingCart extends Item {


    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public ShoppingCart(Float price, int quantity, String description) {
        this.items = items;
    }

    public void addItem(Item items) {

        this.items.add(items);


    }


    public Float calculateTotal() {
       Float theTotal = 0f;
       for(Item i : items){
          theTotal += i.getPrice() * i.getQuantity();
       }
       return theTotal;
    }
    public Float getTotal() {
        return calculateTotal();
    }

}




package com.xpanxion.myapp.student2;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    NumberFormat defaultFormat=NumberFormat.getCurrencyInstance();
    private ArrayList<Item> shoppingCart=new ArrayList<>();
    private float total;

    public ShoppingCart(ArrayList<Item> shoppingCart) {
        this.shoppingCart= new ArrayList<>();
    }

    public ShoppingCart() {

    }

    public void addItem(Item item) {
        this.shoppingCart.add(item);

    }

    public void calculateTotal() {

    }

    public float getTotal() {
        return 0;
    }
}

package com.xpanxion.myapp.student2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

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
        ListIterator<Item> iterator=shoppingCart.listIterator();
        while (iterator.hasNext()){
            Item item=iterator.next();
            total=(float) (total+(Item.getPrice()*item.getQuantity()));
        }

    }

    public float getTotal() {
        return 0;
    }

}

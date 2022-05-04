package com.xpanxion.myapp.student17;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class ShoppingCart {
    //
    //data Members
    //
    private ArrayList item = new ArrayList();
    private float price;
    private int quantity;
    private String description;
    private float total;
    private int shipCost;

    public ShoppingCart(){
        this.item = new ArrayList<Item>();
        this.price = 0;
        this.quantity = 0;
        this.description = " ";
    }
    public ShoppingCart(int shipCost){

    }
    public void addItem(Item item){
        this.item.add(item);
    }
    public float calculateTotal(){
        ListIterator<Item> iterator = item.listIterator();
        while(iterator.hasNext()) {
            Item item = iterator.next();
            total = (float) (total + (item.getPrice() * item.getQuanity()));
        }
        return total;
    }
    public String getTotal() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = n.format(total);
        return s;
    }
    public String shipOrder(String name, String Address, String city, String state, int zip){

        return name;
    }
    }



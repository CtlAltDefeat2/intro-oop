package com.xpanxion.myapp.student2;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart{
    NumberFormat defaultFormat=NumberFormat.getCurrencyInstance();
    private ArrayList<Item> shoppingCart=new ArrayList<>();
    private float total;
    private float subTotal;
    private Item item = new Item();
    private float shipAndHand=5.00f;

    public ShoppingCart(float shipAndHand) {
        this.shipAndHand = shipAndHand;
    }

    public ShoppingCart(ArrayList<Item> shoppingCart, float total, float subTotal) {
        this.shoppingCart = shoppingCart;
        this.total = total;
        this.subTotal=subTotal;


    }
    public ShoppingCart(ArrayList<Item> shoppingCart) {
        this.shoppingCart= new ArrayList<>();
    }

    public ShoppingCart() {

    }

    public ArrayList<Item> addItem(Item item) {
        this.shoppingCart.add(item);
        return shoppingCart;
    }

    public void calculateTotal() {
        float sum=0;
        for (Item item:shoppingCart) {
            subTotal=sum+=(item.getPrice()*item.getQuantity());
        }
    }

    public Serializable getTotal() {
        total= (float) (subTotal*1.1);
        if (total<10){
            return defaultFormat.format(total+5);
        }
        return defaultFormat.format(subTotal*1.1);
    }


    public Invoice shipOrder(String name, String address, String city, String state, int zip) {
        Invoice inv=new Invoice(name, address, city, state, zip);
        return inv;
    }
}

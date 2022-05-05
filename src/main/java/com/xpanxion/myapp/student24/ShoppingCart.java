package com.xpanxion.myapp.student24;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> cart;
    private float total;
    private float shippingCharge;

    public ShoppingCart() {
        cart = new ArrayList<Item>();
    }

    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public void addItem(Item I) {
        cart.add(I);
    }

    public void calculateTotal() {

        for (int i = 0; i < cart.size(); i++) {
            total = total +((cart.get(i).getPrice()) * (cart.get(i).getQuantity()));
            //total = 6;
            total = (float) (total * 0.01) + total;
            if (total < 10) {
                total += shippingCharge;
            }
        }
    }




    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip) {
        var invoice = new Invoice(name,streetAddress,city,state,zip,cart,total,shippingCharge);
        return invoice;
   }

}

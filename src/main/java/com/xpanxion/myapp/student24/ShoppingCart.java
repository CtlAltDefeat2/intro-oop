package com.xpanxion.myapp.student24;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> cart;
    private float total;
    private float totalAfterTax;

    public ShoppingCart() {
        cart = new ArrayList<Item>();
    }

    public ShoppingCart(float totalAfterTax) {
        this.totalAfterTax = totalAfterTax;
    }

    public void addItem(Item I) {
        cart.add(I);
    }

    public void calculateTotal() {

        for (int i = 0; i < cart.size(); i++) {
            total = total +((cart.get(i).getPrice()) * (cart.get(i).getQuantity()));
            //total = 6;
            totalAfterTax = (float) (total * 0.01) + total;
            if (totalAfterTax < 10) {
                totalAfterTax = totalAfterTax + 5.00F;
            }
        }
    }

    public double getTotal() {

        return totalAfterTax;
    }

    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip) {
        var invoice = new Invoice(name,streetAddress,city,state,zip,cart,total);
        return invoice;
   }
}

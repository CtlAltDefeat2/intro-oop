package com.xpanxion.myapp.student11;

import java.util.ArrayList;

public class ShoppingCart {
    //
    //Data members
    //
    private float price;
    private Integer quantity;
    private String description;
    private float total;
    private float shippingCharge;
    private ArrayList<Item> itemList;
    private float salesTax;
    private float afterTax;

    //
    //Constructors
    //
    public ShoppingCart() {
        this.itemList = new ArrayList<Item>();
        this.total = total;
        this.salesTax = 0.1f;
        this.afterTax = afterTax;
    }

    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = 5.00f;
    }

    public void addItem (Item item){
            this.itemList.add(item);
        }

    public void calculateTotal() {
        for (Item i : itemList) {
            total = (total + (i.getPrice() * i.getQuantity()));
        }
        if (total < 10.00f) {
            total += shippingCharge;
        } else if (total > 10.00f) {
            total = total;
        }
        total += (total * salesTax);
        }

    public float getTotal() {
        return total;
    }
}

package com.xpanxion.myapp.student14;

import java.util.ArrayList;

class ShoppingCart {
    //
    //Data Members
    //
    private float price;
    private int quantity;
    private String description;
    private float total;
    private ArrayList<Item> itemsList;
    private float shippingTotal;
    private float afterTax;

    //
    //Constructors
    //
    public ShoppingCart() {
        this.itemsList = new ArrayList<Item>();
    }

    public ShoppingCart(float shippingTotal, float afterTax) {
        this.shippingTotal = shippingTotal;
        this.afterTax = afterTax;
    }

    //
    //Methods
    //
    public void addItem(Item item) {
        this.itemsList.add(item);
    }

    public void calculateTotal() {
        //update: private float total;
        for (Item i : itemsList) {
            for (float j = i.getQuantity();
                 j > 0; j--) {
                total += i.getPrice();
            }
        }
    }

    public float getTotal() {
        return total;
    }

    public float getAfterTax() {
        float tax = .1F;
        afterTax = total + (total * tax);
        return afterTax;
    }

    public float getShippingFees() {
        float shippingTotal;
        float shippingFees = 5.00F;
        if (getTotal() < 10) {
            shippingTotal = getAfterTax() + shippingFees;
        } else {
            shippingTotal = getAfterTax();
        }
        return shippingTotal;
    }

    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip) {
        var invoice = new Invoice( name,  streetAddress,  city,  state,  zip, itemsList);
        return invoice;
    }

}

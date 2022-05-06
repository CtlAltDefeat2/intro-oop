package com.xpanxion.myapp.student21;

import javax.naming.Name;
import java.util.ArrayList;

public class ShoppingCart {

    //
    // Data members
    //

    private ArrayList<Item> items;
    private Float shippingCharge = 0.00f;
    private Float totalAfterTax;
    private Float totalAfterShipping;
    private boolean hasFreeShipping;

    //
    // Constructors
    //

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public ShoppingCart(Float shippingCharge) {
        this.items = new ArrayList<Item>();
        this.shippingCharge = shippingCharge;
    }

    //
    // Accessors
    //

    public Float getShippingCharge() {
        return shippingCharge;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Float getTotalAfterTax() {
        return totalAfterTax;
    }

    public Float getTotalAfterShipping() {
        return totalAfterShipping;
    }

    public boolean isHasFreeShipping() {
        return hasFreeShipping;
    }

    //
    // Methods
    //

    public void setShippingCharge(Float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    // calculates total and adds tax and shipping if the order is less than $10
    public void calculateTotal() {
        var total = 0F;
        for (Item i : items) {
            total += i.getPrice() * i.getQuantity();
        }
        totalAfterTax = total *= 1.1;
        if (totalAfterTax < 10) {
            hasFreeShipping = false;
            totalAfterShipping = totalAfterTax + this.shippingCharge;
        } else {
            hasFreeShipping = true;
            totalAfterShipping = totalAfterTax;
        }
    }

    public float getTotal() {
        return totalAfterShipping;
    }


    // This method returns a new Invoice
    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip) {
        return new Invoice(name, streetAddress, city, state, zip, this);
    }
}

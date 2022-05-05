package com.xpanxion.myapp.student13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingCart {

    // Data Members

    private ArrayList<Item> items;
    private float Total;
    private float shippingCharge;
    private final float shippingBarrier = 10.00f;
    private final float  salesTax = .10f;
    private float TotalCost;


    // Constructors

    ShoppingCart() {
        this.items = new ArrayList<Item>();
        this.Total = Total;
        this.TotalCost = TotalCost;
    }

    ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    // Methods

    public void addItem(Item item) {
        items.add(item);
    }

    public void calculateTotal() {
        for (Item item: items) {
        Total = (Total + item.getPrice() * item.getQuantity());
        }
    }

    public void calculateTax() {
        Total = Total + Total * salesTax;
    }

    // Added shipping fee inside getTotal method.
    public float getTotal() {
        if (Total > shippingBarrier) {
            TotalCost = Total + shippingCharge;
        } else if (Total < shippingBarrier) {
            TotalCost = Total;
        }

        return TotalCost;
    }

    public String shipOrder(String Name, String Street_Address, String City, String State, int Zip) {

//        Invoice invoice = new Invoice(Name, Street_Address, City, State, Zip);
        for (Item item: items) {

        }

        return "Ship to:" + "\n\t" + Name + "\n\t" + Street_Address + "\n\t" + City + "," + State + " " + Zip
                + "\n" + "Items" + "\n-----\n" + "\n" + "Total Cost" + "\n" + "---------" + "\n" + TotalCost;
    }



}

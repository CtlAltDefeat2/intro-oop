package com.xpanxion.myapp.student13;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;

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

    public String getTotal() {
        if (Total >= shippingBarrier) {
            TotalCost = Total + shippingCharge;
        } else if (Total < shippingBarrier) {
            TotalCost = Total;
        }
        Locale locale = new Locale("en", "US");
        NumberFormat totalCostFormat = NumberFormat.getCurrencyInstance(locale);

        return totalCostFormat.format(TotalCost);
    }

    public String shipOrder(String Name, String Street_Address, String City, String State, int Zip) {

        Enumeration
//        for (int i = 0; i < items.size(); i++) {
//            for ()
//        }

        return "Ship to:" + "\n\t" + Name + "\n\t" + Street_Address + "\n\t" + City + "," + State + " " + Zip
                + "\n" + "Items" + "\n-----\n" + "\n" + "Total Cost" + "\n" + "---------" + "\n" + TotalCost;
    }

}

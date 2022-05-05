package com.xpanxion.myapp.student8;

import java.util.ArrayList;

public class ShoppingCart {

    public static ArrayList<Item> Items = new ArrayList<>();
    static float totalCartPrice = 0;
    static float totalItemPrice = 0;
    static float itemPriceWithSH;

    static float salesTax = totalCartPrice * .10F;

    static float shippingCharge;

    int itemCount = 0;

    Invoice invoice;

    Item cartItem;
    public ShoppingCart() {

    }
    public ShoppingCart(float SH) {
        shippingCharge = SH;
        if (totalCartPrice < 10) {
            shippingCharge += totalCartPrice;
        }
        if (totalCartPrice > 10) {
            shippingCharge = Float.parseFloat("Free");
        }
    }

    public static void addItem(Item cartItem) {
        Items.add(cartItem);
    }

    public void calculateTotal() {
        totalCartPrice += totalItemPrice + itemPriceWithSH + salesTax;
    }

    public String getTotal() {
        return "$" + totalCartPrice;
    }

    public Invoice shipOrder(String n, String st, String c, String s, int z) {
        invoice = new Invoice(n, st, c, s, z);
        return invoice;
    }


}



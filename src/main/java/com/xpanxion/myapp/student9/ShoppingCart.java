package com.xpanxion.myapp.student9;

import java.util.ArrayList;

public class ShoppingCart {
    private float price;
    private int quantity;
    private String description;
    private ArrayList<Item> itemsList;
    private float total;

    public ShoppingCart() {
        this.itemsList = new ArrayList<Item>();
    }

    public ShoppingCart(float shippingFees) {

    }

    public void addItem(Item item) {
        this.itemsList.add(item);

    }

    public void calculateTotal() {
        float calculator = 0;
        //for (Item i : itemsList) {
        //calculator = i.getPrice() * j.getQuantity();
        for (Item i : itemsList) {
            for (int j = i.getQuantity(); j > 0; j--) {
                total += i.getPrice();
            }
        }
    }

    public float getTotal () {
        return total;
    }
}

package com.xpanxion.myapp.student25;

import java.util.ArrayList;

public class ShoppingCart {  // base class
    //DATA MEMBERS
    private float price;
    private int quantity;
    private String description;
    private float total;
    //  private ArrayList<Item> items;
    private ArrayList<Item> itemsList;

    // CONSTRUCTORS

    public ShoppingCart() {
        this.itemsList = new ArrayList<Item>();
    }

    public ShoppingCart(float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.itemsList = new ArrayList<Item>();
    }
    //METHODS

    public void addItem(Item item) {
        this.itemsList.add(item);
    }

    public void calculateTotal() {
        for (Item i : itemsList) {
            for (int t = i.getQuantity(); t > 0; t--) {
                total += i.getPrice();

            }
        }
    }

    public float getTotal() {  //Accessors = getter
        return total;
    }



 //   private void itemsList() {
   // }
}
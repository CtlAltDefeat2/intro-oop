package com.xpanxion.myapp.student15;

import java.util.ArrayList;

public class ShoppingCart {
    // Data members
    private ArrayList<Item> shoppingCart = new ArrayList<>();
    private float total;
    private Item myItem = new Item();
    private float shippingCharge;
    private float salesTax = 0;
    private Invoice invoice;

    private String Name;
    private String StreetAddress;
    private String State;
    private String City;
    private String Zip;

//// Constructor

    public ShoppingCart(ArrayList<Item> shoppingCart, float total, Item myItem, float shippingCharge) {
        this.shoppingCart = shoppingCart;
        this.total = total;
        this.myItem = myItem;
        this.shippingCharge = shippingCharge;
    }

    public ShoppingCart(ArrayList<Item> shoppingCart) {
        this.shoppingCart = new ArrayList<>();
    }

    public ShoppingCart() {
    }

    public float calculateTotal() {
        for (Item i : shoppingCart) {
            total = (total + (i.getPrice() * i.getQuantity()));
        }
        if (total < 10.00f) {
            total += shippingCharge; // total = total + shipping
        } else if (total > 10.00f) {
            total = total;
        }
        total += (total * salesTax);
        return total;
    }

    public float getTotal() {  //Accessors = getter
        return total;
    }

    public void addItem(Item item) {
        this.shoppingCart.add(item);
    }

    public <invoice> ShoppingCart(String name, String streetAddress, String state, String city, String zip) {
        Name = name;
        StreetAddress = streetAddress;
        State = state;
        City = city;
        Zip = zip;
    }

          public Invoice shipOrder(String name, String streetAddress, String city, String state, int zipCode){
        var Invoice = new Invoice(name, streetAddress ,city ,state , zipCode );
        return Invoice;



}}


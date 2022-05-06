package com.xpanxion.myapp.student9;

import java.util.ArrayList;

public class ShoppingCart {  // base class
    //DATA MEMBERS
    private float price;
    private Integer quantity;
    private String description;
    private float total;
    private float shippingCharge;
    private ArrayList<Item> itemsList;
    private float salesTax;
    private float afterTax;
    private Invoice invoice;


    // CONSTRUCTORS

    public ShoppingCart() {
        this.itemsList = new ArrayList<Item>();
        this.total = total;
        this.salesTax = 0.1f;
        this.afterTax = afterTax;
    }

    public ShoppingCart(Float price, Integer quantity, String description, Float total) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.itemsList = new ArrayList<Item>();
    }

    public ShoppingCart(Float shippingCharge) {
        this.shippingCharge = 5.00f;
    }

    //METHODS

    public void addItem(Item item) {
        this.itemsList.add(item);
    }

    public void calculateTotal() {

        for (Item i : itemsList) {
            total = (total + (i.getPrice() * i.getQuantity()));
        }
        if (total < 10.00f) {
            total += shippingCharge; // total = total + shipping
        } else if (total > 10.00f) {
            total = total;
        }
        total += (total * salesTax);

    }

    public float getTotal() {  //Accessors = getter
        return total;
    }
        public Invoice shipOrder(String name, String streetAddress, String city, String state, int zipCode){
        var invoice = new Invoice(name, streetAddress ,city ,state , zipCode );
        return invoice;

    }

}
package com.xpanxion.myapp.student1;

import java.util.ArrayList;

public class ShoppingCart {  //base class
    private ArrayList<Item> itemList;
    private float price;
    private Integer quantity;
    private String description;
    private float total;
    private float shippingCharge;
    private float salesTax;
    private float afterTax;

    private Invoice invoice;


//
// Constructors
//

    public ShoppingCart() {
        this.itemList = new ArrayList<Item>();
        this.total = total;
        this.salesTax = 0.1f;
        this.afterTax = afterTax;
    }

    public ShoppingCart(float price, Integer quantity, String description, float total) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.itemList = new ArrayList<Item>();
    }

    public ShoppingCart(Float shippingCharge) {
        this.shippingCharge = 5.00f;
    }


    //
    // Methods
    //

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void calculateTotal() {
        for (Item i : itemList) {
            total = (total + (i.getPrice() * i.getQuantity()));
        }
        if (total < 10.00f) {
            total += shippingCharge; // total = total + shipping
        } else if (total > 10.00f) {
            total = total;
        }
        total += (total * salesTax);
    }
    public float getTotal() {
        return total;
    }

    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zipCode){
        var Invoice = new Invoice(name, streetAddress ,city ,state , zipCode);
        return Invoice;
    }
}


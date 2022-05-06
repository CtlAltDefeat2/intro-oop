package com.xpanxion.myapp.student16;

import java.util.ArrayList;

public class Invoice {
    public  String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private Float shipping;
    private  String shoppingCart;
    private Float total;
    private ArrayList<Item> items;

    public Invoice(String name, String address, String city, String state, int zipcode, ArrayList<Item> items, Float shipping, float total) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.shipping = shipping;
        this.items = items;
        this.total = total;
    }


    @Override
    public String toString() {
        String shippingString = "";
        if (shipping == 0){
            shippingString = "Free shipping";
        }
        else{
            shippingString = shipping.toString();
        }

        // Format this to match this:
        /**
        Ship to:
        Jon Smith
        123 Green Street
        Austin, TX 78737

        Items
         -----
         Socks  $2.00  (4)   $8.00
        Shirts $10.00 (2)  $20.00

        Shipping: Free

        Total Cost
        ---------
                */

        //this is a for/each statement.
        float ShoppingCart = 0;
        String item = "";
        for (Item i:items) {
            item += i;
        }
        return "Invoice{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                 " Item " + item + shippingString
                +" Total: "+ total;}
}

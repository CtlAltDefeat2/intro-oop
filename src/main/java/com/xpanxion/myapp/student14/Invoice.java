package com.xpanxion.myapp.student14;

import java.util.ArrayList;
import java.util.Arrays;

public class Invoice {
    //data members
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zip;
    private ArrayList<Item> itemsList;
    float shippingTotal;
    float shippingFees;

//constructors

    public Invoice(String name, String streetAddress, String city, String state, int zip) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> itemsList) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.itemsList = itemsList;
    }
    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> itemsList,
                   float shippingFees , float shippingTotal) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.itemsList = itemsList;
        this.shippingTotal = shippingTotal;
        this.shippingFees = shippingFees;
    }
    //overrides
    @Override
    public String toString() {
        String Item = " ";
        String shippingFees = " ";
        for (Item i : itemsList) {
            Item += i;
        }
        if (shippingTotal == 0) {
            shippingFees = "Free";
        }
        return "Ship to: \n " +
                name + "\n" +
                streetAddress + "," + "\n" +
                city + ", " + state + ", " + zip + "\n" +
                "\n " + "Items" + "\n" + "-----" + "\n" +
                Item + "\n" +
                "Shipping: " + shippingFees + "\n" +
                "\n" + "Total Cost" + "\n" +
                "--------" + "\n" +
                "$" + shippingTotal;

    }

}


//    Ship to:
//        Jon Smith
//        123 Green Street
//        Austin, TX 78737
//
//        Items
//        -----
//        Socks  $2.00  (4)   $8.00
//        Shirts $10.00 (2)  $20.00
//
//        Shipping: Free
//
//        Total Cost
//        ---------
//        $28.00
package com.xpanxion.myapp.student3;

import java.util.ArrayList;
public class Invoice {
    private String name; // Lowercase
    private String streetAddress;
    private String city;
    private String state;
    private int zip;

    private ArrayList<Item> items;
    private float sum;

    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> items,float sum) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
        this.sum = sum;
    }

    @Override
    public String toString() {

        // loop through items.
        var itemsString = "";


        return "Invoice{" +
                "Name='" + name + '\n' +
                ", StreetAddress='" + streetAddress + '\n' +
                ", City='" + city + '\n' +
                ", state='" + state + '\n' +
                ", Zip=" + zip +'\n' +
                "items:" + items +'\n' +
                "total cost: " + sum;

    }
}

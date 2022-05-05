package com.xpanxion.myapp.student19;

import java.util.ArrayList;

public class Invoice {

    private String name;
    private String street;
    private String city;
    private String state;
    private int zip;
    private ArrayList<Item> items;
    private Item item1;

    private float ship;
    private float totalAfterTax;
    private String itemList = "" ;

    public Invoice(String name, String street, String city, String state, int zip, ArrayList<Item> items, float totalAfterTax, float ship ) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
        this.totalAfterTax = totalAfterTax;
        this.ship = ship;

            }

    @Override
    public String toString() {
       for (int i = 0; i < items.size(); i++) {
           item1 = items.get(i);
           itemList += item1;
        }
        return "Ship to:" + '\n' +
                name + '\n' +
                 street + '\n' +
               city + " " +state + " " + zip + '\n' + "Items" + '\n' +
               itemList + '\n' +
                ship + '\n' +
                totalAfterTax;
    }
}



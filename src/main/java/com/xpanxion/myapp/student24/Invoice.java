package com.xpanxion.myapp.student24;

import java.util.ArrayList;

public class Invoice {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zip;
    private ArrayList<Item>items;
    float total;


    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> items,float total) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
        this.total = total;
    }



    @Override
    public String toString() {
        String item = "";
        for(Item i : items){
            item +=i;
        }

        return  "Ship to: \n  " +
                name + "\n  " +
                streetAddress + "\n  "+
                city +", " + state + " " + zip + "\n"+
                "Items" +"\n" +
                "-----" + "\n"+ item + "\n" + "Free Shipping" + "\n" + "Total cost" +"\n"+ "----------"+"\n"+ "$"+ total;
    }
}

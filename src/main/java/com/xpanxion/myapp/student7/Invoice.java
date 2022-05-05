package com.xpanxion.myapp.student7;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice{
    private String name;
    private String address;
    private String city;
    private String State;
    private int zipCode;
    private ArrayList<Item> cart;
    private float sum;
    private Float shippingCharge;
    public Invoice(String name, String address, String city, String state, int zipCode, ArrayList<Item> cart,float shippingCharge, float sum) {
        this.name = name;
        this.address = address;
        this.city = city;
        this. State = state;
        this.zipCode = zipCode;
        this.cart = cart;
        this.shippingCharge = shippingCharge;
        this.sum = sum;
    }
    @Override
    public String toString() {
        String shipString = "";
        String items = "";
        for(Item i : cart){
            items += i + "\n";
        }
        if(shippingCharge == 0){
            shipString = "Free Shipping";
        }
        else {
            shipString = shippingCharge.toString();
        }

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return "Ship to \n"
                + name + '\n' +
                address + '\n'
                + city + ' ' +
                 State + ' ' +
                 zipCode +" \n" +'\n' + "Items \n" +"------- \n"+
                items +'\n' + "Shipping: " + shipString + "\n" + '\n' + "Total cost \n" + "--------- \n"
                + currency.format(sum) + "\n"

                ;
    }
}

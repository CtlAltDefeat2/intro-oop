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
        String shippingString = "";
        if (ship == 0) shippingString = "Free";
        else shippingString = String.valueOf(ship);

       for (int i = 0; i < items.size(); i++) {
           item1 = items.get(i);
           itemList += item1;

           }

           return "Ship to:" + '\n' + '\n' +
                   name + '\n' +
                   street + '\n' +
                   city + " " + state + " " + zip + '\n' + '\n'+"Items" + '\n' +"----" + '\n' +
                   itemList + '\n' + "Shipping:" +
                   shippingString + '\n' + '\n' +"Total Cost" + '\n' +"-------" +'\n'+
                   totalAfterTax;
       }

}



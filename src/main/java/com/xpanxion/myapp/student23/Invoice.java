package com.xpanxion.myapp.student23;

import java.util.ArrayList;

public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;

    private ArrayList<Item> items;


    public Invoice(String name, String address, String city, String state, int zip, ArrayList<Item> items) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
    }

    @Override
    public String toString() {
        String invoiceString;
        Item item;
        float total = 0.0F;

         invoiceString =  "Ship to: \n" +
                name + "\n" +
                address + "\n" +
                city + "\n" +
                state + ", " +
                zip + "\n \n" + "Items \n" + "----- \n";

        for(int i = 0; i < items.size(); i++){
            item = items.get(i);
            invoiceString += item.getDescription() + " " + "$" + item.getPrice() + " " + "(" + item.getQuantity() +") "+ "$" +
                    item.getPrice()* item.getQuantity()+ "\n";
            total += item.getPrice() * item.getQuantity();
        }
        if(total > 10.00){
            invoiceString += "\nShipping: Free";
        }
        else{
            total += 5.00;
            invoiceString += "\nShipping: " + total;
        }
        invoiceString += "\n \nTotal Cost\n--------- \n" + total;

        return invoiceString;

    }

    /*Ship to:
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
$28.00*/
}

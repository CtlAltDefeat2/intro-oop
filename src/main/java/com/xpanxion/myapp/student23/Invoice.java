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
        String iv;
        Item item;
        float total = 0.0F;

        // loop thru this
        //this.items

        iv =  "Ship to: \n" +
                name + "\n" +
                address + "\n" +
                city + "\n" +
                state + ", " +
                zip + "\n \n" + "Items \n" + "----- \n";

        for(int i = 0; i < items.size(); i++){
            item = items.get(i);
            iv += item.getDescription() + " " + "$" + item.getPrice() + " " + "(" + item.getQuantity() +") "+ "$" +
                    item.getPrice()* item.getQuantity()+ "\n";
            total += item.getPrice() * item.getQuantity();
        }
        if(total > 10.00){
            iv += "\nShipping: Free";
        }
        else{
            total += 5.00;
            iv += "\nShipping: " + total;
        }
        iv += "\n \nTotal Cost\n--------- \n" + total;

        return iv;

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

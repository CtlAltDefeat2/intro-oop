package com.xpanxion.myapp.student21;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Invoice {
   private String name;
   private String streetAddress;
   private String city;
   private String state;
   private int zip;

   private static final DecimalFormat df = new DecimalFormat("0.00");
   private ArrayList<Item> items;

   private float total;

   private float shippingCharge;

    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> items, float total, float shippingCharge) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.items = items;
        this.total = total;
        this.shippingCharge = shippingCharge;
    }

    @Override
    public String toString() {

        // loop thru the items
        var stringItems = "Items\n-----\n";
        for(int i=0; i< items.size(); i++){
            var totalCost = items.get(i).price * items.get(i).quantity;
            stringItems += (items.get(i).getDescription() + " $" + df.format(items.get(i).price) + " (" + items.get(i).quantity + ") $" + df.format(totalCost) +  '\n');
        }

        var shippingString = "Shipping: Free";
        if (total < 10) {
            shippingString = "Shipping: " + this.shippingCharge;
        }

        //return stringItems;
        return "Ship to:\n" + name + '\n' + streetAddress +'\n' + city +", " + state +" "+ zip + "\n\n" + stringItems + '\n' + shippingString + "\n\n" + "Grand Total: $" + total;


        //return "Ship to:" +'\n' + name + '\n' + streetAddress +'\n' + city +", " + state +" "+zip+'\n'+'\n'+"Items"+'\n'+"-----"+'\n' + items.get(0).getDescription() +"   $" +df.format(items.get(0).getPrice())+"   ("+items.get(0).getQuantity()+")  "+"$"+ df.format((items.get(0).price*items.get(0).getQuantity()))+'\n'+ items.get(1).getDescription() +"  $" +df.format(items.get(1).getPrice())+"   ("+items.get(1).getQuantity()+")  "+"$"+ df.format((items.get(1).price*items.get(1).getQuantity()))+'\n'+"Shipping fee:";
    }
}

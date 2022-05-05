package com.xpanxion.myapp.student8;

import java.util.ArrayList;

public class Invoice {
    static String Name;
    static String stAddress;
    static String City;
    static String State;
    static int Zip;

    public Invoice() {

    }

    public Invoice(String n, String st, String c, String s, int z) {
        Name = n;
        stAddress = st;
        City = c;
        State = s;
        Zip = z;
    }

    @Override
    public String toString() {

        for (Item i : ShoppingCart.Items) {
            float item1Price = ShoppingCart.Items.get(0).price * ShoppingCart.Items.get(0).quantity;
            float item2Price = ShoppingCart.Items.get(1).price * ShoppingCart.Items.get(1).quantity;
            float totalPrice = item1Price + item2Price;


            return "Ship to: \n" +
                    "  " + Name + "\n" +
                    "  " + stAddress + "\n" +
                    "  " + City + ", " + State + " " + Zip + "\n" +
                    "\nItems\n" +
                    "-----\n" +
                    ShoppingCart.Items.get(0).description + " $" + ShoppingCart.Items.get(0).price +
                    " (" + ShoppingCart.Items.get(0).quantity + ")" + " $" + item1Price + "\n" +
                    ShoppingCart.Items.get(1).description + " $" + ShoppingCart.Items.get(1).price +
                    " (" + ShoppingCart.Items.get(1).quantity + ")" + " $" + item2Price + "\n" +
                    "\n" +
                    "Shipping: $" + ShoppingCart.shippingCharge + "\n" +
                    "\n" +
                    "Total Cost\n" +
                    "---------\n" +
                    "$" + totalPrice;
        }
        return null;
    }
}

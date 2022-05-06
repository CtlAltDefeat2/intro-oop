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

    private ShoppingCart shoppingCart;


    // template for the invoice, everything that it takes
    public Invoice(String name, String streetAddress, String city, String state, int zip, ShoppingCart shoppingCart) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() { //

        var stringItems = "Items\n-----\n";
        for (int i = 0; i < shoppingCart.getItems().size(); i++) {
            var totalCost = shoppingCart.getItems().get(i).price * shoppingCart.getItems().get(i).quantity;
            stringItems += (shoppingCart.getItems().get(i).getDescription() + " $" + df.format(shoppingCart.getItems().get(i).price) + " (" + shoppingCart.getItems().get(i).quantity + ") $" + df.format(totalCost) + '\n');
        }

        var shippingString = "Shipping: " + this.shoppingCart.getShippingCharge();
        if (shoppingCart.isHasFreeShipping()) {
            shippingString = "Shipping : Free";
        }

        //Actual string that will be returned
        return "Ship to:\n" + name + '\n' + streetAddress + '\n' + city + ", " + state + " " + zip + "\n\n" + stringItems + '\n' + shippingString + "\n\n" + "Grand Total: $" + shoppingCart.getTotalAfterShipping();
    }
}

package com.xpanxion.myapp.student2;

public class Invoice {
    private String name, address, city, state;
    private int zip;

    public Invoice(String name, String address, String city, String state, int zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Ship to: \n"+
                '\t'+ name + '\n'+
                '\t'+ address + '\n'+
                '\t'+ city +","+ state +" "+ zip+'\n'+
                '\n'+
                "Items"+'\n'+
                "-----"+'\n'+
                "Socks  $2.00  (4)   $8.00\n"+
                "Shirts $10.00 (2)   $20.00\n"+
                '\n'+
                "Shipping: Free\n" +
                "\n" +
                "Total Cost\n" +
                "---------\n" +
                "$28.00";

    }
}

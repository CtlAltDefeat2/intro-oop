package com.xpanxion.myapp.student22;

public class Invoice {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;

    private ShoppingCart shoppingCart;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Invoice() {
    }

    public Invoice(String name, String streetAddress, String city, String state, int zipCode) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Invoice(String name, String streetAddress, String city, String state, int zipCode, ShoppingCart shoppingCart) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.shoppingCart = shoppingCart;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
    @Override
    public String toString() {

    this.shoppingCart = new ShoppingCart();
        return "Invoice{" +
                "name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}' + shoppingCart;
    }
}

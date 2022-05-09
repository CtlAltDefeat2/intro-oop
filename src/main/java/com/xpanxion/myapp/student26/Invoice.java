package com.xpanxion.myapp.student26;

public class Invoice {

    private String name;
    private String streetaddress;
    private String city;
    private String state;
    private int zip;

    Invoice() {}

    public String getName() {
        return name;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Ship to:" ;
    }
}

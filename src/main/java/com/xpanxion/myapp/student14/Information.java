package com.xpanxion.myapp.student14;

public  class Information {
    //data
    private String name;
    private String address;
    private String phoneNumber;

    //constructor

    public Information(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
//methods

    //overrides
}

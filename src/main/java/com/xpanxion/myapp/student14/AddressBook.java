package com.xpanxion.myapp.student14;

import java.util.ArrayList;

public class AddressBook implements Updatable {
    //data members

    private ArrayList<Information>bookList=new ArrayList<>();
    //constructor


    public AddressBook(ArrayList<Information> bookList) {
        this.bookList = bookList;
    }

    public AddressBook() {

    }

    //methods
    public void addItem(Information entry) {
        this.bookList.add(entry);
    }
    //overrides
    @Override
    public String name (String firstName, String lastName) {
        var nameFL = " ";
        nameFL = firstName + lastName;
        String result = firstName + lastName + "\n";
        this.bookList.add(result);
        return nameFL;
    }

    @Override
    public String address (String streetAddress, String city, String state, String zipCode) {
        var addressString = " ";
        addressString = streetAddress + city + state + zipCode;
        String result = streetAddress + city + state + zipCode + "\n";
        this.bookList.add(result);
        return addressString;
    }

    @Override
    public String phoneNumber (String phone) {
        var phoneString = " ";
        phoneString = phoneString + "\n";
        this.bookList.add(phoneString);
        return phoneString;
    }

    @Override
    public String getBook() {
        return null;
    }

}

package com.xpanxion.myapp.student14;

import java.util.ArrayList;

public class AddressBook implements Updatable {
    //data members

    public ArrayList<String> bookList=new ArrayList<>();
    //constructor


    public AddressBook(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    public AddressBook() {

    }

    //methods
    public ArrayList<String> addEntry (String entry) {
        this.bookList.add(entry);
    return bookList;
    }
    public String getBookList() {
        //var s = " ";
        for (String s : bookList) {
            System.out.println(bookList);
        }
        return String.valueOf(bookList);
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

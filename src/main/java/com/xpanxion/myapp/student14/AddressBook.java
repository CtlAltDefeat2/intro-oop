package com.xpanxion.myapp.student14;

import java.util.ArrayList;

public class AddressBook implements Information {
    //data members

    private ArrayList<String>bookList=new ArrayList<>();
    //constructor

    public AddressBook(String name, String address, String phoneNumber, ArrayList<String> bookList) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bookList = bookList;
    }

    //methods
    public void addItem(Item item) {
        this.itemsList.add(item);
    }
    //overrides
}

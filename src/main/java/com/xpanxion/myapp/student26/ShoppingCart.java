package com.xpanxion.myapp.student26;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ShoppingCart  {
    static Item test = new Item();




    private ArrayList items = new ArrayList<Item>();


    public ArrayList <Item> getItems() {
        return items;
    }
    public void addItem(Item items) {
        getItems().add(items);
    }





}


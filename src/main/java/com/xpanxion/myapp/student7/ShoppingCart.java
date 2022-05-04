package com.xpanxion.myapp.student7;

import java.util.ArrayList;

public class ShoppingCart {
    private float total;
    private int length;
    private static float sum = 0;
    private ArrayList items = new ArrayList<Item>();

    public ArrayList getItems() {
        return items;
    }

    //private Item i1 = new Item();
    ShoppingCart(){}
    public void addItem(Item I){
        total = I.getPrice();
        length = I.getQuantity();
        getItems().add(I);
    }
    public void calculateTotal(){
        //i1 = items.get(0);

        //for(Item item : getItems()){

       // }
        /**
        for (int i = 0; i < length; i++) {
            sum += total;
        }**/
    }
    public float getTotal(){
        return sum;
    }

}

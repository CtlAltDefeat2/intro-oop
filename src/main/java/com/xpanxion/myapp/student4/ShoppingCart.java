package com.xpanxion.myapp.student4;

import java.util.ArrayList;

public class ShoppingCart extends Item  {


    private ArrayList<Item>items;
public ShoppingCart(){
    this.items = new ArrayList<>();
}


    public ShoppingCart(Float price, int quantity, String description) {

    this.items = items;
    }

    public void addItem(Item items){
        this.items.add(items);
    }

    public float calculateTotal(){
         float theTotal = (float) 0;
    for (Item i : items){
            theTotal += i.getPrice() * i.getQuantity();

       }




        return theTotal;
    }
    public float getTotal(){
        return calculateTotal();
    }





}

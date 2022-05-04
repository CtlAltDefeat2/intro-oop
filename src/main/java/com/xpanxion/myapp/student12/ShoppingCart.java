package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class ShoppingCart {
    //
    //Data Members
    //
    private ArrayList shoppingCart = new ArrayList();
    private int sum = 0;
//    private float price;
//    private int quantity;
//    private String description;


    //
    //Constructors
    //
    ShoppingCart() {
        this.shoppingCart = shoppingCart;
    }

    //
    //Accessors
    //


    public int getTotal() {
        return sum;
    }

    //
    //Methods
    //
    public void addItem(Item socks){
        var item = socks.getPrice();
        shoppingCart.add(item);
    }
    public int addNumbers(ArrayList<Integer> shoppingCart){
        int sum = 0;
        for (int i = 0; i < shoppingCart.size(); i++){
            sum += shoppingCart.get(i);

        }
        this.sum = sum;
        return sum;
    }

    public int calculateTotal() {
        return sum;
    }

}

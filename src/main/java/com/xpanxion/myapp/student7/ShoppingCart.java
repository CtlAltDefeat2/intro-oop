package com.xpanxion.myapp.student7;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    private static float sum = 0;
    private ArrayList items = new ArrayList<Item>();
    protected float shippingCharge;

    public ArrayList<Item> getItems() {
        return items;
    }
    ShoppingCart(){}
    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;

    }

    public void addItem(Item I){

        getItems().add(I);
    }
    public void calculateTotal(){
        //i1 = items.get(0);

        for(Item i : getItems()){
            for(int j = i.getQuantity(); j > 0; j--){
                sum += i.getPrice();
            }
        }
        if(sum < 10){
            sum += shippingCharge;
        }
        sum *= 1.1;
    }
    public String getTotal(){
        NumberFormat total = NumberFormat.getCurrencyInstance();
        return total.format(sum);
    }
    public Invoice shipOrder(String name, String address, String city, String state, int zipCode){
         Invoice I = new Invoice(name,  address, city, state, zipCode , items,getShippingCharge(), sum);
         return I;
    }

    public static float getSum() {
        return sum;
    }

    public float getShippingCharge() {
        return shippingCharge;
    }
}

package com.xpanxion.myapp.student7;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    private static float sum = 0;
    private final ArrayList items = new ArrayList<Item>();
    private final double SALE_TAX = 10.0/100;
    private final double SHIPPING_CHARGE_THRESHOLD = 10;
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
        float temSum = 0;
        for(Item i : getItems()){
            temSum += i.getTotal();
        }
        temSum += (temSum*SALE_TAX);
        if(temSum < SHIPPING_CHARGE_THRESHOLD)
            temSum += shippingCharge;
        sum = temSum;
    }
    public String getTotal(){
        NumberFormat total = NumberFormat.getCurrencyInstance();
        return total.format(sum);
    }
    public Invoice shipOrder(String name, String address, String city, String state, int zipCode){
         return new Invoice(name,  address, city, state, zipCode , items,getShippingCharge(), sum);
    }
    public static float getSum() {
        return sum;
    }
    public float getShippingCharge() {
        return shippingCharge;
    }
}

package com.xpanxion.myapp.student3;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList items = new ArrayList<Item>();
    private static float sum = 0;
    private float shippingCharge;
    ShoppingCart(){}

    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public void addItem(Item i){
        getItems().add(i);
    }
    public void calculateTotal(){
        for (Item i: getItems()){
            for (int j = i.getQuantity(); j > 0; j--){
                sum += i.getPrice();

            }
        }
        if (sum < 10){
            sum += shippingCharge;

        }
        else{
            System.out.println("Shipping: Free");
            sum*=1.1;
        }

    }public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip){
        return new Invoice(name, streetAddress, city, state, zip, getItems(), sum);


    }
    public String getTotal(){
        NumberFormat total = NumberFormat.getCurrencyInstance();
        return total.format(sum);
    }

    public static float getSum() {
        return sum;
    }

    public static void setSum(float sum) {
        ShoppingCart.sum = sum;
    }
}

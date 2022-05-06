package com.xpanxion.myapp.student21;

import javax.naming.Name;
import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> items;

    protected Float shippingCharge = 0.00f;

    public Float getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(Float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    private float total;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public ShoppingCart(Float shippingCharge) {
        this.items = new ArrayList<Item>();
        this.shippingCharge = shippingCharge;
    }
    public void addItem(Item item) {
        items.add(item);
    }



    public void calculateTotal() {
        for (Item i : items) {
          total += i.getPrice() * i.getQuantity();
        }
        total *= 1.1;
        if(total < 10){
            total += this.shippingCharge;
        }else{
            total=total;
        }
    }
    public float getTotal() {
        return total;
    }




    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip){
        return new Invoice(name,streetAddress,city,state,zip, items, total, shippingCharge);
    }





}

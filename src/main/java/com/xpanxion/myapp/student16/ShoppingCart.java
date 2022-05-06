package com.xpanxion.myapp.student16;
import java.util.ArrayList;
public class  ShoppingCart {
    private ArrayList<Item> arrayList;
    private float total = 0;
    private float shippingCharge;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    public ShoppingCart() {
        arrayList = new ArrayList<Item>();
    }

    public ShoppingCart(float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }
        public void addItem(Item i) {
            arrayList.add(i);
        }
        public void calculateTotal() {
        for ( int i = 0; i < arrayList.size( ); i++){
            total = total + ((arrayList.get(i).getPrice() * arrayList.get(i).getQuantity()));
            // by adding the total + you are telling the for loop to keep the socks at $8 then to
            // run again to get the shirts at $10 with nothing left to grab the total was $28.
            total = (float) ((total * 0.01) + total);
            if (total < 10 ){
                total += shippingCharge;
            }
        }
        //var Invoice = new Invoice;
        //var Invoice = ShoppingCart.shipOrder (name, address, city, state, zipcode);
    }

    public Invoice shipOrder(String name, String address, String city, String state, int zipCode) {
        float shipping = 0;

        var Invoice = new Invoice(name, address, city, state, zipCode, arrayList, shippingCharge, total);
        return Invoice;
    }
    public double getTotal() {
        return total;
    }
}

package com.xpanxion.myapp.student22;

import java.util.ArrayList;

public class ShoppingCart extends Item {


    private ArrayList<Item> items;
    private ArrayList<Invoice> invoice;
    private Float shippingCharge;

    public ShoppingCart(float price, int quantity, String description, Float shippingCharge) {
        super(price, quantity, description);
        this.shippingCharge = shippingCharge;
    }


    public ShoppingCart() {

        this.items = new ArrayList<>();
        this.invoice = new ArrayList<>();
    }
    public ShoppingCart(Float price, int quantity, String description) {

        this.items = items;
    }

    public ShoppingCart(String name, String streetAddress, String city,String State, int zipCode, ShoppingCart shoppingCart) {
        this.invoice = invoice;
    }

    public void addItem(Item items) {

        this.items.add(items);


    }
   // public void shoppingOrder(Invoice invoices){
       // this.invoices.add(invoices);
   // }


    public Float calculateTotal() {
       Float theTotal = 0f;
       for(Item i : items){
          theTotal += i.getPrice() * i.getQuantity();
       }
       return theTotal;
    }
    public Float getTotal() {

        return calculateTotal();
    }
    public String shippingCost(){
        String shipping = " ";
        if(getTotal() > 10){
            shipping = "Shipping is : free";
        }
        else {
            shipping = "shipping is: $5";
        }
        return shipping;
    }

   public Invoice shipOrder(String name, String streetAddress,String city, String state, int zip, ShoppingCart shoppingCart ) { // pass in address
       Invoice invoice = new Invoice(name, streetAddress,city, state, zip, shoppingCart); // pass in address, also pass in the shopping using this pointer
       return invoice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + getPrice() +
                ", invoice=" + getQuantity() +
                ", shippingCharge=" + getQuantity() + " "+ getTotal()+
                '}';
    }
}




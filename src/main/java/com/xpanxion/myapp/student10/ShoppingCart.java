package com.xpanxion.myapp.student10;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class ShoppingCart {

    private ArrayList cart;
    private float total;
    private ArrayList<Items> Item;
    private float totalTax;
    private float shippingCost;
    private String name;
    private String stAddress;
    private String city;
    private String state;
    private int zip;

    private Items item2;
    private ArrayList description = new ArrayList();
    private ArrayList<Float> price = new ArrayList();
    private ArrayList<Integer> quantity = new ArrayList();
    private ArrayList totalItems = new ArrayList();

    private float itemTotal = 0;


    ShoppingCart(){
        this.item = new ArrayList<Items>();
        this.total = total;
    }

    public float getTotal(){
        return totalTax;
    }

    public void addItem(Items item){
        this.item.add(item);
    }

    public float calculateTotal(){
        ListIterator<Items> iterator = item.ListIterator();
        this.total = 0;
        while(iterator.hasNext()){
            Items item2 = iterator.next();
            this.total = this.total + (item2.getPrice() * item2.getQuantity());
            totalTax = (float) ((total + shippingCost) * .1);
        }
        return total;
    }

    public float shipping() {
        if (total >= 10) {
            return this.shippingCost = 0 + getTotal();
        }

        else {
            return this.shippingCost = 5 + getTotal();
        }

    }

    public String shipOrder(String name, String stAddress, String city, String state, String zip) {
        this.name = name;
        this.stAddress = stAddress;
        this.city = city;
        this.state = state;
        this.zip = Integer.parseInt(zip);

        return "Ship to " + "\n\t" + name + "\n\t" + stAddress + "\n\t" + city + "," + " " + state + " " + zip + "\n\nItems\n-----\n" + listDesc() + "\n\nShipping: Free" + moneyChanger(shippingCost) + "\n\nTotal cost\n---------\n" + moneyChanger(total);
    }
    public String listDesc() {
        for (i = 0, i < item.size(), i++) {
            listFiller();
            return description.get(i) + "\t" + moneyChanger(price.get(i)) + "\t(" + quantity.get(i) + ")\t" + totalItems.get(i+1);
        }
        return null;
    }

    public void listFiller() {
        listFiller<Items> iterator = items.listIterator();

        while (iterator.hasnext()); {
            for (int i = 0, i < item.size(), i++) {
                Items item2 = iterator.next();
                description.add(item2.getDescription());
                price.add(item2.getPrice());
                quantity.add(item2.getQuantity());
                totalItems = quantity.get(i) + price.get(i);
                var itemPrice = moneyChanger(itemTotal);
                this.totalItems.add(itemPrice);
            }
        }
    }

    public String moneyChanger(float number) {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String m = n.format(number);
        return m;
    }

}

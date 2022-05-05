package com.xpanxion.myapp.student17;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class ShoppingCart {
    //
    //data Members
    //
    private float total;
    private ArrayList<Item> item;
    private double tax;
    private ArrayList description = new ArrayList<>();
    private ArrayList<Float> price = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private float itemTotal;
    private ArrayList<Float> itemList = new ArrayList<>();
    //
    //Constructors
    //
    public ShoppingCart(){
        this.item = new ArrayList<>();
    }
    public void addItem(Item item){
        this.item.add(item);
    }
    public float calculateTotal(){
        ListIterator<Item> iterator = item.listIterator();
        while(iterator.hasNext()) {
            Item item = iterator.next();
            total = (total + (item.getPrice() * item.getQuanity()));
        }
        return total;
    }
    public String getTotal() {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        tax = total * .1;
        String s = n.format(total);
        String t = n.format(tax);
        if(total >= 10)
            System.out.println("Cost: " + s + "\n" + "Shipping: Free");
        else
            System.out.println("Cost: " + s + "\n" + "Shipping: $5.00");
        return "Tax: " + t;
    }
    public String shipping() {
        if (total >= 10) {
            return "5.00";
        } else {
            return "Free";
        }
    }
    public String shipOrder(String name, String address, String city, String state, int zipCode) {
        return "Ship to:" + "\n\t" + name + "\n\t" + address + "\n\t" + city + ", " + state + " " + zipCode +
               "\n\nItems\n-----\n" + listDesc() + "\n\nShipping: " + shipping() + "\n\nTotal Cost\n-------\n" + total;
    }
    public String listDesc() {
        for (int i = 0; i < item.size(); i++) {
            listFiller();
            return description.get(i) + "\t" + price.get(i) + "\t(" + quantity.get(i) + ")\t" + itemList.get(i) + "\n"
                   +description.get(i + 1) + " " + price.get(i + 1) + "\t(" + quantity.get(i + 1) + ")\t" + itemList.get(i+1);
        }
        return null;
    }
    public void listFiller() {
        ListIterator<Item> iterator = item.listIterator();
        while (iterator.hasNext()) {
            for (int i = 0; i < item.size(); i++) {
                Item item2 = iterator.next();
                description.add(item2.getDescription());
                price.add(item2.getPrice());
                quantity.add(item2.getQuanity());
                itemTotal = quantity.get(i) * price.get(i);
                this.itemList.add(itemTotal);
            }
        }
    }
}



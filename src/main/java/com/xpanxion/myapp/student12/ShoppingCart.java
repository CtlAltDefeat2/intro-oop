package com.xpanxion.myapp.student12;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
    //
    //Data Members
    //

    //private Item item = new Item();
    private ArrayList cart;
    private float total;
    private ArrayList<Item> item;
    private double taxedTotal;
    private float shipFee;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipCode;

    private Item item2;
    private ArrayList description = new ArrayList<>();
    private ArrayList price = new ArrayList<>();
    private ArrayList quantity = new ArrayList<>();

    private float itemTotal;


    //
    //Constructors
    //
    ShoppingCart() {
        this.item = new ArrayList<Item>();
        this.total = total;
    }

    //
    //Accessors
    //


    public float getTotal() {
        //NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        //String s = n.format(total);
        return total;
    }

    //
    //Methods
    //


    public void addItem(Item item) {
        this.item.add(item);
    }

    public void calculateTotal() {
        ListIterator<Item> iterator1 = item.listIterator();
        this.total = 0;
        while (iterator1.hasNext()) {
            Item item2 = iterator1.next();
            this.total = this.total + (item2.getPrice() * item2.getQuantity());
        }

    }

    public float shipping() {

        if (total >= 10) {
            return this.shipFee = 0 + getTotal();
        } else {
            return this.shipFee = 5 + getTotal();
        }
    }

    public double taxes() {
        this.taxedTotal = total * 0.0875;
        return taxedTotal;
    }

    public String shipOrder(String name, String address, String city, String state, int zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

        ListIterator<Item> iterator1 = item.listIterator();
        ArrayList description = new ArrayList();
        while (iterator1.hasNext()) {
            Item item2 = iterator1.next();
            description.add(item2.getDescription());
        }


        return "Ship to:" + "\n\t" + name + "\n\t" + address + "\n\t" + city + ", " + state + " " + zipCode +
                "\n\nItems\n-----\n" + listDesc();
    }

    public String listDesc() {

        for (int i = 0; i < item.size(); i++) {
            listFiller();
            return description.get(i) + "\t" + price.get(i) + "\t(" + quantity.get(i) + ")\t" + "\n"
                    +description.get(i + 1) + " " + price.get(i + 1) + "\t(" + quantity.get(i + 1) + ")\t" + itemTotal;
        }
        return null;
    }

    public void listFiller() {
        ListIterator<Item> iterator1 = item.listIterator();

        while (iterator1.hasNext()) {
            for (int i = 0; i < item.size(); i++) {
                Item item2 = iterator1.next();
                description.add(item2.getDescription());
                //this.description = description;
                price.add(item2.getPrice());
                //this.price = price;
                quantity.add(item2.getQuantity());
                //this.quantity = quantity;
                var itemTotal = quantity. * price.get(i);
            }
        }
    }
}

package com.xpanxion.myapp.student12;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class ShoppingCart {
    //
    //Data Members
    //

    //private Item item = new Item();
    private ArrayList cart;
    private float total;
    private ArrayList<Item> item;
    private float taxedTotal;
    private float shipFee;
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipCode;

    private Item item2;
    private ArrayList description = new ArrayList<>();
    private ArrayList<Float> price = new ArrayList();
    private ArrayList<Integer> quantity = new ArrayList();
    private ArrayList itemTotalList = new ArrayList<>();

    private float itemTotal = 0;


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
        return taxedTotal;
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
            taxedTotal = (float) ((total + shipFee) * 1.1);
        }

    }

    public float shipping() {
        if (total >= 10) {
            return this.shipFee = 0 + getTotal();
        } else {
            return this.shipFee = 5 + getTotal();
        }
    }


    public String shipOrder(String name, String address, String city, String state, int zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;


        return "Ship to:" + "\n\t" + name + "\n\t" + address + "\n\t" + city + ", " + state + " " + zipCode +
                "\n\nItems\n-----\n" + listDesc() + "\n\nShipping: " + moneyChanger(shipFee) + "\n\nTotal Cost\n----------\n" + moneyChanger(total) + " (Plus taxes and fees)";
    }

    public String listDesc() {

        for (int i = 0; i < item.size(); i++) {
            listFiller();
            return description.get(i) + "\t" + moneyChanger(price.get(i)) + "\t(" + quantity.get(i) + ")\t" +  itemTotalList.get(i) +  "\n"
                    +description.get(i + 1) + " " + moneyChanger(price.get(i+1)) + "\t(" + quantity.get(i + 1) + ")\t" + itemTotalList.get(i+1);
        }
        return null;
    }

    public void listFiller() {
        ListIterator<Item> iterator1 = item.listIterator();

        while (iterator1.hasNext()) {
            for (int i = 0; i < item.size(); i++) {
                Item item2 = iterator1.next();
                //itemTotal = item2.getQuantity() * item2.getPrice();
                description.add(item2.getDescription());
                //this.description = description;
                price.add(item2.getPrice());
                //this.price = price;
                quantity.add(item2.getQuantity());
                //this.quantity = quantity;
                itemTotal = quantity.get(i) * price.get(i);
                var itemPrice = moneyChanger(itemTotal);
                this.itemTotalList.add(itemPrice);

            }
        }
    }
    public String moneyChanger(float number){
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String s = n.format(number);
        return s;
    }

    @Override
    public String toString(){
        return null;
    }

}

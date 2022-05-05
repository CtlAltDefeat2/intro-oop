package com.xpanxion.myapp.student5;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
    // Variable Declarations
    private ArrayList<Item> itemsList = new ArrayList<>();
    private float total;
    private float totalTax;
    private final float SALES_TAX = 0.10F;
    private float shippingFee;
    private float totalAfterShippingFee;
    private float totalCost;
    private String customerName;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private Item item;
    private ArrayList itemName = new ArrayList<>();
    private ArrayList<Float> price = new ArrayList<>();
    private ArrayList<Integer> quantity = new ArrayList<>();
    private ArrayList itemTotalList = new ArrayList();
    private float itemTotal = 0.00F;
    // Constructors
    public ShoppingCart () {
        this.itemsList = new ArrayList<>();
        this.total = total;
    }
    public ShoppingCart (float shippingFee) {}
    // Accessors
    public float getTotal() {
        return totalCost;
    }
    // Methods
    public void addItem(Item item) {
        itemsList.add(item);
    }
    public void calculateTotal() {
        for (Item item : itemsList) {
            total = (total + (item.getItemPrice() * item.getItemQuantity()));
        }
        totalTax = SALES_TAX * total;
        if (total <= 10.00) {
            totalAfterShippingFee += shipping();
            totalCost = totalAfterShippingFee + totalTax;
        } else totalCost = totalTax + total;
    }
    public float shipping() {
        if (total > 10.00) {
            return this.shippingFee = 0.00F + getTotal();
        } else if (total <= 10.00) {
            return this.shippingFee = 5.00F + getTotal();
        } else return 0.00F;
    }
    public String shipOrder(String customerName, String streetAddress, String city, String state, int zipCode) {
        this.customerName = customerName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        return "Ship to:" + "\n\t" + customerName + "\n\t" + streetAddress + "\n\t" + city + ", " + state + " " + zipCode +
                "\n\nItems\n-----\n" + listDesc() + "\n\nTaxes:    " + totalTax + "\nShipping: " + shippingFee +
                "\n\nTotal Cost\n----------\n" + totalCost;
    }
    public String listDesc() {
        for (int i = 0; i < itemsList.size(); i++) {
            listFiller();
            return itemName.get(i) + "\t" + price.get(i) + "\t(" + quantity.get(i) + ")\t " +  itemTotalList.get(i) + "\n"
                    + itemName.get(i + 1) + " " + price.get(i + 1) + "\t(" + quantity.get(i + 1) + ")\t" + itemTotalList.get(i+1);
        } return null;
    }
    public void listFiller() {
        ListIterator<Item> iterator1 = itemsList.listIterator();
        while (iterator1.hasNext()) {
            for (int j = 0; j < itemsList.size(); j++) {
                Item item1 = iterator1.next();
                itemName.add(item1.getItemName());
                price.add(item1.getItemPrice());
                quantity.add(item1.getItemQuantity());
                itemTotal = quantity.get(j) * price.get(j);
                this.itemTotalList.add(itemTotal);
            }
        }
    }
    // Overrides
    @Override
    public String toString() {
        return null;
    }
}
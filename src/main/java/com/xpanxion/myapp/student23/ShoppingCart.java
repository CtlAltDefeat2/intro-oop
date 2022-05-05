package com.xpanxion.myapp.student23;

import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList shoppingcart = new ArrayList<Item>();
    private float shipping = 0.00F;

    public ShoppingCart() {
    }

    public ShoppingCart(float shipping) {
        this.shipping = shipping;
    }

    public void addItem(Item s){
         shoppingcart.add(s);
    }

    public float calculateTotal() {
        float totalPrice;
        float total = 0.0F;
        Item item;
        float tax = 0.0F;

        for (int i =0; i< shoppingcart.size(); i++) {
            item = (Item) shoppingcart.get(i);
            totalPrice = item.getPrice()* item.getQuantity();
            tax = totalPrice * 0.1F;
            totalPrice += tax;
            if(totalPrice > 10.00){
                totalPrice += shipping;
            }
            total += totalPrice;
        }
        return total;
    }

    public String getTotal() {
        return "$" + calculateTotal();
    }
}

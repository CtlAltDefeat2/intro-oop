package com.xpanxion.myapp.student19;
import java.util.ArrayList;

public class ShoppingCart {
 private float ship = 0;
 private float totalAfterTax;
 private ArrayList<Item> cart  = new ArrayList<Item>();
 private float total = 0;
  public ShoppingCart (float ship){
  this.ship = ship;
 }
 public void addItem(Item item){
  cart.add(item);
  return;
 }
 public void calculateTotal() {

     for (int i = 0; i < cart.size(); i++) {
         total = total + ((cart.get(i).getPrice()) * (cart.get(i).getQuantity()));

         totalAfterTax = (float) (total * 0.01) + total;
         if (total < 10)  totalAfterTax = totalAfterTax + ship;
           else ship = 0;
              }
 }
     public double getTotal() {
         return totalAfterTax;
     }

     public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip) {
         var invoice = new Invoice(name, streetAddress, city, state, zip, cart, totalAfterTax, ship );
        return invoice;
     }

}
